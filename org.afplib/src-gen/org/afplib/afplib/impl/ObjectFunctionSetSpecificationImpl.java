/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectFunctionSetSpecification;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Function Set Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectFunctionSetSpecificationImpl#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectFunctionSetSpecificationImpl#getArchVrsn <em>Arch Vrsn</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectFunctionSetSpecificationImpl#getDCAFnSet <em>DCA Fn Set</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectFunctionSetSpecificationImpl#getOCAFnSet <em>OCA Fn Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFunctionSetSpecificationImpl extends TripletImpl implements ObjectFunctionSetSpecification {
	/**
	 * The default value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OBJ_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjType()
	 * @generated
	 * @ordered
	 */
	protected Integer objType = OBJ_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchVrsn() <em>Arch Vrsn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchVrsn()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ARCH_VRSN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchVrsn() <em>Arch Vrsn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchVrsn()
	 * @generated
	 * @ordered
	 */
	protected Integer archVrsn = ARCH_VRSN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDCAFnSet() <em>DCA Fn Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCAFnSet()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DCA_FN_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDCAFnSet() <em>DCA Fn Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCAFnSet()
	 * @generated
	 * @ordered
	 */
	protected Integer dcaFnSet = DCA_FN_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOCAFnSet() <em>OCA Fn Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCAFnSet()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCA_FN_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOCAFnSet() <em>OCA Fn Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCAFnSet()
	 * @generated
	 * @ordered
	 */
	protected Integer ocaFnSet = OCA_FN_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFunctionSetSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getObjectFunctionSetSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getObjType() {
		return objType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjType(Integer newObjType) {
		Integer oldObjType = objType;
		objType = newObjType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OBJ_TYPE, oldObjType, objType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getArchVrsn() {
		return archVrsn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchVrsn(Integer newArchVrsn) {
		Integer oldArchVrsn = archVrsn;
		archVrsn = newArchVrsn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__ARCH_VRSN, oldArchVrsn, archVrsn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDCAFnSet() {
		return dcaFnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDCAFnSet(Integer newDCAFnSet) {
		Integer oldDCAFnSet = dcaFnSet;
		dcaFnSet = newDCAFnSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__DCA_FN_SET, oldDCAFnSet, dcaFnSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOCAFnSet() {
		return ocaFnSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOCAFnSet(Integer newOCAFnSet) {
		Integer oldOCAFnSet = ocaFnSet;
		ocaFnSet = newOCAFnSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OCA_FN_SET, oldOCAFnSet, ocaFnSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OBJ_TYPE:
				return getObjType();
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__ARCH_VRSN:
				return getArchVrsn();
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__DCA_FN_SET:
				return getDCAFnSet();
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OCA_FN_SET:
				return getOCAFnSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OBJ_TYPE:
				setObjType((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__ARCH_VRSN:
				setArchVrsn((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__DCA_FN_SET:
				setDCAFnSet((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OCA_FN_SET:
				setOCAFnSet((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OBJ_TYPE:
				setObjType(OBJ_TYPE_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__ARCH_VRSN:
				setArchVrsn(ARCH_VRSN_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__DCA_FN_SET:
				setDCAFnSet(DCA_FN_SET_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OCA_FN_SET:
				setOCAFnSet(OCA_FN_SET_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OBJ_TYPE:
				return OBJ_TYPE_EDEFAULT == null ? objType != null : !OBJ_TYPE_EDEFAULT.equals(objType);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__ARCH_VRSN:
				return ARCH_VRSN_EDEFAULT == null ? archVrsn != null : !ARCH_VRSN_EDEFAULT.equals(archVrsn);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__DCA_FN_SET:
				return DCA_FN_SET_EDEFAULT == null ? dcaFnSet != null : !DCA_FN_SET_EDEFAULT.equals(dcaFnSet);
			case AfplibPackage.OBJECT_FUNCTION_SET_SPECIFICATION__OCA_FN_SET:
				return OCA_FN_SET_EDEFAULT == null ? ocaFnSet != null : !OCA_FN_SET_EDEFAULT.equals(ocaFnSet);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ObjType: ");
		result.append(objType);
		result.append(", ArchVrsn: ");
		result.append(archVrsn);
		result.append(", DCAFnSet: ");
		result.append(dcaFnSet);
		result.append(", OCAFnSet: ");
		result.append(ocaFnSet);
		result.append(')');
		return result.toString();
	}

} //ObjectFunctionSetSpecificationImpl
