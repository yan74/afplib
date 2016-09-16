/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MediumOrientation;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medium Orientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MediumOrientationImpl#getMedOrient <em>Med Orient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediumOrientationImpl extends TripletImpl implements MediumOrientation {
	/**
	 * The default value of the '{@link #getMedOrient() <em>Med Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedOrient()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MED_ORIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedOrient() <em>Med Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedOrient()
	 * @generated
	 * @ordered
	 */
	protected Integer medOrient = MED_ORIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediumOrientationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMediumOrientation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMedOrient() {
		return medOrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedOrient(Integer newMedOrient) {
		Integer oldMedOrient = medOrient;
		medOrient = newMedOrient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEDIUM_ORIENTATION__MED_ORIENT, oldMedOrient, medOrient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MEDIUM_ORIENTATION__MED_ORIENT:
				return getMedOrient();
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
			case AfplibPackage.MEDIUM_ORIENTATION__MED_ORIENT:
				setMedOrient((Integer)newValue);
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
			case AfplibPackage.MEDIUM_ORIENTATION__MED_ORIENT:
				setMedOrient(MED_ORIENT_EDEFAULT);
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
			case AfplibPackage.MEDIUM_ORIENTATION__MED_ORIENT:
				return MED_ORIENT_EDEFAULT == null ? medOrient != null : !MED_ORIENT_EDEFAULT.equals(medOrient);
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
		result.append(" (MedOrient: ");
		result.append(medOrient);
		result.append(')');
		return result.toString();
	}

} //MediumOrientationImpl
