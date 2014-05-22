/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CPI;
import org.afplib.afplib.CPIRG;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CPIImpl#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CPIImpl extends SFImpl implements CPI {
	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected EList<CPIRG> rg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getCPI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CPIRG> getRg() {
		if (rg == null) {
			rg = new EObjectContainmentEList.Resolving<CPIRG>(CPIRG.class, this, AfplibPackage.CPI__RG);
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
			case AfplibPackage.CPI__RG:
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
			case AfplibPackage.CPI__RG:
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
			case AfplibPackage.CPI__RG:
				getRg().clear();
				getRg().addAll((Collection<? extends CPIRG>)newValue);
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
			case AfplibPackage.CPI__RG:
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
			case AfplibPackage.CPI__RG:
				return rg != null && !rg.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CPIImpl
