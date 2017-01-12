/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.DIR;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DIR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.DIRImpl#getRLENGTH <em>RLENGTH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DIRImpl#getRWIDTH <em>RWIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.DIRImpl#getRWIDTHFRACTION <em>RWIDTHFRACTION</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DIRImpl extends TripletImpl implements DIR {
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
	 * The default value of the '{@link #getRWIDTH() <em>RWIDTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRWIDTH()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRWIDTH() <em>RWIDTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRWIDTH()
	 * @generated
	 * @ordered
	 */
	protected Integer rwidth = RWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRWIDTHFRACTION() <em>RWIDTHFRACTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRWIDTHFRACTION()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RWIDTHFRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRWIDTHFRACTION() <em>RWIDTHFRACTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRWIDTHFRACTION()
	 * @generated
	 * @ordered
	 */
	protected Integer rwidthfraction = RWIDTHFRACTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DIRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.DIR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DIR__RLENGTH, oldRLENGTH, rlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRWIDTH() {
		return rwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRWIDTH(Integer newRWIDTH) {
		Integer oldRWIDTH = rwidth;
		rwidth = newRWIDTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DIR__RWIDTH, oldRWIDTH, rwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRWIDTHFRACTION() {
		return rwidthfraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRWIDTHFRACTION(Integer newRWIDTHFRACTION) {
		Integer oldRWIDTHFRACTION = rwidthfraction;
		rwidthfraction = newRWIDTHFRACTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.DIR__RWIDTHFRACTION, oldRWIDTHFRACTION, rwidthfraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.DIR__RLENGTH:
				return getRLENGTH();
			case AfplibPackage.DIR__RWIDTH:
				return getRWIDTH();
			case AfplibPackage.DIR__RWIDTHFRACTION:
				return getRWIDTHFRACTION();
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
			case AfplibPackage.DIR__RLENGTH:
				setRLENGTH((Integer)newValue);
				return;
			case AfplibPackage.DIR__RWIDTH:
				setRWIDTH((Integer)newValue);
				return;
			case AfplibPackage.DIR__RWIDTHFRACTION:
				setRWIDTHFRACTION((Integer)newValue);
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
			case AfplibPackage.DIR__RLENGTH:
				setRLENGTH(RLENGTH_EDEFAULT);
				return;
			case AfplibPackage.DIR__RWIDTH:
				setRWIDTH(RWIDTH_EDEFAULT);
				return;
			case AfplibPackage.DIR__RWIDTHFRACTION:
				setRWIDTHFRACTION(RWIDTHFRACTION_EDEFAULT);
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
			case AfplibPackage.DIR__RLENGTH:
				return RLENGTH_EDEFAULT == null ? rlength != null : !RLENGTH_EDEFAULT.equals(rlength);
			case AfplibPackage.DIR__RWIDTH:
				return RWIDTH_EDEFAULT == null ? rwidth != null : !RWIDTH_EDEFAULT.equals(rwidth);
			case AfplibPackage.DIR__RWIDTHFRACTION:
				return RWIDTHFRACTION_EDEFAULT == null ? rwidthfraction != null : !RWIDTHFRACTION_EDEFAULT.equals(rwidthfraction);
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
		result.append(", RWIDTH: ");
		result.append(rwidth);
		result.append(", RWIDTHFRACTION: ");
		result.append(rwidthfraction);
		result.append(')');
		return result.toString();
	}

} //DIRImpl
