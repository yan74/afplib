/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Document Index</b><br>The Begin Document Index structured field begins the document index.</p><p>ID: 13871271</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BDI#getIndxName <em>Indx Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BDI#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBDI()
 * @model
 * @generated
 */
public interface BDI extends SF {
	/**
	 * Returns the value of the '<em><b>Indx Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indx Name</em>' attribute.
	 * @see #setIndxName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBDI_IndxName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getIndxName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BDI#getIndxName <em>Indx Name</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getBDI_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BDI
