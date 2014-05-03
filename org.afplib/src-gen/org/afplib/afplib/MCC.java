/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Medium Copy Count</b><br>The Medium Copy Count structured field specifies the number of copies of each medium, or sheet, to be presented, and the modifications that apply to each copy. This specification is called a copy group. The MCC contains repeating groups that specify copy subgroups, such that each copy subgroup may be specified independently of any other copy subgroup. For each copy subgroup, the number of copies, as well as the modifications to be applied to each copy, is specified by the repeating group. If the modifications for a copy subgroup specify duplexing, that copy subgroup and all successive copy subgroups are paired such that the first copy subgroup in the pair specifies the copy count as well as the modifications to be applied to the front side of each copy, and the second copy subgroup in the pair specifies the same copy count as well as an independent set of modifications to be applied to the back side of each copy. The pairing of copy subgroups continues as long as duplexing is specified.</p><p>ID: 13869704</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MCC#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMCC()
 * @model
 * @generated
 */
public interface MCC extends SF {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.MCCRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getMCC_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<MCCRG> getRg();

} // MCC
