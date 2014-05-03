/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Object Container</b><br>The End Object Container structured field terminates an object container initiated by a Begin Object Container structured field.</p><p>ID: 13871506</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EOC#getObjCName <em>Obj CName</em>}</li>
 *   <li>{@link org.afplib.afplib.EOC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEOC()
 * @model
 * @generated
 */
public interface EOC extends SF {
	/**
	 * Returns the value of the '<em><b>Obj CName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Obj CName</em>' attribute.
	 * @see #setObjCName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEOC_ObjCName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getObjCName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EOC#getObjCName <em>Obj CName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Obj CName</em>' attribute.
	 * @see #getObjCName()
	 * @generated
	 */
	void setObjCName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getEOC_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // EOC
