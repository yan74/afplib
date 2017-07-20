/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MMC;
import org.afplib.afplib.MMCRG;

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
 * An implementation of the model object '<em><b>MMC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MMCImpl#getMMCid <em>MM Cid</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MMCImpl#getPARAMETER1 <em>PARAMETER1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MMCImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMCImpl extends SFImpl implements MMC {
	/**
     * The default value of the '{@link #getMMCid() <em>MM Cid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMMCid()
     * @generated
     * @ordered
     */
	protected static final Integer MM_CID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMMCid() <em>MM Cid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMMCid()
     * @generated
     * @ordered
     */
	protected Integer mmCid = MM_CID_EDEFAULT;

	/**
     * The default value of the '{@link #getPARAMETER1() <em>PARAMETER1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPARAMETER1()
     * @generated
     * @ordered
     */
	protected static final Integer PARAMETER1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPARAMETER1() <em>PARAMETER1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPARAMETER1()
     * @generated
     * @ordered
     */
	protected Integer parameter1 = PARAMETER1_EDEFAULT;

	/**
     * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRg()
     * @generated
     * @ordered
     */
	protected EList<MMCRG> rg;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MMCImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getMMC();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMMCid() {
        return mmCid;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMMCid(Integer newMMCid) {
        Integer oldMMCid = mmCid;
        mmCid = newMMCid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MMC__MM_CID, oldMMCid, mmCid));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getPARAMETER1() {
        return parameter1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPARAMETER1(Integer newPARAMETER1) {
        Integer oldPARAMETER1 = parameter1;
        parameter1 = newPARAMETER1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MMC__PARAMETER1, oldPARAMETER1, parameter1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MMCRG> getRg() {
        if (rg == null) {
            rg = new EObjectContainmentEList.Resolving<MMCRG>(MMCRG.class, this, AfplibPackage.MMC__RG);
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
            case AfplibPackage.MMC__RG:
                return ((InternalEList<?>)getRg()).basicRemove(otherEnd, msgs);
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
            case AfplibPackage.MMC__MM_CID:
                return getMMCid();
            case AfplibPackage.MMC__PARAMETER1:
                return getPARAMETER1();
            case AfplibPackage.MMC__RG:
                return getRg();
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
            case AfplibPackage.MMC__MM_CID:
                setMMCid((Integer)newValue);
                return;
            case AfplibPackage.MMC__PARAMETER1:
                setPARAMETER1((Integer)newValue);
                return;
            case AfplibPackage.MMC__RG:
                getRg().clear();
                getRg().addAll((Collection<? extends MMCRG>)newValue);
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
            case AfplibPackage.MMC__MM_CID:
                setMMCid(MM_CID_EDEFAULT);
                return;
            case AfplibPackage.MMC__PARAMETER1:
                setPARAMETER1(PARAMETER1_EDEFAULT);
                return;
            case AfplibPackage.MMC__RG:
                getRg().clear();
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
            case AfplibPackage.MMC__MM_CID:
                return MM_CID_EDEFAULT == null ? mmCid != null : !MM_CID_EDEFAULT.equals(mmCid);
            case AfplibPackage.MMC__PARAMETER1:
                return PARAMETER1_EDEFAULT == null ? parameter1 != null : !PARAMETER1_EDEFAULT.equals(parameter1);
            case AfplibPackage.MMC__RG:
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
        result.append(" (MMCid: ");
        result.append(mmCid);
        result.append(", PARAMETER1: ");
        result.append(parameter1);
        result.append(')');
        return result.toString();
    }

} //MMCImpl
