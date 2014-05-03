/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Data Map</b><br>Ends the Data Map</p><p>ID: 13871562</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EDM#getDMName <em>DM Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEDM()
 * @model
 * @generated
 */
public interface EDM extends SF {
	/**
	 * Returns the value of the '<em><b>DM Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DM Name</em>' attribute.
	 * @see #setDMName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEDM_DMName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getDMName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EDM#getDMName <em>DM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DM Name</em>' attribute.
	 * @see #getDMName()
	 * @generated
	 */
	void setDMName(String value);

} // EDM
