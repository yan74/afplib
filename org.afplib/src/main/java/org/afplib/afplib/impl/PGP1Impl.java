/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PGP1;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PGP1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PGP1Impl#getXOset <em>XOset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGP1Impl#getYOset <em>YOset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGP1Impl extends SFImpl implements PGP1 {
	/**
     * The default value of the '{@link #getXOset() <em>XOset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXOset()
     * @generated
     * @ordered
     */
	protected static final Integer XOSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXOset() <em>XOset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXOset()
     * @generated
     * @ordered
     */
	protected Integer xOset = XOSET_EDEFAULT;

	/**
     * The default value of the '{@link #getYOset() <em>YOset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYOset()
     * @generated
     * @ordered
     */
	protected static final Integer YOSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYOset() <em>YOset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYOset()
     * @generated
     * @ordered
     */
	protected Integer yOset = YOSET_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PGP1Impl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getPGP1();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXOset() {
        return xOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXOset(Integer newXOset) {
        Integer oldXOset = xOset;
        xOset = newXOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGP1__XOSET, oldXOset, xOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYOset() {
        return yOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYOset(Integer newYOset) {
        Integer oldYOset = yOset;
        yOset = newYOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGP1__YOSET, oldYOset, yOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.PGP1__XOSET:
                return getXOset();
            case AfplibPackage.PGP1__YOSET:
                return getYOset();
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
            case AfplibPackage.PGP1__XOSET:
                setXOset((Integer)newValue);
                return;
            case AfplibPackage.PGP1__YOSET:
                setYOset((Integer)newValue);
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
            case AfplibPackage.PGP1__XOSET:
                setXOset(XOSET_EDEFAULT);
                return;
            case AfplibPackage.PGP1__YOSET:
                setYOset(YOSET_EDEFAULT);
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
            case AfplibPackage.PGP1__XOSET:
                return XOSET_EDEFAULT == null ? xOset != null : !XOSET_EDEFAULT.equals(xOset);
            case AfplibPackage.PGP1__YOSET:
                return YOSET_EDEFAULT == null ? yOset != null : !YOSET_EDEFAULT.equals(yOset);
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
        result.append(" (XOset: ");
        result.append(xOset);
        result.append(", YOset: ");
        result.append(yOset);
        result.append(')');
        return result.toString();
    }

} //PGP1Impl
