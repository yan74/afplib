/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BOC#getObjCName <em>Obj CName</em>}</li>
 *   <li>{@link org.afplib.afplib.BOC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBOC()
 * @model
 * @generated
 */
public interface BOC extends SF {
	/**
     * Returns the value of the '<em><b>Obj CName</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Obj CName</em>' attribute.
     * @see #setObjCName(String)
     * @see org.afplib.afplib.AfplibPackage#getBOC_ObjCName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getObjCName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BOC#getObjCName <em>Obj CName</em>}' attribute.
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
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getBOC_Triplets()
     * @model containment="true" resolveProxies="true" required="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // BOC
