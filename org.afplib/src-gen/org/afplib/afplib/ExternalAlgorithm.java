/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ExternalAlgorithm#getALGTYPE <em>ALGTYPE</em>}</li>
 *   <li>{@link org.afplib.afplib.ExternalAlgorithm#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithm()
 * @model
 * @generated
 */
public interface ExternalAlgorithm extends Triplet {
	/**
	 * Returns the value of the '<em><b>ALGTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ALGTYPE</em>' attribute.
	 * @see #setALGTYPE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithm_ALGTYPE()
	 * @model required="true"
	 * @generated
	 */
	Integer getALGTYPE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ExternalAlgorithm#getALGTYPE <em>ALGTYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ALGTYPE</em>' attribute.
	 * @see #getALGTYPE()
	 * @generated
	 */
	void setALGTYPE(Integer value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.ExternalAlgorithmRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithm_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<ExternalAlgorithmRG> getRg();

} // ExternalAlgorithm
