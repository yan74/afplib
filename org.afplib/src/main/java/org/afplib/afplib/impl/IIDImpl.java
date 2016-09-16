/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IID;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getConData1 <em>Con Data1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getXBase <em>XBase</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getYBase <em>YBase</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getXUnits <em>XUnits</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getYUnits <em>YUnits</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getXSize <em>XSize</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getYSize <em>YSize</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getConData2 <em>Con Data2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getXCSizeD <em>XC Size D</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getYCSizeD <em>YC Size D</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getConData3 <em>Con Data3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IIDImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IIDImpl extends SFImpl implements IID {
	/**
	 * The default value of the '{@link #getConData1() <em>Con Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CON_DATA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConData1() <em>Con Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData1()
	 * @generated
	 * @ordered
	 */
	protected byte[] conData1 = CON_DATA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getXBase() <em>XBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXBase() <em>XBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xBase = XBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYBase() <em>YBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYBase() <em>YBase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYBase()
	 * @generated
	 * @ordered
	 */
	protected Integer yBase = YBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXUnits() <em>XUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XUNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXUnits() <em>XUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xUnits = XUNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYUnits() <em>YUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YUNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYUnits() <em>YUnits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer yUnits = YUNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xSize = XSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected Integer ySize = YSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConData2() <em>Con Data2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData2()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CON_DATA2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConData2() <em>Con Data2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData2()
	 * @generated
	 * @ordered
	 */
	protected byte[] conData2 = CON_DATA2_EDEFAULT;

	/**
	 * The default value of the '{@link #getXCSizeD() <em>XC Size D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCSizeD()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XC_SIZE_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXCSizeD() <em>XC Size D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXCSizeD()
	 * @generated
	 * @ordered
	 */
	protected Integer xcSizeD = XC_SIZE_D_EDEFAULT;

	/**
	 * The default value of the '{@link #getYCSizeD() <em>YC Size D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCSizeD()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YC_SIZE_D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYCSizeD() <em>YC Size D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYCSizeD()
	 * @generated
	 * @ordered
	 */
	protected Integer ycSizeD = YC_SIZE_D_EDEFAULT;

	/**
	 * The default value of the '{@link #getConData3() <em>Con Data3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData3()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CON_DATA3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConData3() <em>Con Data3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConData3()
	 * @generated
	 * @ordered
	 */
	protected byte[] conData3 = CON_DATA3_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Integer color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getConData1() {
		return conData1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConData1(byte[] newConData1) {
		byte[] oldConData1 = conData1;
		conData1 = newConData1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__CON_DATA1, oldConData1, conData1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXBase() {
		return xBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXBase(Integer newXBase) {
		Integer oldXBase = xBase;
		xBase = newXBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__XBASE, oldXBase, xBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYBase() {
		return yBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYBase(Integer newYBase) {
		Integer oldYBase = yBase;
		yBase = newYBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__YBASE, oldYBase, yBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXUnits() {
		return xUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXUnits(Integer newXUnits) {
		Integer oldXUnits = xUnits;
		xUnits = newXUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__XUNITS, oldXUnits, xUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYUnits() {
		return yUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYUnits(Integer newYUnits) {
		Integer oldYUnits = yUnits;
		yUnits = newYUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__YUNITS, oldYUnits, yUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXSize() {
		return xSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSize(Integer newXSize) {
		Integer oldXSize = xSize;
		xSize = newXSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__XSIZE, oldXSize, xSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYSize() {
		return ySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYSize(Integer newYSize) {
		Integer oldYSize = ySize;
		ySize = newYSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__YSIZE, oldYSize, ySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getConData2() {
		return conData2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConData2(byte[] newConData2) {
		byte[] oldConData2 = conData2;
		conData2 = newConData2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__CON_DATA2, oldConData2, conData2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXCSizeD() {
		return xcSizeD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXCSizeD(Integer newXCSizeD) {
		Integer oldXCSizeD = xcSizeD;
		xcSizeD = newXCSizeD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__XC_SIZE_D, oldXCSizeD, xcSizeD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYCSizeD() {
		return ycSizeD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYCSizeD(Integer newYCSizeD) {
		Integer oldYCSizeD = ycSizeD;
		ycSizeD = newYCSizeD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__YC_SIZE_D, oldYCSizeD, ycSizeD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getConData3() {
		return conData3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConData3(byte[] newConData3) {
		byte[] oldConData3 = conData3;
		conData3 = newConData3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__CON_DATA3, oldConData3, conData3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Integer newColor) {
		Integer oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IID__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.IID__CON_DATA1:
				return getConData1();
			case AfplibPackage.IID__XBASE:
				return getXBase();
			case AfplibPackage.IID__YBASE:
				return getYBase();
			case AfplibPackage.IID__XUNITS:
				return getXUnits();
			case AfplibPackage.IID__YUNITS:
				return getYUnits();
			case AfplibPackage.IID__XSIZE:
				return getXSize();
			case AfplibPackage.IID__YSIZE:
				return getYSize();
			case AfplibPackage.IID__CON_DATA2:
				return getConData2();
			case AfplibPackage.IID__XC_SIZE_D:
				return getXCSizeD();
			case AfplibPackage.IID__YC_SIZE_D:
				return getYCSizeD();
			case AfplibPackage.IID__CON_DATA3:
				return getConData3();
			case AfplibPackage.IID__COLOR:
				return getColor();
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
			case AfplibPackage.IID__CON_DATA1:
				setConData1((byte[])newValue);
				return;
			case AfplibPackage.IID__XBASE:
				setXBase((Integer)newValue);
				return;
			case AfplibPackage.IID__YBASE:
				setYBase((Integer)newValue);
				return;
			case AfplibPackage.IID__XUNITS:
				setXUnits((Integer)newValue);
				return;
			case AfplibPackage.IID__YUNITS:
				setYUnits((Integer)newValue);
				return;
			case AfplibPackage.IID__XSIZE:
				setXSize((Integer)newValue);
				return;
			case AfplibPackage.IID__YSIZE:
				setYSize((Integer)newValue);
				return;
			case AfplibPackage.IID__CON_DATA2:
				setConData2((byte[])newValue);
				return;
			case AfplibPackage.IID__XC_SIZE_D:
				setXCSizeD((Integer)newValue);
				return;
			case AfplibPackage.IID__YC_SIZE_D:
				setYCSizeD((Integer)newValue);
				return;
			case AfplibPackage.IID__CON_DATA3:
				setConData3((byte[])newValue);
				return;
			case AfplibPackage.IID__COLOR:
				setColor((Integer)newValue);
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
			case AfplibPackage.IID__CON_DATA1:
				setConData1(CON_DATA1_EDEFAULT);
				return;
			case AfplibPackage.IID__XBASE:
				setXBase(XBASE_EDEFAULT);
				return;
			case AfplibPackage.IID__YBASE:
				setYBase(YBASE_EDEFAULT);
				return;
			case AfplibPackage.IID__XUNITS:
				setXUnits(XUNITS_EDEFAULT);
				return;
			case AfplibPackage.IID__YUNITS:
				setYUnits(YUNITS_EDEFAULT);
				return;
			case AfplibPackage.IID__XSIZE:
				setXSize(XSIZE_EDEFAULT);
				return;
			case AfplibPackage.IID__YSIZE:
				setYSize(YSIZE_EDEFAULT);
				return;
			case AfplibPackage.IID__CON_DATA2:
				setConData2(CON_DATA2_EDEFAULT);
				return;
			case AfplibPackage.IID__XC_SIZE_D:
				setXCSizeD(XC_SIZE_D_EDEFAULT);
				return;
			case AfplibPackage.IID__YC_SIZE_D:
				setYCSizeD(YC_SIZE_D_EDEFAULT);
				return;
			case AfplibPackage.IID__CON_DATA3:
				setConData3(CON_DATA3_EDEFAULT);
				return;
			case AfplibPackage.IID__COLOR:
				setColor(COLOR_EDEFAULT);
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
			case AfplibPackage.IID__CON_DATA1:
				return CON_DATA1_EDEFAULT == null ? conData1 != null : !CON_DATA1_EDEFAULT.equals(conData1);
			case AfplibPackage.IID__XBASE:
				return XBASE_EDEFAULT == null ? xBase != null : !XBASE_EDEFAULT.equals(xBase);
			case AfplibPackage.IID__YBASE:
				return YBASE_EDEFAULT == null ? yBase != null : !YBASE_EDEFAULT.equals(yBase);
			case AfplibPackage.IID__XUNITS:
				return XUNITS_EDEFAULT == null ? xUnits != null : !XUNITS_EDEFAULT.equals(xUnits);
			case AfplibPackage.IID__YUNITS:
				return YUNITS_EDEFAULT == null ? yUnits != null : !YUNITS_EDEFAULT.equals(yUnits);
			case AfplibPackage.IID__XSIZE:
				return XSIZE_EDEFAULT == null ? xSize != null : !XSIZE_EDEFAULT.equals(xSize);
			case AfplibPackage.IID__YSIZE:
				return YSIZE_EDEFAULT == null ? ySize != null : !YSIZE_EDEFAULT.equals(ySize);
			case AfplibPackage.IID__CON_DATA2:
				return CON_DATA2_EDEFAULT == null ? conData2 != null : !CON_DATA2_EDEFAULT.equals(conData2);
			case AfplibPackage.IID__XC_SIZE_D:
				return XC_SIZE_D_EDEFAULT == null ? xcSizeD != null : !XC_SIZE_D_EDEFAULT.equals(xcSizeD);
			case AfplibPackage.IID__YC_SIZE_D:
				return YC_SIZE_D_EDEFAULT == null ? ycSizeD != null : !YC_SIZE_D_EDEFAULT.equals(ycSizeD);
			case AfplibPackage.IID__CON_DATA3:
				return CON_DATA3_EDEFAULT == null ? conData3 != null : !CON_DATA3_EDEFAULT.equals(conData3);
			case AfplibPackage.IID__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
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
		result.append(" (ConData1: ");
		result.append(conData1);
		result.append(", XBase: ");
		result.append(xBase);
		result.append(", YBase: ");
		result.append(yBase);
		result.append(", XUnits: ");
		result.append(xUnits);
		result.append(", YUnits: ");
		result.append(yUnits);
		result.append(", XSize: ");
		result.append(xSize);
		result.append(", YSize: ");
		result.append(ySize);
		result.append(", ConData2: ");
		result.append(conData2);
		result.append(", XCSizeD: ");
		result.append(xcSizeD);
		result.append(", YCSizeD: ");
		result.append(ycSizeD);
		result.append(", ConData3: ");
		result.append(conData3);
		result.append(", Color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //IIDImpl
