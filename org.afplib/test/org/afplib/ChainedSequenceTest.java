package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

import org.afplib.afplib.AMB;
import org.afplib.afplib.AMI;
import org.afplib.afplib.BAG;
import org.afplib.afplib.BMO;
import org.afplib.afplib.BPT;
import org.afplib.afplib.BRG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.EAG;
import org.afplib.afplib.MCF;
import org.afplib.afplib.NOPCS;
import org.afplib.afplib.PGD;
import org.afplib.afplib.PTD;
import org.afplib.afplib.PTX;
import org.afplib.afplib.SCFL;
import org.afplib.afplib.STO;
import org.afplib.afplib.TRN;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.junit.Test;

public class ChainedSequenceTest {

	/**
	 * cs.afp looks like this:
	 * BRG 
	 * 	 BRS
	 *     BMO
	 *     BAG
	 *     ...
	 *     EAG
	 *     BPT
	 *       PTX
	 *         STO
	 *         SCFL
	 *         ...
	 *     EPT
	 *     EMO
	 *   ERS
	 * ERG 
	 * @throws IOException
	 */
	@Test
	public void testCS() throws IOException {
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/cs.afp"))) {
			SF sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRG);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BRS);
		
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BMO);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BAG);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof MCF);

			sf = afpin.readStructuredField();
			assertTrue(sf instanceof PGD);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof PTD);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof EAG);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof BPT);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof PTX);
			
			PTX ptx = (PTX) sf;
			assertEquals(10, ptx.getCS().size());
			
			assertTrue(ptx.getCS().get(0) instanceof STO);
			assertTrue(ptx.getCS().get(1) instanceof SCFL);
			assertTrue(ptx.getCS().get(2) instanceof AMB);
			assertTrue(ptx.getCS().get(3) instanceof AMI);
			assertTrue(ptx.getCS().get(4) instanceof TRN);
			assertTrue(ptx.getCS().get(5) instanceof SCFL);
			assertTrue(ptx.getCS().get(6) instanceof AMB);
			assertTrue(ptx.getCS().get(7) instanceof AMI);
			assertTrue(ptx.getCS().get(8) instanceof TRN);
			assertTrue(ptx.getCS().get(9) instanceof NOPCS);
			
			assertEquals("Simplify", new String(((TRN)ptx.getCS().get(4)).getTRNDATA(), Charset.forName("IBM500")));
			assertEquals(" your life", new String(((TRN)ptx.getCS().get(8)).getTRNDATA(), Charset.forName("IBM500")));

		}
	}

}
