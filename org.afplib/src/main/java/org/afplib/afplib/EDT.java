/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EDT#getDocName <em>Doc Name</em>}</li>
 *   <li>{@link org.afplib.afplib.EDT#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEDT()
 * @model
 * @generated
 */
public interface EDT extends SF {
	/**
     * Returns the value of the '<em><b>Doc Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Doc Name</em>' attribute.
     * @see #setDocName(String)
     * @see org.afplib.afplib.AfplibPackage#getEDT_DocName()
     * @model dataType="org.afplib.base.ModcaString8"
     * @generated
     */
	String getDocName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.EDT#getDocName <em>Doc Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Doc Name</em>' attribute.
     * @see #getDocName()
     * @generated
     */
	void setDocName(String value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getEDT_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // EDT
