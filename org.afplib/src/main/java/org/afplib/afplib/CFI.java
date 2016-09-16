/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.CFI#getFixedLengthRG <em>Fixed Length RG</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getCFI()
 * @model
 * @generated
 */
public interface CFI extends SF {
	/**
	 * Returns the value of the '<em><b>Fixed Length RG</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.CFIRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Length RG</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getCFI_FixedLengthRG()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<CFIRG> getFixedLengthRG();

} // CFI
