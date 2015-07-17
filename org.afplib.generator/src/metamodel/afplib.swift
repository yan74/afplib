

 import Cocoa
 
 enum SFID: Int {
 case BAG = 13871305
 case BBC = 13871339
 case BCA = 13871223
 case BCF = 13871242
 case BCP = 13871239
 case BDA = 13889259
 case BDD = 13870827
 case BDG = 13871300
 case BDI = 13871271
 case BDM = 13871306
 case BDT = 13871272
 case BDX = 13871331
 case BFG = 13871301
 case BFM = 13871309
 case BFN = 13871241
 case BGR = 13871291
 case BII = 13871227
 case BIM = 13871355
 case BMM = 13871308
 case BMO = 13871327
 case BNG = 13871277
 case BOC = 13871250
 case BOG = 13871303
 case BPF = 13871269
 case BPG = 13871279
 case BPM = 13871307
 case BPS = 13871199
 case BPT = 13871259
 case BRG = 13871302
 case BRS = 13871310
 case BSG = 13871321
 case CAT = 13873271
 case CDD = 13870738
 case CFC = 13870986
 case CFI = 13864074
 case CPC = 13870983
 case CPD = 13870727
 case CPI = 13864071
 case CTC = 13871003
 case DXD = 13870819
 case EAG = 13871561
 case EBC = 13871595
 case ECA = 13871479
 case ECF = 13871498
 case ECP = 13871495
 case EDG = 13871556
 case EDI = 13871527
 case EDM = 13871562
 case EDT = 13871528
 case EDX = 13871587
 case EFG = 13871557
 case EFM = 13871565
 case EFN = 13871497
 case EGR = 13871547
 case EII = 13871483
 case EIM = 13871611
 case EMM = 13871564
 case EMO = 13871583
 case ENG = 13871533
 case EOC = 13871506
 case EOG = 13871559
 case EPF = 13871525
 case EPG = 13871535
 case EPM = 13871563
 case EPS = 13871455
 case EPT = 13871515
 case ERG = 13871558
 case ERS = 13871566
 case ESG = 13871577
 case FNC = 13870985
 case FND = 13870729
 case FNG = 13889161
 case FNI = 13864073
 case FNN = 13872009
 case FNM = 13869705
 case FNO = 13872777
 case FNP = 13872265
 case GAD = 13889211
 case GDD = 13870779
 case ICP = 13872251
 case IDD = 13870843
 case IEL = 13873831
 case IID = 13870715
 case IMM = 13872076
 case IOB = 13873091
 case IOC = 13870971
 case IPD = 13889275
 case IPG = 13873071
 case IPO = 13873112
 case IPS = 13872991
 case IRD = 13889147
 case LLE = 13874320
 case LNC = 13871847
 case LND = 13870823
 case MBC = 13872107
 case MCA = 13871991
 case MCC = 13869704
 case MCD = 13872018
 case MCF = 13872010
 case MCF1 = 13873546
 case MDD = 13870728
 case MDR = 13872067
 case MFC = 13869192
 case MGO = 13872059
 case MIO = 13872123
 case MMC = 13870984
 case MMD = 13872077
 case MMO = 13873631
 case MMT = 13872008
 case MPG = 13872047
 case MPO = 13872088
 case MPS = 13873503
 case MSU = 13872106
 case NOP = 13889262
 case OBD = 13870699
 case OBP = 13872235
 case OCD = 13889170
 case PEC = 13871016
 case PFC = 13873800
 case PGD = 13870767
 case PGP = 13873583
 case PGP1 = 13872303
 case PMC = 13871023
 case PPO = 13872579
 case PTD = 13873563
 case PTD1 = 13870747
 case PTX = 13889179
 case TLE = 13869200
 case FGD = 13870789
 
 }
  
 public class SF {
    var id: Int
    
    init(id: Int) {
        self.id = id
    }
  }
  
 public class Triplet {
  }
  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum BDAFlags: Int {
	      
	      	
    		case ConstHRI = 1
	      	
	      
	      	
    		case ConstPosition1 = 2
	      	
	      
	      	
    		case ConstPosition2 = 4
	      	
	      
	      	
    		case ConstSSCAST = 8
	      	
	      
	      	
	      
	      	
    		case ConstSupressBC = 32
	      	
	      
	      	
    		case ConstSupressBlanks = 64
	      	
	      
	      	
	      
	  }
  
  	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum BDDUBASE: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum BDDReserved: Int {
	      
	      	
	        case ConstReserved = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  	  public enum BDDReserved2: Int {
	      
	      	
	        case ConstReserved = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum BDDTYPE: Int {
	      
	      	
	        case ConstCode39 = 1
	      	
	      
	      	
	        case ConstMSI = 2
	      	
	      
	      	
	        case ConstUPCCGPCA = 3
	      	
	      
	      	
	        case ConstUPCCGPCE = 5
	      	
	      
	      	
	        case ConstUPC2 = 6
	      	
	      
	      	
	        case ConstUPC5 = 7
	      	
	      
	      	
	        case ConstEAN8 = 8
	      	
	      
	      	
	        case ConstEAN13 = 9
	      	
	      
	      	
	        case ConstIndustrial2of5 = 10
	      	
	      
	      	
	        case ConstMatrix2of5 = 11
	      	
	      
	      	
	        case ConstInterleaved2of5 = 12
	      	
	      
	      	
	        case ConstCodabar2of7 = 13
	      	
	      
	      	
	        case ConstCode128 = 17
	      	
	      
	      	
	        case ConstEAN2digit = 22
	      	
	      
	      	
	        case ConstEAN5digit = 23
	      	
	      
	      	
	        case ConstPOSTNET = 24
	      	
	      
	      	
	        case ConstRM4SCC = 26
	      	
	      
	      	
	        case ConstJapanPostalBarCode = 27
	      	
	      
	      	
	        case ConstDataMatrix = 28
	      	
	      
	      	
	        case ConstMaxiCode = 29
	      	
	      
	      	
	        case ConstPDF417 = 30
	      	
	      
	      	
	        case ConstAustraliaPostBarCode = 31
	      	
	      
	      	
	        case ConstQRCode = 32
	      	
	      
	      	
	        case ConstCode93 = 33
	      	
	      
	      	
	        case ConstUSPS = 34
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum BDDCOLOR: Int {
	      
	      	
	        case ConstDevicedefault = 0
	      	
	      
	      	
	        case ConstDevicedefault2 = 65280
	      	
	      
	      	
	        case ConstBlue = 1
	      	
	      
	      	
	        case ConstBlue2 = 65281
	      	
	      
	      	
	        case ConstRed = 2
	      	
	      
	      	
	        case ConstRed2 = 65282
	      	
	      
	      	
	        case ConstPinkMagenta = 3
	      	
	      
	      	
	        case ConstPinkMagenta2 = 65283
	      	
	      
	      	
	        case ConstGreen = 4
	      	
	      
	      	
	        case ConstGreen2 = 65284
	      	
	      
	      	
	        case ConstTurquoiseCyan = 5
	      	
	      
	      	
	        case ConstTurquoiseCyan2 = 65285
	      	
	      
	      	
	        case ConstYellow = 6
	      	
	      
	      	
	        case ConstYellow2 = 65286
	      	
	      
	      	
	        case ConstBlack = 8
	      	
	      
	      	
	        case ConstBrown = 16
	      	
	      
	      	
	        case ConstDevicedefault3 = 65287
	      	
	      
	      	
	        case ConstResetColor = 65288
	      	
	      
	      	
	        case ConstDefaultIndicator = 65535
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
  	  public enum BDMDatFmt: Int {
	      
	      	
	        case ConstLND = 0
	      	
	      
	      	
	        case ConstRCD = 1
	      	
	      
	      	
	        case ConstXMD = 2
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum CDDXocBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum CDDYocBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum CFCCFIRGLen: Int {
	      
	      	
	        case ConstCFIRGLen19 = 25
	      	
	      
  	  }
	  
	  
	  
  	  public enum CFCRetired1: Int {
	      
	      	
	        case ConstRetired1 = 1
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
  	  public enum CPCPrtFlags: Int {
	      
	      	
    		case ConstInvalid = 1
	      	
	      
	      	
    		case ConstPresentation = 2
	      	
	      
	      	
    		case ConstIncrement = 4
	      	
	      
	  }
  
  	  
	  
	  
  	  public enum CPCCPIRGLen: Int {
	      
	      	
	        case ConstSingleByte = 10
	      	
	      
	      	
	        case ConstDoubleByte = 11
	      	
	      
	      	
	        case ConstSingleByteWithUnicodeScalar = 254
	      	
	      
	      	
	        case ConstDoubleByteWithUnicodeScalar = 221
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum CPCVSFlags: Int {
	      
	      	
    		case ConstSortOrder = 1
	      	
	      
	      	
    		case ConstVariableSpace = 16
	      	
	      
	  }
  
  	  
	  

	  
	  
	  
	  
  	  public enum CPDGCGIDLen: Int {
	      
	      	
	        case ConstGCGIDLen = 8
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
  	  public enum CPDEncScheme: Int {
	      
	      	
	        case ConstNoEncodingSpecified = 0
	      	
	      
	      	
	        case ConstSingleByteNoEncodingSpecified = 256
	      	
	      
	      	
	        case ConstDoubleByteNoEncodingSpecified = 512
	      	
	      
	      	
	        case ConstSingleByteIBMPC = 8448
	      	
	      
	      	
	        case ConstSingleByteEBCDIC = 24832
	      	
	      
	      	
	        case ConstDoubleByteEBCDIC = 25088
	      	
	      
	      	
	        case ConstDoubleByteUCS = 33280
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  

	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum FNCRetired: Int {
	      
	      	
	        case ConstRetired = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCPatTech: Int {
	      
	      	
	        case ConstLaserMatrixNbitWide = 5
	      	
	      
	      	
	        case ConstCIDKeyedfontType0 = 30
	      	
	      
	      	
	        case ConstPFBType1 = 31
	      	
	      
  	  }
	  
	  
	  
	  
	  
  	  public enum FNCFntFlags: Int {
	      
	      	
    		case ConstPrintingType = 1
	      	
	      
	      	
    		case ConstExtensionType = 2
	      	
	      
	      	
	      
	      	
	      
	      	
    		case ConstRetired = 16
	      	
	      
	      	
	      
	      	
    		case ConstUniformCharacterBoxFont = 64
	      	
	      
	      	
	      
	  }
  
  	  
	  
	  
  	  public enum FNCXUnitBase: Int {
	      
	      	
	        case ConstFixedMetric10inches = 0
	      	
	      
	      	
	        case ConstRelativeMetrics = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCYUnitBase: Int {
	      
	      	
	        case ConstFixedMetric10inches = 0
	      	
	      
	      	
	        case ConstRelativeMetrics = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCXftUnits: Int {
	      
	      	
	        case Const240dpi = 2400
	      	
	      
	      	
	        case Const300dpi = 3000
	      	
	      
	      	
	        case Const1000unitsperemrelative = 1000
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCYftUnits: Int {
	      
	      	
	        case Const240dpi = 2400
	      	
	      
	      	
	        case Const300dpi = 3000
	      	
	      
	      	
	        case Const1000unitsperemrelative = 1000
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum FNCFNORGLen: Int {
	      
	      	
	        case ConstFNOSize = 26
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCFNIRGLen: Int {
	      
	      	
	        case ConstFNISize10 = 10
	      	
	      
	      	
	        case ConstFNISize28 = 28
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCPatAlign: Int {
	      
	      	
	        case Const1ByteAlignment = 0
	      	
	      
	      	
	        case Const4ByteAlignment = 2
	      	
	      
	      	
	        case Const8ByteAlignment = 3
	      	
	      
  	  }
	  
	  
	  
	  
	  
  	  public enum FNCFNPRGLen: Int {
	      
	      	
	        case ConstFNPSize = 22
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCFNMRGLen: Int {
	      
	      	
	        case ConstNoRasterData = 0
	      	
	      
	      	
	        case ConstWithRasterData = 8
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCResXUBase: Int {
	      
	      	
	        case ConstShaperesultion10inches = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCResYUBase: Int {
	      
	      	
	        case ConstShaperesultion10inches = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCXfrUnits: Int {
	      
	      	
	        case ConstNoshaperesolutionprovided = 0
	      	
	      
	      	
	        case Const240dpi = 2400
	      	
	      
	      	
	        case Const300dpi = 3000
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNCYfrUnits: Int {
	      
	      	
	        case ConstNoshaperesolutionprovided = 0
	      	
	      
	      	
	        case Const240dpi = 2400
	      	
	      
	      	
	        case Const300dpi = 3000
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum FNCFNNRGLen: Int {
	      
	      	
	        case ConstFNNSize = 12
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
  	  public enum FNDFtWtClass: Int {
	      
	      	
	        case ConstUltralight = 1
	      	
	      
	      	
	        case ConstExtralight = 2
	      	
	      
	      	
	        case ConstLight = 3
	      	
	      
	      	
	        case ConstSemilight = 4
	      	
	      
	      	
	        case ConstMediumNormal = 5
	      	
	      
	      	
	        case ConstSemibold = 6
	      	
	      
	      	
	        case ConstBold = 7
	      	
	      
	      	
	        case ConstExtrabold = 8
	      	
	      
	      	
	        case ConstUltrabold = 9
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNDFtWdClass: Int {
	      
	      	
	        case ConstUltracondensed = 1
	      	
	      
	      	
	        case ConstExtracondensed = 2
	      	
	      
	      	
	        case ConstCondensed = 3
	      	
	      
	      	
	        case ConstSemicondensed = 4
	      	
	      
	      	
	        case ConstMediumNormal = 5
	      	
	      
	      	
	        case ConstSemiexpanded = 6
	      	
	      
	      	
	        case ConstExpanded = 7
	      	
	      
	      	
	        case ConstExtraexpanded = 8
	      	
	      
	      	
	        case ConstUltraexpanded = 9
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  	  public enum FNDFtDsFlags: Int {
	      
	      	
    		case ConstItalic = 1
	      	
	      
	      	
    		case ConstUnderscored = 2
	      	
	      
	      	
	      
	      	
    		case ConstSolid = 8
	      	
	      
	      	
    		case ConstOverstruck = 16
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	  }
  
  	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum FNNIBMFormat: Int {
	      
	      	
	        case ConstEBCDICGCGID = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum FNNTechnologyFormat: Int {
	      
	      	
	        case ConstFontspecificASCIIcharacternameusedwithType1PFBfonts = 3
	      	
	      
	      	
	        case ConstCMAPbinarycodepointusedwithCIDkeyedfonts = 5
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum IDDUNITBASE: Int {
	      
	      	
	        case Const10inches = 0
	      	
	      
	      	
	        case Const10centimeters = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
  	  public enum IOBObjType: Int {
	      
	      	
	        case ConstPageSegment = 95
	      	
	      
	      	
	        case ConstOtherobjectdata = 146
	      	
	      
	      	
	        case ConstGraphicsGOCA = 187
	      	
	      
	      	
	        case ConstBarCodeBCOCA = 235
	      	
	      
	      	
	        case ConstImageIOCA = 251
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum IOBXoaOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
  	  public enum IOBYoaOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum IOBRefCSys: Int {
	      
	      	
	        case ConstPageoroverlaycoordinatesystem = 1
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
  	  public enum IPGIPgFlgs: Int {
	      
	      	
    		case ConstFormat = 1
	      	
	      
	  }
  
  	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
  	  public enum IPOOvlyOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum MDDXmBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum MDDYmBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  	  public enum MDDMDDFlgs: Int {
	      
	      	
    		case ConstCutSheetOrientation = 1
	      	
	      
	  }
  
  	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum MFCMFCFlgs: Int {
	      
	      	
    		case ConstActivateMediumFinishControl = 1
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	  }
  
  	  
	  
	  
  	  public enum MFCMedColl: Int {
	      
	      	
	        case ConstNosheetcollection = 0
	      	
	      
	      	
	        case ConstBeginsheetcollection = 1
	      	
	      
	      	
	        case ConstContinuesheetcollection = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum MFCMFCScpe: Int {
	      
	      	
	        case ConstPrintLevel = 1
	      	
	      
	      	
	        case ConstDocumentLevelAll = 2
	      	
	      
	      	
	        case ConstDocumentLevelSelected = 3
	      	
	      
	      	
	        case ConstMediumLeveleach = 4
	      	
	      
	      	
	        case ConstMediumLevelcollection = 5
	      	
	      
	      	
	        case ConstRetired = 6
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
  	  public enum MMCPARAMETER1: Int {
	      
	      	
	        case ConstReserved = 255
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum MMORGLength: Int {
	      
	      	
	        case ConstLength12 = 12
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum MPSRGLength: Int {
	      
	      	
	        case ConstLength12 = 12
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
  	  public enum OBPRGLength: Int {
	      
	      	
	        case ConstLength23 = 23
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum OBPXoaOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
  	  public enum OBPYoaOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum OBPXocaOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum OBPYocaOrent: Int {
	      
	      	
	        case Const90degrees = 11520
	      	
	      
  	  }
	  
	  
	  
  	  public enum OBPRefCSys: Int {
	      
	      	
	        case ConstPageOrOverlayIPSDefinesOrigin = 0
	      	
	      
	      	
	        case ConstPageOrOverlay = 1
	      	
	      
	      	
	        case ConstRetired = 5
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum PFCPFCFlgs: Int {
	      
	      	
    		case ConstReset = 1
	      	
	      
	  }
  
  	  
	  
	  
	  

	  
	  
  	  public enum PGDXpgBase: Int {
	      
	      	
	        case Const10inches = 0
	      	
	      
	      	
	        case Const10centimeters = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum PGDYpgBase: Int {
	      
	      	
	        case Const10inches = 0
	      	
	      
	      	
	        case Const10centimeters = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum PGPConstant: Int {
	      
	      	
	        case ConstReserved = 1
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum PTDXPBASE: Int {
	      
	      	
	        case ConstTeninches = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum PTDYPBASE: Int {
	      
	      	
	        case ConstTeninches = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum PTD1XPBASE: Int {
	      
	      	
	        case ConstTeninches = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum PTD1YPBASE: Int {
	      
	      	
	        case ConstTeninches = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

  
	  
	  
	  

	  
	  
	  

	  

	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum OVSBYPSIDEN: Int {
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
    		case ConstBypassRelativeMoveInline = 16
	      	
	      
	      	
    		case ConstBypassAbsoluteMoveInline = 32
	      	
	      
	      	
    		case ConstBypassspacecharacters = 64
	      	
	      
	      	
    		case ConstNoBypassinEffect = 128
	      	
	      
	  }
  
  	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
  	  public enum SECCOLSPCE: Int {
	      
	      	
	        case ConstRGB = 1
	      	
	      
	      	
	        case ConstCMYK = 4
	      	
	      
	      	
	        case ConstHighlight = 6
	      	
	      
	      	
	        case ConstCIELAB = 8
	      	
	      
	      	
	        case ConstOCA = 64
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
  	  public enum SIADIRCTION: Int {
	      
	      	
	        case ConstPositiveIdirection = 0
	      	
	      
	      	
	        case ConstNegativeIdirection = 1
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
  	  public enum STCFRGCOLOR: Int {
	      
	      	
	        case ConstDevicedefault = 0
	      	
	      
	      	
	        case ConstDevicedefault2 = 65280
	      	
	      
	      	
	        case ConstBlue = 1
	      	
	      
	      	
	        case ConstBlue2 = 65281
	      	
	      
	      	
	        case ConstRed = 2
	      	
	      
	      	
	        case ConstRed2 = 65282
	      	
	      
	      	
	        case ConstPinkMagenta = 3
	      	
	      
	      	
	        case ConstPinkMagenta2 = 65283
	      	
	      
	      	
	        case ConstGreen = 4
	      	
	      
	      	
	        case ConstGreen2 = 65284
	      	
	      
	      	
	        case ConstTurquoiseCyan = 5
	      	
	      
	      	
	        case ConstTurquoiseCyan2 = 65285
	      	
	      
	      	
	        case ConstYellow = 6
	      	
	      
	      	
	        case ConstYellow2 = 65286
	      	
	      
	      	
	        case ConstBlack = 8
	      	
	      
	      	
	        case ConstBrown = 16
	      	
	      
	      	
	        case ConstDevicedefault3 = 65287
	      	
	      
	      	
	        case ConstResetColor = 65288
	      	
	      
	      	
	        case ConstDefaultIndicator = 65535
	      	
	      
  	  }
	  
	  
	  
  	  public enum STCPRECSION: Int {
	      
	      	
	        case ConstMustsupport = 0
	      	
	      
	      	
	        case ConstMayusedefault = 1
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum STOIORNTION: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
  	  public enum STOBORNTION: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
  	  public enum TBMDIRCTION: Int {
	      
	      	
	        case ConstDonotchangethebaseline = 0
	      	
	      
	      	
	        case ConstReturntotheestablishedbaseline = 1
	      	
	      
	      	
	        case ConstAwayfromtheIaxis = 2
	      	
	      
	      	
	        case ConstTowardtheIaxis = 3
	      	
	      
  	  }
	  
	  
	  
  	  public enum TBMPRECSION: Int {
	      
	      	
	        case ConstExact = 0
	      	
	      
	      	
	        case ConstMaybesimulated = 1
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum USCBYPSIDEN: Int {
	      
	      	
	      
	      	
	      
	      	
	      
	      	
	      
	      	
    		case ConstBypassRelativeMoveInline = 16
	      	
	      
	      	
    		case ConstBypassAbsoluteMoveInline = 32
	      	
	      
	      	
    		case ConstBypassspacecharacters = 64
	      	
	      
	      	
    		case ConstNoBypassinEffect = 128
	      	
	      
	  }
  
  	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum CRCResourceManagementFmtQual: Int {
	      
	      	
	        case ConstObjectCyclicRedundancyCheck = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum ColorSpecificationColSpce: Int {
	      
	      	
	        case ConstRGB = 1
	      	
	      
	      	
	        case ConstCMYK = 4
	      	
	      
	      	
	        case ConstHighlight = 6
	      	
	      
	      	
	        case ConstCIELAB = 8
	      	
	      
	      	
	        case ConstOCA = 64
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
  	  public enum DataObjectFontDescriptorFontTech: Int {
	      
	      	
	        case ConstTrueType = 32
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum DataObjectFontDescriptorCharRot: Int {
	      
	      	
	        case Const0 = 0
	      	
	      
	      	
	        case Const90 = 11520
	      	
	      
	      	
	        case Const180 = 23040
	      	
	      
	      	
	        case Const270 = 34560
	      	
	      
  	  }
	  
	  
	  
  	  public enum DataObjectFontDescriptorEncEnv: Int {
	      
	      	
	        case ConstMicrosoft = 3
	      	
	      
  	  }
	  
	  
	  
  	  public enum DataObjectFontDescriptorEncID: Int {
	      
	      	
	        case ConstUnicode = 1
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum EncodingSchemeIDESidCP: Int {
	      
	      	
	        case ConstNotSpecified = 0
	      	
	      
	      	
	        case ConstdefaultSBCSencoding = 256
	      	
	      
	      	
	        case ConstdefaultDBCSencoding = 512
	      	
	      
	      	
	        case ConstPCDataSBCSASCIIbased = 8448
	      	
	      
	      	
	        case ConstPCDisplaySBCSASCIIbased = 12544
	      	
	      
	      	
	        case ConstEBCDICPresentationSBCS = 24832
	      	
	      
	      	
	        case ConstEBCDICPresentationDBCS = 25088
	      	
	      
	      	
	        case ConstUTF16 = 29184
	      	
	      
	      	
	        case ConstUnicodebigendian = 33280
	      	
	      
  	  }
	  
	  
	  
  	  public enum EncodingSchemeIDESidUD: Int {
	      
	      	
	        case ConstUTF16BE = 29184
	      	
	      
	      	
	        case ConstUTF8 = 30727
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum FontResolutionMetTech: Int {
	      
	      	
	        case ConstFixedmetric = 1
	      	
	      
	      	
	        case ConstRelativemetric = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum FontResolutionRPuBase: Int {
	      
	      	
	        case Const10inches = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum FontResolutionRPUnits: Int {
	      
	      	
	        case Const240dpi = 2400
	      	
	      
	      	
	        case Const300dpi = 3000
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum FullyQualifiedNameFQNType: Int {
	      
	      	
	        case ConstReplaceFirstGIDName = 1
	      	
	      
	      	
	        case ConstFontFamilyName = 7
	      	
	      
	      	
	        case ConstFontTypefaceName = 8
	      	
	      
	      	
	        case ConstMODCAResourceHierarchyReference = 9
	      	
	      
	      	
	        case ConstBeginResourceGroupReference = 10
	      	
	      
	      	
	        case ConstAttributeGID = 11
	      	
	      
	      	
	        case ConstProcessElementGID = 12
	      	
	      
	      	
	        case ConstBeginPageGroupReference = 13
	      	
	      
	      	
	        case ConstMediaTypeReference = 17
	      	
	      
	      	
	        case ConstMediaDestinationReference = 18
	      	
	      
	      	
	        case ConstColorManagementResourceCMRReference = 65
	      	
	      
	      	
	        case ConstDataobjectFontBaseFontIdentifier = 110
	      	
	      
	      	
	        case ConstDataobjectFontLinkedFontIdentifier = 126
	      	
	      
	      	
	        case ConstBeginDocumentReference = 131
	      	
	      
	      	
	        case ConstResourceObjectReference = 132
	      	
	      
	      	
	        case ConstCodePageNameReference = 133
	      	
	      
	      	
	        case ConstFontCharacterSetNameReference = 134
	      	
	      
	      	
	        case ConstBeginPageReference = 135
	      	
	      
	      	
	        case ConstBeginMediumMapReference = 141
	      	
	      
	      	
	        case ConstCodedFontNameReference = 142
	      	
	      
	      	
	        case ConstBeginDocumentIndexReference = 152
	      	
	      
	      	
	        case ConstBeginOverlayReference = 176
	      	
	      
	      	
	        case ConstDataObjectInternalResourceReference = 190
	      	
	      
	      	
	        case ConstIndexElementGID = 202
	      	
	      
	      	
	        case ConstOtherObjectDataReference = 206
	      	
	      
	      	
	        case ConstDataObjectExternalResourceReference = 222
	      	
	      
  	  }
	  
	  
	  
  	  public enum FullyQualifiedNameFQNFormat: Int {
	      
	      	
	        case ConstCharacterstring = 0
	      	
	      
	      	
	        case ConstOID = 16
	      	
	      
	      	
	        case ConstURL = 32
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
  	  public enum LocalDateAndTimeStampStampType: Int {
	      
	      	
	        case ConstCreation = 0
	      	
	      
	      	
	        case ConstRetired = 1
	      	
	      
	      	
	        case ConstRevision = 3
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum MappingOptionMapValue: Int {
	      
	      	
	        case ConstPosition = 0
	      	
	      
	      	
	        case ConstPositionandtrim = 16
	      	
	      
	      	
	        case ConstScaletofit = 32
	      	
	      
	      	
	        case ConstCenterandtrim = 48
	      	
	      
	      	
	        case ConstImagepointtopel = 65
	      	
	      
	      	
	        case ConstImagepointtopelwithdoubledot = 66
	      	
	      
	      	
	        case ConstReplicateandtrim = 80
	      	
	      
	      	
	        case ConstScaletofill = 96
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum MediaEjectControlReserved: Int {
	      
	      	
	        case ConstZero = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum MediaEjectControlEjCtrl: Int {
	      
	      	
	        case ConstEject = 1
	      	
	      
	      	
	        case ConstConditionalejecttonextpartition = 2
	      	
	      
	      	
	        case ConstConditionalejecttonextfrontsidepartition = 3
	      	
	      
	      	
	        case ConstConditionalejecttonextbacksidepartition = 4
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
  	  public enum MediumOrientationMedOrient: Int {
	      
	      	
	        case ConstPortrait = 0
	      	
	      
	      	
	        case ConstLandscape = 1
	      	
	      
	      	
	        case ConstReversePortrait = 2
	      	
	      
	      	
	        case ConstReverseLandscape = 3
	      	
	      
	      	
	        case ConstPortrait90 = 4
	      	
	      
	      	
	        case ConstLandscape90 = 5
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum MeasurementUnitsXoaBase: Int {
	      
	      	
	        case Const10inches = 0
	      	
	      
	      	
	        case Const10centimeters = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum MeasurementUnitsYoaBase: Int {
	      
	      	
	        case Const10inches = 0
	      	
	      
	      	
	        case Const10centimeters = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum MODCAInterchangeSetIStype: Int {
	      
	      	
	        case ConstPresentation = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum MODCAInterchangeSetISid: Int {
	      
	      	
	        case ConstIS1 = 2304
	      	
	      
	      	
	        case ConstRetired = 3072
	      	
	      
	      	
	        case ConstIS3 = 3328
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum ObjectAreaSizeSizeType: Int {
	      
	      	
	        case ConstObjectAreaSize = 2
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ObjectClassificationObjClass: Int {
	      
	      	
	        case ConstTimeinvariant = 1
	      	
	      
	      	
	        case ConstTimevariant = 16
	      	
	      
	      	
	        case ConstExecutableprogram = 32
	      	
	      
	      	
	        case ConstSetupfile = 48
	      	
	      
	      	
	        case ConstSecondaryResourceegColorProfile = 64
	      	
	      
	      	
	        case ConstDataobjectfont = 65
	      	
	      
  	  }
	  
	  
	  
  	  public enum ObjectClassificationStrucFlgs: Int {
	      
	      	
    		case ConstObjectContainer = 1
	      	
	      
	      	
    		case ConstObjectContainer2 = 2
	      	
	      
	      	
    		case ConstObjectEnvironmentGroup = 4
	      	
	      
	      	
    		case ConstObjectEnvironmentGroup2 = 8
	      	
	      
	      	
    		case ConstObjectContainerData = 16
	      	
	      
	      	
    		case ConstObjectContainerData2 = 32
	      	
	      
	  }
  
  	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ObjectFunctionSetSpecificationObjType: Int {
	      
	      	
	        case ConstPresentationText = 2
	      	
	      
	      	
	        case ConstGraphics = 3
	      	
	      
	      	
	        case ConstBarCode = 5
	      	
	      
	      	
	        case ConstImage = 6
	      	
	      
  	  }
	  
	  
	  
  	  public enum ObjectFunctionSetSpecificationArchVrsn: Int {
	      
	      	
	        case ConstVersion0 = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum ObjectFunctionSetSpecificationDCAFnSet: Int {
	      
	      	
	        case ConstFunctionSet8000 = 32768
	      	
	      
  	  }
	  
	  
	  
  	  public enum ObjectFunctionSetSpecificationOCAFnSet: Int {
	      
	      	
	        case ConstPT1BCD1 = 0
	      	
	      
	      	
	        case ConstGRS2PT2 = 16384
	      	
	      
	      	
	        case ConstFS10 = 32768
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum ObjectOffsetObjTpe: Int {
	      
	      	
	        case ConstDocument = 168
	      	
	      
	      	
	        case ConstPageorpaginatedobject = 175
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ResourceObjectTypeObjType: Int {
	      
	      	
	        case ConstGOCA = 3
	      	
	      
	      	
	        case ConstBCOCA = 5
	      	
	      
	      	
	        case ConstIOCA = 6
	      	
	      
	      	
	        case ConstFontCharacterSet = 64
	      	
	      
	      	
	        case ConstCodePage = 65
	      	
	      
	      	
	        case ConstCodedFont = 66
	      	
	      
	      	
	        case ConstObjectContainer = 146
	      	
	      
	      	
	        case ConstDocument = 168
	      	
	      
	      	
	        case ConstPageSegment = 251
	      	
	      
	      	
	        case ConstOverlay = 252
	      	
	      
	      	
	        case ConstPagedef = 253
	      	
	      
	      	
	        case ConstFormMap = 254
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum PresentationControlPRSFlg: Int {
	      
	      	
    		case ConstObjectviewcontrol = 1
	      	
	      
	      	
    		case ConstObjectindexingcontrol = 2
	      	
	      
	  }
  
  	  
	  

	  
	  
	  

	  

	  
	  
  	  public enum ResourceLocalIdentifierResType: Int {
	      
	      	
	        case ConstUsageDependent = 0
	      	
	      
	      	
	        case ConstPageOverlay = 2
	      	
	      
	      	
	        case ConstCodedFont = 5
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum TextOrientationIAxis: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
  	  public enum TextOrientationBAxis: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
  	  public enum FontDescriptorSpecificationFtWtClass: Int {
	      
	      	
	        case ConstNotspecified = 0
	      	
	      
	      	
	        case ConstUltralight = 1
	      	
	      
	      	
	        case ConstExtralight = 2
	      	
	      
	      	
	        case ConstLight = 3
	      	
	      
	      	
	        case ConstSemilight = 4
	      	
	      
	      	
	        case ConstMediumNormal = 5
	      	
	      
	      	
	        case ConstSemibold = 6
	      	
	      
	      	
	        case ConstBold = 7
	      	
	      
	      	
	        case ConstExtrabold = 8
	      	
	      
	      	
	        case ConstUltrabold = 9
	      	
	      
  	  }
	  
	  
	  
  	  public enum FontDescriptorSpecificationFtWdClass: Int {
	      
	      	
	        case ConstNotspecified = 0
	      	
	      
	      	
	        case ConstUltracondensed = 1
	      	
	      
	      	
	        case ConstExtracondensed = 2
	      	
	      
	      	
	        case ConstCondensed = 3
	      	
	      
	      	
	        case ConstSemicondensed = 4
	      	
	      
	      	
	        case ConstMediumNormal = 5
	      	
	      
	      	
	        case ConstSemiexpanded = 6
	      	
	      
	      	
	        case ConstExpanded = 7
	      	
	      
	      	
	        case ConstExtraexpanded = 8
	      	
	      
	      	
	        case ConstUltraexpanded = 9
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum FontDescriptorSpecificationFtDsFlags: Int {
	      
	      	
    		case ConstItalic = 1
	      	
	      
	      	
    		case ConstUnderscored = 2
	      	
	      
	      	
	      
	      	
    		case ConstSolid = 8
	      	
	      
	      	
    		case ConstOverstruck = 16
	      	
	      
	      	
    		case ConstProportionallyspaced = 32
	      	
	      
	      	
    		case ConstPairwisekerned = 64
	      	
	      
	      	
    		case ConstParameterisspecified = 128
	      	
	      
	  }
  
  	  
	  
	  
  	  public enum FontDescriptorSpecificationFtUsFlags: Int {
	      
	      	
    		case ConstOutlineFont = 2
	      	
	      
	      	
    		case ConstTransformable = 4
	      	
	      
	  }
  
  	  
	  

	  
	  
	  

	  

	  

	  

	  

	  

	  
	  
	  

	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ImageEncodingCOMPRID: Int {
	      
	      	
	        case ConstIBMMMR = 1
	      	
	      
	      	
	        case ConstNoCompression = 3
	      	
	      
	      	
	        case ConstRL4 = 6
	      	
	      
	      	
	        case ConstABIC = 8
	      	
	      
	      	
	        case ConstConcatenatedABIC = 10
	      	
	      
	      	
	        case ConstOS2Compression = 11
	      	
	      
	      	
	        case ConstTIFFLZW = 13
	      	
	      
	      	
	        case ConstSolidFillRectangle = 32
	      	
	      
	      	
	        case ConstG3MH = 128
	      	
	      
	      	
	        case ConstG3MR = 129
	      	
	      
	      	
	        case ConstG4MMR = 130
	      	
	      
	      	
	        case ConstJPEG = 131
	      	
	      
  	  }
	  
	  
	  
  	  public enum ImageEncodingRECID: Int {
	      
	      	
	        case ConstRIDIC = 1
	      	
	      
	      	
	        case ConstBottomtotop = 3
	      	
	      
	      	
	        case ConstUnpaddedRIDIC = 4
	      	
	      
	      	
	        case ConstExternal = 254
	      	
	      
  	  }
	  
	  
	  
  	  public enum ImageEncodingBITORDR: Int {
	      
	      	
	        case ConstLefttoright = 0
	      	
	      
	      	
	        case ConstRighttoleft = 1
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum IDEStructureFLAGS: Int {
	      
	      	
    		case ConstSubtractive = 1
	      	
	      
	      	
    		case ConstGrayCoding = 2
	      	
	      
	  }
  
  	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ExternalAlgorithmALGTYPE: Int {
	      
	      	
	        case ConstRecordingalgorithm = 0
	      	
	      
	      	
	        case ConstCompressionalgorithm = 16
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum TileSetColorCSPACE: Int {
	      
	      	
	        case ConstCMYK = 4
	      	
	      
	      	
	        case ConstCIELab = 8
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
  	  public enum PPORGObjType: Int {
	      
	      	
	        case ConstOtherObjectData = 146
	      	
	      
	      	
	        case ConstOverlay = 223
	      	
	      
	      	
	        case ConstIOCAImage = 251
	      	
	      
  	  }
	  
	  
	  
  	  public enum PPORGProcFlgs: Int {
	      
	      	
    		case ConstDegree0 = 1
	      	
	      
	      	
    		case ConstDegree90 = 2
	      	
	      
	      	
    		case ConstDegree180 = 4
	      	
	      
	      	
    		case ConstDegree270 = 8
	      	
	      
	      	
    		case ConstPreprocessAll = 16
	      	
	      
	  }
  
  	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum PGPRGRGLength: Int {
	      
	      	
	        case ConstLength10 = 10
	      	
	      
	      	
	        case ConstLength12 = 12
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum PGPRGPGorient: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  
	  
  	  public enum PGPRGSHside: Int {
	      
	      	
	        case ConstFrontSide = 0
	      	
	      
	      	
	        case ConstBackSide = 1
	      	
	      
	      	
	        case ConstPartition1Front = 16
	      	
	      
	      	
	        case ConstPartition1Back = 17
	      	
	      
	      	
	        case ConstPartition2Front = 32
	      	
	      
	      	
	        case ConstPartition2Back = 33
	      	
	      
	      	
	        case ConstPartition3Front = 48
	      	
	      
	      	
	        case ConstPartition3Back = 49
	      	
	      
	      	
	        case ConstPartition4Front = 64
	      	
	      
	      	
	        case ConstPartition4Back = 65
	      	
	      
  	  }
	  
	  
	  
  	  public enum PGPRGPgFlgs: Int {
	      
	      	
    		case ConstVariablePageData = 1
	      	
	      
	      	
    		case ConstPMCOverlays = 2
	      	
	      
	      	
    		case ConstPMCOverlayPosition = 4
	      	
	      
	      	
    		case ConstPageViewControl = 8
	      	
	      
	  }
  
  	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum MMCRGkey: Int {
	      
	      	
	        case ConstHorizontalprintadjustment = 14
	      	
	      
	      	
	        case ConstMediaselectorhigh = 144
	      	
	      
	      	
	        case ConstMediaselectorlow = 145
	      	
	      
	      	
	        case ConstFixedmediuminformation = 160
	      	
	      
	      	
	        case ConstFixedperforationcut = 161
	      	
	      
	      	
	        case ConstFixedseparationcut = 162
	      	
	      
	      	
	        case ConstPresentationsubsystemsetupIDhighorderbyte = 180
	      	
	      
	      	
	        case ConstPresentationsubsystemsetupIDloworderbyte = 181
	      	
	      
	      	
	        case ConstOffsetstackedgemarkchange = 209
	      	
	      
	      	
	        case ConstMediasourceselectionformat = 224
	      	
	      
	      	
	        case ConstMediasourceselector = 225
	      	
	      
	      	
	        case ConstMediatypelocalIDhighorderbyte = 232
	      	
	      
	      	
	        case ConstMediatypelocalIDloworderbyte = 233
	      	
	      
	      	
	        case ConstFormsflash = 241
	      	
	      
	      	
	        case ConstMediumoverlaylocalidentifier = 242
	      	
	      
	      	
	        case ConstTextsuppresionlocalidentifier = 243
	      	
	      
	      	
	        case ConstDuplexcontrol = 244
	      	
	      
	      	
	        case ConstPrintqualitycontrol = 248
	      	
	      
	      	
	        case ConstConstantformscontrol = 249
	      	
	      
	      	
	        case ConstNUpformatcontrol = 252
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
  	  public enum ExternalAlgorithmRGPADBDRY: Int {
	      
	      	
	        case Const32bitboundary = 3
	      	
	      
  	  }
	  
	  
	  
  	  public enum ExternalAlgorithmRGPADALMT: Int {
	      
	      	
	        case ConstDataleftaligned = 0
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum BeginSegmentCommandLENGTH: Int {
	      
	      	
	        case ConstLength0C = 12
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
  	  public enum BeginSegmentCommandFLAG2: Int {
	      
	      	
    		case ConstChained = 1
	      	
	      
	      	
    		case ConstProlog = 8
	      	
	      
	      	
    		case ConstNewSegment1 = 32
	      	
	      
	      	
    		case ConstNewSegment2 = 64
	      	
	      
	  }
  
  	  
	  
	  
	  
	  
	  

	  

	  
	  
  	  public enum GBARFLAGS: Int {
	      
	      	
    		case ConstRES1 = 1
	      	
	      
	      	
    		case ConstBOUNDARY = 2
	      	
	      
	      	
    		case ConstINSIDE = 4
	      	
	      
	  }
  
  	  
	  

	  
	  
	  
	  
	  
	  
  	  public enum GBIMGFORMAT: Int {
	      
	      	
	        case Const1to1 = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum GBIMGRES: Int {
	      
	      	
	        case ConstRES = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum GCBIMGFORMAT: Int {
	      
	      	
	        case Const1to1 = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum GCBIMGRES: Int {
	      
	      	
	        case ConstRES = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum GBOXRES: Int {
	      
	      	
	        case ConstRES = 8192
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum GCBOXRES: Int {
	      
	      	
	        case ConstRES = 8192
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum GEPROLRES: Int {
	      
	      	
	        case ConstRES = 0
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
	  

	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum GSBMXMODE: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
	      	
	        case ConstLeaveAlone = 5
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum GSCDDIRECTION: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
	      	
	        case ConstLeft2Right = 1
	      	
	      
	      	
	        case ConstTop2Bottom = 2
	      	
	      
	      	
	        case ConstRight2Left = 3
	      	
	      
	      	
	        case ConstBottom2Top = 4
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum GSCRPREC: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
	      	
	        case ConstString = 1
	      	
	      
	      	
	        case ConstCharacter = 2
	      	
	      
	      	
	        case ConstStroke = 3
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum GSCOLCOL: Int {
	      
	      	
	        case ConstDrawingDefault = 0
	      	
	      
	      	
	        case ConstBlue = 1
	      	
	      
	      	
	        case ConstRed = 2
	      	
	      
	      	
	        case ConstMagenta = 3
	      	
	      
	      	
	        case ConstGreen = 4
	      	
	      
	      	
	        case ConstCyan = 5
	      	
	      
	      	
	        case ConstYellow = 6
	      	
	      
	      	
	        case ConstDeviceDefault = 7
	      	
	      
	      	
	        case ConstMedium = 8
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum GSLTLINETYPE: Int {
	      
	      	
	        case ConstDrawingDefault = 0
	      	
	      
	      	
	        case ConstDotted = 1
	      	
	      
	      	
	        case ConstShortDashed = 2
	      	
	      
	      	
	        case ConstDashDotted = 3
	      	
	      
	      	
	        case ConstDoubleDotted = 4
	      	
	      
	      	
	        case ConstLongDashed = 5
	      	
	      
	      	
	        case ConstDashDoubleDot = 6
	      	
	      
	      	
	        case ConstSolid = 7
	      	
	      
	      	
	        case ConstInvisible = 8
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum GSMPPREC: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
	      	
	        case ConstString = 1
	      	
	      
	      	
	        case ConstCharacter = 2
	      	
	      
	      	
	        case ConstStroke = 3
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
  	  public enum GSMTMCPT: Int {
	      
	      	
	        case ConstDrawingDefault = 0
	      	
	      
	      	
	        case ConstCross = 1
	      	
	      
	      	
	        case ConstPlus = 2
	      	
	      
	      	
	        case ConstDiamond = 3
	      	
	      
	      	
	        case ConstSquare = 4
	      	
	      
	      	
	        case Const6PointStar = 5
	      	
	      
	      	
	        case Const8PointStar = 6
	      	
	      
	      	
	        case ConstFilledDiamond = 7
	      	
	      
	      	
	        case ConstFilledSquare = 8
	      	
	      
	      	
	        case ConstDot = 9
	      	
	      
	      	
	        case ConstSmallCircle = 10
	      	
	      
	      	
	        case ConstBlank = 64
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum GSMXMODE: Int {
	      
	      	
	        case ConstDrawingDefault = 0
	      	
	      
	      	
	        case ConstOverpaint = 2
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum GSPSLCID: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum GSPTPATT: Int {
	      
	      	
	        case ConstDrawingDefault = 0
	      	
	      
	      	
	        case ConstDotted1 = 1
	      	
	      
	      	
	        case ConstDotted2 = 2
	      	
	      
	      	
	        case ConstDotted3 = 3
	      	
	      
	      	
	        case ConstDotted4 = 4
	      	
	      
	      	
	        case ConstDotted5 = 5
	      	
	      
	      	
	        case ConstDotted6 = 6
	      	
	      
	      	
	        case ConstDotted7 = 7
	      	
	      
	      	
	        case ConstDotted8 = 8
	      	
	      
	      	
	        case ConstVerticalLines = 9
	      	
	      
	      	
	        case ConstHorizontalLines = 10
	      	
	      
	      	
	        case ConstDiagonalLines1 = 11
	      	
	      
	      	
	        case ConstDiagonalLines2 = 12
	      	
	      
	      	
	        case ConstDiagonalLines3 = 13
	      	
	      
	      	
	        case ConstDiagonalLines4 = 14
	      	
	      
	      	
	        case ConstNoFill = 15
	      	
	      
	      	
	        case ConstSolidFill = 16
	      	
	      
	      	
	        case ConstBlank = 64
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
  	  public enum GSPCOLCOLSPCE: Int {
	      
	      	
	        case ConstRGB = 1
	      	
	      
	      	
	        case ConstCMYK = 4
	      	
	      
	      	
	        case ConstHighlight = 6
	      	
	      
	      	
	        case ConstCIELAB = 8
	      	
	      
	      	
	        case ConstOCA = 64
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum GSLELINEEND: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
	      	
	        case ConstFlat = 1
	      	
	      
	      	
	        case ConstSquare = 2
	      	
	      
	      	
	        case ConstRound = 3
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum GSLJLINEJOIN: Int {
	      
	      	
	        case ConstDefault = 0
	      	
	      
	      	
	        case ConstBevel = 1
	      	
	      
	      	
	        case ConstRound = 2
	      	
	      
	      	
	        case ConstMiter = 3
	      	
	      
  	  }
	  
	  

	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum WindowSpecificationFLAGS: Int {
	      
	      	
    		case ConstPPS = 1
	      	
	      
	      	
    		case ConstABS = 2
	      	
	      
	      	
	      
	      	
    		case ConstIMGRES = 8
	      	
	      
	      	
    		case ConstIMGNS = 16
	      	
	      
	  }
  
  	  
	  
	  
  	  public enum WindowSpecificationRES3: Int {
	      
	      	
	        case ConstRES3 = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum WindowSpecificationCFORMAT: Int {
	      
	      	
	        case Const16Bit = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum WindowSpecificationUBASE: Int {
	      
	      	
	        case Const10Centimeter = 1
	      	
	      
	      	
	        case Const10Inch = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum TonerSaverTSvCtrl: Int {
	      
	      	
	        case ConstDeactivate = 0
	      	
	      
	      	
	        case ConstActivate = 1
	      	
	      
	      	
	        case ConstDefault = 255
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum ColorFidelityStpCoEx: Int {
	      
	      	
	        case ConstStop = 1
	      	
	      
	      	
	        case ConstDoNotStop = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum ColorFidelityRepCoEx: Int {
	      
	      	
	        case ConstReport = 1
	      	
	      
	      	
	        case ConstDoNotReport = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum ColorFidelityColSub: Int {
	      
	      	
	        case ConstAnySubstition = 1
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum FontFidelityStpFntEx: Int {
	      
	      	
	        case ConstStop = 1
	      	
	      
	      	
	        case ConstDoNotStop = 2
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum TextFidelityStpTxtEx: Int {
	      
	      	
	        case ConstStop = 1
	      	
	      
	      	
	        case ConstDoNotStop = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum TextFidelityRepTxtEx: Int {
	      
	      	
	        case ConstReport = 1
	      	
	      
	      	
	        case ConstDoNotReport = 2
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum MediaFidelityStpMedEx: Int {
	      
	      	
	        case ConstTerminateAndHold = 1
	      	
	      
	      	
	        case ConstContinue = 2
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum FinishingFidelityStpFinEx: Int {
	      
	      	
	        case ConstStop = 1
	      	
	      
	      	
	        case ConstDoNotStop = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum FinishingFidelityRepFinEx: Int {
	      
	      	
	        case ConstReport = 1
	      	
	      
	      	
	        case ConstDoNotReport = 2
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum CMRFidelityStpCMREx: Int {
	      
	      	
	        case ConstStop = 1
	      	
	      
	      	
	        case ConstDoNotStop = 2
	      	
	      
  	  }
	  
	  
	  
  	  public enum CMRFidelityRepCMREx: Int {
	      
	      	
	        case ConstReport = 1
	      	
	      
	      	
	        case ConstDoNotReport = 2
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum ObjectCountSubObj: Int {
	      
	      	
	        case ConstPage = 175
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ObjectOriginIdentifierSystem: Int {
	      
	      	
	        case ConstMVS = 1
	      	
	      
	      	
	        case ConstVM = 2
	      	
	      
	      	
	        case ConstPCDOS = 3
	      	
	      
	      	
	        case ConstVSE = 4
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum LineDataObjectPositionMigrationTempOrient: Int {
	      
	      	
	        case Const0degree = 0
	      	
	      
	      	
	        case Const270degree = 1
	      	
	      
	      	
	        case Const180degree = 2
	      	
	      
	      	
	        case Const90degree = 3
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum ColorManagementResourceDescriptorProcMode: Int {
	      
	      	
	        case ConstAuditCMR = 1
	      	
	      
	      	
	        case ConstInstructionCMR = 2
	      	
	      
	      	
	        case ConstLinkCMR = 3
	      	
	      
  	  }
	  
	  
	  
  	  public enum ColorManagementResourceDescriptorCMRScpe: Int {
	      
	      	
	        case ConstDataObject = 1
	      	
	      
	      	
	        case ConstPageOrOverlay = 2
	      	
	      
	      	
	        case ConstDocument = 3
	      	
	      
	      	
	        case ConstPrintFile = 4
	      	
	      
	      	
	        case ConstPageGroup = 5
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ImageResolutionXBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
  	  public enum ImageResolutionYBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
	      	
	        case Const10cm = 1
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum ObjectContainerPresentationSpaceSizePDFSize: Int {
	      
	      	
	        case ConstMediaBox = 1
	      	
	      
	      	
	        case ConstCropBox = 2
	      	
	      
	      	
	        case ConstBleedBox = 3
	      	
	      
	      	
	        case ConstTrimBox = 4
	      	
	      
	      	
	        case ConstArtBox = 5
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum ExtendedResourceLocalIdentifierResType: Int {
	      
	      	
	        case ConstRetired = 48
	      	
	      
	      	
	        case ConstMediaTypeResource = 64
	      	
	      
	      	
	        case ConstMediaDestinationResource = 66
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
  	  public enum MetricAdjustmentUnitBase: Int {
	      
	      	
	        case Const10in = 0
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  

	  
	  
  	  public enum RenderingIntentReserved: Int {
	      
	      	
	        case ConstZero = 0
	      	
	      
  	  }
	  
	  
	  
  	  public enum RenderingIntentIOCARI: Int {
	      
	      	
	        case ConstPerceptual = 0
	      	
	      
	      	
	        case ConstMediaRelativeColorimetric = 1
	      	
	      
	      	
	        case ConstSaturation = 2
	      	
	      
	      	
	        case ConstICCAbsoluteColorimetrc = 3
	      	
	      
	      	
	        case ConstNotSpecified = 255
	      	
	      
  	  }
	  
	  
	  
  	  public enum RenderingIntentOCRI: Int {
	      
	      	
	        case ConstPerceptual = 0
	      	
	      
	      	
	        case ConstMediaRelativeColorimetric = 1
	      	
	      
	      	
	        case ConstSaturation = 2
	      	
	      
	      	
	        case ConstICCAbsoluteColorimetrc = 3
	      	
	      
	      	
	        case ConstNotSpecified = 255
	      	
	      
  	  }
	  
	  
	  
  	  public enum RenderingIntentPTOCRI: Int {
	      
	      	
	        case ConstPerceptual = 0
	      	
	      
	      	
	        case ConstMediaRelativeColorimetric = 1
	      	
	      
	      	
	        case ConstSaturation = 2
	      	
	      
	      	
	        case ConstICCAbsoluteColorimetrc = 3
	      	
	      
	      	
	        case ConstNotSpecified = 255
	      	
	      
  	  }
	  
	  
	  
  	  public enum RenderingIntentGOCARI: Int {
	      
	      	
	        case ConstPerceptual = 0
	      	
	      
	      	
	        case ConstMediaRelativeColorimetric = 1
	      	
	      
	      	
	        case ConstSaturation = 2
	      	
	      
	      	
	        case ConstICCAbsoluteColorimetrc = 3
	      	
	      
	      	
	        case ConstNotSpecified = 255
	      	
	      
  	  }
	  
	  
	  
  	  public enum RenderingIntentReserved2: Int {
	      
	      	
	        case ConstZero = 0
	      	
	      
  	  }
	  
	  

	  
	  
	  
	  
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
  	  public enum FinishingOperationFOpType: Int {
	      
	      	
	        case ConstCornerStaple = 1
	      	
	      
	      	
	        case ConstSaddleStitchOut = 2
	      	
	      
	      	
	        case ConstEdgeStitch = 3
	      	
	      
	      	
	        case ConstFoldIn = 4
	      	
	      
	      	
	        case ConstSeparationCut = 5
	      	
	      
	      	
	        case ConstPerforationCut = 6
	      	
	      
	      	
	        case ConstZFold = 7
	      	
	      
	      	
	        case ConstCenterFoldIn = 8
	      	
	      
	      	
	        case ConstTrimAfterCenterFoldOrSaddleStitch = 9
	      	
	      
	      	
	        case ConstPunch = 10
	      	
	      
	      	
	        case ConstPerfectBind = 12
	      	
	      
	      	
	        case ConstRingBind = 13
	      	
	      
	      	
	        case ConstSaddleStitchIn = 18
	      	
	      
  	  }
	  
	  
	  
  	  public enum FinishingOperationRefEdge: Int {
	      
	      	
	        case ConstBottomRightCornerBottomEdge = 0
	      	
	      
	      	
	        case ConstTopRightCornerRightEdge = 1
	      	
	      
	      	
	        case ConstTopLeftCornerTopEdge = 2
	      	
	      
	      	
	        case ConstBottomLeftCornerLeftEdge = 3
	      	
	      
	      	
	        case ConstDeviceDefault = 255
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  

	  
	  
	  
	  
	  

	  
	  
  	  public enum DeviceAppearanceDevApp: Int {
	      
	      	
	        case ConstDeviceDefault = 0
	      	
	      
	      	
	        case ConstDeviceDefaultMonochrome = 1
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
  	  public enum ResourceObjectIncludeObjType: Int {
	      
	      	
	        case ConstOverlay = 223
	      	
	      
	      	
	        case ConstRetired = 95
	      	
	      
  	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
  	  public enum ResourceObjectIncludeObOrent: Int {
	      
	      	
	        case Const0degrees = 0
	      	
	      
	      	
	        case Const90degrees = 11520
	      	
	      
	      	
	        case Const180degrees = 23040
	      	
	      
	      	
	        case Const270degrees = 34560
	      	
	      
  	  }
	  
	  

	  
	  
  	  public enum PageOverlayConditionalProcessingPgOvType: Int {
	      
	      	
	        case ConstNormal = 0
	      	
	      
	      	
	        case ConstAnnotation = 1
	      	
	      
	      	
	        case ConstRedaction = 2
	      	
	      
	      	
	        case ConstHighlight = 3
	      	
	      
  	  }
	  
	  
	  
	  

	  
	  
  	  public enum ResourceUsageAttributeFrequency: Int {
	      
	      	
	        case ConstLow = 0
	      	
	      
	      	
	        case ConstHigh = 255
	      	
	      
  	  }
	  
	  

  
  public class BAG : SF {
     public init() {
       super.init(id: 13871305)
     }
  	  
	
	
	  public var AEGName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BBC : SF {
     public init() {
       super.init(id: 13871339)
     }
  	  
	
	
	  public var BCdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BCA : SF {
     public init() {
       super.init(id: 13871223)
     }
  	  
	
	
	  public var CATName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BCF : SF {
     public init() {
       super.init(id: 13871242)
     }
  	  
	
	
	  public var RSName: String?
	
	

  
  
  }
  
  public class BCP : SF {
     public init() {
       super.init(id: 13871239)
     }
  	  
	
	
	  public var RSName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BDA : SF {
     public init() {
       super.init(id: 13889259)
     }
  	  
	
	
	  public var Flags: Int?
	
	
	
	  public var Xoffset: Int?
	
	
	
	  public var Yoffset: Int?
	
	
	
	  public var Data: [UInt8]?
	
	

  
  
  }
  
  public class BDD : SF {
     public init() {
       super.init(id: 13870827)
     }
  	  
	
	
	  public var UBASE: Int?
	
	
	
	  public var Reserved: Int?
	
	
	
	  public var XUPUB: Int?
	
	
	
	  public var YUPUB: Int?
	
	
	
	  public var XEXTENT: Int?
	
	
	
	  public var YEXTENT: Int?
	
	
	
	  public var Reserved2: Int?
	
	
	
	  public var TYPE: Int?
	
	
	
	  public var MOD: Int?
	
	
	
	  public var LID: Int?
	
	
	
	  public var COLOR: Int?
	
	
	
	  public var MODULEWIDTH: Int?
	
	
	
	  public var ELEMENTHEIGHT: Int?
	
	
	
	  public var MULT: Int?
	
	
	
	  public var WENE: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BDG : SF {
     public init() {
       super.init(id: 13871300)
     }
  	  
	
	
	  public var DEGName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BDI : SF {
     public init() {
       super.init(id: 13871271)
     }
  	  
	
	
	  public var IndxName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BDM : SF {
     public init() {
       super.init(id: 13871306)
     }
  	  
	
	
	  public var DMName: String?
	
	
	
	  public var DatFmt: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BDT : SF {
     public init() {
       super.init(id: 13871272)
     }
  	  
	
	
	  public var DocName: String?
	
	
	
	  public var Reserved: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BDX : SF {
     public init() {
       super.init(id: 13871331)
     }
  	  
	
	
	  public var DMXName: String?
	
	

  
  
  }
  
  public class BFG : SF {
     public init() {
       super.init(id: 13871301)
     }
  	  
	
	
	  public var FEGName: String?
	
	

  
  
  }
  
  public class BFM : SF {
     public init() {
       super.init(id: 13871309)
     }
  	  
	
	
	  public var FMName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BFN : SF {
     public init() {
       super.init(id: 13871241)
     }
  	  
	
	
	  public var RSName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BGR : SF {
     public init() {
       super.init(id: 13871291)
     }
  	  
	
	
	  public var GdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BII : SF {
     public init() {
       super.init(id: 13871227)
     }
  	  
	
	
	  public var ImoName: String?
	
	

  
  
  }
  
  public class BIM : SF {
     public init() {
       super.init(id: 13871355)
     }
  	  
	
	
	  public var IdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BMM : SF {
     public init() {
       super.init(id: 13871308)
     }
  	  
	
	
	  public var MMName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BMO : SF {
     public init() {
       super.init(id: 13871327)
     }
  	  
	
	
	  public var OvlyName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BNG : SF {
     public init() {
       super.init(id: 13871277)
     }
  	  
	
	
	  public var PGrpName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BOC : SF {
     public init() {
       super.init(id: 13871250)
     }
  	  
	
	
	  public var ObjCName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BOG : SF {
     public init() {
       super.init(id: 13871303)
     }
  	  
	
	
	  public var OEGName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BPF : SF {
     public init() {
       super.init(id: 13871269)
     }
  	  
	
	
	  public var PFName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BPG : SF {
     public init() {
       super.init(id: 13871279)
     }
  	  
	
	
	  public var PageName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BPM : SF {
     public init() {
       super.init(id: 13871307)
     }
  	  
	
	
	  public var PMName: String?
	
	

  
  
  }
  
  public class BPS : SF {
     public init() {
       super.init(id: 13871199)
     }
  	  
	
	
	  public var PsegName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BPT : SF {
     public init() {
       super.init(id: 13871259)
     }
  	  
	
	
	  public var PTdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BRG : SF {
     public init() {
       super.init(id: 13871302)
     }
  	  
	
	
	  public var RGrpName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BRS : SF {
     public init() {
       super.init(id: 13871310)
     }
  	  
	
	
	  public var RSName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class BSG : SF {
     public init() {
       super.init(id: 13871321)
     }
  	  
	
	
	  public var REGName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class CAT : SF {
     public init() {
       super.init(id: 13873271)
     }
  	  
	
	
	  public var CATData: [UInt8]?
	
	

  
  
  }
  
  public class CDD : SF {
     public init() {
       super.init(id: 13870738)
     }
  	  
	
	
	  public var XocBase: Int?
	
	
	
	  public var YocBase: Int?
	
	
	
	  public var XocUnits: Int?
	
	
	
	  public var YocUnits: Int?
	
	
	
	  public var XocSize: Int?
	
	
	
	  public var YocSize: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class CFC : SF {
     public init() {
       super.init(id: 13870986)
     }
  	  
	
	
	  public var CFIRGLen: Int?
	
	
	
	  public var Retired1: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class CFI : SF {
     public init() {
       super.init(id: 13864074)
     }
  	  
	
	
		
		public var FixedLengthRG: [CFIRG] = []
    	
	
	

  
  
  }
  
  public class CPC : SF {
     public init() {
       super.init(id: 13870983)
     }
  	  
	
	
	  public var DefCharID: String?
	
	
	
	  public var PrtFlags: Int?
	
	
	
	  public var CPIRGLen: Int?
	
	
	
	  public var VSCharSN: Int?
	
	
	
	  public var VSChar: Int?
	
	
	
	  public var VSFlags: Int?
	
	

  
  
  }
  
  public class CPD : SF {
     public init() {
       super.init(id: 13870727)
     }
  	  
	
	
	  public var CPDesc: String?
	
	
	
	  public var GCGIDLen: Int?
	
	
	
	  public var NumCdPts: Int?
	
	
	
	  public var GCSGID: Int?
	
	
	
	  public var CPGID: Int?
	
	
	
	  public var EncScheme: Int?
	
	

  
  
  }
  
  public class CPI : SF {
     public init() {
       super.init(id: 13864071)
     }
  	  
	
	
		
		public var rg: [CPIRG] = []
    	
	
	

  
  
  }
  
  public class CTC : SF {
     public init() {
       super.init(id: 13871003)
     }
  	  
	
	
	  public var ConData: [UInt8]?
	
	

  
  
  }
  
  public class DXD : SF {
     public init() {
       super.init(id: 13870819)
     }
  	  
	

  
  
  }
  
  public class EAG : SF {
     public init() {
       super.init(id: 13871561)
     }
  	  
	
	
	  public var AEGName: String?
	
	

  
  
  }
  
  public class EBC : SF {
     public init() {
       super.init(id: 13871595)
     }
  	  
	
	
	  public var BCdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class ECA : SF {
     public init() {
       super.init(id: 13871479)
     }
  	  
	
	
	  public var CATName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class ECF : SF {
     public init() {
       super.init(id: 13871498)
     }
  	  
	
	
	  public var RSName: String?
	
	

  
  
  }
  
  public class ECP : SF {
     public init() {
       super.init(id: 13871495)
     }
  	  
	
	
	  public var RSName: String?
	
	

  
  
  }
  
  public class EDG : SF {
     public init() {
       super.init(id: 13871556)
     }
  	  
	
	
	  public var DEGName: String?
	
	

  
  
  }
  
  public class EDI : SF {
     public init() {
       super.init(id: 13871527)
     }
  	  
	
	
	  public var IndxName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EDM : SF {
     public init() {
       super.init(id: 13871562)
     }
  	  
	
	
	  public var DMName: String?
	
	

  
  
  }
  
  public class EDT : SF {
     public init() {
       super.init(id: 13871528)
     }
  	  
	
	
	  public var DocName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EDX : SF {
     public init() {
       super.init(id: 13871587)
     }
  	  
	
	
	  public var DMXName: String?
	
	

  
  
  }
  
  public class EFG : SF {
     public init() {
       super.init(id: 13871557)
     }
  	  
	
	
	  public var FEGName: String?
	
	

  
  
  }
  
  public class EFM : SF {
     public init() {
       super.init(id: 13871565)
     }
  	  
	
	
	  public var FMName: String?
	
	

  
  
  }
  
  public class EFN : SF {
     public init() {
       super.init(id: 13871497)
     }
  	  
	
	
	  public var RSName: String?
	
	

  
  
  }
  
  public class EGR : SF {
     public init() {
       super.init(id: 13871547)
     }
  	  
	
	
	  public var GdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EII : SF {
     public init() {
       super.init(id: 13871483)
     }
  	  
	
	
	  public var ImoName: String?
	
	

  
  
  }
  
  public class EIM : SF {
     public init() {
       super.init(id: 13871611)
     }
  	  
	
	
	  public var IdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EMM : SF {
     public init() {
       super.init(id: 13871564)
     }
  	  
	
	
	  public var MMName: String?
	
	

  
  
  }
  
  public class EMO : SF {
     public init() {
       super.init(id: 13871583)
     }
  	  
	
	
	  public var OvlyName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class ENG : SF {
     public init() {
       super.init(id: 13871533)
     }
  	  
	
	
	  public var PGrpName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EOC : SF {
     public init() {
       super.init(id: 13871506)
     }
  	  
	
	
	  public var ObjCName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EOG : SF {
     public init() {
       super.init(id: 13871559)
     }
  	  
	
	
	  public var OEGName: String?
	
	

  
  
  }
  
  public class EPF : SF {
     public init() {
       super.init(id: 13871525)
     }
  	  
	
	
	  public var PFName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EPG : SF {
     public init() {
       super.init(id: 13871535)
     }
  	  
	
	
	  public var PageName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class EPM : SF {
     public init() {
       super.init(id: 13871563)
     }
  	  
	
	
	  public var PMName: String?
	
	

  
  
  }
  
  public class EPS : SF {
     public init() {
       super.init(id: 13871455)
     }
  	  
	
	
	  public var PsegName: String?
	
	

  
  
  }
  
  public class EPT : SF {
     public init() {
       super.init(id: 13871515)
     }
  	  
	
	
	  public var PTdoName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class ERG : SF {
     public init() {
       super.init(id: 13871558)
     }
  	  
	
	
	  public var RGrpName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class ERS : SF {
     public init() {
       super.init(id: 13871566)
     }
  	  
	
	
	  public var RSName: String?
	
	

  
  
  }
  
  public class ESG : SF {
     public init() {
       super.init(id: 13871577)
     }
  	  
	
	
	  public var REGName: String?
	
	

  
  
  }
  
  public class FNC : SF {
     public init() {
       super.init(id: 13870985)
     }
  	  
	
	
	  public var Retired: Int?
	
	
	
	  public var PatTech: Int?
	
	
	
	  public var Reserved1: [UInt8]?
	
	
	
	  public var FntFlags: Int?
	
	
	
	  public var XUnitBase: Int?
	
	
	
	  public var YUnitBase: Int?
	
	
	
	  public var XftUnits: Int?
	
	
	
	  public var YftUnits: Int?
	
	
	
	  public var MaxBoxWd: Int?
	
	
	
	  public var MaxBoxHt: Int?
	
	
	
	  public var FNORGLen: Int?
	
	
	
	  public var FNIRGLen: Int?
	
	
	
	  public var PatAlign: Int?
	
	
	
	  public var RPatDCnt: Int?
	
	
	
	  public var FNPRGLen: Int?
	
	
	
	  public var FNMRGLen: Int?
	
	
	
	  public var ResXUBase: Int?
	
	
	
	  public var ResYUBase: Int?
	
	
	
	  public var XfrUnits: Int?
	
	
	
	  public var YfrUnits: Int?
	
	
	
	  public var OPatDCnt: Int?
	
	
	
	  public var Reserved2: [UInt8]?
	
	
	
	  public var FNNRGLen: Int?
	
	
	
	  public var FNNDCnt: Int?
	
	
	
	  public var FNNMapCnt: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class FND : SF {
     public init() {
       super.init(id: 13870729)
     }
  	  
	
	
	  public var TypeFcDesc: String?
	
	
	
	  public var FtWtClass: Int?
	
	
	
	  public var FtWdClass: Int?
	
	
	
	  public var MaxPtSize: Int?
	
	
	
	  public var NomPtSize: Int?
	
	
	
	  public var MinPtSize: Int?
	
	
	
	  public var MaxHSize: Int?
	
	
	
	  public var NomHSize: Int?
	
	
	
	  public var MinHSize: Int?
	
	
	
	  public var DsnGenCls: Int?
	
	
	
	  public var DsnSubCls: Int?
	
	
	
	  public var DsnSpcGrp: Int?
	
	
	
	  public var Reserved1: [UInt8]?
	
	
	
	  public var FtDsFlags: Int?
	
	
	
	  public var Reserved2: [UInt8]?
	
	
	
	  public var GCSID: Int?
	
	
	
	  public var FGID: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class FNG : SF {
     public init() {
       super.init(id: 13889161)
     }
  	  
	
	
	  public var PatData: [UInt8]?
	
	

  
  
  }
  
  public class FNI : SF {
     public init() {
       super.init(id: 13864073)
     }
  	  
	
	
		
		public var rg: [FNIRG] = []
    	
	
	

  
  
  }
  
  public class FNN : SF {
     public init() {
       super.init(id: 13872009)
     }
  	  
	
	
	  public var IBMFormat: Int?
	
	
	
	  public var TechnologyFormat: Int?
	
	
	
		
		public var rg: [FNNRG] = []
    	
	
	
	
		
		public var rg2: [Triplet] = []
    	
	
	

  
  
	  public var rawData: [UInt8]?
  
  }
  
  public class FNM : SF {
     public init() {
       super.init(id: 13869705)
     }
  	  
	
	
		
		public var rg: [FNMRG] = []
    	
	
	

  
  
  }
  
  public class FNO : SF {
     public init() {
       super.init(id: 13872777)
     }
  	  
	
	
		
		public var rg: [FNORG] = []
    	
	
	

  
  
  }
  
  public class FNP : SF {
     public init() {
       super.init(id: 13872265)
     }
  	  
	
	
		
		public var rg: [FNPRG] = []
    	
	
	

  
  
  }
  
  public class GAD : SF {
     public init() {
       super.init(id: 13889211)
     }
  	  
	
	
	  public var GOCAdat: [UInt8]?
	
	

  
  
  }
  
  public class GDD : SF {
     public init() {
       super.init(id: 13870779)
     }
  	  
	
	
	  public var GOCAdes: [UInt8]?
	
	
	
		
		public var commands: [Triplet] = []
    	
	
	

  
  
  }
  
  public class ICP : SF {
     public init() {
       super.init(id: 13872251)
     }
  	  
	
	
	  public var XCOset: Int?
	
	
	
	  public var YCOset: Int?
	
	
	
	  public var XCSize: Int?
	
	
	
	  public var YCSize: Int?
	
	
	
	  public var XFilSize: Int?
	
	
	
	  public var YFilSize: Int?
	
	

  
  
  }
  
  public class IDD : SF {
     public init() {
       super.init(id: 13870843)
     }
  	  
	
	
	  public var UNITBASE: Int?
	
	
	
	  public var XRESOL: Int?
	
	
	
	  public var YRESOL: Int?
	
	
	
	  public var XSIZE: Int?
	
	
	
	  public var YSIZE: Int?
	
	
	
		
		public var SDFS: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IEL : SF {
     public init() {
       super.init(id: 13873831)
     }
  	  
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IID : SF {
     public init() {
       super.init(id: 13870715)
     }
  	  
	
	
	  public var ConData1: [UInt8]?
	
	
	
	  public var XBase: Int?
	
	
	
	  public var YBase: Int?
	
	
	
	  public var XUnits: Int?
	
	
	
	  public var YUnits: Int?
	
	
	
	  public var XSize: Int?
	
	
	
	  public var YSize: Int?
	
	
	
	  public var ConData2: [UInt8]?
	
	
	
	  public var XCSizeD: Int?
	
	
	
	  public var YCSizeD: Int?
	
	
	
	  public var ConData3: [UInt8]?
	
	
	
	  public var Color: Int?
	
	

  
  
  }
  
  public class IMM : SF {
     public init() {
       super.init(id: 13872076)
     }
  	  
	
	
	  public var MMPName: String?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IOB : SF {
     public init() {
       super.init(id: 13873091)
     }
  	  
	
	
	  public var ObjName: String?
	
	
	
	  public var ObjType: Int?
	
	
	
	  public var XoaOset: Int?
	
	
	
	  public var YoaOset: Int?
	
	
	
	  public var XoaOrent: Int?
	
	
	
	  public var YoaOrent: Int?
	
	
	
	  public var XocaOset: Int?
	
	
	
	  public var YocaOset: Int?
	
	
	
	  public var RefCSys: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IOC : SF {
     public init() {
       super.init(id: 13870971)
     }
  	  
	
	
	  public var XoaOset: Int?
	
	
	
	  public var YoaOset: Int?
	
	
	
	  public var XoaOrent: Int?
	
	
	
	  public var YoaOrent: Int?
	
	
	
	  public var ConData1: [UInt8]?
	
	
	
	  public var XMap: Int?
	
	
	
	  public var YMap: Int?
	
	
	
	  public var ConData2: [UInt8]?
	
	

  
  
  }
  
  public class IPD : SF {
     public init() {
       super.init(id: 13889275)
     }
  	  
	
	
		
		public var sdfs: [Triplet] = []
    	
	
	

  
	  public var imageData: [UInt8]?
  
  
  }
  
  public class IPG : SF {
     public init() {
       super.init(id: 13873071)
     }
  	  
	
	
	  public var PgName: String?
	
	
	
	  public var IPgFlgs: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IPO : SF {
     public init() {
       super.init(id: 13873112)
     }
  	  
	
	
	  public var OvlyName: String?
	
	
	
	  public var XolOset: Int?
	
	
	
	  public var YolOset: Int?
	
	
	
	  public var OvlyOrent: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IPS : SF {
     public init() {
       super.init(id: 13872991)
     }
  	  
	
	
	  public var PsegName: String?
	
	
	
	  public var XpsOset: Int?
	
	
	
	  public var YpsOset: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class IRD : SF {
     public init() {
       super.init(id: 13889147)
     }
  	  
	
	
	  public var IMdata: [UInt8]?
	
	

  
  
  }
  
  public class LLE : SF {
     public init() {
       super.init(id: 13874320)
     }
  	  
	
	
	  public var LnkType: Int?
	
	
	
		
		public var RG: [LLERG] = []
    	
	
	

  
  
  }
  
  public class LNC : SF {
     public init() {
       super.init(id: 13871847)
     }
  	  
	
	
	  public var NumDSC: Int?
	
	

  
  
  }
  
  public class LND : SF {
     public init() {
       super.init(id: 13870823)
     }
  	  
	
	
	  public var LNDFlgs: Int?
	
	
	
	  public var IPos: Int?
	
	
	
	  public var BPos: Int?
	
	
	
	  public var TxtOrent: Int?
	
	
	
	  public var FntLID: Int?
	
	
	
	  public var ChnlCde: Int?
	
	
	
	  public var NLNDskp: Int?
	
	
	
	  public var NLNDsp: Int?
	
	
	
	  public var NLNDreu: Int?
	
	
	
	  public var SupName: String?
	
	
	
	  public var SOLid: Int?
	
	
	
	  public var DataStrt: Int?
	
	
	
	  public var DataLgth: Int?
	
	
	
	  public var TxtColor: Int?
	
	
	
	  public var NLNDccp: Int?
	
	
	
	  public var SubpgID: Int?
	
	
	
	  public var CCPID: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class MBC : SF {
     public init() {
       super.init(id: 13872107)
     }
  	  
	
	
		
		public var RG: [MBCRG] = []
    	
	
	

  
  
  }
  
  public class MCA : SF {
     public init() {
       super.init(id: 13871991)
     }
  	  
	
	
		
		public var RG: [MCARG] = []
    	
	
	

  
  
  }
  
  public class MCC : SF {
     public init() {
       super.init(id: 13869704)
     }
  	  
	
	
		
		public var rg: [MCCRG] = []
    	
	
	

  
  
  }
  
  public class MCD : SF {
     public init() {
       super.init(id: 13872018)
     }
  	  
	
	
		
		public var RG: [MCDRG] = []
    	
	
	

  
  
  }
  
  public class MCF : SF {
     public init() {
       super.init(id: 13872010)
     }
  	  
	
	
		
		public var RG: [MCFRG] = []
    	
	
	

  
  
  }
  
  public class MCF1 : SF {
     public init() {
       super.init(id: 13873546)
     }
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var RG: [MCF1RG] = []
    	
	
	

  
  
  }
  
  public class MDD : SF {
     public init() {
       super.init(id: 13870728)
     }
  	  
	
	
	  public var XmBase: Int?
	
	
	
	  public var YmBase: Int?
	
	
	
	  public var XmUnits: Int?
	
	
	
	  public var YmUnits: Int?
	
	
	
	  public var XmSize: Int?
	
	
	
	  public var YmSize: Int?
	
	
	
	  public var MDDFlgs: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class MDR : SF {
     public init() {
       super.init(id: 13872067)
     }
  	  
	
	
		
		public var RG: [MDRRG] = []
    	
	
	

  
  
  }
  
  public class MFC : SF {
     public init() {
       super.init(id: 13869192)
     }
  	  
	
	
	  public var MFCFlgs: Int?
	
	
	
	  public var MedColl: Int?
	
	
	
	  public var MFCScpe: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class MGO : SF {
     public init() {
       super.init(id: 13872059)
     }
  	  
	
	
		
		public var RG: [MGORG] = []
    	
	
	

  
  
  }
  
  public class MIO : SF {
     public init() {
       super.init(id: 13872123)
     }
  	  
	
	
		
		public var RG: [MIORG] = []
    	
	
	

  
  
  }
  
  public class MMC : SF {
     public init() {
       super.init(id: 13870984)
     }
  	  
	
	
	  public var MMCid: Int?
	
	
	
	  public var PARAMETER1: Int?
	
	
	
		
		public var rg: [MMCRG] = []
    	
	
	

  
  
  }
  
  public class MMD : SF {
     public init() {
       super.init(id: 13872077)
     }
  	  
	
	
		
		public var RG: [MMDRG] = []
    	
	
	

  
  
  }
  
  public class MMO : SF {
     public init() {
       super.init(id: 13873631)
     }
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var rg: [MMORG] = []
    	
	
	

  
  
  }
  
  public class MMT : SF {
     public init() {
       super.init(id: 13872008)
     }
  	  
	
	
		
		public var RG: [MMTRG] = []
    	
	
	

  
  
  }
  
  public class MPG : SF {
     public init() {
       super.init(id: 13872047)
     }
  	  
	
	
		
		public var RG: [MPGRG] = []
    	
	
	

  
  
  }
  
  public class MPO : SF {
     public init() {
       super.init(id: 13872088)
     }
  	  
	
	
		
		public var RG: [MPORG] = []
    	
	
	

  
  
  }
  
  public class MPS : SF {
     public init() {
       super.init(id: 13873503)
     }
  	  
	
	
	  public var RGLength: Int?
	
	
	
	  public var Reserved: [UInt8]?
	
	
	
		
		public var FixedLengthRG: [MPSRG] = []
    	
	
	

  
  
  }
  
  public class MSU : SF {
     public init() {
       super.init(id: 13872106)
     }
  	  
	
	
		
		public var rg: [MSURG] = []
    	
	
	

  
  
  }
  
  public class NOP : SF {
     public init() {
       super.init(id: 13889262)
     }
  	  
	
	
	  public var UndfData: [UInt8]?
	
	

  
  
  }
  
  public class OBD : SF {
     public init() {
       super.init(id: 13870699)
     }
  	  
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class OBP : SF {
     public init() {
       super.init(id: 13872235)
     }
  	  
	
	
	  public var OAPosID: Int?
	
	
	
	  public var RGLength: Int?
	
	
	
	  public var XoaOset: Int?
	
	
	
	  public var YoaOset: Int?
	
	
	
	  public var XoaOrent: Int?
	
	
	
	  public var YoaOrent: Int?
	
	
	
	  public var XocaOset: Int?
	
	
	
	  public var YocaOset: Int?
	
	
	
	  public var XocaOrent: Int?
	
	
	
	  public var YocaOrent: Int?
	
	
	
	  public var RefCSys: Int?
	
	

  
  
  }
  
  public class OCD : SF {
     public init() {
       super.init(id: 13889170)
     }
  	  
	
	
	  public var ObjCdat: [UInt8]?
	
	

  
  
  }
  
  public class PEC : SF {
     public init() {
       super.init(id: 13871016)
     }
  	  
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class PFC : SF {
     public init() {
       super.init(id: 13873800)
     }
  	  
	
	
	  public var PFCFlgs: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class PGD : SF {
     public init() {
       super.init(id: 13870767)
     }
  	  
	
	
	  public var XpgBase: Int?
	
	
	
	  public var YpgBase: Int?
	
	
	
	  public var XpgUnits: Int?
	
	
	
	  public var YpgUnits: Int?
	
	
	
	  public var XpgSize: Int?
	
	
	
	  public var YpgSize: Int?
	
	
	
	  public var Reserved: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class PGP : SF {
     public init() {
       super.init(id: 13873583)
     }
  	  
	
	
	  public var Constant: Int?
	
	
	
		
		public var RG: [PGPRG] = []
    	
	
	

  
  
  }
  
  public class PGP1 : SF {
     public init() {
       super.init(id: 13872303)
     }
  	  
	
	
	  public var XOset: Int?
	
	
	
	  public var YOset: Int?
	
	

  
  
  }
  
  public class PMC : SF {
     public init() {
       super.init(id: 13871023)
     }
  	  
	
	
	  public var PMCid: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class PPO : SF {
     public init() {
       super.init(id: 13872579)
     }
  	  
	
	
		
		public var RG: [PPORG] = []
    	
	
	

  
  
  }
  
  public class PTD : SF {
     public init() {
       super.init(id: 13873563)
     }
  	  
	
	
	  public var XPBASE: Int?
	
	
	
	  public var YPBASE: Int?
	
	
	
	  public var XPUNITVL: Int?
	
	
	
	  public var YPUNITVL: Int?
	
	
	
	  public var XPEXTENT: Int?
	
	
	
	  public var YPEXTENT: Int?
	
	
	
	  public var RESERVED: Int?
	
	
	
		
		public var CS: [Triplet] = []
    	
	
	

  
  
  }
  
  public class PTD1 : SF {
     public init() {
       super.init(id: 13870747)
     }
  	  
	
	
	  public var XPBASE: Int?
	
	
	
	  public var YPBASE: Int?
	
	
	
	  public var XPUNITVL: Int?
	
	
	
	  public var YPUNITVL: Int?
	
	
	
	  public var XPEXTENT: Int?
	
	
	
	  public var YPEXTENT: Int?
	
	
	
	  public var RESERVED: Int?
	
	

  
  
  }
  
  public class PTX : SF {
     public init() {
       super.init(id: 13889179)
     }
  	  
	
	
		
		public var CS: [Triplet] = []
    	
	
	

  
  
  }
  
  public class TLE : SF {
     public init() {
       super.init(id: 13869200)
     }
  	  
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	

  
  
  }
  
  public class FGD : SF {
     public init() {
       super.init(id: 13870789)
     }
  	  
	
	
	  public var ConData: [UInt8]?
	
	

  
  
  }
  
  
  
  public class AMB : Triplet {
  
  	  
	
	
	  public var DSPLCMNT: Int?
	
	


  }
  
  public class AMI : Triplet {
  
  	  
	
	
	  public var DSPLCMNT: Int?
	
	


  }
  
  public class BLN : Triplet {
  
  	  
	


  }
  
  public class BSU : Triplet {
  
  	  
	
	
	  public var LID: Int?
	
	


  }
  
  public class DBR : Triplet {
  
  	  
	
	
	  public var RLENGTH: Int?
	
	
	
	  public var RWIDTH: Int?
	
	
	
	  public var RWIDTHFRACTION: Int?
	
	


  }
  
  public class DIR : Triplet {
  
  	  
	
	
	  public var RLENGTH: Int?
	
	
	
	  public var RWIDTH: Int?
	
	
	
	  public var RWIDTHFRACTION: Int?
	
	


  }
  
  public class ESU : Triplet {
  
  	  
	
	
	  public var LID: Int?
	
	


  }
  
  public class NOPCS : Triplet {
  
  	  
	
	
	  public var IGNDATA: [UInt8]?
	
	


  }
  
  public class OVS : Triplet {
  
  	  
	
	
	  public var BYPSIDEN: Int?
	
	
	
	  public var OVERCHAR: Int?
	
	


  }
  
  public class RMB : Triplet {
  
  	  
	
	
	  public var INCRMENT: Int?
	
	


  }
  
  public class RMI : Triplet {
  
  	  
	
	
	  public var INCRMENT: Int?
	
	


  }
  
  public class RPS : Triplet {
  
  	  
	
	
	  public var RLENGTH: Int?
	
	
	
	  public var RPTDATA: String?
	
	


  }
  
  public class SBI : Triplet {
  
  	  
	
	
	  public var INCRMENT: Int?
	
	


  }
  
  public class SCFL : Triplet {
  
  	  
	
	
	  public var LID: Int?
	
	


  }
  
  public class SEC : Triplet {
  
  	  
	
	
	  public var RESERVED: Int?
	
	
	
	  public var COLSPCE: Int?
	
	
	
	  public var COLSIZE1: Int?
	
	
	
	  public var COLSIZE2: Int?
	
	
	
	  public var COLSIZE3: Int?
	
	
	
	  public var COLSIZE4: Int?
	
	
	
	  public var COLVALUE: [UInt8]?
	
	


  }
  
  public class SIA : Triplet {
  
  	  
	
	
	  public var ADJSTMNT: Int?
	
	
	
	  public var DIRCTION: Int?
	
	


  }
  
  public class SIM : Triplet {
  
  	  
	
	
	  public var DSPLCMNT: Int?
	
	


  }
  
  public class STC : Triplet {
  
  	  
	
	
	  public var FRGCOLOR: Int?
	
	
	
	  public var PRECSION: Int?
	
	


  }
  
  public class STO : Triplet {
  
  	  
	
	
	  public var IORNTION: Int?
	
	
	
	  public var BORNTION: Int?
	
	


  }
  
  public class SVI : Triplet {
  
  	  
	
	
	  public var INCRMENT: Int?
	
	


  }
  
  public class TBM : Triplet {
  
  	  
	
	
	  public var DIRCTION: Int?
	
	
	
	  public var PRECSION: Int?
	
	
	
	  public var INCRMENT: Int?
	
	


  }
  
  public class TRN : Triplet {
  
  	  
	
	
	  public var TRNDATA: [UInt8]?
	
	


  }
  
  public class USC : Triplet {
  
  	  
	
	
	  public var BYPSIDEN: Int?
	
	


  }
  
  public class AttributeQualifier : Triplet {
  
  	  
	
	
	  public var SeqNum: Int?
	
	
	
	  public var LevNum: Int?
	
	


  }
  
  public class AttributeValue : Triplet {
  
  	  
	
	
	  public var Reserved0: Int?
	
	
	
	  public var AttVal: String?
	
	


  }
  
  public class CGCSGID : Triplet {
  
  	  
	
	
	  public var GCSGID: Int?
	
	
	
	  public var CPGID: Int?
	
	


  }
  
  public class CRCResourceManagement : Triplet {
  
  	  
	
	
	  public var FmtQual: Int?
	
	
	
	  public var RMValue: Int?
	
	
	
	  public var ResClassFlg: Int?
	
	


  }
  
  public class CharacterRotation : Triplet {
  
  	  
	
	
	  public var CharRot: Int?
	
	


  }
  
  public class ColorSpecification : Triplet {
  
  	  
	
	
	  public var ColSpce: Int?
	
	
	
	  public var ColSize1: Int?
	
	
	
	  public var ColSize2: Int?
	
	
	
	  public var ColSize3: Int?
	
	
	
	  public var ColSize4: Int?
	
	
	
	  public var Color: [UInt8]?
	
	


  }
  
  public class Comment : Triplet {
  
  	  
	
	
	  public var Comment: String?
	
	


  }
  
  public class DataObjectFontDescriptor : Triplet {
  
  	  
	
	
	  public var DOFtFlgs: Int?
	
	
	
	  public var FontTech: Int?
	
	
	
	  public var VFS: Int?
	
	
	
	  public var HFS: Int?
	
	
	
	  public var CharRot: Int?
	
	
	
	  public var EncEnv: Int?
	
	
	
	  public var EncID: Int?
	
	
	
	  public var Reserved: [UInt8]?
	
	


  }
  
  public class DescriptorPosition : Triplet {
  
  	  
	
	
	  public var DesPosID: Int?
	
	


  }
  
  public class EncodingSchemeID : Triplet {
  
  	  
	
	
	  public var ESidCP: Int?
	
	
	
	  public var ESidUD: Int?
	
	


  }
  
  public class FontResolution : Triplet {
  
  	  
	
	
	  public var MetTech: Int?
	
	
	
	  public var RPuBase: Int?
	
	
	
	  public var RPUnits: Int?
	
	


  }
  
  public class FullyQualifiedName : Triplet {
  
  	  
	
	
	  public var FQNType: Int?
	
	
	
	  public var FQNFormat: Int?
	
	
	
	  public var FQName: String?
	
	


  }
  
  public class LocalDateAndTimeStamp : Triplet {
  
  	  
	
	
	  public var StampType: Int?
	
	
	
	  public var THunYear: Int?
	
	
	
	  public var TenYear: Int?
	
	
	
	  public var Day: Int?
	
	
	
	  public var Hour: Int?
	
	
	
	  public var Minute: Int?
	
	
	
	  public var Second: Int?
	
	
	
	  public var HundSec: Int?
	
	


  }
  
  public class UniversalDateAndTimeStamp : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
	  public var YearAD: Int?
	
	
	
	  public var Month: Int?
	
	
	
	  public var Day: Int?
	
	
	
	  public var Hour: Int?
	
	
	
	  public var Minute: Int?
	
	
	
	  public var Second: Int?
	
	
	
	  public var TimeZone: Int?
	
	
	
	  public var UTCDiffH: Int?
	
	
	
	  public var UTCDiffM: Int?
	
	


  }
  
  public class MappingOption : Triplet {
  
  	  
	
	
	  public var MapValue: Int?
	
	


  }
  
  public class MediaEjectControl : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
	  public var EjCtrl: Int?
	
	


  }
  
  public class MediumMapPageNumber : Triplet {
  
  	  
	
	
	  public var PageNum: Int?
	
	


  }
  
  public class MediumOrientation : Triplet {
  
  	  
	
	
	  public var MedOrient: Int?
	
	


  }
  
  public class MeasurementUnits : Triplet {
  
  	  
	
	
	  public var XoaBase: Int?
	
	
	
	  public var YoaBase: Int?
	
	
	
	  public var XoaUnits: Int?
	
	
	
	  public var YoaUnits: Int?
	
	


  }
  
  public class MODCAInterchangeSet : Triplet {
  
  	  
	
	
	  public var IStype: Int?
	
	
	
	  public var ISid: Int?
	
	


  }
  
  public class ObjectAreaSize : Triplet {
  
  	  
	
	
	  public var SizeType: Int?
	
	
	
	  public var XoaSize: Int?
	
	
	
	  public var YoaSize: Int?
	
	


  }
  
  public class ObjectClassification : Triplet {
  
  	  
	
	
	  public var ObjClass: Int?
	
	
	
	  public var StrucFlgs: Int?
	
	
	
	  public var RegObjId: [UInt8]?
	
	
	
	  public var ObjTpName: String?
	
	
	
	  public var ObjLev: String?
	
	
	
	  public var CompName: String?
	
	


  }
  
  public class ObjectFunctionSetSpecification : Triplet {
  
  	  
	
	
	  public var ObjType: Int?
	
	
	
	  public var ArchVrsn: Int?
	
	
	
	  public var DCAFnSet: Int?
	
	
	
	  public var OCAFnSet: Int?
	
	


  }
  
  public class ObjectOffset : Triplet {
  
  	  
	
	
	  public var ObjTpe: Int?
	
	
	
	  public var ObjOset: Int?
	
	
	
	  public var ObjOstHi: Int?
	
	


  }
  
  public class ResourceObjectType : Triplet {
  
  	  
	
	
	  public var ObjType: Int?
	
	
	
	  public var ConData: [UInt8]?
	
	


  }
  
  public class PagePositionInformation : Triplet {
  
  	  
	
	
	  public var PGPRG: Int?
	
	


  }
  
  public class PresentationControl : Triplet {
  
  	  
	
	
	  public var PRSFlg: Int?
	
	


  }
  
  public class PresentationSpaceResetMixing : Triplet {
  
  	  
	
	
	  public var BgMxFlag: Int?
	
	


  }
  
  public class PresentationSpaceMixingRules : Triplet {
  
  	  
	


  }
  
  public class ResourceLocalIdentifier : Triplet {
  
  	  
	
	
	  public var ResType: Int?
	
	
	
	  public var ResLID: Int?
	
	


  }
  
  public class ResourceSectionNumber : Triplet {
  
  	  
	
	
	  public var ResSNum: Int?
	
	


  }
  
  public class TextOrientation : Triplet {
  
  	  
	
	
	  public var IAxis: Int?
	
	
	
	  public var BAxis: Int?
	
	


  }
  
  public class FontHorizontalScaleFactor : Triplet {
  
  	  
	
	
	  public var Hscale: Int?
	
	


  }
  
  public class FontDescriptorSpecification : Triplet {
  
  	  
	
	
	  public var FtWtClass: Int?
	
	
	
	  public var FtWdClass: Int?
	
	
	
	  public var FtHeight: Int?
	
	
	
	  public var FtWidth: Int?
	
	
	
	  public var FtDsFlags: Int?
	
	
	
	  public var FtUsFlags: Int?
	
	


  }
  
  public class BeginSegment : Triplet {
  
  	  
	
	
	  public var SEGNAME: Int?
	
	


  }
  
  public class EndSegment : Triplet {
  
  	  
	


  }
  
  public class BeginTile : Triplet {
  
  	  
	


  }
  
  public class EndTile : Triplet {
  
  	  
	


  }
  
  public class BeginTransparencyMask : Triplet {
  
  	  
	


  }
  
  public class EndTransparencyMask : Triplet {
  
  	  
	


  }
  
  public class BeginImage : Triplet {
  
  	  
	
	
	  public var OBJTYPE: Int?
	
	


  }
  
  public class EndImage : Triplet {
  
  	  
	


  }
  
  public class ImageSize : Triplet {
  
  	  
	
	
	  public var UNITBASE: Int?
	
	
	
	  public var HRESOL: Int?
	
	
	
	  public var VRESOL: Int?
	
	
	
	  public var HSIZE: Int?
	
	
	
	  public var VSIZE: Int?
	
	


  }
  
  public class ImageEncoding : Triplet {
  
  	  
	
	
	  public var COMPRID: Int?
	
	
	
	  public var RECID: Int?
	
	
	
	  public var BITORDR: Int?
	
	


  }
  
  public class IDESize : Triplet {
  
  	  
	
	
	  public var IDESZ: Int?
	
	


  }
  
  public class ImageLUTID : Triplet {
  
  	  
	
	
	  public var LUTID: Int?
	
	


  }
  
  public class BandImage : Triplet {
  
  	  
	
	
	  public var BCOUNT: Int?
	
	
	
		
		public var rg: [BandImageRG] = []
    	
	
	


  }
  
  public class IDEStructure : Triplet {
  
  	  
	
	
	  public var FLAGS: Int?
	
	
	
	  public var FORMAT: Int?
	
	
	
	  public var SIZE1: Int?
	
	
	
	  public var SIZE2: Int?
	
	
	
	  public var SIZE3: Int?
	
	
	
	  public var SIZE4: Int?
	
	


  }
  
  public class ExternalAlgorithm : Triplet {
  
  	  
	
	
	  public var ALGTYPE: Int?
	
	
	
		
		public var rg: [ExternalAlgorithmRG] = []
    	
	
	


  }
  
  public class TilePosition : Triplet {
  
  	  
	
	
	  public var XOFFSET: Int?
	
	
	
	  public var YOFFSET: Int?
	
	


  }
  
  public class TileSize : Triplet {
  
  	  
	
	
	  public var THSIZE: Int?
	
	
	
	  public var TVSIZE: Int?
	
	
	
	  public var RELRES: Int?
	
	


  }
  
  public class TileSetColor : Triplet {
  
  	  
	
	
	  public var CSPACE: Int?
	
	
	
	  public var RESERVED: Int?
	
	
	
	  public var SIZE1: Int?
	
	
	
	  public var SIZE2: Int?
	
	
	
	  public var SIZE3: Int?
	
	
	
	  public var SIZE4: Int?
	
	
	
	  public var CVAL1: Int?
	
	
	
	  public var CVAL2: Int?
	
	
	
	  public var CVAL3: Int?
	
	
	
	  public var CVAL4: Int?
	
	


  }
  
  public class SetBiLevelImageColor : Triplet {
  
  	  
	
	
	  public var AREA: Int?
	
	
	
	  public var Reserved: [UInt8]?
	
	
	
	  public var NAMECOLR: Int?
	
	


  }
  
  public class IOCAFunctionSetIdentification : Triplet {
  
  	  
	
	
	  public var CATEGORY: Int?
	
	
	
	  public var FCNSET: Int?
	
	


  }
  
  public class ImageData : Triplet {
  
  	  
	
	
	  public var DATA: [UInt8]?
	
	


  }
  
  public class BandImageData : Triplet {
  
  	  
	
	
	  public var BANDNUM: Int?
	
	
	
	  public var RESERVED: Int?
	
	
	
	  public var DATA: [UInt8]?
	
	


  }
  
  public class IncludeTile : Triplet {
  
  	  
	
	
	  public var TIRID: Int?
	
	


  }
  
  public class ImageSubsampling : Triplet {
  
  	  
	
	
		
		public var sdfs: [Triplet] = []
    	
	
	


  }
  
  public class SamplingRatios : Triplet {
  
  	  
	
	
		
		public var rg: [SamplingRatiosRG] = []
    	
	
	


  }
  
  public class TileTOC : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
		
		public var rg: [TileTOCRG] = []
    	
	
	


  }
  
  public class CPIRG : Triplet {
  
  	  
	
	
	  public var GCGID: String?
	
	
	
	  public var PrtFlags: Int?
	
	
	
	  public var CodePoint: Int?
	
	
	
	  public var Count: Int?
	
	


  }
  
  public class CFIRG : Triplet {
  
  	  
	
	
	  public var FCSName: String?
	
	
	
	  public var CPName: String?
	
	
	
	  public var SVSize: Int?
	
	
	
	  public var SHScale: Int?
	
	
	
	  public var Reserved: [UInt8]?
	
	
	
	  public var Section: Int?
	
	


  }
  
  public class FNIRG : Triplet {
  
  	  
	
	
	  public var GCGID: String?
	
	
	
	  public var CharInc: Int?
	
	
	
	  public var AscendHt: Int?
	
	
	
	  public var DescendDp: Int?
	
	
	
	  public var Reserved: Int?
	
	
	
	  public var FNMCnt: Int?
	
	
	
	  public var ASpace: Int?
	
	
	
	  public var BSpace: Int?
	
	
	
	  public var CSpace: Int?
	
	
	
	  public var Reserved2: Int?
	
	
	
	  public var BaseOset: Int?
	
	


  }
  
  public class FNMRG : Triplet {
  
  	  
	
	
	  public var CharBoxWd: Int?
	
	
	
	  public var CharBoxHt: Int?
	
	
	
	  public var PatDOset: Int?
	
	


  }
  
  public class LLERG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
	  public var RGFunct: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MPSRG : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
	  public var PsegName: String?
	
	


  }
  
  public class MCFRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MBCRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MCARG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MCDRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MDRRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MGORG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MIORG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MMDRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MMTRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MPGRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class MPORG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class PPORG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
	  public var ObjType: Int?
	
	
	
	  public var ProcFlgs: Int?
	
	
	
	  public var XocaOset: Int?
	
	
	
	  public var YocaOset: Int?
	
	
	
		
		public var Triplets: [Triplet] = []
    	
	
	


  }
  
  public class PGPRG : Triplet {
  
  	  
	
	
	  public var RGLength: Int?
	
	
	
	  public var XmOset: Int?
	
	
	
	  public var YmOset: Int?
	
	
	
	  public var PGorient: Int?
	
	
	
	  public var SHside: Int?
	
	
	
	  public var PgFlgs: Int?
	
	
	
	  public var PMCid: Int?
	
	


  }
  
  public class MCCRG : Triplet {
  
  	  
	
	
	  public var Startnum: Int?
	
	
	
	  public var Stopnum: Int?
	
	
	
	  public var MMCid: Int?
	
	


  }
  
  public class MMORG : Triplet {
  
  	  
	
	
	  public var OVLid: Int?
	
	
	
	  public var Flags: Int?
	
	
	
	  public var OVLname: String?
	
	


  }
  
  public class BandImageRG : Triplet {
  
  	  
	
	
	  public var BITCNT: Int?
	
	


  }
  
  public class MCF1RG : Triplet {
  
  	  
	
	
	  public var CFLid: Int?
	
	
	
	  public var Sectid: Int?
	
	
	
	  public var CFName: String?
	
	
	
	  public var CPName: String?
	
	
	
	  public var FCSName: String?
	
	
	
	  public var CharRot: Int?
	
	


  }
  
  public class MMCRG : Triplet {
  
  	  
	
	
	  public var key: Int?
	
	
	
	  public var value: Int?
	
	


  }
  
  public class FNORG : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
	  public var CharRot: Int?
	
	
	
	  public var MaxBOset: Int?
	
	
	
	  public var MaxCharInc: Int?
	
	
	
	  public var SpCharInc: Int?
	
	
	
	  public var MaxBExt: Int?
	
	
	
	  public var OrntFlgs: Int?
	
	
	
	  public var Reserved2: Int?
	
	
	
	  public var EmSpInc: Int?
	
	
	
	  public var Reserved3: Int?
	
	
	
	  public var FigSpInc: Int?
	
	
	
	  public var NomCharInc: Int?
	
	
	
	  public var DefBInc: Int?
	
	
	
	  public var MinASp: Int?
	
	


  }
  
  public class FNPRG : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
	  public var LcHeight: Int?
	
	
	
	  public var CapMHt: Int?
	
	
	
	  public var MaxAscHt: Int?
	
	
	
	  public var MaxDesDp: Int?
	
	
	
	  public var Reserved2: [UInt8]?
	
	
	
	  public var Retired: Int?
	
	
	
	  public var Reserved3: Int?
	
	
	
	  public var UscoreWd: Int?
	
	
	
	  public var UscoreWdf: Int?
	
	
	
	  public var UscorePos: Int?
	
	


  }
  
  public class TileTOCRG : Triplet {
  
  	  
	
	
	  public var XOFFSET: Int?
	
	
	
	  public var YOFFSET: Int?
	
	
	
	  public var THSIZE: Int?
	
	
	
	  public var TVSIZE: Int?
	
	
	
	  public var RELRES: Int?
	
	
	
	  public var COMPR: Int?
	
	
	
	  public var DATAPOS: Int?
	
	


  }
  
  public class SamplingRatiosRG : Triplet {
  
  	  
	
	
	  public var HSAMPLE: Int?
	
	
	
	  public var VSAMPLE: Int?
	
	


  }
  
  public class ExternalAlgorithmRG : Triplet {
  
  	  
	
	
	  public var DIRCTN: Int?
	
	
	
	  public var PADBDRY: Int?
	
	
	
	  public var PADALMT: Int?
	
	


  }
  
  public class FNNRG : Triplet {
  
  	  
	
	
	  public var GCGID: String?
	
	
	
	  public var TSOffset: Int?
	
	


  }
  
  public class FNNRG2 : Triplet {
  
  	  
	
	
	  public var TSIDLen: Int?
	
	
	
	  public var TSID: [UInt8]?
	
	


  }
  
  public class BeginSegmentCommand : Triplet {
  
  	  
	
	
	  public var LENGTH: Int?
	
	
	
	  public var NAME: Int?
	
	
	
	  public var FLAG1: Int?
	
	
	
	  public var FLAG2: Int?
	
	
	
	  public var SEGL: Int?
	
	
	
	  public var PSNAME: String?
	
	


  }
  
  public class EndSegmentCommand : Triplet {
  
  	  
	


  }
  
  public class GBAR : Triplet {
  
  	  
	
	
	  public var FLAGS: Int?
	
	


  }
  
  public class GBIMG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	
	
	  public var FORMAT: Int?
	
	
	
	  public var RES: Int?
	
	
	
	  public var WIDTH: Int?
	
	
	
	  public var HEIGHT: Int?
	
	


  }
  
  public class GCBIMG : Triplet {
  
  	  
	
	
	  public var FORMAT: Int?
	
	
	
	  public var RES: Int?
	
	
	
	  public var WIDTH: Int?
	
	
	
	  public var HEIGHT: Int?
	
	


  }
  
  public class GBOX : Triplet {
  
  	  
	
	
	  public var RES: Int?
	
	
	
	  public var XPOS0: Int?
	
	
	
	  public var YPOS0: Int?
	
	
	
	  public var XPOS1: Int?
	
	
	
	  public var YPOS1: Int?
	
	
	
	  public var HAXIS: Int?
	
	
	
	  public var VAXIS: Int?
	
	


  }
  
  public class GCBOX : Triplet {
  
  	  
	
	
	  public var RES: Int?
	
	
	
	  public var XPOS1: Int?
	
	
	
	  public var YPOS1: Int?
	
	
	
	  public var HAXIS: Int?
	
	
	
	  public var VAXIS: Int?
	
	


  }
  
  public class GCHST : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	
	
	  public var CP: String?
	
	


  }
  
  public class GCCHST : Triplet {
  
  	  
	
	
	  public var CP: String?
	
	


  }
  
  public class GCOMT : Triplet {
  
  	  
	
	
	  public var DATA: [UInt8]?
	
	


  }
  
  public class GEAR : Triplet {
  
  	  
	
	
	  public var DATA: [UInt8]?
	
	


  }
  
  public class GEIMG : Triplet {
  
  	  
	
	
	  public var DATA: [UInt8]?
	
	


  }
  
  public class GEPROL : Triplet {
  
  	  
	
	
	  public var RES: Int?
	
	


  }
  
  public class GFLT : Triplet {
  
  	  
	
	
		
		public var rg: [GFLTRG] = []
    	
	
	


  }
  
  public class GCFLT : Triplet {
  
  	  
	
	
		
		public var rg: [GCFLTRG] = []
    	
	
	


  }
  
  public class GFARC : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	
	
	  public var MH: Int?
	
	
	
	  public var MFR: Int?
	
	


  }
  
  public class GCFARC : Triplet {
  
  	  
	
	
	  public var MH: Int?
	
	
	
	  public var MFR: Int?
	
	


  }
  
  public class GIMD : Triplet {
  
  	  
	
	
	  public var DATA: [UInt8]?
	
	


  }
  
  public class GLINE : Triplet {
  
  	  
	
	
		
		public var rg: [GLINERG] = []
    	
	
	


  }
  
  public class GCLINE : Triplet {
  
  	  
	
	
		
		public var rg: [GCLINERG] = []
    	
	
	


  }
  
  public class GMRK : Triplet {
  
  	  
	
	
		
		public var rg: [GMRKRG] = []
    	
	
	


  }
  
  public class GCMRK : Triplet {
  
  	  
	
	
		
		public var rg: [GCMRKRG] = []
    	
	
	


  }
  
  public class GNOP1 : Triplet {
  
  	  
	


  }
  
  public class GPARC : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	
	
	  public var XCENT: Int?
	
	
	
	  public var YCENT: Int?
	
	
	
	  public var MH: Int?
	
	
	
	  public var MFR: Int?
	
	
	
	  public var START: Int?
	
	
	
	  public var SWEEP: Int?
	
	


  }
  
  public class GCPARC : Triplet {
  
  	  
	
	
	  public var XCENT: Int?
	
	
	
	  public var YCENT: Int?
	
	
	
	  public var MH: Int?
	
	
	
	  public var MFR: Int?
	
	
	
	  public var START: Int?
	
	
	
	  public var SWEEP: Int?
	
	


  }
  
  public class GRLINE : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	
	
		
		public var rg: [GRLINERG] = []
    	
	
	


  }
  
  public class GCRLINE : Triplet {
  
  	  
	
	
		
		public var rg: [GCRLINERG] = []
    	
	
	


  }
  
  public class GSGCH : Triplet {
  
  	  
	


  }
  
  public class GSAP : Triplet {
  
  	  
	
	
	  public var P: Int?
	
	
	
	  public var Q: Int?
	
	
	
	  public var R: Int?
	
	
	
	  public var S: Int?
	
	


  }
  
  public class GSBMX : Triplet {
  
  	  
	
	
	  public var MODE: Int?
	
	


  }
  
  public class GSCA : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GSCC : Triplet {
  
  	  
	
	
	  public var CELLWI: Int?
	
	
	
	  public var CELLHI: Int?
	
	
	
	  public var CELLWFR: Int?
	
	
	
	  public var CELLHFR: Int?
	
	


  }
  
  public class GSCD : Triplet {
  
  	  
	
	
	  public var DIRECTION: Int?
	
	


  }
  
  public class GSCR : Triplet {
  
  	  
	
	
	  public var PREC: Int?
	
	


  }
  
  public class GSCS : Triplet {
  
  	  
	
	
	  public var LCID: Int?
	
	


  }
  
  public class GSCH : Triplet {
  
  	  
	
	
	  public var HX: Int?
	
	
	
	  public var HY: Int?
	
	


  }
  
  public class GSCOL : Triplet {
  
  	  
	
	
	  public var COL: Int?
	
	


  }
  
  public class GSCP : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GSECOL : Triplet {
  
  	  
	
	
	  public var COLOR: Int?
	
	


  }
  
  public class GSFLW : Triplet {
  
  	  
	
	
	  public var MH: Int?
	
	
	
	  public var MFR: Int?
	
	


  }
  
  public class GSLT : Triplet {
  
  	  
	
	
	  public var LINETYPE: Int?
	
	


  }
  
  public class GSLW : Triplet {
  
  	  
	
	
	  public var MH: Int?
	
	


  }
  
  public class GSMC : Triplet {
  
  	  
	
	
	  public var CELLWI: Int?
	
	
	
	  public var CELLHI: Int?
	
	


  }
  
  public class GSMP : Triplet {
  
  	  
	
	
	  public var PREC: Int?
	
	


  }
  
  public class GSMS : Triplet {
  
  	  
	
	
	  public var LCID: Int?
	
	


  }
  
  public class GSMT : Triplet {
  
  	  
	
	
	  public var MCPT: Int?
	
	


  }
  
  public class GSMX : Triplet {
  
  	  
	
	
	  public var MODE: Int?
	
	


  }
  
  public class GSPS : Triplet {
  
  	  
	
	
	  public var LCID: Int?
	
	


  }
  
  public class GSPT : Triplet {
  
  	  
	
	
	  public var PATT: Int?
	
	


  }
  
  public class GSPCOL : Triplet {
  
  	  
	
	
	  public var RES1: Int?
	
	
	
	  public var COLSPCE: Int?
	
	
	
	  public var RES2: Int?
	
	
	
	  public var COLSIZE1: Int?
	
	
	
	  public var COLSIZE2: Int?
	
	
	
	  public var COLSIZE3: Int?
	
	
	
	  public var COLSIZE4: Int?
	
	
	
	  public var COLVALUE: [UInt8]?
	
	


  }
  
  public class GSLE : Triplet {
  
  	  
	
	
	  public var LINEEND: Int?
	
	


  }
  
  public class GSLJ : Triplet {
  
  	  
	
	
	  public var LINEJOIN: Int?
	
	


  }
  
  public class GCBEZ : Triplet {
  
  	  
	
	
		
		public var rg: [GCBEZRG] = []
    	
	
	


  }
  
  public class GCCBEZ : Triplet {
  
  	  
	
	
		
		public var rg: [GCCBEZRG] = []
    	
	
	


  }
  
  public class WindowSpecification : Triplet {
  
  	  
	
	
	  public var FLAGS: Int?
	
	
	
	  public var RES3: Int?
	
	
	
	  public var CFORMAT: Int?
	
	
	
	  public var UBASE: Int?
	
	
	
	  public var XRESOL: Int?
	
	
	
	  public var YRESOL: Int?
	
	
	
	  public var IMGXYRES: Int?
	
	
	
	  public var XLWIND: Int?
	
	
	
	  public var XRWIND: Int?
	
	
	
	  public var YBWIND: Int?
	
	
	
	  public var YTWIND: Int?
	
	


  }
  
  public class DrawingOrderSubset : Triplet {
  
  	  
	


  }
  
  public class GCBEZRG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GCCBEZRG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GFLTRG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GCFLTRG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GLINERG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GCLINERG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GMRKRG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GCMRKRG : Triplet {
  
  	  
	
	
	  public var XPOS: Int?
	
	
	
	  public var YPOS: Int?
	
	


  }
  
  public class GRLINERG : Triplet {
  
  	  
	
	
	  public var XOSSF: Int?
	
	
	
	  public var YOFFS: Int?
	
	


  }
  
  public class GCRLINERG : Triplet {
  
  	  
	
	
	  public var XOSSF: Int?
	
	
	
	  public var YOFFS: Int?
	
	


  }
  
  public class TonerSaver : Triplet {
  
  	  
	
	
	  public var TSvCtrl: Int?
	
	


  }
  
  public class ColorFidelity : Triplet {
  
  	  
	
	
	  public var StpCoEx: Int?
	
	
	
	  public var RepCoEx: Int?
	
	
	
	  public var ColSub: Int?
	
	


  }
  
  public class FontFidelity : Triplet {
  
  	  
	
	
	  public var StpFntEx: Int?
	
	


  }
  
  public class TextFidelity : Triplet {
  
  	  
	
	
	  public var StpTxtEx: Int?
	
	
	
	  public var RepTxtEx: Int?
	
	


  }
  
  public class MediaFidelity : Triplet {
  
  	  
	
	
	  public var StpMedEx: Int?
	
	


  }
  
  public class FinishingFidelity : Triplet {
  
  	  
	
	
	  public var StpFinEx: Int?
	
	
	
	  public var RepFinEx: Int?
	
	


  }
  
  public class CMRFidelity : Triplet {
  
  	  
	
	
	  public var StpCMREx: Int?
	
	
	
	  public var RepCMREx: Int?
	
	


  }
  
  public class ObjectByteExtent : Triplet {
  
  	  
	
	
	  public var ByteExt: Int?
	
	
	
	  public var ByteExtHi: Int?
	
	


  }
  
  public class ObjectByteOffset : Triplet {
  
  	  
	
	
	  public var DirByOff: Int?
	
	
	
	  public var DirByHi: Int?
	
	


  }
  
  public class ObjectStructuredFieldExtent : Triplet {
  
  	  
	
	
	  public var SFExt: Int?
	
	
	
	  public var SFExtHi: Int?
	
	


  }
  
  public class ObjectStructuredFieldOffset : Triplet {
  
  	  
	
	
	  public var SFOff: Int?
	
	
	
	  public var SFOffHi: Int?
	
	


  }
  
  public class ObjectCount : Triplet {
  
  	  
	
	
	  public var SubObj: Int?
	
	
	
	  public var SObjNum: Int?
	
	
	
	  public var SobjNmHi: Int?
	
	


  }
  
  public class ObjectOriginIdentifier : Triplet {
  
  	  
	
	
	  public var System: Int?
	
	
	
	  public var SysID: [UInt8]?
	
	
	
	  public var MedID: [UInt8]?
	
	
	
	  public var DSID: [UInt8]?
	
	


  }
  
  public class LineDataObjectPositionMigration : Triplet {
  
  	  
	
	
	  public var TempOrient: Int?
	
	


  }
  
  public class ColorManagementResourceDescriptor : Triplet {
  
  	  
	
	
	  public var ProcMode: Int?
	
	
	
	  public var CMRScpe: Int?
	
	


  }
  
  public class MSURG : Triplet {
  
  	  
	
	
	  public var SUPname: String?
	
	
	
	  public var Reserved: [UInt8]?
	
	
	
	  public var SUPid: Int?
	
	


  }
  
  public class ImageResolution : Triplet {
  
  	  
	
	
	  public var XBase: Int?
	
	
	
	  public var YBase: Int?
	
	
	
	  public var XResol: Int?
	
	
	
	  public var YResol: Int?
	
	


  }
  
  public class ObjectContainerPresentationSpaceSize : Triplet {
  
  	  
	
	
	  public var PDFSize: Int?
	
	


  }
  
  public class ExtendedResourceLocalIdentifier : Triplet {
  
  	  
	
	
	  public var ResType: Int?
	
	
	
	  public var ResLID: Int?
	
	


  }
  
  public class MetricAdjustment : Triplet {
  
  	  
	
	
	  public var UnitBase: Int?
	
	
	
	  public var XUPUB: Int?
	
	
	
	  public var YUPUB: Int?
	
	
	
	  public var HUniformIncrement: Int?
	
	
	
	  public var VUniformIncrement: Int?
	
	
	
	  public var HBaselineIncrement: Int?
	
	
	
	  public var VBaselineIncrement: Int?
	
	


  }
  
  public class ExtensionFont : Triplet {
  
  	  
	
	
	  public var GCSGID: Int?
	
	


  }
  
  public class RenderingIntent : Triplet {
  
  	  
	
	
	  public var Reserved: Int?
	
	
	
	  public var IOCARI: Int?
	
	
	
	  public var OCRI: Int?
	
	
	
	  public var PTOCRI: Int?
	
	
	
	  public var GOCARI: Int?
	
	
	
	  public var Reserved2: Int?
	
	


  }
  
  public class FontCodedGraphicCharacterSetGlobalIdentifier : Triplet {
  
  	  
	
	
	  public var GCSGID: Int?
	
	
	
	  public var CPGID: Int?
	
	


  }
  
  public class LocaleSelector : Triplet {
  
  	  
	
	
	  public var LocFlgs: Int?
	
	
	
	  public var LangCode: String?
	
	
	
	  public var ScrptCde: String?
	
	
	
	  public var RegCde: String?
	
	
	
	  public var Reserved: [UInt8]?
	
	
	
	  public var VarCde: String?
	
	


  }
  
  public class FinishingOperation : Triplet {
  
  	  
	
	
	  public var FOpType: Int?
	
	
	
	  public var RefEdge: Int?
	
	
	
	  public var FOpCnt: Int?
	
	
	
	  public var AxOffst: Int?
	
	
	
	  public var OpPos: [UInt8]?
	
	


  }
  
  public class UP3iFinishingOperation : Triplet {
  
  	  
	
	
	  public var Seqnum: Int?
	
	
	
	  public var UP3iDat: [UInt8]?
	
	


  }
  
  public class DeviceAppearance : Triplet {
  
  	  
	
	
	  public var DevApp: Int?
	
	
	
	  public var Reserved: [UInt8]?
	
	


  }
  
  public class ResourceObjectInclude : Triplet {
  
  	  
	
	
	  public var ObjType: Int?
	
	
	
	  public var ObjName: String?
	
	
	
	  public var XobjOset: Int?
	
	
	
	  public var YobjOset: Int?
	
	
	
	  public var ObOrent: Int?
	
	


  }
  
  public class PageOverlayConditionalProcessing : Triplet {
  
  	  
	
	
	  public var PgOvType: Int?
	
	
	
	  public var Level: Int?
	
	


  }
  
  public class ResourceUsageAttribute : Triplet {
  
  	  
	
	
	  public var Frequency: Int?
	
	


  }
  
  
