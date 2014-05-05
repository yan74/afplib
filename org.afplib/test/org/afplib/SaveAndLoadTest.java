package org.afplib;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BRG;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
import org.junit.Test;

public class SaveAndLoadTest {

	@Test
	public void simpleSF() throws IOException {
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
			BRG brg = AfplibFactory.eINSTANCE.createBRG();
			brg.setRGrpName("MYRESGRP");
			afpout.writeStructuredField(brg);
		}
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRG);
			BRG brg = (BRG) sf;
			assertEquals("MYRESGRP", brg.getRGrpName());
			
			assertNull(afpin.readStructuredField());
		}
	}

}
