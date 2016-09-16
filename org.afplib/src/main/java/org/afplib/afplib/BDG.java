/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BDG#getDEGName <em>DEG Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BDG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBDG()
 * @model
 * @generated
 */
public interface BDG extends SF {
	/**
	 * Returns the value of the '<em><b>DEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DEG Name</em>' attribute.
	 * @see #setDEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBDG_DEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getDEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BDG#getDEGName <em>DEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEG Name</em>' attribute.
	 * @see #getDEGName()
	 * @generated
	 */
	void setDEGName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBDG_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BDG
