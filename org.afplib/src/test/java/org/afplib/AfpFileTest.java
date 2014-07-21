package org.afplib;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BIM;
import org.afplib.afplib.BOG;
import org.afplib.afplib.NOP;
import org.afplib.base.SF;
import org.afplib.io.AfpFile;
import org.junit.Test;

public class AfpFileTest {

	@Test
	public void testRead() throws IOException {
		try (AfpFile file = new AfpFile(new File("testdata/bim.afp"), "r")) {
			SF sf = file.readStructuredField();
			assertTrue(sf instanceof BIM);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof BOG);
			
			file.seek(0);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof BIM);
		}
	}
	
//	@Test
	public void testWrite() throws IOException {
		
		new File("tmp").mkdirs();
		
		File testFile = new File("tmp/test.afp");
		testFile.delete();
		Files.copy(new File("testdata/bim.afp").toPath(), testFile.toPath());
		
		try (AfpFile file = new AfpFile(testFile, "rw")) {
			SF sf;
			
			sf = AfplibFactory.eINSTANCE.createNOP();
			((NOP)sf).setUndfData(new byte[] {1,2,3});
			file.writeStructuredField(sf);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof BIM);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof BOG);
			
			file.seek(0);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof NOP);

			sf = file.readStructuredField();
			assertTrue(sf instanceof BIM);
		}
	}
}
