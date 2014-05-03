/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BFM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Form Map</b><br>The Begin Form Map structured field begins a form map object, also called a form definition or formdef. A form map is a print control resource object that contains one or more medium map resource objects that are invokable on document and page boundaries and that specify a complete set of presentation controls. It also contains an optional document environment group (DEG) that defines the presentation environment for the form map.</p><p>ID: 13871309</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BFM#getFMName <em>FM Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BFM#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBFM()
 * @model
 * @generated
 */
public interface BFM extends SF {
	/**
	 * Returns the value of the '<em><b>FM Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FM Name</em>' attribute.
	 * @see #setFMName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBFM_FMName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getFMName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BFM#getFMName <em>FM Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FM Name</em>' attribute.
	 * @see #getFMName()
	 * @generated
	 */
	void setFMName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBFM_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BFM
