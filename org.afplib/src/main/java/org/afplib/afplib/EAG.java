/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EAG#getAEGName <em>AEG Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEAG()
 * @model
 * @generated
 */
public interface EAG extends SF {
	/**
	 * Returns the value of the '<em><b>AEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AEG Name</em>' attribute.
	 * @see #setAEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEAG_AEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getAEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EAG#getAEGName <em>AEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AEG Name</em>' attribute.
	 * @see #getAEGName()
	 * @generated
	 */
	void setAEGName(String value);

} // EAG
