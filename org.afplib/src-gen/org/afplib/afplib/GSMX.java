/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSMX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Mix</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSMX#getMODE <em>MODE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSMX()
 * @model
 * @generated
 */
public interface GSMX extends Triplet {
	/**
	 * Returns the value of the '<em><b>MODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MODE</em>' attribute.
	 * @see #setMODE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSMX_MODE()
	 * @model required="true"
	 * @generated
	 */
	Integer getMODE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSMX#getMODE <em>MODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MODE</em>' attribute.
	 * @see #getMODE()
	 * @generated
	 */
	void setMODE(Integer value);

} // GSMX
