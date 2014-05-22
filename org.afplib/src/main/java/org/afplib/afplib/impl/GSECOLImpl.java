/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GSECOL;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSECOL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GSECOLImpl#getCOLOR <em>COLOR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSECOLImpl extends TripletImpl implements GSECOL {
	/**
	 * The default value of the '{@link #getCOLOR() <em>COLOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOLOR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOLOR() <em>COLOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOLOR()
	 * @generated
	 * @ordered
	 */
	protected Integer color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSECOLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGSECOL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCOLOR() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOLOR(Integer newCOLOR) {
		Integer oldCOLOR = color;
		color = newCOLOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSECOL__COLOR, oldCOLOR, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GSECOL__COLOR:
				return getCOLOR();
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
			case AfplibPackage.GSECOL__COLOR:
				setCOLOR((Integer)newValue);
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
			case AfplibPackage.GSECOL__COLOR:
				setCOLOR(COLOR_EDEFAULT);
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
			case AfplibPackage.GSECOL__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
		result.append(" (COLOR: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //GSECOLImpl
