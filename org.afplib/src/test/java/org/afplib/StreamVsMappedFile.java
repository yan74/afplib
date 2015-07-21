package org.afplib;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpMappedFile;
import org.junit.Test;

public class StreamVsMappedFile {

	private final String testFile = "testdata/bim.afp"; // TODO find some larger file
	
	@Test
	public void testMappedFile() throws IOException {
		try(AfpMappedFile afp = new AfpMappedFile(new File(testFile))) {
			// run once to load all the classes involved
			while(afp.next() != null);
		}
			
		try(AfpMappedFile afp = new AfpMappedFile(new File(testFile))) {			
			long counter = 0;
			long milis = System.nanoTime();
			while(afp.next() != null) counter++;
			
			System.out.println("MappedFile: " + (System.nanoTime() - milis) / counter + " nanos per sf");		
		}
	}
	
	@Test
	public void testStream() throws IOException {
		try(AfpInputStream afp = new AfpInputStream(new BufferedInputStream(new FileInputStream(testFile)))) {
			// run once to load all the classes involved
			while(afp.readStructuredField() != null);
		}
		
		try(AfpInputStream afp = new AfpInputStream(new BufferedInputStream(new FileInputStream(testFile)))) {
			long counter = 0;
			long milis = System.nanoTime();
			while(afp.readStructuredField() != null) counter++;
			
			System.out.println("Stream: " + (System.nanoTime() - milis) / counter + " nanos per sf");		
		}
		
	}

}
