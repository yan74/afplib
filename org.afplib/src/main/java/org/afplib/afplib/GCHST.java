/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GCHST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GCHST#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GCHST#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GCHST#getCP <em>CP</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGCHST()
 * @model
 * @generated
 */
public interface GCHST extends Triplet {
	/**
     * Returns the value of the '<em><b>XPOS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>XPOS</em>' attribute.
     * @see #setXPOS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCHST_XPOS()
     * @model required="true"
     * @generated
     */
	Integer getXPOS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCHST#getXPOS <em>XPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>XPOS</em>' attribute.
     * @see #getXPOS()
     * @generated
     */
	void setXPOS(Integer value);

	/**
     * Returns the value of the '<em><b>YPOS</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>YPOS</em>' attribute.
     * @see #setYPOS(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGCHST_YPOS()
     * @model required="true"
     * @generated
     */
	Integer getYPOS();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCHST#getYPOS <em>YPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>YPOS</em>' attribute.
     * @see #getYPOS()
     * @generated
     */
	void setYPOS(Integer value);

	/**
     * Returns the value of the '<em><b>CP</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CP</em>' attribute.
     * @see #setCP(String)
     * @see org.afplib.afplib.AfplibPackage#getGCHST_CP()
     * @model dataType="org.afplib.base.ModcaString" required="true"
     * @generated
     */
	String getCP();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GCHST#getCP <em>CP</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CP</em>' attribute.
     * @see #getCP()
     * @generated
     */
	void setCP(String value);

} // GCHST
