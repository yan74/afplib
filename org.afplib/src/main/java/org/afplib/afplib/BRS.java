/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BRS#getRSName <em>RS Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BRS#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBRS()
 * @model
 * @generated
 */
public interface BRS extends SF {
	/**
     * Returns the value of the '<em><b>RS Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RS Name</em>' attribute.
     * @see #setRSName(String)
     * @see org.afplib.afplib.AfplibPackage#getBRS_RSName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getRSName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BRS#getRSName <em>RS Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RS Name</em>' attribute.
     * @see #getRSName()
     * @generated
     */
	void setRSName(String value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getBRS_Triplets()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // BRS
