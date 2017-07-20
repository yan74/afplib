/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IMM;

import org.afplib.base.Triplet;

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
 * An implementation of the model object '<em><b>IMM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IMMImpl#getMMPName <em>MMP Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IMMImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IMMImpl extends SFImpl implements IMM {
	/**
     * The default value of the '{@link #getMMPName() <em>MMP Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMMPName()
     * @generated
     * @ordered
     */
	protected static final String MMP_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMMPName() <em>MMP Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMMPName()
     * @generated
     * @ordered
     */
	protected String mmpName = MMP_NAME_EDEFAULT;

	/**
     * The cached value of the '{@link #getTriplets() <em>Triplets</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTriplets()
     * @generated
     * @ordered
     */
	protected EList<Triplet> triplets;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IMMImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getIMM();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getMMPName() {
        return mmpName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMMPName(String newMMPName) {
        String oldMMPName = mmpName;
        mmpName = newMMPName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMM__MMP_NAME, oldMMPName, mmpName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Triplet> getTriplets() {
        if (triplets == null) {
            triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IMM__TRIPLETS);
        }
        return triplets;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AfplibPackage.IMM__TRIPLETS:
                return ((InternalEList<?>)getTriplets()).basicRemove(otherEnd, msgs);
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
            case AfplibPackage.IMM__MMP_NAME:
                return getMMPName();
            case AfplibPackage.IMM__TRIPLETS:
                return getTriplets();
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
            case AfplibPackage.IMM__MMP_NAME:
                setMMPName((String)newValue);
                return;
            case AfplibPackage.IMM__TRIPLETS:
                getTriplets().clear();
                getTriplets().addAll((Collection<? extends Triplet>)newValue);
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
            case AfplibPackage.IMM__MMP_NAME:
                setMMPName(MMP_NAME_EDEFAULT);
                return;
            case AfplibPackage.IMM__TRIPLETS:
                getTriplets().clear();
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
            case AfplibPackage.IMM__MMP_NAME:
                return MMP_NAME_EDEFAULT == null ? mmpName != null : !MMP_NAME_EDEFAULT.equals(mmpName);
            case AfplibPackage.IMM__TRIPLETS:
                return triplets != null && !triplets.isEmpty();
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
        result.append(" (MMPName: ");
        result.append(mmpName);
        result.append(')');
        return result.toString();
    }

} //IMMImpl
