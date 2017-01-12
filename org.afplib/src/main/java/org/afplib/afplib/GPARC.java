/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPARC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GPARC#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getXCENT <em>XCENT</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getYCENT <em>YCENT</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getMH <em>MH</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getMFR <em>MFR</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getSTART <em>START</em>}</li>
 *   <li>{@link org.afplib.afplib.GPARC#getSWEEP <em>SWEEP</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGPARC()
 * @model
 * @generated
 */
public interface GPARC extends Triplet {
	/**
	 * Returns the value of the '<em><b>XPOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPOS</em>' attribute.
	 * @see #setXPOS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_XPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getXPOS <em>XPOS</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_YPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getYPOS <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPOS</em>' attribute.
	 * @see #getYPOS()
	 * @generated
	 */
	void setYPOS(Integer value);

	/**
	 * Returns the value of the '<em><b>XCENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XCENT</em>' attribute.
	 * @see #setXCENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_XCENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getXCENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getXCENT <em>XCENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XCENT</em>' attribute.
	 * @see #getXCENT()
	 * @generated
	 */
	void setXCENT(Integer value);

	/**
	 * Returns the value of the '<em><b>YCENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YCENT</em>' attribute.
	 * @see #setYCENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_YCENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getYCENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getYCENT <em>YCENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YCENT</em>' attribute.
	 * @see #getYCENT()
	 * @generated
	 */
	void setYCENT(Integer value);

	/**
	 * Returns the value of the '<em><b>MH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MH</em>' attribute.
	 * @see #setMH(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_MH()
	 * @model required="true"
	 * @generated
	 */
	Integer getMH();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getMH <em>MH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MH</em>' attribute.
	 * @see #getMH()
	 * @generated
	 */
	void setMH(Integer value);

	/**
	 * Returns the value of the '<em><b>MFR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MFR</em>' attribute.
	 * @see #setMFR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_MFR()
	 * @model required="true"
	 * @generated
	 */
	Integer getMFR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getMFR <em>MFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFR</em>' attribute.
	 * @see #getMFR()
	 * @generated
	 */
	void setMFR(Integer value);

	/**
	 * Returns the value of the '<em><b>START</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>START</em>' attribute.
	 * @see #setSTART(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_START()
	 * @model required="true"
	 * @generated
	 */
	Integer getSTART();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getSTART <em>START</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>START</em>' attribute.
	 * @see #getSTART()
	 * @generated
	 */
	void setSTART(Integer value);

	/**
	 * Returns the value of the '<em><b>SWEEP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SWEEP</em>' attribute.
	 * @see #setSWEEP(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGPARC_SWEEP()
	 * @model required="true"
	 * @generated
	 */
	Integer getSWEEP();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GPARC#getSWEEP <em>SWEEP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SWEEP</em>' attribute.
	 * @see #getSWEEP()
	 * @generated
	 */
	void setSWEEP(Integer value);

} // GPARC
