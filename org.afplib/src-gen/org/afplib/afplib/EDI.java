/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Document Index</b><br>The End Document Index structured field terminates the document index initiated by a Begin Document Index structured field.</p><p>ID: 13871527</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EDI#getIndxName <em>Indx Name</em>}</li>
 *   <li>{@link org.afplib.afplib.EDI#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEDI()
 * @model
 * @generated
 */
public interface EDI extends SF {
	/**
	 * Returns the value of the '<em><b>Indx Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indx Name</em>' attribute.
	 * @see #setIndxName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEDI_IndxName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getIndxName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EDI#getIndxName <em>Indx Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indx Name</em>' attribute.
	 * @see #getIndxName()
	 * @generated
	 */
	void setIndxName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getEDI_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // EDI
