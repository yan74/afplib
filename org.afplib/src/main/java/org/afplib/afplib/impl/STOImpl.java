/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.STO;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.STOImpl#getIORNTION <em>IORNTION</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.STOImpl#getBORNTION <em>BORNTION</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STOImpl extends TripletImpl implements STO {
	/**
	 * The default value of the '{@link #getIORNTION() <em>IORNTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIORNTION()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IORNTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIORNTION() <em>IORNTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIORNTION()
	 * @generated
	 * @ordered
	 */
	protected Integer iorntion = IORNTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBORNTION() <em>BORNTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBORNTION()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BORNTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBORNTION() <em>BORNTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBORNTION()
	 * @generated
	 * @ordered
	 */
	protected Integer borntion = BORNTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getSTO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIORNTION() {
		return iorntion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIORNTION(Integer newIORNTION) {
		Integer oldIORNTION = iorntion;
		iorntion = newIORNTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.STO__IORNTION, oldIORNTION, iorntion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBORNTION() {
		return borntion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBORNTION(Integer newBORNTION) {
		Integer oldBORNTION = borntion;
		borntion = newBORNTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.STO__BORNTION, oldBORNTION, borntion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.STO__IORNTION:
				return getIORNTION();
			case AfplibPackage.STO__BORNTION:
				return getBORNTION();
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
			case AfplibPackage.STO__IORNTION:
				setIORNTION((Integer)newValue);
				return;
			case AfplibPackage.STO__BORNTION:
				setBORNTION((Integer)newValue);
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
			case AfplibPackage.STO__IORNTION:
				setIORNTION(IORNTION_EDEFAULT);
				return;
			case AfplibPackage.STO__BORNTION:
				setBORNTION(BORNTION_EDEFAULT);
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
			case AfplibPackage.STO__IORNTION:
				return IORNTION_EDEFAULT == null ? iorntion != null : !IORNTION_EDEFAULT.equals(iorntion);
			case AfplibPackage.STO__BORNTION:
				return BORNTION_EDEFAULT == null ? borntion != null : !BORNTION_EDEFAULT.equals(borntion);
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
		result.append(" (IORNTION: ");
		result.append(iorntion);
		result.append(", BORNTION: ");
		result.append(borntion);
		result.append(')');
		return result.toString();
	}

} //STOImpl
