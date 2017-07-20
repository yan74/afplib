/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCF1RG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MCF1RG#getCFLid <em>CF Lid</em>}</li>
 *   <li>{@link org.afplib.afplib.MCF1RG#getSectid <em>Sectid</em>}</li>
 *   <li>{@link org.afplib.afplib.MCF1RG#getCFName <em>CF Name</em>}</li>
 *   <li>{@link org.afplib.afplib.MCF1RG#getCPName <em>CP Name</em>}</li>
 *   <li>{@link org.afplib.afplib.MCF1RG#getFCSName <em>FCS Name</em>}</li>
 *   <li>{@link org.afplib.afplib.MCF1RG#getCharRot <em>Char Rot</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMCF1RG()
 * @model
 * @generated
 */
public interface MCF1RG extends Triplet {
	/**
     * Returns the value of the '<em><b>CF Lid</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CF Lid</em>' attribute.
     * @see #setCFLid(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMCF1RG_CFLid()
     * @model required="true"
     * @generated
     */
	Integer getCFLid();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCF1RG#getCFLid <em>CF Lid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CF Lid</em>' attribute.
     * @see #getCFLid()
     * @generated
     */
	void setCFLid(Integer value);

	/**
     * Returns the value of the '<em><b>Sectid</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sectid</em>' attribute.
     * @see #setSectid(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMCF1RG_Sectid()
     * @model required="true"
     * @generated
     */
	Integer getSectid();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCF1RG#getSectid <em>Sectid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sectid</em>' attribute.
     * @see #getSectid()
     * @generated
     */
	void setSectid(Integer value);

	/**
     * Returns the value of the '<em><b>CF Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CF Name</em>' attribute.
     * @see #setCFName(String)
     * @see org.afplib.afplib.AfplibPackage#getMCF1RG_CFName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getCFName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCF1RG#getCFName <em>CF Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CF Name</em>' attribute.
     * @see #getCFName()
     * @generated
     */
	void setCFName(String value);

	/**
     * Returns the value of the '<em><b>CP Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CP Name</em>' attribute.
     * @see #setCPName(String)
     * @see org.afplib.afplib.AfplibPackage#getMCF1RG_CPName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getCPName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCF1RG#getCPName <em>CP Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CP Name</em>' attribute.
     * @see #getCPName()
     * @generated
     */
	void setCPName(String value);

	/**
     * Returns the value of the '<em><b>FCS Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>FCS Name</em>' attribute.
     * @see #setFCSName(String)
     * @see org.afplib.afplib.AfplibPackage#getMCF1RG_FCSName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getFCSName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCF1RG#getFCSName <em>FCS Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>FCS Name</em>' attribute.
     * @see #getFCSName()
     * @generated
     */
	void setFCSName(String value);

	/**
     * Returns the value of the '<em><b>Char Rot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Char Rot</em>' attribute.
     * @see #setCharRot(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMCF1RG_CharRot()
     * @model
     * @generated
     */
	Integer getCharRot();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MCF1RG#getCharRot <em>Char Rot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Char Rot</em>' attribute.
     * @see #getCharRot()
     * @generated
     */
	void setCharRot(Integer value);

} // MCF1RG
