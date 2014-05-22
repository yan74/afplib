package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Random;

import org.afplib.afplib.PTX;
import org.afplib.afplib.SFName;
import org.afplib.afplib.TRN;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.io.AfpFilter;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
import org.afplib.io.Filter;

public class Anonymizer {

	private static final String VOWELS = "aeiou";
	private static final String CONSONANTS = "bcdfghklmnpst";
	private static final String DIGITS = "0123456789";

	private static Random random = new Random();

	private static char getRandom(String characters) {
		int index = random.nextInt(characters.length());
		char c = characters.charAt(index);
		return c;
	}

	static void anonymize(TRN trn) {
		Charset charset = Charset.forName("IBM500");
		StringBuffer text = new StringBuffer(new String(trn.getTRNDATA(), charset));

		boolean addConsonant = true;
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			boolean isUpperCase = Character.isUpperCase(c);
			if (isUpperCase) {
				c = Character.toLowerCase(c);
			}
			if ('a' <= c && c <= 'z') {
				if (addConsonant) {
					c = getRandom(CONSONANTS);
					addConsonant = false;
				} else {
					c = getRandom(VOWELS);
					addConsonant = true;
				}
			} else if ('0' <= c && c <= '9') {
				c = getRandom(DIGITS);
				addConsonant = true;
			} else {
				c = 'x';
				addConsonant = true;
			}
			if (isUpperCase) {
				c = Character.toUpperCase(c);
			}
			text.replace(i, i + 1, ""+c);
		}
		byte[] s = text.toString().getBytes(charset);
		trn.setTRNDATA(s);
	}
	
	public static void main(String[] args) {
		try (AfpInputStream in = new AfpInputStream(
				new BufferedInputStream(new FileInputStream(args[0])));
				AfpOutputStream out = new AfpOutputStream(
						new BufferedOutputStream(new FileOutputStream(args[1])))) {

			AfpFilter.filter(in, out, new Filter() {
				@Override
				public STATE onStructuredField(SF sf) {
					switch(sf.getId()) {
					case SFName.PTX_VALUE:
						PTX ptx = (PTX) sf;
						for(Triplet t : ptx.getCS()) {
							if(t instanceof TRN) {
								anonymize((TRN) t);
							}
						}
						return STATE.MODIFIED;
					}
					return STATE.UNTOUCHED;
				}
			}); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
