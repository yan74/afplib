/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.EMO#getOvlyName <em>Ovly Name</em>}</li>
 *   <li>{@link org.afplib.afplib.EMO#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getEMO()
 * @model
 * @generated
 */
public interface EMO extends SF {
	/**
     * Returns the value of the '<em><b>Ovly Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ovly Name</em>' attribute.
     * @see #setOvlyName(String)
     * @see org.afplib.afplib.AfplibPackage#getEMO_OvlyName()
     * @model dataType="org.afplib.base.ModcaString8"
     * @generated
     */
	String getOvlyName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.EMO#getOvlyName <em>Ovly Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ovly Name</em>' attribute.
     * @see #getOvlyName()
     * @generated
     */
	void setOvlyName(String value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getEMO_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // EMO
