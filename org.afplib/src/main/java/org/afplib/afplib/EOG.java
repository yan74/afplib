/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EOG#getOEGName <em>OEG Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEOG()
 * @model
 * @generated
 */
public interface EOG extends SF {
	/**
	 * Returns the value of the '<em><b>OEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OEG Name</em>' attribute.
	 * @see #setOEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEOG_OEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getOEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EOG#getOEGName <em>OEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OEG Name</em>' attribute.
	 * @see #getOEGName()
	 * @generated
	 */
	void setOEGName(String value);

} // EOG
