/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IOCAFunctionSetIdentification;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IOCA Function Set Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IOCAFunctionSetIdentificationImpl#getCATEGORY <em>CATEGORY</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IOCAFunctionSetIdentificationImpl#getFCNSET <em>FCNSET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOCAFunctionSetIdentificationImpl extends TripletImpl implements IOCAFunctionSetIdentification {
	/**
	 * The default value of the '{@link #getCATEGORY() <em>CATEGORY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCATEGORY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCATEGORY() <em>CATEGORY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCATEGORY()
	 * @generated
	 * @ordered
	 */
	protected Integer category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFCNSET() <em>FCNSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCNSET()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FCNSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCNSET() <em>FCNSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCNSET()
	 * @generated
	 * @ordered
	 */
	protected Integer fcnset = FCNSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOCAFunctionSetIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIOCAFunctionSetIdentification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCATEGORY() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCATEGORY(Integer newCATEGORY) {
		Integer oldCATEGORY = category;
		category = newCATEGORY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__CATEGORY, oldCATEGORY, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFCNSET() {
		return fcnset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFCNSET(Integer newFCNSET) {
		Integer oldFCNSET = fcnset;
		fcnset = newFCNSET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__FCNSET, oldFCNSET, fcnset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__CATEGORY:
				return getCATEGORY();
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__FCNSET:
				return getFCNSET();
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
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__CATEGORY:
				setCATEGORY((Integer)newValue);
				return;
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__FCNSET:
				setFCNSET((Integer)newValue);
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
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__CATEGORY:
				setCATEGORY(CATEGORY_EDEFAULT);
				return;
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__FCNSET:
				setFCNSET(FCNSET_EDEFAULT);
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
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case AfplibPackage.IOCA_FUNCTION_SET_IDENTIFICATION__FCNSET:
				return FCNSET_EDEFAULT == null ? fcnset != null : !FCNSET_EDEFAULT.equals(fcnset);
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
		result.append(" (CATEGORY: ");
		result.append(category);
		result.append(", FCNSET: ");
		result.append(fcnset);
		result.append(')');
		return result.toString();
	}

} //IOCAFunctionSetIdentificationImpl
