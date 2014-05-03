/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.SIA;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.SIAImpl#getADJSTMNT <em>ADJSTMNT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SIAImpl#getDIRCTION <em>DIRCTION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SIAImpl extends TripletImpl implements SIA {
	/**
	 * The default value of the '{@link #getADJSTMNT() <em>ADJSTMNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADJSTMNT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADJSTMNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getADJSTMNT() <em>ADJSTMNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getADJSTMNT()
	 * @generated
	 * @ordered
	 */
	protected Integer adjstmnt = ADJSTMNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDIRCTION() <em>DIRCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIRCTION()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDIRCTION() <em>DIRCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIRCTION()
	 * @generated
	 * @ordered
	 */
	protected Integer dirction = DIRCTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SIAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getSIA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getADJSTMNT() {
		return adjstmnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setADJSTMNT(Integer newADJSTMNT) {
		Integer oldADJSTMNT = adjstmnt;
		adjstmnt = newADJSTMNT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SIA__ADJSTMNT, oldADJSTMNT, adjstmnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDIRCTION() {
		return dirction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDIRCTION(Integer newDIRCTION) {
		Integer oldDIRCTION = dirction;
		dirction = newDIRCTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SIA__DIRCTION, oldDIRCTION, dirction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.SIA__ADJSTMNT:
				return getADJSTMNT();
			case AfplibPackage.SIA__DIRCTION:
				return getDIRCTION();
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
			case AfplibPackage.SIA__ADJSTMNT:
				setADJSTMNT((Integer)newValue);
				return;
			case AfplibPackage.SIA__DIRCTION:
				setDIRCTION((Integer)newValue);
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
			case AfplibPackage.SIA__ADJSTMNT:
				setADJSTMNT(ADJSTMNT_EDEFAULT);
				return;
			case AfplibPackage.SIA__DIRCTION:
				setDIRCTION(DIRCTION_EDEFAULT);
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
			case AfplibPackage.SIA__ADJSTMNT:
				return ADJSTMNT_EDEFAULT == null ? adjstmnt != null : !ADJSTMNT_EDEFAULT.equals(adjstmnt);
			case AfplibPackage.SIA__DIRCTION:
				return DIRCTION_EDEFAULT == null ? dirction != null : !DIRCTION_EDEFAULT.equals(dirction);
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
		result.append(" (ADJSTMNT: ");
		result.append(adjstmnt);
		result.append(", DIRCTION: ");
		result.append(dirction);
		result.append(')');
		return result.toString();
	}

} //SIAImpl
