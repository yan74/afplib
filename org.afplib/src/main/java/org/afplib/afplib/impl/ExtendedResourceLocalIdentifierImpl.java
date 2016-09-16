/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ExtendedResourceLocalIdentifier;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Resource Local Identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ExtendedResourceLocalIdentifierImpl#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ExtendedResourceLocalIdentifierImpl#getResLID <em>Res LID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendedResourceLocalIdentifierImpl extends TripletImpl implements ExtendedResourceLocalIdentifier {
	/**
	 * The default value of the '{@link #getResType() <em>Res Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResType() <em>Res Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResType()
	 * @generated
	 * @ordered
	 */
	protected Integer resType = RES_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResLID() <em>Res LID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResLID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_LID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResLID() <em>Res LID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResLID()
	 * @generated
	 * @ordered
	 */
	protected Integer resLID = RES_LID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedResourceLocalIdentifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.EXTENDED_RESOURCE_LOCAL_IDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getResType() {
		return resType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResType(Integer newResType) {
		Integer oldResType = resType;
		resType = newResType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_TYPE, oldResType, resType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getResLID() {
		return resLID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResLID(Integer newResLID) {
		Integer oldResLID = resLID;
		resLID = newResLID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_LID, oldResLID, resLID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_TYPE:
				return getResType();
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_LID:
				return getResLID();
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
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_TYPE:
				setResType((Integer)newValue);
				return;
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_LID:
				setResLID((Integer)newValue);
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
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_TYPE:
				setResType(RES_TYPE_EDEFAULT);
				return;
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_LID:
				setResLID(RES_LID_EDEFAULT);
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
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_TYPE:
				return RES_TYPE_EDEFAULT == null ? resType != null : !RES_TYPE_EDEFAULT.equals(resType);
			case AfplibPackage.EXTENDED_RESOURCE_LOCAL_IDENTIFIER__RES_LID:
				return RES_LID_EDEFAULT == null ? resLID != null : !RES_LID_EDEFAULT.equals(resLID);
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
		result.append(" (ResType: ");
		result.append(resType);
		result.append(", ResLID: ");
		result.append(resLID);
		result.append(')');
		return result.toString();
	}

} //ExtendedResourceLocalIdentifierImpl
