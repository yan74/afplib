/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IPG;

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
 * An implementation of the model object '<em><b>IPG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IPGImpl#getPgName <em>Pg Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPGImpl#getIPgFlgs <em>IPg Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPGImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPGImpl extends SFImpl implements IPG {
	/**
	 * The default value of the '{@link #getPgName() <em>Pg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgName()
	 * @generated
	 * @ordered
	 */
	protected static final String PG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPgName() <em>Pg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgName()
	 * @generated
	 * @ordered
	 */
	protected String pgName = PG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPgFlgs() <em>IPg Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPgFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IPG_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPgFlgs() <em>IPg Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPgFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer iPgFlgs = IPG_FLGS_EDEFAULT;

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
	protected IPGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.IPG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPgName() {
		return pgName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgName(String newPgName) {
		String oldPgName = pgName;
		pgName = newPgName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPG__PG_NAME, oldPgName, pgName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIPgFlgs() {
		return iPgFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPgFlgs(Integer newIPgFlgs) {
		Integer oldIPgFlgs = iPgFlgs;
		iPgFlgs = newIPgFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPG__IPG_FLGS, oldIPgFlgs, iPgFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IPG__TRIPLETS);
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
			case AfplibPackage.IPG__TRIPLETS:
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
			case AfplibPackage.IPG__PG_NAME:
				return getPgName();
			case AfplibPackage.IPG__IPG_FLGS:
				return getIPgFlgs();
			case AfplibPackage.IPG__TRIPLETS:
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
			case AfplibPackage.IPG__PG_NAME:
				setPgName((String)newValue);
				return;
			case AfplibPackage.IPG__IPG_FLGS:
				setIPgFlgs((Integer)newValue);
				return;
			case AfplibPackage.IPG__TRIPLETS:
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
			case AfplibPackage.IPG__PG_NAME:
				setPgName(PG_NAME_EDEFAULT);
				return;
			case AfplibPackage.IPG__IPG_FLGS:
				setIPgFlgs(IPG_FLGS_EDEFAULT);
				return;
			case AfplibPackage.IPG__TRIPLETS:
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
			case AfplibPackage.IPG__PG_NAME:
				return PG_NAME_EDEFAULT == null ? pgName != null : !PG_NAME_EDEFAULT.equals(pgName);
			case AfplibPackage.IPG__IPG_FLGS:
				return IPG_FLGS_EDEFAULT == null ? iPgFlgs != null : !IPG_FLGS_EDEFAULT.equals(iPgFlgs);
			case AfplibPackage.IPG__TRIPLETS:
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
		result.append(" (PgName: ");
		result.append(pgName);
		result.append(", IPgFlgs: ");
		result.append(iPgFlgs);
		result.append(')');
		return result.toString();
	}

} //IPGImpl
