/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MCF1;
import org.afplib.afplib.MCF1RG;

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
 * An implementation of the model object '<em><b>MCF1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MCF1Impl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCF1Impl#getRG <em>RG</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MCF1Impl extends SFImpl implements MCF1 {
	/**
	 * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RG_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected Integer rgLength = RG_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRG() <em>RG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRG()
	 * @generated
	 * @ordered
	 */
	protected EList<MCF1RG> rg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCF1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMCF1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRGLength() {
		return rgLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGLength(Integer newRGLength) {
		Integer oldRGLength = rgLength;
		rgLength = newRGLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1__RG_LENGTH, oldRGLength, rgLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MCF1RG> getRG() {
		if (rg == null) {
			rg = new EObjectContainmentEList.Resolving<MCF1RG>(MCF1RG.class, this, AfplibPackage.MCF1__RG);
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
			case AfplibPackage.MCF1__RG:
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
			case AfplibPackage.MCF1__RG_LENGTH:
				return getRGLength();
			case AfplibPackage.MCF1__RG:
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
			case AfplibPackage.MCF1__RG_LENGTH:
				setRGLength((Integer)newValue);
				return;
			case AfplibPackage.MCF1__RG:
				getRG().clear();
				getRG().addAll((Collection<? extends MCF1RG>)newValue);
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
			case AfplibPackage.MCF1__RG_LENGTH:
				setRGLength(RG_LENGTH_EDEFAULT);
				return;
			case AfplibPackage.MCF1__RG:
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
			case AfplibPackage.MCF1__RG_LENGTH:
				return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
			case AfplibPackage.MCF1__RG:
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
		result.append(" (RGLength: ");
		result.append(rgLength);
		result.append(')');
		return result.toString();
	}

} //MCF1Impl
