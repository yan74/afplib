/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IDEStructure;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IDE Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IDEStructureImpl#getFLAGS <em>FLAGS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDEStructureImpl#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDEStructureImpl#getSIZE1 <em>SIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDEStructureImpl#getSIZE2 <em>SIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDEStructureImpl#getSIZE3 <em>SIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDEStructureImpl#getSIZE4 <em>SIZE4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDEStructureImpl extends TripletImpl implements IDEStructure {
	/**
	 * The default value of the '{@link #getFLAGS() <em>FLAGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAGS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFLAGS() <em>FLAGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAGS()
	 * @generated
	 * @ordered
	 */
	protected Integer flags = FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFORMAT() <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMAT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFORMAT() <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMAT()
	 * @generated
	 * @ordered
	 */
	protected Integer format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIZE1() <em>SIZE1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIZE1() <em>SIZE1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE1()
	 * @generated
	 * @ordered
	 */
	protected Integer size1 = SIZE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIZE2() <em>SIZE2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIZE2() <em>SIZE2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE2()
	 * @generated
	 * @ordered
	 */
	protected Integer size2 = SIZE2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIZE3() <em>SIZE3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE3()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIZE3() <em>SIZE3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE3()
	 * @generated
	 * @ordered
	 */
	protected Integer size3 = SIZE3_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIZE4() <em>SIZE4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE4()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIZE4() <em>SIZE4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIZE4()
	 * @generated
	 * @ordered
	 */
	protected Integer size4 = SIZE4_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDEStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIDEStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFLAGS() {
		return flags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFLAGS(Integer newFLAGS) {
		Integer oldFLAGS = flags;
		flags = newFLAGS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDE_STRUCTURE__FLAGS, oldFLAGS, flags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFORMAT() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFORMAT(Integer newFORMAT) {
		Integer oldFORMAT = format;
		format = newFORMAT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDE_STRUCTURE__FORMAT, oldFORMAT, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSIZE1() {
		return size1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIZE1(Integer newSIZE1) {
		Integer oldSIZE1 = size1;
		size1 = newSIZE1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDE_STRUCTURE__SIZE1, oldSIZE1, size1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSIZE2() {
		return size2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIZE2(Integer newSIZE2) {
		Integer oldSIZE2 = size2;
		size2 = newSIZE2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDE_STRUCTURE__SIZE2, oldSIZE2, size2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSIZE3() {
		return size3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIZE3(Integer newSIZE3) {
		Integer oldSIZE3 = size3;
		size3 = newSIZE3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDE_STRUCTURE__SIZE3, oldSIZE3, size3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSIZE4() {
		return size4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIZE4(Integer newSIZE4) {
		Integer oldSIZE4 = size4;
		size4 = newSIZE4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDE_STRUCTURE__SIZE4, oldSIZE4, size4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IDE_STRUCTURE__FLAGS:
				return getFLAGS();
			case AfplibPackage.IDE_STRUCTURE__FORMAT:
				return getFORMAT();
			case AfplibPackage.IDE_STRUCTURE__SIZE1:
				return getSIZE1();
			case AfplibPackage.IDE_STRUCTURE__SIZE2:
				return getSIZE2();
			case AfplibPackage.IDE_STRUCTURE__SIZE3:
				return getSIZE3();
			case AfplibPackage.IDE_STRUCTURE__SIZE4:
				return getSIZE4();
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
			case AfplibPackage.IDE_STRUCTURE__FLAGS:
				setFLAGS((Integer)newValue);
				return;
			case AfplibPackage.IDE_STRUCTURE__FORMAT:
				setFORMAT((Integer)newValue);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE1:
				setSIZE1((Integer)newValue);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE2:
				setSIZE2((Integer)newValue);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE3:
				setSIZE3((Integer)newValue);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE4:
				setSIZE4((Integer)newValue);
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
			case AfplibPackage.IDE_STRUCTURE__FLAGS:
				setFLAGS(FLAGS_EDEFAULT);
				return;
			case AfplibPackage.IDE_STRUCTURE__FORMAT:
				setFORMAT(FORMAT_EDEFAULT);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE1:
				setSIZE1(SIZE1_EDEFAULT);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE2:
				setSIZE2(SIZE2_EDEFAULT);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE3:
				setSIZE3(SIZE3_EDEFAULT);
				return;
			case AfplibPackage.IDE_STRUCTURE__SIZE4:
				setSIZE4(SIZE4_EDEFAULT);
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
			case AfplibPackage.IDE_STRUCTURE__FLAGS:
				return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
			case AfplibPackage.IDE_STRUCTURE__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case AfplibPackage.IDE_STRUCTURE__SIZE1:
				return SIZE1_EDEFAULT == null ? size1 != null : !SIZE1_EDEFAULT.equals(size1);
			case AfplibPackage.IDE_STRUCTURE__SIZE2:
				return SIZE2_EDEFAULT == null ? size2 != null : !SIZE2_EDEFAULT.equals(size2);
			case AfplibPackage.IDE_STRUCTURE__SIZE3:
				return SIZE3_EDEFAULT == null ? size3 != null : !SIZE3_EDEFAULT.equals(size3);
			case AfplibPackage.IDE_STRUCTURE__SIZE4:
				return SIZE4_EDEFAULT == null ? size4 != null : !SIZE4_EDEFAULT.equals(size4);
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
		result.append(" (FLAGS: ");
		result.append(flags);
		result.append(", FORMAT: ");
		result.append(format);
		result.append(", SIZE1: ");
		result.append(size1);
		result.append(", SIZE2: ");
		result.append(size2);
		result.append(", SIZE3: ");
		result.append(size3);
		result.append(", SIZE4: ");
		result.append(size4);
		result.append(')');
		return result.toString();
	}

} //IDEStructureImpl
