/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MediaEjectControl;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Media Eject Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MediaEjectControlImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MediaEjectControlImpl#getEjCtrl <em>Ej Ctrl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediaEjectControlImpl extends TripletImpl implements MediaEjectControl {
	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getEjCtrl() <em>Ej Ctrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjCtrl()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EJ_CTRL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEjCtrl() <em>Ej Ctrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEjCtrl()
	 * @generated
	 * @ordered
	 */
	protected Integer ejCtrl = EJ_CTRL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediaEjectControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMediaEjectControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Integer newReserved) {
		Integer oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEDIA_EJECT_CONTROL__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEjCtrl() {
		return ejCtrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjCtrl(Integer newEjCtrl) {
		Integer oldEjCtrl = ejCtrl;
		ejCtrl = newEjCtrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEDIA_EJECT_CONTROL__EJ_CTRL, oldEjCtrl, ejCtrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MEDIA_EJECT_CONTROL__RESERVED:
				return getReserved();
			case AfplibPackage.MEDIA_EJECT_CONTROL__EJ_CTRL:
				return getEjCtrl();
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
			case AfplibPackage.MEDIA_EJECT_CONTROL__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.MEDIA_EJECT_CONTROL__EJ_CTRL:
				setEjCtrl((Integer)newValue);
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
			case AfplibPackage.MEDIA_EJECT_CONTROL__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.MEDIA_EJECT_CONTROL__EJ_CTRL:
				setEjCtrl(EJ_CTRL_EDEFAULT);
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
			case AfplibPackage.MEDIA_EJECT_CONTROL__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.MEDIA_EJECT_CONTROL__EJ_CTRL:
				return EJ_CTRL_EDEFAULT == null ? ejCtrl != null : !EJ_CTRL_EDEFAULT.equals(ejCtrl);
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
		result.append(" (Reserved: ");
		result.append(reserved);
		result.append(", EjCtrl: ");
		result.append(ejCtrl);
		result.append(')');
		return result.toString();
	}

} //MediaEjectControlImpl
