package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;

public class DumpAFP {

	public static void main(String[] args) {
		try (AfpInputStream in = new AfpInputStream(
				new BufferedInputStream(new FileInputStream(args[0])))) {
			
			SF sf;
			while((sf = in.readStructuredField()) != null) {
				System.out.println(sf);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
