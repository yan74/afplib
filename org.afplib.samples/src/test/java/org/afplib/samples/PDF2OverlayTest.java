package org.afplib.samples;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class PDF2OverlayTest {

	@Test
	public void testRun() throws IOException {
		new File("tmp").mkdirs();
		PDF2Overlay pdf = new PDF2Overlay("testdata/mushrooms.pdf", "tmp/O1MUSHRO");
		pdf.run();
	}

}
