package org.afplib.helper.formdef;

import java.io.IOException;
import java.util.LinkedList;

import org.afplib.AfpBuilder;
import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BMM;
import org.afplib.afplib.BRS;
import org.afplib.afplib.EMM;
import org.afplib.afplib.ERS;
import org.afplib.afplib.ResourceObjectType;
import org.afplib.afplib.ResourceObjectTypeObjType;
import org.afplib.base.SF;
import org.afplib.io.AfpOutputStream;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FormdefImpl implements Formdef {

	private static final Logger log = LoggerFactory.getLogger(Formdef.class);

	private LinkedList<MediumMap> maps = new LinkedList<MediumMap>();

	private SF[] bdg;
	
	FormdefImpl() {
	}
	
	@Override
	public MediumMap findByName(String mmname) {
		for(MediumMap map : maps) {
			if(mmname.equals(map.getMmname()))
				return map;
		}
		return null;
	}

	@Override
	public MediumMap findFirstByBin(int bin) {
		for(MediumMap map : maps) {
			if(map.getBin() != null && map.getBin().intValue() == bin)
				return map;
		}
		return null;
	}

	@Override
	public MediumMap findFirstByBin(int bin, Plex plex) {
		if(plex == Plex.UNKNOWN) return findFirstByBin(bin);
		for(MediumMap map : maps) {
			if(map.getBin() != null && map.getBin().intValue() == bin) {
				if(map.getPlex() != null && map.getPlex() == plex)
					return map;
			}
		}
		return null;
	}

	@Override
	public MediumMap findFirstByMediaName(String media) {
		for(MediumMap map : maps) {
			if(media.equals(map.getMediaName()))
				return map;
		}
		return null;
	}

	@Override
	public MediumMap findFirstByMediaName(String media, Plex plex) {
		if(plex == Plex.UNKNOWN) return findFirstByMediaName(media);
		for(MediumMap map : maps) {
			if(media.equals(map.getMediaName())) {
				if(map.getPlex() != null && map.getPlex() == plex)
					return map;				
			}
		}
		return null;
	}

	@Override
	public MediumMap findByHash(int hash) {
		LinkedList<MediumMap> result = new LinkedList<MediumMap>();
		for(MediumMap map : maps) {
			if(hash == map.hashCode())
				result.add(map);
		}
		if(result.size() == 0) return null;
		if(result.size() == 1) return result.getFirst();
		log.error("at least {} and {} share the same hash value - cannot continue.", result.getFirst(), result.get(1));
		System.exit(1);
		return null;
	}

	@Override
	public MediumMap findEqual(MediumMap map) {
		int hash = map.hashCode();
		
		LinkedList<MediumMap> result = new LinkedList<MediumMap>();
		for(MediumMap m : maps) {
			if(hash == m.hashCode())
				result.add(m);
		}
		if(result.size() == 0) return null;
		
		SF[] sfs1 = map.getSfs();
		
		for(MediumMap m : maps) {
			SF[] sfs2 = m.getSfs();
			if(sfs2.length != sfs1.length) continue;
			boolean equals = true;
			for(int i=0; i<sfs2.length; i++) {
				if(sfs1[i] instanceof BMM && sfs2[i] instanceof BMM) continue;
				if(sfs1[i] instanceof EMM && sfs2[i] instanceof EMM) continue;
				if(!EcoreUtil.equals(sfs2[i], sfs1[i])) {
					equals = false;
					break;
				}
			}
			if(equals) return m;
		}
		return null;
	}
	
	@Override
	public MediumMap[] mediumMaps() {
		return (MediumMap[]) maps.toArray(new MediumMap[maps.size()]);
	}
	
	@Override
	public void add(SF[] mediumMap) {
		
		MediumMap map = new MediumMap(mediumMap);
		maps.add(map);
		log.debug("added medium map {}", map);

	}

	@Override
	public void add(String newMMName, SF[] mediumMap) {
		SF[] sfs = new SF[mediumMap.length];
		
		int i = 0;
		for(SF sf : mediumMap) {
			if(sf instanceof BMM) {
				BMM bmm = (BMM) EcoreUtil.copy(sf);
				bmm.setMMName(newMMName);
				sfs[i++] = bmm;
			} else if(sf instanceof EMM) {
				EMM emm = (EMM) EcoreUtil.copy(sf);
				emm.setMMName(newMMName);
				sfs[i++] = emm;
			} else {
				sfs[i++] = sf;
			}
		}
		add(sfs);
	}
	
	@Override
	public void setBDG(SF[] bdg) {
		this.bdg = bdg;
	}

	@Override
	public void save(AfpOutputStream out, boolean asResource) throws IOException {
		if(asResource) {
			BRS brs = new AfpBuilder()
				.with(AfplibPackage.BRS__RS_NAME, "F1INLINE")
				.withMember(new AfpBuilder()
					.with(AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE, ResourceObjectTypeObjType.CONST_FORM_MAP_VALUE)
					.with(AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA, new byte[] {0,0,0,0,0,0,0})
					.create(ResourceObjectType.class))
				.create(BRS.class);
			
			out.writeStructuredField(brs);
		}

		out.writeStructuredField(AfplibFactory.eINSTANCE.createBFM());

		if(bdg != null) {
			for(SF sf : bdg)
				out.writeStructuredField(sf);
		}
		
		for(MediumMap map : maps) {
			for(SF sf : map.getSfs())
				out.writeStructuredField(sf);
		}
		
		out.writeStructuredField(AfplibFactory.eINSTANCE.createEFM());

		if(asResource) {
			ERS ers = new AfpBuilder()
				.with(AfplibPackage.ERS__RS_NAME, "F1INLINE")
				.create(ERS.class);
		
			out.writeStructuredField(ers);
		}

	}

	@Override
	public String toString() {
		return "FormdefImpl [maps=" + maps + "]";
	}

}
