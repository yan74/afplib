/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMORG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MMORG#getOVLid <em>OV Lid</em>}</li>
 *   <li>{@link org.afplib.afplib.MMORG#getFlags <em>Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.MMORG#getOVLname <em>OV Lname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMMORG()
 * @model
 * @generated
 */
public interface MMORG extends Triplet {
	/**
	 * Returns the value of the '<em><b>OV Lid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OV Lid</em>' attribute.
	 * @see #setOVLid(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMMORG_OVLid()
	 * @model required="true"
	 * @generated
	 */
	Integer getOVLid();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MMORG#getOVLid <em>OV Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OV Lid</em>' attribute.
	 * @see #getOVLid()
	 * @generated
	 */
	void setOVLid(Integer value);

	/**
	 * Returns the value of the '<em><b>Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flags</em>' attribute.
	 * @see #setFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMMORG_Flags()
	 * @model required="true"
	 * @generated
	 */
	Integer getFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MMORG#getFlags <em>Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flags</em>' attribute.
	 * @see #getFlags()
	 * @generated
	 */
	void setFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>OV Lname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OV Lname</em>' attribute.
	 * @see #setOVLname(String)
	 * @see org.afplib.afplib.AfplibPackage#getMMORG_OVLname()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getOVLname();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MMORG#getOVLname <em>OV Lname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OV Lname</em>' attribute.
	 * @see #getOVLname()
	 * @generated
	 */
	void setOVLname(String value);

} // MMORG
