/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ColorManagementResourceDescriptor;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Management Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ColorManagementResourceDescriptorImpl#getProcMode <em>Proc Mode</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorManagementResourceDescriptorImpl#getCMRScpe <em>CMR Scpe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorManagementResourceDescriptorImpl extends TripletImpl implements ColorManagementResourceDescriptor {
	/**
	 * The default value of the '{@link #getProcMode() <em>Proc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcMode()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROC_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProcMode() <em>Proc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcMode()
	 * @generated
	 * @ordered
	 */
	protected Integer procMode = PROC_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCMRScpe() <em>CMR Scpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMRScpe()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CMR_SCPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCMRScpe() <em>CMR Scpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCMRScpe()
	 * @generated
	 * @ordered
	 */
	protected Integer cmrScpe = CMR_SCPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorManagementResourceDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getColorManagementResourceDescriptor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProcMode() {
		return procMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcMode(Integer newProcMode) {
		Integer oldProcMode = procMode;
		procMode = newProcMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE, oldProcMode, procMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCMRScpe() {
		return cmrScpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCMRScpe(Integer newCMRScpe) {
		Integer oldCMRScpe = cmrScpe;
		cmrScpe = newCMRScpe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE, oldCMRScpe, cmrScpe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
				return getProcMode();
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
				return getCMRScpe();
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
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
				setProcMode((Integer)newValue);
				return;
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
				setCMRScpe((Integer)newValue);
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
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
				setProcMode(PROC_MODE_EDEFAULT);
				return;
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
				setCMRScpe(CMR_SCPE_EDEFAULT);
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
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__PROC_MODE:
				return PROC_MODE_EDEFAULT == null ? procMode != null : !PROC_MODE_EDEFAULT.equals(procMode);
			case AfplibPackage.COLOR_MANAGEMENT_RESOURCE_DESCRIPTOR__CMR_SCPE:
				return CMR_SCPE_EDEFAULT == null ? cmrScpe != null : !CMR_SCPE_EDEFAULT.equals(cmrScpe);
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
		result.append(" (ProcMode: ");
		result.append(procMode);
		result.append(", CMRScpe: ");
		result.append(cmrScpe);
		result.append(')');
		return result.toString();
	}

} //ColorManagementResourceDescriptorImpl
