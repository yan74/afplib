/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.SamplingRatiosRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sampling Ratios RG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.SamplingRatiosRGImpl#getHSAMPLE <em>HSAMPLE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SamplingRatiosRGImpl#getVSAMPLE <em>VSAMPLE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SamplingRatiosRGImpl extends TripletImpl implements SamplingRatiosRG {
	/**
     * The default value of the '{@link #getHSAMPLE() <em>HSAMPLE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHSAMPLE()
     * @generated
     * @ordered
     */
	protected static final Integer HSAMPLE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHSAMPLE() <em>HSAMPLE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHSAMPLE()
     * @generated
     * @ordered
     */
	protected Integer hsample = HSAMPLE_EDEFAULT;

	/**
     * The default value of the '{@link #getVSAMPLE() <em>VSAMPLE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVSAMPLE()
     * @generated
     * @ordered
     */
	protected static final Integer VSAMPLE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVSAMPLE() <em>VSAMPLE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVSAMPLE()
     * @generated
     * @ordered
     */
	protected Integer vsample = VSAMPLE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SamplingRatiosRGImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getSamplingRatiosRG();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getHSAMPLE() {
        return hsample;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHSAMPLE(Integer newHSAMPLE) {
        Integer oldHSAMPLE = hsample;
        hsample = newHSAMPLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SAMPLING_RATIOS_RG__HSAMPLE, oldHSAMPLE, hsample));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getVSAMPLE() {
        return vsample;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVSAMPLE(Integer newVSAMPLE) {
        Integer oldVSAMPLE = vsample;
        vsample = newVSAMPLE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SAMPLING_RATIOS_RG__VSAMPLE, oldVSAMPLE, vsample));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.SAMPLING_RATIOS_RG__HSAMPLE:
                return getHSAMPLE();
            case AfplibPackage.SAMPLING_RATIOS_RG__VSAMPLE:
                return getVSAMPLE();
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
            case AfplibPackage.SAMPLING_RATIOS_RG__HSAMPLE:
                setHSAMPLE((Integer)newValue);
                return;
            case AfplibPackage.SAMPLING_RATIOS_RG__VSAMPLE:
                setVSAMPLE((Integer)newValue);
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
            case AfplibPackage.SAMPLING_RATIOS_RG__HSAMPLE:
                setHSAMPLE(HSAMPLE_EDEFAULT);
                return;
            case AfplibPackage.SAMPLING_RATIOS_RG__VSAMPLE:
                setVSAMPLE(VSAMPLE_EDEFAULT);
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
            case AfplibPackage.SAMPLING_RATIOS_RG__HSAMPLE:
                return HSAMPLE_EDEFAULT == null ? hsample != null : !HSAMPLE_EDEFAULT.equals(hsample);
            case AfplibPackage.SAMPLING_RATIOS_RG__VSAMPLE:
                return VSAMPLE_EDEFAULT == null ? vsample != null : !VSAMPLE_EDEFAULT.equals(vsample);
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
        result.append(" (HSAMPLE: ");
        result.append(hsample);
        result.append(", VSAMPLE: ");
        result.append(vsample);
        result.append(')');
        return result.toString();
    }

} //SamplingRatiosRGImpl
