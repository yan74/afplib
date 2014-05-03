/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDX</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EDX#getDMXName <em>DMX Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEDX()
 * @model
 * @generated
 */
public interface EDX extends SF {
	/**
	 * Returns the value of the '<em><b>DMX Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DMX Name</em>' attribute.
	 * @see #setDMXName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEDX_DMXName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getDMXName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EDX#getDMXName <em>DMX Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DMX Name</em>' attribute.
	 * @see #getDMXName()
	 * @generated
	 */
	void setDMXName(String value);

} // EDX
