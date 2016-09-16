/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ExternalAlgorithmRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Algorithm RG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ExternalAlgorithmRGImpl#getDIRCTN <em>DIRCTN</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ExternalAlgorithmRGImpl#getPADBDRY <em>PADBDRY</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ExternalAlgorithmRGImpl#getPADALMT <em>PADALMT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalAlgorithmRGImpl extends TripletImpl implements ExternalAlgorithmRG {
	/**
	 * The default value of the '{@link #getDIRCTN() <em>DIRCTN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIRCTN()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIRCTN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDIRCTN() <em>DIRCTN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIRCTN()
	 * @generated
	 * @ordered
	 */
	protected Integer dirctn = DIRCTN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPADBDRY() <em>PADBDRY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPADBDRY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PADBDRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPADBDRY() <em>PADBDRY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPADBDRY()
	 * @generated
	 * @ordered
	 */
	protected Integer padbdry = PADBDRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPADALMT() <em>PADALMT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPADALMT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PADALMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPADALMT() <em>PADALMT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPADALMT()
	 * @generated
	 * @ordered
	 */
	protected Integer padalmt = PADALMT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalAlgorithmRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.EXTERNAL_ALGORITHM_RG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDIRCTN() {
		return dirctn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDIRCTN(Integer newDIRCTN) {
		Integer oldDIRCTN = dirctn;
		dirctn = newDIRCTN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.EXTERNAL_ALGORITHM_RG__DIRCTN, oldDIRCTN, dirctn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPADBDRY() {
		return padbdry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPADBDRY(Integer newPADBDRY) {
		Integer oldPADBDRY = padbdry;
		padbdry = newPADBDRY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.EXTERNAL_ALGORITHM_RG__PADBDRY, oldPADBDRY, padbdry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPADALMT() {
		return padalmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPADALMT(Integer newPADALMT) {
		Integer oldPADALMT = padalmt;
		padalmt = newPADALMT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.EXTERNAL_ALGORITHM_RG__PADALMT, oldPADALMT, padalmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__DIRCTN:
				return getDIRCTN();
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADBDRY:
				return getPADBDRY();
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADALMT:
				return getPADALMT();
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
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__DIRCTN:
				setDIRCTN((Integer)newValue);
				return;
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADBDRY:
				setPADBDRY((Integer)newValue);
				return;
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADALMT:
				setPADALMT((Integer)newValue);
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
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__DIRCTN:
				setDIRCTN(DIRCTN_EDEFAULT);
				return;
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADBDRY:
				setPADBDRY(PADBDRY_EDEFAULT);
				return;
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADALMT:
				setPADALMT(PADALMT_EDEFAULT);
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
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__DIRCTN:
				return DIRCTN_EDEFAULT == null ? dirctn != null : !DIRCTN_EDEFAULT.equals(dirctn);
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADBDRY:
				return PADBDRY_EDEFAULT == null ? padbdry != null : !PADBDRY_EDEFAULT.equals(padbdry);
			case AfplibPackage.EXTERNAL_ALGORITHM_RG__PADALMT:
				return PADALMT_EDEFAULT == null ? padalmt != null : !PADALMT_EDEFAULT.equals(padalmt);
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
		result.append(" (DIRCTN: ");
		result.append(dirctn);
		result.append(", PADBDRY: ");
		result.append(padbdry);
		result.append(", PADALMT: ");
		result.append(padalmt);
		result.append(')');
		return result.toString();
	}

} //ExternalAlgorithmRGImpl
