/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.RPS;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.RPSImpl#getRLENGTH <em>RLENGTH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.RPSImpl#getRPTDATA <em>RPTDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RPSImpl extends TripletImpl implements RPS {
	/**
	 * The default value of the '{@link #getRLENGTH() <em>RLENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRLENGTH()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RLENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRLENGTH() <em>RLENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRLENGTH()
	 * @generated
	 * @ordered
	 */
	protected Integer rlength = RLENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRPTDATA() <em>RPTDATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPTDATA()
	 * @generated
	 * @ordered
	 */
	protected static final String RPTDATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPTDATA() <em>RPTDATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPTDATA()
	 * @generated
	 * @ordered
	 */
	protected String rptdata = RPTDATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getRPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRLENGTH() {
		return rlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRLENGTH(Integer newRLENGTH) {
		Integer oldRLENGTH = rlength;
		rlength = newRLENGTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RPS__RLENGTH, oldRLENGTH, rlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRPTDATA() {
		return rptdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPTDATA(String newRPTDATA) {
		String oldRPTDATA = rptdata;
		rptdata = newRPTDATA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RPS__RPTDATA, oldRPTDATA, rptdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.RPS__RLENGTH:
				return getRLENGTH();
			case AfplibPackage.RPS__RPTDATA:
				return getRPTDATA();
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
			case AfplibPackage.RPS__RLENGTH:
				setRLENGTH((Integer)newValue);
				return;
			case AfplibPackage.RPS__RPTDATA:
				setRPTDATA((String)newValue);
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
			case AfplibPackage.RPS__RLENGTH:
				setRLENGTH(RLENGTH_EDEFAULT);
				return;
			case AfplibPackage.RPS__RPTDATA:
				setRPTDATA(RPTDATA_EDEFAULT);
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
			case AfplibPackage.RPS__RLENGTH:
				return RLENGTH_EDEFAULT == null ? rlength != null : !RLENGTH_EDEFAULT.equals(rlength);
			case AfplibPackage.RPS__RPTDATA:
				return RPTDATA_EDEFAULT == null ? rptdata != null : !RPTDATA_EDEFAULT.equals(rptdata);
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
		result.append(" (RLENGTH: ");
		result.append(rlength);
		result.append(", RPTDATA: ");
		result.append(rptdata);
		result.append(')');
		return result.toString();
	}

} //RPSImpl
