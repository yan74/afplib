/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FinishingFidelity;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finishing Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FinishingFidelityImpl#getStpFinEx <em>Stp Fin Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FinishingFidelityImpl#getRepFinEx <em>Rep Fin Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinishingFidelityImpl extends TripletImpl implements FinishingFidelity {
	/**
     * The default value of the '{@link #getStpFinEx() <em>Stp Fin Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStpFinEx()
     * @generated
     * @ordered
     */
	protected static final Integer STP_FIN_EX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStpFinEx() <em>Stp Fin Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStpFinEx()
     * @generated
     * @ordered
     */
	protected Integer stpFinEx = STP_FIN_EX_EDEFAULT;

	/**
     * The default value of the '{@link #getRepFinEx() <em>Rep Fin Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepFinEx()
     * @generated
     * @ordered
     */
	protected static final Integer REP_FIN_EX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRepFinEx() <em>Rep Fin Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepFinEx()
     * @generated
     * @ordered
     */
	protected Integer repFinEx = REP_FIN_EX_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FinishingFidelityImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getFinishingFidelity();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getStpFinEx() {
        return stpFinEx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStpFinEx(Integer newStpFinEx) {
        Integer oldStpFinEx = stpFinEx;
        stpFinEx = newStpFinEx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_FIDELITY__STP_FIN_EX, oldStpFinEx, stpFinEx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRepFinEx() {
        return repFinEx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRepFinEx(Integer newRepFinEx) {
        Integer oldRepFinEx = repFinEx;
        repFinEx = newRepFinEx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_FIDELITY__REP_FIN_EX, oldRepFinEx, repFinEx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.FINISHING_FIDELITY__STP_FIN_EX:
                return getStpFinEx();
            case AfplibPackage.FINISHING_FIDELITY__REP_FIN_EX:
                return getRepFinEx();
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
            case AfplibPackage.FINISHING_FIDELITY__STP_FIN_EX:
                setStpFinEx((Integer)newValue);
                return;
            case AfplibPackage.FINISHING_FIDELITY__REP_FIN_EX:
                setRepFinEx((Integer)newValue);
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
            case AfplibPackage.FINISHING_FIDELITY__STP_FIN_EX:
                setStpFinEx(STP_FIN_EX_EDEFAULT);
                return;
            case AfplibPackage.FINISHING_FIDELITY__REP_FIN_EX:
                setRepFinEx(REP_FIN_EX_EDEFAULT);
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
            case AfplibPackage.FINISHING_FIDELITY__STP_FIN_EX:
                return STP_FIN_EX_EDEFAULT == null ? stpFinEx != null : !STP_FIN_EX_EDEFAULT.equals(stpFinEx);
            case AfplibPackage.FINISHING_FIDELITY__REP_FIN_EX:
                return REP_FIN_EX_EDEFAULT == null ? repFinEx != null : !REP_FIN_EX_EDEFAULT.equals(repFinEx);
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
        result.append(" (StpFinEx: ");
        result.append(stpFinEx);
        result.append(", RepFinEx: ");
        result.append(repFinEx);
        result.append(')');
        return result.toString();
    }

} //FinishingFidelityImpl
