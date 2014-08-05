package org.afplib.samples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.afplib.AfpBuilder;
import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BAG;
import org.afplib.afplib.BMO;
import org.afplib.afplib.BOC;
import org.afplib.afplib.BOG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.CDD;
import org.afplib.afplib.CDDXocBase;
import org.afplib.afplib.CDDYocBase;
import org.afplib.afplib.DescriptorPosition;
import org.afplib.afplib.EAG;
import org.afplib.afplib.EMO;
import org.afplib.afplib.EOC;
import org.afplib.afplib.EOG;
import org.afplib.afplib.ERS;
import org.afplib.afplib.MCD;
import org.afplib.afplib.MCDRG;
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
import org.afplib.afplib.OCD;
import org.afplib.afplib.ObjectAreaSize;
import org.afplib.afplib.ObjectAreaSizeSizeType;
import org.afplib.afplib.ObjectClassification;
import org.afplib.afplib.ObjectClassificationObjClass;
import org.afplib.afplib.PGD;
import org.afplib.afplib.PGDXpgBase;
import org.afplib.afplib.PGDYpgBase;
import org.afplib.afplib.ResourceObjectType;
import org.afplib.afplib.ResourceObjectTypeObjType;
import org.afplib.io.AfpOutputStream;

public class PDF2Overlay {

	private static int MAX_OCD_SIZE = 30000;
	
	private String ins;
	private String outs;

	public PDF2Overlay(String in, String out) {
		this.ins = in;
		this.outs = out;
	}
	
	public static void main(String[] args) {
		
		new PDF2Overlay(args[0], args[1]).run();

	}

	void run() {
		int dpi = 360;
		int xsize = 2976;
		int ysize = 4209;
		
		try(InputStream fin = new BufferedInputStream(new FileInputStream(ins));
				AfpOutputStream out = new AfpOutputStream(new BufferedOutputStream(new FileOutputStream(outs)))) {
			
			String ovlName = String.format("%8s", new File(outs).getName()).substring(0, 8);
			
			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.BRS__RS_NAME, ovlName)
				.withMember(new AfpBuilder()
					.with(AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE, ResourceObjectTypeObjType.CONST_OVERLAY_VALUE)
					.with(AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA, new byte[] {0,0,0,0,0,0,0})
					.create(ResourceObjectType.class))
				.create(BRS.class));
			
			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.BMO__OVLY_NAME, ovlName)
				.create(BMO.class));

			out.writeStructuredField(new AfpBuilder()
				.create(BAG.class));

			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.PGD__XPG_BASE, PGDXpgBase.CONST10INCHES_VALUE)
				.with(AfplibPackage.PGD__YPG_BASE, PGDYpgBase.CONST10INCHES_VALUE)
				.with(AfplibPackage.PGD__XPG_UNITS, dpi*10)
				.with(AfplibPackage.PGD__YPG_UNITS, dpi*10)
				.with(AfplibPackage.PGD__XPG_SIZE, xsize)
				.with(AfplibPackage.PGD__YPG_SIZE, ysize)
				.with(AfplibPackage.PGD__RESERVED, 0)
				.create(PGD.class));

			out.writeStructuredField(new AfpBuilder()
				.create(EAG.class));
			
			out.writeStructuredField(new AfpBuilder()
				.withMember(new AfpBuilder()
						.with(AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS, ObjectClassificationObjClass.CONST_TIMEINVARIANT_VALUE)
						.with(AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS, 64512)
						.with(AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID, new byte[] {0x06, 0x07, 0x2b, 0x12, 0x00, 0x04, 0x01, 0x01, 0x3f, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00})
						.create(ObjectClassification.class))
				.with(AfplibPackage.BOC__OBJ_CNAME, ovlName)
				.create(BOC.class));
			
			out.writeStructuredField(new AfpBuilder()
				.create(BOG.class));
			
			out.writeStructuredField(new AfpBuilder()
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
				.create(OBD.class));
			
			out.writeStructuredField(new AfpBuilder()
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
				.create(OBP.class));

			out.writeStructuredField(new AfpBuilder()
				.withMember(new AfpBuilder()
					.withMember(new AfpBuilder()
						.with(AfplibPackage.MAPPING_OPTION__MAP_VALUE, MappingOptionMapValue.CONST_POSITIONANDTRIM_VALUE)
						.create(MappingOption.class))
					.create(MCDRG.class))
				.create(MCD.class));

			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.CDD__XOC_BASE, CDDXocBase.CONST10IN_VALUE)
				.with(AfplibPackage.CDD__YOC_BASE, CDDYocBase.CONST10IN_VALUE)
				.with(AfplibPackage.CDD__XOC_UNITS, dpi * 10)
				.with(AfplibPackage.CDD__YOC_UNITS, dpi * 10)
				.with(AfplibPackage.CDD__XOC_SIZE, xsize)
				.with(AfplibPackage.CDD__XOC_SIZE, ysize)
				.create(CDD.class));

			out.writeStructuredField(new AfpBuilder()
				.create(EOG.class));
			
			
			byte[] buffer = new byte[MAX_OCD_SIZE];
			int l;
			while ((l = fin.read(buffer)) > 0) {
				OCD ocd = AfplibFactory.eINSTANCE.createOCD();
				byte[] c = new byte[l];
				System.arraycopy(buffer, 0, c, 0, l);
				ocd.setObjCdat(c);
				out.writeStructuredField(ocd);
			}
			
			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.EOC__OBJ_CNAME, ovlName)
				.create(EOC.class));

			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.EMO__OVLY_NAME, ovlName)
				.create(EMO.class));

			out.writeStructuredField(new AfpBuilder()
				.with(AfplibPackage.ERS__RS_NAME, ovlName)
				.create(ERS.class));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
