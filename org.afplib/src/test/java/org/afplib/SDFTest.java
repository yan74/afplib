package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.afplib.BIM;
import org.afplib.afplib.BOG;
import org.afplib.afplib.BandImage;
import org.afplib.afplib.BeginImage;
import org.afplib.afplib.BeginSegment;
import org.afplib.afplib.BeginTile;
import org.afplib.afplib.EIM;
import org.afplib.afplib.EOG;
import org.afplib.afplib.EndImage;
import org.afplib.afplib.EndSegment;
import org.afplib.afplib.IDD;
import org.afplib.afplib.IDESize;
import org.afplib.afplib.IDEStructure;
import org.afplib.afplib.IPD;
import org.afplib.afplib.ImageData;
import org.afplib.afplib.ImageEncoding;
import org.afplib.afplib.ImageLUTID;
import org.afplib.afplib.ImageSize;
import org.afplib.afplib.MIO;
import org.afplib.afplib.OBD;
import org.afplib.afplib.OBP;
import org.afplib.afplib.TilePosition;
import org.afplib.afplib.TileSize;
import org.afplib.afplib.TileTOC;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
import org.junit.Test;

public class SDFTest {

	@Test
	public void readSDF() throws IOException {
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/bim.afp"))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BIM);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BOG);
		
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof OBD);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof OBP);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof MIO);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IDD);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof EOG);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IPD);

			IPD ipd = (IPD) sf;
			assertEquals(10, ipd.getSdfs().size());
			
			assertTrue(ipd.getSdfs().get(0) instanceof BeginSegment);
			assertTrue(ipd.getSdfs().get(1) instanceof BeginImage);
			assertTrue(ipd.getSdfs().get(2) instanceof TileTOC);
			assertTrue(ipd.getSdfs().get(3) instanceof BeginTile);
			assertTrue(ipd.getSdfs().get(4) instanceof TilePosition);
			assertTrue(ipd.getSdfs().get(5) instanceof TileSize);
			assertTrue(ipd.getSdfs().get(6) instanceof ImageEncoding);
			assertTrue(ipd.getSdfs().get(7) instanceof IDESize);
			assertTrue(ipd.getSdfs().get(8) instanceof BandImage);
			assertTrue(ipd.getSdfs().get(9) instanceof IDEStructure);
			
			BandImage bands = (BandImage) ipd.getSdfs().get(8);
			assertEquals(4, bands.getRg().size());
			
		}
		
	}

	@Test
	public void writeSDF() throws IOException {
		
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp));
				AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/bim.afp"))) {
			SF sf;
			while((sf = afpin.readStructuredField()) != null)
				afpout.writeStructuredField(sf);
		}
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BIM);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BOG);
		
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof OBD);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof OBP);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof MIO);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IDD);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof EOG);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IPD);

			IPD ipd = (IPD) sf;
			assertEquals(10, ipd.getSdfs().size());
			
			assertTrue(ipd.getSdfs().get(0) instanceof BeginSegment);
			assertTrue(ipd.getSdfs().get(1) instanceof BeginImage);
			assertTrue(ipd.getSdfs().get(2) instanceof TileTOC);
			assertTrue(ipd.getSdfs().get(3) instanceof BeginTile);
			assertTrue(ipd.getSdfs().get(4) instanceof TilePosition);
			assertTrue(ipd.getSdfs().get(5) instanceof TileSize);
			assertTrue(ipd.getSdfs().get(6) instanceof ImageEncoding);
			assertTrue(ipd.getSdfs().get(7) instanceof IDESize);
			assertTrue(ipd.getSdfs().get(8) instanceof BandImage);
			assertTrue(ipd.getSdfs().get(9) instanceof IDEStructure);
			
			BandImage bands = (BandImage) ipd.getSdfs().get(8);
			assertEquals(4, bands.getRg().size());
			
		}
		
	}
	
	@Test
	public void testBIMwithSpanningIPD() throws IOException {
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/IPDSpan.afp"))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BIM);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BOG);
		
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof OBD);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof OBP);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof MIO);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IDD);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof EOG);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IPD);
			
			IPD ipd = (IPD) sf;
			assertEquals(7, ipd.getSdfs().size());
			
			assertTrue(ipd.getSdfs().get(0) instanceof BeginSegment);
			assertTrue(ipd.getSdfs().get(1) instanceof BeginImage);
			assertTrue(ipd.getSdfs().get(2) instanceof ImageSize);
			assertTrue(ipd.getSdfs().get(3) instanceof ImageEncoding);
			assertTrue(ipd.getSdfs().get(4) instanceof IDESize);
			assertTrue(ipd.getSdfs().get(5) instanceof ImageLUTID);
			assertTrue(ipd.getSdfs().get(6) instanceof ImageData);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IPD);
			ipd = (IPD) sf;
			// ipd contains just image data no sdf
			assertNotNull(ipd.getImageData());
			assertEquals(5039, ipd.getImageData().length);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof IPD);
			
			ipd = (IPD) sf;
			assertEquals(2, ipd.getSdfs().size());
			assertTrue(ipd.getSdfs().get(0) instanceof EndImage);
			assertTrue(ipd.getSdfs().get(1) instanceof EndSegment);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof EIM);
			
			sf = afpin.readStructuredField();
			assertNull(sf);
			
		}
		
	}

}
