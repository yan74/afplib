/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IPD#getSdfs <em>Sdfs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIPD()
 * @model
 * @generated
 */
public interface IPD extends SF {
	/**
	 * Returns the value of the '<em><b>Sdfs</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sdfs</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getIPD_Sdfs()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getSdfs();

} // IPD
