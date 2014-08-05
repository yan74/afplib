package org.afplib;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BAG;
import org.afplib.afplib.BMO;
import org.afplib.afplib.BRG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.CharacterRotation;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.FullyQualifiedNameFQNFormat;
import org.afplib.afplib.FullyQualifiedNameFQNType;
import org.afplib.afplib.MCD;
import org.afplib.afplib.MCDRG;
import org.afplib.afplib.MCF;
import org.afplib.afplib.MCFRG;
import org.afplib.afplib.MPS;
import org.afplib.afplib.MPSRG;
import org.afplib.afplib.MPSRGLength;
import org.afplib.afplib.MappingOption;
import org.afplib.afplib.MappingOptionMapValue;
import org.afplib.afplib.ResourceLocalIdentifier;
import org.afplib.afplib.ResourceLocalIdentifierResType;
import org.afplib.afplib.ResourceSectionNumber;
import org.afplib.afplib.TextOrientation;
import org.afplib.afplib.TextOrientationBAxis;
import org.afplib.afplib.TextOrientationIAxis;
import org.afplib.base.SF;
import org.afplib.io.AfpInputStream;
import org.afplib.io.AfpOutputStream;
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
	public void testRepeatingGroup() throws IOException {
		
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

	@Test
	public void testRGSaveWithVariableLength() throws IOException {
		MCF mcf = AfplibFactory.eINSTANCE.createMCF();
		MCFRG rg = AfplibFactory.eINSTANCE.createMCFRG();
		mcf.getRG().add(rg);
		FullyQualifiedName fqn = AfplibFactory.eINSTANCE.createFullyQualifiedName();
		fqn.setFQName("T1000000");
		fqn.setFQNFormat(FullyQualifiedNameFQNFormat.CONST_CHARACTERSTRING_VALUE);
		fqn.setFQNType(FullyQualifiedNameFQNType.CONST_CODE_PAGE_NAME_REFERENCE_VALUE);
		rg.getTriplets().add(fqn);
		
		fqn = AfplibFactory.eINSTANCE.createFullyQualifiedName();
		fqn.setFQName("C0000000");
		fqn.setFQNFormat(FullyQualifiedNameFQNFormat.CONST_CHARACTERSTRING_VALUE);
		fqn.setFQNType(FullyQualifiedNameFQNType.CONST_FONT_CHARACTER_SET_NAME_REFERENCE_VALUE);
		rg.getTriplets().add(fqn);
		
		ResourceSectionNumber section = AfplibFactory.eINSTANCE.createResourceSectionNumber();
		section.setResSNum(0);
		rg.getTriplets().add(section);
		
		ResourceLocalIdentifier lid = AfplibFactory.eINSTANCE.createResourceLocalIdentifier();
		lid.setResLID(1);
		lid.setResType(ResourceLocalIdentifierResType.CONST_CODED_FONT_VALUE);
		rg.getTriplets().add(lid);
		
		CharacterRotation rot = AfplibFactory.eINSTANCE.createCharacterRotation();
		rot.setCharRot(0);
		rg.getTriplets().add(rot);
		
		TextOrientation orent = AfplibFactory.eINSTANCE.createTextOrientation();
		orent.setIAxis(TextOrientationIAxis.CONST0DEGREES_VALUE);
		orent.setBAxis(TextOrientationBAxis.CONST90DEGREES_VALUE);
		rg.getTriplets().add(orent);
		
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
			afpout.writeStructuredField(mcf);
		}

		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			mcf = (MCF) afpin.readStructuredField();

			assertEquals(1, mcf.getRG().size());

			assertEquals(43, mcf.getRG().get(0).getRGLength().intValue());
			assertEquals(6, mcf.getRG().get(0).getTriplets().size());
			assertTrue(mcf.getRG().get(0).getTriplets().get(0) instanceof FullyQualifiedName);
			assertTrue(mcf.getRG().get(0).getTriplets().get(1) instanceof FullyQualifiedName);
			assertTrue(mcf.getRG().get(0).getTriplets().get(2) instanceof ResourceSectionNumber);
			assertTrue(mcf.getRG().get(0).getTriplets().get(3) instanceof ResourceLocalIdentifier);
			assertTrue(mcf.getRG().get(0).getTriplets().get(4) instanceof CharacterRotation);
			assertTrue(mcf.getRG().get(0).getTriplets().get(5) instanceof TextOrientation);

		}
		
	}
	
	@Test
	public void testRGSaveWithFixedLength() throws IOException {
		MPS mps = AfplibFactory.eINSTANCE.createMPS();
		MPSRG rg = AfplibFactory.eINSTANCE.createMPSRG();
		rg.setReserved(0);
		rg.setPsegName("S1EX002A");
		mps.getFixedLengthRG().add(rg);

		rg = AfplibFactory.eINSTANCE.createMPSRG();
		rg.setReserved(0);
		rg.setPsegName("S1EX002B");
		mps.getFixedLengthRG().add(rg);

		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
			afpout.writeStructuredField(mps);
		}
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			mps = (MPS) afpin.readStructuredField();
			
			assertEquals(MPSRGLength.CONST_LENGTH12_VALUE, mps.getRGLength().intValue());
			
			assertEquals(2, mps.getFixedLengthRG().size());
			assertEquals("S1EX002A", mps.getFixedLengthRG().get(0).getPsegName());
			assertEquals("S1EX002B", mps.getFixedLengthRG().get(1).getPsegName());
 
		}

	}
	
	@Test
	public void testMCDRGSaveWithKindaFixedLength() throws IOException {
		MCD mcd = new AfpBuilder()
			.withMember(new AfpBuilder()
				.withMember(new AfpBuilder()
					.with(AfplibPackage.MAPPING_OPTION__MAP_VALUE, MappingOptionMapValue.CONST_POSITIONANDTRIM_VALUE)
				.create(MappingOption.class))
			.create(MCDRG.class))
		.create(MCD.class);
		
		File ftmp = File.createTempFile("tmp", ".afp");
		ftmp.deleteOnExit();
		try (AfpOutputStream afpout = new AfpOutputStream(new FileOutputStream(ftmp))) {
			afpout.writeStructuredField(mcd);
		}
		
		try (AfpInputStream afpin = new AfpInputStream(new FileInputStream(ftmp))) {
			mcd = (MCD) afpin.readStructuredField();
			
			assertEquals(5, mcd.getRG().get(0).getRGLength().intValue());
		}
	}


}
