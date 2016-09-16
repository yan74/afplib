/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement Units</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MeasurementUnits#getXoaBase <em>Xoa Base</em>}</li>
 *   <li>{@link org.afplib.afplib.MeasurementUnits#getYoaBase <em>Yoa Base</em>}</li>
 *   <li>{@link org.afplib.afplib.MeasurementUnits#getXoaUnits <em>Xoa Units</em>}</li>
 *   <li>{@link org.afplib.afplib.MeasurementUnits#getYoaUnits <em>Yoa Units</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMeasurementUnits()
 * @model
 * @generated
 */
public interface MeasurementUnits extends Triplet {
	/**
	 * Returns the value of the '<em><b>Xoa Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Base</em>' attribute.
	 * @see #setXoaBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMeasurementUnits_XoaBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MeasurementUnits#getXoaBase <em>Xoa Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoa Base</em>' attribute.
	 * @see #getXoaBase()
	 * @generated
	 */
	void setXoaBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoa Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoa Base</em>' attribute.
	 * @see #setYoaBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMeasurementUnits_YoaBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MeasurementUnits#getYoaBase <em>Yoa Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoa Base</em>' attribute.
	 * @see #getYoaBase()
	 * @generated
	 */
	void setYoaBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoa Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Units</em>' attribute.
	 * @see #setXoaUnits(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMeasurementUnits_XoaUnits()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaUnits();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MeasurementUnits#getXoaUnits <em>Xoa Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoa Units</em>' attribute.
	 * @see #getXoaUnits()
	 * @generated
	 */
	void setXoaUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoa Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoa Units</em>' attribute.
	 * @see #setYoaUnits(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMeasurementUnits_YoaUnits()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaUnits();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MeasurementUnits#getYoaUnits <em>Yoa Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoa Units</em>' attribute.
	 * @see #getYoaUnits()
	 * @generated
	 */
	void setYoaUnits(Integer value);

} // MeasurementUnits
