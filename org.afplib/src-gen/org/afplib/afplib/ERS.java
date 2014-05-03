/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Resource</b><br>The End Resource structured field terminates an envelope that is used to carry resource objects in external (print file level) resource groups. The envelope is initiated by a Begin Resource (BRS) structured field.</p><p>ID: 13871566</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ERS#getRSName <em>RS Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getERS()
 * @model
 * @generated
 */
public interface ERS extends SF {
	/**
	 * Returns the value of the '<em><b>RS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RS Name</em>' attribute.
	 * @see #setRSName(String)
	 * @see org.afplib.afplib.AfplibPackage#getERS_RSName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getRSName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ERS#getRSName <em>RS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RS Name</em>' attribute.
	 * @see #getRSName()
	 * @generated
	 */
	void setRSName(String value);

} // ERS
