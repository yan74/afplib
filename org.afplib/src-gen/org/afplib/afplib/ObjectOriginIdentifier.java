/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Origin Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectOriginIdentifier#getSystem <em>System</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectOriginIdentifier#getSysID <em>Sys ID</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectOriginIdentifier#getMedID <em>Med ID</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectOriginIdentifier#getDSID <em>DSID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectOriginIdentifier()
 * @model
 * @generated
 */
public interface ObjectOriginIdentifier extends Triplet {
	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectOriginIdentifier_System()
	 * @model required="true"
	 * @generated
	 */
	Integer getSystem();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOriginIdentifier#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Integer value);

	/**
	 * Returns the value of the '<em><b>Sys ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sys ID</em>' attribute.
	 * @see #setSysID(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getObjectOriginIdentifier_SysID()
	 * @model required="true"
	 * @generated
	 */
	byte[] getSysID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOriginIdentifier#getSysID <em>Sys ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sys ID</em>' attribute.
	 * @see #getSysID()
	 * @generated
	 */
	void setSysID(byte[] value);

	/**
	 * Returns the value of the '<em><b>Med ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Med ID</em>' attribute.
	 * @see #setMedID(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getObjectOriginIdentifier_MedID()
	 * @model required="true"
	 * @generated
	 */
	byte[] getMedID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOriginIdentifier#getMedID <em>Med ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med ID</em>' attribute.
	 * @see #getMedID()
	 * @generated
	 */
	void setMedID(byte[] value);

	/**
	 * Returns the value of the '<em><b>DSID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DSID</em>' attribute.
	 * @see #setDSID(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getObjectOriginIdentifier_DSID()
	 * @model required="true"
	 * @generated
	 */
	byte[] getDSID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectOriginIdentifier#getDSID <em>DSID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSID</em>' attribute.
	 * @see #getDSID()
	 * @generated
	 */
	void setDSID(byte[] value);

} // ObjectOriginIdentifier
