/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MCF1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MCF1#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.MCF1#getRG <em>RG</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMCF1()
 * @model
 * @generated
 */
public interface MCF1 extends SF {
	/**
	 * Returns the value of the '<em><b>RG Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG Length</em>' attribute.
	 * @see #setRGLength(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMCF1_RGLength()
	 * @model required="true"
	 * @generated
	 */
	Integer getRGLength();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MCF1#getRGLength <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RG Length</em>' attribute.
	 * @see #getRGLength()
	 * @generated
	 */
	void setRGLength(Integer value);

	/**
	 * Returns the value of the '<em><b>RG</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.MCF1RG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getMCF1_RG()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<MCF1RG> getRG();

} // MCF1
