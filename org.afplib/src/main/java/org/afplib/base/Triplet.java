/**
 */
package org.afplib.base;

import java.nio.charset.Charset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triplet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.base.Triplet#getLabel <em>Label</em>}</li>
 *   <li>{@link org.afplib.base.Triplet#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.afplib.base.Triplet#getFileOffset <em>File Offset</em>}</li>
 *   <li>{@link org.afplib.base.Triplet#getTripletLength <em>Triplet Length</em>}</li>
 *   <li>{@link org.afplib.base.Triplet#getTripletId <em>Triplet Id</em>}</li>
 *   <li>{@link org.afplib.base.Triplet#getTripletNumber <em>Triplet Number</em>}</li>
 * </ul>
 *
 * @see org.afplib.base.BasePackage#getTriplet()
 * @model abstract="true"
 * @generated
 */
public interface Triplet extends EObject {
	/**
     * Returns the value of the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Label</em>' attribute.
     * @see #setLabel(String)
     * @see org.afplib.base.BasePackage#getTriplet_Label()
     * @model
     * @generated
     */
	String getLabel();

	/**
     * Sets the value of the '{@link org.afplib.base.Triplet#getLabel <em>Label</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Label</em>' attribute.
     * @see #getLabel()
     * @generated
     */
	void setLabel(String value);

	/**
     * Returns the value of the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Charset</em>' attribute.
     * @see #setCharset(Charset)
     * @see org.afplib.base.BasePackage#getTriplet_Charset()
     * @model dataType="org.afplib.base.Charset"
     * @generated
     */
	Charset getCharset();

	/**
     * Sets the value of the '{@link org.afplib.base.Triplet#getCharset <em>Charset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Charset</em>' attribute.
     * @see #getCharset()
     * @generated
     */
	void setCharset(Charset value);

	/**
     * Returns the value of the '<em><b>File Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>File Offset</em>' attribute.
     * @see #setFileOffset(long)
     * @see org.afplib.base.BasePackage#getTriplet_FileOffset()
     * @model
     * @generated
     */
	long getFileOffset();

	/**
     * Sets the value of the '{@link org.afplib.base.Triplet#getFileOffset <em>File Offset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>File Offset</em>' attribute.
     * @see #getFileOffset()
     * @generated
     */
	void setFileOffset(long value);

	/**
     * Returns the value of the '<em><b>Triplet Length</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplet Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Triplet Length</em>' attribute.
     * @see #setTripletLength(int)
     * @see org.afplib.base.BasePackage#getTriplet_TripletLength()
     * @model
     * @generated
     */
	int getTripletLength();

	/**
     * Sets the value of the '{@link org.afplib.base.Triplet#getTripletLength <em>Triplet Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triplet Length</em>' attribute.
     * @see #getTripletLength()
     * @generated
     */
	void setTripletLength(int value);

	/**
     * Returns the value of the '<em><b>Triplet Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplet Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Triplet Id</em>' attribute.
     * @see #setTripletId(int)
     * @see org.afplib.base.BasePackage#getTriplet_TripletId()
     * @model
     * @generated
     */
	int getTripletId();

	/**
     * Sets the value of the '{@link org.afplib.base.Triplet#getTripletId <em>Triplet Id</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triplet Id</em>' attribute.
     * @see #getTripletId()
     * @generated
     */
	void setTripletId(int value);

	/**
     * Returns the value of the '<em><b>Triplet Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triplet Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Triplet Number</em>' attribute.
     * @see #setTripletNumber(int)
     * @see org.afplib.base.BasePackage#getTriplet_TripletNumber()
     * @model
     * @generated
     */
	int getTripletNumber();

	/**
     * Sets the value of the '{@link org.afplib.base.Triplet#getTripletNumber <em>Triplet Number</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Triplet Number</em>' attribute.
     * @see #getTripletNumber()
     * @generated
     */
	void setTripletNumber(int value);

} // Triplet
