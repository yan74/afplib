/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BPM#getPMName <em>PM Name</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBPM()
 * @model
 * @generated
 */
public interface BPM extends SF {
	/**
     * Returns the value of the '<em><b>PM Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>PM Name</em>' attribute.
     * @see #setPMName(String)
     * @see org.afplib.afplib.AfplibPackage#getBPM_PMName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getPMName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BPM#getPMName <em>PM Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>PM Name</em>' attribute.
     * @see #getPMName()
     * @generated
     */
	void setPMName(String value);

} // BPM
