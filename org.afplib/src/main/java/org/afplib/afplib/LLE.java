/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.LLE#getLnkType <em>Lnk Type</em>}</li>
 *   <li>{@link org.afplib.afplib.LLE#getRG <em>RG</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getLLE()
 * @model
 * @generated
 */
public interface LLE extends SF {
	/**
	 * Returns the value of the '<em><b>Lnk Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lnk Type</em>' attribute.
	 * @see #setLnkType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLLE_LnkType()
	 * @model required="true"
	 * @generated
	 */
	Integer getLnkType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LLE#getLnkType <em>Lnk Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lnk Type</em>' attribute.
	 * @see #getLnkType()
	 * @generated
	 */
	void setLnkType(Integer value);

	/**
	 * Returns the value of the '<em><b>RG</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.LLERG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getLLE_RG()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<LLERG> getRG();

} // LLE
