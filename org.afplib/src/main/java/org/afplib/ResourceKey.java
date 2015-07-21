package org.afplib;

import java.util.List;

import org.afplib.afplib.BRS;
import org.afplib.afplib.FullyQualifiedName;
import org.afplib.afplib.FullyQualifiedNameFQNType;
import org.afplib.afplib.IOB;
import org.afplib.afplib.IOBObjType;
import org.afplib.afplib.IPO;
import org.afplib.afplib.IPS;
import org.afplib.afplib.ObjectClassification;
import org.afplib.afplib.ResourceObjectType;
import org.afplib.afplib.ResourceObjectTypeObjType;
import org.afplib.base.BasePackage;
import org.afplib.base.Triplet;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Identifies an AFP resource.
 * 
 * @author Yan Hackl-Feldbusch <yan@hcsystems.de>
 *
 */
public class ResourceKey {
	int type;
	String name;
	String objId;

	public ResourceKey(int type, String name) {
		init(type, name, null);
	}

	public ResourceKey(int type, String name, byte[] objId) {
		String id = "";
		for(byte o : objId)
			id+=String.format("%02x", o);
		init(type, name, id);
	}

    public ResourceKey(ResourceObjectTypeObjType type, String objName) {
		this(type.getValue(), objName);
	}

	public ResourceKey(int type, String name, String objId) {
		init(type, name, objId == null ? null : objId.toLowerCase());
	}

    public ResourceKey(ResourceObjectTypeObjType type, String objName,
			byte[] regObjId) {
		this(type.getValue(), objName, regObjId);
	}

    public ResourceKey(ResourceObjectTypeObjType type, String objName,
    		String regObjId) {
		this(type.getValue(), objName, regObjId);
	}

	private void init(int type, String name, String objId) {
		this.type = type;
		this.name = name;
		this.objId = objId;    	
    }

	public int getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public String getObjId() {
		return objId;
	}

	public boolean matches(BRS brs) {
		if(brs == null) return false;
		
		int brsType = -1;
		String rsName = brs.getRSName();
		String rsObjId = null;
		
		for(Object m : brs.getTriplets()) {
			if(m instanceof ResourceObjectType) {
				brsType = ((ResourceObjectType)m).getObjType();
			}
			if(m instanceof FullyQualifiedName 
					&& ((FullyQualifiedName) m).getFQNType() == FullyQualifiedNameFQNType.CONST_REPLACE_FIRST_GID_NAME_VALUE) {
				rsName = ((FullyQualifiedName)m).getFQName();
			}
			if(m instanceof ObjectClassification) {
				rsObjId = "";
				for(byte o : ((ObjectClassification)m).getRegObjId())
					rsObjId+=String.format("%02x", o);
			}
		}
		
		if (name == null) {
			if (rsName != null)
				return false;
		} else if (!name.equals(rsName))
			return false;
		if (objId == null) {
			if (rsObjId != null)
				return false;
		} else if (!objId.equals(rsObjId))
			return false;
		if (type != brsType)
			return false;

		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((objId == null) ? 0 : objId.hashCode());
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResourceKey other = (ResourceKey) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (objId == null) {
			if (other.objId != null)
				return false;
		} else if (!objId.equals(other.objId))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResourceKey [type=" + type + ", name=" + name + ", objId="
				+ objId + "]";
	}

	public static ResourceKey toResourceKey(BRS brs) {
		if(brs == null) return null;
		
		int brsType = -1;
		String rsName = brs.getRSName();
		String rsObjId = null;
		
		for(Object m : brs.getTriplets()) {
			if(m instanceof ResourceObjectType) {
				brsType = ((ResourceObjectType)m).getObjType();
			}
			if(m instanceof FullyQualifiedName 
					&& ((FullyQualifiedName) m).getFQNType() == FullyQualifiedNameFQNType.CONST_REPLACE_FIRST_GID_NAME_VALUE) {
				rsName = ((FullyQualifiedName)m).getFQName();
			}
			if(m instanceof ObjectClassification) {
				rsObjId = "";
				for(byte o : ((ObjectClassification)m).getRegObjId())
					rsObjId+=String.format("%02x", o);
			}
		}
		if(brsType == -1) return null;
		if(rsObjId != null) return new ResourceKey(brsType, rsName, rsObjId);
		return new ResourceKey(brsType, rsName);
	}

	public static ResourceKey toResourceKey(IPO ipo) {
		String objName = ipo.getOvlyName();
		objName = overrideGID(ipo, objName);
		return new ResourceKey(ResourceObjectTypeObjType.CONST_OVERLAY, objName);
	}

	public static ResourceKey toResourceKey(IPS ips) {
		String objName = ips.getPsegName();
		objName = overrideGID(ips, objName);
		return new ResourceKey(ResourceObjectTypeObjType.CONST_PAGE_SEGMENT, objName);
	}

	public static ResourceKey toResourceKey(IOB iob) {
		IOBObjType type = IOBObjType.get(iob.getObjType());
		if(type == null) return null;
		
		ResourceKey key = null;
		String objName = iob.getObjName();
		
		objName = overrideGID(iob, objName);
		
		switch(type) {
		case CONST_BAR_CODE_BCOCA:
			key = new ResourceKey(ResourceObjectTypeObjType.CONST_BCOCA, objName);
			break;
		case CONST_GRAPHICS_GOCA:
			key = new ResourceKey(ResourceObjectTypeObjType.CONST_GOCA, objName);
			break;
		case CONST_IMAGE_IOCA:
			key = new ResourceKey(ResourceObjectTypeObjType.CONST_IOCA, objName);
			break;
		case CONST_OTHEROBJECTDATA:
			for(Triplet t : iob.getTriplets()) {
				if(t instanceof ObjectClassification) {
					ObjectClassification clazz = (ObjectClassification) t;
					key = new ResourceKey(ResourceObjectTypeObjType.CONST_OBJECT_CONTAINER, objName, clazz.getRegObjId());
					break;
				}
			}
			break;
		case CONST_PAGE_SEGMENT:
			key = new ResourceKey(ResourceObjectTypeObjType.CONST_PAGE_SEGMENT, objName);
			break;
		}
		
		return key;
	}

	private static String overrideGID(EObject eobj, String objName) {
		for(EReference ref : eobj.eClass().getEAllContainments()) {
			if (ref.equals(BasePackage.Literals.SF__CHILDREN)) continue;
			for(Object t : (List<?>) eobj.eGet(ref)) {
				if(t instanceof FullyQualifiedName) {
					FullyQualifiedName fqn = (FullyQualifiedName) t;
					if(fqn.getFQNType() == null) continue;
					if(FullyQualifiedNameFQNType.CONST_REPLACE_FIRST_GID_NAME_VALUE != fqn.getFQNType().intValue()) continue;
					objName = fqn.getFQName();
					break;
				}
			}
		}
		return objName;
	}
	
}
