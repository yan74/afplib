/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGP1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Page Position (Format 1)</b><br>Use Format 2 instead!</p><p>ID: 13872303</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PGP1#getXOset <em>XOset</em>}</li>
 *   <li>{@link org.afplib.afplib.PGP1#getYOset <em>YOset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPGP1()
 * @model
 * @generated
 */
public interface PGP1 extends SF {
	/**
	 * Returns the value of the '<em><b>XOset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XOset</em>' attribute.
	 * @see #setXOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGP1_XOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getXOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGP1#getXOset <em>XOset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XOset</em>' attribute.
	 * @see #getXOset()
	 * @generated
	 */
	void setXOset(Integer value);

	/**
	 * Returns the value of the '<em><b>YOset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YOset</em>' attribute.
	 * @see #setYOset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGP1_YOset()
	 * @model required="true"
	 * @generated
	 */
	Integer getYOset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGP1#getYOset <em>YOset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YOset</em>' attribute.
	 * @see #getYOset()
	 * @generated
	 */
	void setYOset(Integer value);

} // PGP1
