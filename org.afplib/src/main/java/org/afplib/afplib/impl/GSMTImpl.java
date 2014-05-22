/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GSMT;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSMT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GSMTImpl#getMCPT <em>MCPT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSMTImpl extends TripletImpl implements GSMT {
	/**
	 * The default value of the '{@link #getMCPT() <em>MCPT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCPT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MCPT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMCPT() <em>MCPT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMCPT()
	 * @generated
	 * @ordered
	 */
	protected Integer mcpt = MCPT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSMTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGSMT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMCPT() {
		return mcpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMCPT(Integer newMCPT) {
		Integer oldMCPT = mcpt;
		mcpt = newMCPT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSMT__MCPT, oldMCPT, mcpt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GSMT__MCPT:
				return getMCPT();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.GSMT__MCPT:
				setMCPT((Integer)newValue);
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
			case AfplibPackage.GSMT__MCPT:
				setMCPT(MCPT_EDEFAULT);
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
			case AfplibPackage.GSMT__MCPT:
				return MCPT_EDEFAULT == null ? mcpt != null : !MCPT_EDEFAULT.equals(mcpt);
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
		result.append(" (MCPT: ");
		result.append(mcpt);
		result.append(')');
		return result.toString();
	}

} //GSMTImpl
