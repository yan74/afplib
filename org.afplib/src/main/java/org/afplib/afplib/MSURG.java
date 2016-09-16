/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSURG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MSURG#getSUPname <em>SU Pname</em>}</li>
 *   <li>{@link org.afplib.afplib.MSURG#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.MSURG#getSUPid <em>SU Pid</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMSURG()
 * @model
 * @generated
 */
public interface MSURG extends Triplet {
	/**
	 * Returns the value of the '<em><b>SU Pname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SU Pname</em>' attribute.
	 * @see #setSUPname(String)
	 * @see org.afplib.afplib.AfplibPackage#getMSURG_SUPname()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getSUPname();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MSURG#getSUPname <em>SU Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SU Pname</em>' attribute.
	 * @see #getSUPname()
	 * @generated
	 */
	void setSUPname(String value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getMSURG_Reserved()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MSURG#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

	/**
	 * Returns the value of the '<em><b>SU Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SU Pid</em>' attribute.
	 * @see #setSUPid(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMSURG_SUPid()
	 * @model required="true"
	 * @generated
	 */
	Integer getSUPid();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MSURG#getSUPid <em>SU Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SU Pid</em>' attribute.
	 * @see #getSUPid()
	 * @generated
	 */
	void setSUPid(Integer value);

} // MSURG
