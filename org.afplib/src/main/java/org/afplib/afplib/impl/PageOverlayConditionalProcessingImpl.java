/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PageOverlayConditionalProcessing;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Overlay Conditional Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PageOverlayConditionalProcessingImpl#getPgOvType <em>Pg Ov Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PageOverlayConditionalProcessingImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageOverlayConditionalProcessingImpl extends TripletImpl implements PageOverlayConditionalProcessing {
	/**
     * The default value of the '{@link #getPgOvType() <em>Pg Ov Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPgOvType()
     * @generated
     * @ordered
     */
	protected static final Integer PG_OV_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPgOvType() <em>Pg Ov Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPgOvType()
     * @generated
     * @ordered
     */
	protected Integer pgOvType = PG_OV_TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
	protected static final Integer LEVEL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLevel()
     * @generated
     * @ordered
     */
	protected Integer level = LEVEL_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PageOverlayConditionalProcessingImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getPageOverlayConditionalProcessing();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getPgOvType() {
        return pgOvType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPgOvType(Integer newPgOvType) {
        Integer oldPgOvType = pgOvType;
        pgOvType = newPgOvType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__PG_OV_TYPE, oldPgOvType, pgOvType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getLevel() {
        return level;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLevel(Integer newLevel) {
        Integer oldLevel = level;
        level = newLevel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__LEVEL, oldLevel, level));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__PG_OV_TYPE:
                return getPgOvType();
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__LEVEL:
                return getLevel();
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
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__PG_OV_TYPE:
                setPgOvType((Integer)newValue);
                return;
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__LEVEL:
                setLevel((Integer)newValue);
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
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__PG_OV_TYPE:
                setPgOvType(PG_OV_TYPE_EDEFAULT);
                return;
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__LEVEL:
                setLevel(LEVEL_EDEFAULT);
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
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__PG_OV_TYPE:
                return PG_OV_TYPE_EDEFAULT == null ? pgOvType != null : !PG_OV_TYPE_EDEFAULT.equals(pgOvType);
            case AfplibPackage.PAGE_OVERLAY_CONDITIONAL_PROCESSING__LEVEL:
                return LEVEL_EDEFAULT == null ? level != null : !LEVEL_EDEFAULT.equals(level);
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
        result.append(" (PgOvType: ");
        result.append(pgOvType);
        result.append(", Level: ");
        result.append(level);
        result.append(')');
        return result.toString();
    }

} //PageOverlayConditionalProcessingImpl
