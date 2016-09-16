/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AfplibFactoryImpl extends EFactoryImpl implements AfplibFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AfplibFactory init() {
		try {
			AfplibFactory theAfplibFactory = (AfplibFactory)EPackage.Registry.INSTANCE.getEFactory(AfplibPackage.eNS_URI);
			if (theAfplibFactory != null) {
				return theAfplibFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AfplibFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfplibFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AfplibPackage.LINE_DATA: return createLineData();
			case AfplibPackage.BAG: return createBAG();
			case AfplibPackage.BBC: return createBBC();
			case AfplibPackage.BCA: return createBCA();
			case AfplibPackage.BCF: return createBCF();
			case AfplibPackage.BCP: return createBCP();
			case AfplibPackage.BDA: return createBDA();
			case AfplibPackage.BDD: return createBDD();
			case AfplibPackage.BDG: return createBDG();
			case AfplibPackage.BDI: return createBDI();
			case AfplibPackage.BDM: return createBDM();
			case AfplibPackage.BDT: return createBDT();
			case AfplibPackage.BDX: return createBDX();
			case AfplibPackage.BFG: return createBFG();
			case AfplibPackage.BFM: return createBFM();
			case AfplibPackage.BFN: return createBFN();
			case AfplibPackage.BGR: return createBGR();
			case AfplibPackage.BII: return createBII();
			case AfplibPackage.BIM: return createBIM();
			case AfplibPackage.BMM: return createBMM();
			case AfplibPackage.BMO: return createBMO();
			case AfplibPackage.BNG: return createBNG();
			case AfplibPackage.BOC: return createBOC();
			case AfplibPackage.BOG: return createBOG();
			case AfplibPackage.BPF: return createBPF();
			case AfplibPackage.BPG: return createBPG();
			case AfplibPackage.BPM: return createBPM();
			case AfplibPackage.BPS: return createBPS();
			case AfplibPackage.BPT: return createBPT();
			case AfplibPackage.BRG: return createBRG();
			case AfplibPackage.BRS: return createBRS();
			case AfplibPackage.BSG: return createBSG();
			case AfplibPackage.CAT: return createCAT();
			case AfplibPackage.CDD: return createCDD();
			case AfplibPackage.CFC: return createCFC();
			case AfplibPackage.CFI: return createCFI();
			case AfplibPackage.CPC: return createCPC();
			case AfplibPackage.CPD: return createCPD();
			case AfplibPackage.CPI: return createCPI();
			case AfplibPackage.CTC: return createCTC();
			case AfplibPackage.DXD: return createDXD();
			case AfplibPackage.EAG: return createEAG();
			case AfplibPackage.EBC: return createEBC();
			case AfplibPackage.ECA: return createECA();
			case AfplibPackage.ECF: return createECF();
			case AfplibPackage.ECP: return createECP();
			case AfplibPackage.EDG: return createEDG();
			case AfplibPackage.EDI: return createEDI();
			case AfplibPackage.EDM: return createEDM();
			case AfplibPackage.EDT: return createEDT();
			case AfplibPackage.EDX: return createEDX();
			case AfplibPackage.EFG: return createEFG();
			case AfplibPackage.EFM: return createEFM();
			case AfplibPackage.EFN: return createEFN();
			case AfplibPackage.EGR: return createEGR();
			case AfplibPackage.EII: return createEII();
			case AfplibPackage.EIM: return createEIM();
			case AfplibPackage.EMM: return createEMM();
			case AfplibPackage.EMO: return createEMO();
			case AfplibPackage.ENG: return createENG();
			case AfplibPackage.EOC: return createEOC();
			case AfplibPackage.EOG: return createEOG();
			case AfplibPackage.EPF: return createEPF();
			case AfplibPackage.EPG: return createEPG();
			case AfplibPackage.EPM: return createEPM();
			case AfplibPackage.EPS: return createEPS();
			case AfplibPackage.EPT: return createEPT();
			case AfplibPackage.ERG: return createERG();
			case AfplibPackage.ERS: return createERS();
			case AfplibPackage.ESG: return createESG();
			case AfplibPackage.FNC: return createFNC();
			case AfplibPackage.FND: return createFND();
			case AfplibPackage.FNG: return createFNG();
			case AfplibPackage.FNI: return createFNI();
			case AfplibPackage.FNN: return createFNN();
			case AfplibPackage.FNM: return createFNM();
			case AfplibPackage.FNO: return createFNO();
			case AfplibPackage.FNP: return createFNP();
			case AfplibPackage.GAD: return createGAD();
			case AfplibPackage.GDD: return createGDD();
			case AfplibPackage.ICP: return createICP();
			case AfplibPackage.IDD: return createIDD();
			case AfplibPackage.IEL: return createIEL();
			case AfplibPackage.IID: return createIID();
			case AfplibPackage.IMM: return createIMM();
			case AfplibPackage.IOB: return createIOB();
			case AfplibPackage.IOC: return createIOC();
			case AfplibPackage.IPD: return createIPD();
			case AfplibPackage.IPG: return createIPG();
			case AfplibPackage.IPO: return createIPO();
			case AfplibPackage.IPS: return createIPS();
			case AfplibPackage.IRD: return createIRD();
			case AfplibPackage.LLE: return createLLE();
			case AfplibPackage.LNC: return createLNC();
			case AfplibPackage.LND: return createLND();
			case AfplibPackage.MBC: return createMBC();
			case AfplibPackage.MCA: return createMCA();
			case AfplibPackage.MCC: return createMCC();
			case AfplibPackage.MCD: return createMCD();
			case AfplibPackage.MCF: return createMCF();
			case AfplibPackage.MCF1: return createMCF1();
			case AfplibPackage.MDD: return createMDD();
			case AfplibPackage.MDR: return createMDR();
			case AfplibPackage.MFC: return createMFC();
			case AfplibPackage.MGO: return createMGO();
			case AfplibPackage.MIO: return createMIO();
			case AfplibPackage.MMC: return createMMC();
			case AfplibPackage.MMD: return createMMD();
			case AfplibPackage.MMO: return createMMO();
			case AfplibPackage.MMT: return createMMT();
			case AfplibPackage.MPG: return createMPG();
			case AfplibPackage.MPO: return createMPO();
			case AfplibPackage.MPS: return createMPS();
			case AfplibPackage.MSU: return createMSU();
			case AfplibPackage.NOP: return createNOP();
			case AfplibPackage.OBD: return createOBD();
			case AfplibPackage.OBP: return createOBP();
			case AfplibPackage.OCD: return createOCD();
			case AfplibPackage.PEC: return createPEC();
			case AfplibPackage.PFC: return createPFC();
			case AfplibPackage.PGD: return createPGD();
			case AfplibPackage.PGP: return createPGP();
			case AfplibPackage.PGP1: return createPGP1();
			case AfplibPackage.PMC: return createPMC();
			case AfplibPackage.PPO: return createPPO();
			case AfplibPackage.PTD: return createPTD();
			case AfplibPackage.PTD1: return createPTD1();
			case AfplibPackage.PTX: return createPTX();
			case AfplibPackage.TLE: return createTLE();
			case AfplibPackage.FGD: return createFGD();
			case AfplibPackage.AMB: return createAMB();
			case AfplibPackage.AMI: return createAMI();
			case AfplibPackage.BLN: return createBLN();
			case AfplibPackage.BSU: return createBSU();
			case AfplibPackage.DBR: return createDBR();
			case AfplibPackage.DIR: return createDIR();
			case AfplibPackage.ESU: return createESU();
			case AfplibPackage.NOPCS: return createNOPCS();
			case AfplibPackage.OVS: return createOVS();
			case AfplibPackage.RMB: return createRMB();
			case AfplibPackage.RMI: return createRMI();
			case AfplibPackage.RPS: return createRPS();
			case AfplibPackage.SBI: return createSBI();
			case AfplibPackage.SCFL: return createSCFL();
			case AfplibPackage.SEC: return createSEC();
			case AfplibPackage.SIA: return createSIA();
			case AfplibPackage.SIM: return createSIM();
			case AfplibPackage.STC: return createSTC();
			case AfplibPackage.STO: return createSTO();
			case AfplibPackage.SVI: return createSVI();
			case AfplibPackage.TBM: return createTBM();
			case AfplibPackage.TRN: return createTRN();
			case AfplibPackage.USC: return createUSC();
			case AfplibPackage.ATTRIBUTE_QUALIFIER: return createAttributeQualifier();
			case AfplibPackage.ATTRIBUTE_VALUE: return createAttributeValue();
			case AfplibPackage.CGCSGID: return createCGCSGID();
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT: return createCRCResourceManagement();
			case AfplibPackage.CHARACTER_ROTATION: return createCharacterRotation();
			case AfplibPackage.COLOR_SPECIFICATION: return createColorSpecification();
			case AfplibPackage.COMMENT: return createComment();
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR: return createDataObjectFontDescriptor();
			case AfplibPackage.DESCRIPTOR_POSITION: return createDescriptorPosition();
			case AfplibPackage.ENCODING_SCHEME_ID: return createEncodingSchemeID();
			case AfplibPackage.FONT_RESOLUTION: return createFontResolution();
			case AfplibPackage.FULLY_QUALIFIED_NAME: return createFullyQualifiedName();
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP: return createLocalDateAndTimeStamp();
			case AfplibPackage.UNIVERSAL_DATE_AND_TIME_STAMP: return createUniversalDateAndTimeStamp();
			case AfplibPackage.MAPPING_OPTION: return createMappingOption();
			case AfplibPackage.MEDIA_EJECT_CONTROL: return createMediaEjectControl();
			case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER: return createMediumMapPageNumber();
			case AfplibPackage.MEDIUM_ORIENTATION: return createMediumOrientation();
			case AfplibPackage.MEASUREMENT_UNITS: return createMeasurementUnits();
			case AfplibPackage.MODCA_INTERCHANGE_SET: return createMODCAInterchangeSet();
			case AfplibPackage.OBJECT_AREA_SIZE: return createObjectAreaSize();
			case AfplibPackage.OBJECT_CLASSIFICATION: return createObjectClassification();
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION: return createObjectFunctionSetSpecification();
			case AfplibPackage.OBJECT_OFFSET: return createObjectOffset();
			case AfplibPackage.RESOURCE_OBJECT_TYPE: return createResourceObjectType();
			case AfplibPackage.PAGE_POSITION_INFORMATION: return createPagePositionInformation();
			case AfplibPackage.PRESENTATION_CONTROL: return createPresentationControl();
			case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING: return createPresentationSpaceResetMixing();
			case AfplibPackage.PRESENTATION_SPACE_MIXING_RULES: return createPresentationSpaceMixingRules();
			case AfplibPackage.RESOURCE_LOCAL_IDENTIFIER: return createResourceLocalIdentifier();
			case AfplibPackage.RESOURCE_SECTION_NUMBER: return createResourceSectionNumber();
			case AfplibPackage.TEXT_ORIENTATION: return createTextOrientation();
			case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR: return createFontHorizontalScaleFactor();
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION: return createFontDescriptorSpecification();
			case AfplibPackage.BEGIN_SEGMENT: return createBeginSegment();
			case AfplibPackage.END_SEGMENT: return createEndSegment();
			case AfplibPackage.BEGIN_TILE: return createBeginTile();
			case AfplibPackage.END_TILE: return createEndTile();
			case AfplibPackage.BEGIN_TRANSPARENCY_MASK: return createBeginTransparencyMask();
			case AfplibPackage.END_TRANSPARENCY_MASK: return createEndTransparencyMask();
			case AfplibPackage.BEGIN_IMAGE: return createBeginImage();
			case AfplibPackage.END_IMAGE: return createEndImage();
			case AfplibPackage.IMAGE_SIZE: return createImageSize();
			case AfplibPackage.IMAGE_ENCODING: return createImageEncoding();
			case AfplibPackage.IDE_SIZE: return createIDESize();
			case AfplibPackage.IMAGE_LUTID: return createImageLUTID();
			case AfplibPackage.BAND_IMAGE: return createBandImage();
			case AfplibPackage.IDE_STRUCTURE: return createIDEStructure();
			case AfplibPackage.EXTERNAL_ALGORITHM: return createExternalAlgorithm();
			case AfplibPackage.TILE_POSITION: return createTilePosition();
			case AfplibPackage.TILE_SIZE: return createTileSize();
			case AfplibPackage.TILE_SET_COLOR: return createTileSetColor();
			case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR: return createSetBiLevelImageColor();
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION: return createIOCAFunctionSetIdentification();
			case AfplibPackage.IMAGE_DATA: return createImageData();
			case AfplibPackage.BAND_IMAGE_DATA: return createBandImageData();
			case AfplibPackage.INCLUDE_TILE: return createIncludeTile();
			case AfplibPackage.IMAGE_SUBSAMPLING: return createImageSubsampling();
			case AfplibPackage.SAMPLING_RATIOS: return createSamplingRatios();
			case AfplibPackage.TILE_TOC: return createTileTOC();
			case AfplibPackage.CPIRG: return createCPIRG();
			case AfplibPackage.CFIRG: return createCFIRG();
			case AfplibPackage.FNIRG: return createFNIRG();
			case AfplibPackage.FNMRG: return createFNMRG();
			case AfplibPackage.LLERG: return createLLERG();
			case AfplibPackage.MPSRG: return createMPSRG();
			case AfplibPackage.MCFRG: return createMCFRG();
			case AfplibPackage.MBCRG: return createMBCRG();
			case AfplibPackage.MCARG: return createMCARG();
			case AfplibPackage.MCDRG: return createMCDRG();
			case AfplibPackage.MDRRG: return createMDRRG();
			case AfplibPackage.MGORG: return createMGORG();
			case AfplibPackage.MIORG: return createMIORG();
			case AfplibPackage.MMDRG: return createMMDRG();
			case AfplibPackage.MMTRG: return createMMTRG();
			case AfplibPackage.MPGRG: return createMPGRG();
			case AfplibPackage.MPORG: return createMPORG();
			case AfplibPackage.PPORG: return createPPORG();
			case AfplibPackage.PGPRG: return createPGPRG();
			case AfplibPackage.MCCRG: return createMCCRG();
			case AfplibPackage.MMORG: return createMMORG();
			case AfplibPackage.BAND_IMAGE_RG: return createBandImageRG();
			case AfplibPackage.MCF1RG: return createMCF1RG();
			case AfplibPackage.MMCRG: return createMMCRG();
			case AfplibPackage.FNORG: return createFNORG();
			case AfplibPackage.FNPRG: return createFNPRG();
			case AfplibPackage.TILE_TOCRG: return createTileTOCRG();
			case AfplibPackage.SAMPLING_RATIOS_RG: return createSamplingRatiosRG();
			case AfplibPackage.EXTERNAL_ALGORITHM_RG: return createExternalAlgorithmRG();
			case AfplibPackage.FNNRG: return createFNNRG();
			case AfplibPackage.FNNRG2: return createFNNRG2();
			case AfplibPackage.BEGIN_SEGMENT_COMMAND: return createBeginSegmentCommand();
			case AfplibPackage.END_SEGMENT_COMMAND: return createEndSegmentCommand();
			case AfplibPackage.GBAR: return createGBAR();
			case AfplibPackage.GBIMG: return createGBIMG();
			case AfplibPackage.GCBIMG: return createGCBIMG();
			case AfplibPackage.GBOX: return createGBOX();
			case AfplibPackage.GCBOX: return createGCBOX();
			case AfplibPackage.GCHST: return createGCHST();
			case AfplibPackage.GCCHST: return createGCCHST();
			case AfplibPackage.GCOMT: return createGCOMT();
			case AfplibPackage.GEAR: return createGEAR();
			case AfplibPackage.GEIMG: return createGEIMG();
			case AfplibPackage.GEPROL: return createGEPROL();
			case AfplibPackage.GFLT: return createGFLT();
			case AfplibPackage.GCFLT: return createGCFLT();
			case AfplibPackage.GFARC: return createGFARC();
			case AfplibPackage.GCFARC: return createGCFARC();
			case AfplibPackage.GIMD: return createGIMD();
			case AfplibPackage.GLINE: return createGLINE();
			case AfplibPackage.GCLINE: return createGCLINE();
			case AfplibPackage.GMRK: return createGMRK();
			case AfplibPackage.GCMRK: return createGCMRK();
			case AfplibPackage.GNOP1: return createGNOP1();
			case AfplibPackage.GPARC: return createGPARC();
			case AfplibPackage.GCPARC: return createGCPARC();
			case AfplibPackage.GRLINE: return createGRLINE();
			case AfplibPackage.GCRLINE: return createGCRLINE();
			case AfplibPackage.GSGCH: return createGSGCH();
			case AfplibPackage.GSAP: return createGSAP();
			case AfplibPackage.GSBMX: return createGSBMX();
			case AfplibPackage.GSCA: return createGSCA();
			case AfplibPackage.GSCC: return createGSCC();
			case AfplibPackage.GSCD: return createGSCD();
			case AfplibPackage.GSCR: return createGSCR();
			case AfplibPackage.GSCS: return createGSCS();
			case AfplibPackage.GSCH: return createGSCH();
			case AfplibPackage.GSCOL: return createGSCOL();
			case AfplibPackage.GSCP: return createGSCP();
			case AfplibPackage.GSECOL: return createGSECOL();
			case AfplibPackage.GSFLW: return createGSFLW();
			case AfplibPackage.GSLT: return createGSLT();
			case AfplibPackage.GSLW: return createGSLW();
			case AfplibPackage.GSMC: return createGSMC();
			case AfplibPackage.GSMP: return createGSMP();
			case AfplibPackage.GSMS: return createGSMS();
			case AfplibPackage.GSMT: return createGSMT();
			case AfplibPackage.GSMX: return createGSMX();
			case AfplibPackage.GSPS: return createGSPS();
			case AfplibPackage.GSPT: return createGSPT();
			case AfplibPackage.GSPCOL: return createGSPCOL();
			case AfplibPackage.GSLE: return createGSLE();
			case AfplibPackage.GSLJ: return createGSLJ();
			case AfplibPackage.GCBEZ: return createGCBEZ();
			case AfplibPackage.GCCBEZ: return createGCCBEZ();
			case AfplibPackage.WINDOW_SPECIFICATION: return createWindowSpecification();
			case AfplibPackage.DRAWING_ORDER_SUBSET: return createDrawingOrderSubset();
			case AfplibPackage.GCBEZRG: return createGCBEZRG();
			case AfplibPackage.GCCBEZRG: return createGCCBEZRG();
			case AfplibPackage.GFLTRG: return createGFLTRG();
			case AfplibPackage.GCFLTRG: return createGCFLTRG();
			case AfplibPackage.GLINERG: return createGLINERG();
			case AfplibPackage.GCLINERG: return createGCLINERG();
			case AfplibPackage.GMRKRG: return createGMRKRG();
			case AfplibPackage.GCMRKRG: return createGCMRKRG();
			case AfplibPackage.GRLINERG: return createGRLINERG();
			case AfplibPackage.GCRLINERG: return createGCRLINERG();
			case AfplibPackage.TONER_SAVER: return createTonerSaver();
			case AfplibPackage.COLOR_FIDELITY: return createColorFidelity();
			case AfplibPackage.FONT_FIDELITY: return createFontFidelity();
			case AfplibPackage.TEXT_FIDELITY: return createTextFidelity();
			case AfplibPackage.MEDIA_FIDELITY: return createMediaFidelity();
			case AfplibPackage.FINISHING_FIDELITY: return createFinishingFidelity();
			case AfplibPackage.CMR_FIDELITY: return createCMRFidelity();
			case AfplibPackage.OBJECT_BYTE_EXTENT: return createObjectByteExtent();
			case AfplibPackage.OBJECT_BYTE_OFFSET: return createObjectByteOffset();
			case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT: return createObjectStructuredFieldExtent();
			case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET: return createObjectStructuredFieldOffset();
			case AfplibPackage.OBJECT_COUNT: return createObjectCount();
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER: return createObjectOriginIdentifier();
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION: return createLineDataObjectPositionMigration();
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR: return createColorManagementResourceDescriptor();
			case AfplibPackage.MSURG: return createMSURG();
			case AfplibPackage.IMAGE_RESOLUTION: return createImageResolution();
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE: return createObjectContainerPresentationSpaceSize();
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER: return createExtendedResourceLocalIdentifier();
			case AfplibPackage.METRIC_ADJUSTMENT: return createMetricAdjustment();
			case AfplibPackage.EXTENSION_FONT: return createExtensionFont();
			case AfplibPackage.RENDERING_INTENT: return createRenderingIntent();
			case AfplibPackage.FONT_CODED_GRAPHIC_CHARACTER_SET_GLOBAL_IDENTIFIER: return createFontCodedGraphicCharacterSetGlobalIdentifier();
			case AfplibPackage.LOCALE_SELECTOR: return createLocaleSelector();
			case AfplibPackage.FINISHING_OPERATION: return createFinishingOperation();
			case AfplibPackage.UP_3I_FINISHING_OPERATION: return createUP3iFinishingOperation();
			case AfplibPackage.DEVICE_APPEARANCE: return createDeviceAppearance();
			case AfplibPackage.RESOURCE_OBJECT_INCLUDE: return createResourceObjectInclude();
			case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING: return createPageOverlayConditionalProcessing();
			case AfplibPackage.RESOURCE_USAGE_ATTRIBUTE: return createResourceUsageAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AfplibPackage.BDA_FLAGS:
				return createBDAFlagsFromString(eDataType, initialValue);
			case AfplibPackage.BDDUBASE:
				return createBDDUBASEFromString(eDataType, initialValue);
			case AfplibPackage.BDD_RESERVED:
				return createBDDReservedFromString(eDataType, initialValue);
			case AfplibPackage.BDD_RESERVED2:
				return createBDDReserved2FromString(eDataType, initialValue);
			case AfplibPackage.BDDTYPE:
				return createBDDTYPEFromString(eDataType, initialValue);
			case AfplibPackage.BDDCOLOR:
				return createBDDCOLORFromString(eDataType, initialValue);
			case AfplibPackage.BDM_DAT_FMT:
				return createBDMDatFmtFromString(eDataType, initialValue);
			case AfplibPackage.CDD_XOC_BASE:
				return createCDDXocBaseFromString(eDataType, initialValue);
			case AfplibPackage.CDD_YOC_BASE:
				return createCDDYocBaseFromString(eDataType, initialValue);
			case AfplibPackage.CFCCFIRG_LEN:
				return createCFCCFIRGLenFromString(eDataType, initialValue);
			case AfplibPackage.CFC_RETIRED1:
				return createCFCRetired1FromString(eDataType, initialValue);
			case AfplibPackage.CPC_PRT_FLAGS:
				return createCPCPrtFlagsFromString(eDataType, initialValue);
			case AfplibPackage.CPCCPIRG_LEN:
				return createCPCCPIRGLenFromString(eDataType, initialValue);
			case AfplibPackage.CPCVS_FLAGS:
				return createCPCVSFlagsFromString(eDataType, initialValue);
			case AfplibPackage.CPDGCGID_LEN:
				return createCPDGCGIDLenFromString(eDataType, initialValue);
			case AfplibPackage.CPD_ENC_SCHEME:
				return createCPDEncSchemeFromString(eDataType, initialValue);
			case AfplibPackage.FNC_RETIRED:
				return createFNCRetiredFromString(eDataType, initialValue);
			case AfplibPackage.FNC_PAT_TECH:
				return createFNCPatTechFromString(eDataType, initialValue);
			case AfplibPackage.FNC_FNT_FLAGS:
				return createFNCFntFlagsFromString(eDataType, initialValue);
			case AfplibPackage.FNCX_UNIT_BASE:
				return createFNCXUnitBaseFromString(eDataType, initialValue);
			case AfplibPackage.FNCY_UNIT_BASE:
				return createFNCYUnitBaseFromString(eDataType, initialValue);
			case AfplibPackage.FNC_XFT_UNITS:
				return createFNCXftUnitsFromString(eDataType, initialValue);
			case AfplibPackage.FNC_YFT_UNITS:
				return createFNCYftUnitsFromString(eDataType, initialValue);
			case AfplibPackage.FNCFNORG_LEN:
				return createFNCFNORGLenFromString(eDataType, initialValue);
			case AfplibPackage.FNCFNIRG_LEN:
				return createFNCFNIRGLenFromString(eDataType, initialValue);
			case AfplibPackage.FNC_PAT_ALIGN:
				return createFNCPatAlignFromString(eDataType, initialValue);
			case AfplibPackage.FNCFNPRG_LEN:
				return createFNCFNPRGLenFromString(eDataType, initialValue);
			case AfplibPackage.FNCFNMRG_LEN:
				return createFNCFNMRGLenFromString(eDataType, initialValue);
			case AfplibPackage.FNC_RES_XU_BASE:
				return createFNCResXUBaseFromString(eDataType, initialValue);
			case AfplibPackage.FNC_RES_YU_BASE:
				return createFNCResYUBaseFromString(eDataType, initialValue);
			case AfplibPackage.FNC_XFR_UNITS:
				return createFNCXfrUnitsFromString(eDataType, initialValue);
			case AfplibPackage.FNC_YFR_UNITS:
				return createFNCYfrUnitsFromString(eDataType, initialValue);
			case AfplibPackage.FNCFNNRG_LEN:
				return createFNCFNNRGLenFromString(eDataType, initialValue);
			case AfplibPackage.FND_FT_WT_CLASS:
				return createFNDFtWtClassFromString(eDataType, initialValue);
			case AfplibPackage.FND_FT_WD_CLASS:
				return createFNDFtWdClassFromString(eDataType, initialValue);
			case AfplibPackage.FND_FT_DS_FLAGS:
				return createFNDFtDsFlagsFromString(eDataType, initialValue);
			case AfplibPackage.IDDUNITBASE:
				return createIDDUNITBASEFromString(eDataType, initialValue);
			case AfplibPackage.IOB_OBJ_TYPE:
				return createIOBObjTypeFromString(eDataType, initialValue);
			case AfplibPackage.IOB_XOA_ORENT:
				return createIOBXoaOrentFromString(eDataType, initialValue);
			case AfplibPackage.IOB_YOA_ORENT:
				return createIOBYoaOrentFromString(eDataType, initialValue);
			case AfplibPackage.IOB_REF_CSYS:
				return createIOBRefCSysFromString(eDataType, initialValue);
			case AfplibPackage.IPGI_PG_FLGS:
				return createIPGIPgFlgsFromString(eDataType, initialValue);
			case AfplibPackage.IPO_OVLY_ORENT:
				return createIPOOvlyOrentFromString(eDataType, initialValue);
			case AfplibPackage.MDD_XM_BASE:
				return createMDDXmBaseFromString(eDataType, initialValue);
			case AfplibPackage.MDD_YM_BASE:
				return createMDDYmBaseFromString(eDataType, initialValue);
			case AfplibPackage.MDDMDD_FLGS:
				return createMDDMDDFlgsFromString(eDataType, initialValue);
			case AfplibPackage.MFCMFC_FLGS:
				return createMFCMFCFlgsFromString(eDataType, initialValue);
			case AfplibPackage.MFC_MED_COLL:
				return createMFCMedCollFromString(eDataType, initialValue);
			case AfplibPackage.MFCMFC_SCPE:
				return createMFCMFCScpeFromString(eDataType, initialValue);
			case AfplibPackage.MMCPARAMETER1:
				return createMMCPARAMETER1FromString(eDataType, initialValue);
			case AfplibPackage.MMORG_LENGTH:
				return createMMORGLengthFromString(eDataType, initialValue);
			case AfplibPackage.MPSRG_LENGTH:
				return createMPSRGLengthFromString(eDataType, initialValue);
			case AfplibPackage.OBPRG_LENGTH:
				return createOBPRGLengthFromString(eDataType, initialValue);
			case AfplibPackage.OBP_XOA_ORENT:
				return createOBPXoaOrentFromString(eDataType, initialValue);
			case AfplibPackage.OBP_YOA_ORENT:
				return createOBPYoaOrentFromString(eDataType, initialValue);
			case AfplibPackage.OBP_XOCA_ORENT:
				return createOBPXocaOrentFromString(eDataType, initialValue);
			case AfplibPackage.OBP_YOCA_ORENT:
				return createOBPYocaOrentFromString(eDataType, initialValue);
			case AfplibPackage.OBP_REF_CSYS:
				return createOBPRefCSysFromString(eDataType, initialValue);
			case AfplibPackage.PFCPFC_FLGS:
				return createPFCPFCFlgsFromString(eDataType, initialValue);
			case AfplibPackage.PGD_XPG_BASE:
				return createPGDXpgBaseFromString(eDataType, initialValue);
			case AfplibPackage.PGD_YPG_BASE:
				return createPGDYpgBaseFromString(eDataType, initialValue);
			case AfplibPackage.PGP_CONSTANT:
				return createPGPConstantFromString(eDataType, initialValue);
			case AfplibPackage.PTDXPBASE:
				return createPTDXPBASEFromString(eDataType, initialValue);
			case AfplibPackage.PTDYPBASE:
				return createPTDYPBASEFromString(eDataType, initialValue);
			case AfplibPackage.PTD1XPBASE:
				return createPTD1XPBASEFromString(eDataType, initialValue);
			case AfplibPackage.PTD1YPBASE:
				return createPTD1YPBASEFromString(eDataType, initialValue);
			case AfplibPackage.OVSBYPSIDEN:
				return createOVSBYPSIDENFromString(eDataType, initialValue);
			case AfplibPackage.SECCOLSPCE:
				return createSECCOLSPCEFromString(eDataType, initialValue);
			case AfplibPackage.SIADIRCTION:
				return createSIADIRCTIONFromString(eDataType, initialValue);
			case AfplibPackage.STCFRGCOLOR:
				return createSTCFRGCOLORFromString(eDataType, initialValue);
			case AfplibPackage.STCPRECSION:
				return createSTCPRECSIONFromString(eDataType, initialValue);
			case AfplibPackage.STOIORNTION:
				return createSTOIORNTIONFromString(eDataType, initialValue);
			case AfplibPackage.STOBORNTION:
				return createSTOBORNTIONFromString(eDataType, initialValue);
			case AfplibPackage.TBMDIRCTION:
				return createTBMDIRCTIONFromString(eDataType, initialValue);
			case AfplibPackage.TBMPRECSION:
				return createTBMPRECSIONFromString(eDataType, initialValue);
			case AfplibPackage.USCBYPSIDEN:
				return createUSCBYPSIDENFromString(eDataType, initialValue);
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT_FMT_QUAL:
				return createCRCResourceManagementFmtQualFromString(eDataType, initialValue);
			case AfplibPackage.COLOR_SPECIFICATION_COL_SPCE:
				return createColorSpecificationColSpceFromString(eDataType, initialValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_FONT_TECH:
				return createDataObjectFontDescriptorFontTechFromString(eDataType, initialValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_CHAR_ROT:
				return createDataObjectFontDescriptorCharRotFromString(eDataType, initialValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_ENC_ENV:
				return createDataObjectFontDescriptorEncEnvFromString(eDataType, initialValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_ENC_ID:
				return createDataObjectFontDescriptorEncIDFromString(eDataType, initialValue);
			case AfplibPackage.ENCODING_SCHEME_IDE_SID_CP:
				return createEncodingSchemeIDESidCPFromString(eDataType, initialValue);
			case AfplibPackage.ENCODING_SCHEME_IDE_SID_UD:
				return createEncodingSchemeIDESidUDFromString(eDataType, initialValue);
			case AfplibPackage.FONT_RESOLUTION_MET_TECH:
				return createFontResolutionMetTechFromString(eDataType, initialValue);
			case AfplibPackage.FONT_RESOLUTION_RPU_BASE:
				return createFontResolutionRPuBaseFromString(eDataType, initialValue);
			case AfplibPackage.FONT_RESOLUTION_RP_UNITS:
				return createFontResolutionRPUnitsFromString(eDataType, initialValue);
			case AfplibPackage.FULLY_QUALIFIED_NAME_FQN_TYPE:
				return createFullyQualifiedNameFQNTypeFromString(eDataType, initialValue);
			case AfplibPackage.FULLY_QUALIFIED_NAME_FQN_FORMAT:
				return createFullyQualifiedNameFQNFormatFromString(eDataType, initialValue);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP_STAMP_TYPE:
				return createLocalDateAndTimeStampStampTypeFromString(eDataType, initialValue);
			case AfplibPackage.MAPPING_OPTION_MAP_VALUE:
				return createMappingOptionMapValueFromString(eDataType, initialValue);
			case AfplibPackage.MEDIA_EJECT_CONTROL_RESERVED:
				return createMediaEjectControlReservedFromString(eDataType, initialValue);
			case AfplibPackage.MEDIA_EJECT_CONTROL_EJ_CTRL:
				return createMediaEjectControlEjCtrlFromString(eDataType, initialValue);
			case AfplibPackage.MEDIUM_ORIENTATION_MED_ORIENT:
				return createMediumOrientationMedOrientFromString(eDataType, initialValue);
			case AfplibPackage.MEASUREMENT_UNITS_XOA_BASE:
				return createMeasurementUnitsXoaBaseFromString(eDataType, initialValue);
			case AfplibPackage.MEASUREMENT_UNITS_YOA_BASE:
				return createMeasurementUnitsYoaBaseFromString(eDataType, initialValue);
			case AfplibPackage.MODCA_INTERCHANGE_SET_ISTYPE:
				return createMODCAInterchangeSetIStypeFromString(eDataType, initialValue);
			case AfplibPackage.MODCA_INTERCHANGE_SET_ISID:
				return createMODCAInterchangeSetISidFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_AREA_SIZE_SIZE_TYPE:
				return createObjectAreaSizeSizeTypeFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_CLASSIFICATION_OBJ_CLASS:
				return createObjectClassificationObjClassFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_CLASSIFICATION_STRUC_FLGS:
				return createObjectClassificationStrucFlgsFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_OBJ_TYPE:
				return createObjectFunctionSetSpecificationObjTypeFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_ARCH_VRSN:
				return createObjectFunctionSetSpecificationArchVrsnFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_DCA_FN_SET:
				return createObjectFunctionSetSpecificationDCAFnSetFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_OCA_FN_SET:
				return createObjectFunctionSetSpecificationOCAFnSetFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_OFFSET_OBJ_TPE:
				return createObjectOffsetObjTpeFromString(eDataType, initialValue);
			case AfplibPackage.RESOURCE_OBJECT_TYPE_OBJ_TYPE:
				return createResourceObjectTypeObjTypeFromString(eDataType, initialValue);
			case AfplibPackage.PRESENTATION_CONTROL_PRS_FLG:
				return createPresentationControlPRSFlgFromString(eDataType, initialValue);
			case AfplibPackage.RESOURCE_LOCAL_IDENTIFIER_RES_TYPE:
				return createResourceLocalIdentifierResTypeFromString(eDataType, initialValue);
			case AfplibPackage.TEXT_ORIENTATION_IAXIS:
				return createTextOrientationIAxisFromString(eDataType, initialValue);
			case AfplibPackage.TEXT_ORIENTATION_BAXIS:
				return createTextOrientationBAxisFromString(eDataType, initialValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_WT_CLASS:
				return createFontDescriptorSpecificationFtWtClassFromString(eDataType, initialValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_WD_CLASS:
				return createFontDescriptorSpecificationFtWdClassFromString(eDataType, initialValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_DS_FLAGS:
				return createFontDescriptorSpecificationFtDsFlagsFromString(eDataType, initialValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_US_FLAGS:
				return createFontDescriptorSpecificationFtUsFlagsFromString(eDataType, initialValue);
			case AfplibPackage.IMAGE_ENCODING_COMPRID:
				return createImageEncodingCOMPRIDFromString(eDataType, initialValue);
			case AfplibPackage.IMAGE_ENCODING_RECID:
				return createImageEncodingRECIDFromString(eDataType, initialValue);
			case AfplibPackage.IMAGE_ENCODING_BITORDR:
				return createImageEncodingBITORDRFromString(eDataType, initialValue);
			case AfplibPackage.IDE_STRUCTURE_FLAGS:
				return createIDEStructureFLAGSFromString(eDataType, initialValue);
			case AfplibPackage.EXTERNAL_ALGORITHM_ALGTYPE:
				return createExternalAlgorithmALGTYPEFromString(eDataType, initialValue);
			case AfplibPackage.TILE_SET_COLOR_CSPACE:
				return createTileSetColorCSPACEFromString(eDataType, initialValue);
			case AfplibPackage.PPORG_OBJ_TYPE:
				return createPPORGObjTypeFromString(eDataType, initialValue);
			case AfplibPackage.PPORG_PROC_FLGS:
				return createPPORGProcFlgsFromString(eDataType, initialValue);
			case AfplibPackage.PGPRGRG_LENGTH:
				return createPGPRGRGLengthFromString(eDataType, initialValue);
			case AfplibPackage.PGPRGP_GORIENT:
				return createPGPRGPGorientFromString(eDataType, initialValue);
			case AfplibPackage.PGPRGS_HSIDE:
				return createPGPRGSHsideFromString(eDataType, initialValue);
			case AfplibPackage.PGPRG_PG_FLGS:
				return createPGPRGPgFlgsFromString(eDataType, initialValue);
			case AfplibPackage.MMCR_GKEY:
				return createMMCRGkeyFromString(eDataType, initialValue);
			case AfplibPackage.EXTERNAL_ALGORITHM_RGPADBDRY:
				return createExternalAlgorithmRGPADBDRYFromString(eDataType, initialValue);
			case AfplibPackage.EXTERNAL_ALGORITHM_RGPADALMT:
				return createExternalAlgorithmRGPADALMTFromString(eDataType, initialValue);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND_LENGTH:
				return createBeginSegmentCommandLENGTHFromString(eDataType, initialValue);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND_FLAG2:
				return createBeginSegmentCommandFLAG2FromString(eDataType, initialValue);
			case AfplibPackage.GBARFLAGS:
				return createGBARFLAGSFromString(eDataType, initialValue);
			case AfplibPackage.GBIMGFORMAT:
				return createGBIMGFORMATFromString(eDataType, initialValue);
			case AfplibPackage.GBIMGRES:
				return createGBIMGRESFromString(eDataType, initialValue);
			case AfplibPackage.GCBIMGFORMAT:
				return createGCBIMGFORMATFromString(eDataType, initialValue);
			case AfplibPackage.GCBIMGRES:
				return createGCBIMGRESFromString(eDataType, initialValue);
			case AfplibPackage.GBOXRES:
				return createGBOXRESFromString(eDataType, initialValue);
			case AfplibPackage.GCBOXRES:
				return createGCBOXRESFromString(eDataType, initialValue);
			case AfplibPackage.GEPROLRES:
				return createGEPROLRESFromString(eDataType, initialValue);
			case AfplibPackage.GSBMXMODE:
				return createGSBMXMODEFromString(eDataType, initialValue);
			case AfplibPackage.GSCDDIRECTION:
				return createGSCDDIRECTIONFromString(eDataType, initialValue);
			case AfplibPackage.GSCRPREC:
				return createGSCRPRECFromString(eDataType, initialValue);
			case AfplibPackage.GSCOLCOL:
				return createGSCOLCOLFromString(eDataType, initialValue);
			case AfplibPackage.GSLTLINETYPE:
				return createGSLTLINETYPEFromString(eDataType, initialValue);
			case AfplibPackage.GSMPPREC:
				return createGSMPPRECFromString(eDataType, initialValue);
			case AfplibPackage.GSMTMCPT:
				return createGSMTMCPTFromString(eDataType, initialValue);
			case AfplibPackage.GSMXMODE:
				return createGSMXMODEFromString(eDataType, initialValue);
			case AfplibPackage.GSPSLCID:
				return createGSPSLCIDFromString(eDataType, initialValue);
			case AfplibPackage.GSPTPATT:
				return createGSPTPATTFromString(eDataType, initialValue);
			case AfplibPackage.GSPCOLCOLSPCE:
				return createGSPCOLCOLSPCEFromString(eDataType, initialValue);
			case AfplibPackage.GSLELINEEND:
				return createGSLELINEENDFromString(eDataType, initialValue);
			case AfplibPackage.GSLJLINEJOIN:
				return createGSLJLINEJOINFromString(eDataType, initialValue);
			case AfplibPackage.WINDOW_SPECIFICATION_FLAGS:
				return createWindowSpecificationFLAGSFromString(eDataType, initialValue);
			case AfplibPackage.WINDOW_SPECIFICATION_RES3:
				return createWindowSpecificationRES3FromString(eDataType, initialValue);
			case AfplibPackage.WINDOW_SPECIFICATION_CFORMAT:
				return createWindowSpecificationCFORMATFromString(eDataType, initialValue);
			case AfplibPackage.WINDOW_SPECIFICATION_UBASE:
				return createWindowSpecificationUBASEFromString(eDataType, initialValue);
			case AfplibPackage.TONER_SAVER_TSV_CTRL:
				return createTonerSaverTSvCtrlFromString(eDataType, initialValue);
			case AfplibPackage.COLOR_FIDELITY_STP_CO_EX:
				return createColorFidelityStpCoExFromString(eDataType, initialValue);
			case AfplibPackage.COLOR_FIDELITY_REP_CO_EX:
				return createColorFidelityRepCoExFromString(eDataType, initialValue);
			case AfplibPackage.COLOR_FIDELITY_COL_SUB:
				return createColorFidelityColSubFromString(eDataType, initialValue);
			case AfplibPackage.FONT_FIDELITY_STP_FNT_EX:
				return createFontFidelityStpFntExFromString(eDataType, initialValue);
			case AfplibPackage.TEXT_FIDELITY_STP_TXT_EX:
				return createTextFidelityStpTxtExFromString(eDataType, initialValue);
			case AfplibPackage.TEXT_FIDELITY_REP_TXT_EX:
				return createTextFidelityRepTxtExFromString(eDataType, initialValue);
			case AfplibPackage.MEDIA_FIDELITY_STP_MED_EX:
				return createMediaFidelityStpMedExFromString(eDataType, initialValue);
			case AfplibPackage.FINISHING_FIDELITY_STP_FIN_EX:
				return createFinishingFidelityStpFinExFromString(eDataType, initialValue);
			case AfplibPackage.FINISHING_FIDELITY_REP_FIN_EX:
				return createFinishingFidelityRepFinExFromString(eDataType, initialValue);
			case AfplibPackage.CMR_FIDELITY_STP_CMR_EX:
				return createCMRFidelityStpCMRExFromString(eDataType, initialValue);
			case AfplibPackage.CMR_FIDELITY_REP_CMR_EX:
				return createCMRFidelityRepCMRExFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_COUNT_SUB_OBJ:
				return createObjectCountSubObjFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER_SYSTEM:
				return createObjectOriginIdentifierSystemFromString(eDataType, initialValue);
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION_TEMP_ORIENT:
				return createLineDataObjectPositionMigrationTempOrientFromString(eDataType, initialValue);
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR_PROC_MODE:
				return createColorManagementResourceDescriptorProcModeFromString(eDataType, initialValue);
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR_CMR_SCPE:
				return createColorManagementResourceDescriptorCMRScpeFromString(eDataType, initialValue);
			case AfplibPackage.IMAGE_RESOLUTION_XBASE:
				return createImageResolutionXBaseFromString(eDataType, initialValue);
			case AfplibPackage.IMAGE_RESOLUTION_YBASE:
				return createImageResolutionYBaseFromString(eDataType, initialValue);
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE_PDF_SIZE:
				return createObjectContainerPresentationSpaceSizePDFSizeFromString(eDataType, initialValue);
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER_RES_TYPE:
				return createExtendedResourceLocalIdentifierResTypeFromString(eDataType, initialValue);
			case AfplibPackage.METRIC_ADJUSTMENT_UNIT_BASE:
				return createMetricAdjustmentUnitBaseFromString(eDataType, initialValue);
			case AfplibPackage.RENDERING_INTENT_RESERVED:
				return createRenderingIntentReservedFromString(eDataType, initialValue);
			case AfplibPackage.RENDERING_INTENT_IOCARI:
				return createRenderingIntentIOCARIFromString(eDataType, initialValue);
			case AfplibPackage.RENDERING_INTENT_OCRI:
				return createRenderingIntentOCRIFromString(eDataType, initialValue);
			case AfplibPackage.RENDERING_INTENT_PTOCRI:
				return createRenderingIntentPTOCRIFromString(eDataType, initialValue);
			case AfplibPackage.RENDERING_INTENT_GOCARI:
				return createRenderingIntentGOCARIFromString(eDataType, initialValue);
			case AfplibPackage.RENDERING_INTENT_RESERVED2:
				return createRenderingIntentReserved2FromString(eDataType, initialValue);
			case AfplibPackage.FINISHING_OPERATION_FOP_TYPE:
				return createFinishingOperationFOpTypeFromString(eDataType, initialValue);
			case AfplibPackage.FINISHING_OPERATION_REF_EDGE:
				return createFinishingOperationRefEdgeFromString(eDataType, initialValue);
			case AfplibPackage.DEVICE_APPEARANCE_DEV_APP:
				return createDeviceAppearanceDevAppFromString(eDataType, initialValue);
			case AfplibPackage.RESOURCE_OBJECT_INCLUDE_OBJ_TYPE:
				return createResourceObjectIncludeObjTypeFromString(eDataType, initialValue);
			case AfplibPackage.RESOURCE_OBJECT_INCLUDE_OB_ORENT:
				return createResourceObjectIncludeObOrentFromString(eDataType, initialValue);
			case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING_PG_OV_TYPE:
				return createPageOverlayConditionalProcessingPgOvTypeFromString(eDataType, initialValue);
			case AfplibPackage.RESOURCE_USAGE_ATTRIBUTE_FREQUENCY:
				return createResourceUsageAttributeFrequencyFromString(eDataType, initialValue);
			case AfplibPackage.SF_NAME:
				return createSFNameFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AfplibPackage.BDA_FLAGS:
				return convertBDAFlagsToString(eDataType, instanceValue);
			case AfplibPackage.BDDUBASE:
				return convertBDDUBASEToString(eDataType, instanceValue);
			case AfplibPackage.BDD_RESERVED:
				return convertBDDReservedToString(eDataType, instanceValue);
			case AfplibPackage.BDD_RESERVED2:
				return convertBDDReserved2ToString(eDataType, instanceValue);
			case AfplibPackage.BDDTYPE:
				return convertBDDTYPEToString(eDataType, instanceValue);
			case AfplibPackage.BDDCOLOR:
				return convertBDDCOLORToString(eDataType, instanceValue);
			case AfplibPackage.BDM_DAT_FMT:
				return convertBDMDatFmtToString(eDataType, instanceValue);
			case AfplibPackage.CDD_XOC_BASE:
				return convertCDDXocBaseToString(eDataType, instanceValue);
			case AfplibPackage.CDD_YOC_BASE:
				return convertCDDYocBaseToString(eDataType, instanceValue);
			case AfplibPackage.CFCCFIRG_LEN:
				return convertCFCCFIRGLenToString(eDataType, instanceValue);
			case AfplibPackage.CFC_RETIRED1:
				return convertCFCRetired1ToString(eDataType, instanceValue);
			case AfplibPackage.CPC_PRT_FLAGS:
				return convertCPCPrtFlagsToString(eDataType, instanceValue);
			case AfplibPackage.CPCCPIRG_LEN:
				return convertCPCCPIRGLenToString(eDataType, instanceValue);
			case AfplibPackage.CPCVS_FLAGS:
				return convertCPCVSFlagsToString(eDataType, instanceValue);
			case AfplibPackage.CPDGCGID_LEN:
				return convertCPDGCGIDLenToString(eDataType, instanceValue);
			case AfplibPackage.CPD_ENC_SCHEME:
				return convertCPDEncSchemeToString(eDataType, instanceValue);
			case AfplibPackage.FNC_RETIRED:
				return convertFNCRetiredToString(eDataType, instanceValue);
			case AfplibPackage.FNC_PAT_TECH:
				return convertFNCPatTechToString(eDataType, instanceValue);
			case AfplibPackage.FNC_FNT_FLAGS:
				return convertFNCFntFlagsToString(eDataType, instanceValue);
			case AfplibPackage.FNCX_UNIT_BASE:
				return convertFNCXUnitBaseToString(eDataType, instanceValue);
			case AfplibPackage.FNCY_UNIT_BASE:
				return convertFNCYUnitBaseToString(eDataType, instanceValue);
			case AfplibPackage.FNC_XFT_UNITS:
				return convertFNCXftUnitsToString(eDataType, instanceValue);
			case AfplibPackage.FNC_YFT_UNITS:
				return convertFNCYftUnitsToString(eDataType, instanceValue);
			case AfplibPackage.FNCFNORG_LEN:
				return convertFNCFNORGLenToString(eDataType, instanceValue);
			case AfplibPackage.FNCFNIRG_LEN:
				return convertFNCFNIRGLenToString(eDataType, instanceValue);
			case AfplibPackage.FNC_PAT_ALIGN:
				return convertFNCPatAlignToString(eDataType, instanceValue);
			case AfplibPackage.FNCFNPRG_LEN:
				return convertFNCFNPRGLenToString(eDataType, instanceValue);
			case AfplibPackage.FNCFNMRG_LEN:
				return convertFNCFNMRGLenToString(eDataType, instanceValue);
			case AfplibPackage.FNC_RES_XU_BASE:
				return convertFNCResXUBaseToString(eDataType, instanceValue);
			case AfplibPackage.FNC_RES_YU_BASE:
				return convertFNCResYUBaseToString(eDataType, instanceValue);
			case AfplibPackage.FNC_XFR_UNITS:
				return convertFNCXfrUnitsToString(eDataType, instanceValue);
			case AfplibPackage.FNC_YFR_UNITS:
				return convertFNCYfrUnitsToString(eDataType, instanceValue);
			case AfplibPackage.FNCFNNRG_LEN:
				return convertFNCFNNRGLenToString(eDataType, instanceValue);
			case AfplibPackage.FND_FT_WT_CLASS:
				return convertFNDFtWtClassToString(eDataType, instanceValue);
			case AfplibPackage.FND_FT_WD_CLASS:
				return convertFNDFtWdClassToString(eDataType, instanceValue);
			case AfplibPackage.FND_FT_DS_FLAGS:
				return convertFNDFtDsFlagsToString(eDataType, instanceValue);
			case AfplibPackage.IDDUNITBASE:
				return convertIDDUNITBASEToString(eDataType, instanceValue);
			case AfplibPackage.IOB_OBJ_TYPE:
				return convertIOBObjTypeToString(eDataType, instanceValue);
			case AfplibPackage.IOB_XOA_ORENT:
				return convertIOBXoaOrentToString(eDataType, instanceValue);
			case AfplibPackage.IOB_YOA_ORENT:
				return convertIOBYoaOrentToString(eDataType, instanceValue);
			case AfplibPackage.IOB_REF_CSYS:
				return convertIOBRefCSysToString(eDataType, instanceValue);
			case AfplibPackage.IPGI_PG_FLGS:
				return convertIPGIPgFlgsToString(eDataType, instanceValue);
			case AfplibPackage.IPO_OVLY_ORENT:
				return convertIPOOvlyOrentToString(eDataType, instanceValue);
			case AfplibPackage.MDD_XM_BASE:
				return convertMDDXmBaseToString(eDataType, instanceValue);
			case AfplibPackage.MDD_YM_BASE:
				return convertMDDYmBaseToString(eDataType, instanceValue);
			case AfplibPackage.MDDMDD_FLGS:
				return convertMDDMDDFlgsToString(eDataType, instanceValue);
			case AfplibPackage.MFCMFC_FLGS:
				return convertMFCMFCFlgsToString(eDataType, instanceValue);
			case AfplibPackage.MFC_MED_COLL:
				return convertMFCMedCollToString(eDataType, instanceValue);
			case AfplibPackage.MFCMFC_SCPE:
				return convertMFCMFCScpeToString(eDataType, instanceValue);
			case AfplibPackage.MMCPARAMETER1:
				return convertMMCPARAMETER1ToString(eDataType, instanceValue);
			case AfplibPackage.MMORG_LENGTH:
				return convertMMORGLengthToString(eDataType, instanceValue);
			case AfplibPackage.MPSRG_LENGTH:
				return convertMPSRGLengthToString(eDataType, instanceValue);
			case AfplibPackage.OBPRG_LENGTH:
				return convertOBPRGLengthToString(eDataType, instanceValue);
			case AfplibPackage.OBP_XOA_ORENT:
				return convertOBPXoaOrentToString(eDataType, instanceValue);
			case AfplibPackage.OBP_YOA_ORENT:
				return convertOBPYoaOrentToString(eDataType, instanceValue);
			case AfplibPackage.OBP_XOCA_ORENT:
				return convertOBPXocaOrentToString(eDataType, instanceValue);
			case AfplibPackage.OBP_YOCA_ORENT:
				return convertOBPYocaOrentToString(eDataType, instanceValue);
			case AfplibPackage.OBP_REF_CSYS:
				return convertOBPRefCSysToString(eDataType, instanceValue);
			case AfplibPackage.PFCPFC_FLGS:
				return convertPFCPFCFlgsToString(eDataType, instanceValue);
			case AfplibPackage.PGD_XPG_BASE:
				return convertPGDXpgBaseToString(eDataType, instanceValue);
			case AfplibPackage.PGD_YPG_BASE:
				return convertPGDYpgBaseToString(eDataType, instanceValue);
			case AfplibPackage.PGP_CONSTANT:
				return convertPGPConstantToString(eDataType, instanceValue);
			case AfplibPackage.PTDXPBASE:
				return convertPTDXPBASEToString(eDataType, instanceValue);
			case AfplibPackage.PTDYPBASE:
				return convertPTDYPBASEToString(eDataType, instanceValue);
			case AfplibPackage.PTD1XPBASE:
				return convertPTD1XPBASEToString(eDataType, instanceValue);
			case AfplibPackage.PTD1YPBASE:
				return convertPTD1YPBASEToString(eDataType, instanceValue);
			case AfplibPackage.OVSBYPSIDEN:
				return convertOVSBYPSIDENToString(eDataType, instanceValue);
			case AfplibPackage.SECCOLSPCE:
				return convertSECCOLSPCEToString(eDataType, instanceValue);
			case AfplibPackage.SIADIRCTION:
				return convertSIADIRCTIONToString(eDataType, instanceValue);
			case AfplibPackage.STCFRGCOLOR:
				return convertSTCFRGCOLORToString(eDataType, instanceValue);
			case AfplibPackage.STCPRECSION:
				return convertSTCPRECSIONToString(eDataType, instanceValue);
			case AfplibPackage.STOIORNTION:
				return convertSTOIORNTIONToString(eDataType, instanceValue);
			case AfplibPackage.STOBORNTION:
				return convertSTOBORNTIONToString(eDataType, instanceValue);
			case AfplibPackage.TBMDIRCTION:
				return convertTBMDIRCTIONToString(eDataType, instanceValue);
			case AfplibPackage.TBMPRECSION:
				return convertTBMPRECSIONToString(eDataType, instanceValue);
			case AfplibPackage.USCBYPSIDEN:
				return convertUSCBYPSIDENToString(eDataType, instanceValue);
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT_FMT_QUAL:
				return convertCRCResourceManagementFmtQualToString(eDataType, instanceValue);
			case AfplibPackage.COLOR_SPECIFICATION_COL_SPCE:
				return convertColorSpecificationColSpceToString(eDataType, instanceValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_FONT_TECH:
				return convertDataObjectFontDescriptorFontTechToString(eDataType, instanceValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_CHAR_ROT:
				return convertDataObjectFontDescriptorCharRotToString(eDataType, instanceValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_ENC_ENV:
				return convertDataObjectFontDescriptorEncEnvToString(eDataType, instanceValue);
			case AfplibPackage.DATA_OBJECT_FONT_DESCRIPTOR_ENC_ID:
				return convertDataObjectFontDescriptorEncIDToString(eDataType, instanceValue);
			case AfplibPackage.ENCODING_SCHEME_IDE_SID_CP:
				return convertEncodingSchemeIDESidCPToString(eDataType, instanceValue);
			case AfplibPackage.ENCODING_SCHEME_IDE_SID_UD:
				return convertEncodingSchemeIDESidUDToString(eDataType, instanceValue);
			case AfplibPackage.FONT_RESOLUTION_MET_TECH:
				return convertFontResolutionMetTechToString(eDataType, instanceValue);
			case AfplibPackage.FONT_RESOLUTION_RPU_BASE:
				return convertFontResolutionRPuBaseToString(eDataType, instanceValue);
			case AfplibPackage.FONT_RESOLUTION_RP_UNITS:
				return convertFontResolutionRPUnitsToString(eDataType, instanceValue);
			case AfplibPackage.FULLY_QUALIFIED_NAME_FQN_TYPE:
				return convertFullyQualifiedNameFQNTypeToString(eDataType, instanceValue);
			case AfplibPackage.FULLY_QUALIFIED_NAME_FQN_FORMAT:
				return convertFullyQualifiedNameFQNFormatToString(eDataType, instanceValue);
			case AfplibPackage.LOCAL_DATE_AND_TIME_STAMP_STAMP_TYPE:
				return convertLocalDateAndTimeStampStampTypeToString(eDataType, instanceValue);
			case AfplibPackage.MAPPING_OPTION_MAP_VALUE:
				return convertMappingOptionMapValueToString(eDataType, instanceValue);
			case AfplibPackage.MEDIA_EJECT_CONTROL_RESERVED:
				return convertMediaEjectControlReservedToString(eDataType, instanceValue);
			case AfplibPackage.MEDIA_EJECT_CONTROL_EJ_CTRL:
				return convertMediaEjectControlEjCtrlToString(eDataType, instanceValue);
			case AfplibPackage.MEDIUM_ORIENTATION_MED_ORIENT:
				return convertMediumOrientationMedOrientToString(eDataType, instanceValue);
			case AfplibPackage.MEASUREMENT_UNITS_XOA_BASE:
				return convertMeasurementUnitsXoaBaseToString(eDataType, instanceValue);
			case AfplibPackage.MEASUREMENT_UNITS_YOA_BASE:
				return convertMeasurementUnitsYoaBaseToString(eDataType, instanceValue);
			case AfplibPackage.MODCA_INTERCHANGE_SET_ISTYPE:
				return convertMODCAInterchangeSetIStypeToString(eDataType, instanceValue);
			case AfplibPackage.MODCA_INTERCHANGE_SET_ISID:
				return convertMODCAInterchangeSetISidToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_AREA_SIZE_SIZE_TYPE:
				return convertObjectAreaSizeSizeTypeToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_CLASSIFICATION_OBJ_CLASS:
				return convertObjectClassificationObjClassToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_CLASSIFICATION_STRUC_FLGS:
				return convertObjectClassificationStrucFlgsToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_OBJ_TYPE:
				return convertObjectFunctionSetSpecificationObjTypeToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_ARCH_VRSN:
				return convertObjectFunctionSetSpecificationArchVrsnToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_DCA_FN_SET:
				return convertObjectFunctionSetSpecificationDCAFnSetToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION_OCA_FN_SET:
				return convertObjectFunctionSetSpecificationOCAFnSetToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_OFFSET_OBJ_TPE:
				return convertObjectOffsetObjTpeToString(eDataType, instanceValue);
			case AfplibPackage.RESOURCE_OBJECT_TYPE_OBJ_TYPE:
				return convertResourceObjectTypeObjTypeToString(eDataType, instanceValue);
			case AfplibPackage.PRESENTATION_CONTROL_PRS_FLG:
				return convertPresentationControlPRSFlgToString(eDataType, instanceValue);
			case AfplibPackage.RESOURCE_LOCAL_IDENTIFIER_RES_TYPE:
				return convertResourceLocalIdentifierResTypeToString(eDataType, instanceValue);
			case AfplibPackage.TEXT_ORIENTATION_IAXIS:
				return convertTextOrientationIAxisToString(eDataType, instanceValue);
			case AfplibPackage.TEXT_ORIENTATION_BAXIS:
				return convertTextOrientationBAxisToString(eDataType, instanceValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_WT_CLASS:
				return convertFontDescriptorSpecificationFtWtClassToString(eDataType, instanceValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_WD_CLASS:
				return convertFontDescriptorSpecificationFtWdClassToString(eDataType, instanceValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_DS_FLAGS:
				return convertFontDescriptorSpecificationFtDsFlagsToString(eDataType, instanceValue);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION_FT_US_FLAGS:
				return convertFontDescriptorSpecificationFtUsFlagsToString(eDataType, instanceValue);
			case AfplibPackage.IMAGE_ENCODING_COMPRID:
				return convertImageEncodingCOMPRIDToString(eDataType, instanceValue);
			case AfplibPackage.IMAGE_ENCODING_RECID:
				return convertImageEncodingRECIDToString(eDataType, instanceValue);
			case AfplibPackage.IMAGE_ENCODING_BITORDR:
				return convertImageEncodingBITORDRToString(eDataType, instanceValue);
			case AfplibPackage.IDE_STRUCTURE_FLAGS:
				return convertIDEStructureFLAGSToString(eDataType, instanceValue);
			case AfplibPackage.EXTERNAL_ALGORITHM_ALGTYPE:
				return convertExternalAlgorithmALGTYPEToString(eDataType, instanceValue);
			case AfplibPackage.TILE_SET_COLOR_CSPACE:
				return convertTileSetColorCSPACEToString(eDataType, instanceValue);
			case AfplibPackage.PPORG_OBJ_TYPE:
				return convertPPORGObjTypeToString(eDataType, instanceValue);
			case AfplibPackage.PPORG_PROC_FLGS:
				return convertPPORGProcFlgsToString(eDataType, instanceValue);
			case AfplibPackage.PGPRGRG_LENGTH:
				return convertPGPRGRGLengthToString(eDataType, instanceValue);
			case AfplibPackage.PGPRGP_GORIENT:
				return convertPGPRGPGorientToString(eDataType, instanceValue);
			case AfplibPackage.PGPRGS_HSIDE:
				return convertPGPRGSHsideToString(eDataType, instanceValue);
			case AfplibPackage.PGPRG_PG_FLGS:
				return convertPGPRGPgFlgsToString(eDataType, instanceValue);
			case AfplibPackage.MMCR_GKEY:
				return convertMMCRGkeyToString(eDataType, instanceValue);
			case AfplibPackage.EXTERNAL_ALGORITHM_RGPADBDRY:
				return convertExternalAlgorithmRGPADBDRYToString(eDataType, instanceValue);
			case AfplibPackage.EXTERNAL_ALGORITHM_RGPADALMT:
				return convertExternalAlgorithmRGPADALMTToString(eDataType, instanceValue);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND_LENGTH:
				return convertBeginSegmentCommandLENGTHToString(eDataType, instanceValue);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND_FLAG2:
				return convertBeginSegmentCommandFLAG2ToString(eDataType, instanceValue);
			case AfplibPackage.GBARFLAGS:
				return convertGBARFLAGSToString(eDataType, instanceValue);
			case AfplibPackage.GBIMGFORMAT:
				return convertGBIMGFORMATToString(eDataType, instanceValue);
			case AfplibPackage.GBIMGRES:
				return convertGBIMGRESToString(eDataType, instanceValue);
			case AfplibPackage.GCBIMGFORMAT:
				return convertGCBIMGFORMATToString(eDataType, instanceValue);
			case AfplibPackage.GCBIMGRES:
				return convertGCBIMGRESToString(eDataType, instanceValue);
			case AfplibPackage.GBOXRES:
				return convertGBOXRESToString(eDataType, instanceValue);
			case AfplibPackage.GCBOXRES:
				return convertGCBOXRESToString(eDataType, instanceValue);
			case AfplibPackage.GEPROLRES:
				return convertGEPROLRESToString(eDataType, instanceValue);
			case AfplibPackage.GSBMXMODE:
				return convertGSBMXMODEToString(eDataType, instanceValue);
			case AfplibPackage.GSCDDIRECTION:
				return convertGSCDDIRECTIONToString(eDataType, instanceValue);
			case AfplibPackage.GSCRPREC:
				return convertGSCRPRECToString(eDataType, instanceValue);
			case AfplibPackage.GSCOLCOL:
				return convertGSCOLCOLToString(eDataType, instanceValue);
			case AfplibPackage.GSLTLINETYPE:
				return convertGSLTLINETYPEToString(eDataType, instanceValue);
			case AfplibPackage.GSMPPREC:
				return convertGSMPPRECToString(eDataType, instanceValue);
			case AfplibPackage.GSMTMCPT:
				return convertGSMTMCPTToString(eDataType, instanceValue);
			case AfplibPackage.GSMXMODE:
				return convertGSMXMODEToString(eDataType, instanceValue);
			case AfplibPackage.GSPSLCID:
				return convertGSPSLCIDToString(eDataType, instanceValue);
			case AfplibPackage.GSPTPATT:
				return convertGSPTPATTToString(eDataType, instanceValue);
			case AfplibPackage.GSPCOLCOLSPCE:
				return convertGSPCOLCOLSPCEToString(eDataType, instanceValue);
			case AfplibPackage.GSLELINEEND:
				return convertGSLELINEENDToString(eDataType, instanceValue);
			case AfplibPackage.GSLJLINEJOIN:
				return convertGSLJLINEJOINToString(eDataType, instanceValue);
			case AfplibPackage.WINDOW_SPECIFICATION_FLAGS:
				return convertWindowSpecificationFLAGSToString(eDataType, instanceValue);
			case AfplibPackage.WINDOW_SPECIFICATION_RES3:
				return convertWindowSpecificationRES3ToString(eDataType, instanceValue);
			case AfplibPackage.WINDOW_SPECIFICATION_CFORMAT:
				return convertWindowSpecificationCFORMATToString(eDataType, instanceValue);
			case AfplibPackage.WINDOW_SPECIFICATION_UBASE:
				return convertWindowSpecificationUBASEToString(eDataType, instanceValue);
			case AfplibPackage.TONER_SAVER_TSV_CTRL:
				return convertTonerSaverTSvCtrlToString(eDataType, instanceValue);
			case AfplibPackage.COLOR_FIDELITY_STP_CO_EX:
				return convertColorFidelityStpCoExToString(eDataType, instanceValue);
			case AfplibPackage.COLOR_FIDELITY_REP_CO_EX:
				return convertColorFidelityRepCoExToString(eDataType, instanceValue);
			case AfplibPackage.COLOR_FIDELITY_COL_SUB:
				return convertColorFidelityColSubToString(eDataType, instanceValue);
			case AfplibPackage.FONT_FIDELITY_STP_FNT_EX:
				return convertFontFidelityStpFntExToString(eDataType, instanceValue);
			case AfplibPackage.TEXT_FIDELITY_STP_TXT_EX:
				return convertTextFidelityStpTxtExToString(eDataType, instanceValue);
			case AfplibPackage.TEXT_FIDELITY_REP_TXT_EX:
				return convertTextFidelityRepTxtExToString(eDataType, instanceValue);
			case AfplibPackage.MEDIA_FIDELITY_STP_MED_EX:
				return convertMediaFidelityStpMedExToString(eDataType, instanceValue);
			case AfplibPackage.FINISHING_FIDELITY_STP_FIN_EX:
				return convertFinishingFidelityStpFinExToString(eDataType, instanceValue);
			case AfplibPackage.FINISHING_FIDELITY_REP_FIN_EX:
				return convertFinishingFidelityRepFinExToString(eDataType, instanceValue);
			case AfplibPackage.CMR_FIDELITY_STP_CMR_EX:
				return convertCMRFidelityStpCMRExToString(eDataType, instanceValue);
			case AfplibPackage.CMR_FIDELITY_REP_CMR_EX:
				return convertCMRFidelityRepCMRExToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_COUNT_SUB_OBJ:
				return convertObjectCountSubObjToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER_SYSTEM:
				return convertObjectOriginIdentifierSystemToString(eDataType, instanceValue);
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION_TEMP_ORIENT:
				return convertLineDataObjectPositionMigrationTempOrientToString(eDataType, instanceValue);
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR_PROC_MODE:
				return convertColorManagementResourceDescriptorProcModeToString(eDataType, instanceValue);
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR_CMR_SCPE:
				return convertColorManagementResourceDescriptorCMRScpeToString(eDataType, instanceValue);
			case AfplibPackage.IMAGE_RESOLUTION_XBASE:
				return convertImageResolutionXBaseToString(eDataType, instanceValue);
			case AfplibPackage.IMAGE_RESOLUTION_YBASE:
				return convertImageResolutionYBaseToString(eDataType, instanceValue);
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE_PDF_SIZE:
				return convertObjectContainerPresentationSpaceSizePDFSizeToString(eDataType, instanceValue);
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER_RES_TYPE:
				return convertExtendedResourceLocalIdentifierResTypeToString(eDataType, instanceValue);
			case AfplibPackage.METRIC_ADJUSTMENT_UNIT_BASE:
				return convertMetricAdjustmentUnitBaseToString(eDataType, instanceValue);
			case AfplibPackage.RENDERING_INTENT_RESERVED:
				return convertRenderingIntentReservedToString(eDataType, instanceValue);
			case AfplibPackage.RENDERING_INTENT_IOCARI:
				return convertRenderingIntentIOCARIToString(eDataType, instanceValue);
			case AfplibPackage.RENDERING_INTENT_OCRI:
				return convertRenderingIntentOCRIToString(eDataType, instanceValue);
			case AfplibPackage.RENDERING_INTENT_PTOCRI:
				return convertRenderingIntentPTOCRIToString(eDataType, instanceValue);
			case AfplibPackage.RENDERING_INTENT_GOCARI:
				return convertRenderingIntentGOCARIToString(eDataType, instanceValue);
			case AfplibPackage.RENDERING_INTENT_RESERVED2:
				return convertRenderingIntentReserved2ToString(eDataType, instanceValue);
			case AfplibPackage.FINISHING_OPERATION_FOP_TYPE:
				return convertFinishingOperationFOpTypeToString(eDataType, instanceValue);
			case AfplibPackage.FINISHING_OPERATION_REF_EDGE:
				return convertFinishingOperationRefEdgeToString(eDataType, instanceValue);
			case AfplibPackage.DEVICE_APPEARANCE_DEV_APP:
				return convertDeviceAppearanceDevAppToString(eDataType, instanceValue);
			case AfplibPackage.RESOURCE_OBJECT_INCLUDE_OBJ_TYPE:
				return convertResourceObjectIncludeObjTypeToString(eDataType, instanceValue);
			case AfplibPackage.RESOURCE_OBJECT_INCLUDE_OB_ORENT:
				return convertResourceObjectIncludeObOrentToString(eDataType, instanceValue);
			case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING_PG_OV_TYPE:
				return convertPageOverlayConditionalProcessingPgOvTypeToString(eDataType, instanceValue);
			case AfplibPackage.RESOURCE_USAGE_ATTRIBUTE_FREQUENCY:
				return convertResourceUsageAttributeFrequencyToString(eDataType, instanceValue);
			case AfplibPackage.SF_NAME:
				return convertSFNameToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineData createLineData() {
		LineDataImpl lineData = new LineDataImpl();
		return lineData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAG createBAG() {
		BAGImpl bag = new BAGImpl();
		return bag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BBC createBBC() {
		BBCImpl bbc = new BBCImpl();
		return bbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCA createBCA() {
		BCAImpl bca = new BCAImpl();
		return bca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCF createBCF() {
		BCFImpl bcf = new BCFImpl();
		return bcf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BCP createBCP() {
		BCPImpl bcp = new BCPImpl();
		return bcp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDA createBDA() {
		BDAImpl bda = new BDAImpl();
		return bda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDD createBDD() {
		BDDImpl bdd = new BDDImpl();
		return bdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDG createBDG() {
		BDGImpl bdg = new BDGImpl();
		return bdg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDI createBDI() {
		BDIImpl bdi = new BDIImpl();
		return bdi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDM createBDM() {
		BDMImpl bdm = new BDMImpl();
		return bdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDT createBDT() {
		BDTImpl bdt = new BDTImpl();
		return bdt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDX createBDX() {
		BDXImpl bdx = new BDXImpl();
		return bdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFG createBFG() {
		BFGImpl bfg = new BFGImpl();
		return bfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFM createBFM() {
		BFMImpl bfm = new BFMImpl();
		return bfm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BFN createBFN() {
		BFNImpl bfn = new BFNImpl();
		return bfn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BGR createBGR() {
		BGRImpl bgr = new BGRImpl();
		return bgr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BII createBII() {
		BIIImpl bii = new BIIImpl();
		return bii;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BIM createBIM() {
		BIMImpl bim = new BIMImpl();
		return bim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMM createBMM() {
		BMMImpl bmm = new BMMImpl();
		return bmm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BMO createBMO() {
		BMOImpl bmo = new BMOImpl();
		return bmo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BNG createBNG() {
		BNGImpl bng = new BNGImpl();
		return bng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOC createBOC() {
		BOCImpl boc = new BOCImpl();
		return boc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOG createBOG() {
		BOGImpl bog = new BOGImpl();
		return bog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPF createBPF() {
		BPFImpl bpf = new BPFImpl();
		return bpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPG createBPG() {
		BPGImpl bpg = new BPGImpl();
		return bpg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPM createBPM() {
		BPMImpl bpm = new BPMImpl();
		return bpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPS createBPS() {
		BPSImpl bps = new BPSImpl();
		return bps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPT createBPT() {
		BPTImpl bpt = new BPTImpl();
		return bpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRG createBRG() {
		BRGImpl brg = new BRGImpl();
		return brg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BRS createBRS() {
		BRSImpl brs = new BRSImpl();
		return brs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSG createBSG() {
		BSGImpl bsg = new BSGImpl();
		return bsg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CAT createCAT() {
		CATImpl cat = new CATImpl();
		return cat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDD createCDD() {
		CDDImpl cdd = new CDDImpl();
		return cdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFC createCFC() {
		CFCImpl cfc = new CFCImpl();
		return cfc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFI createCFI() {
		CFIImpl cfi = new CFIImpl();
		return cfi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPC createCPC() {
		CPCImpl cpc = new CPCImpl();
		return cpc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPD createCPD() {
		CPDImpl cpd = new CPDImpl();
		return cpd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPI createCPI() {
		CPIImpl cpi = new CPIImpl();
		return cpi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTC createCTC() {
		CTCImpl ctc = new CTCImpl();
		return ctc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DXD createDXD() {
		DXDImpl dxd = new DXDImpl();
		return dxd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAG createEAG() {
		EAGImpl eag = new EAGImpl();
		return eag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EBC createEBC() {
		EBCImpl ebc = new EBCImpl();
		return ebc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECA createECA() {
		ECAImpl eca = new ECAImpl();
		return eca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECF createECF() {
		ECFImpl ecf = new ECFImpl();
		return ecf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECP createECP() {
		ECPImpl ecp = new ECPImpl();
		return ecp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDG createEDG() {
		EDGImpl edg = new EDGImpl();
		return edg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDI createEDI() {
		EDIImpl edi = new EDIImpl();
		return edi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDM createEDM() {
		EDMImpl edm = new EDMImpl();
		return edm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDT createEDT() {
		EDTImpl edt = new EDTImpl();
		return edt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDX createEDX() {
		EDXImpl edx = new EDXImpl();
		return edx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFG createEFG() {
		EFGImpl efg = new EFGImpl();
		return efg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFM createEFM() {
		EFMImpl efm = new EFMImpl();
		return efm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFN createEFN() {
		EFNImpl efn = new EFNImpl();
		return efn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGR createEGR() {
		EGRImpl egr = new EGRImpl();
		return egr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EII createEII() {
		EIIImpl eii = new EIIImpl();
		return eii;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIM createEIM() {
		EIMImpl eim = new EIMImpl();
		return eim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMM createEMM() {
		EMMImpl emm = new EMMImpl();
		return emm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMO createEMO() {
		EMOImpl emo = new EMOImpl();
		return emo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENG createENG() {
		ENGImpl eng = new ENGImpl();
		return eng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOC createEOC() {
		EOCImpl eoc = new EOCImpl();
		return eoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOG createEOG() {
		EOGImpl eog = new EOGImpl();
		return eog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPF createEPF() {
		EPFImpl epf = new EPFImpl();
		return epf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPG createEPG() {
		EPGImpl epg = new EPGImpl();
		return epg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPM createEPM() {
		EPMImpl epm = new EPMImpl();
		return epm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPS createEPS() {
		EPSImpl eps = new EPSImpl();
		return eps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPT createEPT() {
		EPTImpl ept = new EPTImpl();
		return ept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERG createERG() {
		ERGImpl erg = new ERGImpl();
		return erg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERS createERS() {
		ERSImpl ers = new ERSImpl();
		return ers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESG createESG() {
		ESGImpl esg = new ESGImpl();
		return esg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNC createFNC() {
		FNCImpl fnc = new FNCImpl();
		return fnc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FND createFND() {
		FNDImpl fnd = new FNDImpl();
		return fnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNG createFNG() {
		FNGImpl fng = new FNGImpl();
		return fng;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNI createFNI() {
		FNIImpl fni = new FNIImpl();
		return fni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNN createFNN() {
		FNNImpl fnn = new FNNImpl();
		return fnn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNM createFNM() {
		FNMImpl fnm = new FNMImpl();
		return fnm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNO createFNO() {
		FNOImpl fno = new FNOImpl();
		return fno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNP createFNP() {
		FNPImpl fnp = new FNPImpl();
		return fnp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GAD createGAD() {
		GADImpl gad = new GADImpl();
		return gad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDD createGDD() {
		GDDImpl gdd = new GDDImpl();
		return gdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICP createICP() {
		ICPImpl icp = new ICPImpl();
		return icp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDD createIDD() {
		IDDImpl idd = new IDDImpl();
		return idd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEL createIEL() {
		IELImpl iel = new IELImpl();
		return iel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IID createIID() {
		IIDImpl iid = new IIDImpl();
		return iid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMM createIMM() {
		IMMImpl imm = new IMMImpl();
		return imm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOB createIOB() {
		IOBImpl iob = new IOBImpl();
		return iob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOC createIOC() {
		IOCImpl ioc = new IOCImpl();
		return ioc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPD createIPD() {
		IPDImpl ipd = new IPDImpl();
		return ipd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPG createIPG() {
		IPGImpl ipg = new IPGImpl();
		return ipg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPO createIPO() {
		IPOImpl ipo = new IPOImpl();
		return ipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPS createIPS() {
		IPSImpl ips = new IPSImpl();
		return ips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRD createIRD() {
		IRDImpl ird = new IRDImpl();
		return ird;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLE createLLE() {
		LLEImpl lle = new LLEImpl();
		return lle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LNC createLNC() {
		LNCImpl lnc = new LNCImpl();
		return lnc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LND createLND() {
		LNDImpl lnd = new LNDImpl();
		return lnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBC createMBC() {
		MBCImpl mbc = new MBCImpl();
		return mbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCA createMCA() {
		MCAImpl mca = new MCAImpl();
		return mca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCC createMCC() {
		MCCImpl mcc = new MCCImpl();
		return mcc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCD createMCD() {
		MCDImpl mcd = new MCDImpl();
		return mcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCF createMCF() {
		MCFImpl mcf = new MCFImpl();
		return mcf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCF1 createMCF1() {
		MCF1Impl mcf1 = new MCF1Impl();
		return mcf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDD createMDD() {
		MDDImpl mdd = new MDDImpl();
		return mdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDR createMDR() {
		MDRImpl mdr = new MDRImpl();
		return mdr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFC createMFC() {
		MFCImpl mfc = new MFCImpl();
		return mfc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGO createMGO() {
		MGOImpl mgo = new MGOImpl();
		return mgo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIO createMIO() {
		MIOImpl mio = new MIOImpl();
		return mio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMC createMMC() {
		MMCImpl mmc = new MMCImpl();
		return mmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMD createMMD() {
		MMDImpl mmd = new MMDImpl();
		return mmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMO createMMO() {
		MMOImpl mmo = new MMOImpl();
		return mmo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMT createMMT() {
		MMTImpl mmt = new MMTImpl();
		return mmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPG createMPG() {
		MPGImpl mpg = new MPGImpl();
		return mpg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPO createMPO() {
		MPOImpl mpo = new MPOImpl();
		return mpo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPS createMPS() {
		MPSImpl mps = new MPSImpl();
		return mps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSU createMSU() {
		MSUImpl msu = new MSUImpl();
		return msu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOP createNOP() {
		NOPImpl nop = new NOPImpl();
		return nop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBD createOBD() {
		OBDImpl obd = new OBDImpl();
		return obd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBP createOBP() {
		OBPImpl obp = new OBPImpl();
		return obp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCD createOCD() {
		OCDImpl ocd = new OCDImpl();
		return ocd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEC createPEC() {
		PECImpl pec = new PECImpl();
		return pec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFC createPFC() {
		PFCImpl pfc = new PFCImpl();
		return pfc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGD createPGD() {
		PGDImpl pgd = new PGDImpl();
		return pgd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGP createPGP() {
		PGPImpl pgp = new PGPImpl();
		return pgp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGP1 createPGP1() {
		PGP1Impl pgp1 = new PGP1Impl();
		return pgp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PMC createPMC() {
		PMCImpl pmc = new PMCImpl();
		return pmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPO createPPO() {
		PPOImpl ppo = new PPOImpl();
		return ppo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTD createPTD() {
		PTDImpl ptd = new PTDImpl();
		return ptd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTD1 createPTD1() {
		PTD1Impl ptd1 = new PTD1Impl();
		return ptd1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTX createPTX() {
		PTXImpl ptx = new PTXImpl();
		return ptx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLE createTLE() {
		TLEImpl tle = new TLEImpl();
		return tle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FGD createFGD() {
		FGDImpl fgd = new FGDImpl();
		return fgd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMB createAMB() {
		AMBImpl amb = new AMBImpl();
		return amb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMI createAMI() {
		AMIImpl ami = new AMIImpl();
		return ami;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLN createBLN() {
		BLNImpl bln = new BLNImpl();
		return bln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BSU createBSU() {
		BSUImpl bsu = new BSUImpl();
		return bsu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBR createDBR() {
		DBRImpl dbr = new DBRImpl();
		return dbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIR createDIR() {
		DIRImpl dir = new DIRImpl();
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESU createESU() {
		ESUImpl esu = new ESUImpl();
		return esu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NOPCS createNOPCS() {
		NOPCSImpl nopcs = new NOPCSImpl();
		return nopcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVS createOVS() {
		OVSImpl ovs = new OVSImpl();
		return ovs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMB createRMB() {
		RMBImpl rmb = new RMBImpl();
		return rmb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMI createRMI() {
		RMIImpl rmi = new RMIImpl();
		return rmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPS createRPS() {
		RPSImpl rps = new RPSImpl();
		return rps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBI createSBI() {
		SBIImpl sbi = new SBIImpl();
		return sbi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCFL createSCFL() {
		SCFLImpl scfl = new SCFLImpl();
		return scfl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEC createSEC() {
		SECImpl sec = new SECImpl();
		return sec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIA createSIA() {
		SIAImpl sia = new SIAImpl();
		return sia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIM createSIM() {
		SIMImpl sim = new SIMImpl();
		return sim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STC createSTC() {
		STCImpl stc = new STCImpl();
		return stc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STO createSTO() {
		STOImpl sto = new STOImpl();
		return sto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SVI createSVI() {
		SVIImpl svi = new SVIImpl();
		return svi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBM createTBM() {
		TBMImpl tbm = new TBMImpl();
		return tbm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRN createTRN() {
		TRNImpl trn = new TRNImpl();
		return trn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USC createUSC() {
		USCImpl usc = new USCImpl();
		return usc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeQualifier createAttributeQualifier() {
		AttributeQualifierImpl attributeQualifier = new AttributeQualifierImpl();
		return attributeQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValue createAttributeValue() {
		AttributeValueImpl attributeValue = new AttributeValueImpl();
		return attributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CGCSGID createCGCSGID() {
		CGCSGIDImpl cgcsgid = new CGCSGIDImpl();
		return cgcsgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRCResourceManagement createCRCResourceManagement() {
		CRCResourceManagementImpl crcResourceManagement = new CRCResourceManagementImpl();
		return crcResourceManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterRotation createCharacterRotation() {
		CharacterRotationImpl characterRotation = new CharacterRotationImpl();
		return characterRotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpecification createColorSpecification() {
		ColorSpecificationImpl colorSpecification = new ColorSpecificationImpl();
		return colorSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectFontDescriptor createDataObjectFontDescriptor() {
		DataObjectFontDescriptorImpl dataObjectFontDescriptor = new DataObjectFontDescriptorImpl();
		return dataObjectFontDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorPosition createDescriptorPosition() {
		DescriptorPositionImpl descriptorPosition = new DescriptorPositionImpl();
		return descriptorPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingSchemeID createEncodingSchemeID() {
		EncodingSchemeIDImpl encodingSchemeID = new EncodingSchemeIDImpl();
		return encodingSchemeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontResolution createFontResolution() {
		FontResolutionImpl fontResolution = new FontResolutionImpl();
		return fontResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedName createFullyQualifiedName() {
		FullyQualifiedNameImpl fullyQualifiedName = new FullyQualifiedNameImpl();
		return fullyQualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateAndTimeStamp createLocalDateAndTimeStamp() {
		LocalDateAndTimeStampImpl localDateAndTimeStamp = new LocalDateAndTimeStampImpl();
		return localDateAndTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDateAndTimeStamp createUniversalDateAndTimeStamp() {
		UniversalDateAndTimeStampImpl universalDateAndTimeStamp = new UniversalDateAndTimeStampImpl();
		return universalDateAndTimeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOption createMappingOption() {
		MappingOptionImpl mappingOption = new MappingOptionImpl();
		return mappingOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaEjectControl createMediaEjectControl() {
		MediaEjectControlImpl mediaEjectControl = new MediaEjectControlImpl();
		return mediaEjectControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumMapPageNumber createMediumMapPageNumber() {
		MediumMapPageNumberImpl mediumMapPageNumber = new MediumMapPageNumberImpl();
		return mediumMapPageNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumOrientation createMediumOrientation() {
		MediumOrientationImpl mediumOrientation = new MediumOrientationImpl();
		return mediumOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnits createMeasurementUnits() {
		MeasurementUnitsImpl measurementUnits = new MeasurementUnitsImpl();
		return measurementUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODCAInterchangeSet createMODCAInterchangeSet() {
		MODCAInterchangeSetImpl modcaInterchangeSet = new MODCAInterchangeSetImpl();
		return modcaInterchangeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAreaSize createObjectAreaSize() {
		ObjectAreaSizeImpl objectAreaSize = new ObjectAreaSizeImpl();
		return objectAreaSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassification createObjectClassification() {
		ObjectClassificationImpl objectClassification = new ObjectClassificationImpl();
		return objectClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFunctionSetSpecification createObjectFunctionSetSpecification() {
		ObjectFunctionSetSpecificationImpl objectFunctionSetSpecification = new ObjectFunctionSetSpecificationImpl();
		return objectFunctionSetSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOffset createObjectOffset() {
		ObjectOffsetImpl objectOffset = new ObjectOffsetImpl();
		return objectOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceObjectType createResourceObjectType() {
		ResourceObjectTypeImpl resourceObjectType = new ResourceObjectTypeImpl();
		return resourceObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagePositionInformation createPagePositionInformation() {
		PagePositionInformationImpl pagePositionInformation = new PagePositionInformationImpl();
		return pagePositionInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationControl createPresentationControl() {
		PresentationControlImpl presentationControl = new PresentationControlImpl();
		return presentationControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpaceResetMixing createPresentationSpaceResetMixing() {
		PresentationSpaceResetMixingImpl presentationSpaceResetMixing = new PresentationSpaceResetMixingImpl();
		return presentationSpaceResetMixing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationSpaceMixingRules createPresentationSpaceMixingRules() {
		PresentationSpaceMixingRulesImpl presentationSpaceMixingRules = new PresentationSpaceMixingRulesImpl();
		return presentationSpaceMixingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocalIdentifier createResourceLocalIdentifier() {
		ResourceLocalIdentifierImpl resourceLocalIdentifier = new ResourceLocalIdentifierImpl();
		return resourceLocalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSectionNumber createResourceSectionNumber() {
		ResourceSectionNumberImpl resourceSectionNumber = new ResourceSectionNumberImpl();
		return resourceSectionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrientation createTextOrientation() {
		TextOrientationImpl textOrientation = new TextOrientationImpl();
		return textOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontHorizontalScaleFactor createFontHorizontalScaleFactor() {
		FontHorizontalScaleFactorImpl fontHorizontalScaleFactor = new FontHorizontalScaleFactorImpl();
		return fontHorizontalScaleFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDescriptorSpecification createFontDescriptorSpecification() {
		FontDescriptorSpecificationImpl fontDescriptorSpecification = new FontDescriptorSpecificationImpl();
		return fontDescriptorSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginSegment createBeginSegment() {
		BeginSegmentImpl beginSegment = new BeginSegmentImpl();
		return beginSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSegment createEndSegment() {
		EndSegmentImpl endSegment = new EndSegmentImpl();
		return endSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginTile createBeginTile() {
		BeginTileImpl beginTile = new BeginTileImpl();
		return beginTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndTile createEndTile() {
		EndTileImpl endTile = new EndTileImpl();
		return endTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginTransparencyMask createBeginTransparencyMask() {
		BeginTransparencyMaskImpl beginTransparencyMask = new BeginTransparencyMaskImpl();
		return beginTransparencyMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndTransparencyMask createEndTransparencyMask() {
		EndTransparencyMaskImpl endTransparencyMask = new EndTransparencyMaskImpl();
		return endTransparencyMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginImage createBeginImage() {
		BeginImageImpl beginImage = new BeginImageImpl();
		return beginImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndImage createEndImage() {
		EndImageImpl endImage = new EndImageImpl();
		return endImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSize createImageSize() {
		ImageSizeImpl imageSize = new ImageSizeImpl();
		return imageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageEncoding createImageEncoding() {
		ImageEncodingImpl imageEncoding = new ImageEncodingImpl();
		return imageEncoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDESize createIDESize() {
		IDESizeImpl ideSize = new IDESizeImpl();
		return ideSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageLUTID createImageLUTID() {
		ImageLUTIDImpl imageLUTID = new ImageLUTIDImpl();
		return imageLUTID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandImage createBandImage() {
		BandImageImpl bandImage = new BandImageImpl();
		return bandImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDEStructure createIDEStructure() {
		IDEStructureImpl ideStructure = new IDEStructureImpl();
		return ideStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithm createExternalAlgorithm() {
		ExternalAlgorithmImpl externalAlgorithm = new ExternalAlgorithmImpl();
		return externalAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TilePosition createTilePosition() {
		TilePositionImpl tilePosition = new TilePositionImpl();
		return tilePosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileSize createTileSize() {
		TileSizeImpl tileSize = new TileSizeImpl();
		return tileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileSetColor createTileSetColor() {
		TileSetColorImpl tileSetColor = new TileSetColorImpl();
		return tileSetColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetBiLevelImageColor createSetBiLevelImageColor() {
		SetBiLevelImageColorImpl setBiLevelImageColor = new SetBiLevelImageColorImpl();
		return setBiLevelImageColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOCAFunctionSetIdentification createIOCAFunctionSetIdentification() {
		IOCAFunctionSetIdentificationImpl iocaFunctionSetIdentification = new IOCAFunctionSetIdentificationImpl();
		return iocaFunctionSetIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageData createImageData() {
		ImageDataImpl imageData = new ImageDataImpl();
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandImageData createBandImageData() {
		BandImageDataImpl bandImageData = new BandImageDataImpl();
		return bandImageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeTile createIncludeTile() {
		IncludeTileImpl includeTile = new IncludeTileImpl();
		return includeTile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageSubsampling createImageSubsampling() {
		ImageSubsamplingImpl imageSubsampling = new ImageSubsamplingImpl();
		return imageSubsampling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingRatios createSamplingRatios() {
		SamplingRatiosImpl samplingRatios = new SamplingRatiosImpl();
		return samplingRatios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileTOC createTileTOC() {
		TileTOCImpl tileTOC = new TileTOCImpl();
		return tileTOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPIRG createCPIRG() {
		CPIRGImpl cpirg = new CPIRGImpl();
		return cpirg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFIRG createCFIRG() {
		CFIRGImpl cfirg = new CFIRGImpl();
		return cfirg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNIRG createFNIRG() {
		FNIRGImpl fnirg = new FNIRGImpl();
		return fnirg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNMRG createFNMRG() {
		FNMRGImpl fnmrg = new FNMRGImpl();
		return fnmrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLERG createLLERG() {
		LLERGImpl llerg = new LLERGImpl();
		return llerg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPSRG createMPSRG() {
		MPSRGImpl mpsrg = new MPSRGImpl();
		return mpsrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCFRG createMCFRG() {
		MCFRGImpl mcfrg = new MCFRGImpl();
		return mcfrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBCRG createMBCRG() {
		MBCRGImpl mbcrg = new MBCRGImpl();
		return mbcrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCARG createMCARG() {
		MCARGImpl mcarg = new MCARGImpl();
		return mcarg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCDRG createMCDRG() {
		MCDRGImpl mcdrg = new MCDRGImpl();
		return mcdrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDRRG createMDRRG() {
		MDRRGImpl mdrrg = new MDRRGImpl();
		return mdrrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGORG createMGORG() {
		MGORGImpl mgorg = new MGORGImpl();
		return mgorg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MIORG createMIORG() {
		MIORGImpl miorg = new MIORGImpl();
		return miorg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMDRG createMMDRG() {
		MMDRGImpl mmdrg = new MMDRGImpl();
		return mmdrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMTRG createMMTRG() {
		MMTRGImpl mmtrg = new MMTRGImpl();
		return mmtrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPGRG createMPGRG() {
		MPGRGImpl mpgrg = new MPGRGImpl();
		return mpgrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPORG createMPORG() {
		MPORGImpl mporg = new MPORGImpl();
		return mporg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPORG createPPORG() {
		PPORGImpl pporg = new PPORGImpl();
		return pporg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPRG createPGPRG() {
		PGPRGImpl pgprg = new PGPRGImpl();
		return pgprg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCCRG createMCCRG() {
		MCCRGImpl mccrg = new MCCRGImpl();
		return mccrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMORG createMMORG() {
		MMORGImpl mmorg = new MMORGImpl();
		return mmorg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BandImageRG createBandImageRG() {
		BandImageRGImpl bandImageRG = new BandImageRGImpl();
		return bandImageRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCF1RG createMCF1RG() {
		MCF1RGImpl mcf1RG = new MCF1RGImpl();
		return mcf1RG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMCRG createMMCRG() {
		MMCRGImpl mmcrg = new MMCRGImpl();
		return mmcrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNORG createFNORG() {
		FNORGImpl fnorg = new FNORGImpl();
		return fnorg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNPRG createFNPRG() {
		FNPRGImpl fnprg = new FNPRGImpl();
		return fnprg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileTOCRG createTileTOCRG() {
		TileTOCRGImpl tileTOCRG = new TileTOCRGImpl();
		return tileTOCRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SamplingRatiosRG createSamplingRatiosRG() {
		SamplingRatiosRGImpl samplingRatiosRG = new SamplingRatiosRGImpl();
		return samplingRatiosRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmRG createExternalAlgorithmRG() {
		ExternalAlgorithmRGImpl externalAlgorithmRG = new ExternalAlgorithmRGImpl();
		return externalAlgorithmRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNNRG createFNNRG() {
		FNNRGImpl fnnrg = new FNNRGImpl();
		return fnnrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNNRG2 createFNNRG2() {
		FNNRG2Impl fnnrg2 = new FNNRG2Impl();
		return fnnrg2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginSegmentCommand createBeginSegmentCommand() {
		BeginSegmentCommandImpl beginSegmentCommand = new BeginSegmentCommandImpl();
		return beginSegmentCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSegmentCommand createEndSegmentCommand() {
		EndSegmentCommandImpl endSegmentCommand = new EndSegmentCommandImpl();
		return endSegmentCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBAR createGBAR() {
		GBARImpl gbar = new GBARImpl();
		return gbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBIMG createGBIMG() {
		GBIMGImpl gbimg = new GBIMGImpl();
		return gbimg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBIMG createGCBIMG() {
		GCBIMGImpl gcbimg = new GCBIMGImpl();
		return gcbimg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBOX createGBOX() {
		GBOXImpl gbox = new GBOXImpl();
		return gbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBOX createGCBOX() {
		GCBOXImpl gcbox = new GCBOXImpl();
		return gcbox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCHST createGCHST() {
		GCHSTImpl gchst = new GCHSTImpl();
		return gchst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCCHST createGCCHST() {
		GCCHSTImpl gcchst = new GCCHSTImpl();
		return gcchst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCOMT createGCOMT() {
		GCOMTImpl gcomt = new GCOMTImpl();
		return gcomt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEAR createGEAR() {
		GEARImpl gear = new GEARImpl();
		return gear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEIMG createGEIMG() {
		GEIMGImpl geimg = new GEIMGImpl();
		return geimg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEPROL createGEPROL() {
		GEPROLImpl geprol = new GEPROLImpl();
		return geprol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFLT createGFLT() {
		GFLTImpl gflt = new GFLTImpl();
		return gflt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCFLT createGCFLT() {
		GCFLTImpl gcflt = new GCFLTImpl();
		return gcflt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFARC createGFARC() {
		GFARCImpl gfarc = new GFARCImpl();
		return gfarc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCFARC createGCFARC() {
		GCFARCImpl gcfarc = new GCFARCImpl();
		return gcfarc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GIMD createGIMD() {
		GIMDImpl gimd = new GIMDImpl();
		return gimd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GLINE createGLINE() {
		GLINEImpl gline = new GLINEImpl();
		return gline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCLINE createGCLINE() {
		GCLINEImpl gcline = new GCLINEImpl();
		return gcline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMRK createGMRK() {
		GMRKImpl gmrk = new GMRKImpl();
		return gmrk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMRK createGCMRK() {
		GCMRKImpl gcmrk = new GCMRKImpl();
		return gcmrk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GNOP1 createGNOP1() {
		GNOP1Impl gnop1 = new GNOP1Impl();
		return gnop1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GPARC createGPARC() {
		GPARCImpl gparc = new GPARCImpl();
		return gparc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCPARC createGCPARC() {
		GCPARCImpl gcparc = new GCPARCImpl();
		return gcparc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRLINE createGRLINE() {
		GRLINEImpl grline = new GRLINEImpl();
		return grline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCRLINE createGCRLINE() {
		GCRLINEImpl gcrline = new GCRLINEImpl();
		return gcrline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSGCH createGSGCH() {
		GSGCHImpl gsgch = new GSGCHImpl();
		return gsgch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSAP createGSAP() {
		GSAPImpl gsap = new GSAPImpl();
		return gsap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSBMX createGSBMX() {
		GSBMXImpl gsbmx = new GSBMXImpl();
		return gsbmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCA createGSCA() {
		GSCAImpl gsca = new GSCAImpl();
		return gsca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCC createGSCC() {
		GSCCImpl gscc = new GSCCImpl();
		return gscc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCD createGSCD() {
		GSCDImpl gscd = new GSCDImpl();
		return gscd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCR createGSCR() {
		GSCRImpl gscr = new GSCRImpl();
		return gscr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCS createGSCS() {
		GSCSImpl gscs = new GSCSImpl();
		return gscs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCH createGSCH() {
		GSCHImpl gsch = new GSCHImpl();
		return gsch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCOL createGSCOL() {
		GSCOLImpl gscol = new GSCOLImpl();
		return gscol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCP createGSCP() {
		GSCPImpl gscp = new GSCPImpl();
		return gscp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSECOL createGSECOL() {
		GSECOLImpl gsecol = new GSECOLImpl();
		return gsecol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSFLW createGSFLW() {
		GSFLWImpl gsflw = new GSFLWImpl();
		return gsflw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLT createGSLT() {
		GSLTImpl gslt = new GSLTImpl();
		return gslt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLW createGSLW() {
		GSLWImpl gslw = new GSLWImpl();
		return gslw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMC createGSMC() {
		GSMCImpl gsmc = new GSMCImpl();
		return gsmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMP createGSMP() {
		GSMPImpl gsmp = new GSMPImpl();
		return gsmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMS createGSMS() {
		GSMSImpl gsms = new GSMSImpl();
		return gsms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMT createGSMT() {
		GSMTImpl gsmt = new GSMTImpl();
		return gsmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMX createGSMX() {
		GSMXImpl gsmx = new GSMXImpl();
		return gsmx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSPS createGSPS() {
		GSPSImpl gsps = new GSPSImpl();
		return gsps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSPT createGSPT() {
		GSPTImpl gspt = new GSPTImpl();
		return gspt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSPCOL createGSPCOL() {
		GSPCOLImpl gspcol = new GSPCOLImpl();
		return gspcol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLE createGSLE() {
		GSLEImpl gsle = new GSLEImpl();
		return gsle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLJ createGSLJ() {
		GSLJImpl gslj = new GSLJImpl();
		return gslj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBEZ createGCBEZ() {
		GCBEZImpl gcbez = new GCBEZImpl();
		return gcbez;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCCBEZ createGCCBEZ() {
		GCCBEZImpl gccbez = new GCCBEZImpl();
		return gccbez;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSpecification createWindowSpecification() {
		WindowSpecificationImpl windowSpecification = new WindowSpecificationImpl();
		return windowSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingOrderSubset createDrawingOrderSubset() {
		DrawingOrderSubsetImpl drawingOrderSubset = new DrawingOrderSubsetImpl();
		return drawingOrderSubset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBEZRG createGCBEZRG() {
		GCBEZRGImpl gcbezrg = new GCBEZRGImpl();
		return gcbezrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCCBEZRG createGCCBEZRG() {
		GCCBEZRGImpl gccbezrg = new GCCBEZRGImpl();
		return gccbezrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFLTRG createGFLTRG() {
		GFLTRGImpl gfltrg = new GFLTRGImpl();
		return gfltrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCFLTRG createGCFLTRG() {
		GCFLTRGImpl gcfltrg = new GCFLTRGImpl();
		return gcfltrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GLINERG createGLINERG() {
		GLINERGImpl glinerg = new GLINERGImpl();
		return glinerg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCLINERG createGCLINERG() {
		GCLINERGImpl gclinerg = new GCLINERGImpl();
		return gclinerg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMRKRG createGMRKRG() {
		GMRKRGImpl gmrkrg = new GMRKRGImpl();
		return gmrkrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCMRKRG createGCMRKRG() {
		GCMRKRGImpl gcmrkrg = new GCMRKRGImpl();
		return gcmrkrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRLINERG createGRLINERG() {
		GRLINERGImpl grlinerg = new GRLINERGImpl();
		return grlinerg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCRLINERG createGCRLINERG() {
		GCRLINERGImpl gcrlinerg = new GCRLINERGImpl();
		return gcrlinerg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TonerSaver createTonerSaver() {
		TonerSaverImpl tonerSaver = new TonerSaverImpl();
		return tonerSaver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorFidelity createColorFidelity() {
		ColorFidelityImpl colorFidelity = new ColorFidelityImpl();
		return colorFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFidelity createFontFidelity() {
		FontFidelityImpl fontFidelity = new FontFidelityImpl();
		return fontFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFidelity createTextFidelity() {
		TextFidelityImpl textFidelity = new TextFidelityImpl();
		return textFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaFidelity createMediaFidelity() {
		MediaFidelityImpl mediaFidelity = new MediaFidelityImpl();
		return mediaFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishingFidelity createFinishingFidelity() {
		FinishingFidelityImpl finishingFidelity = new FinishingFidelityImpl();
		return finishingFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMRFidelity createCMRFidelity() {
		CMRFidelityImpl cmrFidelity = new CMRFidelityImpl();
		return cmrFidelity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectByteExtent createObjectByteExtent() {
		ObjectByteExtentImpl objectByteExtent = new ObjectByteExtentImpl();
		return objectByteExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectByteOffset createObjectByteOffset() {
		ObjectByteOffsetImpl objectByteOffset = new ObjectByteOffsetImpl();
		return objectByteOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectStructuredFieldExtent createObjectStructuredFieldExtent() {
		ObjectStructuredFieldExtentImpl objectStructuredFieldExtent = new ObjectStructuredFieldExtentImpl();
		return objectStructuredFieldExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectStructuredFieldOffset createObjectStructuredFieldOffset() {
		ObjectStructuredFieldOffsetImpl objectStructuredFieldOffset = new ObjectStructuredFieldOffsetImpl();
		return objectStructuredFieldOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCount createObjectCount() {
		ObjectCountImpl objectCount = new ObjectCountImpl();
		return objectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOriginIdentifier createObjectOriginIdentifier() {
		ObjectOriginIdentifierImpl objectOriginIdentifier = new ObjectOriginIdentifierImpl();
		return objectOriginIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDataObjectPositionMigration createLineDataObjectPositionMigration() {
		LineDataObjectPositionMigrationImpl lineDataObjectPositionMigration = new LineDataObjectPositionMigrationImpl();
		return lineDataObjectPositionMigration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorManagementResourceDescriptor createColorManagementResourceDescriptor() {
		ColorManagementResourceDescriptorImpl colorManagementResourceDescriptor = new ColorManagementResourceDescriptorImpl();
		return colorManagementResourceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSURG createMSURG() {
		MSURGImpl msurg = new MSURGImpl();
		return msurg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageResolution createImageResolution() {
		ImageResolutionImpl imageResolution = new ImageResolutionImpl();
		return imageResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectContainerPresentationSpaceSize createObjectContainerPresentationSpaceSize() {
		ObjectContainerPresentationSpaceSizeImpl objectContainerPresentationSpaceSize = new ObjectContainerPresentationSpaceSizeImpl();
		return objectContainerPresentationSpaceSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedResourceLocalIdentifier createExtendedResourceLocalIdentifier() {
		ExtendedResourceLocalIdentifierImpl extendedResourceLocalIdentifier = new ExtendedResourceLocalIdentifierImpl();
		return extendedResourceLocalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricAdjustment createMetricAdjustment() {
		MetricAdjustmentImpl metricAdjustment = new MetricAdjustmentImpl();
		return metricAdjustment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionFont createExtensionFont() {
		ExtensionFontImpl extensionFont = new ExtensionFontImpl();
		return extensionFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntent createRenderingIntent() {
		RenderingIntentImpl renderingIntent = new RenderingIntentImpl();
		return renderingIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontCodedGraphicCharacterSetGlobalIdentifier createFontCodedGraphicCharacterSetGlobalIdentifier() {
		FontCodedGraphicCharacterSetGlobalIdentifierImpl fontCodedGraphicCharacterSetGlobalIdentifier = new FontCodedGraphicCharacterSetGlobalIdentifierImpl();
		return fontCodedGraphicCharacterSetGlobalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocaleSelector createLocaleSelector() {
		LocaleSelectorImpl localeSelector = new LocaleSelectorImpl();
		return localeSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishingOperation createFinishingOperation() {
		FinishingOperationImpl finishingOperation = new FinishingOperationImpl();
		return finishingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UP3iFinishingOperation createUP3iFinishingOperation() {
		UP3iFinishingOperationImpl up3iFinishingOperation = new UP3iFinishingOperationImpl();
		return up3iFinishingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAppearance createDeviceAppearance() {
		DeviceAppearanceImpl deviceAppearance = new DeviceAppearanceImpl();
		return deviceAppearance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceObjectInclude createResourceObjectInclude() {
		ResourceObjectIncludeImpl resourceObjectInclude = new ResourceObjectIncludeImpl();
		return resourceObjectInclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageOverlayConditionalProcessing createPageOverlayConditionalProcessing() {
		PageOverlayConditionalProcessingImpl pageOverlayConditionalProcessing = new PageOverlayConditionalProcessingImpl();
		return pageOverlayConditionalProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUsageAttribute createResourceUsageAttribute() {
		ResourceUsageAttributeImpl resourceUsageAttribute = new ResourceUsageAttributeImpl();
		return resourceUsageAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDAFlags createBDAFlagsFromString(EDataType eDataType, String initialValue) {
		BDAFlags result = BDAFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDAFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDDUBASE createBDDUBASEFromString(EDataType eDataType, String initialValue) {
		BDDUBASE result = BDDUBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDDUBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDDReserved createBDDReservedFromString(EDataType eDataType, String initialValue) {
		BDDReserved result = BDDReserved.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDDReservedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDDReserved2 createBDDReserved2FromString(EDataType eDataType, String initialValue) {
		BDDReserved2 result = BDDReserved2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDDReserved2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDDTYPE createBDDTYPEFromString(EDataType eDataType, String initialValue) {
		BDDTYPE result = BDDTYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDDTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDDCOLOR createBDDCOLORFromString(EDataType eDataType, String initialValue) {
		BDDCOLOR result = BDDCOLOR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDDCOLORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BDMDatFmt createBDMDatFmtFromString(EDataType eDataType, String initialValue) {
		BDMDatFmt result = BDMDatFmt.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBDMDatFmtToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDXocBase createCDDXocBaseFromString(EDataType eDataType, String initialValue) {
		CDDXocBase result = CDDXocBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDXocBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDDYocBase createCDDYocBaseFromString(EDataType eDataType, String initialValue) {
		CDDYocBase result = CDDYocBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCDDYocBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFCCFIRGLen createCFCCFIRGLenFromString(EDataType eDataType, String initialValue) {
		CFCCFIRGLen result = CFCCFIRGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCFCCFIRGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CFCRetired1 createCFCRetired1FromString(EDataType eDataType, String initialValue) {
		CFCRetired1 result = CFCRetired1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCFCRetired1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPCPrtFlags createCPCPrtFlagsFromString(EDataType eDataType, String initialValue) {
		CPCPrtFlags result = CPCPrtFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPCPrtFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPCCPIRGLen createCPCCPIRGLenFromString(EDataType eDataType, String initialValue) {
		CPCCPIRGLen result = CPCCPIRGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPCCPIRGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPCVSFlags createCPCVSFlagsFromString(EDataType eDataType, String initialValue) {
		CPCVSFlags result = CPCVSFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPCVSFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPDGCGIDLen createCPDGCGIDLenFromString(EDataType eDataType, String initialValue) {
		CPDGCGIDLen result = CPDGCGIDLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPDGCGIDLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPDEncScheme createCPDEncSchemeFromString(EDataType eDataType, String initialValue) {
		CPDEncScheme result = CPDEncScheme.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCPDEncSchemeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCRetired createFNCRetiredFromString(EDataType eDataType, String initialValue) {
		FNCRetired result = FNCRetired.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCRetiredToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCPatTech createFNCPatTechFromString(EDataType eDataType, String initialValue) {
		FNCPatTech result = FNCPatTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCPatTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCFntFlags createFNCFntFlagsFromString(EDataType eDataType, String initialValue) {
		FNCFntFlags result = FNCFntFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCFntFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCXUnitBase createFNCXUnitBaseFromString(EDataType eDataType, String initialValue) {
		FNCXUnitBase result = FNCXUnitBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCXUnitBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCYUnitBase createFNCYUnitBaseFromString(EDataType eDataType, String initialValue) {
		FNCYUnitBase result = FNCYUnitBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCYUnitBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCXftUnits createFNCXftUnitsFromString(EDataType eDataType, String initialValue) {
		FNCXftUnits result = FNCXftUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCXftUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCYftUnits createFNCYftUnitsFromString(EDataType eDataType, String initialValue) {
		FNCYftUnits result = FNCYftUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCYftUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCFNORGLen createFNCFNORGLenFromString(EDataType eDataType, String initialValue) {
		FNCFNORGLen result = FNCFNORGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCFNORGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCFNIRGLen createFNCFNIRGLenFromString(EDataType eDataType, String initialValue) {
		FNCFNIRGLen result = FNCFNIRGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCFNIRGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCPatAlign createFNCPatAlignFromString(EDataType eDataType, String initialValue) {
		FNCPatAlign result = FNCPatAlign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCPatAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCFNPRGLen createFNCFNPRGLenFromString(EDataType eDataType, String initialValue) {
		FNCFNPRGLen result = FNCFNPRGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCFNPRGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCFNMRGLen createFNCFNMRGLenFromString(EDataType eDataType, String initialValue) {
		FNCFNMRGLen result = FNCFNMRGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCFNMRGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCResXUBase createFNCResXUBaseFromString(EDataType eDataType, String initialValue) {
		FNCResXUBase result = FNCResXUBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCResXUBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCResYUBase createFNCResYUBaseFromString(EDataType eDataType, String initialValue) {
		FNCResYUBase result = FNCResYUBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCResYUBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCXfrUnits createFNCXfrUnitsFromString(EDataType eDataType, String initialValue) {
		FNCXfrUnits result = FNCXfrUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCXfrUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCYfrUnits createFNCYfrUnitsFromString(EDataType eDataType, String initialValue) {
		FNCYfrUnits result = FNCYfrUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCYfrUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNCFNNRGLen createFNCFNNRGLenFromString(EDataType eDataType, String initialValue) {
		FNCFNNRGLen result = FNCFNNRGLen.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNCFNNRGLenToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNDFtWtClass createFNDFtWtClassFromString(EDataType eDataType, String initialValue) {
		FNDFtWtClass result = FNDFtWtClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNDFtWtClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNDFtWdClass createFNDFtWdClassFromString(EDataType eDataType, String initialValue) {
		FNDFtWdClass result = FNDFtWdClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNDFtWdClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FNDFtDsFlags createFNDFtDsFlagsFromString(EDataType eDataType, String initialValue) {
		FNDFtDsFlags result = FNDFtDsFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFNDFtDsFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDDUNITBASE createIDDUNITBASEFromString(EDataType eDataType, String initialValue) {
		IDDUNITBASE result = IDDUNITBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDDUNITBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOBObjType createIOBObjTypeFromString(EDataType eDataType, String initialValue) {
		IOBObjType result = IOBObjType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOBObjTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOBXoaOrent createIOBXoaOrentFromString(EDataType eDataType, String initialValue) {
		IOBXoaOrent result = IOBXoaOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOBXoaOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOBYoaOrent createIOBYoaOrentFromString(EDataType eDataType, String initialValue) {
		IOBYoaOrent result = IOBYoaOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOBYoaOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOBRefCSys createIOBRefCSysFromString(EDataType eDataType, String initialValue) {
		IOBRefCSys result = IOBRefCSys.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOBRefCSysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPGIPgFlgs createIPGIPgFlgsFromString(EDataType eDataType, String initialValue) {
		IPGIPgFlgs result = IPGIPgFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPGIPgFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPOOvlyOrent createIPOOvlyOrentFromString(EDataType eDataType, String initialValue) {
		IPOOvlyOrent result = IPOOvlyOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIPOOvlyOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDDXmBase createMDDXmBaseFromString(EDataType eDataType, String initialValue) {
		MDDXmBase result = MDDXmBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDDXmBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDDYmBase createMDDYmBaseFromString(EDataType eDataType, String initialValue) {
		MDDYmBase result = MDDYmBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDDYmBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDDMDDFlgs createMDDMDDFlgsFromString(EDataType eDataType, String initialValue) {
		MDDMDDFlgs result = MDDMDDFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDDMDDFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFCMFCFlgs createMFCMFCFlgsFromString(EDataType eDataType, String initialValue) {
		MFCMFCFlgs result = MFCMFCFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMFCMFCFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFCMedColl createMFCMedCollFromString(EDataType eDataType, String initialValue) {
		MFCMedColl result = MFCMedColl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMFCMedCollToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFCMFCScpe createMFCMFCScpeFromString(EDataType eDataType, String initialValue) {
		MFCMFCScpe result = MFCMFCScpe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMFCMFCScpeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMCPARAMETER1 createMMCPARAMETER1FromString(EDataType eDataType, String initialValue) {
		MMCPARAMETER1 result = MMCPARAMETER1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMMCPARAMETER1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMORGLength createMMORGLengthFromString(EDataType eDataType, String initialValue) {
		MMORGLength result = MMORGLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMMORGLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPSRGLength createMPSRGLengthFromString(EDataType eDataType, String initialValue) {
		MPSRGLength result = MPSRGLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMPSRGLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBPRGLength createOBPRGLengthFromString(EDataType eDataType, String initialValue) {
		OBPRGLength result = OBPRGLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBPRGLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBPXoaOrent createOBPXoaOrentFromString(EDataType eDataType, String initialValue) {
		OBPXoaOrent result = OBPXoaOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBPXoaOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBPYoaOrent createOBPYoaOrentFromString(EDataType eDataType, String initialValue) {
		OBPYoaOrent result = OBPYoaOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBPYoaOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBPXocaOrent createOBPXocaOrentFromString(EDataType eDataType, String initialValue) {
		OBPXocaOrent result = OBPXocaOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBPXocaOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBPYocaOrent createOBPYocaOrentFromString(EDataType eDataType, String initialValue) {
		OBPYocaOrent result = OBPYocaOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBPYocaOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBPRefCSys createOBPRefCSysFromString(EDataType eDataType, String initialValue) {
		OBPRefCSys result = OBPRefCSys.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOBPRefCSysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PFCPFCFlgs createPFCPFCFlgsFromString(EDataType eDataType, String initialValue) {
		PFCPFCFlgs result = PFCPFCFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPFCPFCFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGDXpgBase createPGDXpgBaseFromString(EDataType eDataType, String initialValue) {
		PGDXpgBase result = PGDXpgBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGDXpgBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGDYpgBase createPGDYpgBaseFromString(EDataType eDataType, String initialValue) {
		PGDYpgBase result = PGDYpgBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGDYpgBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPConstant createPGPConstantFromString(EDataType eDataType, String initialValue) {
		PGPConstant result = PGPConstant.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGPConstantToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTDXPBASE createPTDXPBASEFromString(EDataType eDataType, String initialValue) {
		PTDXPBASE result = PTDXPBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPTDXPBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTDYPBASE createPTDYPBASEFromString(EDataType eDataType, String initialValue) {
		PTDYPBASE result = PTDYPBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPTDYPBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTD1XPBASE createPTD1XPBASEFromString(EDataType eDataType, String initialValue) {
		PTD1XPBASE result = PTD1XPBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPTD1XPBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTD1YPBASE createPTD1YPBASEFromString(EDataType eDataType, String initialValue) {
		PTD1YPBASE result = PTD1YPBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPTD1YPBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVSBYPSIDEN createOVSBYPSIDENFromString(EDataType eDataType, String initialValue) {
		OVSBYPSIDEN result = OVSBYPSIDEN.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOVSBYPSIDENToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SECCOLSPCE createSECCOLSPCEFromString(EDataType eDataType, String initialValue) {
		SECCOLSPCE result = SECCOLSPCE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSECCOLSPCEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIADIRCTION createSIADIRCTIONFromString(EDataType eDataType, String initialValue) {
		SIADIRCTION result = SIADIRCTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSIADIRCTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STCFRGCOLOR createSTCFRGCOLORFromString(EDataType eDataType, String initialValue) {
		STCFRGCOLOR result = STCFRGCOLOR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTCFRGCOLORToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STCPRECSION createSTCPRECSIONFromString(EDataType eDataType, String initialValue) {
		STCPRECSION result = STCPRECSION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTCPRECSIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STOIORNTION createSTOIORNTIONFromString(EDataType eDataType, String initialValue) {
		STOIORNTION result = STOIORNTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTOIORNTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STOBORNTION createSTOBORNTIONFromString(EDataType eDataType, String initialValue) {
		STOBORNTION result = STOBORNTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTOBORNTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBMDIRCTION createTBMDIRCTIONFromString(EDataType eDataType, String initialValue) {
		TBMDIRCTION result = TBMDIRCTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBMDIRCTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBMPRECSION createTBMPRECSIONFromString(EDataType eDataType, String initialValue) {
		TBMPRECSION result = TBMPRECSION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBMPRECSIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public USCBYPSIDEN createUSCBYPSIDENFromString(EDataType eDataType, String initialValue) {
		USCBYPSIDEN result = USCBYPSIDEN.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUSCBYPSIDENToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRCResourceManagementFmtQual createCRCResourceManagementFmtQualFromString(EDataType eDataType, String initialValue) {
		CRCResourceManagementFmtQual result = CRCResourceManagementFmtQual.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCRCResourceManagementFmtQualToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorSpecificationColSpce createColorSpecificationColSpceFromString(EDataType eDataType, String initialValue) {
		ColorSpecificationColSpce result = ColorSpecificationColSpce.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorSpecificationColSpceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectFontDescriptorFontTech createDataObjectFontDescriptorFontTechFromString(EDataType eDataType, String initialValue) {
		DataObjectFontDescriptorFontTech result = DataObjectFontDescriptorFontTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataObjectFontDescriptorFontTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectFontDescriptorCharRot createDataObjectFontDescriptorCharRotFromString(EDataType eDataType, String initialValue) {
		DataObjectFontDescriptorCharRot result = DataObjectFontDescriptorCharRot.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataObjectFontDescriptorCharRotToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectFontDescriptorEncEnv createDataObjectFontDescriptorEncEnvFromString(EDataType eDataType, String initialValue) {
		DataObjectFontDescriptorEncEnv result = DataObjectFontDescriptorEncEnv.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataObjectFontDescriptorEncEnvToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectFontDescriptorEncID createDataObjectFontDescriptorEncIDFromString(EDataType eDataType, String initialValue) {
		DataObjectFontDescriptorEncID result = DataObjectFontDescriptorEncID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataObjectFontDescriptorEncIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingSchemeIDESidCP createEncodingSchemeIDESidCPFromString(EDataType eDataType, String initialValue) {
		EncodingSchemeIDESidCP result = EncodingSchemeIDESidCP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingSchemeIDESidCPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncodingSchemeIDESidUD createEncodingSchemeIDESidUDFromString(EDataType eDataType, String initialValue) {
		EncodingSchemeIDESidUD result = EncodingSchemeIDESidUD.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingSchemeIDESidUDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontResolutionMetTech createFontResolutionMetTechFromString(EDataType eDataType, String initialValue) {
		FontResolutionMetTech result = FontResolutionMetTech.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontResolutionMetTechToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontResolutionRPuBase createFontResolutionRPuBaseFromString(EDataType eDataType, String initialValue) {
		FontResolutionRPuBase result = FontResolutionRPuBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontResolutionRPuBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontResolutionRPUnits createFontResolutionRPUnitsFromString(EDataType eDataType, String initialValue) {
		FontResolutionRPUnits result = FontResolutionRPUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontResolutionRPUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedNameFQNType createFullyQualifiedNameFQNTypeFromString(EDataType eDataType, String initialValue) {
		FullyQualifiedNameFQNType result = FullyQualifiedNameFQNType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullyQualifiedNameFQNTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullyQualifiedNameFQNFormat createFullyQualifiedNameFQNFormatFromString(EDataType eDataType, String initialValue) {
		FullyQualifiedNameFQNFormat result = FullyQualifiedNameFQNFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFullyQualifiedNameFQNFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateAndTimeStampStampType createLocalDateAndTimeStampStampTypeFromString(EDataType eDataType, String initialValue) {
		LocalDateAndTimeStampStampType result = LocalDateAndTimeStampStampType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalDateAndTimeStampStampTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingOptionMapValue createMappingOptionMapValueFromString(EDataType eDataType, String initialValue) {
		MappingOptionMapValue result = MappingOptionMapValue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingOptionMapValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaEjectControlReserved createMediaEjectControlReservedFromString(EDataType eDataType, String initialValue) {
		MediaEjectControlReserved result = MediaEjectControlReserved.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaEjectControlReservedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaEjectControlEjCtrl createMediaEjectControlEjCtrlFromString(EDataType eDataType, String initialValue) {
		MediaEjectControlEjCtrl result = MediaEjectControlEjCtrl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaEjectControlEjCtrlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediumOrientationMedOrient createMediumOrientationMedOrientFromString(EDataType eDataType, String initialValue) {
		MediumOrientationMedOrient result = MediumOrientationMedOrient.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediumOrientationMedOrientToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnitsXoaBase createMeasurementUnitsXoaBaseFromString(EDataType eDataType, String initialValue) {
		MeasurementUnitsXoaBase result = MeasurementUnitsXoaBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementUnitsXoaBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnitsYoaBase createMeasurementUnitsYoaBaseFromString(EDataType eDataType, String initialValue) {
		MeasurementUnitsYoaBase result = MeasurementUnitsYoaBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementUnitsYoaBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODCAInterchangeSetIStype createMODCAInterchangeSetIStypeFromString(EDataType eDataType, String initialValue) {
		MODCAInterchangeSetIStype result = MODCAInterchangeSetIStype.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMODCAInterchangeSetIStypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODCAInterchangeSetISid createMODCAInterchangeSetISidFromString(EDataType eDataType, String initialValue) {
		MODCAInterchangeSetISid result = MODCAInterchangeSetISid.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMODCAInterchangeSetISidToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectAreaSizeSizeType createObjectAreaSizeSizeTypeFromString(EDataType eDataType, String initialValue) {
		ObjectAreaSizeSizeType result = ObjectAreaSizeSizeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectAreaSizeSizeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassificationObjClass createObjectClassificationObjClassFromString(EDataType eDataType, String initialValue) {
		ObjectClassificationObjClass result = ObjectClassificationObjClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectClassificationObjClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassificationStrucFlgs createObjectClassificationStrucFlgsFromString(EDataType eDataType, String initialValue) {
		ObjectClassificationStrucFlgs result = ObjectClassificationStrucFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectClassificationStrucFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFunctionSetSpecificationObjType createObjectFunctionSetSpecificationObjTypeFromString(EDataType eDataType, String initialValue) {
		ObjectFunctionSetSpecificationObjType result = ObjectFunctionSetSpecificationObjType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectFunctionSetSpecificationObjTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFunctionSetSpecificationArchVrsn createObjectFunctionSetSpecificationArchVrsnFromString(EDataType eDataType, String initialValue) {
		ObjectFunctionSetSpecificationArchVrsn result = ObjectFunctionSetSpecificationArchVrsn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectFunctionSetSpecificationArchVrsnToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFunctionSetSpecificationDCAFnSet createObjectFunctionSetSpecificationDCAFnSetFromString(EDataType eDataType, String initialValue) {
		ObjectFunctionSetSpecificationDCAFnSet result = ObjectFunctionSetSpecificationDCAFnSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectFunctionSetSpecificationDCAFnSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectFunctionSetSpecificationOCAFnSet createObjectFunctionSetSpecificationOCAFnSetFromString(EDataType eDataType, String initialValue) {
		ObjectFunctionSetSpecificationOCAFnSet result = ObjectFunctionSetSpecificationOCAFnSet.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectFunctionSetSpecificationOCAFnSetToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOffsetObjTpe createObjectOffsetObjTpeFromString(EDataType eDataType, String initialValue) {
		ObjectOffsetObjTpe result = ObjectOffsetObjTpe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectOffsetObjTpeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceObjectTypeObjType createResourceObjectTypeObjTypeFromString(EDataType eDataType, String initialValue) {
		ResourceObjectTypeObjType result = ResourceObjectTypeObjType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceObjectTypeObjTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PresentationControlPRSFlg createPresentationControlPRSFlgFromString(EDataType eDataType, String initialValue) {
		PresentationControlPRSFlg result = PresentationControlPRSFlg.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPresentationControlPRSFlgToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocalIdentifierResType createResourceLocalIdentifierResTypeFromString(EDataType eDataType, String initialValue) {
		ResourceLocalIdentifierResType result = ResourceLocalIdentifierResType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceLocalIdentifierResTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrientationIAxis createTextOrientationIAxisFromString(EDataType eDataType, String initialValue) {
		TextOrientationIAxis result = TextOrientationIAxis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextOrientationIAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextOrientationBAxis createTextOrientationBAxisFromString(EDataType eDataType, String initialValue) {
		TextOrientationBAxis result = TextOrientationBAxis.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextOrientationBAxisToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDescriptorSpecificationFtWtClass createFontDescriptorSpecificationFtWtClassFromString(EDataType eDataType, String initialValue) {
		FontDescriptorSpecificationFtWtClass result = FontDescriptorSpecificationFtWtClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontDescriptorSpecificationFtWtClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDescriptorSpecificationFtWdClass createFontDescriptorSpecificationFtWdClassFromString(EDataType eDataType, String initialValue) {
		FontDescriptorSpecificationFtWdClass result = FontDescriptorSpecificationFtWdClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontDescriptorSpecificationFtWdClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDescriptorSpecificationFtDsFlags createFontDescriptorSpecificationFtDsFlagsFromString(EDataType eDataType, String initialValue) {
		FontDescriptorSpecificationFtDsFlags result = FontDescriptorSpecificationFtDsFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontDescriptorSpecificationFtDsFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontDescriptorSpecificationFtUsFlags createFontDescriptorSpecificationFtUsFlagsFromString(EDataType eDataType, String initialValue) {
		FontDescriptorSpecificationFtUsFlags result = FontDescriptorSpecificationFtUsFlags.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontDescriptorSpecificationFtUsFlagsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageEncodingCOMPRID createImageEncodingCOMPRIDFromString(EDataType eDataType, String initialValue) {
		ImageEncodingCOMPRID result = ImageEncodingCOMPRID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageEncodingCOMPRIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageEncodingRECID createImageEncodingRECIDFromString(EDataType eDataType, String initialValue) {
		ImageEncodingRECID result = ImageEncodingRECID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageEncodingRECIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageEncodingBITORDR createImageEncodingBITORDRFromString(EDataType eDataType, String initialValue) {
		ImageEncodingBITORDR result = ImageEncodingBITORDR.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageEncodingBITORDRToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDEStructureFLAGS createIDEStructureFLAGSFromString(EDataType eDataType, String initialValue) {
		IDEStructureFLAGS result = IDEStructureFLAGS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDEStructureFLAGSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmALGTYPE createExternalAlgorithmALGTYPEFromString(EDataType eDataType, String initialValue) {
		ExternalAlgorithmALGTYPE result = ExternalAlgorithmALGTYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalAlgorithmALGTYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TileSetColorCSPACE createTileSetColorCSPACEFromString(EDataType eDataType, String initialValue) {
		TileSetColorCSPACE result = TileSetColorCSPACE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTileSetColorCSPACEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPORGObjType createPPORGObjTypeFromString(EDataType eDataType, String initialValue) {
		PPORGObjType result = PPORGObjType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPPORGObjTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PPORGProcFlgs createPPORGProcFlgsFromString(EDataType eDataType, String initialValue) {
		PPORGProcFlgs result = PPORGProcFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPPORGProcFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPRGRGLength createPGPRGRGLengthFromString(EDataType eDataType, String initialValue) {
		PGPRGRGLength result = PGPRGRGLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGPRGRGLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPRGPGorient createPGPRGPGorientFromString(EDataType eDataType, String initialValue) {
		PGPRGPGorient result = PGPRGPGorient.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGPRGPGorientToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPRGSHside createPGPRGSHsideFromString(EDataType eDataType, String initialValue) {
		PGPRGSHside result = PGPRGSHside.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGPRGSHsideToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PGPRGPgFlgs createPGPRGPgFlgsFromString(EDataType eDataType, String initialValue) {
		PGPRGPgFlgs result = PGPRGPgFlgs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPGPRGPgFlgsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMCRGkey createMMCRGkeyFromString(EDataType eDataType, String initialValue) {
		MMCRGkey result = MMCRGkey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMMCRGkeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmRGPADBDRY createExternalAlgorithmRGPADBDRYFromString(EDataType eDataType, String initialValue) {
		ExternalAlgorithmRGPADBDRY result = ExternalAlgorithmRGPADBDRY.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalAlgorithmRGPADBDRYToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalAlgorithmRGPADALMT createExternalAlgorithmRGPADALMTFromString(EDataType eDataType, String initialValue) {
		ExternalAlgorithmRGPADALMT result = ExternalAlgorithmRGPADALMT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalAlgorithmRGPADALMTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginSegmentCommandLENGTH createBeginSegmentCommandLENGTHFromString(EDataType eDataType, String initialValue) {
		BeginSegmentCommandLENGTH result = BeginSegmentCommandLENGTH.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeginSegmentCommandLENGTHToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginSegmentCommandFLAG2 createBeginSegmentCommandFLAG2FromString(EDataType eDataType, String initialValue) {
		BeginSegmentCommandFLAG2 result = BeginSegmentCommandFLAG2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBeginSegmentCommandFLAG2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBARFLAGS createGBARFLAGSFromString(EDataType eDataType, String initialValue) {
		GBARFLAGS result = GBARFLAGS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGBARFLAGSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBIMGFORMAT createGBIMGFORMATFromString(EDataType eDataType, String initialValue) {
		GBIMGFORMAT result = GBIMGFORMAT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGBIMGFORMATToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBIMGRES createGBIMGRESFromString(EDataType eDataType, String initialValue) {
		GBIMGRES result = GBIMGRES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGBIMGRESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBIMGFORMAT createGCBIMGFORMATFromString(EDataType eDataType, String initialValue) {
		GCBIMGFORMAT result = GCBIMGFORMAT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGCBIMGFORMATToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBIMGRES createGCBIMGRESFromString(EDataType eDataType, String initialValue) {
		GCBIMGRES result = GCBIMGRES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGCBIMGRESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBOXRES createGBOXRESFromString(EDataType eDataType, String initialValue) {
		GBOXRES result = GBOXRES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGBOXRESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GCBOXRES createGCBOXRESFromString(EDataType eDataType, String initialValue) {
		GCBOXRES result = GCBOXRES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGCBOXRESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEPROLRES createGEPROLRESFromString(EDataType eDataType, String initialValue) {
		GEPROLRES result = GEPROLRES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGEPROLRESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSBMXMODE createGSBMXMODEFromString(EDataType eDataType, String initialValue) {
		GSBMXMODE result = GSBMXMODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSBMXMODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCDDIRECTION createGSCDDIRECTIONFromString(EDataType eDataType, String initialValue) {
		GSCDDIRECTION result = GSCDDIRECTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSCDDIRECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCRPREC createGSCRPRECFromString(EDataType eDataType, String initialValue) {
		GSCRPREC result = GSCRPREC.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSCRPRECToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSCOLCOL createGSCOLCOLFromString(EDataType eDataType, String initialValue) {
		GSCOLCOL result = GSCOLCOL.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSCOLCOLToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLTLINETYPE createGSLTLINETYPEFromString(EDataType eDataType, String initialValue) {
		GSLTLINETYPE result = GSLTLINETYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSLTLINETYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMPPREC createGSMPPRECFromString(EDataType eDataType, String initialValue) {
		GSMPPREC result = GSMPPREC.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSMPPRECToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMTMCPT createGSMTMCPTFromString(EDataType eDataType, String initialValue) {
		GSMTMCPT result = GSMTMCPT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSMTMCPTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSMXMODE createGSMXMODEFromString(EDataType eDataType, String initialValue) {
		GSMXMODE result = GSMXMODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSMXMODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSPSLCID createGSPSLCIDFromString(EDataType eDataType, String initialValue) {
		GSPSLCID result = GSPSLCID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSPSLCIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSPTPATT createGSPTPATTFromString(EDataType eDataType, String initialValue) {
		GSPTPATT result = GSPTPATT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSPTPATTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSPCOLCOLSPCE createGSPCOLCOLSPCEFromString(EDataType eDataType, String initialValue) {
		GSPCOLCOLSPCE result = GSPCOLCOLSPCE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSPCOLCOLSPCEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLELINEEND createGSLELINEENDFromString(EDataType eDataType, String initialValue) {
		GSLELINEEND result = GSLELINEEND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSLELINEENDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSLJLINEJOIN createGSLJLINEJOINFromString(EDataType eDataType, String initialValue) {
		GSLJLINEJOIN result = GSLJLINEJOIN.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGSLJLINEJOINToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSpecificationFLAGS createWindowSpecificationFLAGSFromString(EDataType eDataType, String initialValue) {
		WindowSpecificationFLAGS result = WindowSpecificationFLAGS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowSpecificationFLAGSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSpecificationRES3 createWindowSpecificationRES3FromString(EDataType eDataType, String initialValue) {
		WindowSpecificationRES3 result = WindowSpecificationRES3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowSpecificationRES3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSpecificationCFORMAT createWindowSpecificationCFORMATFromString(EDataType eDataType, String initialValue) {
		WindowSpecificationCFORMAT result = WindowSpecificationCFORMAT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowSpecificationCFORMATToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowSpecificationUBASE createWindowSpecificationUBASEFromString(EDataType eDataType, String initialValue) {
		WindowSpecificationUBASE result = WindowSpecificationUBASE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindowSpecificationUBASEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TonerSaverTSvCtrl createTonerSaverTSvCtrlFromString(EDataType eDataType, String initialValue) {
		TonerSaverTSvCtrl result = TonerSaverTSvCtrl.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTonerSaverTSvCtrlToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorFidelityStpCoEx createColorFidelityStpCoExFromString(EDataType eDataType, String initialValue) {
		ColorFidelityStpCoEx result = ColorFidelityStpCoEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorFidelityStpCoExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorFidelityRepCoEx createColorFidelityRepCoExFromString(EDataType eDataType, String initialValue) {
		ColorFidelityRepCoEx result = ColorFidelityRepCoEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorFidelityRepCoExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorFidelityColSub createColorFidelityColSubFromString(EDataType eDataType, String initialValue) {
		ColorFidelityColSub result = ColorFidelityColSub.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorFidelityColSubToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontFidelityStpFntEx createFontFidelityStpFntExFromString(EDataType eDataType, String initialValue) {
		FontFidelityStpFntEx result = FontFidelityStpFntEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontFidelityStpFntExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFidelityStpTxtEx createTextFidelityStpTxtExFromString(EDataType eDataType, String initialValue) {
		TextFidelityStpTxtEx result = TextFidelityStpTxtEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextFidelityStpTxtExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFidelityRepTxtEx createTextFidelityRepTxtExFromString(EDataType eDataType, String initialValue) {
		TextFidelityRepTxtEx result = TextFidelityRepTxtEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextFidelityRepTxtExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaFidelityStpMedEx createMediaFidelityStpMedExFromString(EDataType eDataType, String initialValue) {
		MediaFidelityStpMedEx result = MediaFidelityStpMedEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaFidelityStpMedExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishingFidelityStpFinEx createFinishingFidelityStpFinExFromString(EDataType eDataType, String initialValue) {
		FinishingFidelityStpFinEx result = FinishingFidelityStpFinEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinishingFidelityStpFinExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishingFidelityRepFinEx createFinishingFidelityRepFinExFromString(EDataType eDataType, String initialValue) {
		FinishingFidelityRepFinEx result = FinishingFidelityRepFinEx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinishingFidelityRepFinExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMRFidelityStpCMREx createCMRFidelityStpCMRExFromString(EDataType eDataType, String initialValue) {
		CMRFidelityStpCMREx result = CMRFidelityStpCMREx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMRFidelityStpCMRExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMRFidelityRepCMREx createCMRFidelityRepCMRExFromString(EDataType eDataType, String initialValue) {
		CMRFidelityRepCMREx result = CMRFidelityRepCMREx.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMRFidelityRepCMRExToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectCountSubObj createObjectCountSubObjFromString(EDataType eDataType, String initialValue) {
		ObjectCountSubObj result = ObjectCountSubObj.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectCountSubObjToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectOriginIdentifierSystem createObjectOriginIdentifierSystemFromString(EDataType eDataType, String initialValue) {
		ObjectOriginIdentifierSystem result = ObjectOriginIdentifierSystem.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectOriginIdentifierSystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineDataObjectPositionMigrationTempOrient createLineDataObjectPositionMigrationTempOrientFromString(EDataType eDataType, String initialValue) {
		LineDataObjectPositionMigrationTempOrient result = LineDataObjectPositionMigrationTempOrient.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineDataObjectPositionMigrationTempOrientToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorManagementResourceDescriptorProcMode createColorManagementResourceDescriptorProcModeFromString(EDataType eDataType, String initialValue) {
		ColorManagementResourceDescriptorProcMode result = ColorManagementResourceDescriptorProcMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorManagementResourceDescriptorProcModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorManagementResourceDescriptorCMRScpe createColorManagementResourceDescriptorCMRScpeFromString(EDataType eDataType, String initialValue) {
		ColorManagementResourceDescriptorCMRScpe result = ColorManagementResourceDescriptorCMRScpe.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorManagementResourceDescriptorCMRScpeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageResolutionXBase createImageResolutionXBaseFromString(EDataType eDataType, String initialValue) {
		ImageResolutionXBase result = ImageResolutionXBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageResolutionXBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageResolutionYBase createImageResolutionYBaseFromString(EDataType eDataType, String initialValue) {
		ImageResolutionYBase result = ImageResolutionYBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageResolutionYBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectContainerPresentationSpaceSizePDFSize createObjectContainerPresentationSpaceSizePDFSizeFromString(EDataType eDataType, String initialValue) {
		ObjectContainerPresentationSpaceSizePDFSize result = ObjectContainerPresentationSpaceSizePDFSize.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectContainerPresentationSpaceSizePDFSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedResourceLocalIdentifierResType createExtendedResourceLocalIdentifierResTypeFromString(EDataType eDataType, String initialValue) {
		ExtendedResourceLocalIdentifierResType result = ExtendedResourceLocalIdentifierResType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExtendedResourceLocalIdentifierResTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricAdjustmentUnitBase createMetricAdjustmentUnitBaseFromString(EDataType eDataType, String initialValue) {
		MetricAdjustmentUnitBase result = MetricAdjustmentUnitBase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricAdjustmentUnitBaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntentReserved createRenderingIntentReservedFromString(EDataType eDataType, String initialValue) {
		RenderingIntentReserved result = RenderingIntentReserved.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderingIntentReservedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntentIOCARI createRenderingIntentIOCARIFromString(EDataType eDataType, String initialValue) {
		RenderingIntentIOCARI result = RenderingIntentIOCARI.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderingIntentIOCARIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntentOCRI createRenderingIntentOCRIFromString(EDataType eDataType, String initialValue) {
		RenderingIntentOCRI result = RenderingIntentOCRI.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderingIntentOCRIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntentPTOCRI createRenderingIntentPTOCRIFromString(EDataType eDataType, String initialValue) {
		RenderingIntentPTOCRI result = RenderingIntentPTOCRI.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderingIntentPTOCRIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntentGOCARI createRenderingIntentGOCARIFromString(EDataType eDataType, String initialValue) {
		RenderingIntentGOCARI result = RenderingIntentGOCARI.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderingIntentGOCARIToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenderingIntentReserved2 createRenderingIntentReserved2FromString(EDataType eDataType, String initialValue) {
		RenderingIntentReserved2 result = RenderingIntentReserved2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRenderingIntentReserved2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishingOperationFOpType createFinishingOperationFOpTypeFromString(EDataType eDataType, String initialValue) {
		FinishingOperationFOpType result = FinishingOperationFOpType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinishingOperationFOpTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishingOperationRefEdge createFinishingOperationRefEdgeFromString(EDataType eDataType, String initialValue) {
		FinishingOperationRefEdge result = FinishingOperationRefEdge.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinishingOperationRefEdgeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAppearanceDevApp createDeviceAppearanceDevAppFromString(EDataType eDataType, String initialValue) {
		DeviceAppearanceDevApp result = DeviceAppearanceDevApp.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceAppearanceDevAppToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceObjectIncludeObjType createResourceObjectIncludeObjTypeFromString(EDataType eDataType, String initialValue) {
		ResourceObjectIncludeObjType result = ResourceObjectIncludeObjType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceObjectIncludeObjTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceObjectIncludeObOrent createResourceObjectIncludeObOrentFromString(EDataType eDataType, String initialValue) {
		ResourceObjectIncludeObOrent result = ResourceObjectIncludeObOrent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceObjectIncludeObOrentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageOverlayConditionalProcessingPgOvType createPageOverlayConditionalProcessingPgOvTypeFromString(EDataType eDataType, String initialValue) {
		PageOverlayConditionalProcessingPgOvType result = PageOverlayConditionalProcessingPgOvType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPageOverlayConditionalProcessingPgOvTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceUsageAttributeFrequency createResourceUsageAttributeFrequencyFromString(EDataType eDataType, String initialValue) {
		ResourceUsageAttributeFrequency result = ResourceUsageAttributeFrequency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceUsageAttributeFrequencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFName createSFNameFromString(EDataType eDataType, String initialValue) {
		SFName result = SFName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSFNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfplibPackage getAfplibPackage() {
		return (AfplibPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AfplibPackage getPackage() {
		return AfplibPackage.eINSTANCE;
	}

} //AfplibFactoryImpl
