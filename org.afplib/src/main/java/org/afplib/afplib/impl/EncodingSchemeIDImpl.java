/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.EncodingSchemeID;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoding Scheme ID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.EncodingSchemeIDImpl#getESidCP <em>ESid CP</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.EncodingSchemeIDImpl#getESidUD <em>ESid UD</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncodingSchemeIDImpl extends TripletImpl implements EncodingSchemeID {
	/**
     * The default value of the '{@link #getESidCP() <em>ESid CP</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getESidCP()
     * @generated
     * @ordered
     */
	protected static final Integer ESID_CP_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getESidCP() <em>ESid CP</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getESidCP()
     * @generated
     * @ordered
     */
	protected Integer eSidCP = ESID_CP_EDEFAULT;

	/**
     * The default value of the '{@link #getESidUD() <em>ESid UD</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getESidUD()
     * @generated
     * @ordered
     */
	protected static final Integer ESID_UD_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getESidUD() <em>ESid UD</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getESidUD()
     * @generated
     * @ordered
     */
	protected Integer eSidUD = ESID_UD_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected EncodingSchemeIDImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getEncodingSchemeID();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getESidCP() {
        return eSidCP;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setESidCP(Integer newESidCP) {
        Integer oldESidCP = eSidCP;
        eSidCP = newESidCP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ENCODING_SCHEME_ID__ESID_CP, oldESidCP, eSidCP));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getESidUD() {
        return eSidUD;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setESidUD(Integer newESidUD) {
        Integer oldESidUD = eSidUD;
        eSidUD = newESidUD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ENCODING_SCHEME_ID__ESID_UD, oldESidUD, eSidUD));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_CP:
                return getESidCP();
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_UD:
                return getESidUD();
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
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_CP:
                setESidCP((Integer)newValue);
                return;
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_UD:
                setESidUD((Integer)newValue);
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
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_CP:
                setESidCP(ESID_CP_EDEFAULT);
                return;
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_UD:
                setESidUD(ESID_UD_EDEFAULT);
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
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_CP:
                return ESID_CP_EDEFAULT == null ? eSidCP != null : !ESID_CP_EDEFAULT.equals(eSidCP);
            case AfplibPackage.ENCODING_SCHEME_ID__ESID_UD:
                return ESID_UD_EDEFAULT == null ? eSidUD != null : !ESID_UD_EDEFAULT.equals(eSidUD);
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
        result.append(" (ESidCP: ");
        result.append(eSidCP);
        result.append(", ESidUD: ");
        result.append(eSidUD);
        result.append(')');
        return result.toString();
    }

} //EncodingSchemeIDImpl
