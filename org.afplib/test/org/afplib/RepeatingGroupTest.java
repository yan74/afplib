package org.afplib;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;

import org.afplib.afplib.BAG;
import org.afplib.afplib.BMO;
import org.afplib.afplib.BRG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.CharacterRotation;
import org.afplib.afplib.Comment;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.MCF;
import org.afplib.afplib.MPS;
import org.afplib.afplib.ResourceLocalIdentifier;
import org.afplib.afplib.ResourceSectionNumber;
import org.afplib.afplib.TextOrientation;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.junit.Test;

public class RepeatingGroupTest {

	/**
	 * repeatingGroupVariableLength.afp looks like this:
	 * BRG 
	 * 	 BRS
	 *     BMO
	 *     BAG
	 *       MCF (repeating group defines its length)
	 *       MPS (repeating group length is defined in MPS.RGLength)
	 *     ...
	 *     EAG
	 *     EMO
	 *   ERS
	 * ERG 
	 * @throws IOException
	 */
	@Test
	public void testAsciiComment() throws IOException {
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream("testdata/repeatingGroupVariableLength.afp"))) {
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
			
			MCF mcf = (MCF) sf;
			assertEquals(4, mcf.getRG().size());
			
			assertEquals(6, mcf.getRG().get(0).getTriplets().size());
			assertTrue(mcf.getRG().get(0).getTriplets().get(0) instanceof FullyQualifiedName);
			assertTrue(mcf.getRG().get(0).getTriplets().get(1) instanceof FullyQualifiedName);
			assertTrue(mcf.getRG().get(0).getTriplets().get(2) instanceof ResourceSectionNumber);
			assertTrue(mcf.getRG().get(0).getTriplets().get(3) instanceof ResourceLocalIdentifier);
			assertTrue(mcf.getRG().get(0).getTriplets().get(4) instanceof CharacterRotation);
			assertTrue(mcf.getRG().get(0).getTriplets().get(5) instanceof TextOrientation);
			
			sf = afpin.readStructuredField();
			assertTrue(sf instanceof MPS);
			
			MPS mps = (MPS) sf;
			assertEquals(1, mps.getFixedLengthRG().size());
			assertEquals("S1EX002A", mps.getFixedLengthRG().get(0).getPsegName());

		}
		
	}

}
