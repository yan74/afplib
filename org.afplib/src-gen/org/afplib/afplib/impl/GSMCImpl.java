/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GSMC;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSMC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GSMCImpl#getCELLWI <em>CELLWI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSMCImpl#getCELLHI <em>CELLHI</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSMCImpl extends TripletImpl implements GSMC {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSMCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGSMC();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSMC__CELLWI, oldCELLWI, cellwi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSMC__CELLHI, oldCELLHI, cellhi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GSMC__CELLWI:
				return getCELLWI();
			case AfplibPackage.GSMC__CELLHI:
				return getCELLHI();
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
			case AfplibPackage.GSMC__CELLWI:
				setCELLWI((Integer)newValue);
				return;
			case AfplibPackage.GSMC__CELLHI:
				setCELLHI((Integer)newValue);
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
			case AfplibPackage.GSMC__CELLWI:
				setCELLWI(CELLWI_EDEFAULT);
				return;
			case AfplibPackage.GSMC__CELLHI:
				setCELLHI(CELLHI_EDEFAULT);
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
			case AfplibPackage.GSMC__CELLWI:
				return CELLWI_EDEFAULT == null ? cellwi != null : !CELLWI_EDEFAULT.equals(cellwi);
			case AfplibPackage.GSMC__CELLHI:
				return CELLHI_EDEFAULT == null ? cellhi != null : !CELLHI_EDEFAULT.equals(cellhi);
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
		result.append(')');
		return result.toString();
	}

} //GSMCImpl
