package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.afplib.afplib.BRS;
import org.afplib.afplib.ResourceObjectType;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

public class AfpInputStreamTest {

	@Test
	public void testReadStructuredField() throws IOException {
		String sf = "5A001CD3A8CE000000C6F1C1F1F0F1F1F100000A21FE00000000000000";
		byte[] b = new byte[sf.length()/2];
		for(int i=0; i<sf.length(); i+=2) {
			Integer ii = Integer.valueOf(sf.substring(i, i+2), 16);
			b[i/2] = (byte) ii.intValue();
		}
		assertTrue((byte)0xD3 == b[3]);
		
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		AfpInputStream afpin = new AfpInputStream(bin);
		
		SF s = afpin.readStructuredField();
		assertNull(afpin.readStructuredField());
		afpin.close();
		
		assertTrue(s instanceof BRS);
		assertEquals(8, ((BRS)s).getRSName().toString().length());
		assertEquals("F1A10111", ((BRS)s).getRSName().toString());
		EList<Triplet> g = ((BRS)s).getTriplets();

		assertTrue(g.get(0) instanceof ResourceObjectType);
		Object e = g.get(0);
				
		assertEquals(0xfe, ((ResourceObjectType)e).getObjType().intValue());
	}

}
