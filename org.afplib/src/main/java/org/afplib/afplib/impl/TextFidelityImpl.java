/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TextFidelity;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TextFidelityImpl#getStpTxtEx <em>Stp Txt Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TextFidelityImpl#getRepTxtEx <em>Rep Txt Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextFidelityImpl extends TripletImpl implements TextFidelity {
	/**
	 * The default value of the '{@link #getStpTxtEx() <em>Stp Txt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStpTxtEx()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STP_TXT_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStpTxtEx() <em>Stp Txt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStpTxtEx()
	 * @generated
	 * @ordered
	 */
	protected Integer stpTxtEx = STP_TXT_EX_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepTxtEx() <em>Rep Txt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepTxtEx()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REP_TXT_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepTxtEx() <em>Rep Txt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepTxtEx()
	 * @generated
	 * @ordered
	 */
	protected Integer repTxtEx = REP_TXT_EX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextFidelityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.TEXT_FIDELITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStpTxtEx() {
		return stpTxtEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStpTxtEx(Integer newStpTxtEx) {
		Integer oldStpTxtEx = stpTxtEx;
		stpTxtEx = newStpTxtEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TEXT_FIDELITY__STP_TXT_EX, oldStpTxtEx, stpTxtEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRepTxtEx() {
		return repTxtEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepTxtEx(Integer newRepTxtEx) {
		Integer oldRepTxtEx = repTxtEx;
		repTxtEx = newRepTxtEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TEXT_FIDELITY__REP_TXT_EX, oldRepTxtEx, repTxtEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.TEXT_FIDELITY__STP_TXT_EX:
				return getStpTxtEx();
			case AfplibPackage.TEXT_FIDELITY__REP_TXT_EX:
				return getRepTxtEx();
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
			case AfplibPackage.TEXT_FIDELITY__STP_TXT_EX:
				setStpTxtEx((Integer)newValue);
				return;
			case AfplibPackage.TEXT_FIDELITY__REP_TXT_EX:
				setRepTxtEx((Integer)newValue);
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
			case AfplibPackage.TEXT_FIDELITY__STP_TXT_EX:
				setStpTxtEx(STP_TXT_EX_EDEFAULT);
				return;
			case AfplibPackage.TEXT_FIDELITY__REP_TXT_EX:
				setRepTxtEx(REP_TXT_EX_EDEFAULT);
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
			case AfplibPackage.TEXT_FIDELITY__STP_TXT_EX:
				return STP_TXT_EX_EDEFAULT == null ? stpTxtEx != null : !STP_TXT_EX_EDEFAULT.equals(stpTxtEx);
			case AfplibPackage.TEXT_FIDELITY__REP_TXT_EX:
				return REP_TXT_EX_EDEFAULT == null ? repTxtEx != null : !REP_TXT_EX_EDEFAULT.equals(repTxtEx);
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
		result.append(" (StpTxtEx: ");
		result.append(stpTxtEx);
		result.append(", RepTxtEx: ");
		result.append(repTxtEx);
		result.append(')');
		return result.toString();
	}

} //TextFidelityImpl
