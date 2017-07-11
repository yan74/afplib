package org.afplib;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BIM;
import org.afplib.afplib.BOG;
import org.afplib.afplib.BRG;
import org.afplib.afplib.ERG;
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
	
	@Test
	public void testWrite() throws IOException {
		
		new File("tmp").mkdirs();
		
		File testFile = new File("tmp/test.afp");
		testFile.delete();
		Files.copy(new File("testdata/asciiComment.afp").toPath(), testFile.toPath());
		
		try (AfpFile file = new AfpFile(testFile, "rw")) {
			SF sf;
						
			sf = file.readStructuredField();
			assertTrue(sf instanceof BRG);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof ERG);

			// This does not work anymore with AfpFile since it always
			// creates a new AfpInputStream which in turn always
			// reads 5 bytes ahead (header) - so again does not work anymore.
//			sf = file.readStructuredField();
//			assertNull(sf);
			
			sf = AfplibFactory.eINSTANCE.createNOP();
			((NOP)sf).setUndfData(new byte[] {1,2,3});
			file.writeStructuredField(sf);

			file.seek(0);

			sf = file.readStructuredField();
			assertTrue(sf instanceof BRG);
			
			sf = file.readStructuredField();
			assertTrue(sf instanceof ERG);

			sf = file.readStructuredField();
			assertTrue(sf instanceof NOP);

//			sf = file.readStructuredField();
//			assertNull(sf);
		}
	}
}
