/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.LLE;
import org.afplib.afplib.LLERG;

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
 * An implementation of the model object '<em><b>LLE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.LLEImpl#getLnkType <em>Lnk Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LLEImpl#getRG <em>RG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LLEImpl extends SFImpl implements LLE {
	/**
	 * The default value of the '{@link #getLnkType() <em>Lnk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnkType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LNK_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLnkType() <em>Lnk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLnkType()
	 * @generated
	 * @ordered
	 */
	protected Integer lnkType = LNK_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRG() <em>RG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRG()
	 * @generated
	 * @ordered
	 */
	protected EList<LLERG> rg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LLEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.LLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLnkType() {
		return lnkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLnkType(Integer newLnkType) {
		Integer oldLnkType = lnkType;
		lnkType = newLnkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LLE__LNK_TYPE, oldLnkType, lnkType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LLERG> getRG() {
		if (rg == null) {
			rg = new EObjectContainmentEList.Resolving<LLERG>(LLERG.class, this, AfplibPackage.LLE__RG);
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
			case AfplibPackage.LLE__RG:
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
			case AfplibPackage.LLE__LNK_TYPE:
				return getLnkType();
			case AfplibPackage.LLE__RG:
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
			case AfplibPackage.LLE__LNK_TYPE:
				setLnkType((Integer)newValue);
				return;
			case AfplibPackage.LLE__RG:
				getRG().clear();
				getRG().addAll((Collection<? extends LLERG>)newValue);
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
			case AfplibPackage.LLE__LNK_TYPE:
				setLnkType(LNK_TYPE_EDEFAULT);
				return;
			case AfplibPackage.LLE__RG:
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
			case AfplibPackage.LLE__LNK_TYPE:
				return LNK_TYPE_EDEFAULT == null ? lnkType != null : !LNK_TYPE_EDEFAULT.equals(lnkType);
			case AfplibPackage.LLE__RG:
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
		result.append(" (LnkType: ");
		result.append(lnkType);
		result.append(')');
		return result.toString();
	}

} //LLEImpl
