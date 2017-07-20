/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BMO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BMO#getOvlyName <em>Ovly Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BMO#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBMO()
 * @model
 * @generated
 */
public interface BMO extends SF {
	/**
     * Returns the value of the '<em><b>Ovly Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ovly Name</em>' attribute.
     * @see #setOvlyName(String)
     * @see org.afplib.afplib.AfplibPackage#getBMO_OvlyName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getOvlyName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BMO#getOvlyName <em>Ovly Name</em>}' attribute.
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
     * @see org.afplib.afplib.AfplibPackage#getBMO_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // BMO
