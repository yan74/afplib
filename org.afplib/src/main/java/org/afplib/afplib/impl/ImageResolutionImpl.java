/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ImageResolution;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ImageResolutionImpl#getXBase <em>XBase</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageResolutionImpl#getYBase <em>YBase</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageResolutionImpl#getXResol <em>XResol</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageResolutionImpl#getYResol <em>YResol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageResolutionImpl extends TripletImpl implements ImageResolution {
	/**
	 * The default value of the '{@link #getXBase() <em>XBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXBase() <em>XBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xBase = XBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYBase() <em>YBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYBase() <em>YBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBase()
	 * @generated
	 * @ordered
	 */
	protected Integer yBase = YBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXResol() <em>XResol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXResol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XRESOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXResol() <em>XResol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXResol()
	 * @generated
	 * @ordered
	 */
	protected Integer xResol = XRESOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYResol() <em>YResol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYResol()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YRESOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYResol() <em>YResol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYResol()
	 * @generated
	 * @ordered
	 */
	protected Integer yResol = YRESOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.IMAGE_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXBase() {
		return xBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXBase(Integer newXBase) {
		Integer oldXBase = xBase;
		xBase = newXBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_RESOLUTION__XBASE, oldXBase, xBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYBase() {
		return yBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYBase(Integer newYBase) {
		Integer oldYBase = yBase;
		yBase = newYBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_RESOLUTION__YBASE, oldYBase, yBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXResol() {
		return xResol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXResol(Integer newXResol) {
		Integer oldXResol = xResol;
		xResol = newXResol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_RESOLUTION__XRESOL, oldXResol, xResol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYResol() {
		return yResol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYResol(Integer newYResol) {
		Integer oldYResol = yResol;
		yResol = newYResol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_RESOLUTION__YRESOL, oldYResol, yResol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IMAGE_RESOLUTION__XBASE:
				return getXBase();
			case AfplibPackage.IMAGE_RESOLUTION__YBASE:
				return getYBase();
			case AfplibPackage.IMAGE_RESOLUTION__XRESOL:
				return getXResol();
			case AfplibPackage.IMAGE_RESOLUTION__YRESOL:
				return getYResol();
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
			case AfplibPackage.IMAGE_RESOLUTION__XBASE:
				setXBase((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_RESOLUTION__YBASE:
				setYBase((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_RESOLUTION__XRESOL:
				setXResol((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_RESOLUTION__YRESOL:
				setYResol((Integer)newValue);
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
			case AfplibPackage.IMAGE_RESOLUTION__XBASE:
				setXBase(XBASE_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_RESOLUTION__YBASE:
				setYBase(YBASE_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_RESOLUTION__XRESOL:
				setXResol(XRESOL_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_RESOLUTION__YRESOL:
				setYResol(YRESOL_EDEFAULT);
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
			case AfplibPackage.IMAGE_RESOLUTION__XBASE:
				return XBASE_EDEFAULT == null ? xBase != null : !XBASE_EDEFAULT.equals(xBase);
			case AfplibPackage.IMAGE_RESOLUTION__YBASE:
				return YBASE_EDEFAULT == null ? yBase != null : !YBASE_EDEFAULT.equals(yBase);
			case AfplibPackage.IMAGE_RESOLUTION__XRESOL:
				return XRESOL_EDEFAULT == null ? xResol != null : !XRESOL_EDEFAULT.equals(xResol);
			case AfplibPackage.IMAGE_RESOLUTION__YRESOL:
				return YRESOL_EDEFAULT == null ? yResol != null : !YRESOL_EDEFAULT.equals(yResol);
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
		result.append(" (XBase: ");
		result.append(xBase);
		result.append(", YBase: ");
		result.append(yBase);
		result.append(", XResol: ");
		result.append(xResol);
		result.append(", YResol: ");
		result.append(yResol);
		result.append(')');
		return result.toString();
	}

} //ImageResolutionImpl
