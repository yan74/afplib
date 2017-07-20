/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Object Font Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getDOFtFlgs <em>DO Ft Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getFontTech <em>Font Tech</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getVFS <em>VFS</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getHFS <em>HFS</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getCharRot <em>Char Rot</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getEncEnv <em>Enc Env</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getEncID <em>Enc ID</em>}</li>
 *   <li>{@link org.afplib.afplib.DataObjectFontDescriptor#getReserved <em>Reserved</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor()
 * @model
 * @generated
 */
public interface DataObjectFontDescriptor extends Triplet {
	/**
     * Returns the value of the '<em><b>DO Ft Flgs</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>DO Ft Flgs</em>' attribute.
     * @see #setDOFtFlgs(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_DOFtFlgs()
     * @model required="true"
     * @generated
     */
	Integer getDOFtFlgs();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getDOFtFlgs <em>DO Ft Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>DO Ft Flgs</em>' attribute.
     * @see #getDOFtFlgs()
     * @generated
     */
	void setDOFtFlgs(Integer value);

	/**
     * Returns the value of the '<em><b>Font Tech</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Font Tech</em>' attribute.
     * @see #setFontTech(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_FontTech()
     * @model required="true"
     * @generated
     */
	Integer getFontTech();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getFontTech <em>Font Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Font Tech</em>' attribute.
     * @see #getFontTech()
     * @generated
     */
	void setFontTech(Integer value);

	/**
     * Returns the value of the '<em><b>VFS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>VFS</em>' attribute.
     * @see #setVFS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_VFS()
     * @model required="true"
     * @generated
     */
	Integer getVFS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getVFS <em>VFS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>VFS</em>' attribute.
     * @see #getVFS()
     * @generated
     */
	void setVFS(Integer value);

	/**
     * Returns the value of the '<em><b>HFS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>HFS</em>' attribute.
     * @see #setHFS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_HFS()
     * @model required="true"
     * @generated
     */
	Integer getHFS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getHFS <em>HFS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>HFS</em>' attribute.
     * @see #getHFS()
     * @generated
     */
	void setHFS(Integer value);

	/**
     * Returns the value of the '<em><b>Char Rot</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Char Rot</em>' attribute.
     * @see #setCharRot(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_CharRot()
     * @model required="true"
     * @generated
     */
	Integer getCharRot();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getCharRot <em>Char Rot</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Char Rot</em>' attribute.
     * @see #getCharRot()
     * @generated
     */
	void setCharRot(Integer value);

	/**
     * Returns the value of the '<em><b>Enc Env</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enc Env</em>' attribute.
     * @see #setEncEnv(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_EncEnv()
     * @model required="true"
     * @generated
     */
	Integer getEncEnv();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getEncEnv <em>Enc Env</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enc Env</em>' attribute.
     * @see #getEncEnv()
     * @generated
     */
	void setEncEnv(Integer value);

	/**
     * Returns the value of the '<em><b>Enc ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Enc ID</em>' attribute.
     * @see #setEncID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_EncID()
     * @model required="true"
     * @generated
     */
	Integer getEncID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getEncID <em>Enc ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enc ID</em>' attribute.
     * @see #getEncID()
     * @generated
     */
	void setEncID(Integer value);

	/**
     * Returns the value of the '<em><b>Reserved</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reserved</em>' attribute.
     * @see #setReserved(byte[])
     * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptor_Reserved()
     * @model required="true"
     * @generated
     */
	byte[] getReserved();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DataObjectFontDescriptor#getReserved <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reserved</em>' attribute.
     * @see #getReserved()
     * @generated
     */
	void setReserved(byte[] value);

} // DataObjectFontDescriptor
