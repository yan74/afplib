/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ColorSpecification#getColSpce <em>Col Spce</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorSpecification#getColSize1 <em>Col Size1</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorSpecification#getColSize2 <em>Col Size2</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorSpecification#getColSize3 <em>Col Size3</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorSpecification#getColSize4 <em>Col Size4</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorSpecification#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getColorSpecification()
 * @model
 * @generated
 */
public interface ColorSpecification extends Triplet {
	/**
	 * Returns the value of the '<em><b>Col Spce</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Spce</em>' attribute.
	 * @see #setColSpce(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorSpecification_ColSpce()
	 * @model required="true"
	 * @generated
	 */
	Integer getColSpce();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorSpecification#getColSpce <em>Col Spce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Spce</em>' attribute.
	 * @see #getColSpce()
	 * @generated
	 */
	void setColSpce(Integer value);

	/**
	 * Returns the value of the '<em><b>Col Size1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Size1</em>' attribute.
	 * @see #setColSize1(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorSpecification_ColSize1()
	 * @model required="true"
	 * @generated
	 */
	Integer getColSize1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorSpecification#getColSize1 <em>Col Size1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Size1</em>' attribute.
	 * @see #getColSize1()
	 * @generated
	 */
	void setColSize1(Integer value);

	/**
	 * Returns the value of the '<em><b>Col Size2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Size2</em>' attribute.
	 * @see #setColSize2(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorSpecification_ColSize2()
	 * @model required="true"
	 * @generated
	 */
	Integer getColSize2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorSpecification#getColSize2 <em>Col Size2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Size2</em>' attribute.
	 * @see #getColSize2()
	 * @generated
	 */
	void setColSize2(Integer value);

	/**
	 * Returns the value of the '<em><b>Col Size3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Size3</em>' attribute.
	 * @see #setColSize3(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorSpecification_ColSize3()
	 * @model required="true"
	 * @generated
	 */
	Integer getColSize3();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorSpecification#getColSize3 <em>Col Size3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Size3</em>' attribute.
	 * @see #getColSize3()
	 * @generated
	 */
	void setColSize3(Integer value);

	/**
	 * Returns the value of the '<em><b>Col Size4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Size4</em>' attribute.
	 * @see #setColSize4(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorSpecification_ColSize4()
	 * @model required="true"
	 * @generated
	 */
	Integer getColSize4();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorSpecification#getColSize4 <em>Col Size4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Size4</em>' attribute.
	 * @see #getColSize4()
	 * @generated
	 */
	void setColSize4(Integer value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getColorSpecification_Color()
	 * @model required="true"
	 * @generated
	 */
	byte[] getColor();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorSpecification#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(byte[] value);

} // ColorSpecification
