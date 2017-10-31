/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PresentationSpaceResetMixing;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Presentation Space Reset Mixing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PresentationSpaceResetMixingImpl#getBgMxFlag <em>Bg Mx Flag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PresentationSpaceResetMixingImpl extends TripletImpl implements PresentationSpaceResetMixing {
	/**
	 * The default value of the '{@link #getBgMxFlag() <em>Bg Mx Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgMxFlag()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BG_MX_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBgMxFlag() <em>Bg Mx Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgMxFlag()
	 * @generated
	 * @ordered
	 */
	protected Integer bgMxFlag = BG_MX_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationSpaceResetMixingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getPresentationSpaceResetMixing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBgMxFlag() {
		return bgMxFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgMxFlag(Integer newBgMxFlag) {
		Integer oldBgMxFlag = bgMxFlag;
		bgMxFlag = newBgMxFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PRESENTATION_SPACE_RESET_MIXING__BG_MX_FLAG, oldBgMxFlag, bgMxFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING__BG_MX_FLAG:
				return getBgMxFlag();
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
			case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING__BG_MX_FLAG:
				setBgMxFlag((Integer)newValue);
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
			case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING__BG_MX_FLAG:
				setBgMxFlag(BG_MX_FLAG_EDEFAULT);
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
			case AfplibPackage.PRESENTATION_SPACE_RESET_MIXING__BG_MX_FLAG:
				return BG_MX_FLAG_EDEFAULT == null ? bgMxFlag != null : !BG_MX_FLAG_EDEFAULT.equals(bgMxFlag);
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
		result.append(" (BgMxFlag: ");
		result.append(bgMxFlag);
		result.append(')');
		return result.toString();
	}

} //PresentationSpaceResetMixingImpl
