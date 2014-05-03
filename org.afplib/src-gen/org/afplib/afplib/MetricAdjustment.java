/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Adjustment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getUnitBase <em>Unit Base</em>}</li>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getXUPUB <em>XUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getYUPUB <em>YUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getHUniformIncrement <em>HUniform Increment</em>}</li>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getVUniformIncrement <em>VUniform Increment</em>}</li>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getHBaselineIncrement <em>HBaseline Increment</em>}</li>
 *   <li>{@link org.afplib.afplib.MetricAdjustment#getVBaselineIncrement <em>VBaseline Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment()
 * @model
 * @generated
 */
public interface MetricAdjustment extends Triplet {
	/**
	 * Returns the value of the '<em><b>Unit Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Base</em>' attribute.
	 * @see #setUnitBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_UnitBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getUnitBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getUnitBase <em>Unit Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Base</em>' attribute.
	 * @see #getUnitBase()
	 * @generated
	 */
	void setUnitBase(Integer value);

	/**
	 * Returns the value of the '<em><b>XUPUB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XUPUB</em>' attribute.
	 * @see #setXUPUB(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_XUPUB()
	 * @model required="true"
	 * @generated
	 */
	Integer getXUPUB();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getXUPUB <em>XUPUB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XUPUB</em>' attribute.
	 * @see #getXUPUB()
	 * @generated
	 */
	void setXUPUB(Integer value);

	/**
	 * Returns the value of the '<em><b>YUPUB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YUPUB</em>' attribute.
	 * @see #setYUPUB(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_YUPUB()
	 * @model required="true"
	 * @generated
	 */
	Integer getYUPUB();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getYUPUB <em>YUPUB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YUPUB</em>' attribute.
	 * @see #getYUPUB()
	 * @generated
	 */
	void setYUPUB(Integer value);

	/**
	 * Returns the value of the '<em><b>HUniform Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HUniform Increment</em>' attribute.
	 * @see #setHUniformIncrement(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_HUniformIncrement()
	 * @model required="true"
	 * @generated
	 */
	Integer getHUniformIncrement();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getHUniformIncrement <em>HUniform Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HUniform Increment</em>' attribute.
	 * @see #getHUniformIncrement()
	 * @generated
	 */
	void setHUniformIncrement(Integer value);

	/**
	 * Returns the value of the '<em><b>VUniform Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VUniform Increment</em>' attribute.
	 * @see #setVUniformIncrement(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_VUniformIncrement()
	 * @model required="true"
	 * @generated
	 */
	Integer getVUniformIncrement();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getVUniformIncrement <em>VUniform Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VUniform Increment</em>' attribute.
	 * @see #getVUniformIncrement()
	 * @generated
	 */
	void setVUniformIncrement(Integer value);

	/**
	 * Returns the value of the '<em><b>HBaseline Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HBaseline Increment</em>' attribute.
	 * @see #setHBaselineIncrement(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_HBaselineIncrement()
	 * @model required="true"
	 * @generated
	 */
	Integer getHBaselineIncrement();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getHBaselineIncrement <em>HBaseline Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HBaseline Increment</em>' attribute.
	 * @see #getHBaselineIncrement()
	 * @generated
	 */
	void setHBaselineIncrement(Integer value);

	/**
	 * Returns the value of the '<em><b>VBaseline Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBaseline Increment</em>' attribute.
	 * @see #setVBaselineIncrement(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMetricAdjustment_VBaselineIncrement()
	 * @model required="true"
	 * @generated
	 */
	Integer getVBaselineIncrement();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MetricAdjustment#getVBaselineIncrement <em>VBaseline Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBaseline Increment</em>' attribute.
	 * @see #getVBaselineIncrement()
	 * @generated
	 */
	void setVBaselineIncrement(Integer value);

} // MetricAdjustment
