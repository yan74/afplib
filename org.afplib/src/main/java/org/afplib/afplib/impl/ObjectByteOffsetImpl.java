/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectByteOffset;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Byte Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectByteOffsetImpl#getDirByOff <em>Dir By Off</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectByteOffsetImpl#getDirByHi <em>Dir By Hi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectByteOffsetImpl extends TripletImpl implements ObjectByteOffset {
	/**
	 * The default value of the '{@link #getDirByOff() <em>Dir By Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirByOff()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIR_BY_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirByOff() <em>Dir By Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirByOff()
	 * @generated
	 * @ordered
	 */
	protected Integer dirByOff = DIR_BY_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirByHi() <em>Dir By Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirByHi()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIR_BY_HI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirByHi() <em>Dir By Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirByHi()
	 * @generated
	 * @ordered
	 */
	protected Integer dirByHi = DIR_BY_HI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectByteOffsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getObjectByteOffset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDirByOff() {
		return dirByOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirByOff(Integer newDirByOff) {
		Integer oldDirByOff = dirByOff;
		dirByOff = newDirByOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_OFF, oldDirByOff, dirByOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDirByHi() {
		return dirByHi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirByHi(Integer newDirByHi) {
		Integer oldDirByHi = dirByHi;
		dirByHi = newDirByHi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_HI, oldDirByHi, dirByHi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_OFF:
				return getDirByOff();
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_HI:
				return getDirByHi();
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
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_OFF:
				setDirByOff((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_HI:
				setDirByHi((Integer)newValue);
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
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_OFF:
				setDirByOff(DIR_BY_OFF_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_HI:
				setDirByHi(DIR_BY_HI_EDEFAULT);
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
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_OFF:
				return DIR_BY_OFF_EDEFAULT == null ? dirByOff != null : !DIR_BY_OFF_EDEFAULT.equals(dirByOff);
			case AfplibPackage.OBJECT_BYTE_OFFSET__DIR_BY_HI:
				return DIR_BY_HI_EDEFAULT == null ? dirByHi != null : !DIR_BY_HI_EDEFAULT.equals(dirByHi);
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
		result.append(" (DirByOff: ");
		result.append(dirByOff);
		result.append(", DirByHi: ");
		result.append(dirByHi);
		result.append(')');
		return result.toString();
	}

} //ObjectByteOffsetImpl
