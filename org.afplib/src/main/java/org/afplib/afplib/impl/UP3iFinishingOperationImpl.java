/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.UP3iFinishingOperation;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UP 3i Finishing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.UP3iFinishingOperationImpl#getSeqnum <em>Seqnum</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.UP3iFinishingOperationImpl#getUP3iDat <em>UP 3i Dat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UP3iFinishingOperationImpl extends TripletImpl implements UP3iFinishingOperation {
	/**
	 * The default value of the '{@link #getSeqnum() <em>Seqnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqnum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEQNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeqnum() <em>Seqnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqnum()
	 * @generated
	 * @ordered
	 */
	protected Integer seqnum = SEQNUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getUP3iDat() <em>UP 3i Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUP3iDat()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] UP_3I_DAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUP3iDat() <em>UP 3i Dat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUP3iDat()
	 * @generated
	 * @ordered
	 */
	protected byte[] up3iDat = UP_3I_DAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UP3iFinishingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getUP3iFinishingOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSeqnum() {
		return seqnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqnum(Integer newSeqnum) {
		Integer oldSeqnum = seqnum;
		seqnum = newSeqnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UP_3I_FINISHING_OPERATION__SEQNUM, oldSeqnum, seqnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getUP3iDat() {
		return up3iDat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUP3iDat(byte[] newUP3iDat) {
		byte[] oldUP3iDat = up3iDat;
		up3iDat = newUP3iDat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT, oldUP3iDat, up3iDat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
				return getSeqnum();
			case AfplibPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
				return getUP3iDat();
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
			case AfplibPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
				setSeqnum((Integer)newValue);
				return;
			case AfplibPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
				setUP3iDat((byte[])newValue);
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
			case AfplibPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
				setSeqnum(SEQNUM_EDEFAULT);
				return;
			case AfplibPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
				setUP3iDat(UP_3I_DAT_EDEFAULT);
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
			case AfplibPackage.UP_3I_FINISHING_OPERATION__SEQNUM:
				return SEQNUM_EDEFAULT == null ? seqnum != null : !SEQNUM_EDEFAULT.equals(seqnum);
			case AfplibPackage.UP_3I_FINISHING_OPERATION__UP_3I_DAT:
				return UP_3I_DAT_EDEFAULT == null ? up3iDat != null : !UP_3I_DAT_EDEFAULT.equals(up3iDat);
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
		result.append(" (Seqnum: ");
		result.append(seqnum);
		result.append(", UP3iDat: ");
		result.append(up3iDat);
		result.append(')');
		return result.toString();
	}

} //UP3iFinishingOperationImpl
