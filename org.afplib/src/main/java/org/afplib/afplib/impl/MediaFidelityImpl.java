/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MediaFidelity;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MediaFidelityImpl#getStpMedEx <em>Stp Med Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MediaFidelityImpl#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediaFidelityImpl extends TripletImpl implements MediaFidelity {
	/**
	 * The default value of the '{@link #getStpMedEx() <em>Stp Med Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStpMedEx()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STP_MED_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStpMedEx() <em>Stp Med Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStpMedEx()
	 * @generated
	 * @ordered
	 */
	protected Integer stpMedEx = STP_MED_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaFidelityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMediaFidelity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStpMedEx() {
		return stpMedEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStpMedEx(Integer newStpMedEx) {
		Integer oldStpMedEx = stpMedEx;
		stpMedEx = newStpMedEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEDIA_FIDELITY__STP_MED_EX, oldStpMedEx, stpMedEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(byte[] newReserved) {
		byte[] oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEDIA_FIDELITY__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MEDIA_FIDELITY__STP_MED_EX:
				return getStpMedEx();
			case AfplibPackage.MEDIA_FIDELITY__RESERVED:
				return getReserved();
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
			case AfplibPackage.MEDIA_FIDELITY__STP_MED_EX:
				setStpMedEx((Integer)newValue);
				return;
			case AfplibPackage.MEDIA_FIDELITY__RESERVED:
				setReserved((byte[])newValue);
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
			case AfplibPackage.MEDIA_FIDELITY__STP_MED_EX:
				setStpMedEx(STP_MED_EX_EDEFAULT);
				return;
			case AfplibPackage.MEDIA_FIDELITY__RESERVED:
				setReserved(RESERVED_EDEFAULT);
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
			case AfplibPackage.MEDIA_FIDELITY__STP_MED_EX:
				return STP_MED_EX_EDEFAULT == null ? stpMedEx != null : !STP_MED_EX_EDEFAULT.equals(stpMedEx);
			case AfplibPackage.MEDIA_FIDELITY__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
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
		result.append(" (StpMedEx: ");
		result.append(stpMedEx);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(')');
		return result.toString();
	}

} //MediaFidelityImpl
