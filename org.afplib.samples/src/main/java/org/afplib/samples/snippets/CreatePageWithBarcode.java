package org.afplib.samples.snippets;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

import org.afplib.AfpBuilder;
import org.afplib.afplib.AMB;
import org.afplib.afplib.AMI;
import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BAG;
import org.afplib.afplib.BBC;
import org.afplib.afplib.BDA;
import org.afplib.afplib.BDD;
import org.afplib.afplib.BDDCOLOR;
import org.afplib.afplib.BDDTYPE;
import org.afplib.afplib.BDDUBASE;
import org.afplib.afplib.BDT;
import org.afplib.afplib.BOG;
import org.afplib.afplib.BPG;
import org.afplib.afplib.BPT;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.DescriptorPosition;
import org.afplib.afplib.EAG;
import org.afplib.afplib.EBC;
import org.afplib.afplib.EDT;
import org.afplib.afplib.EOG;
import org.afplib.afplib.EPG;
import org.afplib.afplib.EPT;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.FullyQualifiedNameFQNFormat;
import org.afplib.afplib.FullyQualifiedNameFQNType;
import org.afplib.afplib.MBC;
import org.afplib.afplib.MBCRG;
import org.afplib.afplib.MCD;
import org.afplib.afplib.MCDRG;
import org.afplib.afplib.MCF;
import org.afplib.afplib.MCFRG;
import org.afplib.afplib.MappingOption;
import org.afplib.afplib.MappingOptionMapValue;
import org.afplib.afplib.MeasurementUnits;
import org.afplib.afplib.MeasurementUnitsXoaBase;
import org.afplib.afplib.MeasurementUnitsYoaBase;
import org.afplib.afplib.OBD;
import org.afplib.afplib.OBP;
import org.afplib.afplib.OBPRGLength;
import org.afplib.afplib.OBPRefCSys;
import org.afplib.afplib.OBPXoaOrent;
import org.afplib.afplib.OBPXocaOrent;
import org.afplib.afplib.OBPYoaOrent;
import org.afplib.afplib.OBPYocaOrent;
import org.afplib.afplib.ObjectAreaSize;
import org.afplib.afplib.ObjectAreaSizeSizeType;
import org.afplib.afplib.PGD;
import org.afplib.afplib.PGDXpgBase;
import org.afplib.afplib.PGDYpgBase;
import org.afplib.afplib.PTD;
import org.afplib.afplib.PTDXPBASE;
import org.afplib.afplib.PTDYPBASE;
import org.afplib.afplib.PTX;
import org.afplib.afplib.ResourceLocalIdentifier;
import org.afplib.afplib.ResourceLocalIdentifierResType;
import org.afplib.afplib.SCFL;
import org.afplib.afplib.STC;
import org.afplib.afplib.STCFRGCOLOR;
import org.afplib.afplib.STO;
import org.afplib.afplib.STOBORNTION;
import org.afplib.afplib.STOIORNTION;
import org.afplib.afplib.TRN;
import org.afplib.base.SF;
import org.afplib.io.AfpOutputStream;

/**
 * Demonstration on how to create a new AFP file with a page and some text on it.
 *
 */
public class CreatePageWithBarcode {

	public void createAFPwithPage(AfpOutputStream out) throws IOException {

		int xpos = 100;
		int ypos = 100;

		byte[] data = new byte[] { 0x00, 0x00, 0x12, 0x00, 0x12, 0x00, 0x00, 0x00, 0x00, 0x00,  // some DMC specific introducer - see BCOCA spec
				0x30, 0x30, 0x31, 0x30, 0x30, 0x31, 0x30, 0x31,             // actual data encoded in EBCDIC starts this line
				0x30, 0x30, 0x36, 0x34, 0x31, 0x30, 0x30, 0x30, 0x30, 0x35,
				0x35, 0x31, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30, 0x30,
				0x30, 0x30, 0x30, 0x30, 0x30, 0x30 };

		BDT bdt = new AfpBuilder()											// Begin Document
				.with(AfplibPackage.BDT__DOC_NAME, "MYFIRST")
				.withMember(new AfpBuilder()
						.with(AfplibPackage.CGCSGID__GCSGID, 65535)
						.with(AfplibPackage.CGCSGID__CPGID, 500)            // Encode all CHARs in EBCDIC
						.create(CGCSGID.class))
				.create(BDT.class);

		BPG bpg = new AfpBuilder()											// Begin Page
				.with(AfplibPackage.BPG__PAGE_NAME, "00000001")
				.create(BPG.class);

		BAG bag = new AfpBuilder()											// Active Environment Group
				.create(BAG.class);

		PGD pgd = new AfpBuilder()											// Page descriptor
				.with(AfplibPackage.PGD__XPG_BASE, PGDXpgBase.CONST10INCHES_VALUE)
				.with(AfplibPackage.PGD__YPG_BASE, PGDYpgBase.CONST10INCHES_VALUE)
				.with(AfplibPackage.PGD__XPG_UNITS, 14400)					// 1440 dpi resolution
				.with(AfplibPackage.PGD__YPG_UNITS, 14400)					// 1440 dpi resolution
				.with(AfplibPackage.PGD__XPG_SIZE, 12240)					// 8.5 inch
				.with(AfplibPackage.PGD__YPG_SIZE, 15840)					// 11 inch
				.with(AfplibPackage.PGD__RESERVED, 0)
				.create(PGD.class);

		EAG eag = new AfpBuilder()
				.create(EAG.class);

		BBC bbc = new AfpBuilder().create(BBC.class);

        BOG bog = new AfpBuilder()
                .create(BOG.class);

        OBD obd = new AfpBuilder()
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID, 1)
                        .create(DescriptorPosition.class))
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.MEASUREMENT_UNITS__XOA_BASE, MeasurementUnitsXoaBase.CONST10INCHES_VALUE)
                        .with(AfplibPackage.MEASUREMENT_UNITS__YOA_BASE, MeasurementUnitsYoaBase.CONST10INCHES_VALUE)
                        .with(AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS, 240 * 10) // 240 dpi
                        .with(AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS, 240 * 10)
                        .create(MeasurementUnits.class))
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE, ObjectAreaSizeSizeType.CONST_OBJECT_AREA_SIZE_VALUE)
                        .with(AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE, 120) // 1/2 inch
                        .with(AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE, 120)
                        .create(ObjectAreaSize.class))
                .create(OBD.class);

        OBP obp = new AfpBuilder()
                .with(AfplibPackage.OBP__OA_POS_ID, 1)
                .with(AfplibPackage.OBP__RG_LENGTH, OBPRGLength.CONST_LENGTH23_VALUE)
                .with(AfplibPackage.OBP__XOA_OSET, xpos)
                .with(AfplibPackage.OBP__YOA_OSET, ypos)
                .with(AfplibPackage.OBP__XOA_ORENT, OBPXoaOrent.CONST0DEGREES_VALUE)
                .with(AfplibPackage.OBP__YOA_ORENT, OBPYoaOrent.CONST90DEGREES_VALUE)
                .with(AfplibPackage.OBP__XOCA_OSET, 0)
                .with(AfplibPackage.OBP__YOCA_OSET, 0)
                .with(AfplibPackage.OBP__XOCA_ORENT, OBPXocaOrent.CONST0DEGREES_VALUE)
                .with(AfplibPackage.OBP__YOCA_ORENT, OBPYocaOrent.CONST90DEGREES_VALUE)
                .with(AfplibPackage.OBP__REF_CSYS, OBPRefCSys.CONST_PAGE_OR_OVERLAY_VALUE)
                .create(OBP.class);

        MBC mbc = new AfpBuilder()
                .withMember(new AfpBuilder()
                        .withMember(new AfpBuilder()
                                .with(AfplibPackage.MAPPING_OPTION__MAP_VALUE, MappingOptionMapValue.CONST_POSITION_VALUE)
                                .create(MappingOption.class))
                        .create(MBCRG.class))
                .create(MBC.class);

        BDD bdd = new AfpBuilder()
        		.with(AfplibPackage.BDD__UBASE, BDDUBASE.CONST10IN_VALUE)
        		.with(AfplibPackage.BDD__RESERVED, 0)
        		.with(AfplibPackage.BDD__XUPUB, 3000) // 300 dpi
        		.with(AfplibPackage.BDD__YUPUB, 300)
        		.with(AfplibPackage.BDD__XEXTENT, 65535)
        		.with(AfplibPackage.BDD__YEXTENT, 65535)
        		.with(AfplibPackage.BDD__RESERVED2, 0)
        		.with(AfplibPackage.BDD__TYPE, BDDTYPE.CONST_DATA_MATRIX_VALUE)
        		.with(AfplibPackage.BDD__MOD, 0)
        		.with(AfplibPackage.BDD__LID, 255)
        		.with(AfplibPackage.BDD__COLOR, BDDCOLOR.CONST_DEVICEDEFAULT_VALUE)
        		.with(AfplibPackage.BDD__MODULEWIDTH, 16)
        		.with(AfplibPackage.BDD__ELEMENTHEIGHT, 65535)
        		.create(BDD.class);

        EOG eog = new AfpBuilder()
                .create(EOG.class);

        BDA bda = new AfpBuilder()
        		.with(AfplibPackage.BDA__FLAGS, 128) // No HRI, no Asterisk
        		.with(AfplibPackage.BDA__XOFFSET, 1)
        		.with(AfplibPackage.BDA__YOFFSET, 1)
        		.with(AfplibPackage.BDA__DATA, data)
        		.create(BDA.class);

		EBC ebc = new AfpBuilder()											// End Page
				.create(EBC.class);

		EPG epg = new AfpBuilder()											// End Page
				.create(EPG.class);

		EDT edt = new AfpBuilder()											// End Document
				.create(EDT.class);


		for(SF sf : Arrays.asList(bdt, bpg, bag, pgd, eag, bbc, bog, obd, obp, mbc, bdd, eog, bda, ebc, epg, edt)) {
			out.writeStructuredField(sf);
		}
	}

	public static void main(String[] args) {
		try {
			new CreatePageWithBarcode().createAFPwithPage(new AfpOutputStream(new FileOutputStream("testbcoca.afp")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
