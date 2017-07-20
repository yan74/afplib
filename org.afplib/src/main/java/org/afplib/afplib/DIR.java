/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.DIR#getRLENGTH <em>RLENGTH</em>}</li>
 *   <li>{@link org.afplib.afplib.DIR#getRWIDTH <em>RWIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.DIR#getRWIDTHFRACTION <em>RWIDTHFRACTION</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getDIR()
 * @model
 * @generated
 */
public interface DIR extends Triplet {
	/**
     * Returns the value of the '<em><b>RLENGTH</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RLENGTH</em>' attribute.
     * @see #setRLENGTH(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDIR_RLENGTH()
     * @model required="true"
     * @generated
     */
	Integer getRLENGTH();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DIR#getRLENGTH <em>RLENGTH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RLENGTH</em>' attribute.
     * @see #getRLENGTH()
     * @generated
     */
	void setRLENGTH(Integer value);

	/**
     * Returns the value of the '<em><b>RWIDTH</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RWIDTH</em>' attribute.
     * @see #setRWIDTH(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDIR_RWIDTH()
     * @model
     * @generated
     */
	Integer getRWIDTH();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DIR#getRWIDTH <em>RWIDTH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RWIDTH</em>' attribute.
     * @see #getRWIDTH()
     * @generated
     */
	void setRWIDTH(Integer value);

	/**
     * Returns the value of the '<em><b>RWIDTHFRACTION</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RWIDTHFRACTION</em>' attribute.
     * @see #setRWIDTHFRACTION(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDIR_RWIDTHFRACTION()
     * @model
     * @generated
     */
	Integer getRWIDTHFRACTION();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DIR#getRWIDTHFRACTION <em>RWIDTHFRACTION</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RWIDTHFRACTION</em>' attribute.
     * @see #getRWIDTHFRACTION()
     * @generated
     */
	void setRWIDTHFRACTION(Integer value);

} // DIR
