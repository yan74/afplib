/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Print File</b><br>The Begin Print File structured field names and begins the print file.</p><p>ID: 13871269</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BPF#getPFName <em>PF Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BPF#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBPF()
 * @model
 * @generated
 */
public interface BPF extends SF {
	/**
	 * Returns the value of the '<em><b>PF Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PF Name</em>' attribute.
	 * @see #setPFName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBPF_PFName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getPFName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BPF#getPFName <em>PF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PF Name</em>' attribute.
	 * @see #getPFName()
	 * @generated
	 */
	void setPFName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBPF_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BPF
