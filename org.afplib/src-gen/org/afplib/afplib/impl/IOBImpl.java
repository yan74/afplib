/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IOB;

import org.afplib.base.Triplet;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IOB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getRefCSys <em>Ref CSys</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOBImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IOBImpl extends SFImpl implements IOB {
	/**
	 * The default value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjName()
	 * @generated
	 * @ordered
	 */
	protected String objName = OBJ_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getXoaOset() <em>Xoa Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOA_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXoaOset() <em>Xoa Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaOset()
	 * @generated
	 * @ordered
	 */
	protected Integer xoaOset = XOA_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoaOset() <em>Yoa Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOA_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoaOset() <em>Yoa Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaOset()
	 * @generated
	 * @ordered
	 */
	protected Integer yoaOset = YOA_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getXoaOrent() <em>Xoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaOrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOA_ORENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXoaOrent() <em>Xoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaOrent()
	 * @generated
	 * @ordered
	 */
	protected Integer xoaOrent = XOA_ORENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoaOrent() <em>Yoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaOrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOA_ORENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoaOrent() <em>Yoa Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaOrent()
	 * @generated
	 * @ordered
	 */
	protected Integer yoaOrent = YOA_ORENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getXocaOset() <em>Xoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocaOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOCA_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXocaOset() <em>Xoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocaOset()
	 * @generated
	 * @ordered
	 */
	protected Integer xocaOset = XOCA_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYocaOset() <em>Yoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocaOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOCA_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYocaOset() <em>Yoca Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocaOset()
	 * @generated
	 * @ordered
	 */
	protected Integer yocaOset = YOCA_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefCSys() <em>Ref CSys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefCSys()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REF_CSYS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefCSys() <em>Ref CSys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefCSys()
	 * @generated
	 * @ordered
	 */
	protected Integer refCSys = REF_CSYS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriplets() <em>Triplets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplets()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplet> triplets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIOB();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjName() {
		return objName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjName(String newObjName) {
		String oldObjName = objName;
		objName = newObjName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__OBJ_NAME, oldObjName, objName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__OBJ_TYPE, oldObjType, objType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXoaOset() {
		return xoaOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoaOset(Integer newXoaOset) {
		Integer oldXoaOset = xoaOset;
		xoaOset = newXoaOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__XOA_OSET, oldXoaOset, xoaOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYoaOset() {
		return yoaOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoaOset(Integer newYoaOset) {
		Integer oldYoaOset = yoaOset;
		yoaOset = newYoaOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__YOA_OSET, oldYoaOset, yoaOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXoaOrent() {
		return xoaOrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoaOrent(Integer newXoaOrent) {
		Integer oldXoaOrent = xoaOrent;
		xoaOrent = newXoaOrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__XOA_ORENT, oldXoaOrent, xoaOrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYoaOrent() {
		return yoaOrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoaOrent(Integer newYoaOrent) {
		Integer oldYoaOrent = yoaOrent;
		yoaOrent = newYoaOrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__YOA_ORENT, oldYoaOrent, yoaOrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXocaOset() {
		return xocaOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXocaOset(Integer newXocaOset) {
		Integer oldXocaOset = xocaOset;
		xocaOset = newXocaOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__XOCA_OSET, oldXocaOset, xocaOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYocaOset() {
		return yocaOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYocaOset(Integer newYocaOset) {
		Integer oldYocaOset = yocaOset;
		yocaOset = newYocaOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__YOCA_OSET, oldYocaOset, yocaOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRefCSys() {
		return refCSys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefCSys(Integer newRefCSys) {
		Integer oldRefCSys = refCSys;
		refCSys = newRefCSys;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOB__REF_CSYS, oldRefCSys, refCSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IOB__TRIPLETS);
		}
		return triplets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.IOB__TRIPLETS:
				return ((InternalEList<?>)getTriplets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IOB__OBJ_NAME:
				return getObjName();
			case AfplibPackage.IOB__OBJ_TYPE:
				return getObjType();
			case AfplibPackage.IOB__XOA_OSET:
				return getXoaOset();
			case AfplibPackage.IOB__YOA_OSET:
				return getYoaOset();
			case AfplibPackage.IOB__XOA_ORENT:
				return getXoaOrent();
			case AfplibPackage.IOB__YOA_ORENT:
				return getYoaOrent();
			case AfplibPackage.IOB__XOCA_OSET:
				return getXocaOset();
			case AfplibPackage.IOB__YOCA_OSET:
				return getYocaOset();
			case AfplibPackage.IOB__REF_CSYS:
				return getRefCSys();
			case AfplibPackage.IOB__TRIPLETS:
				return getTriplets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.IOB__OBJ_NAME:
				setObjName((String)newValue);
				return;
			case AfplibPackage.IOB__OBJ_TYPE:
				setObjType((Integer)newValue);
				return;
			case AfplibPackage.IOB__XOA_OSET:
				setXoaOset((Integer)newValue);
				return;
			case AfplibPackage.IOB__YOA_OSET:
				setYoaOset((Integer)newValue);
				return;
			case AfplibPackage.IOB__XOA_ORENT:
				setXoaOrent((Integer)newValue);
				return;
			case AfplibPackage.IOB__YOA_ORENT:
				setYoaOrent((Integer)newValue);
				return;
			case AfplibPackage.IOB__XOCA_OSET:
				setXocaOset((Integer)newValue);
				return;
			case AfplibPackage.IOB__YOCA_OSET:
				setYocaOset((Integer)newValue);
				return;
			case AfplibPackage.IOB__REF_CSYS:
				setRefCSys((Integer)newValue);
				return;
			case AfplibPackage.IOB__TRIPLETS:
				getTriplets().clear();
				getTriplets().addAll((Collection<? extends Triplet>)newValue);
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
			case AfplibPackage.IOB__OBJ_NAME:
				setObjName(OBJ_NAME_EDEFAULT);
				return;
			case AfplibPackage.IOB__OBJ_TYPE:
				setObjType(OBJ_TYPE_EDEFAULT);
				return;
			case AfplibPackage.IOB__XOA_OSET:
				setXoaOset(XOA_OSET_EDEFAULT);
				return;
			case AfplibPackage.IOB__YOA_OSET:
				setYoaOset(YOA_OSET_EDEFAULT);
				return;
			case AfplibPackage.IOB__XOA_ORENT:
				setXoaOrent(XOA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.IOB__YOA_ORENT:
				setYoaOrent(YOA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.IOB__XOCA_OSET:
				setXocaOset(XOCA_OSET_EDEFAULT);
				return;
			case AfplibPackage.IOB__YOCA_OSET:
				setYocaOset(YOCA_OSET_EDEFAULT);
				return;
			case AfplibPackage.IOB__REF_CSYS:
				setRefCSys(REF_CSYS_EDEFAULT);
				return;
			case AfplibPackage.IOB__TRIPLETS:
				getTriplets().clear();
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
			case AfplibPackage.IOB__OBJ_NAME:
				return OBJ_NAME_EDEFAULT == null ? objName != null : !OBJ_NAME_EDEFAULT.equals(objName);
			case AfplibPackage.IOB__OBJ_TYPE:
				return OBJ_TYPE_EDEFAULT == null ? objType != null : !OBJ_TYPE_EDEFAULT.equals(objType);
			case AfplibPackage.IOB__XOA_OSET:
				return XOA_OSET_EDEFAULT == null ? xoaOset != null : !XOA_OSET_EDEFAULT.equals(xoaOset);
			case AfplibPackage.IOB__YOA_OSET:
				return YOA_OSET_EDEFAULT == null ? yoaOset != null : !YOA_OSET_EDEFAULT.equals(yoaOset);
			case AfplibPackage.IOB__XOA_ORENT:
				return XOA_ORENT_EDEFAULT == null ? xoaOrent != null : !XOA_ORENT_EDEFAULT.equals(xoaOrent);
			case AfplibPackage.IOB__YOA_ORENT:
				return YOA_ORENT_EDEFAULT == null ? yoaOrent != null : !YOA_ORENT_EDEFAULT.equals(yoaOrent);
			case AfplibPackage.IOB__XOCA_OSET:
				return XOCA_OSET_EDEFAULT == null ? xocaOset != null : !XOCA_OSET_EDEFAULT.equals(xocaOset);
			case AfplibPackage.IOB__YOCA_OSET:
				return YOCA_OSET_EDEFAULT == null ? yocaOset != null : !YOCA_OSET_EDEFAULT.equals(yocaOset);
			case AfplibPackage.IOB__REF_CSYS:
				return REF_CSYS_EDEFAULT == null ? refCSys != null : !REF_CSYS_EDEFAULT.equals(refCSys);
			case AfplibPackage.IOB__TRIPLETS:
				return triplets != null && !triplets.isEmpty();
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
		result.append(" (ObjName: ");
		result.append(objName);
		result.append(", ObjType: ");
		result.append(objType);
		result.append(", XoaOset: ");
		result.append(xoaOset);
		result.append(", YoaOset: ");
		result.append(yoaOset);
		result.append(", XoaOrent: ");
		result.append(xoaOrent);
		result.append(", YoaOrent: ");
		result.append(yoaOrent);
		result.append(", XocaOset: ");
		result.append(xocaOset);
		result.append(", YocaOset: ");
		result.append(yocaOset);
		result.append(", RefCSys: ");
		result.append(refCSys);
		result.append(')');
		return result.toString();
	}

} //IOBImpl
