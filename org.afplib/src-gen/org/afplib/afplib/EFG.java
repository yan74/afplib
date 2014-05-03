/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Form Environment Group (obsolete)</b><br>Ends the Form Environment Group</p><p>ID: 13871557</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EFG#getFEGName <em>FEG Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEFG()
 * @model
 * @generated
 */
public interface EFG extends SF {
	/**
	 * Returns the value of the '<em><b>FEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FEG Name</em>' attribute.
	 * @see #setFEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEFG_FEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getFEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EFG#getFEGName <em>FEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FEG Name</em>' attribute.
	 * @see #getFEGName()
	 * @generated
	 */
	void setFEGName(String value);

} // EFG
