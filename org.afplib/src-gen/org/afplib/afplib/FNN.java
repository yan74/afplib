/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNN#getIBMFormat <em>IBM Format</em>}</li>
 *   <li>{@link org.afplib.afplib.FNN#getTechnologyFormat <em>Technology Format</em>}</li>
 *   <li>{@link org.afplib.afplib.FNN#getRg <em>Rg</em>}</li>
 *   <li>{@link org.afplib.afplib.FNN#getRg2 <em>Rg2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNN()
 * @model
 * @generated
 */
public interface FNN extends SF {
	/**
	 * Returns the value of the '<em><b>IBM Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IBM Format</em>' attribute.
	 * @see #setIBMFormat(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNN_IBMFormat()
	 * @model required="true"
	 * @generated
	 */
	Integer getIBMFormat();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNN#getIBMFormat <em>IBM Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBM Format</em>' attribute.
	 * @see #getIBMFormat()
	 * @generated
	 */
	void setIBMFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Technology Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technology Format</em>' attribute.
	 * @see #setTechnologyFormat(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNN_TechnologyFormat()
	 * @model required="true"
	 * @generated
	 */
	Integer getTechnologyFormat();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNN#getTechnologyFormat <em>Technology Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology Format</em>' attribute.
	 * @see #getTechnologyFormat()
	 * @generated
	 */
	void setTechnologyFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.FNNRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getFNN_Rg()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<FNNRG> getRg();

	/**
	 * Returns the value of the '<em><b>Rg2</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg2</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getFNN_Rg2()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getRg2();

} // FNN
