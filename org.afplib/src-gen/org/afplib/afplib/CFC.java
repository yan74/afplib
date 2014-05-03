/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CFC#getCFIRGLen <em>CFIRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.CFC#getRetired1 <em>Retired1</em>}</li>
 *   <li>{@link org.afplib.afplib.CFC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCFC()
 * @model
 * @generated
 */
public interface CFC extends SF {
	/**
	 * Returns the value of the '<em><b>CFIRG Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CFIRG Len</em>' attribute.
	 * @see #setCFIRGLen(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCFC_CFIRGLen()
	 * @model required="true"
	 * @generated
	 */
	Integer getCFIRGLen();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFC#getCFIRGLen <em>CFIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CFIRG Len</em>' attribute.
	 * @see #getCFIRGLen()
	 * @generated
	 */
	void setCFIRGLen(Integer value);

	/**
	 * Returns the value of the '<em><b>Retired1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retired1</em>' attribute.
	 * @see #setRetired1(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCFC_Retired1()
	 * @model required="true"
	 * @generated
	 */
	Integer getRetired1();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFC#getRetired1 <em>Retired1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retired1</em>' attribute.
	 * @see #getRetired1()
	 * @generated
	 */
	void setRetired1(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getCFC_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // CFC
