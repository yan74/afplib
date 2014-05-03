/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Position Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PagePositionInformation#getPGPRG <em>PGPRG</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPagePositionInformation()
 * @model
 * @generated
 */
public interface PagePositionInformation extends Triplet {
	/**
	 * Returns the value of the '<em><b>PGPRG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PGPRG</em>' attribute.
	 * @see #setPGPRG(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPagePositionInformation_PGPRG()
	 * @model required="true"
	 * @generated
	 */
	Integer getPGPRG();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PagePositionInformation#getPGPRG <em>PGPRG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGPRG</em>' attribute.
	 * @see #getPGPRG()
	 * @generated
	 */
	void setPGPRG(Integer value);

} // PagePositionInformation
