/**
 */
package org.afplib.base.impl;

import java.util.Collection;

import org.afplib.base.AFP;
import org.afplib.base.BasePackage;
import org.afplib.base.SF;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.base.impl.AFPImpl#getStructuredFields <em>Structured Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AFPImpl extends EObjectImpl implements AFP {
	/**
	 * The cached value of the '{@link #getStructuredFields() <em>Structured Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredFields()
	 * @generated
	 * @ordered
	 */
	protected EList<SF> structuredFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AFPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasePackage.Literals.AFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SF> getStructuredFields() {
		if (structuredFields == null) {
			structuredFields = new EObjectContainmentEList.Resolving<SF>(SF.class, this, BasePackage.AFP__STRUCTURED_FIELDS);
		}
		return structuredFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasePackage.AFP__STRUCTURED_FIELDS:
				return ((InternalEList<?>)getStructuredFields()).basicRemove(otherEnd, msgs);
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
			case BasePackage.AFP__STRUCTURED_FIELDS:
				return getStructuredFields();
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
			case BasePackage.AFP__STRUCTURED_FIELDS:
				getStructuredFields().clear();
				getStructuredFields().addAll((Collection<? extends SF>)newValue);
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
			case BasePackage.AFP__STRUCTURED_FIELDS:
				getStructuredFields().clear();
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
			case BasePackage.AFP__STRUCTURED_FIELDS:
				return structuredFields != null && !structuredFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AFPImpl
