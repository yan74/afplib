/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BGR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BGR#getGdoName <em>Gdo Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BGR#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBGR()
 * @model
 * @generated
 */
public interface BGR extends SF {
	/**
	 * Returns the value of the '<em><b>Gdo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gdo Name</em>' attribute.
	 * @see #setGdoName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBGR_GdoName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getGdoName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BGR#getGdoName <em>Gdo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdo Name</em>' attribute.
	 * @see #getGdoName()
	 * @generated
	 */
	void setGdoName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBGR_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BGR
