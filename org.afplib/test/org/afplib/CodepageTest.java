package org.afplib;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.afplib.afplib.BPS;
import org.afplib.afplib.BRG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.Comment;
import org.afplib.afplib.EPS;
import org.afplib.afplib.ERS;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.eclipse.emf.common.command.Command;
import org.junit.Test;

public class CodepageTest {

	/**
	 * asciiComment.afp looks like this:
	 * BRG with RGrpName encoded in EBCDIC (IBM 500)
	 * 	CGCSGID (setting codepage for following triplets to 850 - ASCII)
	 *  Comment with CHAR encoded in ASCII
	 * ERG 
	 * @throws IOException
	 */
	@Test
	public void testAsciiComment() throws IOException {
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/asciiComment.afp"))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRG);
			
			BRG brg = (BRG) sf;
			assertEquals("RESGRP00", brg.getRGrpName());
			
			assertTrue(brg.getTriplets().get(1) instanceof Comment);
			Comment comment = (Comment) brg.getTriplets().get(1);
			assertEquals("My ASCII Comment", comment.getComment());
		}
		
	}

	/**
	 * asciiAndEbcdicComment.afp looks like this:
	 * BRG with RGrpName encoded in EBCDIC (IBM 500)
	 * 	BRS
	 * 	  ResourceObjectType
	 * 	  CGCSGID (setting codepage for following triplets to 850 - ASCII)
	 *    Comment with CHAR encoded in ASCII
	 *    BPS
	 *      Comment with CHAR encoded in EBCDIC (BPS is resetting codepage to EBCDIC)
	 *    EPS
	 *  ERS
	 *  BRS (resets the triplet codepage to EBCDIC)
	 *    ResourceObjectType
	 *    Comment (in EBCDIC)
	 *  ...  
	 * ERG 
	 * @throws IOException
	 */
	@Test
	public void testAsciiAndEbcdicComment() throws IOException {
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/asciiAndEbcdicComment.afp"))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRG);
			
			BRG brg = (BRG) sf;
			assertEquals("RESGRP00", brg.getRGrpName());
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRS);
			BRS brs = (BRS) sf;
			assertEquals("MYRES000", brs.getRSName());
			
			assertTrue(brs.getTriplets().get(2) instanceof Comment);
			Comment comment = (Comment) brs.getTriplets().get(2);
			assertEquals("This is ASCII", comment.getComment());
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BPS);
			BPS bps = (BPS) sf;
			assertTrue(bps.getTriplets().get(0) instanceof Comment);
			comment = (Comment) bps.getTriplets().get(0);
			assertEquals("This is EBCDIC", comment.getComment());
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof EPS);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof ERS);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRS);
			brs = (BRS) sf;
			assertEquals("MYRES001", brs.getRSName());

			assertTrue(brs.getTriplets().get(1) instanceof Comment);
			comment = (Comment) brs.getTriplets().get(1);
			assertEquals("This is EBCDIC", comment.getComment());
		}
		
	}
}
