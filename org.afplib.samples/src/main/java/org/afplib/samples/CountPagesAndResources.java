package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import org.afplib.afplib.SFName;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;

public class CountPagesAndResources {

	private static boolean progress = false;

	public static void main(String[] args) {
		
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

				int pages = 0;
				int resources = 0;

				SF sf;
				while((sf = in.readStructuredField()) != null) {
					switch(sf.getId()) {
					case SFName.BPG_VALUE:
						pages++;
						if(progress && pages % 1000 == 0)
							System.out.print(String.format("\r%06d %04d %s", pages, resources, s));
						break;
					case SFName.BRS_VALUE:
						resources++;
						if(progress && resources % 1000 == 0)
							System.out.print(String.format("\r%06d %04d %s", pages, resources, s));
						break;
					}
				}
				
				if(progress)
					System.out.print("\r");
				System.out.println(String.format("%06d %04d %s", pages, resources, s));
				
			} catch (Exception e) {
				if(progress)
					System.out.print("\r");
				System.out.println(String.format("000000 0000 %s:%s", s, e.getLocalizedMessage()));
			}
		}

	}

}
