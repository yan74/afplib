/**
 */
package org.afplib.afplib.util;

import org.afplib.afplib.*;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage
 * @generated
 */
public class AfplibAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AfplibPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfplibAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AfplibPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AfplibSwitch<Adapter> modelSwitch =
		new AfplibSwitch<Adapter>() {
			@Override
			public Adapter caseLineData(LineData object) {
				return createLineDataAdapter();
			}
			@Override
			public Adapter caseBAG(BAG object) {
				return createBAGAdapter();
			}
			@Override
			public Adapter caseBBC(BBC object) {
				return createBBCAdapter();
			}
			@Override
			public Adapter caseBCA(BCA object) {
				return createBCAAdapter();
			}
			@Override
			public Adapter caseBCF(BCF object) {
				return createBCFAdapter();
			}
			@Override
			public Adapter caseBCP(BCP object) {
				return createBCPAdapter();
			}
			@Override
			public Adapter caseBDA(BDA object) {
				return createBDAAdapter();
			}
			@Override
			public Adapter caseBDD(BDD object) {
				return createBDDAdapter();
			}
			@Override
			public Adapter caseBDG(BDG object) {
				return createBDGAdapter();
			}
			@Override
			public Adapter caseBDI(BDI object) {
				return createBDIAdapter();
			}
			@Override
			public Adapter caseBDM(BDM object) {
				return createBDMAdapter();
			}
			@Override
			public Adapter caseBDT(BDT object) {
				return createBDTAdapter();
			}
			@Override
			public Adapter caseBDX(BDX object) {
				return createBDXAdapter();
			}
			@Override
			public Adapter caseBFG(BFG object) {
				return createBFGAdapter();
			}
			@Override
			public Adapter caseBFM(BFM object) {
				return createBFMAdapter();
			}
			@Override
			public Adapter caseBFN(BFN object) {
				return createBFNAdapter();
			}
			@Override
			public Adapter caseBGR(BGR object) {
				return createBGRAdapter();
			}
			@Override
			public Adapter caseBII(BII object) {
				return createBIIAdapter();
			}
			@Override
			public Adapter caseBIM(BIM object) {
				return createBIMAdapter();
			}
			@Override
			public Adapter caseBMM(BMM object) {
				return createBMMAdapter();
			}
			@Override
			public Adapter caseBMO(BMO object) {
				return createBMOAdapter();
			}
			@Override
			public Adapter caseBNG(BNG object) {
				return createBNGAdapter();
			}
			@Override
			public Adapter caseBOC(BOC object) {
				return createBOCAdapter();
			}
			@Override
			public Adapter caseBOG(BOG object) {
				return createBOGAdapter();
			}
			@Override
			public Adapter caseBPF(BPF object) {
				return createBPFAdapter();
			}
			@Override
			public Adapter caseBPG(BPG object) {
				return createBPGAdapter();
			}
			@Override
			public Adapter caseBPM(BPM object) {
				return createBPMAdapter();
			}
			@Override
			public Adapter caseBPS(BPS object) {
				return createBPSAdapter();
			}
			@Override
			public Adapter caseBPT(BPT object) {
				return createBPTAdapter();
			}
			@Override
			public Adapter caseBRG(BRG object) {
				return createBRGAdapter();
			}
			@Override
			public Adapter caseBRS(BRS object) {
				return createBRSAdapter();
			}
			@Override
			public Adapter caseBSG(BSG object) {
				return createBSGAdapter();
			}
			@Override
			public Adapter caseCAT(CAT object) {
				return createCATAdapter();
			}
			@Override
			public Adapter caseCDD(CDD object) {
				return createCDDAdapter();
			}
			@Override
			public Adapter caseCFC(CFC object) {
				return createCFCAdapter();
			}
			@Override
			public Adapter caseCFI(CFI object) {
				return createCFIAdapter();
			}
			@Override
			public Adapter caseCPC(CPC object) {
				return createCPCAdapter();
			}
			@Override
			public Adapter caseCPD(CPD object) {
				return createCPDAdapter();
			}
			@Override
			public Adapter caseCPI(CPI object) {
				return createCPIAdapter();
			}
			@Override
			public Adapter caseCTC(CTC object) {
				return createCTCAdapter();
			}
			@Override
			public Adapter caseDXD(DXD object) {
				return createDXDAdapter();
			}
			@Override
			public Adapter caseEAG(EAG object) {
				return createEAGAdapter();
			}
			@Override
			public Adapter caseEBC(EBC object) {
				return createEBCAdapter();
			}
			@Override
			public Adapter caseECA(ECA object) {
				return createECAAdapter();
			}
			@Override
			public Adapter caseECF(ECF object) {
				return createECFAdapter();
			}
			@Override
			public Adapter caseECP(ECP object) {
				return createECPAdapter();
			}
			@Override
			public Adapter caseEDG(EDG object) {
				return createEDGAdapter();
			}
			@Override
			public Adapter caseEDI(EDI object) {
				return createEDIAdapter();
			}
			@Override
			public Adapter caseEDM(EDM object) {
				return createEDMAdapter();
			}
			@Override
			public Adapter caseEDT(EDT object) {
				return createEDTAdapter();
			}
			@Override
			public Adapter caseEDX(EDX object) {
				return createEDXAdapter();
			}
			@Override
			public Adapter caseEFG(EFG object) {
				return createEFGAdapter();
			}
			@Override
			public Adapter caseEFM(EFM object) {
				return createEFMAdapter();
			}
			@Override
			public Adapter caseEFN(EFN object) {
				return createEFNAdapter();
			}
			@Override
			public Adapter caseEGR(EGR object) {
				return createEGRAdapter();
			}
			@Override
			public Adapter caseEII(EII object) {
				return createEIIAdapter();
			}
			@Override
			public Adapter caseEIM(EIM object) {
				return createEIMAdapter();
			}
			@Override
			public Adapter caseEMM(EMM object) {
				return createEMMAdapter();
			}
			@Override
			public Adapter caseEMO(EMO object) {
				return createEMOAdapter();
			}
			@Override
			public Adapter caseENG(ENG object) {
				return createENGAdapter();
			}
			@Override
			public Adapter caseEOC(EOC object) {
				return createEOCAdapter();
			}
			@Override
			public Adapter caseEOG(EOG object) {
				return createEOGAdapter();
			}
			@Override
			public Adapter caseEPF(EPF object) {
				return createEPFAdapter();
			}
			@Override
			public Adapter caseEPG(EPG object) {
				return createEPGAdapter();
			}
			@Override
			public Adapter caseEPM(EPM object) {
				return createEPMAdapter();
			}
			@Override
			public Adapter caseEPS(EPS object) {
				return createEPSAdapter();
			}
			@Override
			public Adapter caseEPT(EPT object) {
				return createEPTAdapter();
			}
			@Override
			public Adapter caseERG(ERG object) {
				return createERGAdapter();
			}
			@Override
			public Adapter caseERS(ERS object) {
				return createERSAdapter();
			}
			@Override
			public Adapter caseESG(ESG object) {
				return createESGAdapter();
			}
			@Override
			public Adapter caseFNC(FNC object) {
				return createFNCAdapter();
			}
			@Override
			public Adapter caseFND(FND object) {
				return createFNDAdapter();
			}
			@Override
			public Adapter caseFNG(FNG object) {
				return createFNGAdapter();
			}
			@Override
			public Adapter caseFNI(FNI object) {
				return createFNIAdapter();
			}
			@Override
			public Adapter caseFNN(FNN object) {
				return createFNNAdapter();
			}
			@Override
			public Adapter caseFNM(FNM object) {
				return createFNMAdapter();
			}
			@Override
			public Adapter caseFNO(FNO object) {
				return createFNOAdapter();
			}
			@Override
			public Adapter caseFNP(FNP object) {
				return createFNPAdapter();
			}
			@Override
			public Adapter caseGAD(GAD object) {
				return createGADAdapter();
			}
			@Override
			public Adapter caseGDD(GDD object) {
				return createGDDAdapter();
			}
			@Override
			public Adapter caseICP(ICP object) {
				return createICPAdapter();
			}
			@Override
			public Adapter caseIDD(IDD object) {
				return createIDDAdapter();
			}
			@Override
			public Adapter caseIEL(IEL object) {
				return createIELAdapter();
			}
			@Override
			public Adapter caseIID(IID object) {
				return createIIDAdapter();
			}
			@Override
			public Adapter caseIMM(IMM object) {
				return createIMMAdapter();
			}
			@Override
			public Adapter caseIOB(IOB object) {
				return createIOBAdapter();
			}
			@Override
			public Adapter caseIOC(IOC object) {
				return createIOCAdapter();
			}
			@Override
			public Adapter caseIPD(IPD object) {
				return createIPDAdapter();
			}
			@Override
			public Adapter caseIPG(IPG object) {
				return createIPGAdapter();
			}
			@Override
			public Adapter caseIPO(IPO object) {
				return createIPOAdapter();
			}
			@Override
			public Adapter caseIPS(IPS object) {
				return createIPSAdapter();
			}
			@Override
			public Adapter caseIRD(IRD object) {
				return createIRDAdapter();
			}
			@Override
			public Adapter caseLLE(LLE object) {
				return createLLEAdapter();
			}
			@Override
			public Adapter caseLNC(LNC object) {
				return createLNCAdapter();
			}
			@Override
			public Adapter caseLND(LND object) {
				return createLNDAdapter();
			}
			@Override
			public Adapter caseMBC(MBC object) {
				return createMBCAdapter();
			}
			@Override
			public Adapter caseMCA(MCA object) {
				return createMCAAdapter();
			}
			@Override
			public Adapter caseMCC(MCC object) {
				return createMCCAdapter();
			}
			@Override
			public Adapter caseMCD(MCD object) {
				return createMCDAdapter();
			}
			@Override
			public Adapter caseMCF(MCF object) {
				return createMCFAdapter();
			}
			@Override
			public Adapter caseMCF1(MCF1 object) {
				return createMCF1Adapter();
			}
			@Override
			public Adapter caseMDD(MDD object) {
				return createMDDAdapter();
			}
			@Override
			public Adapter caseMDR(MDR object) {
				return createMDRAdapter();
			}
			@Override
			public Adapter caseMFC(MFC object) {
				return createMFCAdapter();
			}
			@Override
			public Adapter caseMGO(MGO object) {
				return createMGOAdapter();
			}
			@Override
			public Adapter caseMIO(MIO object) {
				return createMIOAdapter();
			}
			@Override
			public Adapter caseMMC(MMC object) {
				return createMMCAdapter();
			}
			@Override
			public Adapter caseMMD(MMD object) {
				return createMMDAdapter();
			}
			@Override
			public Adapter caseMMO(MMO object) {
				return createMMOAdapter();
			}
			@Override
			public Adapter caseMMT(MMT object) {
				return createMMTAdapter();
			}
			@Override
			public Adapter caseMPG(MPG object) {
				return createMPGAdapter();
			}
			@Override
			public Adapter caseMPO(MPO object) {
				return createMPOAdapter();
			}
			@Override
			public Adapter caseMPS(MPS object) {
				return createMPSAdapter();
			}
			@Override
			public Adapter caseMSU(MSU object) {
				return createMSUAdapter();
			}
			@Override
			public Adapter caseNOP(NOP object) {
				return createNOPAdapter();
			}
			@Override
			public Adapter caseOBD(OBD object) {
				return createOBDAdapter();
			}
			@Override
			public Adapter caseOBP(OBP object) {
				return createOBPAdapter();
			}
			@Override
			public Adapter caseOCD(OCD object) {
				return createOCDAdapter();
			}
			@Override
			public Adapter casePEC(PEC object) {
				return createPECAdapter();
			}
			@Override
			public Adapter casePFC(PFC object) {
				return createPFCAdapter();
			}
			@Override
			public Adapter casePGD(PGD object) {
				return createPGDAdapter();
			}
			@Override
			public Adapter casePGP(PGP object) {
				return createPGPAdapter();
			}
			@Override
			public Adapter casePGP1(PGP1 object) {
				return createPGP1Adapter();
			}
			@Override
			public Adapter casePMC(PMC object) {
				return createPMCAdapter();
			}
			@Override
			public Adapter casePPO(PPO object) {
				return createPPOAdapter();
			}
			@Override
			public Adapter casePTD(PTD object) {
				return createPTDAdapter();
			}
			@Override
			public Adapter casePTD1(PTD1 object) {
				return createPTD1Adapter();
			}
			@Override
			public Adapter casePTX(PTX object) {
				return createPTXAdapter();
			}
			@Override
			public Adapter caseTLE(TLE object) {
				return createTLEAdapter();
			}
			@Override
			public Adapter caseFGD(FGD object) {
				return createFGDAdapter();
			}
			@Override
			public Adapter caseAMB(AMB object) {
				return createAMBAdapter();
			}
			@Override
			public Adapter caseAMI(AMI object) {
				return createAMIAdapter();
			}
			@Override
			public Adapter caseBLN(BLN object) {
				return createBLNAdapter();
			}
			@Override
			public Adapter caseBSU(BSU object) {
				return createBSUAdapter();
			}
			@Override
			public Adapter caseDBR(DBR object) {
				return createDBRAdapter();
			}
			@Override
			public Adapter caseDIR(DIR object) {
				return createDIRAdapter();
			}
			@Override
			public Adapter caseESU(ESU object) {
				return createESUAdapter();
			}
			@Override
			public Adapter caseNOPCS(NOPCS object) {
				return createNOPCSAdapter();
			}
			@Override
			public Adapter caseOVS(OVS object) {
				return createOVSAdapter();
			}
			@Override
			public Adapter caseRMB(RMB object) {
				return createRMBAdapter();
			}
			@Override
			public Adapter caseRMI(RMI object) {
				return createRMIAdapter();
			}
			@Override
			public Adapter caseRPS(RPS object) {
				return createRPSAdapter();
			}
			@Override
			public Adapter caseSBI(SBI object) {
				return createSBIAdapter();
			}
			@Override
			public Adapter caseSCFL(SCFL object) {
				return createSCFLAdapter();
			}
			@Override
			public Adapter caseSEC(SEC object) {
				return createSECAdapter();
			}
			@Override
			public Adapter caseSIA(SIA object) {
				return createSIAAdapter();
			}
			@Override
			public Adapter caseSIM(SIM object) {
				return createSIMAdapter();
			}
			@Override
			public Adapter caseSTC(STC object) {
				return createSTCAdapter();
			}
			@Override
			public Adapter caseSTO(STO object) {
				return createSTOAdapter();
			}
			@Override
			public Adapter caseSVI(SVI object) {
				return createSVIAdapter();
			}
			@Override
			public Adapter caseTBM(TBM object) {
				return createTBMAdapter();
			}
			@Override
			public Adapter caseTRN(TRN object) {
				return createTRNAdapter();
			}
			@Override
			public Adapter caseUSC(USC object) {
				return createUSCAdapter();
			}
			@Override
			public Adapter caseAttributeQualifier(AttributeQualifier object) {
				return createAttributeQualifierAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseCGCSGID(CGCSGID object) {
				return createCGCSGIDAdapter();
			}
			@Override
			public Adapter caseCRCResourceManagement(CRCResourceManagement object) {
				return createCRCResourceManagementAdapter();
			}
			@Override
			public Adapter caseCharacterRotation(CharacterRotation object) {
				return createCharacterRotationAdapter();
			}
			@Override
			public Adapter caseColorSpecification(ColorSpecification object) {
				return createColorSpecificationAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseDataObjectFontDescriptor(DataObjectFontDescriptor object) {
				return createDataObjectFontDescriptorAdapter();
			}
			@Override
			public Adapter caseDescriptorPosition(DescriptorPosition object) {
				return createDescriptorPositionAdapter();
			}
			@Override
			public Adapter caseEncodingSchemeID(EncodingSchemeID object) {
				return createEncodingSchemeIDAdapter();
			}
			@Override
			public Adapter caseFontResolution(FontResolution object) {
				return createFontResolutionAdapter();
			}
			@Override
			public Adapter caseFullyQualifiedName(FullyQualifiedName object) {
				return createFullyQualifiedNameAdapter();
			}
			@Override
			public Adapter caseLocalDateAndTimeStamp(LocalDateAndTimeStamp object) {
				return createLocalDateAndTimeStampAdapter();
			}
			@Override
			public Adapter caseUniversalDateAndTimeStamp(UniversalDateAndTimeStamp object) {
				return createUniversalDateAndTimeStampAdapter();
			}
			@Override
			public Adapter caseMappingOption(MappingOption object) {
				return createMappingOptionAdapter();
			}
			@Override
			public Adapter caseMediaEjectControl(MediaEjectControl object) {
				return createMediaEjectControlAdapter();
			}
			@Override
			public Adapter caseMediumMapPageNumber(MediumMapPageNumber object) {
				return createMediumMapPageNumberAdapter();
			}
			@Override
			public Adapter caseMediumOrientation(MediumOrientation object) {
				return createMediumOrientationAdapter();
			}
			@Override
			public Adapter caseMeasurementUnits(MeasurementUnits object) {
				return createMeasurementUnitsAdapter();
			}
			@Override
			public Adapter caseMODCAInterchangeSet(MODCAInterchangeSet object) {
				return createMODCAInterchangeSetAdapter();
			}
			@Override
			public Adapter caseObjectAreaSize(ObjectAreaSize object) {
				return createObjectAreaSizeAdapter();
			}
			@Override
			public Adapter caseObjectClassification(ObjectClassification object) {
				return createObjectClassificationAdapter();
			}
			@Override
			public Adapter caseObjectFunctionSetSpecification(ObjectFunctionSetSpecification object) {
				return createObjectFunctionSetSpecificationAdapter();
			}
			@Override
			public Adapter caseObjectOffset(ObjectOffset object) {
				return createObjectOffsetAdapter();
			}
			@Override
			public Adapter caseResourceObjectType(ResourceObjectType object) {
				return createResourceObjectTypeAdapter();
			}
			@Override
			public Adapter casePagePositionInformation(PagePositionInformation object) {
				return createPagePositionInformationAdapter();
			}
			@Override
			public Adapter casePresentationControl(PresentationControl object) {
				return createPresentationControlAdapter();
			}
			@Override
			public Adapter casePresentationSpaceResetMixing(PresentationSpaceResetMixing object) {
				return createPresentationSpaceResetMixingAdapter();
			}
			@Override
			public Adapter casePresentationSpaceMixingRules(PresentationSpaceMixingRules object) {
				return createPresentationSpaceMixingRulesAdapter();
			}
			@Override
			public Adapter caseResourceLocalIdentifier(ResourceLocalIdentifier object) {
				return createResourceLocalIdentifierAdapter();
			}
			@Override
			public Adapter caseResourceSectionNumber(ResourceSectionNumber object) {
				return createResourceSectionNumberAdapter();
			}
			@Override
			public Adapter caseTextOrientation(TextOrientation object) {
				return createTextOrientationAdapter();
			}
			@Override
			public Adapter caseFontHorizontalScaleFactor(FontHorizontalScaleFactor object) {
				return createFontHorizontalScaleFactorAdapter();
			}
			@Override
			public Adapter caseFontDescriptorSpecification(FontDescriptorSpecification object) {
				return createFontDescriptorSpecificationAdapter();
			}
			@Override
			public Adapter caseBeginSegment(BeginSegment object) {
				return createBeginSegmentAdapter();
			}
			@Override
			public Adapter caseEndSegment(EndSegment object) {
				return createEndSegmentAdapter();
			}
			@Override
			public Adapter caseBeginTile(BeginTile object) {
				return createBeginTileAdapter();
			}
			@Override
			public Adapter caseEndTile(EndTile object) {
				return createEndTileAdapter();
			}
			@Override
			public Adapter caseBeginTransparencyMask(BeginTransparencyMask object) {
				return createBeginTransparencyMaskAdapter();
			}
			@Override
			public Adapter caseEndTransparencyMask(EndTransparencyMask object) {
				return createEndTransparencyMaskAdapter();
			}
			@Override
			public Adapter caseBeginImage(BeginImage object) {
				return createBeginImageAdapter();
			}
			@Override
			public Adapter caseEndImage(EndImage object) {
				return createEndImageAdapter();
			}
			@Override
			public Adapter caseImageSize(ImageSize object) {
				return createImageSizeAdapter();
			}
			@Override
			public Adapter caseImageEncoding(ImageEncoding object) {
				return createImageEncodingAdapter();
			}
			@Override
			public Adapter caseIDESize(IDESize object) {
				return createIDESizeAdapter();
			}
			@Override
			public Adapter caseImageLUTID(ImageLUTID object) {
				return createImageLUTIDAdapter();
			}
			@Override
			public Adapter caseBandImage(BandImage object) {
				return createBandImageAdapter();
			}
			@Override
			public Adapter caseIDEStructure(IDEStructure object) {
				return createIDEStructureAdapter();
			}
			@Override
			public Adapter caseExternalAlgorithm(ExternalAlgorithm object) {
				return createExternalAlgorithmAdapter();
			}
			@Override
			public Adapter caseTilePosition(TilePosition object) {
				return createTilePositionAdapter();
			}
			@Override
			public Adapter caseTileSize(TileSize object) {
				return createTileSizeAdapter();
			}
			@Override
			public Adapter caseTileSetColor(TileSetColor object) {
				return createTileSetColorAdapter();
			}
			@Override
			public Adapter caseSetBiLevelImageColor(SetBiLevelImageColor object) {
				return createSetBiLevelImageColorAdapter();
			}
			@Override
			public Adapter caseIOCAFunctionSetIdentification(IOCAFunctionSetIdentification object) {
				return createIOCAFunctionSetIdentificationAdapter();
			}
			@Override
			public Adapter caseImageData(ImageData object) {
				return createImageDataAdapter();
			}
			@Override
			public Adapter caseBandImageData(BandImageData object) {
				return createBandImageDataAdapter();
			}
			@Override
			public Adapter caseIncludeTile(IncludeTile object) {
				return createIncludeTileAdapter();
			}
			@Override
			public Adapter caseImageSubsampling(ImageSubsampling object) {
				return createImageSubsamplingAdapter();
			}
			@Override
			public Adapter caseSamplingRatios(SamplingRatios object) {
				return createSamplingRatiosAdapter();
			}
			@Override
			public Adapter caseTileTOC(TileTOC object) {
				return createTileTOCAdapter();
			}
			@Override
			public Adapter caseCPIRG(CPIRG object) {
				return createCPIRGAdapter();
			}
			@Override
			public Adapter caseCFIRG(CFIRG object) {
				return createCFIRGAdapter();
			}
			@Override
			public Adapter caseFNIRG(FNIRG object) {
				return createFNIRGAdapter();
			}
			@Override
			public Adapter caseFNMRG(FNMRG object) {
				return createFNMRGAdapter();
			}
			@Override
			public Adapter caseLLERG(LLERG object) {
				return createLLERGAdapter();
			}
			@Override
			public Adapter caseMPSRG(MPSRG object) {
				return createMPSRGAdapter();
			}
			@Override
			public Adapter caseMCFRG(MCFRG object) {
				return createMCFRGAdapter();
			}
			@Override
			public Adapter caseMBCRG(MBCRG object) {
				return createMBCRGAdapter();
			}
			@Override
			public Adapter caseMCARG(MCARG object) {
				return createMCARGAdapter();
			}
			@Override
			public Adapter caseMCDRG(MCDRG object) {
				return createMCDRGAdapter();
			}
			@Override
			public Adapter caseMDRRG(MDRRG object) {
				return createMDRRGAdapter();
			}
			@Override
			public Adapter caseMGORG(MGORG object) {
				return createMGORGAdapter();
			}
			@Override
			public Adapter caseMIORG(MIORG object) {
				return createMIORGAdapter();
			}
			@Override
			public Adapter caseMMDRG(MMDRG object) {
				return createMMDRGAdapter();
			}
			@Override
			public Adapter caseMMTRG(MMTRG object) {
				return createMMTRGAdapter();
			}
			@Override
			public Adapter caseMPGRG(MPGRG object) {
				return createMPGRGAdapter();
			}
			@Override
			public Adapter caseMPORG(MPORG object) {
				return createMPORGAdapter();
			}
			@Override
			public Adapter casePPORG(PPORG object) {
				return createPPORGAdapter();
			}
			@Override
			public Adapter casePGPRG(PGPRG object) {
				return createPGPRGAdapter();
			}
			@Override
			public Adapter caseMCCRG(MCCRG object) {
				return createMCCRGAdapter();
			}
			@Override
			public Adapter caseMMORG(MMORG object) {
				return createMMORGAdapter();
			}
			@Override
			public Adapter caseBandImageRG(BandImageRG object) {
				return createBandImageRGAdapter();
			}
			@Override
			public Adapter caseMCF1RG(MCF1RG object) {
				return createMCF1RGAdapter();
			}
			@Override
			public Adapter caseMMCRG(MMCRG object) {
				return createMMCRGAdapter();
			}
			@Override
			public Adapter caseFNORG(FNORG object) {
				return createFNORGAdapter();
			}
			@Override
			public Adapter caseFNPRG(FNPRG object) {
				return createFNPRGAdapter();
			}
			@Override
			public Adapter caseTileTOCRG(TileTOCRG object) {
				return createTileTOCRGAdapter();
			}
			@Override
			public Adapter caseSamplingRatiosRG(SamplingRatiosRG object) {
				return createSamplingRatiosRGAdapter();
			}
			@Override
			public Adapter caseExternalAlgorithmRG(ExternalAlgorithmRG object) {
				return createExternalAlgorithmRGAdapter();
			}
			@Override
			public Adapter caseFNNRG(FNNRG object) {
				return createFNNRGAdapter();
			}
			@Override
			public Adapter caseFNNRG2(FNNRG2 object) {
				return createFNNRG2Adapter();
			}
			@Override
			public Adapter caseBeginSegmentCommand(BeginSegmentCommand object) {
				return createBeginSegmentCommandAdapter();
			}
			@Override
			public Adapter caseEndSegmentCommand(EndSegmentCommand object) {
				return createEndSegmentCommandAdapter();
			}
			@Override
			public Adapter caseGBAR(GBAR object) {
				return createGBARAdapter();
			}
			@Override
			public Adapter caseGBIMG(GBIMG object) {
				return createGBIMGAdapter();
			}
			@Override
			public Adapter caseGCBIMG(GCBIMG object) {
				return createGCBIMGAdapter();
			}
			@Override
			public Adapter caseGBOX(GBOX object) {
				return createGBOXAdapter();
			}
			@Override
			public Adapter caseGCBOX(GCBOX object) {
				return createGCBOXAdapter();
			}
			@Override
			public Adapter caseGCHST(GCHST object) {
				return createGCHSTAdapter();
			}
			@Override
			public Adapter caseGCCHST(GCCHST object) {
				return createGCCHSTAdapter();
			}
			@Override
			public Adapter caseGCOMT(GCOMT object) {
				return createGCOMTAdapter();
			}
			@Override
			public Adapter caseGEAR(GEAR object) {
				return createGEARAdapter();
			}
			@Override
			public Adapter caseGEIMG(GEIMG object) {
				return createGEIMGAdapter();
			}
			@Override
			public Adapter caseGEPROL(GEPROL object) {
				return createGEPROLAdapter();
			}
			@Override
			public Adapter caseGFLT(GFLT object) {
				return createGFLTAdapter();
			}
			@Override
			public Adapter caseGCFLT(GCFLT object) {
				return createGCFLTAdapter();
			}
			@Override
			public Adapter caseGFARC(GFARC object) {
				return createGFARCAdapter();
			}
			@Override
			public Adapter caseGCFARC(GCFARC object) {
				return createGCFARCAdapter();
			}
			@Override
			public Adapter caseGIMD(GIMD object) {
				return createGIMDAdapter();
			}
			@Override
			public Adapter caseGLINE(GLINE object) {
				return createGLINEAdapter();
			}
			@Override
			public Adapter caseGCLINE(GCLINE object) {
				return createGCLINEAdapter();
			}
			@Override
			public Adapter caseGMRK(GMRK object) {
				return createGMRKAdapter();
			}
			@Override
			public Adapter caseGCMRK(GCMRK object) {
				return createGCMRKAdapter();
			}
			@Override
			public Adapter caseGNOP1(GNOP1 object) {
				return createGNOP1Adapter();
			}
			@Override
			public Adapter caseGPARC(GPARC object) {
				return createGPARCAdapter();
			}
			@Override
			public Adapter caseGCPARC(GCPARC object) {
				return createGCPARCAdapter();
			}
			@Override
			public Adapter caseGRLINE(GRLINE object) {
				return createGRLINEAdapter();
			}
			@Override
			public Adapter caseGCRLINE(GCRLINE object) {
				return createGCRLINEAdapter();
			}
			@Override
			public Adapter caseGSGCH(GSGCH object) {
				return createGSGCHAdapter();
			}
			@Override
			public Adapter caseGSAP(GSAP object) {
				return createGSAPAdapter();
			}
			@Override
			public Adapter caseGSBMX(GSBMX object) {
				return createGSBMXAdapter();
			}
			@Override
			public Adapter caseGSCA(GSCA object) {
				return createGSCAAdapter();
			}
			@Override
			public Adapter caseGSCC(GSCC object) {
				return createGSCCAdapter();
			}
			@Override
			public Adapter caseGSCD(GSCD object) {
				return createGSCDAdapter();
			}
			@Override
			public Adapter caseGSCR(GSCR object) {
				return createGSCRAdapter();
			}
			@Override
			public Adapter caseGSCS(GSCS object) {
				return createGSCSAdapter();
			}
			@Override
			public Adapter caseGSCH(GSCH object) {
				return createGSCHAdapter();
			}
			@Override
			public Adapter caseGSCOL(GSCOL object) {
				return createGSCOLAdapter();
			}
			@Override
			public Adapter caseGSCP(GSCP object) {
				return createGSCPAdapter();
			}
			@Override
			public Adapter caseGSECOL(GSECOL object) {
				return createGSECOLAdapter();
			}
			@Override
			public Adapter caseGSFLW(GSFLW object) {
				return createGSFLWAdapter();
			}
			@Override
			public Adapter caseGSLT(GSLT object) {
				return createGSLTAdapter();
			}
			@Override
			public Adapter caseGSLW(GSLW object) {
				return createGSLWAdapter();
			}
			@Override
			public Adapter caseGSMC(GSMC object) {
				return createGSMCAdapter();
			}
			@Override
			public Adapter caseGSMP(GSMP object) {
				return createGSMPAdapter();
			}
			@Override
			public Adapter caseGSMS(GSMS object) {
				return createGSMSAdapter();
			}
			@Override
			public Adapter caseGSMT(GSMT object) {
				return createGSMTAdapter();
			}
			@Override
			public Adapter caseGSMX(GSMX object) {
				return createGSMXAdapter();
			}
			@Override
			public Adapter caseGSPS(GSPS object) {
				return createGSPSAdapter();
			}
			@Override
			public Adapter caseGSPT(GSPT object) {
				return createGSPTAdapter();
			}
			@Override
			public Adapter caseGSPCOL(GSPCOL object) {
				return createGSPCOLAdapter();
			}
			@Override
			public Adapter caseGSLE(GSLE object) {
				return createGSLEAdapter();
			}
			@Override
			public Adapter caseGSLJ(GSLJ object) {
				return createGSLJAdapter();
			}
			@Override
			public Adapter caseGCBEZ(GCBEZ object) {
				return createGCBEZAdapter();
			}
			@Override
			public Adapter caseGCCBEZ(GCCBEZ object) {
				return createGCCBEZAdapter();
			}
			@Override
			public Adapter caseWindowSpecification(WindowSpecification object) {
				return createWindowSpecificationAdapter();
			}
			@Override
			public Adapter caseDrawingOrderSubset(DrawingOrderSubset object) {
				return createDrawingOrderSubsetAdapter();
			}
			@Override
			public Adapter caseGCBEZRG(GCBEZRG object) {
				return createGCBEZRGAdapter();
			}
			@Override
			public Adapter caseGCCBEZRG(GCCBEZRG object) {
				return createGCCBEZRGAdapter();
			}
			@Override
			public Adapter caseGFLTRG(GFLTRG object) {
				return createGFLTRGAdapter();
			}
			@Override
			public Adapter caseGCFLTRG(GCFLTRG object) {
				return createGCFLTRGAdapter();
			}
			@Override
			public Adapter caseGLINERG(GLINERG object) {
				return createGLINERGAdapter();
			}
			@Override
			public Adapter caseGCLINERG(GCLINERG object) {
				return createGCLINERGAdapter();
			}
			@Override
			public Adapter caseGMRKRG(GMRKRG object) {
				return createGMRKRGAdapter();
			}
			@Override
			public Adapter caseGCMRKRG(GCMRKRG object) {
				return createGCMRKRGAdapter();
			}
			@Override
			public Adapter caseGRLINERG(GRLINERG object) {
				return createGRLINERGAdapter();
			}
			@Override
			public Adapter caseGCRLINERG(GCRLINERG object) {
				return createGCRLINERGAdapter();
			}
			@Override
			public Adapter caseTonerSaver(TonerSaver object) {
				return createTonerSaverAdapter();
			}
			@Override
			public Adapter caseColorFidelity(ColorFidelity object) {
				return createColorFidelityAdapter();
			}
			@Override
			public Adapter caseFontFidelity(FontFidelity object) {
				return createFontFidelityAdapter();
			}
			@Override
			public Adapter caseTextFidelity(TextFidelity object) {
				return createTextFidelityAdapter();
			}
			@Override
			public Adapter caseMediaFidelity(MediaFidelity object) {
				return createMediaFidelityAdapter();
			}
			@Override
			public Adapter caseFinishingFidelity(FinishingFidelity object) {
				return createFinishingFidelityAdapter();
			}
			@Override
			public Adapter caseCMRFidelity(CMRFidelity object) {
				return createCMRFidelityAdapter();
			}
			@Override
			public Adapter caseObjectByteExtent(ObjectByteExtent object) {
				return createObjectByteExtentAdapter();
			}
			@Override
			public Adapter caseObjectByteOffset(ObjectByteOffset object) {
				return createObjectByteOffsetAdapter();
			}
			@Override
			public Adapter caseObjectStructuredFieldExtent(ObjectStructuredFieldExtent object) {
				return createObjectStructuredFieldExtentAdapter();
			}
			@Override
			public Adapter caseObjectStructuredFieldOffset(ObjectStructuredFieldOffset object) {
				return createObjectStructuredFieldOffsetAdapter();
			}
			@Override
			public Adapter caseObjectCount(ObjectCount object) {
				return createObjectCountAdapter();
			}
			@Override
			public Adapter caseObjectOriginIdentifier(ObjectOriginIdentifier object) {
				return createObjectOriginIdentifierAdapter();
			}
			@Override
			public Adapter caseLineDataObjectPositionMigration(LineDataObjectPositionMigration object) {
				return createLineDataObjectPositionMigrationAdapter();
			}
			@Override
			public Adapter caseColorManagementResourceDescriptor(ColorManagementResourceDescriptor object) {
				return createColorManagementResourceDescriptorAdapter();
			}
			@Override
			public Adapter caseMSURG(MSURG object) {
				return createMSURGAdapter();
			}
			@Override
			public Adapter caseImageResolution(ImageResolution object) {
				return createImageResolutionAdapter();
			}
			@Override
			public Adapter caseObjectContainerPresentationSpaceSize(ObjectContainerPresentationSpaceSize object) {
				return createObjectContainerPresentationSpaceSizeAdapter();
			}
			@Override
			public Adapter caseExtendedResourceLocalIdentifier(ExtendedResourceLocalIdentifier object) {
				return createExtendedResourceLocalIdentifierAdapter();
			}
			@Override
			public Adapter caseMetricAdjustment(MetricAdjustment object) {
				return createMetricAdjustmentAdapter();
			}
			@Override
			public Adapter caseExtensionFont(ExtensionFont object) {
				return createExtensionFontAdapter();
			}
			@Override
			public Adapter caseRenderingIntent(RenderingIntent object) {
				return createRenderingIntentAdapter();
			}
			@Override
			public Adapter caseFontCodedGraphicCharacterSetGlobalIdentifier(FontCodedGraphicCharacterSetGlobalIdentifier object) {
				return createFontCodedGraphicCharacterSetGlobalIdentifierAdapter();
			}
			@Override
			public Adapter caseLocaleSelector(LocaleSelector object) {
				return createLocaleSelectorAdapter();
			}
			@Override
			public Adapter caseFinishingOperation(FinishingOperation object) {
				return createFinishingOperationAdapter();
			}
			@Override
			public Adapter caseUP3iFinishingOperation(UP3iFinishingOperation object) {
				return createUP3iFinishingOperationAdapter();
			}
			@Override
			public Adapter caseDeviceAppearance(DeviceAppearance object) {
				return createDeviceAppearanceAdapter();
			}
			@Override
			public Adapter caseResourceObjectInclude(ResourceObjectInclude object) {
				return createResourceObjectIncludeAdapter();
			}
			@Override
			public Adapter casePageOverlayConditionalProcessing(PageOverlayConditionalProcessing object) {
				return createPageOverlayConditionalProcessingAdapter();
			}
			@Override
			public Adapter caseResourceUsageAttribute(ResourceUsageAttribute object) {
				return createResourceUsageAttributeAdapter();
			}
			@Override
			public Adapter caseSF(SF object) {
				return createSFAdapter();
			}
			@Override
			public Adapter caseTriplet(Triplet object) {
				return createTripletAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LineData <em>Line Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LineData
	 * @generated
	 */
	public Adapter createLineDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BAG <em>BAG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BAG
	 * @generated
	 */
	public Adapter createBAGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BBC <em>BBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BBC
	 * @generated
	 */
	public Adapter createBBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BCA <em>BCA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BCA
	 * @generated
	 */
	public Adapter createBCAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BCF <em>BCF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BCF
	 * @generated
	 */
	public Adapter createBCFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BCP <em>BCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BCP
	 * @generated
	 */
	public Adapter createBCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDA <em>BDA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDA
	 * @generated
	 */
	public Adapter createBDAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDD <em>BDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDD
	 * @generated
	 */
	public Adapter createBDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDG <em>BDG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDG
	 * @generated
	 */
	public Adapter createBDGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDI <em>BDI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDI
	 * @generated
	 */
	public Adapter createBDIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDM <em>BDM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDM
	 * @generated
	 */
	public Adapter createBDMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDT <em>BDT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDT
	 * @generated
	 */
	public Adapter createBDTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BDX <em>BDX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BDX
	 * @generated
	 */
	public Adapter createBDXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BFG <em>BFG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BFG
	 * @generated
	 */
	public Adapter createBFGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BFM <em>BFM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BFM
	 * @generated
	 */
	public Adapter createBFMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BFN <em>BFN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BFN
	 * @generated
	 */
	public Adapter createBFNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BGR <em>BGR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BGR
	 * @generated
	 */
	public Adapter createBGRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BII <em>BII</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BII
	 * @generated
	 */
	public Adapter createBIIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BIM <em>BIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BIM
	 * @generated
	 */
	public Adapter createBIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BMM <em>BMM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BMM
	 * @generated
	 */
	public Adapter createBMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BMO <em>BMO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BMO
	 * @generated
	 */
	public Adapter createBMOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BNG <em>BNG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BNG
	 * @generated
	 */
	public Adapter createBNGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BOC <em>BOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BOC
	 * @generated
	 */
	public Adapter createBOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BOG <em>BOG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BOG
	 * @generated
	 */
	public Adapter createBOGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BPF <em>BPF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BPF
	 * @generated
	 */
	public Adapter createBPFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BPG <em>BPG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BPG
	 * @generated
	 */
	public Adapter createBPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BPM <em>BPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BPM
	 * @generated
	 */
	public Adapter createBPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BPS <em>BPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BPS
	 * @generated
	 */
	public Adapter createBPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BPT <em>BPT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BPT
	 * @generated
	 */
	public Adapter createBPTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BRG <em>BRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BRG
	 * @generated
	 */
	public Adapter createBRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BRS <em>BRS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BRS
	 * @generated
	 */
	public Adapter createBRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BSG <em>BSG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BSG
	 * @generated
	 */
	public Adapter createBSGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CAT <em>CAT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CAT
	 * @generated
	 */
	public Adapter createCATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CDD <em>CDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CDD
	 * @generated
	 */
	public Adapter createCDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CFC <em>CFC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CFC
	 * @generated
	 */
	public Adapter createCFCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CFI <em>CFI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CFI
	 * @generated
	 */
	public Adapter createCFIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CPC <em>CPC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CPC
	 * @generated
	 */
	public Adapter createCPCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CPD <em>CPD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CPD
	 * @generated
	 */
	public Adapter createCPDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CPI <em>CPI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CPI
	 * @generated
	 */
	public Adapter createCPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CTC <em>CTC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CTC
	 * @generated
	 */
	public Adapter createCTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DXD <em>DXD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DXD
	 * @generated
	 */
	public Adapter createDXDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EAG <em>EAG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EAG
	 * @generated
	 */
	public Adapter createEAGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EBC <em>EBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EBC
	 * @generated
	 */
	public Adapter createEBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ECA <em>ECA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ECA
	 * @generated
	 */
	public Adapter createECAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ECF <em>ECF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ECF
	 * @generated
	 */
	public Adapter createECFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ECP <em>ECP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ECP
	 * @generated
	 */
	public Adapter createECPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EDG <em>EDG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EDG
	 * @generated
	 */
	public Adapter createEDGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EDI <em>EDI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EDI
	 * @generated
	 */
	public Adapter createEDIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EDM <em>EDM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EDM
	 * @generated
	 */
	public Adapter createEDMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EDT <em>EDT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EDT
	 * @generated
	 */
	public Adapter createEDTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EDX <em>EDX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EDX
	 * @generated
	 */
	public Adapter createEDXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EFG <em>EFG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EFG
	 * @generated
	 */
	public Adapter createEFGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EFM <em>EFM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EFM
	 * @generated
	 */
	public Adapter createEFMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EFN <em>EFN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EFN
	 * @generated
	 */
	public Adapter createEFNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EGR <em>EGR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EGR
	 * @generated
	 */
	public Adapter createEGRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EII <em>EII</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EII
	 * @generated
	 */
	public Adapter createEIIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EIM <em>EIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EIM
	 * @generated
	 */
	public Adapter createEIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EMM <em>EMM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EMM
	 * @generated
	 */
	public Adapter createEMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EMO <em>EMO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EMO
	 * @generated
	 */
	public Adapter createEMOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ENG <em>ENG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ENG
	 * @generated
	 */
	public Adapter createENGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EOC <em>EOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EOC
	 * @generated
	 */
	public Adapter createEOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EOG <em>EOG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EOG
	 * @generated
	 */
	public Adapter createEOGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EPF <em>EPF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EPF
	 * @generated
	 */
	public Adapter createEPFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EPG <em>EPG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EPG
	 * @generated
	 */
	public Adapter createEPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EPM <em>EPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EPM
	 * @generated
	 */
	public Adapter createEPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EPS <em>EPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EPS
	 * @generated
	 */
	public Adapter createEPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EPT <em>EPT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EPT
	 * @generated
	 */
	public Adapter createEPTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ERG <em>ERG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ERG
	 * @generated
	 */
	public Adapter createERGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ERS <em>ERS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ERS
	 * @generated
	 */
	public Adapter createERSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ESG <em>ESG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ESG
	 * @generated
	 */
	public Adapter createESGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNC <em>FNC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNC
	 * @generated
	 */
	public Adapter createFNCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FND <em>FND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FND
	 * @generated
	 */
	public Adapter createFNDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNG <em>FNG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNG
	 * @generated
	 */
	public Adapter createFNGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNI <em>FNI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNI
	 * @generated
	 */
	public Adapter createFNIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNN <em>FNN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNN
	 * @generated
	 */
	public Adapter createFNNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNM <em>FNM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNM
	 * @generated
	 */
	public Adapter createFNMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNO <em>FNO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNO
	 * @generated
	 */
	public Adapter createFNOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNP <em>FNP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNP
	 * @generated
	 */
	public Adapter createFNPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GAD <em>GAD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GAD
	 * @generated
	 */
	public Adapter createGADAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GDD <em>GDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GDD
	 * @generated
	 */
	public Adapter createGDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ICP <em>ICP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ICP
	 * @generated
	 */
	public Adapter createICPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IDD <em>IDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IDD
	 * @generated
	 */
	public Adapter createIDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IEL <em>IEL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IEL
	 * @generated
	 */
	public Adapter createIELAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IID <em>IID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IID
	 * @generated
	 */
	public Adapter createIIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IMM <em>IMM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IMM
	 * @generated
	 */
	public Adapter createIMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IOB <em>IOB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IOB
	 * @generated
	 */
	public Adapter createIOBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IOC <em>IOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IOC
	 * @generated
	 */
	public Adapter createIOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IPD <em>IPD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IPD
	 * @generated
	 */
	public Adapter createIPDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IPG <em>IPG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IPG
	 * @generated
	 */
	public Adapter createIPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IPO <em>IPO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IPO
	 * @generated
	 */
	public Adapter createIPOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IPS <em>IPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IPS
	 * @generated
	 */
	public Adapter createIPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IRD <em>IRD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IRD
	 * @generated
	 */
	public Adapter createIRDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LLE <em>LLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LLE
	 * @generated
	 */
	public Adapter createLLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LNC <em>LNC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LNC
	 * @generated
	 */
	public Adapter createLNCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LND <em>LND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LND
	 * @generated
	 */
	public Adapter createLNDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MBC <em>MBC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MBC
	 * @generated
	 */
	public Adapter createMBCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCA <em>MCA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCA
	 * @generated
	 */
	public Adapter createMCAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCC <em>MCC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCC
	 * @generated
	 */
	public Adapter createMCCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCD <em>MCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCD
	 * @generated
	 */
	public Adapter createMCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCF <em>MCF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCF
	 * @generated
	 */
	public Adapter createMCFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCF1 <em>MCF1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCF1
	 * @generated
	 */
	public Adapter createMCF1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MDD <em>MDD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MDD
	 * @generated
	 */
	public Adapter createMDDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MDR <em>MDR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MDR
	 * @generated
	 */
	public Adapter createMDRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MFC <em>MFC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MFC
	 * @generated
	 */
	public Adapter createMFCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MGO <em>MGO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MGO
	 * @generated
	 */
	public Adapter createMGOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MIO <em>MIO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MIO
	 * @generated
	 */
	public Adapter createMIOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMC <em>MMC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMC
	 * @generated
	 */
	public Adapter createMMCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMD <em>MMD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMD
	 * @generated
	 */
	public Adapter createMMDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMO <em>MMO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMO
	 * @generated
	 */
	public Adapter createMMOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMT <em>MMT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMT
	 * @generated
	 */
	public Adapter createMMTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MPG <em>MPG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MPG
	 * @generated
	 */
	public Adapter createMPGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MPO <em>MPO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MPO
	 * @generated
	 */
	public Adapter createMPOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MPS <em>MPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MPS
	 * @generated
	 */
	public Adapter createMPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MSU <em>MSU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MSU
	 * @generated
	 */
	public Adapter createMSUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.NOP <em>NOP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.NOP
	 * @generated
	 */
	public Adapter createNOPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.OBD <em>OBD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.OBD
	 * @generated
	 */
	public Adapter createOBDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.OBP <em>OBP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.OBP
	 * @generated
	 */
	public Adapter createOBPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.OCD <em>OCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.OCD
	 * @generated
	 */
	public Adapter createOCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PEC <em>PEC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PEC
	 * @generated
	 */
	public Adapter createPECAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PFC <em>PFC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PFC
	 * @generated
	 */
	public Adapter createPFCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PGD <em>PGD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PGD
	 * @generated
	 */
	public Adapter createPGDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PGP <em>PGP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PGP
	 * @generated
	 */
	public Adapter createPGPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PGP1 <em>PGP1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PGP1
	 * @generated
	 */
	public Adapter createPGP1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PMC <em>PMC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PMC
	 * @generated
	 */
	public Adapter createPMCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PPO <em>PPO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PPO
	 * @generated
	 */
	public Adapter createPPOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PTD <em>PTD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PTD
	 * @generated
	 */
	public Adapter createPTDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PTD1 <em>PTD1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PTD1
	 * @generated
	 */
	public Adapter createPTD1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PTX <em>PTX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PTX
	 * @generated
	 */
	public Adapter createPTXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TLE <em>TLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TLE
	 * @generated
	 */
	public Adapter createTLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FGD <em>FGD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FGD
	 * @generated
	 */
	public Adapter createFGDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.AMB <em>AMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.AMB
	 * @generated
	 */
	public Adapter createAMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.AMI <em>AMI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.AMI
	 * @generated
	 */
	public Adapter createAMIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BLN <em>BLN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BLN
	 * @generated
	 */
	public Adapter createBLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BSU <em>BSU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BSU
	 * @generated
	 */
	public Adapter createBSUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DBR <em>DBR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DBR
	 * @generated
	 */
	public Adapter createDBRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DIR <em>DIR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DIR
	 * @generated
	 */
	public Adapter createDIRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ESU <em>ESU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ESU
	 * @generated
	 */
	public Adapter createESUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.NOPCS <em>NOPCS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.NOPCS
	 * @generated
	 */
	public Adapter createNOPCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.OVS <em>OVS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.OVS
	 * @generated
	 */
	public Adapter createOVSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.RMB <em>RMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.RMB
	 * @generated
	 */
	public Adapter createRMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.RMI <em>RMI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.RMI
	 * @generated
	 */
	public Adapter createRMIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.RPS <em>RPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.RPS
	 * @generated
	 */
	public Adapter createRPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SBI <em>SBI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SBI
	 * @generated
	 */
	public Adapter createSBIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SCFL <em>SCFL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SCFL
	 * @generated
	 */
	public Adapter createSCFLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SEC <em>SEC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SEC
	 * @generated
	 */
	public Adapter createSECAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SIA <em>SIA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SIA
	 * @generated
	 */
	public Adapter createSIAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SIM <em>SIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SIM
	 * @generated
	 */
	public Adapter createSIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.STC <em>STC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.STC
	 * @generated
	 */
	public Adapter createSTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.STO <em>STO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.STO
	 * @generated
	 */
	public Adapter createSTOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SVI <em>SVI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SVI
	 * @generated
	 */
	public Adapter createSVIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TBM <em>TBM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TBM
	 * @generated
	 */
	public Adapter createTBMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TRN <em>TRN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TRN
	 * @generated
	 */
	public Adapter createTRNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.USC <em>USC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.USC
	 * @generated
	 */
	public Adapter createUSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.AttributeQualifier <em>Attribute Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.AttributeQualifier
	 * @generated
	 */
	public Adapter createAttributeQualifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CGCSGID <em>CGCSGID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CGCSGID
	 * @generated
	 */
	public Adapter createCGCSGIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CRCResourceManagement <em>CRC Resource Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CRCResourceManagement
	 * @generated
	 */
	public Adapter createCRCResourceManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CharacterRotation <em>Character Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CharacterRotation
	 * @generated
	 */
	public Adapter createCharacterRotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ColorSpecification <em>Color Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ColorSpecification
	 * @generated
	 */
	public Adapter createColorSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DataObjectFontDescriptor <em>Data Object Font Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DataObjectFontDescriptor
	 * @generated
	 */
	public Adapter createDataObjectFontDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DescriptorPosition <em>Descriptor Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DescriptorPosition
	 * @generated
	 */
	public Adapter createDescriptorPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EncodingSchemeID <em>Encoding Scheme ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EncodingSchemeID
	 * @generated
	 */
	public Adapter createEncodingSchemeIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FontResolution <em>Font Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FontResolution
	 * @generated
	 */
	public Adapter createFontResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FullyQualifiedName <em>Fully Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FullyQualifiedName
	 * @generated
	 */
	public Adapter createFullyQualifiedNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LocalDateAndTimeStamp <em>Local Date And Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LocalDateAndTimeStamp
	 * @generated
	 */
	public Adapter createLocalDateAndTimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.UniversalDateAndTimeStamp <em>Universal Date And Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.UniversalDateAndTimeStamp
	 * @generated
	 */
	public Adapter createUniversalDateAndTimeStampAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MappingOption <em>Mapping Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MappingOption
	 * @generated
	 */
	public Adapter createMappingOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MediaEjectControl <em>Media Eject Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MediaEjectControl
	 * @generated
	 */
	public Adapter createMediaEjectControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MediumMapPageNumber <em>Medium Map Page Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MediumMapPageNumber
	 * @generated
	 */
	public Adapter createMediumMapPageNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MediumOrientation <em>Medium Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MediumOrientation
	 * @generated
	 */
	public Adapter createMediumOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MeasurementUnits <em>Measurement Units</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MeasurementUnits
	 * @generated
	 */
	public Adapter createMeasurementUnitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MODCAInterchangeSet <em>MODCA Interchange Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MODCAInterchangeSet
	 * @generated
	 */
	public Adapter createMODCAInterchangeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectAreaSize <em>Object Area Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectAreaSize
	 * @generated
	 */
	public Adapter createObjectAreaSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectClassification <em>Object Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectClassification
	 * @generated
	 */
	public Adapter createObjectClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectFunctionSetSpecification <em>Object Function Set Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectFunctionSetSpecification
	 * @generated
	 */
	public Adapter createObjectFunctionSetSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectOffset <em>Object Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectOffset
	 * @generated
	 */
	public Adapter createObjectOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ResourceObjectType <em>Resource Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ResourceObjectType
	 * @generated
	 */
	public Adapter createResourceObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PagePositionInformation <em>Page Position Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PagePositionInformation
	 * @generated
	 */
	public Adapter createPagePositionInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PresentationControl <em>Presentation Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PresentationControl
	 * @generated
	 */
	public Adapter createPresentationControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PresentationSpaceResetMixing <em>Presentation Space Reset Mixing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PresentationSpaceResetMixing
	 * @generated
	 */
	public Adapter createPresentationSpaceResetMixingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PresentationSpaceMixingRules <em>Presentation Space Mixing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PresentationSpaceMixingRules
	 * @generated
	 */
	public Adapter createPresentationSpaceMixingRulesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ResourceLocalIdentifier <em>Resource Local Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ResourceLocalIdentifier
	 * @generated
	 */
	public Adapter createResourceLocalIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ResourceSectionNumber <em>Resource Section Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ResourceSectionNumber
	 * @generated
	 */
	public Adapter createResourceSectionNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TextOrientation <em>Text Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TextOrientation
	 * @generated
	 */
	public Adapter createTextOrientationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FontHorizontalScaleFactor <em>Font Horizontal Scale Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FontHorizontalScaleFactor
	 * @generated
	 */
	public Adapter createFontHorizontalScaleFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FontDescriptorSpecification <em>Font Descriptor Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FontDescriptorSpecification
	 * @generated
	 */
	public Adapter createFontDescriptorSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BeginSegment <em>Begin Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BeginSegment
	 * @generated
	 */
	public Adapter createBeginSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EndSegment <em>End Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EndSegment
	 * @generated
	 */
	public Adapter createEndSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BeginTile <em>Begin Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BeginTile
	 * @generated
	 */
	public Adapter createBeginTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EndTile <em>End Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EndTile
	 * @generated
	 */
	public Adapter createEndTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BeginTransparencyMask <em>Begin Transparency Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BeginTransparencyMask
	 * @generated
	 */
	public Adapter createBeginTransparencyMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EndTransparencyMask <em>End Transparency Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EndTransparencyMask
	 * @generated
	 */
	public Adapter createEndTransparencyMaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BeginImage <em>Begin Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BeginImage
	 * @generated
	 */
	public Adapter createBeginImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EndImage <em>End Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EndImage
	 * @generated
	 */
	public Adapter createEndImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ImageSize <em>Image Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ImageSize
	 * @generated
	 */
	public Adapter createImageSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ImageEncoding <em>Image Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ImageEncoding
	 * @generated
	 */
	public Adapter createImageEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IDESize <em>IDE Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IDESize
	 * @generated
	 */
	public Adapter createIDESizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ImageLUTID <em>Image LUTID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ImageLUTID
	 * @generated
	 */
	public Adapter createImageLUTIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BandImage <em>Band Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BandImage
	 * @generated
	 */
	public Adapter createBandImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IDEStructure <em>IDE Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IDEStructure
	 * @generated
	 */
	public Adapter createIDEStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ExternalAlgorithm <em>External Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ExternalAlgorithm
	 * @generated
	 */
	public Adapter createExternalAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TilePosition <em>Tile Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TilePosition
	 * @generated
	 */
	public Adapter createTilePositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TileSize <em>Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TileSize
	 * @generated
	 */
	public Adapter createTileSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TileSetColor <em>Tile Set Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TileSetColor
	 * @generated
	 */
	public Adapter createTileSetColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SetBiLevelImageColor <em>Set Bi Level Image Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SetBiLevelImageColor
	 * @generated
	 */
	public Adapter createSetBiLevelImageColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IOCAFunctionSetIdentification <em>IOCA Function Set Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IOCAFunctionSetIdentification
	 * @generated
	 */
	public Adapter createIOCAFunctionSetIdentificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ImageData <em>Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ImageData
	 * @generated
	 */
	public Adapter createImageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BandImageData <em>Band Image Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BandImageData
	 * @generated
	 */
	public Adapter createBandImageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.IncludeTile <em>Include Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.IncludeTile
	 * @generated
	 */
	public Adapter createIncludeTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ImageSubsampling <em>Image Subsampling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ImageSubsampling
	 * @generated
	 */
	public Adapter createImageSubsamplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SamplingRatios <em>Sampling Ratios</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SamplingRatios
	 * @generated
	 */
	public Adapter createSamplingRatiosAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TileTOC <em>Tile TOC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TileTOC
	 * @generated
	 */
	public Adapter createTileTOCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CPIRG <em>CPIRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CPIRG
	 * @generated
	 */
	public Adapter createCPIRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CFIRG <em>CFIRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CFIRG
	 * @generated
	 */
	public Adapter createCFIRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNIRG <em>FNIRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNIRG
	 * @generated
	 */
	public Adapter createFNIRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNMRG <em>FNMRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNMRG
	 * @generated
	 */
	public Adapter createFNMRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LLERG <em>LLERG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LLERG
	 * @generated
	 */
	public Adapter createLLERGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MPSRG <em>MPSRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MPSRG
	 * @generated
	 */
	public Adapter createMPSRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCFRG <em>MCFRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCFRG
	 * @generated
	 */
	public Adapter createMCFRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MBCRG <em>MBCRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MBCRG
	 * @generated
	 */
	public Adapter createMBCRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCARG <em>MCARG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCARG
	 * @generated
	 */
	public Adapter createMCARGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCDRG <em>MCDRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCDRG
	 * @generated
	 */
	public Adapter createMCDRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MDRRG <em>MDRRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MDRRG
	 * @generated
	 */
	public Adapter createMDRRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MGORG <em>MGORG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MGORG
	 * @generated
	 */
	public Adapter createMGORGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MIORG <em>MIORG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MIORG
	 * @generated
	 */
	public Adapter createMIORGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMDRG <em>MMDRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMDRG
	 * @generated
	 */
	public Adapter createMMDRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMTRG <em>MMTRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMTRG
	 * @generated
	 */
	public Adapter createMMTRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MPGRG <em>MPGRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MPGRG
	 * @generated
	 */
	public Adapter createMPGRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MPORG <em>MPORG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MPORG
	 * @generated
	 */
	public Adapter createMPORGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PPORG <em>PPORG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PPORG
	 * @generated
	 */
	public Adapter createPPORGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PGPRG <em>PGPRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PGPRG
	 * @generated
	 */
	public Adapter createPGPRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCCRG <em>MCCRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCCRG
	 * @generated
	 */
	public Adapter createMCCRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMORG <em>MMORG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMORG
	 * @generated
	 */
	public Adapter createMMORGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BandImageRG <em>Band Image RG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BandImageRG
	 * @generated
	 */
	public Adapter createBandImageRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MCF1RG <em>MCF1RG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MCF1RG
	 * @generated
	 */
	public Adapter createMCF1RGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MMCRG <em>MMCRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MMCRG
	 * @generated
	 */
	public Adapter createMMCRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNORG <em>FNORG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNORG
	 * @generated
	 */
	public Adapter createFNORGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNPRG <em>FNPRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNPRG
	 * @generated
	 */
	public Adapter createFNPRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TileTOCRG <em>Tile TOCRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TileTOCRG
	 * @generated
	 */
	public Adapter createTileTOCRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.SamplingRatiosRG <em>Sampling Ratios RG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.SamplingRatiosRG
	 * @generated
	 */
	public Adapter createSamplingRatiosRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ExternalAlgorithmRG <em>External Algorithm RG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ExternalAlgorithmRG
	 * @generated
	 */
	public Adapter createExternalAlgorithmRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNNRG <em>FNNRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNNRG
	 * @generated
	 */
	public Adapter createFNNRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FNNRG2 <em>FNNRG2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FNNRG2
	 * @generated
	 */
	public Adapter createFNNRG2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.BeginSegmentCommand <em>Begin Segment Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.BeginSegmentCommand
	 * @generated
	 */
	public Adapter createBeginSegmentCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.EndSegmentCommand <em>End Segment Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.EndSegmentCommand
	 * @generated
	 */
	public Adapter createEndSegmentCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GBAR <em>GBAR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GBAR
	 * @generated
	 */
	public Adapter createGBARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GBIMG <em>GBIMG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GBIMG
	 * @generated
	 */
	public Adapter createGBIMGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCBIMG <em>GCBIMG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCBIMG
	 * @generated
	 */
	public Adapter createGCBIMGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GBOX <em>GBOX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GBOX
	 * @generated
	 */
	public Adapter createGBOXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCBOX <em>GCBOX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCBOX
	 * @generated
	 */
	public Adapter createGCBOXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCHST <em>GCHST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCHST
	 * @generated
	 */
	public Adapter createGCHSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCCHST <em>GCCHST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCCHST
	 * @generated
	 */
	public Adapter createGCCHSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCOMT <em>GCOMT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCOMT
	 * @generated
	 */
	public Adapter createGCOMTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GEAR <em>GEAR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GEAR
	 * @generated
	 */
	public Adapter createGEARAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GEIMG <em>GEIMG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GEIMG
	 * @generated
	 */
	public Adapter createGEIMGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GEPROL <em>GEPROL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GEPROL
	 * @generated
	 */
	public Adapter createGEPROLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GFLT <em>GFLT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GFLT
	 * @generated
	 */
	public Adapter createGFLTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCFLT <em>GCFLT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCFLT
	 * @generated
	 */
	public Adapter createGCFLTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GFARC <em>GFARC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GFARC
	 * @generated
	 */
	public Adapter createGFARCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCFARC <em>GCFARC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCFARC
	 * @generated
	 */
	public Adapter createGCFARCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GIMD <em>GIMD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GIMD
	 * @generated
	 */
	public Adapter createGIMDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GLINE <em>GLINE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GLINE
	 * @generated
	 */
	public Adapter createGLINEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCLINE <em>GCLINE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCLINE
	 * @generated
	 */
	public Adapter createGCLINEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GMRK <em>GMRK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GMRK
	 * @generated
	 */
	public Adapter createGMRKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCMRK <em>GCMRK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCMRK
	 * @generated
	 */
	public Adapter createGCMRKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GNOP1 <em>GNOP1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GNOP1
	 * @generated
	 */
	public Adapter createGNOP1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GPARC <em>GPARC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GPARC
	 * @generated
	 */
	public Adapter createGPARCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCPARC <em>GCPARC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCPARC
	 * @generated
	 */
	public Adapter createGCPARCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GRLINE <em>GRLINE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GRLINE
	 * @generated
	 */
	public Adapter createGRLINEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCRLINE <em>GCRLINE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCRLINE
	 * @generated
	 */
	public Adapter createGCRLINEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSGCH <em>GSGCH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSGCH
	 * @generated
	 */
	public Adapter createGSGCHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSAP <em>GSAP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSAP
	 * @generated
	 */
	public Adapter createGSAPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSBMX <em>GSBMX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSBMX
	 * @generated
	 */
	public Adapter createGSBMXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCA <em>GSCA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCA
	 * @generated
	 */
	public Adapter createGSCAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCC <em>GSCC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCC
	 * @generated
	 */
	public Adapter createGSCCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCD <em>GSCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCD
	 * @generated
	 */
	public Adapter createGSCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCR <em>GSCR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCR
	 * @generated
	 */
	public Adapter createGSCRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCS <em>GSCS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCS
	 * @generated
	 */
	public Adapter createGSCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCH <em>GSCH</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCH
	 * @generated
	 */
	public Adapter createGSCHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCOL <em>GSCOL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCOL
	 * @generated
	 */
	public Adapter createGSCOLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSCP <em>GSCP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSCP
	 * @generated
	 */
	public Adapter createGSCPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSECOL <em>GSECOL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSECOL
	 * @generated
	 */
	public Adapter createGSECOLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSFLW <em>GSFLW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSFLW
	 * @generated
	 */
	public Adapter createGSFLWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSLT <em>GSLT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSLT
	 * @generated
	 */
	public Adapter createGSLTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSLW <em>GSLW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSLW
	 * @generated
	 */
	public Adapter createGSLWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSMC <em>GSMC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSMC
	 * @generated
	 */
	public Adapter createGSMCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSMP <em>GSMP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSMP
	 * @generated
	 */
	public Adapter createGSMPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSMS <em>GSMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSMS
	 * @generated
	 */
	public Adapter createGSMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSMT <em>GSMT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSMT
	 * @generated
	 */
	public Adapter createGSMTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSMX <em>GSMX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSMX
	 * @generated
	 */
	public Adapter createGSMXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSPS <em>GSPS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSPS
	 * @generated
	 */
	public Adapter createGSPSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSPT <em>GSPT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSPT
	 * @generated
	 */
	public Adapter createGSPTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSPCOL <em>GSPCOL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSPCOL
	 * @generated
	 */
	public Adapter createGSPCOLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSLE <em>GSLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSLE
	 * @generated
	 */
	public Adapter createGSLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GSLJ <em>GSLJ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GSLJ
	 * @generated
	 */
	public Adapter createGSLJAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCBEZ <em>GCBEZ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCBEZ
	 * @generated
	 */
	public Adapter createGCBEZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCCBEZ <em>GCCBEZ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCCBEZ
	 * @generated
	 */
	public Adapter createGCCBEZAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.WindowSpecification <em>Window Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.WindowSpecification
	 * @generated
	 */
	public Adapter createWindowSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DrawingOrderSubset <em>Drawing Order Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DrawingOrderSubset
	 * @generated
	 */
	public Adapter createDrawingOrderSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCBEZRG <em>GCBEZRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCBEZRG
	 * @generated
	 */
	public Adapter createGCBEZRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCCBEZRG <em>GCCBEZRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCCBEZRG
	 * @generated
	 */
	public Adapter createGCCBEZRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GFLTRG <em>GFLTRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GFLTRG
	 * @generated
	 */
	public Adapter createGFLTRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCFLTRG <em>GCFLTRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCFLTRG
	 * @generated
	 */
	public Adapter createGCFLTRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GLINERG <em>GLINERG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GLINERG
	 * @generated
	 */
	public Adapter createGLINERGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCLINERG <em>GCLINERG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCLINERG
	 * @generated
	 */
	public Adapter createGCLINERGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GMRKRG <em>GMRKRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GMRKRG
	 * @generated
	 */
	public Adapter createGMRKRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCMRKRG <em>GCMRKRG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCMRKRG
	 * @generated
	 */
	public Adapter createGCMRKRGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GRLINERG <em>GRLINERG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GRLINERG
	 * @generated
	 */
	public Adapter createGRLINERGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.GCRLINERG <em>GCRLINERG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.GCRLINERG
	 * @generated
	 */
	public Adapter createGCRLINERGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TonerSaver <em>Toner Saver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TonerSaver
	 * @generated
	 */
	public Adapter createTonerSaverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ColorFidelity <em>Color Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ColorFidelity
	 * @generated
	 */
	public Adapter createColorFidelityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FontFidelity <em>Font Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FontFidelity
	 * @generated
	 */
	public Adapter createFontFidelityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.TextFidelity <em>Text Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.TextFidelity
	 * @generated
	 */
	public Adapter createTextFidelityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MediaFidelity <em>Media Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MediaFidelity
	 * @generated
	 */
	public Adapter createMediaFidelityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FinishingFidelity <em>Finishing Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FinishingFidelity
	 * @generated
	 */
	public Adapter createFinishingFidelityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.CMRFidelity <em>CMR Fidelity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.CMRFidelity
	 * @generated
	 */
	public Adapter createCMRFidelityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectByteExtent <em>Object Byte Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectByteExtent
	 * @generated
	 */
	public Adapter createObjectByteExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectByteOffset <em>Object Byte Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectByteOffset
	 * @generated
	 */
	public Adapter createObjectByteOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectStructuredFieldExtent <em>Object Structured Field Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectStructuredFieldExtent
	 * @generated
	 */
	public Adapter createObjectStructuredFieldExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectStructuredFieldOffset <em>Object Structured Field Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectStructuredFieldOffset
	 * @generated
	 */
	public Adapter createObjectStructuredFieldOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectCount <em>Object Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectCount
	 * @generated
	 */
	public Adapter createObjectCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectOriginIdentifier <em>Object Origin Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectOriginIdentifier
	 * @generated
	 */
	public Adapter createObjectOriginIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LineDataObjectPositionMigration <em>Line Data Object Position Migration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LineDataObjectPositionMigration
	 * @generated
	 */
	public Adapter createLineDataObjectPositionMigrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ColorManagementResourceDescriptor <em>Color Management Resource Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ColorManagementResourceDescriptor
	 * @generated
	 */
	public Adapter createColorManagementResourceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MSURG <em>MSURG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MSURG
	 * @generated
	 */
	public Adapter createMSURGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ImageResolution <em>Image Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ImageResolution
	 * @generated
	 */
	public Adapter createImageResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ObjectContainerPresentationSpaceSize <em>Object Container Presentation Space Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ObjectContainerPresentationSpaceSize
	 * @generated
	 */
	public Adapter createObjectContainerPresentationSpaceSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ExtendedResourceLocalIdentifier <em>Extended Resource Local Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ExtendedResourceLocalIdentifier
	 * @generated
	 */
	public Adapter createExtendedResourceLocalIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.MetricAdjustment <em>Metric Adjustment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.MetricAdjustment
	 * @generated
	 */
	public Adapter createMetricAdjustmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ExtensionFont <em>Extension Font</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ExtensionFont
	 * @generated
	 */
	public Adapter createExtensionFontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.RenderingIntent <em>Rendering Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.RenderingIntent
	 * @generated
	 */
	public Adapter createRenderingIntentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FontCodedGraphicCharacterSetGlobalIdentifier <em>Font Coded Graphic Character Set Global Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FontCodedGraphicCharacterSetGlobalIdentifier
	 * @generated
	 */
	public Adapter createFontCodedGraphicCharacterSetGlobalIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.LocaleSelector <em>Locale Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.LocaleSelector
	 * @generated
	 */
	public Adapter createLocaleSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.FinishingOperation <em>Finishing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.FinishingOperation
	 * @generated
	 */
	public Adapter createFinishingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.UP3iFinishingOperation <em>UP 3i Finishing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.UP3iFinishingOperation
	 * @generated
	 */
	public Adapter createUP3iFinishingOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.DeviceAppearance <em>Device Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.DeviceAppearance
	 * @generated
	 */
	public Adapter createDeviceAppearanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ResourceObjectInclude <em>Resource Object Include</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ResourceObjectInclude
	 * @generated
	 */
	public Adapter createResourceObjectIncludeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.PageOverlayConditionalProcessing <em>Page Overlay Conditional Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.PageOverlayConditionalProcessing
	 * @generated
	 */
	public Adapter createPageOverlayConditionalProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.afplib.ResourceUsageAttribute <em>Resource Usage Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.afplib.ResourceUsageAttribute
	 * @generated
	 */
	public Adapter createResourceUsageAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.base.SF <em>SF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.base.SF
	 * @generated
	 */
	public Adapter createSFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.afplib.base.Triplet <em>Triplet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.afplib.base.Triplet
	 * @generated
	 */
	public Adapter createTripletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AfplibAdapterFactory
