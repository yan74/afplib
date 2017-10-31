package org.afplib;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.MediaFidelity;
import org.afplib.afplib.PFC;
import org.afplib.io.AfpOutputStream;
import org.junit.Test;

public class MediaFidelityTest {

	@Test
	public void testMediaFidelity() throws IOException {
		PFC pfc = AfplibFactory.eINSTANCE.createPFC();
		MediaFidelity mf = AfplibFactory.eINSTANCE.createMediaFidelity();
		pfc.getTriplets().add(mf);
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		AfpOutputStream out = new AfpOutputStream(bout);
		out.writeStructuredField(pfc);
		out.close();
		
		byte[] output = bout.toByteArray();
		assertEquals(20, output.length);
	}
	
	
}
