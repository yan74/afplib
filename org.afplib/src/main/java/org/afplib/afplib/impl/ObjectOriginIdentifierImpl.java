/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectOriginIdentifier;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Origin Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectOriginIdentifierImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectOriginIdentifierImpl#getSysID <em>Sys ID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectOriginIdentifierImpl#getMedID <em>Med ID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectOriginIdentifierImpl#getDSID <em>DSID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectOriginIdentifierImpl extends TripletImpl implements ObjectOriginIdentifier {
	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Integer system = SYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSysID() <em>Sys ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysID()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] SYS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSysID() <em>Sys ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysID()
	 * @generated
	 * @ordered
	 */
	protected byte[] sysID = SYS_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedID() <em>Med ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedID()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] MED_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedID() <em>Med ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedID()
	 * @generated
	 * @ordered
	 */
	protected byte[] medID = MED_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDSID() <em>DSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSID()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDSID() <em>DSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSID()
	 * @generated
	 * @ordered
	 */
	protected byte[] dsid = DSID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectOriginIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.OBJECT_ORIGIN_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Integer newSystem) {
		Integer oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSysID() {
		return sysID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSysID(byte[] newSysID) {
		byte[] oldSysID = sysID;
		sysID = newSysID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYS_ID, oldSysID, sysID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getMedID() {
		return medID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedID(byte[] newMedID) {
		byte[] oldMedID = medID;
		medID = newMedID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__MED_ID, oldMedID, medID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getDSID() {
		return dsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSID(byte[] newDSID) {
		byte[] oldDSID = dsid;
		dsid = newDSID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__DSID, oldDSID, dsid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYSTEM:
				return getSystem();
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYS_ID:
				return getSysID();
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__MED_ID:
				return getMedID();
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__DSID:
				return getDSID();
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
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYSTEM:
				setSystem((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYS_ID:
				setSysID((byte[])newValue);
				return;
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__MED_ID:
				setMedID((byte[])newValue);
				return;
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__DSID:
				setDSID((byte[])newValue);
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
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYS_ID:
				setSysID(SYS_ID_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__MED_ID:
				setMedID(MED_ID_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__DSID:
				setDSID(DSID_EDEFAULT);
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
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYSTEM:
				return SYSTEM_EDEFAULT == null ? system != null : !SYSTEM_EDEFAULT.equals(system);
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__SYS_ID:
				return SYS_ID_EDEFAULT == null ? sysID != null : !SYS_ID_EDEFAULT.equals(sysID);
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__MED_ID:
				return MED_ID_EDEFAULT == null ? medID != null : !MED_ID_EDEFAULT.equals(medID);
			case AfplibPackage.OBJECT_ORIGIN_IDENTIFIER__DSID:
				return DSID_EDEFAULT == null ? dsid != null : !DSID_EDEFAULT.equals(dsid);
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
		result.append(" (System: ");
		result.append(system);
		result.append(", SysID: ");
		result.append(sysID);
		result.append(", MedID: ");
		result.append(medID);
		result.append(", DSID: ");
		result.append(dsid);
		result.append(')');
		return result.toString();
	}

} //ObjectOriginIdentifierImpl
