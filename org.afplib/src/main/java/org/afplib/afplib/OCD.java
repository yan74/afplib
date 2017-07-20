/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.OCD#getObjCdat <em>Obj Cdat</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getOCD()
 * @model
 * @generated
 */
public interface OCD extends SF {
	/**
     * Returns the value of the '<em><b>Obj Cdat</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Obj Cdat</em>' attribute.
     * @see #setObjCdat(byte[])
     * @see org.afplib.afplib.AfplibPackage#getOCD_ObjCdat()
     * @model
     * @generated
     */
	byte[] getObjCdat();

	/**
     * Sets the value of the '{@link org.afplib.afplib.OCD#getObjCdat <em>Obj Cdat</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Obj Cdat</em>' attribute.
     * @see #getObjCdat()
     * @generated
     */
	void setObjCdat(byte[] value);

} // OCD
