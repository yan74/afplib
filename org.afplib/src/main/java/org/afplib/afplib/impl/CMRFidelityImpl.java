/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CMRFidelity;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CMR Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CMRFidelityImpl#getStpCMREx <em>Stp CMR Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CMRFidelityImpl#getRepCMREx <em>Rep CMR Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CMRFidelityImpl extends TripletImpl implements CMRFidelity {
	/**
     * The default value of the '{@link #getStpCMREx() <em>Stp CMR Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStpCMREx()
     * @generated
     * @ordered
     */
	protected static final Integer STP_CMR_EX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStpCMREx() <em>Stp CMR Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStpCMREx()
     * @generated
     * @ordered
     */
	protected Integer stpCMREx = STP_CMR_EX_EDEFAULT;

	/**
     * The default value of the '{@link #getRepCMREx() <em>Rep CMR Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepCMREx()
     * @generated
     * @ordered
     */
	protected static final Integer REP_CMR_EX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRepCMREx() <em>Rep CMR Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepCMREx()
     * @generated
     * @ordered
     */
	protected Integer repCMREx = REP_CMR_EX_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CMRFidelityImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getCMRFidelity();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getStpCMREx() {
        return stpCMREx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStpCMREx(Integer newStpCMREx) {
        Integer oldStpCMREx = stpCMREx;
        stpCMREx = newStpCMREx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CMR_FIDELITY__STP_CMR_EX, oldStpCMREx, stpCMREx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRepCMREx() {
        return repCMREx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRepCMREx(Integer newRepCMREx) {
        Integer oldRepCMREx = repCMREx;
        repCMREx = newRepCMREx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CMR_FIDELITY__REP_CMR_EX, oldRepCMREx, repCMREx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.CMR_FIDELITY__STP_CMR_EX:
                return getStpCMREx();
            case AfplibPackage.CMR_FIDELITY__REP_CMR_EX:
                return getRepCMREx();
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
            case AfplibPackage.CMR_FIDELITY__STP_CMR_EX:
                setStpCMREx((Integer)newValue);
                return;
            case AfplibPackage.CMR_FIDELITY__REP_CMR_EX:
                setRepCMREx((Integer)newValue);
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
            case AfplibPackage.CMR_FIDELITY__STP_CMR_EX:
                setStpCMREx(STP_CMR_EX_EDEFAULT);
                return;
            case AfplibPackage.CMR_FIDELITY__REP_CMR_EX:
                setRepCMREx(REP_CMR_EX_EDEFAULT);
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
            case AfplibPackage.CMR_FIDELITY__STP_CMR_EX:
                return STP_CMR_EX_EDEFAULT == null ? stpCMREx != null : !STP_CMR_EX_EDEFAULT.equals(stpCMREx);
            case AfplibPackage.CMR_FIDELITY__REP_CMR_EX:
                return REP_CMR_EX_EDEFAULT == null ? repCMREx != null : !REP_CMR_EX_EDEFAULT.equals(repCMREx);
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
        result.append(" (StpCMREx: ");
        result.append(stpCMREx);
        result.append(", RepCMREx: ");
        result.append(repCMREx);
        result.append(')');
        return result.toString();
    }

} //CMRFidelityImpl
