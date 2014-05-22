/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TBM;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TBM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TBMImpl#getDIRCTION <em>DIRCTION</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TBMImpl#getPRECSION <em>PRECSION</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TBMImpl#getINCRMENT <em>INCRMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TBMImpl extends TripletImpl implements TBM {
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
	 * The default value of the '{@link #getPRECSION() <em>PRECSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRECSION()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRECSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRECSION() <em>PRECSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRECSION()
	 * @generated
	 * @ordered
	 */
	protected Integer precsion = PRECSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getINCRMENT() <em>INCRMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINCRMENT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INCRMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getINCRMENT() <em>INCRMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINCRMENT()
	 * @generated
	 * @ordered
	 */
	protected Integer incrment = INCRMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getTBM();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TBM__DIRCTION, oldDIRCTION, dirction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPRECSION() {
		return precsion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRECSION(Integer newPRECSION) {
		Integer oldPRECSION = precsion;
		precsion = newPRECSION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TBM__PRECSION, oldPRECSION, precsion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getINCRMENT() {
		return incrment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINCRMENT(Integer newINCRMENT) {
		Integer oldINCRMENT = incrment;
		incrment = newINCRMENT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TBM__INCRMENT, oldINCRMENT, incrment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.TBM__DIRCTION:
				return getDIRCTION();
			case AfplibPackage.TBM__PRECSION:
				return getPRECSION();
			case AfplibPackage.TBM__INCRMENT:
				return getINCRMENT();
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
			case AfplibPackage.TBM__DIRCTION:
				setDIRCTION((Integer)newValue);
				return;
			case AfplibPackage.TBM__PRECSION:
				setPRECSION((Integer)newValue);
				return;
			case AfplibPackage.TBM__INCRMENT:
				setINCRMENT((Integer)newValue);
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
			case AfplibPackage.TBM__DIRCTION:
				setDIRCTION(DIRCTION_EDEFAULT);
				return;
			case AfplibPackage.TBM__PRECSION:
				setPRECSION(PRECSION_EDEFAULT);
				return;
			case AfplibPackage.TBM__INCRMENT:
				setINCRMENT(INCRMENT_EDEFAULT);
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
			case AfplibPackage.TBM__DIRCTION:
				return DIRCTION_EDEFAULT == null ? dirction != null : !DIRCTION_EDEFAULT.equals(dirction);
			case AfplibPackage.TBM__PRECSION:
				return PRECSION_EDEFAULT == null ? precsion != null : !PRECSION_EDEFAULT.equals(precsion);
			case AfplibPackage.TBM__INCRMENT:
				return INCRMENT_EDEFAULT == null ? incrment != null : !INCRMENT_EDEFAULT.equals(incrment);
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
		result.append(" (DIRCTION: ");
		result.append(dirction);
		result.append(", PRECSION: ");
		result.append(precsion);
		result.append(", INCRMENT: ");
		result.append(incrment);
		result.append(')');
		return result.toString();
	}

} //TBMImpl
