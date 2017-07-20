/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Function Set Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectFunctionSetSpecification#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectFunctionSetSpecification#getArchVrsn <em>Arch Vrsn</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectFunctionSetSpecification#getDCAFnSet <em>DCA Fn Set</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectFunctionSetSpecification#getOCAFnSet <em>OCA Fn Set</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecification()
 * @model
 * @generated
 */
public interface ObjectFunctionSetSpecification extends Triplet {
	/**
     * Returns the value of the '<em><b>Obj Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Obj Type</em>' attribute.
     * @see #setObjType(Integer)
     * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecification_ObjType()
     * @model required="true"
     * @generated
     */
	Integer getObjType();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ObjectFunctionSetSpecification#getObjType <em>Obj Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Obj Type</em>' attribute.
     * @see #getObjType()
     * @generated
     */
	void setObjType(Integer value);

	/**
     * Returns the value of the '<em><b>Arch Vrsn</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Arch Vrsn</em>' attribute.
     * @see #setArchVrsn(Integer)
     * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecification_ArchVrsn()
     * @model required="true"
     * @generated
     */
	Integer getArchVrsn();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ObjectFunctionSetSpecification#getArchVrsn <em>Arch Vrsn</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Arch Vrsn</em>' attribute.
     * @see #getArchVrsn()
     * @generated
     */
	void setArchVrsn(Integer value);

	/**
     * Returns the value of the '<em><b>DCA Fn Set</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>DCA Fn Set</em>' attribute.
     * @see #setDCAFnSet(Integer)
     * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecification_DCAFnSet()
     * @model required="true"
     * @generated
     */
	Integer getDCAFnSet();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ObjectFunctionSetSpecification#getDCAFnSet <em>DCA Fn Set</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>DCA Fn Set</em>' attribute.
     * @see #getDCAFnSet()
     * @generated
     */
	void setDCAFnSet(Integer value);

	/**
     * Returns the value of the '<em><b>OCA Fn Set</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>OCA Fn Set</em>' attribute.
     * @see #setOCAFnSet(Integer)
     * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecification_OCAFnSet()
     * @model required="true"
     * @generated
     */
	Integer getOCAFnSet();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ObjectFunctionSetSpecification#getOCAFnSet <em>OCA Fn Set</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>OCA Fn Set</em>' attribute.
     * @see #getOCAFnSet()
     * @generated
     */
	void setOCAFnSet(Integer value);

} // ObjectFunctionSetSpecification
