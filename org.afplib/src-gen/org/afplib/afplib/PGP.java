/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Page Position (Format 2)</b><br>The Page Position structured field specifies the position and orientation of a page's presentation space on the medium presentation space for the physical medium.</p><p>ID: 13873583</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PGP#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.afplib.afplib.PGP#getRG <em>RG</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPGP()
 * @model
 * @generated
 */
public interface PGP extends SF {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPGP_Constant()
	 * @model required="true"
	 * @generated
	 */
	Integer getConstant();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PGP#getConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(Integer value);

	/**
	 * Returns the value of the '<em><b>RG</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.PGPRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getPGP_RG()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<PGPRG> getRG();

} // PGP
