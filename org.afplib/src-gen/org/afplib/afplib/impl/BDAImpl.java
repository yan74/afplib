/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BDA;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BDA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BDAImpl#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDAImpl#getXoffset <em>Xoffset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDAImpl#getYoffset <em>Yoffset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDAImpl#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BDAImpl extends SFImpl implements BDA {
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
	 * The default value of the '{@link #getXoffset() <em>Xoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXoffset() <em>Xoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoffset()
	 * @generated
	 * @ordered
	 */
	protected Integer xoffset = XOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoffset() <em>Yoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoffset() <em>Yoffset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoffset()
	 * @generated
	 * @ordered
	 */
	protected Integer yoffset = YOFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BDAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getBDA();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDA__FLAGS, oldFlags, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXoffset() {
		return xoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoffset(Integer newXoffset) {
		Integer oldXoffset = xoffset;
		xoffset = newXoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDA__XOFFSET, oldXoffset, xoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYoffset() {
		return yoffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoffset(Integer newYoffset) {
		Integer oldYoffset = yoffset;
		yoffset = newYoffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDA__YOFFSET, oldYoffset, yoffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDA__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.BDA__FLAGS:
				return getFlags();
			case AfplibPackage.BDA__XOFFSET:
				return getXoffset();
			case AfplibPackage.BDA__YOFFSET:
				return getYoffset();
			case AfplibPackage.BDA__DATA:
				return getData();
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
			case AfplibPackage.BDA__FLAGS:
				setFlags((Integer)newValue);
				return;
			case AfplibPackage.BDA__XOFFSET:
				setXoffset((Integer)newValue);
				return;
			case AfplibPackage.BDA__YOFFSET:
				setYoffset((Integer)newValue);
				return;
			case AfplibPackage.BDA__DATA:
				setData((byte[])newValue);
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
			case AfplibPackage.BDA__FLAGS:
				setFlags(FLAGS_EDEFAULT);
				return;
			case AfplibPackage.BDA__XOFFSET:
				setXoffset(XOFFSET_EDEFAULT);
				return;
			case AfplibPackage.BDA__YOFFSET:
				setYoffset(YOFFSET_EDEFAULT);
				return;
			case AfplibPackage.BDA__DATA:
				setData(DATA_EDEFAULT);
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
			case AfplibPackage.BDA__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case AfplibPackage.BDA__XOFFSET:
				return XOFFSET_EDEFAULT == null ? xoffset != null : !XOFFSET_EDEFAULT.equals(xoffset);
			case AfplibPackage.BDA__YOFFSET:
				return YOFFSET_EDEFAULT == null ? yoffset != null : !YOFFSET_EDEFAULT.equals(yoffset);
			case AfplibPackage.BDA__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
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
		result.append(" (Flags: ");
		result.append(flags);
		result.append(", Xoffset: ");
		result.append(xoffset);
		result.append(", Yoffset: ");
		result.append(yoffset);
		result.append(", Data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //BDAImpl
