/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GSCC;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSCC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GSCCImpl#getCELLWI <em>CELLWI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSCCImpl#getCELLHI <em>CELLHI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSCCImpl#getCELLWFR <em>CELLWFR</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSCCImpl#getCELLHFR <em>CELLHFR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSCCImpl extends TripletImpl implements GSCC {
	/**
	 * The default value of the '{@link #getCELLWI() <em>CELLWI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLWI()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CELLWI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCELLWI() <em>CELLWI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLWI()
	 * @generated
	 * @ordered
	 */
	protected Integer cellwi = CELLWI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCELLHI() <em>CELLHI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLHI()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CELLHI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCELLHI() <em>CELLHI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLHI()
	 * @generated
	 * @ordered
	 */
	protected Integer cellhi = CELLHI_EDEFAULT;

	/**
	 * The default value of the '{@link #getCELLWFR() <em>CELLWFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLWFR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CELLWFR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCELLWFR() <em>CELLWFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLWFR()
	 * @generated
	 * @ordered
	 */
	protected Integer cellwfr = CELLWFR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCELLHFR() <em>CELLHFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLHFR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CELLHFR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCELLHFR() <em>CELLHFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCELLHFR()
	 * @generated
	 * @ordered
	 */
	protected Integer cellhfr = CELLHFR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSCCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGSCC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCELLWI() {
		return cellwi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCELLWI(Integer newCELLWI) {
		Integer oldCELLWI = cellwi;
		cellwi = newCELLWI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSCC__CELLWI, oldCELLWI, cellwi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCELLHI() {
		return cellhi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCELLHI(Integer newCELLHI) {
		Integer oldCELLHI = cellhi;
		cellhi = newCELLHI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSCC__CELLHI, oldCELLHI, cellhi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCELLWFR() {
		return cellwfr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCELLWFR(Integer newCELLWFR) {
		Integer oldCELLWFR = cellwfr;
		cellwfr = newCELLWFR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSCC__CELLWFR, oldCELLWFR, cellwfr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCELLHFR() {
		return cellhfr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCELLHFR(Integer newCELLHFR) {
		Integer oldCELLHFR = cellhfr;
		cellhfr = newCELLHFR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSCC__CELLHFR, oldCELLHFR, cellhfr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GSCC__CELLWI:
				return getCELLWI();
			case AfplibPackage.GSCC__CELLHI:
				return getCELLHI();
			case AfplibPackage.GSCC__CELLWFR:
				return getCELLWFR();
			case AfplibPackage.GSCC__CELLHFR:
				return getCELLHFR();
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
			case AfplibPackage.GSCC__CELLWI:
				setCELLWI((Integer)newValue);
				return;
			case AfplibPackage.GSCC__CELLHI:
				setCELLHI((Integer)newValue);
				return;
			case AfplibPackage.GSCC__CELLWFR:
				setCELLWFR((Integer)newValue);
				return;
			case AfplibPackage.GSCC__CELLHFR:
				setCELLHFR((Integer)newValue);
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
			case AfplibPackage.GSCC__CELLWI:
				setCELLWI(CELLWI_EDEFAULT);
				return;
			case AfplibPackage.GSCC__CELLHI:
				setCELLHI(CELLHI_EDEFAULT);
				return;
			case AfplibPackage.GSCC__CELLWFR:
				setCELLWFR(CELLWFR_EDEFAULT);
				return;
			case AfplibPackage.GSCC__CELLHFR:
				setCELLHFR(CELLHFR_EDEFAULT);
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
			case AfplibPackage.GSCC__CELLWI:
				return CELLWI_EDEFAULT == null ? cellwi != null : !CELLWI_EDEFAULT.equals(cellwi);
			case AfplibPackage.GSCC__CELLHI:
				return CELLHI_EDEFAULT == null ? cellhi != null : !CELLHI_EDEFAULT.equals(cellhi);
			case AfplibPackage.GSCC__CELLWFR:
				return CELLWFR_EDEFAULT == null ? cellwfr != null : !CELLWFR_EDEFAULT.equals(cellwfr);
			case AfplibPackage.GSCC__CELLHFR:
				return CELLHFR_EDEFAULT == null ? cellhfr != null : !CELLHFR_EDEFAULT.equals(cellhfr);
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
		result.append(" (CELLWI: ");
		result.append(cellwi);
		result.append(", CELLHI: ");
		result.append(cellhi);
		result.append(", CELLWFR: ");
		result.append(cellwfr);
		result.append(", CELLHFR: ");
		result.append(cellhfr);
		result.append(')');
		return result.toString();
	}

} //GSCCImpl
