package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AttributeValue;
import org.afplib.afplib.BPS;
import org.afplib.afplib.BRG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.Comment;
import org.afplib.afplib.EPS;
import org.afplib.afplib.ERS;
import org.afplib.afplib.TLE;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
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

	@Test
	public void testDifferentCodePageOnTLE() throws IOException {
		ByteArrayOutputStream bout;
		try(AfpOutputStream aout = new AfpOutputStream(bout = new ByteArrayOutputStream())) {
            final TLE tle = AfplibFactory.eINSTANCE.createTLE();

            final CGCSGID cgcsgid = AfplibFactory.eINSTANCE.createCGCSGID();
            cgcsgid.setCPGID(850);
            cgcsgid.setGCSGID(0);
            tle.getTriplets().add(cgcsgid);

            final AttributeValue value = AfplibFactory.eINSTANCE.createAttributeValue();
            value.setAttVal(" abc");

            tle.getTriplets().add(value);
            aout.writeStructuredField(tle);
		}

		byte[] data = bout.toByteArray();
		// last 4 bytes of the TLE is the attribute value
		String testString = new String(data, data.length-4, 4, Charset.forName("ASCII"));
		assertEquals(" abc", testString);


		try(AfpOutputStream aout = new AfpOutputStream(bout = new ByteArrayOutputStream())) {
            final TLE tle = AfplibFactory.eINSTANCE.createTLE();

            final AttributeValue value = AfplibFactory.eINSTANCE.createAttributeValue();
            value.setAttVal(" abc");

            tle.getTriplets().add(value);
            aout.writeStructuredField(tle);
		}

		data = bout.toByteArray();
		// last 4 bytes of the TLE is the attribute value
		testString = new String(data, data.length-4, 4, Charset.forName("IBM500"));
		assertEquals(" abc", testString);
	}
	
   @Test
   public void testCP1141SupportOnTLE() throws IOException {
       
       final ByteArrayOutputStream baos = new ByteArrayOutputStream();
       final AfpOutputStream aout = new AfpOutputStream(baos);
       final String TEST_VALUE = "[abcd]";
       
       try {
       
           final TLE tle = AfplibFactory.eINSTANCE.createTLE();
    
           final CGCSGID cgcsgid = AfplibFactory.eINSTANCE.createCGCSGID();
           cgcsgid.setCPGID(1141);
           cgcsgid.setGCSGID(695);
           tle.getTriplets().add(cgcsgid);

           final AttributeValue value = AfplibFactory.eINSTANCE.createAttributeValue();
           value.setAttVal(TEST_VALUE);

           tle.getTriplets().add(value);
           aout.writeStructuredField(tle); 
           
           
           byte[] data = baos.toByteArray();
           final String testString = new String(data, data.length - TEST_VALUE.length(), TEST_VALUE.length(), Charset.forName("CP1141"));
           
           assertEquals(TEST_VALUE, testString);
           
       } finally {
           aout.close();
       }
   }

	
}
