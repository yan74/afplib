/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.DescriptorPosition;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptor Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.DescriptorPositionImpl#getDesPosID <em>Des Pos ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptorPositionImpl extends TripletImpl implements DescriptorPosition {
	/**
	 * The default value of the '{@link #getDesPosID() <em>Des Pos ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesPosID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DES_POS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesPosID() <em>Des Pos ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesPosID()
	 * @generated
	 * @ordered
	 */
	protected Integer desPosID = DES_POS_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.DESCRIPTOR_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDesPosID() {
		return desPosID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesPosID(Integer newDesPosID) {
		Integer oldDesPosID = desPosID;
		desPosID = newDesPosID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID, oldDesPosID, desPosID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID:
				return getDesPosID();
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
			case AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID:
				setDesPosID((Integer)newValue);
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
			case AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID:
				setDesPosID(DES_POS_ID_EDEFAULT);
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
			case AfplibPackage.DESCRIPTOR_POSITION__DES_POS_ID:
				return DES_POS_ID_EDEFAULT == null ? desPosID != null : !DES_POS_ID_EDEFAULT.equals(desPosID);
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
		result.append(" (DesPosID: ");
		result.append(desPosID);
		result.append(')');
		return result.toString();
	}

} //DescriptorPositionImpl
