/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDE Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IDEStructure#getFLAGS <em>FLAGS</em>}</li>
 *   <li>{@link org.afplib.afplib.IDEStructure#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.IDEStructure#getSIZE1 <em>SIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.IDEStructure#getSIZE2 <em>SIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.IDEStructure#getSIZE3 <em>SIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.IDEStructure#getSIZE4 <em>SIZE4</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIDEStructure()
 * @model
 * @generated
 */
public interface IDEStructure extends Triplet {
	/**
     * Returns the value of the '<em><b>FLAGS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FLAGS</em>' attribute.
     * @see #setFLAGS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIDEStructure_FLAGS()
     * @model required="true"
     * @generated
     */
	Integer getFLAGS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IDEStructure#getFLAGS <em>FLAGS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FLAGS</em>' attribute.
     * @see #getFLAGS()
     * @generated
     */
	void setFLAGS(Integer value);

	/**
     * Returns the value of the '<em><b>FORMAT</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FORMAT</em>' attribute.
     * @see #setFORMAT(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIDEStructure_FORMAT()
     * @model required="true"
     * @generated
     */
	Integer getFORMAT();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IDEStructure#getFORMAT <em>FORMAT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FORMAT</em>' attribute.
     * @see #getFORMAT()
     * @generated
     */
	void setFORMAT(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE1</em>' attribute.
     * @see #setSIZE1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIDEStructure_SIZE1()
     * @model required="true"
     * @generated
     */
	Integer getSIZE1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IDEStructure#getSIZE1 <em>SIZE1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE1</em>' attribute.
     * @see #getSIZE1()
     * @generated
     */
	void setSIZE1(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE2</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE2</em>' attribute.
     * @see #setSIZE2(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIDEStructure_SIZE2()
     * @model
     * @generated
     */
	Integer getSIZE2();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IDEStructure#getSIZE2 <em>SIZE2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE2</em>' attribute.
     * @see #getSIZE2()
     * @generated
     */
	void setSIZE2(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE3</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE3</em>' attribute.
     * @see #setSIZE3(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIDEStructure_SIZE3()
     * @model
     * @generated
     */
	Integer getSIZE3();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IDEStructure#getSIZE3 <em>SIZE3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE3</em>' attribute.
     * @see #getSIZE3()
     * @generated
     */
	void setSIZE3(Integer value);

	/**
     * Returns the value of the '<em><b>SIZE4</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SIZE4</em>' attribute.
     * @see #setSIZE4(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIDEStructure_SIZE4()
     * @model
     * @generated
     */
	Integer getSIZE4();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IDEStructure#getSIZE4 <em>SIZE4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SIZE4</em>' attribute.
     * @see #getSIZE4()
     * @generated
     */
	void setSIZE4(Integer value);

} // IDEStructure
