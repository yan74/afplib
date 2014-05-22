/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IPS;

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
 * An implementation of the model object '<em><b>IPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IPSImpl#getPsegName <em>Pseg Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPSImpl#getXpsOset <em>Xps Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPSImpl#getYpsOset <em>Yps Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPSImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPSImpl extends SFImpl implements IPS {
	/**
	 * The default value of the '{@link #getPsegName() <em>Pseg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsegName()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPsegName() <em>Pseg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPsegName()
	 * @generated
	 * @ordered
	 */
	protected String psegName = PSEG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpsOset() <em>Xps Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpsOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPS_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpsOset() <em>Xps Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpsOset()
	 * @generated
	 * @ordered
	 */
	protected Integer xpsOset = XPS_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYpsOset() <em>Yps Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpsOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPS_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYpsOset() <em>Yps Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpsOset()
	 * @generated
	 * @ordered
	 */
	protected Integer ypsOset = YPS_OSET_EDEFAULT;

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
	protected IPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPsegName() {
		return psegName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPsegName(String newPsegName) {
		String oldPsegName = psegName;
		psegName = newPsegName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPS__PSEG_NAME, oldPsegName, psegName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXpsOset() {
		return xpsOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpsOset(Integer newXpsOset) {
		Integer oldXpsOset = xpsOset;
		xpsOset = newXpsOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPS__XPS_OSET, oldXpsOset, xpsOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYpsOset() {
		return ypsOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYpsOset(Integer newYpsOset) {
		Integer oldYpsOset = ypsOset;
		ypsOset = newYpsOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPS__YPS_OSET, oldYpsOset, ypsOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IPS__TRIPLETS);
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
			case AfplibPackage.IPS__TRIPLETS:
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
			case AfplibPackage.IPS__PSEG_NAME:
				return getPsegName();
			case AfplibPackage.IPS__XPS_OSET:
				return getXpsOset();
			case AfplibPackage.IPS__YPS_OSET:
				return getYpsOset();
			case AfplibPackage.IPS__TRIPLETS:
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
			case AfplibPackage.IPS__PSEG_NAME:
				setPsegName((String)newValue);
				return;
			case AfplibPackage.IPS__XPS_OSET:
				setXpsOset((Integer)newValue);
				return;
			case AfplibPackage.IPS__YPS_OSET:
				setYpsOset((Integer)newValue);
				return;
			case AfplibPackage.IPS__TRIPLETS:
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
			case AfplibPackage.IPS__PSEG_NAME:
				setPsegName(PSEG_NAME_EDEFAULT);
				return;
			case AfplibPackage.IPS__XPS_OSET:
				setXpsOset(XPS_OSET_EDEFAULT);
				return;
			case AfplibPackage.IPS__YPS_OSET:
				setYpsOset(YPS_OSET_EDEFAULT);
				return;
			case AfplibPackage.IPS__TRIPLETS:
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
			case AfplibPackage.IPS__PSEG_NAME:
				return PSEG_NAME_EDEFAULT == null ? psegName != null : !PSEG_NAME_EDEFAULT.equals(psegName);
			case AfplibPackage.IPS__XPS_OSET:
				return XPS_OSET_EDEFAULT == null ? xpsOset != null : !XPS_OSET_EDEFAULT.equals(xpsOset);
			case AfplibPackage.IPS__YPS_OSET:
				return YPS_OSET_EDEFAULT == null ? ypsOset != null : !YPS_OSET_EDEFAULT.equals(ypsOset);
			case AfplibPackage.IPS__TRIPLETS:
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
		result.append(" (PsegName: ");
		result.append(psegName);
		result.append(", XpsOset: ");
		result.append(xpsOset);
		result.append(", YpsOset: ");
		result.append(ypsOset);
		result.append(')');
		return result.toString();
	}

} //IPSImpl
