/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PresentationControl;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PresentationControlImpl#getPRSFlg <em>PRS Flg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PresentationControlImpl extends TripletImpl implements PresentationControl {
	/**
	 * The default value of the '{@link #getPRSFlg() <em>PRS Flg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRSFlg()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRS_FLG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRSFlg() <em>PRS Flg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRSFlg()
	 * @generated
	 * @ordered
	 */
	protected Integer prsFlg = PRS_FLG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getPresentationControl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPRSFlg() {
		return prsFlg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRSFlg(Integer newPRSFlg) {
		Integer oldPRSFlg = prsFlg;
		prsFlg = newPRSFlg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PRESENTATION_CONTROL__PRS_FLG, oldPRSFlg, prsFlg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.PRESENTATION_CONTROL__PRS_FLG:
				return getPRSFlg();
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
			case AfplibPackage.PRESENTATION_CONTROL__PRS_FLG:
				setPRSFlg((Integer)newValue);
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
			case AfplibPackage.PRESENTATION_CONTROL__PRS_FLG:
				setPRSFlg(PRS_FLG_EDEFAULT);
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
			case AfplibPackage.PRESENTATION_CONTROL__PRS_FLG:
				return PRS_FLG_EDEFAULT == null ? prsFlg != null : !PRS_FLG_EDEFAULT.equals(prsFlg);
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
		result.append(" (PRSFlg: ");
		result.append(prsFlg);
		result.append(')');
		return result.toString();
	}

} //PresentationControlImpl
