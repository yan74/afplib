/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BeginSegmentCommand;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Begin Segment Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BeginSegmentCommandImpl#getLENGTH <em>LENGTH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BeginSegmentCommandImpl#getNAME <em>NAME</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BeginSegmentCommandImpl#getFLAG1 <em>FLAG1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BeginSegmentCommandImpl#getFLAG2 <em>FLAG2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BeginSegmentCommandImpl#getSEGL <em>SEGL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BeginSegmentCommandImpl#getPSNAME <em>PSNAME</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeginSegmentCommandImpl extends TripletImpl implements BeginSegmentCommand {
	/**
	 * The default value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLENGTH()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLENGTH() <em>LENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLENGTH()
	 * @generated
	 * @ordered
	 */
	protected Integer length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNAME() <em>NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAME()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNAME() <em>NAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNAME()
	 * @generated
	 * @ordered
	 */
	protected Integer name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAG1() <em>FLAG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAG1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLAG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFLAG1() <em>FLAG1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAG1()
	 * @generated
	 * @ordered
	 */
	protected Integer flag1 = FLAG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAG2() <em>FLAG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAG2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FLAG2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFLAG2() <em>FLAG2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAG2()
	 * @generated
	 * @ordered
	 */
	protected Integer flag2 = FLAG2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSEGL() <em>SEGL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEGL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SEGL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSEGL() <em>SEGL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEGL()
	 * @generated
	 * @ordered
	 */
	protected Integer segl = SEGL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPSNAME() <em>PSNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String PSNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPSNAME() <em>PSNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSNAME()
	 * @generated
	 * @ordered
	 */
	protected String psname = PSNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeginSegmentCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.BEGIN_SEGMENT_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLENGTH() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLENGTH(Integer newLENGTH) {
		Integer oldLENGTH = length;
		length = newLENGTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BEGIN_SEGMENT_COMMAND__LENGTH, oldLENGTH, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNAME() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNAME(Integer newNAME) {
		Integer oldNAME = name;
		name = newNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BEGIN_SEGMENT_COMMAND__NAME, oldNAME, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFLAG1() {
		return flag1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFLAG1(Integer newFLAG1) {
		Integer oldFLAG1 = flag1;
		flag1 = newFLAG1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG1, oldFLAG1, flag1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFLAG2() {
		return flag2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFLAG2(Integer newFLAG2) {
		Integer oldFLAG2 = flag2;
		flag2 = newFLAG2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG2, oldFLAG2, flag2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSEGL() {
		return segl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSEGL(Integer newSEGL) {
		Integer oldSEGL = segl;
		segl = newSEGL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BEGIN_SEGMENT_COMMAND__SEGL, oldSEGL, segl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPSNAME() {
		return psname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSNAME(String newPSNAME) {
		String oldPSNAME = psname;
		psname = newPSNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BEGIN_SEGMENT_COMMAND__PSNAME, oldPSNAME, psname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__LENGTH:
				return getLENGTH();
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__NAME:
				return getNAME();
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG1:
				return getFLAG1();
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG2:
				return getFLAG2();
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__SEGL:
				return getSEGL();
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__PSNAME:
				return getPSNAME();
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
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__LENGTH:
				setLENGTH((Integer)newValue);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__NAME:
				setNAME((Integer)newValue);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG1:
				setFLAG1((Integer)newValue);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG2:
				setFLAG2((Integer)newValue);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__SEGL:
				setSEGL((Integer)newValue);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__PSNAME:
				setPSNAME((String)newValue);
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
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__LENGTH:
				setLENGTH(LENGTH_EDEFAULT);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__NAME:
				setNAME(NAME_EDEFAULT);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG1:
				setFLAG1(FLAG1_EDEFAULT);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG2:
				setFLAG2(FLAG2_EDEFAULT);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__SEGL:
				setSEGL(SEGL_EDEFAULT);
				return;
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__PSNAME:
				setPSNAME(PSNAME_EDEFAULT);
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
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__LENGTH:
				return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG1:
				return FLAG1_EDEFAULT == null ? flag1 != null : !FLAG1_EDEFAULT.equals(flag1);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__FLAG2:
				return FLAG2_EDEFAULT == null ? flag2 != null : !FLAG2_EDEFAULT.equals(flag2);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__SEGL:
				return SEGL_EDEFAULT == null ? segl != null : !SEGL_EDEFAULT.equals(segl);
			case AfplibPackage.BEGIN_SEGMENT_COMMAND__PSNAME:
				return PSNAME_EDEFAULT == null ? psname != null : !PSNAME_EDEFAULT.equals(psname);
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
		result.append(" (LENGTH: ");
		result.append(length);
		result.append(", NAME: ");
		result.append(name);
		result.append(", FLAG1: ");
		result.append(flag1);
		result.append(", FLAG2: ");
		result.append(flag2);
		result.append(", SEGL: ");
		result.append(segl);
		result.append(", PSNAME: ");
		result.append(psname);
		result.append(')');
		return result.toString();
	}

} //BeginSegmentCommandImpl
