package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.afplib.SFName;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;

public class CountPagesAndResources {

	private static int pages;
	private static int resources;

	public static void main(String[] args) {
		try (AfpInputStream in = new AfpInputStream(
				new BufferedInputStream(new FileInputStream(args[0])))) {

			SF sf;
			while((sf = in.readStructuredField()) != null) {
				switch(sf.getId()) {
				case SFName.BPG_VALUE:
					pages++;
					break;
				case SFName.BRS_VALUE:
					resources++;
					break;
				}
			}
			
			System.out.println("resources: "+resources);
			System.out.println("pages:     "+pages);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
