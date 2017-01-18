package org.afplib.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import org.afplib.base.SF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Passes the structured fields of an AFP file through a series of
 * filters ({@link ChainLink}s). Each {@link ChainLink} can modify,
 * drop or even add new structured fields to the structured field flow.
 *
 */
public class AfpFilterChain {

	private static Logger log = LoggerFactory.getLogger(AfpFilterChain.class);

	private final File in;
	private final File out;

	public AfpFilterChain(File in, File out) {
		this.in = in;
		this.out = out;
	}

	public void filter(ChainLink... chainLinks) throws IOException {
		boolean need2Pass = false;
		for(ChainLink link : chainLinks) {
			if(link.needTwoPass()) {
				need2Pass = true;
				break;
			}
		}

		if(!need2Pass) {
			doFilter(in, out, chainLinks);
			return;
		}

		LinkedList<ChainLink> links = new LinkedList<ChainLink>(Arrays.asList(chainLinks));
		File currentIn = in;
		File currentOut = null;
		ChainLink twoPassLink = null;
		do {
			LinkedList<ChainLink> toFilter = new LinkedList<ChainLink>();
			for(ChainLink link : links) {
				if(link.needTwoPass() && link != twoPassLink) {
					twoPassLink = link;
					break;
				}
				toFilter.add(link);
			}

			if(!toFilter.isEmpty()) {
				currentOut = File.createTempFile("filter", ".afp");
				currentOut.delete();
				currentOut.deleteOnExit();
				doFilter(currentIn, currentOut, (ChainLink[]) toFilter.toArray(new ChainLink[toFilter.size()]));
				if(currentIn != in) {
					currentIn.delete();
				}
				currentIn = currentOut;
			} else {
				doRead(currentIn, twoPassLink); // FIXME this is still wrong
			}

			links.removeAll(toFilter);

		} while(!links.isEmpty());
		
		copy(currentOut, out);

	}

	private void copy(File fin, File fout) throws IOException {
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fin));
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(fout));
		
		log.debug("copying {} to {}", fin.getAbsolutePath(), fout.getAbsolutePath());
		
		byte[] buffer = new byte[8196];
		int len;
		while((len = bin.read(buffer, 0, buffer.length)) > 0) {
			bout.write(buffer, 0, len);
		}
		bin.close();
		bout.close();
	}

	private void doRead(File file, ChainLink link) throws FileNotFoundException, IOException {
		log.debug("first pass {}", link.getClass().getSimpleName());
		AfpInputStream ain = new AfpInputStream(new BufferedInputStream(new FileInputStream(file)));
		try {
			SF sf;
			while((sf = ain.readStructuredField()) != null) {
				if(!link.onStructuredField(null, sf)) break;
			}
		} finally {
			ain.close();
		}
	}

	private void doFilter(File inFile, File outFile, final ChainLink...chainLinks) throws FileNotFoundException, IOException {

		if(log.isDebugEnabled()) {
			String s = "";
			for(ChainLink l : chainLinks) {
				if(s.length() > 0) s += ", ";
				s += l.getClass().getSimpleName();
			}
			log.debug("filtering {}", s);
		}

		final AfpInputStream ain = new AfpInputStream(new BufferedInputStream(new FileInputStream(inFile)));
		final AfpOutputStream aout = new AfpOutputStream(new BufferedOutputStream(new FileOutputStream(outFile)));

		log.debug("reading {} -> writing {}", inFile.getAbsolutePath(), outFile.getAbsolutePath());

		try {

			Chain chain = new Chain() {
				LinkedList<ChainLink> finished = new LinkedList<ChainLink>();

				@Override
				public void commit(ChainLink link, SF... sfs) throws IOException {
					for(int i=0; i<chainLinks.length; i++) {
						if(link == chainLinks[i]) {
							i++;
							for(SF sf : sfs) {
								while(i<chainLinks.length-1 && finished.contains(chainLinks[i])) i++;
								if(i>=chainLinks.length) {
									log.trace("write {}", sf);
									aout.writeStructuredField(sf);
								} else {
									if(!chainLinks[i].onStructuredField(this, sf)) {
										finished.add(chainLinks[i]);
									}
								}
							}
						}
					}
				}
			};

			SF sf;
			while((sf = ain.readStructuredField()) != null) {

				chainLinks[0].onStructuredField(chain, sf);

			}

		} finally {
			ain.close();
			aout.close();
		}
	}

}
