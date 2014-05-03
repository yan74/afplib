/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRLINE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Relative Line</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GRLINE#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GRLINE#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.GRLINE#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGRLINE()
 * @model
 * @generated
 */
public interface GRLINE extends Triplet {
	/**
	 * Returns the value of the '<em><b>XPOS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XPOS</em>' attribute.
	 * @see #setXPOS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGRLINE_XPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getXPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GRLINE#getXPOS <em>XPOS</em>}' attribute.
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
	 * @see org.afplib.afplib.AfplibPackage#getGRLINE_YPOS()
	 * @model required="true"
	 * @generated
	 */
	Integer getYPOS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GRLINE#getYPOS <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPOS</em>' attribute.
	 * @see #getYPOS()
	 * @generated
	 */
	void setYPOS(Integer value);

	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.GRLINERG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getGRLINE_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<GRLINERG> getRg();

} // GRLINE
