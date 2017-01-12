/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FullyQualifiedName;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fully Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FullyQualifiedNameImpl#getFQNType <em>FQN Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FullyQualifiedNameImpl#getFQNFormat <em>FQN Format</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FullyQualifiedNameImpl#getFQName <em>FQ Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FullyQualifiedNameImpl extends TripletImpl implements FullyQualifiedName {
	/**
	 * The default value of the '{@link #getFQNType() <em>FQN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQNType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FQN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFQNType() <em>FQN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQNType()
	 * @generated
	 * @ordered
	 */
	protected Integer fqnType = FQN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFQNFormat() <em>FQN Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQNFormat()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FQN_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFQNFormat() <em>FQN Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQNFormat()
	 * @generated
	 * @ordered
	 */
	protected Integer fqnFormat = FQN_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFQName() <em>FQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQName()
	 * @generated
	 * @ordered
	 */
	protected static final String FQ_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFQName() <em>FQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFQName()
	 * @generated
	 * @ordered
	 */
	protected String fqName = FQ_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullyQualifiedNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.FULLY_QUALIFIED_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFQNType() {
		return fqnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFQNType(Integer newFQNType) {
		Integer oldFQNType = fqnType;
		fqnType = newFQNType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE, oldFQNType, fqnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFQNFormat() {
		return fqnFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFQNFormat(Integer newFQNFormat) {
		Integer oldFQNFormat = fqnFormat;
		fqnFormat = newFQNFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT, oldFQNFormat, fqnFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFQName() {
		return fqName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFQName(String newFQName) {
		String oldFQName = fqName;
		fqName = newFQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME, oldFQName, fqName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE:
				return getFQNType();
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT:
				return getFQNFormat();
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME:
				return getFQName();
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
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE:
				setFQNType((Integer)newValue);
				return;
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT:
				setFQNFormat((Integer)newValue);
				return;
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME:
				setFQName((String)newValue);
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
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE:
				setFQNType(FQN_TYPE_EDEFAULT);
				return;
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT:
				setFQNFormat(FQN_FORMAT_EDEFAULT);
				return;
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME:
				setFQName(FQ_NAME_EDEFAULT);
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
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_TYPE:
				return FQN_TYPE_EDEFAULT == null ? fqnType != null : !FQN_TYPE_EDEFAULT.equals(fqnType);
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQN_FORMAT:
				return FQN_FORMAT_EDEFAULT == null ? fqnFormat != null : !FQN_FORMAT_EDEFAULT.equals(fqnFormat);
			case AfplibPackage.FULLY_QUALIFIED_NAME__FQ_NAME:
				return FQ_NAME_EDEFAULT == null ? fqName != null : !FQ_NAME_EDEFAULT.equals(fqName);
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
		result.append(" (FQNType: ");
		result.append(fqnType);
		result.append(", FQNFormat: ");
		result.append(fqnFormat);
		result.append(", FQName: ");
		result.append(fqName);
		result.append(')');
		return result.toString();
	}

} //FullyQualifiedNameImpl
