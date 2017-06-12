package org.afplib.samples.snippets;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.afplib.AfpBuilder;
import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BAG;
import org.afplib.afplib.BDT;
import org.afplib.afplib.BIM;
import org.afplib.afplib.BOG;
import org.afplib.afplib.BPG;
import org.afplib.afplib.BandImage;
import org.afplib.afplib.BandImageData;
import org.afplib.afplib.BandImageRG;
import org.afplib.afplib.BeginImage;
import org.afplib.afplib.BeginSegment;
import org.afplib.afplib.BeginTile;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.DescriptorPosition;
import org.afplib.afplib.EAG;
import org.afplib.afplib.EDT;
import org.afplib.afplib.EIM;
import org.afplib.afplib.EOG;
import org.afplib.afplib.EPG;
import org.afplib.afplib.EndImage;
import org.afplib.afplib.EndSegment;
import org.afplib.afplib.EndTile;
import org.afplib.afplib.IDD;
import org.afplib.afplib.IDDUNITBASE;
import org.afplib.afplib.IDESize;
import org.afplib.afplib.IDEStructure;
import org.afplib.afplib.IOCAFunctionSetIdentification;
import org.afplib.afplib.IPD;
import org.afplib.afplib.ImageEncoding;
import org.afplib.afplib.ImageEncodingBITORDR;
import org.afplib.afplib.ImageEncodingCOMPRID;
import org.afplib.afplib.ImageEncodingRECID;
import org.afplib.afplib.MIO;
import org.afplib.afplib.MIORG;
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
import org.afplib.afplib.TilePosition;
import org.afplib.afplib.TileSize;
import org.afplib.afplib.TileTOC;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.afplib.io.AfpOutputStream;
import org.afplib.io.SDFHelper;

/**
 * Demonstration on how to create a new AFP file with a page and some text on it.
 *
 */
public class CreatePageWithIOCAImage {

	public void createAFPwithPage(AfpOutputStream out) throws IOException {

		int dpi = 300;
		int xsize = 800;
		int ysize = 480;

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

		BIM bim = new AfpBuilder()
				.create(BIM.class);

		BOG bog = new AfpBuilder()
				.create(BOG.class);

		OBD obd = new AfpBuilder()
				.withMember(new AfpBuilder()
						.with(AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID, 1)
						.create(DescriptorPosition.class))
					.withMember(new AfpBuilder()
						.with(AfplibPackage.MEASUREMENT_UNITS__XOA_BASE, MeasurementUnitsXoaBase.CONST10INCHES_VALUE)
						.with(AfplibPackage.MEASUREMENT_UNITS__YOA_BASE, MeasurementUnitsYoaBase.CONST10INCHES_VALUE)
						.with(AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS, dpi*10)
						.with(AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS, dpi*10)
						.create(MeasurementUnits.class))
					.withMember(new AfpBuilder()
						.with(AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE, ObjectAreaSizeSizeType.CONST_OBJECT_AREA_SIZE_VALUE)
						.with(AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE, xsize)
						.with(AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE, ysize)
						.create(ObjectAreaSize.class))
					.create(OBD.class);

		OBP obp = new AfpBuilder()
				.with(AfplibPackage.OBP__OA_POS_ID, 1)
				.with(AfplibPackage.OBP__RG_LENGTH, OBPRGLength.CONST_LENGTH23_VALUE)
				.with(AfplibPackage.OBP__XOA_OSET, 0)
				.with(AfplibPackage.OBP__YOA_OSET, 0)
				.with(AfplibPackage.OBP__XOA_ORENT, OBPXoaOrent.CONST0DEGREES_VALUE)
				.with(AfplibPackage.OBP__YOA_ORENT, OBPYoaOrent.CONST90DEGREES_VALUE)
				.with(AfplibPackage.OBP__XOCA_OSET, 0)
				.with(AfplibPackage.OBP__YOCA_OSET, 0)
				.with(AfplibPackage.OBP__XOCA_ORENT, OBPXocaOrent.CONST0DEGREES_VALUE)
				.with(AfplibPackage.OBP__YOCA_ORENT, OBPYocaOrent.CONST90DEGREES_VALUE)
				.with(AfplibPackage.OBP__REF_CSYS, OBPRefCSys.CONST_PAGE_OR_OVERLAY_VALUE)
				.create(OBP.class);

		MIO mio = new AfpBuilder()
				.withMember(new AfpBuilder()
						.withMember(new AfpBuilder()
							.with(AfplibPackage.MAPPING_OPTION__MAP_VALUE, MappingOptionMapValue.CONST_POSITIONANDTRIM_VALUE)
							.create(MappingOption.class))
						.create(MIORG.class))
					.create(MIO.class);

		IDD idd = new AfpBuilder()
				.with(AfplibPackage.IDD__UNITBASE, IDDUNITBASE.CONST10INCHES_VALUE)
				.with(AfplibPackage.IDD__XRESOL, dpi * 10)
				.with(AfplibPackage.IDD__YRESOL, dpi * 10)
				.with(AfplibPackage.IDD__XSIZE, xsize)
				.with(AfplibPackage.IDD__YSIZE, ysize)
				.withMember(new AfpBuilder()
						.with(AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__CATEGORY, 1)
						.with(AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__FCNSET, 45)
						.create(IOCAFunctionSetIdentification.class))
				.create(IDD.class);

		EOG eog = new AfpBuilder()
				.create(EOG.class);

		BeginSegment beginSegment = new AfpBuilder().create(BeginSegment.class);
		BeginImage beginImage = new AfpBuilder()
				.with(AfplibPackage.BEGIN_IMAGE__OBJTYPE, 255)
				.create(BeginImage.class);

		TileTOC toc = new AfpBuilder()
				.with(AfplibPackage.TILE_TOC__RESERVED, 0)
				.create(TileTOC.class);

		BeginTile beginTile = new AfpBuilder()
				.create(BeginTile.class);

		TilePosition tilePosition = new AfpBuilder()
				.with(AfplibPackage.TILE_POSITION__XOFFSET, 0)
				.with(AfplibPackage.TILE_POSITION__YOFFSET, 0)
				.create(TilePosition.class);

		TileSize tileSize = new AfpBuilder()
				.with(AfplibPackage.TILE_SIZE__THSIZE, xsize)
				.with(AfplibPackage.TILE_SIZE__TVSIZE, ysize)
				.create(TileSize.class);

		ImageEncoding imageEncoding = new AfpBuilder()
				.with(AfplibPackage.IMAGE_ENCODING__COMPRID, ImageEncodingCOMPRID.CONST_NO_COMPRESSION_VALUE)
				.with(AfplibPackage.IMAGE_ENCODING__RECID, ImageEncodingRECID.CONST_RIDIC_VALUE)
				.with(AfplibPackage.IMAGE_ENCODING__BITORDR, ImageEncodingBITORDR.CONST_LEFTTORIGHT_VALUE)
				.create(ImageEncoding.class);

		IDESize ideSize = new AfpBuilder()
				.with(AfplibPackage.IDE_SIZE__IDESZ, 32)   // 4 planes each 8 bit
				.create(IDESize.class);

		BandImage bandImage = new AfpBuilder()
				.with(AfplibPackage.BAND_IMAGE__BCOUNT, 4)
				.withMember(new AfpBuilder()
						.with(AfplibPackage.BAND_IMAGE_RG__BITCNT, 8)
						.create(BandImageRG.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.BAND_IMAGE_RG__BITCNT, 8)
						.create(BandImageRG.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.BAND_IMAGE_RG__BITCNT, 8)
						.create(BandImageRG.class))
				.withMember(new AfpBuilder()
						.with(AfplibPackage.BAND_IMAGE_RG__BITCNT, 8)
						.create(BandImageRG.class))
				.create(BandImage.class);

		IDEStructure ideStructure = new AfpBuilder()
				.with(AfplibPackage.IDE_STRUCTURE__FLAGS, 0)
				.with(AfplibPackage.IDE_STRUCTURE__FORMAT, 4)
				.with(AfplibPackage.IDE_STRUCTURE__SIZE1, 8)
				.with(AfplibPackage.IDE_STRUCTURE__SIZE2, 8)
				.with(AfplibPackage.IDE_STRUCTURE__SIZE3, 8)
				.with(AfplibPackage.IDE_STRUCTURE__SIZE4, 8)
				.create(IDEStructure.class);

		EndTile endTile = new AfpBuilder()
				.create(EndTile.class);

		EndImage endImage = new AfpBuilder().create(EndImage.class);
		EndSegment endSegment = new AfpBuilder().create(EndSegment.class);

		List<Triplet> triplets = new LinkedList<>();
		triplets.addAll(Arrays.asList(beginSegment, beginImage,
				toc, beginTile, tilePosition, tileSize, imageEncoding, ideSize,
				bandImage, ideStructure));

		// get uncompressed image data separated in 4 planes (CMYK) and
		// split into 30kb chunks
		byte[][] imageData = getImageData();
		for(int i=0; i<imageData.length; i++) {
			byte[][] chunks = divideArray(imageData[i], 30000);
			for(byte[] chunk : chunks) {
				triplets.add(new AfpBuilder()
						.with(AfplibPackage.BAND_IMAGE_DATA__BANDNUM, i + 1)
						.with(AfplibPackage.BAND_IMAGE_DATA__RESERVED, 0)
						.with(AfplibPackage.BAND_IMAGE_DATA__DATA, chunk)
						.create(BandImageData.class));
			}
		}

		triplets.addAll(Arrays.asList(endTile, endImage, endSegment));

		IPD[] ipds = SDFHelper.sdf2ipds(triplets);

		EIM eim = new AfpBuilder()
				.create(EIM.class);

		EPG epg = new AfpBuilder()											// End Page
				.create(EPG.class);

		EDT edt = new AfpBuilder()											// End Document
				.create(EDT.class);

		for(SF sf : Arrays.asList(bdt, bpg, bag, pgd, eag, bim, bog, obd, obp, mio, idd, eog)) {
			out.writeStructuredField(sf);
		}
		for(SF sf : ipds) {
			out.writeStructuredField(sf);
		}
		for(SF sf : Arrays.asList(eim, epg, edt)) {
			out.writeStructuredField(sf);
		}

	}

	private byte[][] getImageData() throws IOException {

		String[] files = new String[] {
			"testdata/img_800x480_3x8bit_RGB_color_bars_CMYKWRGB_0.dat",
			"testdata/img_800x480_3x8bit_RGB_color_bars_CMYKWRGB_1.dat",
			"testdata/img_800x480_3x8bit_RGB_color_bars_CMYKWRGB_2.dat",
			"testdata/img_800x480_3x8bit_RGB_color_bars_CMYKWRGB_3.dat",
		};

		byte[][] data = new byte[files.length][];

		for(int i=0; i<files.length; i++) {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			Files.copy(new File(files[i]).toPath(), bout);
			data[i] = bout.toByteArray();
		}

		return data;
	}

	private static byte[][] divideArray(byte[] source, int chunksize) {

        byte[][] ret = new byte[(int)Math.ceil(source.length / (double)chunksize)][chunksize];

        int start = 0;

        for(int i = 0; i < ret.length; i++) {
            if(start + chunksize > source.length) {
                System.arraycopy(source, start, ret[i], 0, source.length - start);
            } else {
                System.arraycopy(source, start, ret[i], 0, chunksize);
            }
            start += chunksize ;
        }

        return ret;
    }

	public static void main(String[] args) {
		try {
			new CreatePageWithIOCAImage().createAFPwithPage(new AfpOutputStream(new FileOutputStream("ioca-test.afp")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
