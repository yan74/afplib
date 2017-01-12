/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ResourceObjectType;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectTypeImpl#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectTypeImpl#getConData <em>Con Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceObjectTypeImpl extends TripletImpl implements ResourceObjectType {
	/**
	 * The default value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OBJ_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjType()
	 * @generated
	 * @ordered
	 */
	protected Integer objType = OBJ_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConData() <em>Con Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CON_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConData() <em>Con Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData()
	 * @generated
	 * @ordered
	 */
	protected byte[] conData = CON_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.RESOURCE_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getObjType() {
		return objType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjType(Integer newObjType) {
		Integer oldObjType = objType;
		objType = newObjType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE, oldObjType, objType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getConData() {
		return conData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConData(byte[] newConData) {
		byte[] oldConData = conData;
		conData = newConData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA, oldConData, conData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE:
				return getObjType();
			case AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA:
				return getConData();
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
			case AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE:
				setObjType((Integer)newValue);
				return;
			case AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA:
				setConData((byte[])newValue);
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
			case AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE:
				setObjType(OBJ_TYPE_EDEFAULT);
				return;
			case AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA:
				setConData(CON_DATA_EDEFAULT);
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
			case AfplibPackage.RESOURCE_OBJECT_TYPE__OBJ_TYPE:
				return OBJ_TYPE_EDEFAULT == null ? objType != null : !OBJ_TYPE_EDEFAULT.equals(objType);
			case AfplibPackage.RESOURCE_OBJECT_TYPE__CON_DATA:
				return CON_DATA_EDEFAULT == null ? conData != null : !CON_DATA_EDEFAULT.equals(conData);
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
		result.append(" (ObjType: ");
		result.append(objType);
		result.append(", ConData: ");
		result.append(conData);
		result.append(')');
		return result.toString();
	}

} //ResourceObjectTypeImpl
