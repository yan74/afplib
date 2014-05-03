/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFLTRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GFLTRG#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GFLTRG#getYPOS <em>YPOS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGFLTRG()
 * @model
 * @generated
 */
public interface GFLTRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>XPOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPOS</em>' attribute.
	 * @see #setXPOS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGFLTRG_XPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GFLTRG#getXPOS <em>XPOS</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getGFLTRG_YPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GFLTRG#getYPOS <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPOS</em>' attribute.
	 * @see #getYPOS()
	 * @generated
	 */
	void setYPOS(Integer value);

} // GFLTRG
