/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.AttributeValue;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.AttributeValueImpl#getReserved0 <em>Reserved0</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.AttributeValueImpl#getAttVal <em>Att Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueImpl extends TripletImpl implements AttributeValue {
	/**
	 * The default value of the '{@link #getReserved0() <em>Reserved0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved0()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved0() <em>Reserved0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved0()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved0 = RESERVED0_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttVal() <em>Att Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttVal()
	 * @generated
	 * @ordered
	 */
	protected static final String ATT_VAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttVal() <em>Att Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttVal()
	 * @generated
	 * @ordered
	 */
	protected String attVal = ATT_VAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getAttributeValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved0() {
		return reserved0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved0(Integer newReserved0) {
		Integer oldReserved0 = reserved0;
		reserved0 = newReserved0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ATTRIBUTE_VALUE__RESERVED0, oldReserved0, reserved0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttVal() {
		return attVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttVal(String newAttVal) {
		String oldAttVal = attVal;
		attVal = newAttVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ATTRIBUTE_VALUE__ATT_VAL, oldAttVal, attVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.ATTRIBUTE_VALUE__RESERVED0:
				return getReserved0();
			case AfplibPackage.ATTRIBUTE_VALUE__ATT_VAL:
				return getAttVal();
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
			case AfplibPackage.ATTRIBUTE_VALUE__RESERVED0:
				setReserved0((Integer)newValue);
				return;
			case AfplibPackage.ATTRIBUTE_VALUE__ATT_VAL:
				setAttVal((String)newValue);
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
			case AfplibPackage.ATTRIBUTE_VALUE__RESERVED0:
				setReserved0(RESERVED0_EDEFAULT);
				return;
			case AfplibPackage.ATTRIBUTE_VALUE__ATT_VAL:
				setAttVal(ATT_VAL_EDEFAULT);
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
			case AfplibPackage.ATTRIBUTE_VALUE__RESERVED0:
				return RESERVED0_EDEFAULT == null ? reserved0 != null : !RESERVED0_EDEFAULT.equals(reserved0);
			case AfplibPackage.ATTRIBUTE_VALUE__ATT_VAL:
				return ATT_VAL_EDEFAULT == null ? attVal != null : !ATT_VAL_EDEFAULT.equals(attVal);
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
		result.append(" (Reserved0: ");
		result.append(reserved0);
		result.append(", AttVal: ");
		result.append(attVal);
		result.append(')');
		return result.toString();
	}

} //AttributeValueImpl
