package org.afplib.helper.formdef;

import java.util.HashMap;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BMM;
import org.afplib.afplib.ExtendedResourceLocalIdentifier;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.FullyQualifiedNameFQNFormat;
import org.afplib.afplib.MFC;
import org.afplib.afplib.MMC;
import org.afplib.afplib.MMCRG;
import org.afplib.afplib.MMCRGkey;
import org.afplib.afplib.MMT;
import org.afplib.afplib.MMTRG;
import org.afplib.base.SF;
import org.afplib.base.Triplet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MediumMap {

	private static final Logger log = LoggerFactory.getLogger(MediumMap.class);

	private String mmname;
	private Plex plex;
	private Integer bin; // maybe null
	private String mediaName; // maybe null
	private SF[] sfs;
	
	private boolean isHashCodeSet;
	private int hashCode;

	private MFC mfc;
	
	public MediumMap(SF[] mediumMap) {
		this.sfs = mediumMap;
		
		if(!(mediumMap[0] instanceof BMM)) {
			log.error("INTERNAL ERROR: creating medium map but no leading BMM");
			System.exit(1);
		}
		
		BMM bmm = (BMM) mediumMap[0];
		mmname = bmm.getMMName();
		
		HashMap<Integer, String> lid2MediumName = new HashMap<Integer, String>();
		
		for(SF sf : mediumMap) {
			switch(sf.eClass().getClassifierID()) {
			case AfplibPackage.MMT:
				mapMediumType(lid2MediumName, (MMT) sf);
				break;
			case AfplibPackage.MFC:
				mfc = (MFC) sf;
				break;
			case AfplibPackage.MMC:
				int mediaHigh = 0;
				for(MMCRG rg : ((MMC)sf).getRg()) {
					switch(MMCRGkey.get(rg.getKey())) {
					case CONST_DUPLEXCONTROL:
						if(rg.getValue() == 1) plex = Plex.SIMPLEX;
						else plex = Plex.DUPLEX;
						break;
					case CONST_MEDIASOURCESELECTOR:
						bin = rg.getValue();
						break;
					case CONST_MEDIATYPELOCAL_IDHIGHORDERBYTE:
						mediaHigh = rg.getValue();
						break;
					case CONST_MEDIATYPELOCAL_IDLOWORDERBYTE : {
						int mediaId = mediaHigh << 8 | rg.getValue();
						mediaName = lid2MediumName.get(mediaId);
						log.debug("mediaName: {}", mediaName);
						break;
					}
					default:
						break;
					}
				}
				break;
			}
		}
		
	}

	private void mapMediumType(HashMap<Integer, String> lid2MediumName, MMT mmt) {
		for(MMTRG rg : mmt.getRG()) {
			Integer lid = null;
			String name = null;
			for(Triplet t : rg.getTriplets()) {
				switch(t.eClass().getClassifierID()) {
				case AfplibPackage.FULLY_QUALIFIED_NAME:
					FullyQualifiedName fqn = (FullyQualifiedName)t;
					if(fqn.getFQNFormat() == FullyQualifiedNameFQNFormat.CONST_CHARACTERSTRING_VALUE)
						name = fqn.getFQName();
					break;
				case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER:
					lid = ((ExtendedResourceLocalIdentifier)t).getResLID();
					break;
				}
			}
			if(lid != null && name != null) {
				log.debug("mapping media {} to lid {}", name, lid);
				lid2MediumName.put(lid, name);
			} else {
				log.warn("could not map media: {},{}", name, lid);
			}
		}
	}

	public String getMmname() {
		return mmname;
	}
	public Plex getPlex() {
		return plex;
	}
	public SF[] getSfs() {
		return sfs;
	}
	public Integer getBin() {
		return bin;
	}
	public String getMediaName() {
		return mediaName;
	}
	public MFC getMFC() {
		return mfc;
	}

	/**
	 * returns a hash code based on the binary
	 * content of the structured field envelope
	 * forming the medium map (BMM-EMM).
	 */
	@Override
	public int hashCode() {
		if(isHashCodeSet) return hashCode;
		if(sfs == null || sfs.length == 0) return 0;
				
		hashCode = MediumHasher.hashCode(sfs);
		isHashCodeSet = true;
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(!(obj instanceof MediumMap)) return false;
		MediumMap other = (MediumMap) obj;
		if(sfs.length != other.sfs.length) return false;
		for(int i=0; i<sfs.length; i++) {
			if(!EcoreUtil.equals(sfs[i], other.sfs[i])) return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MediumMap [mmname=" + mmname + ", plex=" + plex + ", bin="
				+ bin + ", mediaName=" + mediaName + "]";
	}
	
}
