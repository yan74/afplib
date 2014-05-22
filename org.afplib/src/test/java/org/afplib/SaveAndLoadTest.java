package org.afplib;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.BRG;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.Comment;
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
	
	@Test
	public void triplet() throws IOException {
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
			BRG brg = AfplibFactory.eINSTANCE.createBRG();
			brg.setRGrpName("MYRESGRP");

			Comment comment = AfplibFactory.eINSTANCE.createComment();
			comment.setComment("My Comment");
			brg.getTriplets().add(comment);
			
			afpout.writeStructuredField(brg);
		}
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRG);
			BRG brg = (BRG) sf;
			assertEquals("MYRESGRP", brg.getRGrpName());
			
			assertEquals(1, brg.getTriplets().size());
			Comment comment = (Comment) brg.getTriplets().get(0);
			assertEquals("My Comment", comment.getComment());
			
			assertNull(afpin.readStructuredField());
		}
	}

	@Test
	public void tripletInASCII() throws IOException {
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
			BRG brg = AfplibFactory.eINSTANCE.createBRG();
			brg.setRGrpName("MYRESGRP");
			
			CGCSGID cgcsgid = AfplibFactory.eINSTANCE.createCGCSGID();
			cgcsgid.setGCSGID(65535);
			cgcsgid.setCPGID(850);
			brg.getTriplets().add(cgcsgid);

			Comment comment = AfplibFactory.eINSTANCE.createComment();
			comment.setComment("My Comment");
			brg.getTriplets().add(comment);
			
			afpout.writeStructuredField(brg);
		}
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRG);
			BRG brg = (BRG) sf;
			assertEquals("MYRESGRP", brg.getRGrpName());
			
			assertEquals(2, brg.getTriplets().size());
			assertTrue(brg.getTriplets().get(0) instanceof CGCSGID);
			
			Comment comment = (Comment) brg.getTriplets().get(1);
			assertEquals("My Comment", comment.getComment());
			
			assertNull(afpin.readStructuredField());
		}
	}

}
