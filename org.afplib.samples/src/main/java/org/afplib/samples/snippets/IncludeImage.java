package org.afplib.samples.snippets;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.afplib.AfpBuilder;
import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BAG;
import org.afplib.afplib.BDT;
import org.afplib.afplib.BOC;
import org.afplib.afplib.BOG;
import org.afplib.afplib.BPG;
import org.afplib.afplib.BRG;
import org.afplib.afplib.BRS;
import org.afplib.afplib.CGCSGID;
import org.afplib.afplib.DescriptorPosition;
import org.afplib.afplib.EAG;
import org.afplib.afplib.EDT;
import org.afplib.afplib.EOC;
import org.afplib.afplib.EOG;
import org.afplib.afplib.EPG;
import org.afplib.afplib.ERG;
import org.afplib.afplib.ERS;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.FullyQualifiedNameFQNFormat;
import org.afplib.afplib.FullyQualifiedNameFQNType;
import org.afplib.afplib.IOB;
import org.afplib.afplib.IOBObjType;
import org.afplib.afplib.IOBRefCSys;
import org.afplib.afplib.IOBXoaOrent;
import org.afplib.afplib.IOBYoaOrent;
import org.afplib.afplib.MCD;
import org.afplib.afplib.MCDRG;
import org.afplib.afplib.MDR;
import org.afplib.afplib.MDRRG;
import org.afplib.afplib.MPO;
import org.afplib.afplib.MPORG;
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

public class IncludeImage {

    public void createAFPWithObjectContainerImage(AfpOutputStream out, File image) throws IOException {

        int dpi = 300; // TODO adjust to image content
        int width = 712;
        int height = 498;
        
        byte[] imageType = new byte[] { 0x06, 0x07, 0x2B, 0x12, 0x00, 0x04, 0x01, 0x01, 0x0E, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 };
        String ext = image.getName().substring(image.getName().indexOf('.'));
        
        // TODO if image is not a tiff change imageType
        
        out.writeStructuredField(new AfpBuilder()
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.CGCSGID__CPGID, 500)            // EBCDIC encoding
                        .with(AfplibPackage.CGCSGID__GCSGID, 65535)
                        .create(CGCSGID.class))
                .create(BRG.class));
        
        out.writeStructuredField(new AfpBuilder()
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS, ObjectClassificationObjClass.CONST_TIMEINVARIANT_VALUE)
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS, 64512) // container, environment group and data in OCD
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID, imageType)
                        .create(ObjectClassification.class))
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE, ResourceObjectTypeObjType.CONST_OBJECT_CONTAINER_VALUE)
                        .with(AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA, new byte [] { 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00 })
                        .create(ResourceObjectType.class))
                .with(AfplibPackage.BRS__RS_NAME, "OC000001")
                .create(BRS.class));
        
        out.writeStructuredField(new AfpBuilder()
                .with(AfplibPackage.BOC__OBJ_CNAME, "OC000001")
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS, ObjectClassificationObjClass.CONST_TIMEINVARIANT_VALUE)
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS, 64512) // container, environment group and data in OCD
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID, imageType)
                        .create(ObjectClassification.class))
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
                        .with(AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS, dpi * 10)
                        .with(AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS, dpi * 10)
                        .create(MeasurementUnits.class))
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE, ObjectAreaSizeSizeType.CONST_OBJECT_AREA_SIZE_VALUE)
                        .with(AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE, width)
                        .with(AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE, height)
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
                                .with(AfplibPackage.MAPPING_OPTION__MAP_VALUE, MappingOptionMapValue.CONST_SCALETOFIT_VALUE)
                                .create(MappingOption.class))
                        .create(MCDRG.class))
                .create(MCD.class));

        out.writeStructuredField(new AfpBuilder()
                .create(EOG.class));

        // now read image content into OCD but max 32k per structured field
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(image))) {

            long toRead = image.length();
            byte[] buffer = new byte[32000];
            
            while(toRead > 0) {
                int len = in.read(buffer);
                if(len <= 0) break;
                
                byte[] b = new byte[len];
                
                System.arraycopy(buffer, 0, b, 0, len);
                
                OCD ocd = AfplibFactory.eINSTANCE.createOCD();
                ocd.setObjCdat(b);
                out.writeStructuredField(ocd);
                
                toRead -= len;
            }
            
        }
        
        out.writeStructuredField(new AfpBuilder().create(EOC.class));
        
        out.writeStructuredField(new AfpBuilder().create(ERS.class));

        out.writeStructuredField(new AfpBuilder().create(ERG.class));

        // End of resource group containing the image as an object container
        
        out.writeStructuredField(new AfpBuilder()                            // Begin Document
                .with(AfplibPackage.BDT__DOC_NAME, "MYFIRST")
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.CGCSGID__GCSGID, 65535)
                        .with(AfplibPackage.CGCSGID__CPGID, 500)            // Encode all CHARs in EBCDIC
                        .create(CGCSGID.class))
                .create(BDT.class));

        out.writeStructuredField(new AfpBuilder()                           // Begin Page
                .with(AfplibPackage.BPG__PAGE_NAME, "00000001")
                .create(BPG.class));

        out.writeStructuredField(new AfpBuilder()                          // Active Environment Group
                .create(BAG.class));
        
        out.writeStructuredField(new AfpBuilder()
                .withMember(new AfpBuilder()
                        .withMember(new AfpBuilder()
                                .with(AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE, FullyQualifiedNameFQNType.CONST_OTHER_OBJECT_DATA_REFERENCE_VALUE)
                                .with(AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT, FullyQualifiedNameFQNFormat.CONST_CHARACTERSTRING_VALUE)
                                .with(AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME, "OC000001")
                                .create(FullyQualifiedName.class))
                        .withMember(new AfpBuilder()
                                .with(AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS, ObjectClassificationObjClass.CONST_TIMEINVARIANT_VALUE)
                                .with(AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS, 64512) // container, environment group and data in OCD
                                .with(AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID, imageType)
                                .create(ObjectClassification.class))
                        .create(MDRRG.class))
                .create(MDR.class));

        out.writeStructuredField(new AfpBuilder()                            // Page descriptor
                .with(AfplibPackage.PGD__XPG_BASE, PGDXpgBase.CONST10INCHES_VALUE)
                .with(AfplibPackage.PGD__YPG_BASE, PGDYpgBase.CONST10INCHES_VALUE)
                .with(AfplibPackage.PGD__XPG_UNITS, 14400)                  // 1440 dpi resolution
                .with(AfplibPackage.PGD__YPG_UNITS, 14400)                  // 1440 dpi resolution
                .with(AfplibPackage.PGD__XPG_SIZE, 12240)                   // 8.5 inch
                .with(AfplibPackage.PGD__YPG_SIZE, 15840)                   // 11 inch
                .with(AfplibPackage.PGD__RESERVED, 0)
                .create(PGD.class));

        out.writeStructuredField(new AfpBuilder().create(EAG.class));

        out.writeStructuredField(new AfpBuilder()
                .with(AfplibPackage.IOB__OBJ_NAME, "OC000001")
                .with(AfplibPackage.IOB__OBJ_TYPE, IOBObjType.CONST_OTHEROBJECTDATA_VALUE)
                .with(AfplibPackage.IOB__XOA_OSET, 300)
                .with(AfplibPackage.IOB__YOA_OSET, 150)
                .with(AfplibPackage.IOB__XOA_ORENT, IOBXoaOrent.CONST0DEGREES_VALUE)
                .with(AfplibPackage.IOB__YOA_ORENT, IOBYoaOrent.CONST90DEGREES_VALUE)
                .with(AfplibPackage.IOB__XOCA_OSET, 0)
                .with(AfplibPackage.IOB__YOCA_OSET, 0)
                .with(AfplibPackage.IOB__REF_CSYS, IOBRefCSys.CONST_PAGEOROVERLAYCOORDINATESYSTEM_VALUE)
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS, ObjectClassificationObjClass.CONST_TIMEINVARIANT_VALUE)
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS, 64512) // container, environment group and data in OCD
                        .with(AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID, imageType)
                        .create(ObjectClassification.class))
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.MEASUREMENT_UNITS__XOA_BASE, MeasurementUnitsXoaBase.CONST10INCHES_VALUE)
                        .with(AfplibPackage.MEASUREMENT_UNITS__YOA_BASE, MeasurementUnitsYoaBase.CONST10INCHES_VALUE)
                        .with(AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS, dpi * 10)
                        .with(AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS, dpi * 10)
                        .create(MeasurementUnits.class))
                .withMember(new AfpBuilder()
                        .with(AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE, ObjectAreaSizeSizeType.CONST_OBJECT_AREA_SIZE_VALUE)
                        .with(AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE, width)
                        .with(AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE, height)
                        .create(ObjectAreaSize.class))
                .create(IOB.class));
        
        out.writeStructuredField(new AfpBuilder().create(EPG.class));

        out.writeStructuredField(new AfpBuilder().create(EDT.class));

    }

    public static void main(String[] args) {
        try {
            new IncludeImage().createAFPWithObjectContainerImage(new AfpOutputStream(new FileOutputStream(args[0])), new File(args[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
