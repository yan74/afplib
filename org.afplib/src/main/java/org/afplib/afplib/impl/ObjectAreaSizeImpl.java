/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectAreaSize;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Area Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectAreaSizeImpl#getSizeType <em>Size Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectAreaSizeImpl#getXoaSize <em>Xoa Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectAreaSizeImpl#getYoaSize <em>Yoa Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectAreaSizeImpl extends TripletImpl implements ObjectAreaSize {
	/**
	 * The default value of the '{@link #getSizeType() <em>Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSizeType() <em>Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeType()
	 * @generated
	 * @ordered
	 */
	protected Integer sizeType = SIZE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXoaSize() <em>Xoa Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXoaSize() <em>Xoa Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXoaSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xoaSize = XOA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYoaSize() <em>Yoa Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYoaSize() <em>Yoa Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYoaSize()
	 * @generated
	 * @ordered
	 */
	protected Integer yoaSize = YOA_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectAreaSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getObjectAreaSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSizeType() {
		return sizeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeType(Integer newSizeType) {
		Integer oldSizeType = sizeType;
		sizeType = newSizeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE, oldSizeType, sizeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXoaSize() {
		return xoaSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXoaSize(Integer newXoaSize) {
		Integer oldXoaSize = xoaSize;
		xoaSize = newXoaSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE, oldXoaSize, xoaSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYoaSize() {
		return yoaSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYoaSize(Integer newYoaSize) {
		Integer oldYoaSize = yoaSize;
		yoaSize = newYoaSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE, oldYoaSize, yoaSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE:
				return getSizeType();
			case AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE:
				return getXoaSize();
			case AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE:
				return getYoaSize();
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
			case AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE:
				setSizeType((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE:
				setXoaSize((Integer)newValue);
				return;
			case AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE:
				setYoaSize((Integer)newValue);
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
			case AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE:
				setSizeType(SIZE_TYPE_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE:
				setXoaSize(XOA_SIZE_EDEFAULT);
				return;
			case AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE:
				setYoaSize(YOA_SIZE_EDEFAULT);
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
			case AfplibPackage.OBJECT_AREA_SIZE__SIZE_TYPE:
				return SIZE_TYPE_EDEFAULT == null ? sizeType != null : !SIZE_TYPE_EDEFAULT.equals(sizeType);
			case AfplibPackage.OBJECT_AREA_SIZE__XOA_SIZE:
				return XOA_SIZE_EDEFAULT == null ? xoaSize != null : !XOA_SIZE_EDEFAULT.equals(xoaSize);
			case AfplibPackage.OBJECT_AREA_SIZE__YOA_SIZE:
				return YOA_SIZE_EDEFAULT == null ? yoaSize != null : !YOA_SIZE_EDEFAULT.equals(yoaSize);
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
		result.append(" (SizeType: ");
		result.append(sizeType);
		result.append(", XoaSize: ");
		result.append(xoaSize);
		result.append(", YoaSize: ");
		result.append(yoaSize);
		result.append(')');
		return result.toString();
	}

} //ObjectAreaSizeImpl
