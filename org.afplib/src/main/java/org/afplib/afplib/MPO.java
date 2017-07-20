/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MPO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MPO#getRG <em>RG</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMPO()
 * @model
 * @generated
 */
public interface MPO extends SF {
	/**
     * Returns the value of the '<em><b>RG</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.afplib.MPORG}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RG</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getMPO_RG()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
	EList<MPORG> getRG();

} // MPO
