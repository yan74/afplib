/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ColorFidelity;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Fidelity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ColorFidelityImpl#getStpCoEx <em>Stp Co Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorFidelityImpl#getRepCoEx <em>Rep Co Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorFidelityImpl#getColSub <em>Col Sub</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorFidelityImpl extends TripletImpl implements ColorFidelity {
	/**
     * The default value of the '{@link #getStpCoEx() <em>Stp Co Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStpCoEx()
     * @generated
     * @ordered
     */
	protected static final Integer STP_CO_EX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getStpCoEx() <em>Stp Co Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getStpCoEx()
     * @generated
     * @ordered
     */
	protected Integer stpCoEx = STP_CO_EX_EDEFAULT;

	/**
     * The default value of the '{@link #getRepCoEx() <em>Rep Co Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepCoEx()
     * @generated
     * @ordered
     */
	protected static final Integer REP_CO_EX_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRepCoEx() <em>Rep Co Ex</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRepCoEx()
     * @generated
     * @ordered
     */
	protected Integer repCoEx = REP_CO_EX_EDEFAULT;

	/**
     * The default value of the '{@link #getColSub() <em>Col Sub</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSub()
     * @generated
     * @ordered
     */
	protected static final Integer COL_SUB_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColSub() <em>Col Sub</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSub()
     * @generated
     * @ordered
     */
	protected Integer colSub = COL_SUB_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ColorFidelityImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getColorFidelity();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getStpCoEx() {
        return stpCoEx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStpCoEx(Integer newStpCoEx) {
        Integer oldStpCoEx = stpCoEx;
        stpCoEx = newStpCoEx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_FIDELITY__STP_CO_EX, oldStpCoEx, stpCoEx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRepCoEx() {
        return repCoEx;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRepCoEx(Integer newRepCoEx) {
        Integer oldRepCoEx = repCoEx;
        repCoEx = newRepCoEx;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_FIDELITY__REP_CO_EX, oldRepCoEx, repCoEx));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getColSub() {
        return colSub;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColSub(Integer newColSub) {
        Integer oldColSub = colSub;
        colSub = newColSub;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_FIDELITY__COL_SUB, oldColSub, colSub));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.COLOR_FIDELITY__STP_CO_EX:
                return getStpCoEx();
            case AfplibPackage.COLOR_FIDELITY__REP_CO_EX:
                return getRepCoEx();
            case AfplibPackage.COLOR_FIDELITY__COL_SUB:
                return getColSub();
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
            case AfplibPackage.COLOR_FIDELITY__STP_CO_EX:
                setStpCoEx((Integer)newValue);
                return;
            case AfplibPackage.COLOR_FIDELITY__REP_CO_EX:
                setRepCoEx((Integer)newValue);
                return;
            case AfplibPackage.COLOR_FIDELITY__COL_SUB:
                setColSub((Integer)newValue);
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
            case AfplibPackage.COLOR_FIDELITY__STP_CO_EX:
                setStpCoEx(STP_CO_EX_EDEFAULT);
                return;
            case AfplibPackage.COLOR_FIDELITY__REP_CO_EX:
                setRepCoEx(REP_CO_EX_EDEFAULT);
                return;
            case AfplibPackage.COLOR_FIDELITY__COL_SUB:
                setColSub(COL_SUB_EDEFAULT);
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
            case AfplibPackage.COLOR_FIDELITY__STP_CO_EX:
                return STP_CO_EX_EDEFAULT == null ? stpCoEx != null : !STP_CO_EX_EDEFAULT.equals(stpCoEx);
            case AfplibPackage.COLOR_FIDELITY__REP_CO_EX:
                return REP_CO_EX_EDEFAULT == null ? repCoEx != null : !REP_CO_EX_EDEFAULT.equals(repCoEx);
            case AfplibPackage.COLOR_FIDELITY__COL_SUB:
                return COL_SUB_EDEFAULT == null ? colSub != null : !COL_SUB_EDEFAULT.equals(colSub);
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
        result.append(" (StpCoEx: ");
        result.append(stpCoEx);
        result.append(", RepCoEx: ");
        result.append(repCoEx);
        result.append(", ColSub: ");
        result.append(colSub);
        result.append(')');
        return result.toString();
    }

} //ColorFidelityImpl
