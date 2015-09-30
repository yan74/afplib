

import Foundation

    func toSigned(data: UnsafePointer<UInt8>, length: Int) -> Int {
        var result:Int = Int(UnsafePointer<Int8>(data).memory)
        var p = data.successor()
        
        for i in 1..<length {
            result = result << 8
            result |= Int(p.memory)
            p = p.successor()
        }
        
        return result
    }

    func toUnsigned(data: UnsafePointer<UInt8>, length: Int) -> Int {
        var result = 0
        var p = data
        
        for i in 0..<length {
            result = result << 8
            result |= ((Int(p.memory & 0xff)) & 0xff)
            p = p.successor()
        }
        
        return result
    }
    
    func toString(data: UnsafePointer<UInt8>, length: Int, cpgid: Int) -> String {
        if cpgid == 850 {
            var result = NSString(bytes: data, length: length, encoding: NSASCIIStringEncoding)
            return result! as String
        } else if cpgid == 1200 {
            var result = NSString(bytes: data, length: length, encoding: NSUTF16StringEncoding)
            return result! as String
        } else if cpgid == 1250 {
            var result = NSString(bytes: data, length: length, encoding: NSWindowsCP1250StringEncoding)
            return result! as String
        } else if cpgid == 1251 {
            var result = NSString(bytes: data, length: length, encoding: NSWindowsCP1251StringEncoding)
            return result! as String
        } else if cpgid == 1252 {
            var result = NSString(bytes: data, length: length, encoding: NSWindowsCP1252StringEncoding)
            return result! as String
        } else if cpgid == 1253 {
            var result = NSString(bytes: data, length: length, encoding: NSWindowsCP1253StringEncoding)
            return result! as String
        } else if cpgid == 1254 {
            var result = NSString(bytes: data, length: length, encoding: NSWindowsCP1254StringEncoding)
            return result! as String
        } else {
            let bytes = ebcdic2ascii(toBytes(data, length))
            let p = UnsafePointer<Void>(bytes)
            var result = NSString(bytes: p, length: length, encoding: NSASCIIStringEncoding)
            return result! as String
        }
    }

    func toBytes(data: UnsafePointer<UInt8>, length: Int) -> [UInt8] {
        var result: [UInt8] = []

        var p = data
        
        for i in 0..<length {
            result.append(p.memory)
            p = p.successor()
        }

        return result
    }
    
    
public class AfpFactory {
    
    var cpgid = 500
    var cpgids: [Int] = []
    var missingImageData = 0

	let sfCreators = [ 13871305 : c_BAG,13871339 : c_BBC,13871223 : c_BCA,13871242 : c_BCF,13871239 : c_BCP,13889259 : c_BDA,13870827 : c_BDD,13871300 : c_BDG,13871271 : c_BDI,13871306 : c_BDM,13871272 : c_BDT,13871331 : c_BDX,13871301 : c_BFG,13871309 : c_BFM,13871241 : c_BFN,13871291 : c_BGR,13871227 : c_BII,13871355 : c_BIM,13871308 : c_BMM,13871327 : c_BMO,13871277 : c_BNG,13871250 : c_BOC,13871303 : c_BOG,13871269 : c_BPF,13871279 : c_BPG,13871307 : c_BPM,13871199 : c_BPS,13871259 : c_BPT,13871302 : c_BRG,13871310 : c_BRS,13871321 : c_BSG,13873271 : c_CAT,13870738 : c_CDD,13870986 : c_CFC,13864074 : c_CFI,13870983 : c_CPC,13870727 : c_CPD,13864071 : c_CPI,13871003 : c_CTC,13870819 : c_DXD,13871561 : c_EAG,13871595 : c_EBC,13871479 : c_ECA,13871498 : c_ECF,13871495 : c_ECP,13871556 : c_EDG,13871527 : c_EDI,13871562 : c_EDM,13871528 : c_EDT,13871587 : c_EDX,13871557 : c_EFG,13871565 : c_EFM,13871497 : c_EFN,13871547 : c_EGR,13871483 : c_EII,13871611 : c_EIM,13871564 : c_EMM,13871583 : c_EMO,13871533 : c_ENG,13871506 : c_EOC,13871559 : c_EOG,13871525 : c_EPF,13871535 : c_EPG,13871563 : c_EPM,13871455 : c_EPS,13871515 : c_EPT,13871558 : c_ERG,13871566 : c_ERS,13871577 : c_ESG,13870985 : c_FNC,13870729 : c_FND,13889161 : c_FNG,13864073 : c_FNI,13872009 : c_FNN,13869705 : c_FNM,13872777 : c_FNO,13872265 : c_FNP,13889211 : c_GAD,13870779 : c_GDD,13872251 : c_ICP,13870843 : c_IDD,13873831 : c_IEL,13870715 : c_IID,13872076 : c_IMM,13873091 : c_IOB,13870971 : c_IOC,13889275 : c_IPD,13873071 : c_IPG,13873112 : c_IPO,13872991 : c_IPS,13889147 : c_IRD,13874320 : c_LLE,13871847 : c_LNC,13870823 : c_LND,13872107 : c_MBC,13871991 : c_MCA,13869704 : c_MCC,13872018 : c_MCD,13872010 : c_MCF,13873546 : c_MCF1,13870728 : c_MDD,13872067 : c_MDR,13869192 : c_MFC,13872059 : c_MGO,13872123 : c_MIO,13870984 : c_MMC,13872077 : c_MMD,13873631 : c_MMO,13872008 : c_MMT,13872047 : c_MPG,13872088 : c_MPO,13873503 : c_MPS,13872106 : c_MSU,13889262 : c_NOP,13870699 : c_OBD,13872235 : c_OBP,13889170 : c_OCD,13871016 : c_PEC,13873800 : c_PFC,13870767 : c_PGD,13873583 : c_PGP,13872303 : c_PGP1,13871023 : c_PMC,13872579 : c_PPO,13873563 : c_PTD,13870747 : c_PTD1,13889179 : c_PTX,13869200 : c_TLE,13870789 : c_FGD, ]
	let tripletCreators = [ 128 : c_AttributeQualifier,54 : c_AttributeValue,1 : c_CGCSGID,99 : c_CRCResourceManagement,38 : c_CharacterRotation,78 : c_ColorSpecification,101 : c_Comment,139 : c_DataObjectFontDescriptor,67 : c_DescriptorPosition,80 : c_EncodingSchemeID,132 : c_FontResolution,2 : c_FullyQualifiedName,98 : c_LocalDateAndTimeStamp,114 : c_UniversalDateAndTimeStamp,4 : c_MappingOption,69 : c_MediaEjectControl,86 : c_MediumMapPageNumber,104 : c_MediumOrientation,75 : c_MeasurementUnits,24 : c_MODCAInterchangeSet,76 : c_ObjectAreaSize,16 : c_ObjectClassification,-33 : c_ObjectFunctionSetSpecification,90 : c_ObjectOffset,33 : c_ResourceObjectType,129 : c_PagePositionInformation,131 : c_PresentationControl,112 : c_PresentationSpaceResetMixing,113 : c_PresentationSpaceMixingRules,36 : c_ResourceLocalIdentifier,37 : c_ResourceSectionNumber,29 : c_TextOrientation,93 : c_FontHorizontalScaleFactor,31 : c_FontDescriptorSpecification,116 : c_TonerSaver,117 : c_ColorFidelity,120 : c_FontFidelity,134 : c_TextFidelity,135 : c_MediaFidelity,136 : c_FinishingFidelity,150 : c_CMRFidelity,87 : c_ObjectByteExtent,45 : c_ObjectByteOffset,89 : c_ObjectStructuredFieldExtent,88 : c_ObjectStructuredFieldOffset,94 : c_ObjectCount,100 : c_ObjectOriginIdentifier,39 : c_LineDataObjectPositionMigration,145 : c_ColorManagementResourceDescriptor,154 : c_ImageResolution,156 : c_ObjectContainerPresentationSpaceSize,34 : c_ExtendedResourceLocalIdentifier,121 : c_MetricAdjustment,109 : c_ExtensionFont,149 : c_RenderingIntent,32 : c_FontCodedGraphicCharacterSetGlobalIdentifier,140 : c_LocaleSelector,133 : c_FinishingOperation,142 : c_UP3iFinishingOperation,151 : c_DeviceAppearance,108 : c_ResourceObjectInclude,70 : c_PageOverlayConditionalProcessing,71 : c_ResourceUsageAttribute, ]
	let csCreators = [ 210 : c_AMB,198 : c_AMI,216 : c_BLN,242 : c_BSU,230 : c_DBR,228 : c_DIR,244 : c_ESU,248 : c_NOPCS,114 : c_OVS,212 : c_RMB,200 : c_RMI,238 : c_RPS,208 : c_SBI,240 : c_SCFL,128 : c_SEC,194 : c_SIA,192 : c_SIM,116 : c_STC,246 : c_STO,196 : c_SVI,120 : c_TBM,218 : c_TRN,118 : c_USC, ]
	let sdfCreators = [ 112 : c_BeginSegment,113 : c_EndSegment,140 : c_BeginTile,141 : c_EndTile,142 : c_BeginTransparencyMask,143 : c_EndTransparencyMask,145 : c_BeginImage,147 : c_EndImage,148 : c_ImageSize,149 : c_ImageEncoding,150 : c_IDESize,151 : c_ImageLUTID,152 : c_BandImage,155 : c_IDEStructure,159 : c_ExternalAlgorithm,181 : c_TilePosition,182 : c_TileSize,183 : c_TileSetColor,246 : c_SetBiLevelImageColor,247 : c_IOCAFunctionSetIdentification,65170 : c_ImageData,65180 : c_BandImageData,65208 : c_IncludeTile,65230 : c_ImageSubsampling,1 : c_SamplingRatios,65211 : c_TileTOC, ]
	let gocaCreators = [ 112 : c_BeginSegmentCommand,113 : c_EndSegmentCommand,104 : c_GBAR,209 : c_GBIMG,145 : c_GCBIMG,192 : c_GBOX,128 : c_GCBOX,195 : c_GCHST,131 : c_GCCHST,1 : c_GCOMT,96 : c_GEAR,147 : c_GEIMG,62 : c_GEPROL,197 : c_GFLT,133 : c_GCFLT,199 : c_GFARC,135 : c_GCFARC,146 : c_GIMD,193 : c_GLINE,129 : c_GCLINE,194 : c_GMRK,130 : c_GCMRK,0 : c_GNOP1,227 : c_GPARC,163 : c_GCPARC,225 : c_GRLINE,161 : c_GCRLINE,4 : c_GSGCH,34 : c_GSAP,13 : c_GSBMX,52 : c_GSCA,51 : c_GSCC,58 : c_GSCD,57 : c_GSCR,56 : c_GSCS,53 : c_GSCH,10 : c_GSCOL,33 : c_GSCP,38 : c_GSECOL,17 : c_GSFLW,24 : c_GSLT,25 : c_GSLW,55 : c_GSMC,59 : c_GSMP,60 : c_GSMS,41 : c_GSMT,12 : c_GSMX,8 : c_GSPS,40 : c_GSPT,178 : c_GSPCOL,26 : c_GSLE,27 : c_GSLJ,229 : c_GCBEZ,165 : c_GCCBEZ,246 : c_WindowSpecification,247 : c_DrawingOrderSubset, ]
    
	public func sf(data: UnsafePointer<UInt8>, length: Int) -> SF? {
        var id = toUnsigned(data.advancedBy(3), 3)
		let creator = sfCreators[id]
		if creator == nil { return nil }
        
        let obj = creator!(self)(data, length: length)
        return obj
	}

	func triplet(tripletData: UnsafePointer<UInt8>, tripletLength: Int) -> [Triplet] {
		var triplets: [Triplet] = []
		var available = tripletLength
		var data = tripletData
		while available >= 2 {
			var length = Int(data.memory)
			if length == 0 || length > available { break }

			var id = Int(data.successor().memory)
			let creator = tripletCreators[id]
			if creator != nil { 
		        let obj = creator!(self)(data, length: length)
		        triplets.append(obj)
			}

			data = data.advancedBy(length)
			available -= length
		}
		return triplets
	}
	
    func sdf(sdfData: UnsafePointer<UInt8>, sdfLength: Int) -> [Triplet] {
        var sdfs: [Triplet] = []
        var available = sdfLength
        var data = sdfData
        
        while available >= 2 {
            var id = Int(data.memory)
            var length = 0
            
            if(id == 0xfe) {
                id = toUnsigned(data, 2)
                length = toUnsigned(data.advancedBy(2), 2) + 4
            } else {
                length = toUnsigned(data.advancedBy(1), 1) + 2
            }
            if length == 0 || length > available { break }
            
            let creator = sdfCreators[id]
            if creator != nil {
                let obj = creator!(self)(data, length: length)
                sdfs.append(obj)
            }
            
            data = data.advancedBy(length)
            available -= length
        }
        return sdfs
    }

    func goca(gocaData: UnsafePointer<UInt8>, gocaLength: Int) -> [Triplet] {
        var gocas: [Triplet] = []
        var available = gocaLength
        var data = gocaData
        
        while available >= 2 {
            var id = Int(data.memory)
            var length = 0
            
            if id == 0 {
                length = 1
            } else if id & 0x88 == 0x08 {
                length = 2
            } else if id == 0xfe {
            	id = toUnsigned(data.advancedBy(1), 1)
                length = toUnsigned(data.advancedBy(2), 2) + 4
            } else {
                length = toUnsigned(data.advancedBy(1), 1) + 2
            }
            if length == 0 || length > available { break }
            
            let creator = gocaCreators[id]
            if creator != nil {
                let obj = creator!(self)(data, length: length)
                gocas.append(obj)
            }
            
            data = data.advancedBy(length)
            available -= length
        }
        return gocas
    }

    func isChained(functionType: UInt8) -> Bool {
        return (functionType & 0x01) == 1
    }
    
    func unchain(functionType: UInt8) -> UInt8 {
        return functionType & 0xfe
    }
    
	func cs(csData: UnsafePointer<UInt8>, csLength: Int) -> [Triplet] {
        var result: [Triplet] = []
        var available = csLength
		var data = csData
		var number = 0
		
		var chained = false
		
		while available >= 2 {
		
			if !chained && (data.memory != 0x2B || data.successor().memory != 0xD3) {
				//rest are code points
				let creator = csCreators[0xda]
				let obj = creator!(self)(data, length: available)
				number++
				result.append(obj)
				return result
			}
			
			if !chained {
				data = data.advancedBy(2)
				available -= 2
			}
			
			var length = Int(data.memory)
			length--
			data = data.successor()
            available--
			
			var functionType = data.memory
			if isChained(functionType) {
				chained = true
				functionType = unchain(functionType)
			} else {
				chained = false
			}
			
			let creator = csCreators[Int(functionType)]
			let obj = creator!(self)(data, length: length)
			number++
			result.append(obj)

			data = data.advancedBy(length)
			available -= length
        }
        return result
	}

	
    func c_BAG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BAG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.AEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BBC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BBC();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.BCdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BCA(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BCA();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.CATName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BCF(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BCF();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BCP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BCP();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BDA(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDA();
			
			
			
			
			
			
		
		if(9 < length) {
		  let l = 1
		
 	obj.Flags = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.Xoffset = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.Yoffset = toUnsigned(data.advancedBy(12), l)
 	} 


				
		if(14 < length) {
		  let l = length - 14 // < 32755 ? length - 14 : 32755
		
 	obj.Data = toBytes(data.advancedBy(14), l)
 	} 


			return obj
	}
	
    func c_BDD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDD();
			
			
			
			
			
				
		if(32 < length) {
		  let l = length - 32 // < 32737 ? length - 32 : 32737
		
 	
	
	obj.Triplets = triplet(data.advancedBy(32), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.UBASE = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.Reserved = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.XUPUB = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.YUPUB = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(16 < length) {
		  let l = 2
		
 	obj.XEXTENT = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.YEXTENT = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(20 < length) {
		  let l = 2
		
 	obj.Reserved2 = toUnsigned(data.advancedBy(19), l)
 	} 


		
		if(21 < length) {
		  let l = 1
		
 	obj.TYPE = toUnsigned(data.advancedBy(21), l)
 	} 


		
		if(22 < length) {
		  let l = 1
		
 	obj.MOD = toUnsigned(data.advancedBy(22), l)
 	} 


		
		if(23 < length) {
		  let l = 1
		
 	obj.LID = toUnsigned(data.advancedBy(23), l)
 	} 


		
		if(25 < length) {
		  let l = 2
		
 	obj.COLOR = toUnsigned(data.advancedBy(24), l)
 	} 


		
		if(26 < length) {
		  let l = 1
		
 	obj.MODULEWIDTH = toUnsigned(data.advancedBy(26), l)
 	} 


		
		if(28 < length) {
		  let l = 2
		
 	obj.ELEMENTHEIGHT = toUnsigned(data.advancedBy(27), l)
 	} 


		
		if(29 < length) {
		  let l = 1
		
 	obj.MULT = toUnsigned(data.advancedBy(29), l)
 	} 


		
		if(31 < length) {
		  let l = 2
		
 	obj.WENE = toUnsigned(data.advancedBy(30), l)
 	} 


			return obj
	}
	
    func c_BDG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BDI(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDI();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.IndxName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BDM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDM();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(18 < length) {
		  let l = length - 18 // < 32751 ? length - 18 : 32751
		
 	
	
	obj.Triplets = triplet(data.advancedBy(18), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(17 < length) {
		  let l = 1
		
 	obj.DatFmt = toUnsigned(data.advancedBy(17), l)
 	} 


			return obj
	}
	
    func c_BDT(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDT();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(19 < length) {
		  let l = length - 19 // < 32750 ? length - 19 : 32750
		
 	
	
	obj.Triplets = triplet(data.advancedBy(19), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DocName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.Reserved = toUnsigned(data.advancedBy(17), l)
 	} 


			return obj
	}
	
    func c_BDX(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BDX();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DMXName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BFG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BFG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.FEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BFM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BFM();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.FMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BFN(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BFN();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BGR(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BGR();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.GdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BII(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BII();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.ImoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BIM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BIM();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.IdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BMM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BMM();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.MMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BMO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BMO();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.OvlyName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BNG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BNG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PGrpName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BOC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BOC();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.ObjCName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BOG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BOG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.OEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BPF(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BPF();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PFName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BPG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BPG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PageName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BPM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BPM();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BPS(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BPS();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PsegName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BPT(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BPT();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PTdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BRG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BRG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RGrpName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BRS(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BRS();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(19 < length) {
		  let l = length - 19 // < 32750 ? length - 19 : 32750
		
 	
	
	obj.Triplets = triplet(data.advancedBy(19), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_BSG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = BSG();
			
			cpgids.append(cpgid)
			cpgid = 500
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.REGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_CAT(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CAT();
			
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	obj.CATData = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_CDD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CDD();
			
			
			
			
			
				
		if(21 < length) {
		  let l = length - 21 // < 32748 ? length - 21 : 32748
		
 	
	
	obj.Triplets = triplet(data.advancedBy(21), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.XocBase = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.YocBase = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.XocUnits = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.YocUnits = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(17 < length) {
		  let l = 3
		
 	obj.XocSize = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(20 < length) {
		  let l = 3
		
 	obj.YocSize = toUnsigned(data.advancedBy(18), l)
 	} 


			return obj
	}
	
    func c_CFC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CFC();
			
			
			
			
			
				
		if(11 < length) {
		  let l = length - 11 // < 32758 ? length - 11 : 32758
		
 	
	
	obj.Triplets = triplet(data.advancedBy(11), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.CFIRGLen = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.Retired1 = toUnsigned(data.advancedBy(10), l)
 	} 


			return obj
	}
	
    func c_CFI(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CFI();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.FixedLengthRG = c_CFIRG(data.advancedBy(9), dataSize: l, rgLength: 25);
	
	

 	} 


			
			return obj
	}
	
    func c_CPC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CPC();
			
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DefCharID = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(17 < length) {
		  let l = 1
		
 	obj.PrtFlags = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(18 < length) {
		  let l = 1
		
 	obj.CPIRGLen = toUnsigned(data.advancedBy(18), l)
 	} 


		
		if(19 < length) {
		  let l = 1
		
 	obj.VSCharSN = toUnsigned(data.advancedBy(19), l)
 	} 


		
		if(20 < length) {
		  let l = 1
		
 	obj.VSChar = toUnsigned(data.advancedBy(20), l)
 	} 


		
		if(21 < length) {
		  let l = 1
		
 	obj.VSFlags = toUnsigned(data.advancedBy(21), l)
 	} 


			return obj
	}
	
    func c_CPD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CPD();
			
			
			
			
			
			
		
		if(40 < length) {
		  let l = 32
		
 	
obj.CPDesc = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(42 < length) {
		  let l = 2
		
 	obj.GCGIDLen = toUnsigned(data.advancedBy(41), l)
 	} 


		
		if(46 < length) {
		  let l = 4
		
 	obj.NumCdPts = toUnsigned(data.advancedBy(43), l)
 	} 


		
		if(48 < length) {
		  let l = 2
		
 	obj.GCSGID = toUnsigned(data.advancedBy(47), l)
 	} 


		
		if(50 < length) {
		  let l = 2
		
 	obj.CPGID = toUnsigned(data.advancedBy(49), l)
 	} 


		
		if(52 < length) {
		  let l = 2
		
 	obj.EncScheme = toUnsigned(data.advancedBy(51), l)
 	} 


			return obj
	}
	
    func c_CPI(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CPI();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_CPIRG(data.advancedBy(9), dataSize: l, rgLength: 10);
	
	

 	} 


			
			return obj
	}
	
    func c_CTC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = CTC();
			
			
			
			
			
			
		
		if(18 < length) {
		  let l = 10
		
 	obj.ConData = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_DXD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = DXD();
			
			
			
			
			
			
			return obj
	}
	
    func c_EAG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EAG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.AEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EBC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EBC();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.BCdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ECA(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ECA();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.CATName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ECF(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ECF();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ECP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ECP();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EDG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EDG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EDI(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EDI();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.IndxName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EDM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EDM();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EDT(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EDT();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DocName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EDX(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EDX();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.DMXName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EFG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EFG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.FEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EFM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EFM();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.FMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EFN(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EFN();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EGR(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EGR();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.GdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EII(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EII();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.ImoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EIM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EIM();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.IdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EMM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EMM();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.MMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EMO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EMO();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.OvlyName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ENG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ENG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PGrpName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EOC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EOC();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.ObjCName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EOG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EOG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.OEGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EPF(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EPF();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PFName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EPG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EPG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PageName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EPM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EPM();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PMName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EPS(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EPS();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PsegName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_EPT(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = EPT();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PTdoName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ERG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ERG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RGrpName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ERS(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ERS();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.RSName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_ESG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ESG();
			
			
			if cpgids.isEmpty {
			  cpgid = cpgids.removeLast()
			} else {
			  cpgid = 500
			}
			
			
			
			
			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.REGName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_FNC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNC();
			
			
			
			
			
				
		if(51 < length) {
		  let l = length - 51 // < 32718 ? length - 51 : 32718
		
 	
	
	obj.Triplets = triplet(data.advancedBy(51), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.Retired = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.PatTech = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.Reserved1 = toBytes(data.advancedBy(11), l)
 	} 


		
		if(12 < length) {
		  let l = 1
		
 	obj.FntFlags = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(13 < length) {
		  let l = 1
		
 	obj.XUnitBase = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(14 < length) {
		  let l = 1
		
 	obj.YUnitBase = toUnsigned(data.advancedBy(14), l)
 	} 


		
		if(16 < length) {
		  let l = 2
		
 	obj.XftUnits = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.YftUnits = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(20 < length) {
		  let l = 2
		
 	obj.MaxBoxWd = toUnsigned(data.advancedBy(19), l)
 	} 


		
		if(22 < length) {
		  let l = 2
		
 	obj.MaxBoxHt = toUnsigned(data.advancedBy(21), l)
 	} 


		
		if(23 < length) {
		  let l = 1
		
 	obj.FNORGLen = toUnsigned(data.advancedBy(23), l)
 	} 


		
		if(24 < length) {
		  let l = 1
		
 	obj.FNIRGLen = toUnsigned(data.advancedBy(24), l)
 	} 


		
		if(25 < length) {
		  let l = 1
		
 	obj.PatAlign = toUnsigned(data.advancedBy(25), l)
 	} 


		
		if(28 < length) {
		  let l = 3
		
 	obj.RPatDCnt = toUnsigned(data.advancedBy(26), l)
 	} 


		
		if(29 < length) {
		  let l = 1
		
 	obj.FNPRGLen = toUnsigned(data.advancedBy(29), l)
 	} 


		
		if(30 < length) {
		  let l = 1
		
 	obj.FNMRGLen = toUnsigned(data.advancedBy(30), l)
 	} 


		
		if(31 < length) {
		  let l = 1
		
 	obj.ResXUBase = toUnsigned(data.advancedBy(31), l)
 	} 


		
		if(32 < length) {
		  let l = 1
		
 	obj.ResYUBase = toUnsigned(data.advancedBy(32), l)
 	} 


		
		if(34 < length) {
		  let l = 2
		
 	obj.XfrUnits = toUnsigned(data.advancedBy(33), l)
 	} 


		
		if(36 < length) {
		  let l = 2
		
 	obj.YfrUnits = toUnsigned(data.advancedBy(35), l)
 	} 


		
		if(40 < length) {
		  let l = 4
		
 	obj.OPatDCnt = toUnsigned(data.advancedBy(37), l)
 	} 


		
		if(43 < length) {
		  let l = 3
		
 	obj.Reserved2 = toBytes(data.advancedBy(41), l)
 	} 


		
		if(44 < length) {
		  let l = 1
		
 	obj.FNNRGLen = toUnsigned(data.advancedBy(44), l)
 	} 


		
		if(48 < length) {
		  let l = 4
		
 	obj.FNNDCnt = toUnsigned(data.advancedBy(45), l)
 	} 


		
		if(50 < length) {
		  let l = 2
		
 	obj.FNNMapCnt = toUnsigned(data.advancedBy(49), l)
 	} 


			return obj
	}
	
    func c_FND(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FND();
			
			
			
			
			
				
		if(89 < length) {
		  let l = length - 89 // < 32680 ? length - 89 : 32680
		
 	
	
	obj.Triplets = triplet(data.advancedBy(89), tripletLength: l);
	

 	} 


			
		
		if(40 < length) {
		  let l = 32
		
 	
obj.TypeFcDesc = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(41 < length) {
		  let l = 1
		
 	obj.FtWtClass = toUnsigned(data.advancedBy(41), l)
 	} 


		
		if(42 < length) {
		  let l = 1
		
 	obj.FtWdClass = toUnsigned(data.advancedBy(42), l)
 	} 


		
		if(44 < length) {
		  let l = 2
		
 	obj.MaxPtSize = toUnsigned(data.advancedBy(43), l)
 	} 


		
		if(46 < length) {
		  let l = 2
		
 	obj.NomPtSize = toUnsigned(data.advancedBy(45), l)
 	} 


		
		if(48 < length) {
		  let l = 2
		
 	obj.MinPtSize = toUnsigned(data.advancedBy(47), l)
 	} 


		
		if(50 < length) {
		  let l = 2
		
 	obj.MaxHSize = toUnsigned(data.advancedBy(49), l)
 	} 


		
		if(52 < length) {
		  let l = 2
		
 	obj.NomHSize = toUnsigned(data.advancedBy(51), l)
 	} 


		
		if(54 < length) {
		  let l = 2
		
 	obj.MinHSize = toUnsigned(data.advancedBy(53), l)
 	} 


		
		if(55 < length) {
		  let l = 1
		
 	obj.DsnGenCls = toUnsigned(data.advancedBy(55), l)
 	} 


		
		if(56 < length) {
		  let l = 1
		
 	obj.DsnSubCls = toUnsigned(data.advancedBy(56), l)
 	} 


		
		if(57 < length) {
		  let l = 1
		
 	obj.DsnSpcGrp = toUnsigned(data.advancedBy(57), l)
 	} 


		
		if(72 < length) {
		  let l = 15
		
 	obj.Reserved1 = toBytes(data.advancedBy(58), l)
 	} 


		
		if(74 < length) {
		  let l = 2
		
 	obj.FtDsFlags = toUnsigned(data.advancedBy(73), l)
 	} 


		
		if(84 < length) {
		  let l = 10
		
 	obj.Reserved2 = toBytes(data.advancedBy(75), l)
 	} 


		
		if(86 < length) {
		  let l = 2
		
 	obj.GCSID = toUnsigned(data.advancedBy(85), l)
 	} 


		
		if(88 < length) {
		  let l = 2
		
 	obj.FGID = toUnsigned(data.advancedBy(87), l)
 	} 


			return obj
	}
	
    func c_FNG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNG();
			
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	obj.PatData = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_FNI(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNI();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_FNIRG(data.advancedBy(9), dataSize: l, rgLength: 28);
	
	

 	} 


			
			return obj
	}
	
    func c_FNN(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNN();
			
			
			
			
			obj.rawData = toBytes(data, length)
			
			
				
		if(11 < length) {
		  let l = length - 11 // < 32758 ? length - 11 : 32758
		
 	
	
	
	obj.rg = c_FNNRG(data.advancedBy(11), dataSize: l, rgLength: 12);
	
	

 	} 


				
		if(65537 < length) {
		  let l = length - 65537 // < 1 ? length - 65537 : 1
		
 	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.IBMFormat = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.TechnologyFormat = toUnsigned(data.advancedBy(10), l)
 	} 


			return obj
	}
	
    func c_FNM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNM();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_FNMRG(data.advancedBy(9), dataSize: l, rgLength: 8);
	
	

 	} 


			
			return obj
	}
	
    func c_FNO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNO();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_FNORG(data.advancedBy(9), dataSize: l, rgLength: 26);
	
	

 	} 


			
			return obj
	}
	
    func c_FNP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FNP();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_FNPRG(data.advancedBy(9), dataSize: l, rgLength: 22);
	
	

 	} 


			
			return obj
	}
	
    func c_GAD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = GAD();
			
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 8 ? length - 9 : 8
		
 	obj.GOCAdat = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_GDD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = GDD();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	obj.commands = goca(data.advancedBy(9), gocaLength: l);
	

 	} 


			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	obj.GOCAdes = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_ICP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = ICP();
			
			
			
			
			
			
		
		if(10 < length) {
		  let l = 2
		
 	obj.XCOset = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.YCOset = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.XCSize = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(16 < length) {
		  let l = 2
		
 	obj.YCSize = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.XFilSize = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(20 < length) {
		  let l = 2
		
 	obj.YFilSize = toUnsigned(data.advancedBy(19), l)
 	} 


			return obj
	}
	
    func c_IDD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IDD();
			
			
			
			
			
				
		if(18 < length) {
		  let l = length - 18 // < 32751 ? length - 18 : 32751
		
 	
	
	obj.SDFS = sdf(data.advancedBy(18), sdfLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.UNITBASE = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.XRESOL = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.YRESOL = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.XSIZE = toUnsigned(data.advancedBy(14), l)
 	} 


		
		if(17 < length) {
		  let l = 2
		
 	obj.YSIZE = toUnsigned(data.advancedBy(16), l)
 	} 


			return obj
	}
	
    func c_IEL(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IEL();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	obj.Triplets = triplet(data.advancedBy(9), tripletLength: l);
	

 	} 


			
			return obj
	}
	
    func c_IID(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IID();
			
			
			
			
			
			
		
		if(20 < length) {
		  let l = 12
		
 	obj.ConData1 = toBytes(data.advancedBy(9), l)
 	} 


		
		if(21 < length) {
		  let l = 1
		
 	obj.XBase = toUnsigned(data.advancedBy(21), l)
 	} 


		
		if(22 < length) {
		  let l = 1
		
 	obj.YBase = toUnsigned(data.advancedBy(22), l)
 	} 


		
		if(24 < length) {
		  let l = 2
		
 	obj.XUnits = toUnsigned(data.advancedBy(23), l)
 	} 


		
		if(26 < length) {
		  let l = 2
		
 	obj.YUnits = toUnsigned(data.advancedBy(25), l)
 	} 


		
		if(28 < length) {
		  let l = 2
		
 	obj.XSize = toUnsigned(data.advancedBy(27), l)
 	} 


		
		if(30 < length) {
		  let l = 2
		
 	obj.YSize = toUnsigned(data.advancedBy(29), l)
 	} 


		
		if(36 < length) {
		  let l = 6
		
 	obj.ConData2 = toBytes(data.advancedBy(31), l)
 	} 


		
		if(38 < length) {
		  let l = 2
		
 	obj.XCSizeD = toUnsigned(data.advancedBy(37), l)
 	} 


		
		if(40 < length) {
		  let l = 2
		
 	obj.YCSizeD = toUnsigned(data.advancedBy(39), l)
 	} 


		
		if(42 < length) {
		  let l = 2
		
 	obj.ConData3 = toBytes(data.advancedBy(41), l)
 	} 


		
		if(44 < length) {
		  let l = 2
		
 	obj.Color = toUnsigned(data.advancedBy(43), l)
 	} 


			return obj
	}
	
    func c_IMM(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IMM();
			
			
			
			
			
				
		if(17 < length) {
		  let l = length - 17 // < 32752 ? length - 17 : 32752
		
 	
	
	obj.Triplets = triplet(data.advancedBy(17), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.MMPName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


			return obj
	}
	
    func c_IOB(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IOB();
			
			
			
			
			
				
		if(36 < length) {
		  let l = length - 36 // < 32733 ? length - 36 : 32733
		
 	
	
	obj.Triplets = triplet(data.advancedBy(36), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.ObjName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(18 < length) {
		  let l = 1
		
 	obj.ObjType = toUnsigned(data.advancedBy(18), l)
 	} 


		
		if(21 < length) {
		  let l = 3
		
 	obj.XoaOset = toSigned(data.advancedBy(19), l)
 	} 


		
		if(24 < length) {
		  let l = 3
		
 	obj.YoaOset = toSigned(data.advancedBy(22), l)
 	} 


		
		if(26 < length) {
		  let l = 2
		
 	obj.XoaOrent = toUnsigned(data.advancedBy(25), l)
 	} 


		
		if(28 < length) {
		  let l = 2
		
 	obj.YoaOrent = toUnsigned(data.advancedBy(27), l)
 	} 


		
		if(31 < length) {
		  let l = 3
		
 	obj.XocaOset = toSigned(data.advancedBy(29), l)
 	} 


		
		if(34 < length) {
		  let l = 3
		
 	obj.YocaOset = toSigned(data.advancedBy(32), l)
 	} 


		
		if(35 < length) {
		  let l = 1
		
 	obj.RefCSys = toUnsigned(data.advancedBy(35), l)
 	} 


			return obj
	}
	
    func c_IOC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IOC();
			
			
			
			
			
			
		
		if(11 < length) {
		  let l = 3
		
 	obj.XoaOset = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(14 < length) {
		  let l = 3
		
 	obj.YoaOset = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(16 < length) {
		  let l = 2
		
 	obj.XoaOrent = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.YoaOrent = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(26 < length) {
		  let l = 8
		
 	obj.ConData1 = toBytes(data.advancedBy(19), l)
 	} 


		
		if(28 < length) {
		  let l = 2
		
 	obj.XMap = toUnsigned(data.advancedBy(27), l)
 	} 


		
		if(30 < length) {
		  let l = 2
		
 	obj.YMap = toUnsigned(data.advancedBy(29), l)
 	} 


		
		if(32 < length) {
		  let l = 2
		
 	obj.ConData2 = toBytes(data.advancedBy(31), l)
 	} 


			return obj
	}
	
    func c_IPD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IPD();
			
			
			
			if missingImageData > 0 {
			  let imlength = length - 9 < missingImageData ? length - 9 : missingImageData
			  obj.imageData = toBytes(data.advancedBy(9), imlength)
			  missingImageData -= imlength
			}
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	obj.sdfs = sdf(data.advancedBy(9), sdfLength: l);
	

 	} 


			
			return obj
	}
	
    func c_IPG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IPG();
			
			
			
			
			
				
		if(26 < length) {
		  let l = length - 26 // < 32743 ? length - 26 : 32743
		
 	
	
	obj.Triplets = triplet(data.advancedBy(26), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PgName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(25 < length) {
		  let l = 1
		
 	obj.IPgFlgs = toUnsigned(data.advancedBy(25), l)
 	} 


			return obj
	}
	
    func c_IPO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IPO();
			
			
			
			
			
				
		if(25 < length) {
		  let l = length - 25 // < 32744 ? length - 25 : 32744
		
 	
	
	obj.Triplets = triplet(data.advancedBy(25), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.OvlyName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(19 < length) {
		  let l = 3
		
 	obj.XolOset = toSigned(data.advancedBy(17), l)
 	} 


		
		if(22 < length) {
		  let l = 3
		
 	obj.YolOset = toSigned(data.advancedBy(20), l)
 	} 


		
		if(24 < length) {
		  let l = 2
		
 	obj.OvlyOrent = toUnsigned(data.advancedBy(23), l)
 	} 


			return obj
	}
	
    func c_IPS(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IPS();
			
			
			
			
			
				
		if(23 < length) {
		  let l = length - 23 // < 32746 ? length - 23 : 32746
		
 	
	
	obj.Triplets = triplet(data.advancedBy(23), tripletLength: l);
	

 	} 


			
		
		if(16 < length) {
		  let l = 8
		
 	
obj.PsegName = toString(data.advancedBy(9), l, 500) // ibm500


 	} 


		
		if(19 < length) {
		  let l = 3
		
 	obj.XpsOset = toSigned(data.advancedBy(17), l)
 	} 


		
		if(22 < length) {
		  let l = 3
		
 	obj.YpsOset = toSigned(data.advancedBy(20), l)
 	} 


			return obj
	}
	
    func c_IRD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = IRD();
			
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32751 ? length - 9 : 32751
		
 	obj.IMdata = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_LLE(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = LLE();
			
			
			
			
			
				
		if(11 < length) {
		  let l = length - 11 // < 32758 ? length - 11 : 32758
		
 	
	
	
		
		obj.RG = c_LLERG(data.advancedBy(11), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		LLERG(obj.getRG(), buffer, pos+11, sstop, 0, 2);
		 
	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.LnkType = toUnsigned(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_LNC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = LNC();
			
			
			
			
			
			
		
		if(10 < length) {
		  let l = 2
		
 	obj.NumDSC = toUnsigned(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_LND(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = LND();
			
			
			
			
			
				
		if(49 < length) {
		  let l = length - 49 // < 32720 ? length - 49 : 32720
		
 	
	
	obj.Triplets = triplet(data.advancedBy(49), tripletLength: l);
	

 	} 


			
		
		if(10 < length) {
		  let l = 2
		
 	obj.LNDFlgs = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.IPos = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.BPos = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(18 < length) {
		  let l = 4
		
 	obj.TxtOrent = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(19 < length) {
		  let l = 1
		
 	obj.FntLID = toUnsigned(data.advancedBy(19), l)
 	} 


		
		if(20 < length) {
		  let l = 1
		
 	obj.ChnlCde = toUnsigned(data.advancedBy(20), l)
 	} 


		
		if(22 < length) {
		  let l = 2
		
 	obj.NLNDskp = toUnsigned(data.advancedBy(21), l)
 	} 


		
		if(24 < length) {
		  let l = 2
		
 	obj.NLNDsp = toUnsigned(data.advancedBy(23), l)
 	} 


		
		if(26 < length) {
		  let l = 2
		
 	obj.NLNDreu = toUnsigned(data.advancedBy(25), l)
 	} 


		
		if(34 < length) {
		  let l = 8
		
 	
obj.SupName = toString(data.advancedBy(27), l, 500) // ibm500


 	} 


		
		if(35 < length) {
		  let l = 1
		
 	obj.SOLid = toUnsigned(data.advancedBy(35), l)
 	} 


		
		if(39 < length) {
		  let l = 4
		
 	obj.DataStrt = toUnsigned(data.advancedBy(36), l)
 	} 


		
		if(41 < length) {
		  let l = 2
		
 	obj.DataLgth = toUnsigned(data.advancedBy(40), l)
 	} 


		
		if(43 < length) {
		  let l = 2
		
 	obj.TxtColor = toUnsigned(data.advancedBy(42), l)
 	} 


		
		if(45 < length) {
		  let l = 2
		
 	obj.NLNDccp = toUnsigned(data.advancedBy(44), l)
 	} 


		
		if(46 < length) {
		  let l = 1
		
 	obj.SubpgID = toUnsigned(data.advancedBy(46), l)
 	} 


		
		if(48 < length) {
		  let l = 2
		
 	obj.CCPID = toUnsigned(data.advancedBy(47), l)
 	} 


			return obj
	}
	
    func c_MBC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MBC();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MBCRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MBCRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MCA(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MCA();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MCARG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MCARG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MCC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MCC();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_MCCRG(data.advancedBy(9), dataSize: l, rgLength: 6);
	
	

 	} 


			
			return obj
	}
	
    func c_MCD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MCD();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MCDRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MCDRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MCF(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MCF();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MCFRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MCFRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MCF1(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MCF1();
			
			
			
			
			
				
		if(13 < length) {
		  let l = length - 13 // < 32756 ? length - 13 : 32756
		
 	
	
	
		
		let rgl = toUnsigned(data.advancedBy(9), 1)
		obj.RG = c_MCF1RG(data.advancedBy(13), dataSize: l, rgLength: rgl);
		 
	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.RGLength = toUnsigned(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_MDD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MDD();
			
			
			
			
			
				
		if(22 < length) {
		  let l = length - 22 // < 32747 ? length - 22 : 32747
		
 	
	
	obj.Triplets = triplet(data.advancedBy(22), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.XmBase = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.YmBase = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.XmUnits = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.YmUnits = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(17 < length) {
		  let l = 3
		
 	obj.XmSize = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(20 < length) {
		  let l = 3
		
 	obj.YmSize = toUnsigned(data.advancedBy(18), l)
 	} 


		
		if(21 < length) {
		  let l = 1
		
 	obj.MDDFlgs = toUnsigned(data.advancedBy(21), l)
 	} 


			return obj
	}
	
    func c_MDR(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MDR();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MDRRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MDRRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MFC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MFC();
			
			
			
			
			
				
		if(13 < length) {
		  let l = length - 13 // < 32756 ? length - 13 : 32756
		
 	
	
	obj.Triplets = triplet(data.advancedBy(13), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.MFCFlgs = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.MedColl = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(12 < length) {
		  let l = 1
		
 	obj.MFCScpe = toUnsigned(data.advancedBy(12), l)
 	} 


			return obj
	}
	
    func c_MGO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MGO();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MGORG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MGORG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MIO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MIO();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MIORG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MIORG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MMC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MMC();
			
			
			
			
			
				
		if(11 < length) {
		  let l = length - 11 // < 32758 ? length - 11 : 32758
		
 	
	
	
	obj.rg = c_MMCRG(data.advancedBy(11), dataSize: l, rgLength: 2);
	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.MMCid = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.PARAMETER1 = toUnsigned(data.advancedBy(10), l)
 	} 


			return obj
	}
	
    func c_MMD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MMD();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MMDRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MMDRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MMO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MMO();
			
			
			
			
			
				
		if(13 < length) {
		  let l = length - 13 // < 32756 ? length - 13 : 32756
		
 	
	
	
	obj.rg = c_MMORG(data.advancedBy(13), dataSize: l, rgLength: 12);
	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.RGLength = toUnsigned(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_MMT(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MMT();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MMTRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MMTRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MPG(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MPG();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MPGRG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MPGRG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MPO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MPO();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_MPORG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		MPORG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_MPS(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MPS();
			
			
			
			
			
				
		if(13 < length) {
		  let l = length - 13 // < 32756 ? length - 13 : 32756
		
 	
	
	
		
		let rgl = toUnsigned(data.advancedBy(9), 1)
		obj.FixedLengthRG = c_MPSRG(data.advancedBy(13), dataSize: l, rgLength: rgl);
		 
	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.RGLength = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(12 < length) {
		  let l = 3
		
 	obj.Reserved = toBytes(data.advancedBy(10), l)
 	} 


			return obj
	}
	
    func c_MSU(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = MSU();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
	obj.rg = c_MSURG(data.advancedBy(9), dataSize: l, rgLength: 10);
	
	

 	} 


			
			return obj
	}
	
    func c_NOP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = NOP();
			
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	obj.UndfData = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_OBD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = OBD();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	obj.Triplets = triplet(data.advancedBy(9), tripletLength: l);
	

 	} 


			
			return obj
	}
	
    func c_OBP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = OBP();
			
			
			
			
			
			
		
		if(9 < length) {
		  let l = 1
		
 	obj.OAPosID = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.RGLength = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 3
		
 	obj.XoaOset = toSigned(data.advancedBy(11), l)
 	} 


		
		if(16 < length) {
		  let l = 3
		
 	obj.YoaOset = toSigned(data.advancedBy(14), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.XoaOrent = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(20 < length) {
		  let l = 2
		
 	obj.YoaOrent = toUnsigned(data.advancedBy(19), l)
 	} 


		
		if(24 < length) {
		  let l = 3
		
 	obj.XocaOset = toSigned(data.advancedBy(22), l)
 	} 


		
		if(27 < length) {
		  let l = 3
		
 	obj.YocaOset = toSigned(data.advancedBy(25), l)
 	} 


		
		if(29 < length) {
		  let l = 2
		
 	obj.XocaOrent = toUnsigned(data.advancedBy(28), l)
 	} 


		
		if(31 < length) {
		  let l = 2
		
 	obj.YocaOrent = toUnsigned(data.advancedBy(30), l)
 	} 


		
		if(32 < length) {
		  let l = 1
		
 	obj.RefCSys = toUnsigned(data.advancedBy(32), l)
 	} 


			return obj
	}
	
    func c_OCD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = OCD();
			
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	obj.ObjCdat = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_PEC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PEC();
			
			
			
			
			
				
		if(11 < length) {
		  let l = length - 11 // < 32758 ? length - 11 : 32758
		
 	
	
	obj.Triplets = triplet(data.advancedBy(11), tripletLength: l);
	

 	} 


			
			return obj
	}
	
    func c_PFC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PFC();
			
			
			
			
			
				
		if(13 < length) {
		  let l = length - 13 // < 32756 ? length - 13 : 32756
		
 	
	
	obj.Triplets = triplet(data.advancedBy(13), tripletLength: l);
	

 	} 


			
		
		if(10 < length) {
		  let l = 1
		
 	obj.PFCFlgs = toUnsigned(data.advancedBy(10), l)
 	} 


			return obj
	}
	
    func c_PGD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PGD();
			
			
			
			
			
				
		if(24 < length) {
		  let l = length - 24 // < 32745 ? length - 24 : 32745
		
 	
	
	obj.Triplets = triplet(data.advancedBy(24), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.XpgBase = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.YpgBase = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.XpgUnits = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.YpgUnits = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(17 < length) {
		  let l = 3
		
 	obj.XpgSize = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(20 < length) {
		  let l = 3
		
 	obj.YpgSize = toUnsigned(data.advancedBy(18), l)
 	} 


		
		if(23 < length) {
		  let l = 3
		
 	obj.Reserved = toUnsigned(data.advancedBy(21), l)
 	} 


			return obj
	}
	
    func c_PGP(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PGP();
			
			
			
			
			
				
		if(10 < length) {
		  let l = length - 10 // < 32759 ? length - 10 : 32759
		
 	
	
	
		
		obj.RG = c_PGPRG(data.advancedBy(10), dataSize: l, lengthOffset: 0, lengthSize: 1);
//		PGPRG(obj.getRG(), buffer, pos+10, sstop, 0, 1);
		 
	
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.Constant = toUnsigned(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_PGP1(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PGP1();
			
			
			
			
			
			
		
		if(11 < length) {
		  let l = 3
		
 	obj.XOset = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(14 < length) {
		  let l = 3
		
 	obj.YOset = toUnsigned(data.advancedBy(12), l)
 	} 


			return obj
	}
	
    func c_PMC(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PMC();
			
			
			
			
			
				
		if(11 < length) {
		  let l = length - 11 // < 32758 ? length - 11 : 32758
		
 	
	
	obj.Triplets = triplet(data.advancedBy(11), tripletLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.PMCid = toUnsigned(data.advancedBy(9), l)
 	} 


			return obj
	}
	
    func c_PPO(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PPO();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	
		
		obj.RG = c_PPORG(data.advancedBy(9), dataSize: l, lengthOffset: 0, lengthSize: 2);
//		PPORG(obj.getRG(), buffer, pos+9, sstop, 0, 2);
		 
	
	

 	} 


			
			return obj
	}
	
    func c_PTD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PTD();
			
			
			
			
			
				
		if(23 < length) {
		  let l = length - 23 // < 32746 ? length - 23 : 32746
		
 	
	
	obj.CS = cs(data.advancedBy(23), csLength: l);
	

 	} 


			
		
		if(9 < length) {
		  let l = 1
		
 	obj.XPBASE = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.YPBASE = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.XPUNITVL = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.YPUNITVL = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(17 < length) {
		  let l = 3
		
 	obj.XPEXTENT = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(20 < length) {
		  let l = 3
		
 	obj.YPEXTENT = toUnsigned(data.advancedBy(18), l)
 	} 


		
		if(22 < length) {
		  let l = 2
		
 	obj.RESERVED = toUnsigned(data.advancedBy(21), l)
 	} 


			return obj
	}
	
    func c_PTD1(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PTD1();
			
			
			
			
			
			
		
		if(9 < length) {
		  let l = 1
		
 	obj.XPBASE = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.YPBASE = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.XPUNITVL = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.YPUNITVL = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(16 < length) {
		  let l = 2
		
 	obj.XPEXTENT = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.YPEXTENT = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(20 < length) {
		  let l = 2
		
 	obj.RESERVED = toUnsigned(data.advancedBy(19), l)
 	} 


			return obj
	}
	
    func c_PTX(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = PTX();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	obj.CS = cs(data.advancedBy(9), csLength: l);
	

 	} 


			
			return obj
	}
	
    func c_TLE(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = TLE();
			
			
			
			
			
				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	
	
	obj.Triplets = triplet(data.advancedBy(9), tripletLength: l);
	

 	} 


			
			return obj
	}
	
    func c_FGD(data: UnsafePointer<UInt8>, length: Int) -> SF {
			let obj = FGD();
			
			
			
			
			
			
		
		if(12 < length) {
		  let l = 4
		
 	obj.ConData = toBytes(data.advancedBy(9), l)
 	} 


			return obj
	}
	
	
	
    func c_AttributeQualifier(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = AttributeQualifier()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.SeqNum = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.LevNum = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_AttributeValue(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = AttributeValue()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.Reserved0 = toUnsigned(data.advancedBy(2), l)
 	} 


				
		if(4 < length) {
		  let l = length - 4 // < 32765 ? length - 4 : 32765
		
 	
obj.AttVal = toString(data.advancedBy(4), l, cpgid) // charset


 	} 


		
		
		return obj
    }
	
    func c_CGCSGID(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = CGCSGID()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.GCSGID = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.CPGID = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if obj.CPGID != nil { cpgid = obj.CPGID! }
		
		
		return obj
    }
	
    func c_CRCResourceManagement(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = CRCResourceManagement()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FmtQual = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 3
		
 	obj.RMValue = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.ResClassFlg = toUnsigned(data.advancedBy(5), l)
 	} 


		
		
		return obj
    }
	
    func c_CharacterRotation(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = CharacterRotation()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.CharRot = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_ColorSpecification(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ColorSpecification()
		
		
		
		if(3 < length) {
		  let l = 1
		
 	obj.ColSpce = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.ColSize1 = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.ColSize2 = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.ColSize3 = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.ColSize4 = toUnsigned(data.advancedBy(11), l)
 	} 


				
		if(12 < length) {
		  let l = length - 12 // < 32757 ? length - 12 : 32757
		
 	obj.Color = toBytes(data.advancedBy(12), l)
 	} 


		
		
		return obj
    }
	
    func c_Comment(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = Comment()
		
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
obj.Comment = toString(data.advancedBy(2), l, cpgid) // charset


 	} 


		
		
		return obj
    }
	
    func c_DataObjectFontDescriptor(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = DataObjectFontDescriptor()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.DOFtFlgs = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.FontTech = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.VFS = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.HFS = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.CharRot = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.EncEnv = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.EncID = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.Reserved = toBytes(data.advancedBy(14), l)
 	} 


		
		
		return obj
    }
	
    func c_DescriptorPosition(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = DescriptorPosition()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.DesPosID = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_EncodingSchemeID(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = EncodingSchemeID()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.ESidCP = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.ESidUD = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_FontResolution(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FontResolution()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.MetTech = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.RPuBase = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.RPUnits = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_FullyQualifiedName(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FullyQualifiedName()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FQNType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.FQNFormat = toUnsigned(data.advancedBy(3), l)
 	} 


				
		if(4 < length) {
		  let l = length - 4 // < 32765 ? length - 4 : 32765
		
 	
obj.FQName = toString(data.advancedBy(4), l, cpgid) // charset


 	} 


		
		
				if obj.FQNType != nil && obj.FQNType! == FullyQualifiedNameFQNType.ConstDataObjectInternalResourceReference.rawValue {

					if length > 4 {
						let lid = toUnsigned(data.advancedBy(4), 1)
						obj.FQName = "\(lid)"
					}
					
				}
		
		return obj
    }
	
    func c_LocalDateAndTimeStamp(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = LocalDateAndTimeStamp()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StampType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.THunYear = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.TenYear = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(8 < length) {
		  let l = 3
		
 	obj.Day = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(10 < length) {
		  let l = 2
		
 	obj.Hour = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.Minute = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.Second = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(16 < length) {
		  let l = 2
		
 	obj.HundSec = toUnsigned(data.advancedBy(15), l)
 	} 


		
		
		return obj
    }
	
    func c_UniversalDateAndTimeStamp(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = UniversalDateAndTimeStamp()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.Reserved = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.YearAD = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.Month = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.Day = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.Hour = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.Minute = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.Second = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.TimeZone = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.UTCDiffH = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(12 < length) {
		  let l = 1
		
 	obj.UTCDiffM = toUnsigned(data.advancedBy(12), l)
 	} 


		
		
		return obj
    }
	
    func c_MappingOption(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MappingOption()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.MapValue = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_MediaEjectControl(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MediaEjectControl()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.Reserved = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.EjCtrl = toUnsigned(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_MediumMapPageNumber(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MediumMapPageNumber()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.PageNum = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_MediumOrientation(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MediumOrientation()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.MedOrient = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_MeasurementUnits(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MeasurementUnits()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.XoaBase = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.YoaBase = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.XoaUnits = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.YoaUnits = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_MODCAInterchangeSet(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MODCAInterchangeSet()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.IStype = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.ISid = toUnsigned(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectAreaSize(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectAreaSize()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.SizeType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 3
		
 	obj.XoaSize = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(8 < length) {
		  let l = 3
		
 	obj.YoaSize = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectClassification(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectClassification()
		
		
		
		if(3 < length) {
		  let l = 1
		
 	obj.ObjClass = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.StrucFlgs = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(23 < length) {
		  let l = 16
		
 	obj.RegObjId = toBytes(data.advancedBy(8), l)
 	} 


		
		if(55 < length) {
		  let l = 32
		
 	
obj.ObjTpName = toString(data.advancedBy(24), l, cpgid) // charset


 	} 


		
		if(63 < length) {
		  let l = 8
		
 	
obj.ObjLev = toString(data.advancedBy(56), l, cpgid) // charset


 	} 


		
		if(95 < length) {
		  let l = 32
		
 	
obj.CompName = toString(data.advancedBy(64), l, cpgid) // charset


 	} 


		
		
		return obj
    }
	
    func c_ObjectFunctionSetSpecification(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectFunctionSetSpecification()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ObjType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.ArchVrsn = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.DCAFnSet = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.OCAFnSet = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectOffset(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectOffset()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ObjTpe = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(7 < length) {
		  let l = 4
		
 	obj.ObjOset = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(11 < length) {
		  let l = 4
		
 	obj.ObjOstHi = toUnsigned(data.advancedBy(8), l)
 	} 


		
		
		return obj
    }
	
    func c_ResourceObjectType(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ResourceObjectType()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ObjType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 7
		
 	obj.ConData = toBytes(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_PagePositionInformation(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = PagePositionInformation()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.PGPRG = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_PresentationControl(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = PresentationControl()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.PRSFlg = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_PresentationSpaceResetMixing(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = PresentationSpaceResetMixing()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.BgMxFlag = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_PresentationSpaceMixingRules(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = PresentationSpaceMixingRules()
		
		
		
		
		return obj
    }
	
    func c_ResourceLocalIdentifier(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ResourceLocalIdentifier()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ResType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.ResLID = toUnsigned(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_ResourceSectionNumber(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ResourceSectionNumber()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ResSNum = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_TextOrientation(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TextOrientation()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.IAxis = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.BAxis = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_FontHorizontalScaleFactor(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FontHorizontalScaleFactor()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.Hscale = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_FontDescriptorSpecification(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FontDescriptorSpecification()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FtWtClass = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.FtWdClass = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.FtHeight = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.FtWidth = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.FtDsFlags = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(19 < length) {
		  let l = 1
		
 	obj.FtUsFlags = toUnsigned(data.advancedBy(19), l)
 	} 


		
		
		return obj
    }
	
    func c_TonerSaver(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TonerSaver()
		
		
		
		if(3 < length) {
		  let l = 1
		
 	obj.TSvCtrl = toUnsigned(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_ColorFidelity(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ColorFidelity()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StpCoEx = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.RepCoEx = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.ColSub = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_FontFidelity(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FontFidelity()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StpFntEx = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_TextFidelity(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TextFidelity()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StpTxtEx = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.RepTxtEx = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_MediaFidelity(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MediaFidelity()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StpMedEx = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_FinishingFidelity(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FinishingFidelity()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StpFinEx = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.RepFinEx = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_CMRFidelity(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = CMRFidelity()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.StpCMREx = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.RepCMREx = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectByteExtent(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectByteExtent()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.ByteExt = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.ByteExtHi = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectByteOffset(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectByteOffset()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.DirByOff = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.DirByHi = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectStructuredFieldExtent(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectStructuredFieldExtent()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.SFExt = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.SFExtHi = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectStructuredFieldOffset(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectStructuredFieldOffset()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.SFOff = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.SFOffHi = toUnsigned(data.advancedBy(6), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectCount(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectCount()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.SubObj = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(7 < length) {
		  let l = 4
		
 	obj.SObjNum = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(11 < length) {
		  let l = 4
		
 	obj.SobjNmHi = toUnsigned(data.advancedBy(8), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectOriginIdentifier(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectOriginIdentifier()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.System = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(10 < length) {
		  let l = 8
		
 	obj.SysID = toBytes(data.advancedBy(3), l)
 	} 


		
		if(16 < length) {
		  let l = 6
		
 	obj.MedID = toBytes(data.advancedBy(11), l)
 	} 


		
		if(60 < length) {
		  let l = 44
		
 	obj.DSID = toBytes(data.advancedBy(17), l)
 	} 


		
		
		return obj
    }
	
    func c_LineDataObjectPositionMigration(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = LineDataObjectPositionMigration()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.TempOrient = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_ColorManagementResourceDescriptor(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ColorManagementResourceDescriptor()
		
		
		
		if(3 < length) {
		  let l = 1
		
 	obj.ProcMode = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.CMRScpe = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_ImageResolution(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ImageResolution()
		
		
		
		if(4 < length) {
		  let l = 1
		
 	obj.XBase = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.YBase = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.XResol = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.YResol = toUnsigned(data.advancedBy(8), l)
 	} 


		
		
		return obj
    }
	
    func c_ObjectContainerPresentationSpaceSize(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ObjectContainerPresentationSpaceSize()
		
		
		
		if(4 < length) {
		  let l = 1
		
 	obj.PDFSize = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_ExtendedResourceLocalIdentifier(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ExtendedResourceLocalIdentifier()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ResType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(6 < length) {
		  let l = 4
		
 	obj.ResLID = toUnsigned(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_MetricAdjustment(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = MetricAdjustment()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.UnitBase = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.XUPUB = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(6 < length) {
		  let l = 2
		
 	obj.YUPUB = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(8 < length) {
		  let l = 2
		
 	obj.HUniformIncrement = toSigned(data.advancedBy(7), l)
 	} 


		
		if(10 < length) {
		  let l = 2
		
 	obj.VUniformIncrement = toSigned(data.advancedBy(9), l)
 	} 


		
		if(12 < length) {
		  let l = 2
		
 	obj.HBaselineIncrement = toSigned(data.advancedBy(11), l)
 	} 


		
		if(14 < length) {
		  let l = 2
		
 	obj.VBaselineIncrement = toSigned(data.advancedBy(13), l)
 	} 


		
		
		return obj
    }
	
    func c_ExtensionFont(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ExtensionFont()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.GCSGID = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	
    func c_RenderingIntent(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = RenderingIntent()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.Reserved = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.IOCARI = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.OCRI = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.PTOCRI = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.GOCARI = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.Reserved2 = toUnsigned(data.advancedBy(8), l)
 	} 


		
		
		return obj
    }
	
    func c_FontCodedGraphicCharacterSetGlobalIdentifier(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FontCodedGraphicCharacterSetGlobalIdentifier()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.GCSGID = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.CPGID = toUnsigned(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_LocaleSelector(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = LocaleSelector()
		
		
		
		if(3 < length) {
		  let l = 1
		
 	obj.LocFlgs = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(11 < length) {
		  let l = 8
		
 	
obj.LangCode = toString(data.advancedBy(4), l, cpgid) // charset


 	} 


		
		if(19 < length) {
		  let l = 8
		
 	
obj.ScrptCde = toString(data.advancedBy(12), l, cpgid) // charset


 	} 


		
		if(27 < length) {
		  let l = 8
		
 	
obj.RegCde = toString(data.advancedBy(20), l, cpgid) // charset


 	} 


		
		if(35 < length) {
		  let l = 8
		
 	obj.Reserved = toBytes(data.advancedBy(28), l)
 	} 


				
		if(36 < length) {
		  let l = length - 36 // < 32733 ? length - 36 : 32733
		
 	
obj.VarCde = toString(data.advancedBy(36), l, cpgid) // charset


 	} 


		
		
		return obj
    }
	
    func c_FinishingOperation(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = FinishingOperation()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FOpType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.RefEdge = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.FOpCnt = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(8 < length) {
		  let l = 2
		
 	obj.AxOffst = toUnsigned(data.advancedBy(7), l)
 	} 


				
		if(9 < length) {
		  let l = length - 9 // < 32760 ? length - 9 : 32760
		
 	obj.OpPos = toBytes(data.advancedBy(9), l)
 	} 


		
		
		return obj
    }
	
    func c_UP3iFinishingOperation(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = UP3iFinishingOperation()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.Seqnum = toUnsigned(data.advancedBy(2), l)
 	} 


				
		if(4 < length) {
		  let l = length - 4 // < 253 ? length - 4 : 253
		
 	obj.UP3iDat = toBytes(data.advancedBy(4), l)
 	} 


		
		
		return obj
    }
	
    func c_DeviceAppearance(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = DeviceAppearance()
		
		
		
		if(4 < length) {
		  let l = 2
		
 	obj.DevApp = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(6 < length) {
		  let l = 2
		
 	obj.Reserved = toBytes(data.advancedBy(5), l)
 	} 


		
		
		return obj
    }
	
    func c_ResourceObjectInclude(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ResourceObjectInclude()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ObjType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(10 < length) {
		  let l = 8
		
 	
obj.ObjName = toString(data.advancedBy(3), l, cpgid) // charset


 	} 


		
		if(13 < length) {
		  let l = 3
		
 	obj.XobjOset = toSigned(data.advancedBy(11), l)
 	} 


		
		if(16 < length) {
		  let l = 3
		
 	obj.YobjOset = toSigned(data.advancedBy(14), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.ObOrent = toUnsigned(data.advancedBy(17), l)
 	} 


		
		
		return obj
    }
	
    func c_PageOverlayConditionalProcessing(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = PageOverlayConditionalProcessing()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.PgOvType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.Level = toUnsigned(data.advancedBy(3), l)
 	} 


		
		
		return obj
    }
	
    func c_ResourceUsageAttribute(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ResourceUsageAttribute()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.Frequency = toUnsigned(data.advancedBy(2), l)
 	} 


		
		
		return obj
    }
	

	
    func c_AMB(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = AMB()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.DSPLCMNT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_AMI(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = AMI()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.DSPLCMNT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_BLN(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BLN()
		
		
		return obj
    }
	
    func c_BSU(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BSU()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LID = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_DBR(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = DBR()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.RLENGTH = toSigned(data.advancedBy(1), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.RWIDTH = toSigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.RWIDTHFRACTION = toSigned(data.advancedBy(5), l)
 	} 


		return obj
    }
	
    func c_DIR(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = DIR()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.RLENGTH = toSigned(data.advancedBy(1), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.RWIDTH = toSigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.RWIDTHFRACTION = toSigned(data.advancedBy(5), l)
 	} 


		return obj
    }
	
    func c_ESU(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ESU()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LID = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_NOPCS(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = NOPCS()
		
		
				
		if(1 < length) {
		  let l = length - 1 // < 253 ? length - 1 : 253
		
 	obj.IGNDATA = toBytes(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_OVS(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = OVS()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.BYPSIDEN = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.OVERCHAR = toUnsigned(data.advancedBy(2), l)
 	} 


		return obj
    }
	
    func c_RMB(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = RMB()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.INCRMENT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_RMI(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = RMI()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.INCRMENT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_RPS(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = RPS()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.RLENGTH = toUnsigned(data.advancedBy(1), l)
 	} 


				
		if(3 < length) {
		  let l = length - 3 // < 251 ? length - 3 : 251
		
 	
obj.RPTDATA = toString(data.advancedBy(3), l, cpgid) // charset


 	} 


		return obj
    }
	
    func c_SBI(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SBI()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.INCRMENT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_SCFL(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SCFL()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LID = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_SEC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SEC()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.RESERVED = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(2 < length) {
		  let l = 1
		
 	obj.COLSPCE = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.COLSIZE1 = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.COLSIZE2 = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.COLSIZE3 = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.COLSIZE4 = toUnsigned(data.advancedBy(10), l)
 	} 


				
		if(11 < length) {
		  let l = length - 11 // < 4 ? length - 11 : 4
		
 	obj.COLVALUE = toBytes(data.advancedBy(11), l)
 	} 


		return obj
    }
	
    func c_SIA(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SIA()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.ADJSTMNT = toSigned(data.advancedBy(1), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.DIRCTION = toUnsigned(data.advancedBy(3), l)
 	} 


		return obj
    }
	
    func c_SIM(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SIM()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.DSPLCMNT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_STC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = STC()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.FRGCOLOR = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.PRECSION = toUnsigned(data.advancedBy(3), l)
 	} 


		return obj
    }
	
    func c_STO(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = STO()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.IORNTION = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.BORNTION = toUnsigned(data.advancedBy(3), l)
 	} 


		return obj
    }
	
    func c_SVI(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SVI()
		
		
		
		if(2 < length) {
		  let l = 2
		
 	obj.INCRMENT = toSigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_TBM(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TBM()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.DIRCTION = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(2 < length) {
		  let l = 1
		
 	obj.PRECSION = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.INCRMENT = toSigned(data.advancedBy(3), l)
 	} 


		return obj
    }
	
    func c_TRN(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TRN()
		
		
				
		if(1 < length) {
		  let l = length - 1 // < 253 ? length - 1 : 253
		
 	obj.TRNDATA = toBytes(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_USC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = USC()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.BYPSIDEN = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	

	
    func c_BeginSegmentCommand(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BeginSegmentCommand()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LENGTH = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(5 < length) {
		  let l = 4
		
 	obj.NAME = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.FLAG1 = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.FLAG2 = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.SEGL = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(13 < length) {
		  let l = 4
		
 	
obj.PSNAME = toString(data.advancedBy(10), l, cpgid) // charset


 	} 


		return obj
    }
	
    func c_EndSegmentCommand(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = EndSegmentCommand()
		
		
		return obj
    }
	
    func c_GBAR(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GBAR()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.FLAGS = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GBIMG(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GBIMG()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.FORMAT = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.RES = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.WIDTH = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.HEIGHT = toUnsigned(data.advancedBy(10), l)
 	} 


		return obj
    }
	
    func c_GCBIMG(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCBIMG()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FORMAT = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.RES = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.WIDTH = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.HEIGHT = toUnsigned(data.advancedBy(6), l)
 	} 


		return obj
    }
	
    func c_GBOX(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GBOX()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.RES = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.XPOS0 = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.YPOS0 = toSigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.XPOS1 = toSigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.YPOS1 = toSigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.HAXIS = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.VAXIS = toUnsigned(data.advancedBy(14), l)
 	} 


		return obj
    }
	
    func c_GCBOX(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCBOX()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.RES = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.XPOS1 = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.YPOS1 = toSigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.HAXIS = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.VAXIS = toUnsigned(data.advancedBy(10), l)
 	} 


		return obj
    }
	
    func c_GCHST(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCHST()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


				
		if(6 < length) {
		  let l = length - 6 // < 32762 ? length - 6 : 32762
		
 	
obj.CP = toString(data.advancedBy(6), l, cpgid) // charset


 	} 


		return obj
    }
	
    func c_GCCHST(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCCHST()
		
		
				
		if(2 < length) {
		  let l = length - 2 // < 32766 ? length - 2 : 32766
		
 	
obj.CP = toString(data.advancedBy(2), l, cpgid) // charset


 	} 


		return obj
    }
	
    func c_GCOMT(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCOMT()
		
		
				
		if(2 < length) {
		  let l = length - 2 // < 32766 ? length - 2 : 32766
		
 	obj.DATA = toBytes(data.advancedBy(2), l)
 	} 


		return obj
    }
	
    func c_GEAR(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GEAR()
		
		
				
		if(2 < length) {
		  let l = length - 2 // < 32766 ? length - 2 : 32766
		
 	obj.DATA = toBytes(data.advancedBy(2), l)
 	} 


		return obj
    }
	
    func c_GEIMG(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GEIMG()
		
		
				
		if(2 < length) {
		  let l = length - 2 // < 32766 ? length - 2 : 32766
		
 	obj.DATA = toBytes(data.advancedBy(2), l)
 	} 


		return obj
    }
	
    func c_GEPROL(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GEPROL()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.RES = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GFLT(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GFLT()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GFLTRG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GCFLT(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCFLT()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GCFLTRG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GFARC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GFARC()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.MH = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.MFR = toUnsigned(data.advancedBy(7), l)
 	} 


		return obj
    }
	
    func c_GCFARC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCFARC()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.MH = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.MFR = toUnsigned(data.advancedBy(3), l)
 	} 


		return obj
    }
	
    func c_GIMD(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GIMD()
		
		
				
		if(2 < length) {
		  let l = length - 2 // < 3767 ? length - 2 : 3767
		
 	obj.DATA = toBytes(data.advancedBy(2), l)
 	} 


		return obj
    }
	
    func c_GLINE(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GLINE()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GLINERG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GCLINE(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCLINE()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GCLINERG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GMRK(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GMRK()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GMRKRG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GCMRK(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCMRK()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GCMRKRG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GNOP1(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GNOP1()
		
		
		return obj
    }
	
    func c_GPARC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GPARC()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.XCENT = toSigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.YCENT = toSigned(data.advancedBy(8), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.MH = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.MFR = toUnsigned(data.advancedBy(11), l)
 	} 


		
		if(15 < length) {
		  let l = 4
		
 	obj.START = toSigned(data.advancedBy(12), l)
 	} 


		
		if(19 < length) {
		  let l = 4
		
 	obj.SWEEP = toSigned(data.advancedBy(16), l)
 	} 


		return obj
    }
	
    func c_GCPARC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCPARC()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XCENT = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YCENT = toSigned(data.advancedBy(4), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.MH = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.MFR = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(11 < length) {
		  let l = 4
		
 	obj.START = toSigned(data.advancedBy(8), l)
 	} 


		
		if(15 < length) {
		  let l = 4
		
 	obj.SWEEP = toSigned(data.advancedBy(12), l)
 	} 


		return obj
    }
	
    func c_GRLINE(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GRLINE()
		
				
		if(6 < length) {
		  let l = length - 6 // < 32763 ? length - 6 : 32763
		
 	
	
	
	obj.rg = c_GRLINERG(data.advancedBy(6), dataSize: l, rgLength: 2);
	
	

 	} 


		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


		return obj
    }
	
    func c_GCRLINE(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCRLINE()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GCRLINERG(data.advancedBy(2), dataSize: l, rgLength: 2);
	
	

 	} 


		
		return obj
    }
	
    func c_GSGCH(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSGCH()
		
		
		return obj
    }
	
    func c_GSAP(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSAP()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.P = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.Q = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.R = toSigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.S = toSigned(data.advancedBy(8), l)
 	} 


		return obj
    }
	
    func c_GSBMX(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSBMX()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.MODE = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSCA(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCA()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


		return obj
    }
	
    func c_GSCC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCC()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.CELLWI = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.CELLHI = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.CELLWFR = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.CELLHFR = toUnsigned(data.advancedBy(8), l)
 	} 


		return obj
    }
	
    func c_GSCD(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCD()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.DIRECTION = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSCR(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCR()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.PREC = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSCS(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCS()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LCID = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSCH(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCH()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.HX = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.HY = toSigned(data.advancedBy(4), l)
 	} 


		return obj
    }
	
    func c_GSCOL(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCOL()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.COL = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSCP(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSCP()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(4), l)
 	} 


		return obj
    }
	
    func c_GSECOL(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSECOL()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.COLOR = toUnsigned(data.advancedBy(2), l)
 	} 


		return obj
    }
	
    func c_GSFLW(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSFLW()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.MH = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.MFR = toUnsigned(data.advancedBy(3), l)
 	} 


		return obj
    }
	
    func c_GSLT(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSLT()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LINETYPE = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSLW(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSLW()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.MH = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSMC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSMC()
		
		
		
		if(3 < length) {
		  let l = 2
		
 	obj.CELLWI = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.CELLHI = toSigned(data.advancedBy(4), l)
 	} 


		return obj
    }
	
    func c_GSMP(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSMP()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.PREC = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSMS(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSMS()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LCID = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSMT(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSMT()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.MCPT = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSMX(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSMX()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.MODE = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSPS(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSPS()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LCID = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSPT(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSPT()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.PATT = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSPCOL(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSPCOL()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.RES1 = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.COLSPCE = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(7 < length) {
		  let l = 4
		
 	obj.RES2 = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.COLSIZE1 = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.COLSIZE2 = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.COLSIZE3 = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.COLSIZE4 = toUnsigned(data.advancedBy(11), l)
 	} 


				
		if(12 < length) {
		  let l = length - 12 // < 32757 ? length - 12 : 32757
		
 	obj.COLVALUE = toBytes(data.advancedBy(12), l)
 	} 


		return obj
    }
	
    func c_GSLE(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSLE()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LINEEND = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GSLJ(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GSLJ()
		
		
		
		if(1 < length) {
		  let l = 1
		
 	obj.LINEJOIN = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj
    }
	
    func c_GCBEZ(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCBEZ()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GCBEZRG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_GCCBEZ(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = GCCBEZ()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_GCCBEZRG(data.advancedBy(2), dataSize: l, rgLength: 4);
	
	

 	} 


		
		return obj
    }
	
    func c_WindowSpecification(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = WindowSpecification()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FLAGS = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.RES3 = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.CFORMAT = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.UBASE = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.XRESOL = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.YRESOL = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.IMGXYRES = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.XLWIND = toSigned(data.advancedBy(12), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.XRWIND = toSigned(data.advancedBy(14), l)
 	} 


		
		if(17 < length) {
		  let l = 2
		
 	obj.YBWIND = toSigned(data.advancedBy(16), l)
 	} 


		
		if(19 < length) {
		  let l = 2
		
 	obj.YTWIND = toSigned(data.advancedBy(18), l)
 	} 


		return obj
    }
	
    func c_DrawingOrderSubset(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = DrawingOrderSubset()
		
		
		return obj
    }
	

	
    func c_BeginSegment(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BeginSegment()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.SEGNAME = toUnsigned(data.advancedBy(2), l)
 	} 


		
		return obj
    }
	
    func c_EndSegment(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = EndSegment()
		
		
		
		return obj
    }
	
    func c_BeginTile(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BeginTile()
		
		
		
		return obj
    }
	
    func c_EndTile(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = EndTile()
		
		
		
		return obj
    }
	
    func c_BeginTransparencyMask(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BeginTransparencyMask()
		
		
		
		return obj
    }
	
    func c_EndTransparencyMask(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = EndTransparencyMask()
		
		
		
		return obj
    }
	
    func c_BeginImage(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BeginImage()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.OBJTYPE = toUnsigned(data.advancedBy(2), l)
 	} 


		
		return obj
    }
	
    func c_EndImage(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = EndImage()
		
		
		
		return obj
    }
	
    func c_ImageSize(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ImageSize()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.UNITBASE = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(4 < length) {
		  let l = 2
		
 	obj.HRESOL = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(6 < length) {
		  let l = 2
		
 	obj.VRESOL = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(8 < length) {
		  let l = 2
		
 	obj.HSIZE = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(10 < length) {
		  let l = 2
		
 	obj.VSIZE = toUnsigned(data.advancedBy(9), l)
 	} 


		
		return obj
    }
	
    func c_ImageEncoding(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ImageEncoding()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.COMPRID = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.RECID = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(4 < length) {
		  let l = 1
		
 	obj.BITORDR = toUnsigned(data.advancedBy(4), l)
 	} 


		
		return obj
    }
	
    func c_IDESize(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = IDESize()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.IDESZ = toUnsigned(data.advancedBy(2), l)
 	} 


		
		return obj
    }
	
    func c_ImageLUTID(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ImageLUTID()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.LUTID = toUnsigned(data.advancedBy(2), l)
 	} 


		
		return obj
    }
	
    func c_BandImage(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BandImage()
		
				
		if(3 < length) {
		  let l = length - 3 // < 32766 ? length - 3 : 32766
		
 	
	
	
	obj.rg = c_BandImageRG(data.advancedBy(3), dataSize: l, rgLength: 1);
	
	

 	} 


		
		
		if(2 < length) {
		  let l = 1
		
 	obj.BCOUNT = toUnsigned(data.advancedBy(2), l)
 	} 


		
		return obj
    }
	
    func c_IDEStructure(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = IDEStructure()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.FLAGS = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.FORMAT = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.SIZE1 = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.SIZE2 = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.SIZE3 = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.SIZE4 = toUnsigned(data.advancedBy(10), l)
 	} 


		
		return obj
    }
	
    func c_ExternalAlgorithm(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ExternalAlgorithm()
		
				
		if(4 < length) {
		  let l = length - 4 // < 32765 ? length - 4 : 32765
		
 	
	
	
	obj.rg = c_ExternalAlgorithmRG(data.advancedBy(4), dataSize: l, rgLength: 3);
	
	

 	} 


		
		
		if(2 < length) {
		  let l = 1
		
 	obj.ALGTYPE = toUnsigned(data.advancedBy(2), l)
 	} 


		
		return obj
    }
	
    func c_TilePosition(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TilePosition()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.XOFFSET = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.YOFFSET = toUnsigned(data.advancedBy(6), l)
 	} 


		
		return obj
    }
	
    func c_TileSize(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TileSize()
		
		
		
		if(5 < length) {
		  let l = 4
		
 	obj.THSIZE = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(9 < length) {
		  let l = 4
		
 	obj.TVSIZE = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.RELRES = toUnsigned(data.advancedBy(10), l)
 	} 


		
		return obj
    }
	
    func c_TileSetColor(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TileSetColor()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.CSPACE = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 3
		
 	obj.RESERVED = toUnsigned(data.advancedBy(3), l)
 	} 


		
		if(6 < length) {
		  let l = 1
		
 	obj.SIZE1 = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(7 < length) {
		  let l = 1
		
 	obj.SIZE2 = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.SIZE3 = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.SIZE4 = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.CVAL1 = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.CVAL2 = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.CVAL3 = toUnsigned(data.advancedBy(14), l)
 	} 


		
		if(17 < length) {
		  let l = 2
		
 	obj.CVAL4 = toUnsigned(data.advancedBy(16), l)
 	} 


		
		return obj
    }
	
    func c_SetBiLevelImageColor(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SetBiLevelImageColor()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.AREA = toUnsigned(data.advancedBy(2), l)
 	} 


				
		if(3 < length) {
		  let l = length - 3 // < 1 ? length - 3 : 1
		
 	obj.Reserved = toBytes(data.advancedBy(3), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.NAMECOLR = toUnsigned(data.advancedBy(4), l)
 	} 


		
		return obj
    }
	
    func c_IOCAFunctionSetIdentification(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = IOCAFunctionSetIdentification()
		
		
		
		if(2 < length) {
		  let l = 1
		
 	obj.CATEGORY = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(3 < length) {
		  let l = 1
		
 	obj.FCNSET = toUnsigned(data.advancedBy(3), l)
 	} 


		
		return obj
    }
	
    func c_ImageData(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ImageData()
		
		
				
		if(4 < length) {
		  let l = length - 4 // < 32765 ? length - 4 : 32765
		
 	obj.DATA = toBytes(data.advancedBy(4), l)
 	} 


		
//				int dataLength = stop + 1 - (pos + 4);
//				missingImageData = length - lengthAddition - dataLength;
		
		return obj
    }
	
    func c_BandImageData(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = BandImageData()
		
		
		
		if(4 < length) {
		  let l = 1
		
 	obj.BANDNUM = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(6 < length) {
		  let l = 2
		
 	obj.RESERVED = toUnsigned(data.advancedBy(5), l)
 	} 


				
		if(7 < length) {
		  let l = length - 7 // < 32762 ? length - 7 : 32762
		
 	obj.DATA = toBytes(data.advancedBy(7), l)
 	} 


		
		return obj
    }
	
    func c_IncludeTile(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = IncludeTile()
		
		
		
		if(7 < length) {
		  let l = 4
		
 	obj.TIRID = toUnsigned(data.advancedBy(4), l)
 	} 


		
		return obj
    }
	
    func c_ImageSubsampling(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = ImageSubsampling()
		
				
		if(4 < length) {
		  let l = length - 4 // < 32765 ? length - 4 : 32765
		
 	
	
	obj.sdfs = sdf(data.advancedBy(4), sdfLength: l);
	

 	} 


		
		
		return obj
    }
	
    func c_SamplingRatios(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = SamplingRatios()
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	
	obj.rg = c_SamplingRatiosRG(data.advancedBy(2), dataSize: l, rgLength: 2);
	
	

 	} 


		
		
		return obj
    }
	
    func c_TileTOC(data: UnsafePointer<UInt8>, length: Int) -> Triplet {
		let obj = TileTOC()
		
				
		if(6 < length) {
		  let l = length - 6 // < 32763 ? length - 6 : 32763
		
 	
	
	
	obj.rg = c_TileTOCRG(data.advancedBy(6), dataSize: l, rgLength: 26);
	
	

 	} 


		
		
		if(5 < length) {
		  let l = 2
		
 	obj.Reserved = toUnsigned(data.advancedBy(4), l)
 	} 


		
		return obj
    }
	

	




























































































































































	func c_CFIRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [CFIRG] {
		if rgLength == 0 { return [] }

		var result: [CFIRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_CFIRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






















	func c_CPIRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [CPIRG] {
		if rgLength == 0 { return [] }

		var result: [CPIRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_CPIRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 


































































































































































	func c_FNIRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [FNIRG] {
		if rgLength == 0 { return [] }

		var result: [FNIRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_FNIRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 








	func c_FNNRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [FNNRG] {
		if rgLength == 0 { return [] }

		var result: [FNNRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_FNNRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 







	func c_FNMRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [FNMRG] {
		if rgLength == 0 { return [] }

		var result: [FNMRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_FNMRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_FNORG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [FNORG] {
		if rgLength == 0 { return [] }

		var result: [FNORG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_FNORG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_FNPRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [FNPRG] {
		if rgLength == 0 { return [] }

		var result: [FNPRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_FNPRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 
































































































 
	func c_LLERG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [LLERG] {
		var result: [LLERG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_LLERG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 




























 
	func c_MBCRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MBCRG] {
		var result: [MBCRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MBCRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 





 
	func c_MCARG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MCARG] {
		var result: [MCARG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MCARG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 






	func c_MCCRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [MCCRG] {
		if rgLength == 0 { return [] }

		var result: [MCCRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_MCCRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 





 
	func c_MCDRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MCDRG] {
		var result: [MCDRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MCDRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 





 
	func c_MCFRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MCFRG] {
		var result: [MCFRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MCFRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 







	func c_MCF1RG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [MCF1RG] {
		if rgLength == 0 { return [] }

		var result: [MCF1RG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_MCF1RG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 















 
	func c_MDRRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MDRRG] {
		var result: [MDRRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MDRRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 











 
	func c_MGORG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MGORG] {
		var result: [MGORG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MGORG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 





 
	func c_MIORG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MIORG] {
		var result: [MIORG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MIORG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 








	func c_MMCRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [MMCRG] {
		if rgLength == 0 { return [] }

		var result: [MMCRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_MMCRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 





 
	func c_MMDRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MMDRG] {
		var result: [MMDRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MMDRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 







	func c_MMORG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [MMORG] {
		if rgLength == 0 { return [] }

		var result: [MMORG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_MMORG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 





 
	func c_MMTRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MMTRG] {
		var result: [MMTRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MMTRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 





 
	func c_MPGRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MPGRG] {
		var result: [MPGRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MPGRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 





 
	func c_MPORG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [MPORG] {
		var result: [MPORG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_MPORG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 








	func c_MPSRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [MPSRG] {
		if rgLength == 0 { return [] }

		var result: [MPSRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_MPSRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_MSURG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [MSURG] {
		if rgLength == 0 { return [] }

		var result: [MSURG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_MSURG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 













































 
	func c_PGPRG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [PGPRG] {
		var result: [PGPRG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_PGPRG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 













 
	func c_PPORG(rgData: UnsafePointer<UInt8>, dataSize: Int, lengthOffset: Int, lengthSize: Int) -> [PPORG] {
		var result: [PPORG] = []
		var data = rgData
		var available = dataSize

		while available >= lengthSize + lengthOffset {
			let length = toUnsigned(data.advancedBy(lengthOffset), lengthSize)
			if length == 0 || length > available { break }
			result.append(_PPORG(data, length: length))
			available -= length
			data = data.advancedBy(length)
		}
		return result 
	} 
































	
































































































































































































































































































	func c_BandImageRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [BandImageRG] {
		if rgLength == 0 { return [] }

		var result: [BandImageRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_BandImageRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 















	func c_ExternalAlgorithmRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [ExternalAlgorithmRG] {
		if rgLength == 0 { return [] }

		var result: [ExternalAlgorithmRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_ExternalAlgorithmRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 


















































	func c_SamplingRatiosRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [SamplingRatiosRG] {
		if rgLength == 0 { return [] }

		var result: [SamplingRatiosRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_SamplingRatiosRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 







	func c_TileTOCRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [TileTOCRG] {
		if rgLength == 0 { return [] }

		var result: [TileTOCRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_TileTOCRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 



























































































































































































































































	func c_GFLTRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GFLTRG] {
		if rgLength == 0 { return [] }

		var result: [GFLTRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GFLTRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_GCFLTRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GCFLTRG] {
		if rgLength == 0 { return [] }

		var result: [GCFLTRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GCFLTRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 



















	func c_GLINERG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GLINERG] {
		if rgLength == 0 { return [] }

		var result: [GLINERG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GLINERG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_GCLINERG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GCLINERG] {
		if rgLength == 0 { return [] }

		var result: [GCLINERG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GCLINERG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_GMRKRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GMRKRG] {
		if rgLength == 0 { return [] }

		var result: [GMRKRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GMRKRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_GCMRKRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GCMRKRG] {
		if rgLength == 0 { return [] }

		var result: [GCMRKRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GCMRKRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 




























	func c_GRLINERG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GRLINERG] {
		if rgLength == 0 { return [] }

		var result: [GRLINERG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GRLINERG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_GCRLINERG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GCRLINERG] {
		if rgLength == 0 { return [] }

		var result: [GCRLINERG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GCRLINERG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 


































































































	func c_GCBEZRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GCBEZRG] {
		if rgLength == 0 { return [] }

		var result: [GCBEZRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GCBEZRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 






	func c_GCCBEZRG(rgData: UnsafePointer<UInt8>, dataSize: Int, rgLength: Int) -> [GCCBEZRG] {
		if rgLength == 0 { return [] }

		var result: [GCCBEZRG] = []
		var data = rgData
		var available = dataSize
		let length = rgLength
		
		while available >= rgLength {
			result.append(_GCCBEZRG(data, length: length))
			available -= rgLength
			data = data.advancedBy(rgLength)
		}
		return result 
	} 







































































































































































































	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	func _CPIRG(data: UnsafePointer<UInt8>, length: Int) -> CPIRG {
		let obj = CPIRG();
		
		
		
		if(7 < length) {
		  let l = 8
		
 	
obj.GCGID = toString(data.advancedBy(0), l, cpgid) // charset


 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.PrtFlags = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.CodePoint = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.Count = toUnsigned(data.advancedBy(10), l)
 	} 


		return obj;
	}
	
	
	
	func _CFIRG(data: UnsafePointer<UInt8>, length: Int) -> CFIRG {
		let obj = CFIRG();
		
		
		
		if(7 < length) {
		  let l = 8
		
 	
obj.FCSName = toString(data.advancedBy(0), l, cpgid) // charset


 	} 


		
		if(15 < length) {
		  let l = 8
		
 	
obj.CPName = toString(data.advancedBy(8), l, cpgid) // charset


 	} 


		
		if(17 < length) {
		  let l = 2
		
 	obj.SVSize = toUnsigned(data.advancedBy(16), l)
 	} 


		
		if(19 < length) {
		  let l = 2
		
 	obj.SHScale = toUnsigned(data.advancedBy(18), l)
 	} 


				
		if(20 < length) {
		  let l = length - 20 // < 4 ? length - 20 : 4
		
 	obj.Reserved = toBytes(data.advancedBy(20), l)
 	} 


		
		if(24 < length) {
		  let l = 1
		
 	obj.Section = toUnsigned(data.advancedBy(24), l)
 	} 


		return obj;
	}
	
	
	
	func _FNIRG(data: UnsafePointer<UInt8>, length: Int) -> FNIRG {
		let obj = FNIRG();
		
		
		
		if(7 < length) {
		  let l = 8
		
 	
obj.GCGID = toString(data.advancedBy(0), l, cpgid) // charset


 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.CharInc = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.AscendHt = toSigned(data.advancedBy(10), l)
 	} 


		
		if(13 < length) {
		  let l = 2
		
 	obj.DescendDp = toSigned(data.advancedBy(12), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.Reserved = toUnsigned(data.advancedBy(14), l)
 	} 


		
		if(17 < length) {
		  let l = 2
		
 	obj.FNMCnt = toUnsigned(data.advancedBy(16), l)
 	} 


		
		if(19 < length) {
		  let l = 2
		
 	obj.ASpace = toSigned(data.advancedBy(18), l)
 	} 


		
		if(21 < length) {
		  let l = 2
		
 	obj.BSpace = toUnsigned(data.advancedBy(20), l)
 	} 


		
		if(23 < length) {
		  let l = 2
		
 	obj.CSpace = toSigned(data.advancedBy(22), l)
 	} 


		
		if(25 < length) {
		  let l = 2
		
 	obj.Reserved2 = toUnsigned(data.advancedBy(24), l)
 	} 


		
		if(27 < length) {
		  let l = 2
		
 	obj.BaseOset = toSigned(data.advancedBy(26), l)
 	} 


		return obj;
	}
	
	
	
	func _FNMRG(data: UnsafePointer<UInt8>, length: Int) -> FNMRG {
		let obj = FNMRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.CharBoxWd = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.CharBoxHt = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(7 < length) {
		  let l = 4
		
 	obj.PatDOset = toUnsigned(data.advancedBy(4), l)
 	} 


		return obj;
	}
	
	
	
	func _LLERG(data: UnsafePointer<UInt8>, length: Int) -> LLERG {
		let obj = LLERG();
		
				
		if(3 < length) {
		  let l = length - 3 // < 32766 ? length - 3 : 32766
		
 	
	
	obj.Triplets = triplet(data.advancedBy(3), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(2 < length) {
		  let l = 1
		
 	obj.RGFunct = toUnsigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _MPSRG(data: UnsafePointer<UInt8>, length: Int) -> MPSRG {
		let obj = MPSRG();
		
		
		
		if(3 < length) {
		  let l = 4
		
 	obj.Reserved = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(11 < length) {
		  let l = 8
		
 	
obj.PsegName = toString(data.advancedBy(4), l, cpgid) // charset


 	} 


		return obj;
	}
	
	
	
	func _MCFRG(data: UnsafePointer<UInt8>, length: Int) -> MCFRG {
		let obj = MCFRG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MBCRG(data: UnsafePointer<UInt8>, length: Int) -> MBCRG {
		let obj = MBCRG();
		
		
		if(4 < length) {
		  let l = 3
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MCARG(data: UnsafePointer<UInt8>, length: Int) -> MCARG {
		let obj = MCARG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MCDRG(data: UnsafePointer<UInt8>, length: Int) -> MCDRG {
		let obj = MCDRG();
		
		
		if(4 < length) {
		  let l = 3
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MDRRG(data: UnsafePointer<UInt8>, length: Int) -> MDRRG {
		let obj = MDRRG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MGORG(data: UnsafePointer<UInt8>, length: Int) -> MGORG {
		let obj = MGORG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MIORG(data: UnsafePointer<UInt8>, length: Int) -> MIORG {
		let obj = MIORG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MMDRG(data: UnsafePointer<UInt8>, length: Int) -> MMDRG {
		let obj = MMDRG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MMTRG(data: UnsafePointer<UInt8>, length: Int) -> MMTRG {
		let obj = MMTRG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MPGRG(data: UnsafePointer<UInt8>, length: Int) -> MPGRG {
		let obj = MPGRG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MPORG(data: UnsafePointer<UInt8>, length: Int) -> MPORG {
		let obj = MPORG();
		
				
		if(2 < length) {
		  let l = length - 2 // < 32767 ? length - 2 : 32767
		
 	
	
	obj.Triplets = triplet(data.advancedBy(2), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _PPORG(data: UnsafePointer<UInt8>, length: Int) -> PPORG {
		let obj = PPORG();
		
				
		if(12 < length) {
		  let l = length - 12 // < 32757 ? length - 12 : 32757
		
 	
	
	obj.Triplets = triplet(data.advancedBy(12), tripletLength: l);
	

 	} 


		
		
		if(1 < length) {
		  let l = 2
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(2 < length) {
		  let l = 1
		
 	obj.ObjType = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.ProcFlgs = toUnsigned(data.advancedBy(5), l)
 	} 


		
		if(8 < length) {
		  let l = 3
		
 	obj.XocaOset = toSigned(data.advancedBy(6), l)
 	} 


		
		if(11 < length) {
		  let l = 3
		
 	obj.YocaOset = toSigned(data.advancedBy(9), l)
 	} 


		return obj;
	}
	
	
	
	func _PGPRG(data: UnsafePointer<UInt8>, length: Int) -> PGPRG {
		let obj = PGPRG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.RGLength = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 3
		
 	obj.XmOset = toSigned(data.advancedBy(1), l)
 	} 


		
		if(6 < length) {
		  let l = 3
		
 	obj.YmOset = toSigned(data.advancedBy(4), l)
 	} 


		
		if(8 < length) {
		  let l = 2
		
 	obj.PGorient = toUnsigned(data.advancedBy(7), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.SHside = toUnsigned(data.advancedBy(9), l)
 	} 


		
		if(10 < length) {
		  let l = 1
		
 	obj.PgFlgs = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(11 < length) {
		  let l = 1
		
 	obj.PMCid = toUnsigned(data.advancedBy(11), l)
 	} 


		return obj;
	}
	
	
	
	func _MCCRG(data: UnsafePointer<UInt8>, length: Int) -> MCCRG {
		let obj = MCCRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.Startnum = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.Stopnum = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 1
		
 	obj.MMCid = toUnsigned(data.advancedBy(5), l)
 	} 


		return obj;
	}
	
	
	
	func _MMORG(data: UnsafePointer<UInt8>, length: Int) -> MMORG {
		let obj = MMORG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.OVLid = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(1 < length) {
		  let l = 1
		
 	obj.Flags = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(11 < length) {
		  let l = 8
		
 	
obj.OVLname = toString(data.advancedBy(4), l, cpgid) // charset


 	} 


		return obj;
	}
	
	
	
	func _BandImageRG(data: UnsafePointer<UInt8>, length: Int) -> BandImageRG {
		let obj = BandImageRG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.BITCNT = toUnsigned(data.advancedBy(0), l)
 	} 


		return obj;
	}
	
	
	
	func _MCF1RG(data: UnsafePointer<UInt8>, length: Int) -> MCF1RG {
		let obj = MCF1RG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.CFLid = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(2 < length) {
		  let l = 1
		
 	obj.Sectid = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(11 < length) {
		  let l = 8
		
 	
obj.CFName = toString(data.advancedBy(4), l, cpgid) // charset


 	} 


		
		if(19 < length) {
		  let l = 8
		
 	
obj.CPName = toString(data.advancedBy(12), l, cpgid) // charset


 	} 


		
		if(27 < length) {
		  let l = 8
		
 	
obj.FCSName = toString(data.advancedBy(20), l, cpgid) // charset


 	} 


		
		if(29 < length) {
		  let l = 2
		
 	obj.CharRot = toUnsigned(data.advancedBy(28), l)
 	} 


		return obj;
	}
	
	
	
	func _MMCRG(data: UnsafePointer<UInt8>, length: Int) -> MMCRG {
		let obj = MMCRG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.key = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(1 < length) {
		  let l = 1
		
 	obj.value = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj;
	}
	
	
	
	func _FNORG(data: UnsafePointer<UInt8>, length: Int) -> FNORG {
		let obj = FNORG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.Reserved = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.CharRot = toUnsigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.MaxBOset = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.MaxCharInc = toUnsigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.SpCharInc = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(11 < length) {
		  let l = 2
		
 	obj.MaxBExt = toUnsigned(data.advancedBy(10), l)
 	} 


		
		if(12 < length) {
		  let l = 1
		
 	obj.OrntFlgs = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(13 < length) {
		  let l = 1
		
 	obj.Reserved2 = toUnsigned(data.advancedBy(13), l)
 	} 


		
		if(15 < length) {
		  let l = 2
		
 	obj.EmSpInc = toUnsigned(data.advancedBy(14), l)
 	} 


		
		if(17 < length) {
		  let l = 2
		
 	obj.Reserved3 = toUnsigned(data.advancedBy(16), l)
 	} 


		
		if(19 < length) {
		  let l = 2
		
 	obj.FigSpInc = toUnsigned(data.advancedBy(18), l)
 	} 


		
		if(21 < length) {
		  let l = 2
		
 	obj.NomCharInc = toUnsigned(data.advancedBy(20), l)
 	} 


		
		if(23 < length) {
		  let l = 2
		
 	obj.DefBInc = toUnsigned(data.advancedBy(22), l)
 	} 


		
		if(25 < length) {
		  let l = 2
		
 	obj.MinASp = toUnsigned(data.advancedBy(24), l)
 	} 


		return obj;
	}
	
	
	
	func _FNPRG(data: UnsafePointer<UInt8>, length: Int) -> FNPRG {
		let obj = FNPRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.Reserved = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.LcHeight = toSigned(data.advancedBy(2), l)
 	} 


		
		if(5 < length) {
		  let l = 2
		
 	obj.CapMHt = toSigned(data.advancedBy(4), l)
 	} 


		
		if(7 < length) {
		  let l = 2
		
 	obj.MaxAscHt = toSigned(data.advancedBy(6), l)
 	} 


		
		if(9 < length) {
		  let l = 2
		
 	obj.MaxDesDp = toSigned(data.advancedBy(8), l)
 	} 


		
		if(14 < length) {
		  let l = 5
		
 	obj.Reserved2 = toBytes(data.advancedBy(10), l)
 	} 


		
		if(15 < length) {
		  let l = 1
		
 	obj.Retired = toUnsigned(data.advancedBy(15), l)
 	} 


		
		if(16 < length) {
		  let l = 1
		
 	obj.Reserved3 = toUnsigned(data.advancedBy(16), l)
 	} 


		
		if(18 < length) {
		  let l = 2
		
 	obj.UscoreWd = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(19 < length) {
		  let l = 1
		
 	obj.UscoreWdf = toUnsigned(data.advancedBy(19), l)
 	} 


		
		if(21 < length) {
		  let l = 2
		
 	obj.UscorePos = toSigned(data.advancedBy(20), l)
 	} 


		return obj;
	}
	
	
	
	func _TileTOCRG(data: UnsafePointer<UInt8>, length: Int) -> TileTOCRG {
		let obj = TileTOCRG();
		
		
		
		if(3 < length) {
		  let l = 4
		
 	obj.XOFFSET = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(7 < length) {
		  let l = 4
		
 	obj.YOFFSET = toUnsigned(data.advancedBy(4), l)
 	} 


		
		if(11 < length) {
		  let l = 4
		
 	obj.THSIZE = toUnsigned(data.advancedBy(8), l)
 	} 


		
		if(15 < length) {
		  let l = 4
		
 	obj.TVSIZE = toUnsigned(data.advancedBy(12), l)
 	} 


		
		if(16 < length) {
		  let l = 1
		
 	obj.RELRES = toUnsigned(data.advancedBy(16), l)
 	} 


		
		if(17 < length) {
		  let l = 1
		
 	obj.COMPR = toUnsigned(data.advancedBy(17), l)
 	} 


		
		if(25 < length) {
		  let l = 8
		
 	obj.DATAPOS = toUnsigned(data.advancedBy(18), l)
 	} 


		return obj;
	}
	
	
	
	func _SamplingRatiosRG(data: UnsafePointer<UInt8>, length: Int) -> SamplingRatiosRG {
		let obj = SamplingRatiosRG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.HSAMPLE = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(1 < length) {
		  let l = 1
		
 	obj.VSAMPLE = toUnsigned(data.advancedBy(1), l)
 	} 


		return obj;
	}
	
	
	
	func _ExternalAlgorithmRG(data: UnsafePointer<UInt8>, length: Int) -> ExternalAlgorithmRG {
		let obj = ExternalAlgorithmRG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.DIRCTN = toUnsigned(data.advancedBy(0), l)
 	} 


		
		if(1 < length) {
		  let l = 1
		
 	obj.PADBDRY = toUnsigned(data.advancedBy(1), l)
 	} 


		
		if(2 < length) {
		  let l = 1
		
 	obj.PADALMT = toUnsigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _FNNRG(data: UnsafePointer<UInt8>, length: Int) -> FNNRG {
		let obj = FNNRG();
		
		
		
		if(7 < length) {
		  let l = 8
		
 	
obj.GCGID = toString(data.advancedBy(0), l, cpgid) // charset


 	} 


		
		if(11 < length) {
		  let l = 4
		
 	obj.TSOffset = toUnsigned(data.advancedBy(8), l)
 	} 


		return obj;
	}
	
	
	
	func _FNNRG2(data: UnsafePointer<UInt8>, length: Int) -> FNNRG2 {
		let obj = FNNRG2();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.TSIDLen = toUnsigned(data.advancedBy(0), l)
 	} 


				
		if(1 < length) {
		  let l = length - 1 // < 32768 ? length - 1 : 32768
		
 	obj.TSID = toBytes(data.advancedBy(1), l)
 	} 


		return obj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	func _GCBEZRG(data: UnsafePointer<UInt8>, length: Int) -> GCBEZRG {
		let obj = GCBEZRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GCCBEZRG(data: UnsafePointer<UInt8>, length: Int) -> GCCBEZRG {
		let obj = GCCBEZRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GFLTRG(data: UnsafePointer<UInt8>, length: Int) -> GFLTRG {
		let obj = GFLTRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GCFLTRG(data: UnsafePointer<UInt8>, length: Int) -> GCFLTRG {
		let obj = GCFLTRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GLINERG(data: UnsafePointer<UInt8>, length: Int) -> GLINERG {
		let obj = GLINERG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GCLINERG(data: UnsafePointer<UInt8>, length: Int) -> GCLINERG {
		let obj = GCLINERG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GMRKRG(data: UnsafePointer<UInt8>, length: Int) -> GMRKRG {
		let obj = GMRKRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GCMRKRG(data: UnsafePointer<UInt8>, length: Int) -> GCMRKRG {
		let obj = GCMRKRG();
		
		
		
		if(1 < length) {
		  let l = 2
		
 	obj.XPOS = toSigned(data.advancedBy(0), l)
 	} 


		
		if(3 < length) {
		  let l = 2
		
 	obj.YPOS = toSigned(data.advancedBy(2), l)
 	} 


		return obj;
	}
	
	
	
	func _GRLINERG(data: UnsafePointer<UInt8>, length: Int) -> GRLINERG {
		let obj = GRLINERG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.XOSSF = toSigned(data.advancedBy(0), l)
 	} 


		
		if(1 < length) {
		  let l = 1
		
 	obj.YOFFS = toSigned(data.advancedBy(1), l)
 	} 


		return obj;
	}
	
	
	
	func _GCRLINERG(data: UnsafePointer<UInt8>, length: Int) -> GCRLINERG {
		let obj = GCRLINERG();
		
		
		
		if(0 < length) {
		  let l = 1
		
 	obj.XOSSF = toSigned(data.advancedBy(0), l)
 	} 


		
		if(1 < length) {
		  let l = 1
		
 	obj.YOFFS = toSigned(data.advancedBy(1), l)
 	} 


		return obj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	func _MSURG(data: UnsafePointer<UInt8>, length: Int) -> MSURG {
		let obj = MSURG();
		
		
		
		if(7 < length) {
		  let l = 8
		
 	
obj.SUPname = toString(data.advancedBy(0), l, cpgid) // charset


 	} 


		
		if(8 < length) {
		  let l = 1
		
 	obj.Reserved = toBytes(data.advancedBy(8), l)
 	} 


		
		if(9 < length) {
		  let l = 1
		
 	obj.SUPid = toUnsigned(data.advancedBy(9), l)
 	} 


		return obj;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
