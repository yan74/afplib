/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ImageSize;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ImageSizeImpl#getUNITBASE <em>UNITBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageSizeImpl#getHRESOL <em>HRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageSizeImpl#getVRESOL <em>VRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageSizeImpl#getHSIZE <em>HSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageSizeImpl#getVSIZE <em>VSIZE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageSizeImpl extends TripletImpl implements ImageSize {
	/**
	 * The default value of the '{@link #getUNITBASE() <em>UNITBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNITBASE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNITBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUNITBASE() <em>UNITBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNITBASE()
	 * @generated
	 * @ordered
	 */
	protected Integer unitbase = UNITBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHRESOL() <em>HRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRESOL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HRESOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHRESOL() <em>HRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHRESOL()
	 * @generated
	 * @ordered
	 */
	protected Integer hresol = HRESOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVRESOL() <em>VRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRESOL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VRESOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVRESOL() <em>VRESOL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVRESOL()
	 * @generated
	 * @ordered
	 */
	protected Integer vresol = VRESOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHSIZE() <em>HSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHSIZE() <em>HSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHSIZE()
	 * @generated
	 * @ordered
	 */
	protected Integer hsize = HSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSIZE() <em>VSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVSIZE() <em>VSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSIZE()
	 * @generated
	 * @ordered
	 */
	protected Integer vsize = VSIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getImageSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUNITBASE() {
		return unitbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNITBASE(Integer newUNITBASE) {
		Integer oldUNITBASE = unitbase;
		unitbase = newUNITBASE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_SIZE__UNITBASE, oldUNITBASE, unitbase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHRESOL() {
		return hresol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHRESOL(Integer newHRESOL) {
		Integer oldHRESOL = hresol;
		hresol = newHRESOL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_SIZE__HRESOL, oldHRESOL, hresol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVRESOL() {
		return vresol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVRESOL(Integer newVRESOL) {
		Integer oldVRESOL = vresol;
		vresol = newVRESOL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_SIZE__VRESOL, oldVRESOL, vresol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHSIZE() {
		return hsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHSIZE(Integer newHSIZE) {
		Integer oldHSIZE = hsize;
		hsize = newHSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_SIZE__HSIZE, oldHSIZE, hsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVSIZE() {
		return vsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSIZE(Integer newVSIZE) {
		Integer oldVSIZE = vsize;
		vsize = newVSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_SIZE__VSIZE, oldVSIZE, vsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IMAGE_SIZE__UNITBASE:
				return getUNITBASE();
			case AfplibPackage.IMAGE_SIZE__HRESOL:
				return getHRESOL();
			case AfplibPackage.IMAGE_SIZE__VRESOL:
				return getVRESOL();
			case AfplibPackage.IMAGE_SIZE__HSIZE:
				return getHSIZE();
			case AfplibPackage.IMAGE_SIZE__VSIZE:
				return getVSIZE();
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
			case AfplibPackage.IMAGE_SIZE__UNITBASE:
				setUNITBASE((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_SIZE__HRESOL:
				setHRESOL((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_SIZE__VRESOL:
				setVRESOL((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_SIZE__HSIZE:
				setHSIZE((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_SIZE__VSIZE:
				setVSIZE((Integer)newValue);
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
			case AfplibPackage.IMAGE_SIZE__UNITBASE:
				setUNITBASE(UNITBASE_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_SIZE__HRESOL:
				setHRESOL(HRESOL_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_SIZE__VRESOL:
				setVRESOL(VRESOL_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_SIZE__HSIZE:
				setHSIZE(HSIZE_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_SIZE__VSIZE:
				setVSIZE(VSIZE_EDEFAULT);
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
			case AfplibPackage.IMAGE_SIZE__UNITBASE:
				return UNITBASE_EDEFAULT == null ? unitbase != null : !UNITBASE_EDEFAULT.equals(unitbase);
			case AfplibPackage.IMAGE_SIZE__HRESOL:
				return HRESOL_EDEFAULT == null ? hresol != null : !HRESOL_EDEFAULT.equals(hresol);
			case AfplibPackage.IMAGE_SIZE__VRESOL:
				return VRESOL_EDEFAULT == null ? vresol != null : !VRESOL_EDEFAULT.equals(vresol);
			case AfplibPackage.IMAGE_SIZE__HSIZE:
				return HSIZE_EDEFAULT == null ? hsize != null : !HSIZE_EDEFAULT.equals(hsize);
			case AfplibPackage.IMAGE_SIZE__VSIZE:
				return VSIZE_EDEFAULT == null ? vsize != null : !VSIZE_EDEFAULT.equals(vsize);
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
		result.append(" (UNITBASE: ");
		result.append(unitbase);
		result.append(", HRESOL: ");
		result.append(hresol);
		result.append(", VRESOL: ");
		result.append(vresol);
		result.append(", HSIZE: ");
		result.append(hsize);
		result.append(", VSIZE: ");
		result.append(vsize);
		result.append(')');
		return result.toString();
	}

} //ImageSizeImpl
