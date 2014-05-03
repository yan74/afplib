/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TileSetColor;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Set Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getCSPACE <em>CSPACE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getSIZE1 <em>SIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getSIZE2 <em>SIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getSIZE3 <em>SIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getSIZE4 <em>SIZE4</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getCVAL1 <em>CVAL1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getCVAL2 <em>CVAL2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getCVAL3 <em>CVAL3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSetColorImpl#getCVAL4 <em>CVAL4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TileSetColorImpl extends TripletImpl implements TileSetColor {
	/**
	 * The default value of the '{@link #getCSPACE() <em>CSPACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSPACE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSPACE() <em>CSPACE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSPACE()
	 * @generated
	 * @ordered
	 */
	protected Integer cspace = CSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRESERVED()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRESERVED()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

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
	 * The default value of the '{@link #getCVAL1() <em>CVAL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CVAL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCVAL1() <em>CVAL1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL1()
	 * @generated
	 * @ordered
	 */
	protected Integer cval1 = CVAL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCVAL2() <em>CVAL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CVAL2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCVAL2() <em>CVAL2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL2()
	 * @generated
	 * @ordered
	 */
	protected Integer cval2 = CVAL2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCVAL3() <em>CVAL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL3()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CVAL3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCVAL3() <em>CVAL3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL3()
	 * @generated
	 * @ordered
	 */
	protected Integer cval3 = CVAL3_EDEFAULT;

	/**
	 * The default value of the '{@link #getCVAL4() <em>CVAL4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL4()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CVAL4_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCVAL4() <em>CVAL4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCVAL4()
	 * @generated
	 * @ordered
	 */
	protected Integer cval4 = CVAL4_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileSetColorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getTileSetColor();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCSPACE() {
		return cspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSPACE(Integer newCSPACE) {
		Integer oldCSPACE = cspace;
		cspace = newCSPACE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__CSPACE, oldCSPACE, cspace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRESERVED() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRESERVED(Integer newRESERVED) {
		Integer oldRESERVED = reserved;
		reserved = newRESERVED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__RESERVED, oldRESERVED, reserved));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__SIZE1, oldSIZE1, size1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__SIZE2, oldSIZE2, size2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__SIZE3, oldSIZE3, size3));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__SIZE4, oldSIZE4, size4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCVAL1() {
		return cval1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVAL1(Integer newCVAL1) {
		Integer oldCVAL1 = cval1;
		cval1 = newCVAL1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__CVAL1, oldCVAL1, cval1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCVAL2() {
		return cval2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVAL2(Integer newCVAL2) {
		Integer oldCVAL2 = cval2;
		cval2 = newCVAL2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__CVAL2, oldCVAL2, cval2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCVAL3() {
		return cval3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVAL3(Integer newCVAL3) {
		Integer oldCVAL3 = cval3;
		cval3 = newCVAL3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__CVAL3, oldCVAL3, cval3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCVAL4() {
		return cval4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCVAL4(Integer newCVAL4) {
		Integer oldCVAL4 = cval4;
		cval4 = newCVAL4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SET_COLOR__CVAL4, oldCVAL4, cval4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.TILE_SET_COLOR__CSPACE:
				return getCSPACE();
			case AfplibPackage.TILE_SET_COLOR__RESERVED:
				return getRESERVED();
			case AfplibPackage.TILE_SET_COLOR__SIZE1:
				return getSIZE1();
			case AfplibPackage.TILE_SET_COLOR__SIZE2:
				return getSIZE2();
			case AfplibPackage.TILE_SET_COLOR__SIZE3:
				return getSIZE3();
			case AfplibPackage.TILE_SET_COLOR__SIZE4:
				return getSIZE4();
			case AfplibPackage.TILE_SET_COLOR__CVAL1:
				return getCVAL1();
			case AfplibPackage.TILE_SET_COLOR__CVAL2:
				return getCVAL2();
			case AfplibPackage.TILE_SET_COLOR__CVAL3:
				return getCVAL3();
			case AfplibPackage.TILE_SET_COLOR__CVAL4:
				return getCVAL4();
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
			case AfplibPackage.TILE_SET_COLOR__CSPACE:
				setCSPACE((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__RESERVED:
				setRESERVED((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE1:
				setSIZE1((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE2:
				setSIZE2((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE3:
				setSIZE3((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE4:
				setSIZE4((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL1:
				setCVAL1((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL2:
				setCVAL2((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL3:
				setCVAL3((Integer)newValue);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL4:
				setCVAL4((Integer)newValue);
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
			case AfplibPackage.TILE_SET_COLOR__CSPACE:
				setCSPACE(CSPACE_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__RESERVED:
				setRESERVED(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE1:
				setSIZE1(SIZE1_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE2:
				setSIZE2(SIZE2_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE3:
				setSIZE3(SIZE3_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__SIZE4:
				setSIZE4(SIZE4_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL1:
				setCVAL1(CVAL1_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL2:
				setCVAL2(CVAL2_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL3:
				setCVAL3(CVAL3_EDEFAULT);
				return;
			case AfplibPackage.TILE_SET_COLOR__CVAL4:
				setCVAL4(CVAL4_EDEFAULT);
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
			case AfplibPackage.TILE_SET_COLOR__CSPACE:
				return CSPACE_EDEFAULT == null ? cspace != null : !CSPACE_EDEFAULT.equals(cspace);
			case AfplibPackage.TILE_SET_COLOR__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.TILE_SET_COLOR__SIZE1:
				return SIZE1_EDEFAULT == null ? size1 != null : !SIZE1_EDEFAULT.equals(size1);
			case AfplibPackage.TILE_SET_COLOR__SIZE2:
				return SIZE2_EDEFAULT == null ? size2 != null : !SIZE2_EDEFAULT.equals(size2);
			case AfplibPackage.TILE_SET_COLOR__SIZE3:
				return SIZE3_EDEFAULT == null ? size3 != null : !SIZE3_EDEFAULT.equals(size3);
			case AfplibPackage.TILE_SET_COLOR__SIZE4:
				return SIZE4_EDEFAULT == null ? size4 != null : !SIZE4_EDEFAULT.equals(size4);
			case AfplibPackage.TILE_SET_COLOR__CVAL1:
				return CVAL1_EDEFAULT == null ? cval1 != null : !CVAL1_EDEFAULT.equals(cval1);
			case AfplibPackage.TILE_SET_COLOR__CVAL2:
				return CVAL2_EDEFAULT == null ? cval2 != null : !CVAL2_EDEFAULT.equals(cval2);
			case AfplibPackage.TILE_SET_COLOR__CVAL3:
				return CVAL3_EDEFAULT == null ? cval3 != null : !CVAL3_EDEFAULT.equals(cval3);
			case AfplibPackage.TILE_SET_COLOR__CVAL4:
				return CVAL4_EDEFAULT == null ? cval4 != null : !CVAL4_EDEFAULT.equals(cval4);
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
		result.append(" (CSPACE: ");
		result.append(cspace);
		result.append(", RESERVED: ");
		result.append(reserved);
		result.append(", SIZE1: ");
		result.append(size1);
		result.append(", SIZE2: ");
		result.append(size2);
		result.append(", SIZE3: ");
		result.append(size3);
		result.append(", SIZE4: ");
		result.append(size4);
		result.append(", CVAL1: ");
		result.append(cval1);
		result.append(", CVAL2: ");
		result.append(cval2);
		result.append(", CVAL3: ");
		result.append(cval3);
		result.append(", CVAL4: ");
		result.append(cval4);
		result.append(')');
		return result.toString();
	}

} //TileSetColorImpl
