/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MetricAdjustment;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Adjustment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getUnitBase <em>Unit Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getXUPUB <em>XUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getYUPUB <em>YUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getHUniformIncrement <em>HUniform Increment</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getVUniformIncrement <em>VUniform Increment</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getHBaselineIncrement <em>HBaseline Increment</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MetricAdjustmentImpl#getVBaselineIncrement <em>VBaseline Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricAdjustmentImpl extends TripletImpl implements MetricAdjustment {
	/**
     * The default value of the '{@link #getUnitBase() <em>Unit Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnitBase()
     * @generated
     * @ordered
     */
	protected static final Integer UNIT_BASE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUnitBase() <em>Unit Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUnitBase()
     * @generated
     * @ordered
     */
	protected Integer unitBase = UNIT_BASE_EDEFAULT;

	/**
     * The default value of the '{@link #getXUPUB() <em>XUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXUPUB()
     * @generated
     * @ordered
     */
	protected static final Integer XUPUB_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXUPUB() <em>XUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXUPUB()
     * @generated
     * @ordered
     */
	protected Integer xupub = XUPUB_EDEFAULT;

	/**
     * The default value of the '{@link #getYUPUB() <em>YUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYUPUB()
     * @generated
     * @ordered
     */
	protected static final Integer YUPUB_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYUPUB() <em>YUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYUPUB()
     * @generated
     * @ordered
     */
	protected Integer yupub = YUPUB_EDEFAULT;

	/**
     * The default value of the '{@link #getHUniformIncrement() <em>HUniform Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHUniformIncrement()
     * @generated
     * @ordered
     */
	protected static final Integer HUNIFORM_INCREMENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHUniformIncrement() <em>HUniform Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHUniformIncrement()
     * @generated
     * @ordered
     */
	protected Integer hUniformIncrement = HUNIFORM_INCREMENT_EDEFAULT;

	/**
     * The default value of the '{@link #getVUniformIncrement() <em>VUniform Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVUniformIncrement()
     * @generated
     * @ordered
     */
	protected static final Integer VUNIFORM_INCREMENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVUniformIncrement() <em>VUniform Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVUniformIncrement()
     * @generated
     * @ordered
     */
	protected Integer vUniformIncrement = VUNIFORM_INCREMENT_EDEFAULT;

	/**
     * The default value of the '{@link #getHBaselineIncrement() <em>HBaseline Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHBaselineIncrement()
     * @generated
     * @ordered
     */
	protected static final Integer HBASELINE_INCREMENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHBaselineIncrement() <em>HBaseline Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHBaselineIncrement()
     * @generated
     * @ordered
     */
	protected Integer hBaselineIncrement = HBASELINE_INCREMENT_EDEFAULT;

	/**
     * The default value of the '{@link #getVBaselineIncrement() <em>VBaseline Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVBaselineIncrement()
     * @generated
     * @ordered
     */
	protected static final Integer VBASELINE_INCREMENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVBaselineIncrement() <em>VBaseline Increment</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVBaselineIncrement()
     * @generated
     * @ordered
     */
	protected Integer vBaselineIncrement = VBASELINE_INCREMENT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MetricAdjustmentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getMetricAdjustment();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getUnitBase() {
        return unitBase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUnitBase(Integer newUnitBase) {
        Integer oldUnitBase = unitBase;
        unitBase = newUnitBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__UNIT_BASE, oldUnitBase, unitBase));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXUPUB() {
        return xupub;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXUPUB(Integer newXUPUB) {
        Integer oldXUPUB = xupub;
        xupub = newXUPUB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__XUPUB, oldXUPUB, xupub));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYUPUB() {
        return yupub;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYUPUB(Integer newYUPUB) {
        Integer oldYUPUB = yupub;
        yupub = newYUPUB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__YUPUB, oldYUPUB, yupub));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getHUniformIncrement() {
        return hUniformIncrement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHUniformIncrement(Integer newHUniformIncrement) {
        Integer oldHUniformIncrement = hUniformIncrement;
        hUniformIncrement = newHUniformIncrement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT, oldHUniformIncrement, hUniformIncrement));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getVUniformIncrement() {
        return vUniformIncrement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVUniformIncrement(Integer newVUniformIncrement) {
        Integer oldVUniformIncrement = vUniformIncrement;
        vUniformIncrement = newVUniformIncrement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT, oldVUniformIncrement, vUniformIncrement));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getHBaselineIncrement() {
        return hBaselineIncrement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHBaselineIncrement(Integer newHBaselineIncrement) {
        Integer oldHBaselineIncrement = hBaselineIncrement;
        hBaselineIncrement = newHBaselineIncrement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT, oldHBaselineIncrement, hBaselineIncrement));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getVBaselineIncrement() {
        return vBaselineIncrement;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVBaselineIncrement(Integer newVBaselineIncrement) {
        Integer oldVBaselineIncrement = vBaselineIncrement;
        vBaselineIncrement = newVBaselineIncrement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT, oldVBaselineIncrement, vBaselineIncrement));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.METRIC_ADJUSTMENT__UNIT_BASE:
                return getUnitBase();
            case AfplibPackage.METRIC_ADJUSTMENT__XUPUB:
                return getXUPUB();
            case AfplibPackage.METRIC_ADJUSTMENT__YUPUB:
                return getYUPUB();
            case AfplibPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
                return getHUniformIncrement();
            case AfplibPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
                return getVUniformIncrement();
            case AfplibPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
                return getHBaselineIncrement();
            case AfplibPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
                return getVBaselineIncrement();
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
            case AfplibPackage.METRIC_ADJUSTMENT__UNIT_BASE:
                setUnitBase((Integer)newValue);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__XUPUB:
                setXUPUB((Integer)newValue);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__YUPUB:
                setYUPUB((Integer)newValue);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
                setHUniformIncrement((Integer)newValue);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
                setVUniformIncrement((Integer)newValue);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
                setHBaselineIncrement((Integer)newValue);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
                setVBaselineIncrement((Integer)newValue);
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
            case AfplibPackage.METRIC_ADJUSTMENT__UNIT_BASE:
                setUnitBase(UNIT_BASE_EDEFAULT);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__XUPUB:
                setXUPUB(XUPUB_EDEFAULT);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__YUPUB:
                setYUPUB(YUPUB_EDEFAULT);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
                setHUniformIncrement(HUNIFORM_INCREMENT_EDEFAULT);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
                setVUniformIncrement(VUNIFORM_INCREMENT_EDEFAULT);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
                setHBaselineIncrement(HBASELINE_INCREMENT_EDEFAULT);
                return;
            case AfplibPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
                setVBaselineIncrement(VBASELINE_INCREMENT_EDEFAULT);
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
            case AfplibPackage.METRIC_ADJUSTMENT__UNIT_BASE:
                return UNIT_BASE_EDEFAULT == null ? unitBase != null : !UNIT_BASE_EDEFAULT.equals(unitBase);
            case AfplibPackage.METRIC_ADJUSTMENT__XUPUB:
                return XUPUB_EDEFAULT == null ? xupub != null : !XUPUB_EDEFAULT.equals(xupub);
            case AfplibPackage.METRIC_ADJUSTMENT__YUPUB:
                return YUPUB_EDEFAULT == null ? yupub != null : !YUPUB_EDEFAULT.equals(yupub);
            case AfplibPackage.METRIC_ADJUSTMENT__HUNIFORM_INCREMENT:
                return HUNIFORM_INCREMENT_EDEFAULT == null ? hUniformIncrement != null : !HUNIFORM_INCREMENT_EDEFAULT.equals(hUniformIncrement);
            case AfplibPackage.METRIC_ADJUSTMENT__VUNIFORM_INCREMENT:
                return VUNIFORM_INCREMENT_EDEFAULT == null ? vUniformIncrement != null : !VUNIFORM_INCREMENT_EDEFAULT.equals(vUniformIncrement);
            case AfplibPackage.METRIC_ADJUSTMENT__HBASELINE_INCREMENT:
                return HBASELINE_INCREMENT_EDEFAULT == null ? hBaselineIncrement != null : !HBASELINE_INCREMENT_EDEFAULT.equals(hBaselineIncrement);
            case AfplibPackage.METRIC_ADJUSTMENT__VBASELINE_INCREMENT:
                return VBASELINE_INCREMENT_EDEFAULT == null ? vBaselineIncrement != null : !VBASELINE_INCREMENT_EDEFAULT.equals(vBaselineIncrement);
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
        result.append(" (UnitBase: ");
        result.append(unitBase);
        result.append(", XUPUB: ");
        result.append(xupub);
        result.append(", YUPUB: ");
        result.append(yupub);
        result.append(", HUniformIncrement: ");
        result.append(hUniformIncrement);
        result.append(", VUniformIncrement: ");
        result.append(vUniformIncrement);
        result.append(", HBaselineIncrement: ");
        result.append(hBaselineIncrement);
        result.append(", VBaselineIncrement: ");
        result.append(vBaselineIncrement);
        result.append(')');
        return result.toString();
    }

} //MetricAdjustmentImpl
