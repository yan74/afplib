/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PGP;
import org.afplib.afplib.PGPRG;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PGP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PGPImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPImpl#getRG <em>RG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGPImpl extends SFImpl implements PGP {
	/**
     * The default value of the '{@link #getConstant() <em>Constant</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstant()
     * @generated
     * @ordered
     */
	protected static final Integer CONSTANT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getConstant() <em>Constant</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getConstant()
     * @generated
     * @ordered
     */
	protected Integer constant = CONSTANT_EDEFAULT;

	/**
     * The cached value of the '{@link #getRG() <em>RG</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRG()
     * @generated
     * @ordered
     */
	protected EList<PGPRG> rg;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PGPImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getPGP();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getConstant() {
        return constant;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setConstant(Integer newConstant) {
        Integer oldConstant = constant;
        constant = newConstant;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGP__CONSTANT, oldConstant, constant));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<PGPRG> getRG() {
        if (rg == null) {
            rg = new EObjectContainmentEList.Resolving<PGPRG>(PGPRG.class, this, AfplibPackage.PGP__RG);
        }
        return rg;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AfplibPackage.PGP__RG:
                return ((InternalEList<?>)getRG()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.PGP__CONSTANT:
                return getConstant();
            case AfplibPackage.PGP__RG:
                return getRG();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AfplibPackage.PGP__CONSTANT:
                setConstant((Integer)newValue);
                return;
            case AfplibPackage.PGP__RG:
                getRG().clear();
                getRG().addAll((Collection<? extends PGPRG>)newValue);
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
            case AfplibPackage.PGP__CONSTANT:
                setConstant(CONSTANT_EDEFAULT);
                return;
            case AfplibPackage.PGP__RG:
                getRG().clear();
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
            case AfplibPackage.PGP__CONSTANT:
                return CONSTANT_EDEFAULT == null ? constant != null : !CONSTANT_EDEFAULT.equals(constant);
            case AfplibPackage.PGP__RG:
                return rg != null && !rg.isEmpty();
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
        result.append(" (Constant: ");
        result.append(constant);
        result.append(')');
        return result.toString();
    }

} //PGPImpl
