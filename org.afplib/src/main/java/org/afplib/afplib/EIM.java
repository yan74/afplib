/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EIM#getIdoName <em>Ido Name</em>}</li>
 *   <li>{@link org.afplib.afplib.EIM#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEIM()
 * @model
 * @generated
 */
public interface EIM extends SF {
	/**
	 * Returns the value of the '<em><b>Ido Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ido Name</em>' attribute.
	 * @see #setIdoName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEIM_IdoName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getIdoName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EIM#getIdoName <em>Ido Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ido Name</em>' attribute.
	 * @see #getIdoName()
	 * @generated
	 */
	void setIdoName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getEIM_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // EIM
