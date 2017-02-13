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
import org.afplib.afplib.BDT;
import org.afplib.afplib.BPG;
import org.afplib.afplib.BPT;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.EAG;
import org.afplib.afplib.EDT;
import org.afplib.afplib.EPG;
import org.afplib.afplib.EPT;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.FullyQualifiedNameFQNFormat;
import org.afplib.afplib.FullyQualifiedNameFQNType;
import org.afplib.afplib.MCF;
import org.afplib.afplib.MCFRG;
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
public class CreatePage {

	public void createAFPwithPage(AfpOutputStream out) throws IOException {

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

		MCF mcf = new AfpBuilder()											// Map coded font
				.withMember(new AfpBuilder()
						.withMember(new AfpBuilder()
								.with(AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE, FullyQualifiedNameFQNType.CONST_CODE_PAGE_NAME_REFERENCE_VALUE)
								.with(AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT, FullyQualifiedNameFQNFormat.CONST_CHARACTERSTRING_VALUE)
								.with(AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME, "T1000395")  // codepage
								.create(FullyQualifiedName.class))			// Codepage reference
						.withMember(new AfpBuilder()
								.with(AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE, FullyQualifiedNameFQNType.CONST_FONT_CHARACTER_SET_NAME_REFERENCE_VALUE)
								.with(AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT, FullyQualifiedNameFQNFormat.CONST_CHARACTERSTRING_VALUE)
								.with(AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME, "C1N20000")  // Font
								.create(FullyQualifiedName.class))			// Font reference
						.withMember(new AfpBuilder()
								.with(AfplibPackage.RESOURCE_LOCAL_IDENTIFIER__RES_TYPE, ResourceLocalIdentifierResType.CONST_CODED_FONT_VALUE)
								.with(AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_LID, 1) // identifier
								.create(ResourceLocalIdentifier.class))
						.create(MCFRG.class))
				.create(MCF.class);

		PGD pgd = new AfpBuilder()											// Page descriptor
				.with(AfplibPackage.PGD__XPG_BASE, PGDXpgBase.CONST10INCHES_VALUE)
				.with(AfplibPackage.PGD__YPG_BASE, PGDYpgBase.CONST10INCHES_VALUE)
				.with(AfplibPackage.PGD__XPG_UNITS, 14400)					// 1440 dpi resolution
				.with(AfplibPackage.PGD__YPG_UNITS, 14400)					// 1440 dpi resolution
				.with(AfplibPackage.PGD__XPG_SIZE, 12240)					// 8.5 inch
				.with(AfplibPackage.PGD__YPG_SIZE, 15840)					// 11 inch
				.with(AfplibPackage.PGD__RESERVED, 0)
				.create(PGD.class);

		PTD ptd = new AfpBuilder()											// Page Text Descriptor
				.with(AfplibPackage.PTD__XPBASE, PTDXPBASE.CONST_TENINCHES_VALUE)
				.with(AfplibPackage.PTD__YPBASE, PTDYPBASE.CONST_TENINCHES_VALUE)
				.with(AfplibPackage.PTD__XPUNITVL, 14400)					// 1440 dpi resolution
				.with(AfplibPackage.PTD__YPUNITVL, 14400)					// 1440 dpi resolution
				.with(AfplibPackage.PTD__XPEXTENT, 12240)					// 8.5 inch
				.with(AfplibPackage.PTD__YPEXTENT, 15840)					// 11 inch
				.create(PTD.class);

		EAG eag = new AfpBuilder()
				.create(EAG.class);

		BPT bpt = new AfpBuilder()
				.create(BPT.class);

		byte[] text = new String("Hello World").getBytes(Charset.forName("IBM500")); // Encode our text in EBCDIC

		PTX ptx = new AfpBuilder()
				.withMember(new AfpBuilder()								// Text Orientation -> Left to Right // Top to Bottom
						.with(AfplibPackage.STO__IORNTION, STOIORNTION.CONST0DEGREES_VALUE)
						.with(AfplibPackage.STO__BORNTION, STOBORNTION.CONST90DEGREES_VALUE)
						.create(STO.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.AMB__DSPLCMNT, 1440)			// Text Cursor to 1 inch from top edge of the paper
						.create(AMB.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.AMI__DSPLCMNT, 720)				// Text Cursor to 0.5 inches from left edge of the paper
						.create(AMI.class))
				.withMember(new AfpBuilder()								// Text Color
						.with(AfplibPackage.STC__FRGCOLOR, STCFRGCOLOR.CONST_BLUE_VALUE)
						.create(STC.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.SCFL__LID, 1)					// identifier mapped in MCF above
						.create(SCFL.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.TRN__TRNDATA, text)
						.create(TRN.class))
				.create(PTX.class);

		EPT ept = new AfpBuilder()
				.create(EPT.class);

		EPG epg = new AfpBuilder()											// End Page
				.create(EPG.class);

		EDT edt = new AfpBuilder()											// End Document
				.create(EDT.class);


		for(SF sf : Arrays.asList(bdt, bpg, bag, mcf, pgd, ptd, eag, bpt, ptx, ept, epg, edt)) {
			out.writeStructuredField(sf);
		}
	}

	public static void main(String[] args) {
		try {
			new CreatePage().createAFPwithPage(new AfpOutputStream(new FileOutputStream("test.afp")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
