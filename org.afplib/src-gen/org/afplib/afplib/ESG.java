/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ESG#getREGName <em>REG Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getESG()
 * @model
 * @generated
 */
public interface ESG extends SF {
	/**
	 * Returns the value of the '<em><b>REG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>REG Name</em>' attribute.
	 * @see #setREGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getESG_REGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getREGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ESG#getREGName <em>REG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REG Name</em>' attribute.
	 * @see #getREGName()
	 * @generated
	 */
	void setREGName(String value);

} // ESG
