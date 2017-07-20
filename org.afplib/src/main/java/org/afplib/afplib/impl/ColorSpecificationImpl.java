/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ColorSpecification;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ColorSpecificationImpl#getColSpce <em>Col Spce</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorSpecificationImpl#getColSize1 <em>Col Size1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorSpecificationImpl#getColSize2 <em>Col Size2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorSpecificationImpl#getColSize3 <em>Col Size3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorSpecificationImpl#getColSize4 <em>Col Size4</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ColorSpecificationImpl#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorSpecificationImpl extends TripletImpl implements ColorSpecification {
	/**
     * The default value of the '{@link #getColSpce() <em>Col Spce</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSpce()
     * @generated
     * @ordered
     */
	protected static final Integer COL_SPCE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColSpce() <em>Col Spce</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSpce()
     * @generated
     * @ordered
     */
	protected Integer colSpce = COL_SPCE_EDEFAULT;

	/**
     * The default value of the '{@link #getColSize1() <em>Col Size1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize1()
     * @generated
     * @ordered
     */
	protected static final Integer COL_SIZE1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColSize1() <em>Col Size1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize1()
     * @generated
     * @ordered
     */
	protected Integer colSize1 = COL_SIZE1_EDEFAULT;

	/**
     * The default value of the '{@link #getColSize2() <em>Col Size2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize2()
     * @generated
     * @ordered
     */
	protected static final Integer COL_SIZE2_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColSize2() <em>Col Size2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize2()
     * @generated
     * @ordered
     */
	protected Integer colSize2 = COL_SIZE2_EDEFAULT;

	/**
     * The default value of the '{@link #getColSize3() <em>Col Size3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize3()
     * @generated
     * @ordered
     */
	protected static final Integer COL_SIZE3_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColSize3() <em>Col Size3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize3()
     * @generated
     * @ordered
     */
	protected Integer colSize3 = COL_SIZE3_EDEFAULT;

	/**
     * The default value of the '{@link #getColSize4() <em>Col Size4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize4()
     * @generated
     * @ordered
     */
	protected static final Integer COL_SIZE4_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColSize4() <em>Col Size4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColSize4()
     * @generated
     * @ordered
     */
	protected Integer colSize4 = COL_SIZE4_EDEFAULT;

	/**
     * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
	protected static final byte[] COLOR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
	protected byte[] color = COLOR_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ColorSpecificationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getColorSpecification();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getColSpce() {
        return colSpce;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColSpce(Integer newColSpce) {
        Integer oldColSpce = colSpce;
        colSpce = newColSpce;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_SPECIFICATION__COL_SPCE, oldColSpce, colSpce));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getColSize1() {
        return colSize1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColSize1(Integer newColSize1) {
        Integer oldColSize1 = colSize1;
        colSize1 = newColSize1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_SPECIFICATION__COL_SIZE1, oldColSize1, colSize1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getColSize2() {
        return colSize2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColSize2(Integer newColSize2) {
        Integer oldColSize2 = colSize2;
        colSize2 = newColSize2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_SPECIFICATION__COL_SIZE2, oldColSize2, colSize2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getColSize3() {
        return colSize3;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColSize3(Integer newColSize3) {
        Integer oldColSize3 = colSize3;
        colSize3 = newColSize3;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_SPECIFICATION__COL_SIZE3, oldColSize3, colSize3));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getColSize4() {
        return colSize4;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColSize4(Integer newColSize4) {
        Integer oldColSize4 = colSize4;
        colSize4 = newColSize4;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_SPECIFICATION__COL_SIZE4, oldColSize4, colSize4));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getColor() {
        return color;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setColor(byte[] newColor) {
        byte[] oldColor = color;
        color = newColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.COLOR_SPECIFICATION__COLOR, oldColor, color));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.COLOR_SPECIFICATION__COL_SPCE:
                return getColSpce();
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE1:
                return getColSize1();
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE2:
                return getColSize2();
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE3:
                return getColSize3();
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE4:
                return getColSize4();
            case AfplibPackage.COLOR_SPECIFICATION__COLOR:
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
            case AfplibPackage.COLOR_SPECIFICATION__COL_SPCE:
                setColSpce((Integer)newValue);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE1:
                setColSize1((Integer)newValue);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE2:
                setColSize2((Integer)newValue);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE3:
                setColSize3((Integer)newValue);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE4:
                setColSize4((Integer)newValue);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COLOR:
                setColor((byte[])newValue);
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
            case AfplibPackage.COLOR_SPECIFICATION__COL_SPCE:
                setColSpce(COL_SPCE_EDEFAULT);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE1:
                setColSize1(COL_SIZE1_EDEFAULT);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE2:
                setColSize2(COL_SIZE2_EDEFAULT);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE3:
                setColSize3(COL_SIZE3_EDEFAULT);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE4:
                setColSize4(COL_SIZE4_EDEFAULT);
                return;
            case AfplibPackage.COLOR_SPECIFICATION__COLOR:
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
            case AfplibPackage.COLOR_SPECIFICATION__COL_SPCE:
                return COL_SPCE_EDEFAULT == null ? colSpce != null : !COL_SPCE_EDEFAULT.equals(colSpce);
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE1:
                return COL_SIZE1_EDEFAULT == null ? colSize1 != null : !COL_SIZE1_EDEFAULT.equals(colSize1);
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE2:
                return COL_SIZE2_EDEFAULT == null ? colSize2 != null : !COL_SIZE2_EDEFAULT.equals(colSize2);
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE3:
                return COL_SIZE3_EDEFAULT == null ? colSize3 != null : !COL_SIZE3_EDEFAULT.equals(colSize3);
            case AfplibPackage.COLOR_SPECIFICATION__COL_SIZE4:
                return COL_SIZE4_EDEFAULT == null ? colSize4 != null : !COL_SIZE4_EDEFAULT.equals(colSize4);
            case AfplibPackage.COLOR_SPECIFICATION__COLOR:
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
        result.append(" (ColSpce: ");
        result.append(colSpce);
        result.append(", ColSize1: ");
        result.append(colSize1);
        result.append(", ColSize2: ");
        result.append(colSize2);
        result.append(", ColSize3: ");
        result.append(colSize3);
        result.append(", ColSize4: ");
        result.append(colSize4);
        result.append(", Color: ");
        result.append(color);
        result.append(')');
        return result.toString();
    }

} //ColorSpecificationImpl
