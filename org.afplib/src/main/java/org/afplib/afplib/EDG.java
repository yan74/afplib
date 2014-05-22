/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EDG#getDEGName <em>DEG Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEDG()
 * @model
 * @generated
 */
public interface EDG extends SF {
	/**
	 * Returns the value of the '<em><b>DEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DEG Name</em>' attribute.
	 * @see #setDEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEDG_DEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getDEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EDG#getDEGName <em>DEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEG Name</em>' attribute.
	 * @see #getDEGName()
	 * @generated
	 */
	void setDEGName(String value);

} // EDG
