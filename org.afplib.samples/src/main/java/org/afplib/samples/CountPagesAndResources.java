package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.afplib.afplib.SFName;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountPagesAndResources {

	private static final Logger log = LoggerFactory.getLogger(CountPagesAndResources.class);

	private static boolean progress = false;

	public static void main(String[] args) {
		
		log.info("starting...");
		
		String[] files = new String[0];
		LinkedList<String> f = new LinkedList<String>();
		
		try {
			if(args.length == 0) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				String s;
				while((s = reader.readLine()) != null)
					f.add(s);
				reader.close();
				files = (String[]) f.toArray(new String[f.size()]);
			} else {
				files = args;
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}

		System.out.println("pages  res file");
		
		for(String s : files) {
			if(progress)
				System.out.print(String.format("            %s", s));
			try (AfpInputStream in = new AfpInputStream(
					new BufferedInputStream(new FileInputStream(s)))) {

				AtomicInteger pages = new AtomicInteger();
				AtomicInteger resources = new AtomicInteger();

				Stream<SF> sfs;
				
				Iterator<SF> iter = new Iterator<SF>() {
					SF sf = null;
					
					@Override
					public boolean hasNext() {
						try {
							sf = in.readStructuredField();
						} catch (IOException e) {
							return false;
						}
						return sf != null;
					}

					@Override
					public SF next() {
						return sf;
					}
				};
				sfs = StreamSupport.stream(Spliterators.spliteratorUnknownSize(
		                iter, Spliterator.ORDERED | Spliterator.IMMUTABLE | Spliterator.NONNULL), false);
				
//				sfs = Stream.generate(new Supplier<SF>() {
//					@Override
//					public SF get() {
//						try {
//							return in.readStructuredField();
//						} catch (IOException e) {
//							throw new RuntimeException(e);
//						}
//					}
//				});
				
				sfs.parallel().peek(new Consumer<SF>() {
					@Override
					public void accept(SF sf) {
//						log.trace("{}", sf);

						switch(sf.getId()) {
						case SFName.BPG_VALUE:
							int p = pages.incrementAndGet();
							if(progress && p % 1000 == 0)
								System.out.print(String.format("\r%06d %04d %s", p, resources.get(), s));
							break;
						case SFName.BRS_VALUE:
							int r = resources.incrementAndGet();
							if(progress && r % 1000 == 0)
								System.out.print(String.format("\r%06d %04d %s", pages.get(), r, s));
							break;
						}
					}
				}).count();
								
				if(progress)
					System.out.print("\r");
				
				System.out.println(String.format("%06d %04d %s", pages.get(), resources.get(), s));
				
			} catch (Exception e) {
				if(progress)
					System.out.print("\r");
				System.out.println(String.format("000000 0000 %s:%s", s, e.getLocalizedMessage()));
			}
		}

		log.info("done...");
	}

}
