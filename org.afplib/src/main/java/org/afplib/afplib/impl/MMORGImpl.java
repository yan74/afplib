/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MMORG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MMORG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MMORGImpl#getOVLid <em>OV Lid</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MMORGImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MMORGImpl#getOVLname <em>OV Lname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MMORGImpl extends TripletImpl implements MMORG {
	/**
	 * The default value of the '{@link #getOVLid() <em>OV Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVLid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OV_LID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOVLid() <em>OV Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVLid()
	 * @generated
	 * @ordered
	 */
	protected Integer ovLid = OV_LID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFlags() <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer flags = FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOVLname() <em>OV Lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVLname()
	 * @generated
	 * @ordered
	 */
	protected static final String OV_LNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOVLname() <em>OV Lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVLname()
	 * @generated
	 * @ordered
	 */
	protected String ovLname = OV_LNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MMORGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.MMORG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOVLid() {
		return ovLid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVLid(Integer newOVLid) {
		Integer oldOVLid = ovLid;
		ovLid = newOVLid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MMORG__OV_LID, oldOVLid, ovLid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFlags() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlags(Integer newFlags) {
		Integer oldFlags = flags;
		flags = newFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MMORG__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOVLname() {
		return ovLname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVLname(String newOVLname) {
		String oldOVLname = ovLname;
		ovLname = newOVLname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MMORG__OV_LNAME, oldOVLname, ovLname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MMORG__OV_LID:
				return getOVLid();
			case AfplibPackage.MMORG__FLAGS:
				return getFlags();
			case AfplibPackage.MMORG__OV_LNAME:
				return getOVLname();
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
			case AfplibPackage.MMORG__OV_LID:
				setOVLid((Integer)newValue);
				return;
			case AfplibPackage.MMORG__FLAGS:
				setFlags((Integer)newValue);
				return;
			case AfplibPackage.MMORG__OV_LNAME:
				setOVLname((String)newValue);
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
			case AfplibPackage.MMORG__OV_LID:
				setOVLid(OV_LID_EDEFAULT);
				return;
			case AfplibPackage.MMORG__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case AfplibPackage.MMORG__OV_LNAME:
				setOVLname(OV_LNAME_EDEFAULT);
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
			case AfplibPackage.MMORG__OV_LID:
				return OV_LID_EDEFAULT == null ? ovLid != null : !OV_LID_EDEFAULT.equals(ovLid);
			case AfplibPackage.MMORG__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case AfplibPackage.MMORG__OV_LNAME:
				return OV_LNAME_EDEFAULT == null ? ovLname != null : !OV_LNAME_EDEFAULT.equals(ovLname);
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
		result.append(" (OVLid: ");
		result.append(ovLid);
		result.append(", Flags: ");
		result.append(flags);
		result.append(", OVLname: ");
		result.append(ovLname);
		result.append(')');
		return result.toString();
	}

} //MMORGImpl
