/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IRD#getIMdata <em>IMdata</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIRD()
 * @model
 * @generated
 */
public interface IRD extends SF {
	/**
	 * Returns the value of the '<em><b>IMdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IMdata</em>' attribute.
	 * @see #setIMdata(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getIRD_IMdata()
	 * @model required="true"
	 * @generated
	 */
	byte[] getIMdata();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IRD#getIMdata <em>IMdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IMdata</em>' attribute.
	 * @see #getIMdata()
	 * @generated
	 */
	void setIMdata(byte[] value);

} // IRD
