/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GDD;

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
 * An implementation of the model object '<em><b>GDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GDDImpl#getGOCAdes <em>GOC Ades</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GDDImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GDDImpl extends SFImpl implements GDD {
	/**
     * The default value of the '{@link #getGOCAdes() <em>GOC Ades</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGOCAdes()
     * @generated
     * @ordered
     */
	protected static final byte[] GOC_ADES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getGOCAdes() <em>GOC Ades</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGOCAdes()
     * @generated
     * @ordered
     */
	protected byte[] gocAdes = GOC_ADES_EDEFAULT;

	/**
     * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCommands()
     * @generated
     * @ordered
     */
	protected EList<Triplet> commands;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GDDImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getGDD();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getGOCAdes() {
        return gocAdes;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGOCAdes(byte[] newGOCAdes) {
        byte[] oldGOCAdes = gocAdes;
        gocAdes = newGOCAdes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GDD__GOC_ADES, oldGOCAdes, gocAdes));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Triplet> getCommands() {
        if (commands == null) {
            commands = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.GDD__COMMANDS);
        }
        return commands;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AfplibPackage.GDD__COMMANDS:
                return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
            case AfplibPackage.GDD__GOC_ADES:
                return getGOCAdes();
            case AfplibPackage.GDD__COMMANDS:
                return getCommands();
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
            case AfplibPackage.GDD__GOC_ADES:
                setGOCAdes((byte[])newValue);
                return;
            case AfplibPackage.GDD__COMMANDS:
                getCommands().clear();
                getCommands().addAll((Collection<? extends Triplet>)newValue);
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
            case AfplibPackage.GDD__GOC_ADES:
                setGOCAdes(GOC_ADES_EDEFAULT);
                return;
            case AfplibPackage.GDD__COMMANDS:
                getCommands().clear();
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
            case AfplibPackage.GDD__GOC_ADES:
                return GOC_ADES_EDEFAULT == null ? gocAdes != null : !GOC_ADES_EDEFAULT.equals(gocAdes);
            case AfplibPackage.GDD__COMMANDS:
                return commands != null && !commands.isEmpty();
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
        result.append(" (GOCAdes: ");
        result.append(gocAdes);
        result.append(')');
        return result.toString();
    }

} //GDDImpl
