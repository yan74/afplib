/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEPROL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Prolog</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GEPROL#getRES <em>RES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGEPROL()
 * @model
 * @generated
 */
public interface GEPROL extends Triplet {
	/**
	 * Returns the value of the '<em><b>RES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RES</em>' attribute.
	 * @see #setRES(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGEPROL_RES()
	 * @model required="true"
	 * @generated
	 */
	Integer getRES();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GEPROL#getRES <em>RES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RES</em>' attribute.
	 * @see #getRES()
	 * @generated
	 */
	void setRES(Integer value);

} // GEPROL
