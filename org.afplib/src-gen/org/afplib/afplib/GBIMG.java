/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBIMG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GBIMG#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GBIMG#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GBIMG#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.GBIMG#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.GBIMG#getWIDTH <em>WIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.GBIMG#getHEIGHT <em>HEIGHT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGBIMG()
 * @model
 * @generated
 */
public interface GBIMG extends Triplet {
	/**
	 * Returns the value of the '<em><b>XPOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPOS</em>' attribute.
	 * @see #setXPOS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGBIMG_XPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBIMG#getXPOS <em>XPOS</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getGBIMG_YPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBIMG#getYPOS <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPOS</em>' attribute.
	 * @see #getYPOS()
	 * @generated
	 */
	void setYPOS(Integer value);

	/**
	 * Returns the value of the '<em><b>FORMAT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FORMAT</em>' attribute.
	 * @see #setFORMAT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGBIMG_FORMAT()
	 * @model required="true"
	 * @generated
	 */
	Integer getFORMAT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBIMG#getFORMAT <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FORMAT</em>' attribute.
	 * @see #getFORMAT()
	 * @generated
	 */
	void setFORMAT(Integer value);

	/**
	 * Returns the value of the '<em><b>RES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RES</em>' attribute.
	 * @see #setRES(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGBIMG_RES()
	 * @model required="true"
	 * @generated
	 */
	Integer getRES();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBIMG#getRES <em>RES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RES</em>' attribute.
	 * @see #getRES()
	 * @generated
	 */
	void setRES(Integer value);

	/**
	 * Returns the value of the '<em><b>WIDTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WIDTH</em>' attribute.
	 * @see #setWIDTH(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGBIMG_WIDTH()
	 * @model required="true"
	 * @generated
	 */
	Integer getWIDTH();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBIMG#getWIDTH <em>WIDTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WIDTH</em>' attribute.
	 * @see #getWIDTH()
	 * @generated
	 */
	void setWIDTH(Integer value);

	/**
	 * Returns the value of the '<em><b>HEIGHT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HEIGHT</em>' attribute.
	 * @see #setHEIGHT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGBIMG_HEIGHT()
	 * @model required="true"
	 * @generated
	 */
	Integer getHEIGHT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBIMG#getHEIGHT <em>HEIGHT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HEIGHT</em>' attribute.
	 * @see #getHEIGHT()
	 * @generated
	 */
	void setHEIGHT(Integer value);

} // GBIMG
