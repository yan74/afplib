/**
 */
package org.afplib.base;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.base.AFP#getStructuredFields <em>Structured Fields</em>}</li>
 * </ul>
 *
 * @see org.afplib.base.BasePackage#getAFP()
 * @model
 * @generated
 */
public interface AFP extends EObject {
	/**
	 * Returns the value of the '<em><b>Structured Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.SF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structured Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structured Fields</em>' containment reference list.
	 * @see org.afplib.base.BasePackage#getAFP_StructuredFields()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<SF> getStructuredFields();

} // AFP
