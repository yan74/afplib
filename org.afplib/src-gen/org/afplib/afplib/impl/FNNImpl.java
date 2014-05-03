/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNN;
import org.afplib.afplib.FNNRG;

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
 * An implementation of the model object '<em><b>FNN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNNImpl#getIBMFormat <em>IBM Format</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNNImpl#getTechnologyFormat <em>Technology Format</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNNImpl#getRg <em>Rg</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNNImpl#getRg2 <em>Rg2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FNNImpl extends SFImpl implements FNN {
	/**
	 * The default value of the '{@link #getIBMFormat() <em>IBM Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBMFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IBM_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIBMFormat() <em>IBM Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBMFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer ibmFormat = IBM_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTechnologyFormat() <em>Technology Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TECHNOLOGY_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTechnologyFormat() <em>Technology Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologyFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer technologyFormat = TECHNOLOGY_FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg()
	 * @generated
	 * @ordered
	 */
	protected EList<FNNRG> rg;

	/**
	 * The cached value of the '{@link #getRg2() <em>Rg2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRg2()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplet> rg2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFNN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIBMFormat() {
		return ibmFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBMFormat(Integer newIBMFormat) {
		Integer oldIBMFormat = ibmFormat;
		ibmFormat = newIBMFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNN__IBM_FORMAT, oldIBMFormat, ibmFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTechnologyFormat() {
		return technologyFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnologyFormat(Integer newTechnologyFormat) {
		Integer oldTechnologyFormat = technologyFormat;
		technologyFormat = newTechnologyFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNN__TECHNOLOGY_FORMAT, oldTechnologyFormat, technologyFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FNNRG> getRg() {
		if (rg == null) {
			rg = new EObjectContainmentEList.Resolving<FNNRG>(FNNRG.class, this, AfplibPackage.FNN__RG);
		}
		return rg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getRg2() {
		if (rg2 == null) {
			rg2 = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.FNN__RG2);
		}
		return rg2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.FNN__RG:
				return ((InternalEList<?>)getRg()).basicRemove(otherEnd, msgs);
			case AfplibPackage.FNN__RG2:
				return ((InternalEList<?>)getRg2()).basicRemove(otherEnd, msgs);
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
			case AfplibPackage.FNN__IBM_FORMAT:
				return getIBMFormat();
			case AfplibPackage.FNN__TECHNOLOGY_FORMAT:
				return getTechnologyFormat();
			case AfplibPackage.FNN__RG:
				return getRg();
			case AfplibPackage.FNN__RG2:
				return getRg2();
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
			case AfplibPackage.FNN__IBM_FORMAT:
				setIBMFormat((Integer)newValue);
				return;
			case AfplibPackage.FNN__TECHNOLOGY_FORMAT:
				setTechnologyFormat((Integer)newValue);
				return;
			case AfplibPackage.FNN__RG:
				getRg().clear();
				getRg().addAll((Collection<? extends FNNRG>)newValue);
				return;
			case AfplibPackage.FNN__RG2:
				getRg2().clear();
				getRg2().addAll((Collection<? extends Triplet>)newValue);
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
			case AfplibPackage.FNN__IBM_FORMAT:
				setIBMFormat(IBM_FORMAT_EDEFAULT);
				return;
			case AfplibPackage.FNN__TECHNOLOGY_FORMAT:
				setTechnologyFormat(TECHNOLOGY_FORMAT_EDEFAULT);
				return;
			case AfplibPackage.FNN__RG:
				getRg().clear();
				return;
			case AfplibPackage.FNN__RG2:
				getRg2().clear();
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
			case AfplibPackage.FNN__IBM_FORMAT:
				return IBM_FORMAT_EDEFAULT == null ? ibmFormat != null : !IBM_FORMAT_EDEFAULT.equals(ibmFormat);
			case AfplibPackage.FNN__TECHNOLOGY_FORMAT:
				return TECHNOLOGY_FORMAT_EDEFAULT == null ? technologyFormat != null : !TECHNOLOGY_FORMAT_EDEFAULT.equals(technologyFormat);
			case AfplibPackage.FNN__RG:
				return rg != null && !rg.isEmpty();
			case AfplibPackage.FNN__RG2:
				return rg2 != null && !rg2.isEmpty();
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
		result.append(" (IBMFormat: ");
		result.append(ibmFormat);
		result.append(", TechnologyFormat: ");
		result.append(technologyFormat);
		result.append(')');
		return result.toString();
	}

} //FNNImpl
