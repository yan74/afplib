/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FontFidelity;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FontFidelityImpl#getStpFntEx <em>Stp Fnt Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontFidelityImpl extends TripletImpl implements FontFidelity {
	/**
	 * The default value of the '{@link #getStpFntEx() <em>Stp Fnt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStpFntEx()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STP_FNT_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStpFntEx() <em>Stp Fnt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStpFntEx()
	 * @generated
	 * @ordered
	 */
	protected Integer stpFntEx = STP_FNT_EX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontFidelityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFontFidelity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStpFntEx() {
		return stpFntEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStpFntEx(Integer newStpFntEx) {
		Integer oldStpFntEx = stpFntEx;
		stpFntEx = newStpFntEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_FIDELITY__STP_FNT_EX, oldStpFntEx, stpFntEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FONT_FIDELITY__STP_FNT_EX:
				return getStpFntEx();
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
			case AfplibPackage.FONT_FIDELITY__STP_FNT_EX:
				setStpFntEx((Integer)newValue);
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
			case AfplibPackage.FONT_FIDELITY__STP_FNT_EX:
				setStpFntEx(STP_FNT_EX_EDEFAULT);
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
			case AfplibPackage.FONT_FIDELITY__STP_FNT_EX:
				return STP_FNT_EX_EDEFAULT == null ? stpFntEx != null : !STP_FNT_EX_EDEFAULT.equals(stpFntEx);
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
		result.append(" (StpFntEx: ");
		result.append(stpFntEx);
		result.append(')');
		return result.toString();
	}

} //FontFidelityImpl
