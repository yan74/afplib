/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Inline Margin</b><br>The Set Inline Margin control sequence specifies the position of an inline margin. This is a modal control sequence.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.SIM#getDSPLCMNT <em>DSPLCMNT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSIM()
 * @model
 * @generated
 */
public interface SIM extends Triplet {
	/**
	 * Returns the value of the '<em><b>DSPLCMNT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DSPLCMNT</em>' attribute.
	 * @see #setDSPLCMNT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSIM_DSPLCMNT()
	 * @model required="true"
	 * @generated
	 */
	Integer getDSPLCMNT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SIM#getDSPLCMNT <em>DSPLCMNT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSPLCMNT</em>' attribute.
	 * @see #getDSPLCMNT()
	 * @generated
	 */
	void setDSPLCMNT(Integer value);

} // SIM
