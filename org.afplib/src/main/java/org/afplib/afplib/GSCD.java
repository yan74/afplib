/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSCD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSCD#getDIRECTION <em>DIRECTION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSCD()
 * @model
 * @generated
 */
public interface GSCD extends Triplet {
	/**
	 * Returns the value of the '<em><b>DIRECTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DIRECTION</em>' attribute.
	 * @see #setDIRECTION(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSCD_DIRECTION()
	 * @model required="true"
	 * @generated
	 */
	Integer getDIRECTION();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSCD#getDIRECTION <em>DIRECTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIRECTION</em>' attribute.
	 * @see #getDIRECTION()
	 * @generated
	 */
	void setDIRECTION(Integer value);

} // GSCD
