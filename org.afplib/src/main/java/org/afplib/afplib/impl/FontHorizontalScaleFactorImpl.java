/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FontHorizontalScaleFactor;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Horizontal Scale Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FontHorizontalScaleFactorImpl#getHscale <em>Hscale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontHorizontalScaleFactorImpl extends TripletImpl implements FontHorizontalScaleFactor {
	/**
     * The default value of the '{@link #getHscale() <em>Hscale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHscale()
     * @generated
     * @ordered
     */
	protected static final Integer HSCALE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHscale() <em>Hscale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHscale()
     * @generated
     * @ordered
     */
	protected Integer hscale = HSCALE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FontHorizontalScaleFactorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getFontHorizontalScaleFactor();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getHscale() {
        return hscale;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHscale(Integer newHscale) {
        Integer oldHscale = hscale;
        hscale = newHscale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE, oldHscale, hscale));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
                return getHscale();
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
            case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
                setHscale((Integer)newValue);
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
            case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
                setHscale(HSCALE_EDEFAULT);
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
            case AfplibPackage.FONT_HORIZONTAL_SCALE_FACTOR__HSCALE:
                return HSCALE_EDEFAULT == null ? hscale != null : !HSCALE_EDEFAULT.equals(hscale);
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
        result.append(" (Hscale: ");
        result.append(hscale);
        result.append(')');
        return result.toString();
    }

} //FontHorizontalScaleFactorImpl
