/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Structured Field Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectStructuredFieldExtent#getSFExt <em>SF Ext</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectStructuredFieldExtent#getSFExtHi <em>SF Ext Hi</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectStructuredFieldExtent()
 * @model
 * @generated
 */
public interface ObjectStructuredFieldExtent extends Triplet {
	/**
     * Returns the value of the '<em><b>SF Ext</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SF Ext</em>' attribute.
     * @see #setSFExt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getObjectStructuredFieldExtent_SFExt()
     * @model required="true"
     * @generated
     */
	Integer getSFExt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ObjectStructuredFieldExtent#getSFExt <em>SF Ext</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SF Ext</em>' attribute.
     * @see #getSFExt()
     * @generated
     */
	void setSFExt(Integer value);

	/**
     * Returns the value of the '<em><b>SF Ext Hi</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SF Ext Hi</em>' attribute.
     * @see #setSFExtHi(Integer)
     * @see org.afplib.afplib.AfplibPackage#getObjectStructuredFieldExtent_SFExtHi()
     * @model
     * @generated
     */
	Integer getSFExtHi();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ObjectStructuredFieldExtent#getSFExtHi <em>SF Ext Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SF Ext Hi</em>' attribute.
     * @see #getSFExtHi()
     * @generated
     */
	void setSFExtHi(Integer value);

} // ObjectStructuredFieldExtent
