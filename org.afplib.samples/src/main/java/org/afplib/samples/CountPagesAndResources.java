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
						System.out.print(String.format("\r%06d %04d %s", pages, resources, s));
						break;
					case SFName.BRS_VALUE:
						resources++;
						System.out.print(String.format("\r%06d %04d %s", pages, resources, s));
						break;
					}
				}
				
				System.out.println(String.format("\r%06d %04d %s", pages, resources, s));
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
