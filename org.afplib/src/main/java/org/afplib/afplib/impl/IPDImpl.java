/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IPD;

import org.afplib.base.Triplet;

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
 * An implementation of the model object '<em><b>IPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IPDImpl#getSdfs <em>Sdfs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPDImpl#getImageData <em>Image Data</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IPDImpl extends SFImpl implements IPD {
	/**
	 * The cached value of the '{@link #getSdfs() <em>Sdfs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSdfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplet> sdfs;

	/**
	 * The default value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] IMAGE_DATA_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageData()
	 * @generated
	 * @ordered
	 */
	protected byte[] imageData = IMAGE_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIPD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getSdfs() {
		if (sdfs == null) {
			sdfs = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IPD__SDFS);
		}
		return sdfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getImageData() {
		return imageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageData(byte[] newImageData) {
		byte[] oldImageData = imageData;
		imageData = newImageData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPD__IMAGE_DATA, oldImageData, imageData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.IPD__SDFS:
				return ((InternalEList<?>)getSdfs()).basicRemove(otherEnd, msgs);
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
			case AfplibPackage.IPD__SDFS:
				return getSdfs();
			case AfplibPackage.IPD__IMAGE_DATA:
				return getImageData();
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
			case AfplibPackage.IPD__SDFS:
				getSdfs().clear();
				getSdfs().addAll((Collection<? extends Triplet>)newValue);
				return;
			case AfplibPackage.IPD__IMAGE_DATA:
				setImageData((byte[])newValue);
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
			case AfplibPackage.IPD__SDFS:
				getSdfs().clear();
				return;
			case AfplibPackage.IPD__IMAGE_DATA:
				setImageData(IMAGE_DATA_EDEFAULT);
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
			case AfplibPackage.IPD__SDFS:
				return sdfs != null && !sdfs.isEmpty();
			case AfplibPackage.IPD__IMAGE_DATA:
				return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
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
		result.append(" (imageData: ");
		result.append(imageData);
		result.append(')');
		return result.toString();
	}

} //IPDImpl
