/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MMC#getMMCid <em>MM Cid</em>}</li>
 *   <li>{@link org.afplib.afplib.MMC#getPARAMETER1 <em>PARAMETER1</em>}</li>
 *   <li>{@link org.afplib.afplib.MMC#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMMC()
 * @model
 * @generated
 */
public interface MMC extends SF {
	/**
     * Returns the value of the '<em><b>MM Cid</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>MM Cid</em>' attribute.
     * @see #setMMCid(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMMC_MMCid()
     * @model required="true"
     * @generated
     */
	Integer getMMCid();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MMC#getMMCid <em>MM Cid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>MM Cid</em>' attribute.
     * @see #getMMCid()
     * @generated
     */
	void setMMCid(Integer value);

	/**
     * Returns the value of the '<em><b>PARAMETER1</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>PARAMETER1</em>' attribute.
     * @see #setPARAMETER1(Integer)
     * @see org.afplib.afplib.AfplibPackage#getMMC_PARAMETER1()
     * @model required="true"
     * @generated
     */
	Integer getPARAMETER1();

	/**
     * Sets the value of the '{@link org.afplib.afplib.MMC#getPARAMETER1 <em>PARAMETER1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>PARAMETER1</em>' attribute.
     * @see #getPARAMETER1()
     * @generated
     */
	void setPARAMETER1(Integer value);

	/**
     * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.afplib.MMCRG}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rg</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getMMC_Rg()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<MMCRG> getRg();

} // MMC
