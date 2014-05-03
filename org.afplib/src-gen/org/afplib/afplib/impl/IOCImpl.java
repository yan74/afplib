/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IOC;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IOC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getXoaOset <em>Xoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getYoaOset <em>Yoa Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getXoaOrent <em>Xoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getYoaOrent <em>Yoa Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getConData1 <em>Con Data1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getXMap <em>XMap</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getYMap <em>YMap</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCImpl#getConData2 <em>Con Data2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IOCImpl extends SFImpl implements IOC {
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
	 * The default value of the '{@link #getConData1() <em>Con Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CON_DATA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConData1() <em>Con Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData1()
	 * @generated
	 * @ordered
	 */
	protected byte[] conData1 = CON_DATA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getXMap() <em>XMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMap()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXMap() <em>XMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMap()
	 * @generated
	 * @ordered
	 */
	protected Integer xMap = XMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getYMap() <em>YMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMap()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYMap() <em>YMap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYMap()
	 * @generated
	 * @ordered
	 */
	protected Integer yMap = YMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getConData2() <em>Con Data2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData2()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CON_DATA2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConData2() <em>Con Data2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData2()
	 * @generated
	 * @ordered
	 */
	protected byte[] conData2 = CON_DATA2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIOC();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__XOA_OSET, oldXoaOset, xoaOset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__YOA_OSET, oldYoaOset, yoaOset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__XOA_ORENT, oldXoaOrent, xoaOrent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__YOA_ORENT, oldYoaOrent, yoaOrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getConData1() {
		return conData1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConData1(byte[] newConData1) {
		byte[] oldConData1 = conData1;
		conData1 = newConData1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__CON_DATA1, oldConData1, conData1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXMap() {
		return xMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXMap(Integer newXMap) {
		Integer oldXMap = xMap;
		xMap = newXMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__XMAP, oldXMap, xMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYMap() {
		return yMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYMap(Integer newYMap) {
		Integer oldYMap = yMap;
		yMap = newYMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__YMAP, oldYMap, yMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getConData2() {
		return conData2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConData2(byte[] newConData2) {
		byte[] oldConData2 = conData2;
		conData2 = newConData2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOC__CON_DATA2, oldConData2, conData2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IOC__XOA_OSET:
				return getXoaOset();
			case AfplibPackage.IOC__YOA_OSET:
				return getYoaOset();
			case AfplibPackage.IOC__XOA_ORENT:
				return getXoaOrent();
			case AfplibPackage.IOC__YOA_ORENT:
				return getYoaOrent();
			case AfplibPackage.IOC__CON_DATA1:
				return getConData1();
			case AfplibPackage.IOC__XMAP:
				return getXMap();
			case AfplibPackage.IOC__YMAP:
				return getYMap();
			case AfplibPackage.IOC__CON_DATA2:
				return getConData2();
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
			case AfplibPackage.IOC__XOA_OSET:
				setXoaOset((Integer)newValue);
				return;
			case AfplibPackage.IOC__YOA_OSET:
				setYoaOset((Integer)newValue);
				return;
			case AfplibPackage.IOC__XOA_ORENT:
				setXoaOrent((Integer)newValue);
				return;
			case AfplibPackage.IOC__YOA_ORENT:
				setYoaOrent((Integer)newValue);
				return;
			case AfplibPackage.IOC__CON_DATA1:
				setConData1((byte[])newValue);
				return;
			case AfplibPackage.IOC__XMAP:
				setXMap((Integer)newValue);
				return;
			case AfplibPackage.IOC__YMAP:
				setYMap((Integer)newValue);
				return;
			case AfplibPackage.IOC__CON_DATA2:
				setConData2((byte[])newValue);
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
			case AfplibPackage.IOC__XOA_OSET:
				setXoaOset(XOA_OSET_EDEFAULT);
				return;
			case AfplibPackage.IOC__YOA_OSET:
				setYoaOset(YOA_OSET_EDEFAULT);
				return;
			case AfplibPackage.IOC__XOA_ORENT:
				setXoaOrent(XOA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.IOC__YOA_ORENT:
				setYoaOrent(YOA_ORENT_EDEFAULT);
				return;
			case AfplibPackage.IOC__CON_DATA1:
				setConData1(CON_DATA1_EDEFAULT);
				return;
			case AfplibPackage.IOC__XMAP:
				setXMap(XMAP_EDEFAULT);
				return;
			case AfplibPackage.IOC__YMAP:
				setYMap(YMAP_EDEFAULT);
				return;
			case AfplibPackage.IOC__CON_DATA2:
				setConData2(CON_DATA2_EDEFAULT);
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
			case AfplibPackage.IOC__XOA_OSET:
				return XOA_OSET_EDEFAULT == null ? xoaOset != null : !XOA_OSET_EDEFAULT.equals(xoaOset);
			case AfplibPackage.IOC__YOA_OSET:
				return YOA_OSET_EDEFAULT == null ? yoaOset != null : !YOA_OSET_EDEFAULT.equals(yoaOset);
			case AfplibPackage.IOC__XOA_ORENT:
				return XOA_ORENT_EDEFAULT == null ? xoaOrent != null : !XOA_ORENT_EDEFAULT.equals(xoaOrent);
			case AfplibPackage.IOC__YOA_ORENT:
				return YOA_ORENT_EDEFAULT == null ? yoaOrent != null : !YOA_ORENT_EDEFAULT.equals(yoaOrent);
			case AfplibPackage.IOC__CON_DATA1:
				return CON_DATA1_EDEFAULT == null ? conData1 != null : !CON_DATA1_EDEFAULT.equals(conData1);
			case AfplibPackage.IOC__XMAP:
				return XMAP_EDEFAULT == null ? xMap != null : !XMAP_EDEFAULT.equals(xMap);
			case AfplibPackage.IOC__YMAP:
				return YMAP_EDEFAULT == null ? yMap != null : !YMAP_EDEFAULT.equals(yMap);
			case AfplibPackage.IOC__CON_DATA2:
				return CON_DATA2_EDEFAULT == null ? conData2 != null : !CON_DATA2_EDEFAULT.equals(conData2);
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
		result.append(" (XoaOset: ");
		result.append(xoaOset);
		result.append(", YoaOset: ");
		result.append(yoaOset);
		result.append(", XoaOrent: ");
		result.append(xoaOrent);
		result.append(", YoaOrent: ");
		result.append(yoaOrent);
		result.append(", ConData1: ");
		result.append(conData1);
		result.append(", XMap: ");
		result.append(xMap);
		result.append(", YMap: ");
		result.append(yMap);
		result.append(", ConData2: ");
		result.append(conData2);
		result.append(')');
		return result.toString();
	}

} //IOCImpl
