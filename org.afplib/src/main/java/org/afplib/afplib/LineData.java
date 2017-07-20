/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.LineData#getLinedata <em>Linedata</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getLineData()
 * @model
 * @generated
 */
public interface LineData extends SF {
	/**
     * Returns the value of the '<em><b>Linedata</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linedata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Linedata</em>' attribute.
     * @see #setLinedata(String)
     * @see org.afplib.afplib.AfplibPackage#getLineData_Linedata()
     * @model dataType="org.afplib.base.ModcaString"
     * @generated
     */
	String getLinedata();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LineData#getLinedata <em>Linedata</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Linedata</em>' attribute.
     * @see #getLinedata()
     * @generated
     */
	void setLinedata(String value);

} // LineData
