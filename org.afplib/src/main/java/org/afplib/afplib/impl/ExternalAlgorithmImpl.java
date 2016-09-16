/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ExternalAlgorithm;
import org.afplib.afplib.ExternalAlgorithmRG;

import org.afplib.base.impl.TripletImpl;

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
 * An implementation of the model object '<em><b>External Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ExternalAlgorithmImpl#getALGTYPE <em>ALGTYPE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ExternalAlgorithmImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalAlgorithmImpl extends TripletImpl implements ExternalAlgorithm {
	/**
	 * The default value of the '{@link #getALGTYPE() <em>ALGTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALGTYPE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALGTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getALGTYPE() <em>ALGTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALGTYPE()
	 * @generated
	 * @ordered
	 */
	protected Integer algtype = ALGTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalAlgorithmRG> rg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getExternalAlgorithm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getALGTYPE() {
		return algtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALGTYPE(Integer newALGTYPE) {
		Integer oldALGTYPE = algtype;
		algtype = newALGTYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.EXTERNAL_ALGORITHM__ALGTYPE, oldALGTYPE, algtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalAlgorithmRG> getRg() {
		if (rg == null) {
			rg = new EObjectContainmentEList.Resolving<ExternalAlgorithmRG>(ExternalAlgorithmRG.class, this, AfplibPackage.EXTERNAL_ALGORITHM__RG);
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
			case AfplibPackage.EXTERNAL_ALGORITHM__RG:
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
			case AfplibPackage.EXTERNAL_ALGORITHM__ALGTYPE:
				return getALGTYPE();
			case AfplibPackage.EXTERNAL_ALGORITHM__RG:
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
			case AfplibPackage.EXTERNAL_ALGORITHM__ALGTYPE:
				setALGTYPE((Integer)newValue);
				return;
			case AfplibPackage.EXTERNAL_ALGORITHM__RG:
				getRg().clear();
				getRg().addAll((Collection<? extends ExternalAlgorithmRG>)newValue);
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
			case AfplibPackage.EXTERNAL_ALGORITHM__ALGTYPE:
				setALGTYPE(ALGTYPE_EDEFAULT);
				return;
			case AfplibPackage.EXTERNAL_ALGORITHM__RG:
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
			case AfplibPackage.EXTERNAL_ALGORITHM__ALGTYPE:
				return ALGTYPE_EDEFAULT == null ? algtype != null : !ALGTYPE_EDEFAULT.equals(algtype);
			case AfplibPackage.EXTERNAL_ALGORITHM__RG:
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
		result.append(" (ALGTYPE: ");
		result.append(algtype);
		result.append(')');
		return result.toString();
	}

} //ExternalAlgorithmImpl
