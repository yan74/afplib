/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MPS;
import org.afplib.afplib.MPSRG;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MPSImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MPSImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MPSImpl#getFixedLengthRG <em>Fixed Length RG</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MPSImpl extends SFImpl implements MPS {
	/**
	 * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RG_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected Integer rgLength = RG_LENGTH_EDEFAULT;

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
	 * The cached value of the '{@link #getFixedLengthRG() <em>Fixed Length RG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedLengthRG()
	 * @generated
	 * @ordered
	 */
	protected EList<MPSRG> fixedLengthRG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRGLength() {
		return rgLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGLength(Integer newRGLength) {
		Integer oldRGLength = rgLength;
		rgLength = newRGLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MPS__RG_LENGTH, oldRGLength, rgLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MPS__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MPSRG> getFixedLengthRG() {
		if (fixedLengthRG == null) {
			fixedLengthRG = new EObjectContainmentEList.Resolving<MPSRG>(MPSRG.class, this, AfplibPackage.MPS__FIXED_LENGTH_RG);
		}
		return fixedLengthRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.MPS__FIXED_LENGTH_RG:
				return ((InternalEList<?>)getFixedLengthRG()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MPS__RG_LENGTH:
				return getRGLength();
			case AfplibPackage.MPS__RESERVED:
				return getReserved();
			case AfplibPackage.MPS__FIXED_LENGTH_RG:
				return getFixedLengthRG();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.MPS__RG_LENGTH:
				setRGLength((Integer)newValue);
				return;
			case AfplibPackage.MPS__RESERVED:
				setReserved((byte[])newValue);
				return;
			case AfplibPackage.MPS__FIXED_LENGTH_RG:
				getFixedLengthRG().clear();
				getFixedLengthRG().addAll((Collection<? extends MPSRG>)newValue);
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
			case AfplibPackage.MPS__RG_LENGTH:
				setRGLength(RG_LENGTH_EDEFAULT);
				return;
			case AfplibPackage.MPS__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.MPS__FIXED_LENGTH_RG:
				getFixedLengthRG().clear();
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
			case AfplibPackage.MPS__RG_LENGTH:
				return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
			case AfplibPackage.MPS__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.MPS__FIXED_LENGTH_RG:
				return fixedLengthRG != null && !fixedLengthRG.isEmpty();
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
		result.append(" (RGLength: ");
		result.append(rgLength);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(')');
		return result.toString();
	}

} //MPSImpl
