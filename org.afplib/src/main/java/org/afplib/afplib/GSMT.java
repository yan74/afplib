/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSMT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSMT#getMCPT <em>MCPT</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSMT()
 * @model
 * @generated
 */
public interface GSMT extends Triplet {
	/**
	 * Returns the value of the '<em><b>MCPT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MCPT</em>' attribute.
	 * @see #setMCPT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSMT_MCPT()
	 * @model required="true"
	 * @generated
	 */
	Integer getMCPT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSMT#getMCPT <em>MCPT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MCPT</em>' attribute.
	 * @see #getMCPT()
	 * @generated
	 */
	void setMCPT(Integer value);

} // GSMT
