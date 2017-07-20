/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MSU#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMSU()
 * @model
 * @generated
 */
public interface MSU extends SF {
	/**
     * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.afplib.MSURG}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rg</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getMSU_Rg()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
	EList<MSURG> getRg();

} // MSU
