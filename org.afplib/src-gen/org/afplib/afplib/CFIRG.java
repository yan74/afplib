/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CFIRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CFIRG#getFCSName <em>FCS Name</em>}</li>
 *   <li>{@link org.afplib.afplib.CFIRG#getCPName <em>CP Name</em>}</li>
 *   <li>{@link org.afplib.afplib.CFIRG#getSVSize <em>SV Size</em>}</li>
 *   <li>{@link org.afplib.afplib.CFIRG#getSHScale <em>SH Scale</em>}</li>
 *   <li>{@link org.afplib.afplib.CFIRG#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.CFIRG#getSection <em>Section</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCFIRG()
 * @model
 * @generated
 */
public interface CFIRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>FCS Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FCS Name</em>' attribute.
	 * @see #setFCSName(String)
	 * @see org.afplib.afplib.AfplibPackage#getCFIRG_FCSName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getFCSName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFIRG#getFCSName <em>FCS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCS Name</em>' attribute.
	 * @see #getFCSName()
	 * @generated
	 */
	void setFCSName(String value);

	/**
	 * Returns the value of the '<em><b>CP Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CP Name</em>' attribute.
	 * @see #setCPName(String)
	 * @see org.afplib.afplib.AfplibPackage#getCFIRG_CPName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getCPName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFIRG#getCPName <em>CP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CP Name</em>' attribute.
	 * @see #getCPName()
	 * @generated
	 */
	void setCPName(String value);

	/**
	 * Returns the value of the '<em><b>SV Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SV Size</em>' attribute.
	 * @see #setSVSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCFIRG_SVSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getSVSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFIRG#getSVSize <em>SV Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SV Size</em>' attribute.
	 * @see #getSVSize()
	 * @generated
	 */
	void setSVSize(Integer value);

	/**
	 * Returns the value of the '<em><b>SH Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SH Scale</em>' attribute.
	 * @see #setSHScale(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCFIRG_SHScale()
	 * @model required="true"
	 * @generated
	 */
	Integer getSHScale();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFIRG#getSHScale <em>SH Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SH Scale</em>' attribute.
	 * @see #getSHScale()
	 * @generated
	 */
	void setSHScale(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getCFIRG_Reserved()
	 * @model required="true"
	 * @generated
	 */
	byte[] getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFIRG#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(byte[] value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #setSection(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCFIRG_Section()
	 * @model required="true"
	 * @generated
	 */
	Integer getSection();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CFIRG#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(Integer value);

} // CFIRG
