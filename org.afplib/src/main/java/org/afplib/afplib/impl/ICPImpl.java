/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ICP;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ICPImpl#getXCOset <em>XC Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ICPImpl#getYCOset <em>YC Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ICPImpl#getXCSize <em>XC Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ICPImpl#getYCSize <em>YC Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ICPImpl#getXFilSize <em>XFil Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ICPImpl#getYFilSize <em>YFil Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ICPImpl extends SFImpl implements ICP {
	/**
	 * The default value of the '{@link #getXCOset() <em>XC Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XC_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXCOset() <em>XC Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCOset()
	 * @generated
	 * @ordered
	 */
	protected Integer xcOset = XC_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCOset() <em>YC Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YC_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYCOset() <em>YC Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCOset()
	 * @generated
	 * @ordered
	 */
	protected Integer ycOset = YC_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCSize() <em>XC Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XC_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXCSize() <em>XC Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xcSize = XC_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCSize() <em>YC Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YC_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYCSize() <em>YC Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCSize()
	 * @generated
	 * @ordered
	 */
	protected Integer ycSize = YC_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXFilSize() <em>XFil Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFilSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XFIL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXFilSize() <em>XFil Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXFilSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xFilSize = XFIL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYFilSize() <em>YFil Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYFilSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YFIL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYFilSize() <em>YFil Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYFilSize()
	 * @generated
	 * @ordered
	 */
	protected Integer yFilSize = YFIL_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getICP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXCOset() {
		return xcOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCOset(Integer newXCOset) {
		Integer oldXCOset = xcOset;
		xcOset = newXCOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ICP__XC_OSET, oldXCOset, xcOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYCOset() {
		return ycOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCOset(Integer newYCOset) {
		Integer oldYCOset = ycOset;
		ycOset = newYCOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ICP__YC_OSET, oldYCOset, ycOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXCSize() {
		return xcSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCSize(Integer newXCSize) {
		Integer oldXCSize = xcSize;
		xcSize = newXCSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ICP__XC_SIZE, oldXCSize, xcSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYCSize() {
		return ycSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCSize(Integer newYCSize) {
		Integer oldYCSize = ycSize;
		ycSize = newYCSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ICP__YC_SIZE, oldYCSize, ycSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXFilSize() {
		return xFilSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXFilSize(Integer newXFilSize) {
		Integer oldXFilSize = xFilSize;
		xFilSize = newXFilSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ICP__XFIL_SIZE, oldXFilSize, xFilSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYFilSize() {
		return yFilSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYFilSize(Integer newYFilSize) {
		Integer oldYFilSize = yFilSize;
		yFilSize = newYFilSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ICP__YFIL_SIZE, oldYFilSize, yFilSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.ICP__XC_OSET:
				return getXCOset();
			case AfplibPackage.ICP__YC_OSET:
				return getYCOset();
			case AfplibPackage.ICP__XC_SIZE:
				return getXCSize();
			case AfplibPackage.ICP__YC_SIZE:
				return getYCSize();
			case AfplibPackage.ICP__XFIL_SIZE:
				return getXFilSize();
			case AfplibPackage.ICP__YFIL_SIZE:
				return getYFilSize();
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
			case AfplibPackage.ICP__XC_OSET:
				setXCOset((Integer)newValue);
				return;
			case AfplibPackage.ICP__YC_OSET:
				setYCOset((Integer)newValue);
				return;
			case AfplibPackage.ICP__XC_SIZE:
				setXCSize((Integer)newValue);
				return;
			case AfplibPackage.ICP__YC_SIZE:
				setYCSize((Integer)newValue);
				return;
			case AfplibPackage.ICP__XFIL_SIZE:
				setXFilSize((Integer)newValue);
				return;
			case AfplibPackage.ICP__YFIL_SIZE:
				setYFilSize((Integer)newValue);
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
			case AfplibPackage.ICP__XC_OSET:
				setXCOset(XC_OSET_EDEFAULT);
				return;
			case AfplibPackage.ICP__YC_OSET:
				setYCOset(YC_OSET_EDEFAULT);
				return;
			case AfplibPackage.ICP__XC_SIZE:
				setXCSize(XC_SIZE_EDEFAULT);
				return;
			case AfplibPackage.ICP__YC_SIZE:
				setYCSize(YC_SIZE_EDEFAULT);
				return;
			case AfplibPackage.ICP__XFIL_SIZE:
				setXFilSize(XFIL_SIZE_EDEFAULT);
				return;
			case AfplibPackage.ICP__YFIL_SIZE:
				setYFilSize(YFIL_SIZE_EDEFAULT);
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
			case AfplibPackage.ICP__XC_OSET:
				return XC_OSET_EDEFAULT == null ? xcOset != null : !XC_OSET_EDEFAULT.equals(xcOset);
			case AfplibPackage.ICP__YC_OSET:
				return YC_OSET_EDEFAULT == null ? ycOset != null : !YC_OSET_EDEFAULT.equals(ycOset);
			case AfplibPackage.ICP__XC_SIZE:
				return XC_SIZE_EDEFAULT == null ? xcSize != null : !XC_SIZE_EDEFAULT.equals(xcSize);
			case AfplibPackage.ICP__YC_SIZE:
				return YC_SIZE_EDEFAULT == null ? ycSize != null : !YC_SIZE_EDEFAULT.equals(ycSize);
			case AfplibPackage.ICP__XFIL_SIZE:
				return XFIL_SIZE_EDEFAULT == null ? xFilSize != null : !XFIL_SIZE_EDEFAULT.equals(xFilSize);
			case AfplibPackage.ICP__YFIL_SIZE:
				return YFIL_SIZE_EDEFAULT == null ? yFilSize != null : !YFIL_SIZE_EDEFAULT.equals(yFilSize);
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
		result.append(" (XCOset: ");
		result.append(xcOset);
		result.append(", YCOset: ");
		result.append(ycOset);
		result.append(", XCSize: ");
		result.append(xcSize);
		result.append(", YCSize: ");
		result.append(ycSize);
		result.append(", XFilSize: ");
		result.append(xFilSize);
		result.append(", YFilSize: ");
		result.append(yFilSize);
		result.append(')');
		return result.toString();
	}

} //ICPImpl
