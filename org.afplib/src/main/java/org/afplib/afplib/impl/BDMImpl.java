/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BDM;

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
 * An implementation of the model object '<em><b>BDM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BDMImpl#getDMName <em>DM Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDMImpl#getDatFmt <em>Dat Fmt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDMImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDMImpl extends SFImpl implements BDM {
	/**
	 * The default value of the '{@link #getDMName() <em>DM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMName()
	 * @generated
	 * @ordered
	 */
	protected static final String DM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDMName() <em>DM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMName()
	 * @generated
	 * @ordered
	 */
	protected String dmName = DM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatFmt() <em>Dat Fmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatFmt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DAT_FMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatFmt() <em>Dat Fmt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatFmt()
	 * @generated
	 * @ordered
	 */
	protected Integer datFmt = DAT_FMT_EDEFAULT;

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
	protected BDMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.BDM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDMName() {
		return dmName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDMName(String newDMName) {
		String oldDMName = dmName;
		dmName = newDMName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDM__DM_NAME, oldDMName, dmName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDatFmt() {
		return datFmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatFmt(Integer newDatFmt) {
		Integer oldDatFmt = datFmt;
		datFmt = newDatFmt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDM__DAT_FMT, oldDatFmt, datFmt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.BDM__TRIPLETS);
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
			case AfplibPackage.BDM__TRIPLETS:
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
			case AfplibPackage.BDM__DM_NAME:
				return getDMName();
			case AfplibPackage.BDM__DAT_FMT:
				return getDatFmt();
			case AfplibPackage.BDM__TRIPLETS:
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
			case AfplibPackage.BDM__DM_NAME:
				setDMName((String)newValue);
				return;
			case AfplibPackage.BDM__DAT_FMT:
				setDatFmt((Integer)newValue);
				return;
			case AfplibPackage.BDM__TRIPLETS:
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
			case AfplibPackage.BDM__DM_NAME:
				setDMName(DM_NAME_EDEFAULT);
				return;
			case AfplibPackage.BDM__DAT_FMT:
				setDatFmt(DAT_FMT_EDEFAULT);
				return;
			case AfplibPackage.BDM__TRIPLETS:
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
			case AfplibPackage.BDM__DM_NAME:
				return DM_NAME_EDEFAULT == null ? dmName != null : !DM_NAME_EDEFAULT.equals(dmName);
			case AfplibPackage.BDM__DAT_FMT:
				return DAT_FMT_EDEFAULT == null ? datFmt != null : !DAT_FMT_EDEFAULT.equals(datFmt);
			case AfplibPackage.BDM__TRIPLETS:
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
		result.append(" (DMName: ");
		result.append(dmName);
		result.append(", DatFmt: ");
		result.append(datFmt);
		result.append(')');
		return result.toString();
	}

} //BDMImpl
