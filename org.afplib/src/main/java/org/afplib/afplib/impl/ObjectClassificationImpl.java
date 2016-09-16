/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectClassification;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectClassificationImpl#getObjClass <em>Obj Class</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectClassificationImpl#getStrucFlgs <em>Struc Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectClassificationImpl#getRegObjId <em>Reg Obj Id</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectClassificationImpl#getObjTpName <em>Obj Tp Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectClassificationImpl#getObjLev <em>Obj Lev</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectClassificationImpl#getCompName <em>Comp Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectClassificationImpl extends TripletImpl implements ObjectClassification {
	/**
	 * The default value of the '{@link #getObjClass() <em>Obj Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjClass()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OBJ_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjClass() <em>Obj Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjClass()
	 * @generated
	 * @ordered
	 */
	protected Integer objClass = OBJ_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrucFlgs() <em>Struc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrucFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STRUC_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrucFlgs() <em>Struc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrucFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer strucFlgs = STRUC_FLGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegObjId() <em>Reg Obj Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegObjId()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] REG_OBJ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegObjId() <em>Reg Obj Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegObjId()
	 * @generated
	 * @ordered
	 */
	protected byte[] regObjId = REG_OBJ_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjTpName() <em>Obj Tp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjTpName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJ_TP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjTpName() <em>Obj Tp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjTpName()
	 * @generated
	 * @ordered
	 */
	protected String objTpName = OBJ_TP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjLev() <em>Obj Lev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjLev()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJ_LEV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjLev() <em>Obj Lev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjLev()
	 * @generated
	 * @ordered
	 */
	protected String objLev = OBJ_LEV_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompName() <em>Comp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompName() <em>Comp Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompName()
	 * @generated
	 * @ordered
	 */
	protected String compName = COMP_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getObjectClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getObjClass() {
		return objClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjClass(Integer newObjClass) {
		Integer oldObjClass = objClass;
		objClass = newObjClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS, oldObjClass, objClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStrucFlgs() {
		return strucFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrucFlgs(Integer newStrucFlgs) {
		Integer oldStrucFlgs = strucFlgs;
		strucFlgs = newStrucFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS, oldStrucFlgs, strucFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getRegObjId() {
		return regObjId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegObjId(byte[] newRegObjId) {
		byte[] oldRegObjId = regObjId;
		regObjId = newRegObjId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID, oldRegObjId, regObjId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjTpName() {
		return objTpName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjTpName(String newObjTpName) {
		String oldObjTpName = objTpName;
		objTpName = newObjTpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CLASSIFICATION__OBJ_TP_NAME, oldObjTpName, objTpName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjLev() {
		return objLev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjLev(String newObjLev) {
		String oldObjLev = objLev;
		objLev = newObjLev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CLASSIFICATION__OBJ_LEV, oldObjLev, objLev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompName() {
		return compName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompName(String newCompName) {
		String oldCompName = compName;
		compName = newCompName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CLASSIFICATION__COMP_NAME, oldCompName, compName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS:
				return getObjClass();
			case AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS:
				return getStrucFlgs();
			case AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID:
				return getRegObjId();
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_TP_NAME:
				return getObjTpName();
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_LEV:
				return getObjLev();
			case AfplibPackage.OBJECT_CLASSIFICATION__COMP_NAME:
				return getCompName();
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
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS:
				setObjClass((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS:
				setStrucFlgs((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID:
				setRegObjId((byte[])newValue);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_TP_NAME:
				setObjTpName((String)newValue);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_LEV:
				setObjLev((String)newValue);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__COMP_NAME:
				setCompName((String)newValue);
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
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS:
				setObjClass(OBJ_CLASS_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS:
				setStrucFlgs(STRUC_FLGS_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID:
				setRegObjId(REG_OBJ_ID_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_TP_NAME:
				setObjTpName(OBJ_TP_NAME_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_LEV:
				setObjLev(OBJ_LEV_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_CLASSIFICATION__COMP_NAME:
				setCompName(COMP_NAME_EDEFAULT);
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
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_CLASS:
				return OBJ_CLASS_EDEFAULT == null ? objClass != null : !OBJ_CLASS_EDEFAULT.equals(objClass);
			case AfplibPackage.OBJECT_CLASSIFICATION__STRUC_FLGS:
				return STRUC_FLGS_EDEFAULT == null ? strucFlgs != null : !STRUC_FLGS_EDEFAULT.equals(strucFlgs);
			case AfplibPackage.OBJECT_CLASSIFICATION__REG_OBJ_ID:
				return REG_OBJ_ID_EDEFAULT == null ? regObjId != null : !REG_OBJ_ID_EDEFAULT.equals(regObjId);
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_TP_NAME:
				return OBJ_TP_NAME_EDEFAULT == null ? objTpName != null : !OBJ_TP_NAME_EDEFAULT.equals(objTpName);
			case AfplibPackage.OBJECT_CLASSIFICATION__OBJ_LEV:
				return OBJ_LEV_EDEFAULT == null ? objLev != null : !OBJ_LEV_EDEFAULT.equals(objLev);
			case AfplibPackage.OBJECT_CLASSIFICATION__COMP_NAME:
				return COMP_NAME_EDEFAULT == null ? compName != null : !COMP_NAME_EDEFAULT.equals(compName);
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
		result.append(" (ObjClass: ");
		result.append(objClass);
		result.append(", StrucFlgs: ");
		result.append(strucFlgs);
		result.append(", RegObjId: ");
		result.append(regObjId);
		result.append(", ObjTpName: ");
		result.append(objTpName);
		result.append(", ObjLev: ");
		result.append(objLev);
		result.append(", CompName: ");
		result.append(compName);
		result.append(')');
		return result.toString();
	}

} //ObjectClassificationImpl
