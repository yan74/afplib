package org.afplib;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.afplib.afplib.AfplibFactory;
import org.afplib.afplib.AfplibPackage;
import org.afplib.base.BasePackage;
import org.afplib.base.SF;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Builder to create AFP structured fields, triplets,
 * repeating groups, SDFs, .... Use like this:
 * 
 * <code><pre>
BAG bag = new AfpBuilder()
	.with(AfplibPackage.BAG__AEG_NAME, "BAGTEST0")
	.withMember(new AfpBuilder()
		.with(AfplibPackage.COMMENT__COMMENT, "My Comment")
		.create(Comment.class))
	.withMember(new AfpBuilder()
		.create(NOP.class))
	.create(BAG.class);
 *	</pre></code>
 * 
 * @author Yan Hackl-Feldbusch <yan@hcsystems.de>
 *
 */
public class AfpBuilder {

	Map<Integer, Object> values = new HashMap<Integer, Object>();
	List<EObject> member = new LinkedList<EObject>();
	
	public AfpBuilder with(int classifierID, Object value) {
		values.put(classifierID, value);
		return this;
	}

	public AfpBuilder withMember(EObject tripletOrRG) {
		member.add(tripletOrRG);
		return this;
	}

	@SuppressWarnings("unchecked")
	public <T extends EObject> T create(Class<T> clazz) {
		EClass eclass;
		
		EClassifier classifier = AfplibPackage.eINSTANCE.getEClassifier(clazz.getSimpleName());
		if(classifier == null) throw new IllegalArgumentException(clazz.getName()+" is not a structured field or triplet class.");
		eclass = (EClass) classifier;
		
		EObject eobj = AfplibFactory.eINSTANCE.create(eclass);
		
		for(Entry<Integer, Object> e : values.entrySet()) {
			EStructuralFeature feature = eobj.eClass().getEStructuralFeature(e.getKey());
			eobj.eSet(feature, e.getValue());
		}

		for(EObject m : member) {
			Integer containerClassifierID = null;
			if(m instanceof SF) {
				containerClassifierID = BasePackage.SF__CHILDREN;
			} else {
				for(EReference ref : eclass.getEAllReferences()) {
					if(ref.equals(BasePackage.Literals.SF__CHILDREN)) continue;
					containerClassifierID = ref.getFeatureID();
				}
			}
			if(containerClassifierID == null) throw new IllegalArgumentException(clazz.getName()+" cannot contain triplets nor repeating groups.");
			EStructuralFeature feature = eobj.eClass().getEStructuralFeature(containerClassifierID);
			List<Object> list = (List<Object>) eobj.eGet(feature);
			list.add(m);
		}

		return (T) eobj;
	}

	
}
