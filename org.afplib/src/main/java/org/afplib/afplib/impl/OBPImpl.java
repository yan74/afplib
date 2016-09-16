/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.OBP;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OBP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getOAPosID <em>OA Pos ID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getXocaOrent <em>Xoca Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getYocaOrent <em>Yoca Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.OBPImpl#getRefCSys <em>Ref CSys</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OBPImpl extends SFImpl implements OBP {
	/**
	 * The default value of the '{@link #getOAPosID() <em>OA Pos ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAPosID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OA_POS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOAPosID() <em>OA Pos ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOAPosID()
	 * @generated
	 * @ordered
	 */
	protected Integer oaPosID = OA_POS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RG_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected Integer rgLength = RG_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getXocaOrent() <em>Xoca Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocaOrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOCA_ORENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXocaOrent() <em>Xoca Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocaOrent()
	 * @generated
	 * @ordered
	 */
	protected Integer xocaOrent = XOCA_ORENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYocaOrent() <em>Yoca Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocaOrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOCA_ORENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYocaOrent() <em>Yoca Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocaOrent()
	 * @generated
	 * @ordered
	 */
	protected Integer yocaOrent = YOCA_ORENT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OBPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.OBP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOAPosID() {
		return oaPosID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOAPosID(Integer newOAPosID) {
		Integer oldOAPosID = oaPosID;
		oaPosID = newOAPosID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__OA_POS_ID, oldOAPosID, oaPosID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRGLength() {
		return rgLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGLength(Integer newRGLength) {
		Integer oldRGLength = rgLength;
		rgLength = newRGLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__RG_LENGTH, oldRGLength, rgLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__XOA_OSET, oldXoaOset, xoaOset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__YOA_OSET, oldYoaOset, yoaOset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__XOA_ORENT, oldXoaOrent, xoaOrent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__YOA_ORENT, oldYoaOrent, yoaOrent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__XOCA_OSET, oldXocaOset, xocaOset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__YOCA_OSET, oldYocaOset, yocaOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXocaOrent() {
		return xocaOrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXocaOrent(Integer newXocaOrent) {
		Integer oldXocaOrent = xocaOrent;
		xocaOrent = newXocaOrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__XOCA_ORENT, oldXocaOrent, xocaOrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYocaOrent() {
		return yocaOrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYocaOrent(Integer newYocaOrent) {
		Integer oldYocaOrent = yocaOrent;
		yocaOrent = newYocaOrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__YOCA_ORENT, oldYocaOrent, yocaOrent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBP__REF_CSYS, oldRefCSys, refCSys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBP__OA_POS_ID:
				return getOAPosID();
			case AfplibPackage.OBP__RG_LENGTH:
				return getRGLength();
			case AfplibPackage.OBP__XOA_OSET:
				return getXoaOset();
			case AfplibPackage.OBP__YOA_OSET:
				return getYoaOset();
			case AfplibPackage.OBP__XOA_ORENT:
				return getXoaOrent();
			case AfplibPackage.OBP__YOA_ORENT:
				return getYoaOrent();
			case AfplibPackage.OBP__XOCA_OSET:
				return getXocaOset();
			case AfplibPackage.OBP__YOCA_OSET:
				return getYocaOset();
			case AfplibPackage.OBP__XOCA_ORENT:
				return getXocaOrent();
			case AfplibPackage.OBP__YOCA_ORENT:
				return getYocaOrent();
			case AfplibPackage.OBP__REF_CSYS:
				return getRefCSys();
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
			case AfplibPackage.OBP__OA_POS_ID:
				setOAPosID((Integer)newValue);
				return;
			case AfplibPackage.OBP__RG_LENGTH:
				setRGLength((Integer)newValue);
				return;
			case AfplibPackage.OBP__XOA_OSET:
				setXoaOset((Integer)newValue);
				return;
			case AfplibPackage.OBP__YOA_OSET:
				setYoaOset((Integer)newValue);
				return;
			case AfplibPackage.OBP__XOA_ORENT:
				setXoaOrent((Integer)newValue);
				return;
			case AfplibPackage.OBP__YOA_ORENT:
				setYoaOrent((Integer)newValue);
				return;
			case AfplibPackage.OBP__XOCA_OSET:
				setXocaOset((Integer)newValue);
				return;
			case AfplibPackage.OBP__YOCA_OSET:
				setYocaOset((Integer)newValue);
				return;
			case AfplibPackage.OBP__XOCA_ORENT:
				setXocaOrent((Integer)newValue);
				return;
			case AfplibPackage.OBP__YOCA_ORENT:
				setYocaOrent((Integer)newValue);
				return;
			case AfplibPackage.OBP__REF_CSYS:
				setRefCSys((Integer)newValue);
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
			case AfplibPackage.OBP__OA_POS_ID:
				setOAPosID(OA_POS_ID_EDEFAULT);
				return;
			case AfplibPackage.OBP__RG_LENGTH:
				setRGLength(RG_LENGTH_EDEFAULT);
				return;
			case AfplibPackage.OBP__XOA_OSET:
				setXoaOset(XOA_OSET_EDEFAULT);
				return;
			case AfplibPackage.OBP__YOA_OSET:
				setYoaOset(YOA_OSET_EDEFAULT);
				return;
			case AfplibPackage.OBP__XOA_ORENT:
				setXoaOrent(XOA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.OBP__YOA_ORENT:
				setYoaOrent(YOA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.OBP__XOCA_OSET:
				setXocaOset(XOCA_OSET_EDEFAULT);
				return;
			case AfplibPackage.OBP__YOCA_OSET:
				setYocaOset(YOCA_OSET_EDEFAULT);
				return;
			case AfplibPackage.OBP__XOCA_ORENT:
				setXocaOrent(XOCA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.OBP__YOCA_ORENT:
				setYocaOrent(YOCA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.OBP__REF_CSYS:
				setRefCSys(REF_CSYS_EDEFAULT);
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
			case AfplibPackage.OBP__OA_POS_ID:
				return OA_POS_ID_EDEFAULT == null ? oaPosID != null : !OA_POS_ID_EDEFAULT.equals(oaPosID);
			case AfplibPackage.OBP__RG_LENGTH:
				return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
			case AfplibPackage.OBP__XOA_OSET:
				return XOA_OSET_EDEFAULT == null ? xoaOset != null : !XOA_OSET_EDEFAULT.equals(xoaOset);
			case AfplibPackage.OBP__YOA_OSET:
				return YOA_OSET_EDEFAULT == null ? yoaOset != null : !YOA_OSET_EDEFAULT.equals(yoaOset);
			case AfplibPackage.OBP__XOA_ORENT:
				return XOA_ORENT_EDEFAULT == null ? xoaOrent != null : !XOA_ORENT_EDEFAULT.equals(xoaOrent);
			case AfplibPackage.OBP__YOA_ORENT:
				return YOA_ORENT_EDEFAULT == null ? yoaOrent != null : !YOA_ORENT_EDEFAULT.equals(yoaOrent);
			case AfplibPackage.OBP__XOCA_OSET:
				return XOCA_OSET_EDEFAULT == null ? xocaOset != null : !XOCA_OSET_EDEFAULT.equals(xocaOset);
			case AfplibPackage.OBP__YOCA_OSET:
				return YOCA_OSET_EDEFAULT == null ? yocaOset != null : !YOCA_OSET_EDEFAULT.equals(yocaOset);
			case AfplibPackage.OBP__XOCA_ORENT:
				return XOCA_ORENT_EDEFAULT == null ? xocaOrent != null : !XOCA_ORENT_EDEFAULT.equals(xocaOrent);
			case AfplibPackage.OBP__YOCA_ORENT:
				return YOCA_ORENT_EDEFAULT == null ? yocaOrent != null : !YOCA_ORENT_EDEFAULT.equals(yocaOrent);
			case AfplibPackage.OBP__REF_CSYS:
				return REF_CSYS_EDEFAULT == null ? refCSys != null : !REF_CSYS_EDEFAULT.equals(refCSys);
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
		result.append(" (OAPosID: ");
		result.append(oaPosID);
		result.append(", RGLength: ");
		result.append(rgLength);
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
		result.append(", XocaOrent: ");
		result.append(xocaOrent);
		result.append(", YocaOrent: ");
		result.append(yocaOrent);
		result.append(", RefCSys: ");
		result.append(refCSys);
		result.append(')');
		return result.toString();
	}

} //OBPImpl
