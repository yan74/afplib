/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Intercharacter Adjustment</b><br>The Set Intercharacter Adjustment control sequence specifies additional increment or decrement between graphic characters. This is a modal control sequence.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.SIA#getADJSTMNT <em>ADJSTMNT</em>}</li>
 *   <li>{@link org.afplib.afplib.SIA#getDIRCTION <em>DIRCTION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSIA()
 * @model
 * @generated
 */
public interface SIA extends Triplet {
	/**
	 * Returns the value of the '<em><b>ADJSTMNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ADJSTMNT</em>' attribute.
	 * @see #setADJSTMNT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSIA_ADJSTMNT()
	 * @model required="true"
	 * @generated
	 */
	Integer getADJSTMNT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SIA#getADJSTMNT <em>ADJSTMNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADJSTMNT</em>' attribute.
	 * @see #getADJSTMNT()
	 * @generated
	 */
	void setADJSTMNT(Integer value);

	/**
	 * Returns the value of the '<em><b>DIRCTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DIRCTION</em>' attribute.
	 * @see #setDIRCTION(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSIA_DIRCTION()
	 * @model
	 * @generated
	 */
	Integer getDIRCTION();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SIA#getDIRCTION <em>DIRCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIRCTION</em>' attribute.
	 * @see #getDIRCTION()
	 * @generated
	 */
	void setDIRCTION(Integer value);

} // SIA
