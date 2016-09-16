/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BFG#getFEGName <em>FEG Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBFG()
 * @model
 * @generated
 */
public interface BFG extends SF {
	/**
	 * Returns the value of the '<em><b>FEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FEG Name</em>' attribute.
	 * @see #setFEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBFG_FEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getFEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BFG#getFEGName <em>FEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FEG Name</em>' attribute.
	 * @see #getFEGName()
	 * @generated
	 */
	void setFEGName(String value);

} // BFG
