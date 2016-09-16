/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ImageEncoding;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Encoding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ImageEncodingImpl#getCOMPRID <em>COMPRID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageEncodingImpl#getRECID <em>RECID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ImageEncodingImpl#getBITORDR <em>BITORDR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageEncodingImpl extends TripletImpl implements ImageEncoding {
	/**
	 * The default value of the '{@link #getCOMPRID() <em>COMPRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOMPRID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOMPRID() <em>COMPRID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOMPRID()
	 * @generated
	 * @ordered
	 */
	protected Integer comprid = COMPRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRECID() <em>RECID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRECID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RECID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRECID() <em>RECID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRECID()
	 * @generated
	 * @ordered
	 */
	protected Integer recid = RECID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBITORDR() <em>BITORDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBITORDR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BITORDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBITORDR() <em>BITORDR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBITORDR()
	 * @generated
	 * @ordered
	 */
	protected Integer bitordr = BITORDR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageEncodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getImageEncoding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCOMPRID() {
		return comprid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOMPRID(Integer newCOMPRID) {
		Integer oldCOMPRID = comprid;
		comprid = newCOMPRID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_ENCODING__COMPRID, oldCOMPRID, comprid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRECID() {
		return recid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRECID(Integer newRECID) {
		Integer oldRECID = recid;
		recid = newRECID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_ENCODING__RECID, oldRECID, recid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBITORDR() {
		return bitordr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBITORDR(Integer newBITORDR) {
		Integer oldBITORDR = bitordr;
		bitordr = newBITORDR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IMAGE_ENCODING__BITORDR, oldBITORDR, bitordr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IMAGE_ENCODING__COMPRID:
				return getCOMPRID();
			case AfplibPackage.IMAGE_ENCODING__RECID:
				return getRECID();
			case AfplibPackage.IMAGE_ENCODING__BITORDR:
				return getBITORDR();
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
			case AfplibPackage.IMAGE_ENCODING__COMPRID:
				setCOMPRID((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_ENCODING__RECID:
				setRECID((Integer)newValue);
				return;
			case AfplibPackage.IMAGE_ENCODING__BITORDR:
				setBITORDR((Integer)newValue);
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
			case AfplibPackage.IMAGE_ENCODING__COMPRID:
				setCOMPRID(COMPRID_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_ENCODING__RECID:
				setRECID(RECID_EDEFAULT);
				return;
			case AfplibPackage.IMAGE_ENCODING__BITORDR:
				setBITORDR(BITORDR_EDEFAULT);
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
			case AfplibPackage.IMAGE_ENCODING__COMPRID:
				return COMPRID_EDEFAULT == null ? comprid != null : !COMPRID_EDEFAULT.equals(comprid);
			case AfplibPackage.IMAGE_ENCODING__RECID:
				return RECID_EDEFAULT == null ? recid != null : !RECID_EDEFAULT.equals(recid);
			case AfplibPackage.IMAGE_ENCODING__BITORDR:
				return BITORDR_EDEFAULT == null ? bitordr != null : !BITORDR_EDEFAULT.equals(bitordr);
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
		result.append(" (COMPRID: ");
		result.append(comprid);
		result.append(", RECID: ");
		result.append(recid);
		result.append(", BITORDR: ");
		result.append(bitordr);
		result.append(')');
		return result.toString();
	}

} //ImageEncodingImpl
