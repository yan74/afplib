/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MODCAInterchangeSet;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MODCA Interchange Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MODCAInterchangeSetImpl#getIStype <em>IStype</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MODCAInterchangeSetImpl#getISid <em>ISid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MODCAInterchangeSetImpl extends TripletImpl implements MODCAInterchangeSet {
	/**
	 * The default value of the '{@link #getIStype() <em>IStype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIStype()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ISTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIStype() <em>IStype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIStype()
	 * @generated
	 * @ordered
	 */
	protected Integer iStype = ISTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getISid() <em>ISid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ISID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getISid() <em>ISid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISid()
	 * @generated
	 * @ordered
	 */
	protected Integer iSid = ISID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MODCAInterchangeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMODCAInterchangeSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIStype() {
		return iStype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIStype(Integer newIStype) {
		Integer oldIStype = iStype;
		iStype = newIStype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MODCA_INTERCHANGE_SET__ISTYPE, oldIStype, iStype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getISid() {
		return iSid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISid(Integer newISid) {
		Integer oldISid = iSid;
		iSid = newISid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MODCA_INTERCHANGE_SET__ISID, oldISid, iSid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISTYPE:
				return getIStype();
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISID:
				return getISid();
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
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISTYPE:
				setIStype((Integer)newValue);
				return;
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISID:
				setISid((Integer)newValue);
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
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISTYPE:
				setIStype(ISTYPE_EDEFAULT);
				return;
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISID:
				setISid(ISID_EDEFAULT);
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
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISTYPE:
				return ISTYPE_EDEFAULT == null ? iStype != null : !ISTYPE_EDEFAULT.equals(iStype);
			case AfplibPackage.MODCA_INTERCHANGE_SET__ISID:
				return ISID_EDEFAULT == null ? iSid != null : !ISID_EDEFAULT.equals(iSid);
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
		result.append(" (IStype: ");
		result.append(iStype);
		result.append(", ISid: ");
		result.append(iSid);
		result.append(')');
		return result.toString();
	}

} //MODCAInterchangeSetImpl
