/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.LineDataObjectPositionMigration;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Data Object Position Migration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.LineDataObjectPositionMigrationImpl#getTempOrient <em>Temp Orient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineDataObjectPositionMigrationImpl extends TripletImpl implements LineDataObjectPositionMigration {
	/**
	 * The default value of the '{@link #getTempOrient() <em>Temp Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempOrient()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEMP_ORIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTempOrient() <em>Temp Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempOrient()
	 * @generated
	 * @ordered
	 */
	protected Integer tempOrient = TEMP_ORIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineDataObjectPositionMigrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.LINE_DATA_OBJECT_POSITION_MIGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTempOrient() {
		return tempOrient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempOrient(Integer newTempOrient) {
		Integer oldTempOrient = tempOrient;
		tempOrient = newTempOrient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION__TEMP_ORIENT, oldTempOrient, tempOrient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION__TEMP_ORIENT:
				return getTempOrient();
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
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION__TEMP_ORIENT:
				setTempOrient((Integer)newValue);
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
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION__TEMP_ORIENT:
				setTempOrient(TEMP_ORIENT_EDEFAULT);
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
			case AfplibPackage.LINE_DATA_OBJECT_POSITION_MIGRATION__TEMP_ORIENT:
				return TEMP_ORIENT_EDEFAULT == null ? tempOrient != null : !TEMP_ORIENT_EDEFAULT.equals(tempOrient);
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
		result.append(" (TempOrient: ");
		result.append(tempOrient);
		result.append(')');
		return result.toString();
	}

} //LineDataObjectPositionMigrationImpl
