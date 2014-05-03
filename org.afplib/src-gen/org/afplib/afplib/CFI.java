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
 * <!-- begin-model-doc -->
 * <p><b>Coded Font Index</b><br>The Coded Font Index (CFI) structured field names the font character sets and code pages for the font. The structured field contains a set of parameters, defined as a repeating group. The length of the repeating group is defined in the Coded Font Control structured field. The number of repeating groups in the structured field can be determine by dividing the length of the CFI structured field (minus the length of the structured field introducer) by the length of the CFI repeating group. The repeating groups are sorted in ascending order based on the section identifier.</p><p>ID: 13864074</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CFI#getFixedLengthRG <em>Fixed Length RG</em>}</li>
 * </ul>
 * </p>
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
