/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MeasurementUnits;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement Units</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MeasurementUnitsImpl#getXoaBase <em>Xoa Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MeasurementUnitsImpl#getYoaBase <em>Yoa Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MeasurementUnitsImpl#getXoaUnits <em>Xoa Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MeasurementUnitsImpl#getYoaUnits <em>Yoa Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementUnitsImpl extends TripletImpl implements MeasurementUnits {
	/**
	 * The default value of the '{@link #getXoaBase() <em>Xoa Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOA_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXoaBase() <em>Xoa Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xoaBase = XOA_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoaBase() <em>Yoa Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOA_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoaBase() <em>Yoa Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaBase()
	 * @generated
	 * @ordered
	 */
	protected Integer yoaBase = YOA_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXoaUnits() <em>Xoa Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOA_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXoaUnits() <em>Xoa Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xoaUnits = XOA_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoaUnits() <em>Yoa Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOA_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoaUnits() <em>Yoa Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer yoaUnits = YOA_UNITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementUnitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMeasurementUnits();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXoaBase() {
		return xoaBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoaBase(Integer newXoaBase) {
		Integer oldXoaBase = xoaBase;
		xoaBase = newXoaBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEASUREMENT_UNITS__XOA_BASE, oldXoaBase, xoaBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYoaBase() {
		return yoaBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoaBase(Integer newYoaBase) {
		Integer oldYoaBase = yoaBase;
		yoaBase = newYoaBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEASUREMENT_UNITS__YOA_BASE, oldYoaBase, yoaBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXoaUnits() {
		return xoaUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoaUnits(Integer newXoaUnits) {
		Integer oldXoaUnits = xoaUnits;
		xoaUnits = newXoaUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS, oldXoaUnits, xoaUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYoaUnits() {
		return yoaUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoaUnits(Integer newYoaUnits) {
		Integer oldYoaUnits = yoaUnits;
		yoaUnits = newYoaUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS, oldYoaUnits, yoaUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MEASUREMENT_UNITS__XOA_BASE:
				return getXoaBase();
			case AfplibPackage.MEASUREMENT_UNITS__YOA_BASE:
				return getYoaBase();
			case AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS:
				return getXoaUnits();
			case AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS:
				return getYoaUnits();
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
			case AfplibPackage.MEASUREMENT_UNITS__XOA_BASE:
				setXoaBase((Integer)newValue);
				return;
			case AfplibPackage.MEASUREMENT_UNITS__YOA_BASE:
				setYoaBase((Integer)newValue);
				return;
			case AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS:
				setXoaUnits((Integer)newValue);
				return;
			case AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS:
				setYoaUnits((Integer)newValue);
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
			case AfplibPackage.MEASUREMENT_UNITS__XOA_BASE:
				setXoaBase(XOA_BASE_EDEFAULT);
				return;
			case AfplibPackage.MEASUREMENT_UNITS__YOA_BASE:
				setYoaBase(YOA_BASE_EDEFAULT);
				return;
			case AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS:
				setXoaUnits(XOA_UNITS_EDEFAULT);
				return;
			case AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS:
				setYoaUnits(YOA_UNITS_EDEFAULT);
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
			case AfplibPackage.MEASUREMENT_UNITS__XOA_BASE:
				return XOA_BASE_EDEFAULT == null ? xoaBase != null : !XOA_BASE_EDEFAULT.equals(xoaBase);
			case AfplibPackage.MEASUREMENT_UNITS__YOA_BASE:
				return YOA_BASE_EDEFAULT == null ? yoaBase != null : !YOA_BASE_EDEFAULT.equals(yoaBase);
			case AfplibPackage.MEASUREMENT_UNITS__XOA_UNITS:
				return XOA_UNITS_EDEFAULT == null ? xoaUnits != null : !XOA_UNITS_EDEFAULT.equals(xoaUnits);
			case AfplibPackage.MEASUREMENT_UNITS__YOA_UNITS:
				return YOA_UNITS_EDEFAULT == null ? yoaUnits != null : !YOA_UNITS_EDEFAULT.equals(yoaUnits);
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
		result.append(" (XoaBase: ");
		result.append(xoaBase);
		result.append(", YoaBase: ");
		result.append(yoaBase);
		result.append(", XoaUnits: ");
		result.append(xoaUnits);
		result.append(", YoaUnits: ");
		result.append(yoaUnits);
		result.append(')');
		return result.toString();
	}

} //MeasurementUnitsImpl
