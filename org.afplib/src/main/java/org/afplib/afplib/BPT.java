/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BPT#getPTdoName <em>PTdo Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BPT#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBPT()
 * @model
 * @generated
 */
public interface BPT extends SF {
	/**
	 * Returns the value of the '<em><b>PTdo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PTdo Name</em>' attribute.
	 * @see #setPTdoName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBPT_PTdoName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getPTdoName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BPT#getPTdoName <em>PTdo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTdo Name</em>' attribute.
	 * @see #getPTdoName()
	 * @generated
	 */
	void setPTdoName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBPT_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BPT
