package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.afplib.BFN;
import org.afplib.afplib.BRG;
import org.afplib.afplib.FNC;
import org.afplib.afplib.FNCFNIRGLen;
import org.afplib.afplib.FND;
import org.afplib.afplib.FNI;
import org.afplib.afplib.FNIRG;
import org.afplib.afplib.FNO;
import org.afplib.afplib.FNP;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.eclipse.emf.common.util.EList;
import org.junit.Test;

public class FNIRGTest {

	@Test
	public void testLength10() throws IOException {
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/fnirg10.afp"))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BFN);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof FND);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof FNC);
			
			assertEquals(FNCFNIRGLen.CONST_FNI_SIZE10_VALUE, ((FNC)sf).getFNIRGLen().intValue());
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof FNO);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof FNP);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof FNI);
			
			EList<FNIRG> rg = ((FNI)sf).getRg();
			FNIRG fnirg = rg.get(0);
//			assertEquals(10, fnirg.getTripletLength());
			assertEquals("U00000AA", fnirg.getGCGID());
			assertNull(fnirg.getAscendHt());
			
			fnirg = rg.get(1);
//			assertEquals(10, fnirg.getTripletLength());
			assertEquals("U00000AB", fnirg.getGCGID());
			assertNull(fnirg.getAscendHt());
		}
	}
	
}
