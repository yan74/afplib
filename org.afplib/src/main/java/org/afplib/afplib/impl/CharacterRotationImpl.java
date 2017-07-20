/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CharacterRotation;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Character Rotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CharacterRotationImpl#getCharRot <em>Char Rot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacterRotationImpl extends TripletImpl implements CharacterRotation {
	/**
     * The default value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharRot()
     * @generated
     * @ordered
     */
	protected static final Integer CHAR_ROT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharRot()
     * @generated
     * @ordered
     */
	protected Integer charRot = CHAR_ROT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CharacterRotationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getCharacterRotation();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCharRot() {
        return charRot;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharRot(Integer newCharRot) {
        Integer oldCharRot = charRot;
        charRot = newCharRot;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CHARACTER_ROTATION__CHAR_ROT, oldCharRot, charRot));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.CHARACTER_ROTATION__CHAR_ROT:
                return getCharRot();
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
            case AfplibPackage.CHARACTER_ROTATION__CHAR_ROT:
                setCharRot((Integer)newValue);
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
            case AfplibPackage.CHARACTER_ROTATION__CHAR_ROT:
                setCharRot(CHAR_ROT_EDEFAULT);
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
            case AfplibPackage.CHARACTER_ROTATION__CHAR_ROT:
                return CHAR_ROT_EDEFAULT == null ? charRot != null : !CHAR_ROT_EDEFAULT.equals(charRot);
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
        result.append(" (CharRot: ");
        result.append(charRot);
        result.append(')');
        return result.toString();
    }

} //CharacterRotationImpl
