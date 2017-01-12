/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MSURG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSURG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MSURGImpl#getSUPname <em>SU Pname</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MSURGImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MSURGImpl#getSUPid <em>SU Pid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSURGImpl extends TripletImpl implements MSURG {
	/**
	 * The default value of the '{@link #getSUPname() <em>SU Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSUPname()
	 * @generated
	 * @ordered
	 */
	protected static final String SU_PNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSUPname() <em>SU Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSUPname()
	 * @generated
	 * @ordered
	 */
	protected String suPname = SU_PNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSUPid() <em>SU Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSUPid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SU_PID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSUPid() <em>SU Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSUPid()
	 * @generated
	 * @ordered
	 */
	protected Integer suPid = SU_PID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSURGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.MSURG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSUPname() {
		return suPname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSUPname(String newSUPname) {
		String oldSUPname = suPname;
		suPname = newSUPname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MSURG__SU_PNAME, oldSUPname, suPname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(byte[] newReserved) {
		byte[] oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MSURG__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSUPid() {
		return suPid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSUPid(Integer newSUPid) {
		Integer oldSUPid = suPid;
		suPid = newSUPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MSURG__SU_PID, oldSUPid, suPid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MSURG__SU_PNAME:
				return getSUPname();
			case AfplibPackage.MSURG__RESERVED:
				return getReserved();
			case AfplibPackage.MSURG__SU_PID:
				return getSUPid();
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
			case AfplibPackage.MSURG__SU_PNAME:
				setSUPname((String)newValue);
				return;
			case AfplibPackage.MSURG__RESERVED:
				setReserved((byte[])newValue);
				return;
			case AfplibPackage.MSURG__SU_PID:
				setSUPid((Integer)newValue);
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
			case AfplibPackage.MSURG__SU_PNAME:
				setSUPname(SU_PNAME_EDEFAULT);
				return;
			case AfplibPackage.MSURG__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.MSURG__SU_PID:
				setSUPid(SU_PID_EDEFAULT);
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
			case AfplibPackage.MSURG__SU_PNAME:
				return SU_PNAME_EDEFAULT == null ? suPname != null : !SU_PNAME_EDEFAULT.equals(suPname);
			case AfplibPackage.MSURG__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.MSURG__SU_PID:
				return SU_PID_EDEFAULT == null ? suPid != null : !SU_PID_EDEFAULT.equals(suPid);
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
		result.append(" (SUPname: ");
		result.append(suPname);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(", SUPid: ");
		result.append(suPid);
		result.append(')');
		return result.toString();
	}

} //MSURGImpl
