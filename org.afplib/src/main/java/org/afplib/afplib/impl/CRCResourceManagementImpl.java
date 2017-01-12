/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CRCResourceManagement;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CRC Resource Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CRCResourceManagementImpl#getFmtQual <em>Fmt Qual</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CRCResourceManagementImpl#getRMValue <em>RM Value</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CRCResourceManagementImpl#getResClassFlg <em>Res Class Flg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CRCResourceManagementImpl extends TripletImpl implements CRCResourceManagement {
	/**
	 * The default value of the '{@link #getFmtQual() <em>Fmt Qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmtQual()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FMT_QUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFmtQual() <em>Fmt Qual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmtQual()
	 * @generated
	 * @ordered
	 */
	protected Integer fmtQual = FMT_QUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRMValue() <em>RM Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RM_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRMValue() <em>RM Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMValue()
	 * @generated
	 * @ordered
	 */
	protected Integer rmValue = RM_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResClassFlg() <em>Res Class Flg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResClassFlg()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_CLASS_FLG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResClassFlg() <em>Res Class Flg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResClassFlg()
	 * @generated
	 * @ordered
	 */
	protected Integer resClassFlg = RES_CLASS_FLG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CRCResourceManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.CRC_RESOURCE_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFmtQual() {
		return fmtQual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmtQual(Integer newFmtQual) {
		Integer oldFmtQual = fmtQual;
		fmtQual = newFmtQual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CRC_RESOURCE_MANAGEMENT__FMT_QUAL, oldFmtQual, fmtQual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRMValue() {
		return rmValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMValue(Integer newRMValue) {
		Integer oldRMValue = rmValue;
		rmValue = newRMValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CRC_RESOURCE_MANAGEMENT__RM_VALUE, oldRMValue, rmValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getResClassFlg() {
		return resClassFlg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResClassFlg(Integer newResClassFlg) {
		Integer oldResClassFlg = resClassFlg;
		resClassFlg = newResClassFlg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CRC_RESOURCE_MANAGEMENT__RES_CLASS_FLG, oldResClassFlg, resClassFlg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__FMT_QUAL:
				return getFmtQual();
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RM_VALUE:
				return getRMValue();
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RES_CLASS_FLG:
				return getResClassFlg();
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
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__FMT_QUAL:
				setFmtQual((Integer)newValue);
				return;
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RM_VALUE:
				setRMValue((Integer)newValue);
				return;
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RES_CLASS_FLG:
				setResClassFlg((Integer)newValue);
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
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__FMT_QUAL:
				setFmtQual(FMT_QUAL_EDEFAULT);
				return;
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RM_VALUE:
				setRMValue(RM_VALUE_EDEFAULT);
				return;
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RES_CLASS_FLG:
				setResClassFlg(RES_CLASS_FLG_EDEFAULT);
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
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__FMT_QUAL:
				return FMT_QUAL_EDEFAULT == null ? fmtQual != null : !FMT_QUAL_EDEFAULT.equals(fmtQual);
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RM_VALUE:
				return RM_VALUE_EDEFAULT == null ? rmValue != null : !RM_VALUE_EDEFAULT.equals(rmValue);
			case AfplibPackage.CRC_RESOURCE_MANAGEMENT__RES_CLASS_FLG:
				return RES_CLASS_FLG_EDEFAULT == null ? resClassFlg != null : !RES_CLASS_FLG_EDEFAULT.equals(resClassFlg);
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
		result.append(" (FmtQual: ");
		result.append(fmtQual);
		result.append(", RMValue: ");
		result.append(rmValue);
		result.append(", ResClassFlg: ");
		result.append(resClassFlg);
		result.append(')');
		return result.toString();
	}

} //CRCResourceManagementImpl
