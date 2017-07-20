/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FontResolution#getMetTech <em>Met Tech</em>}</li>
 *   <li>{@link org.afplib.afplib.FontResolution#getRPuBase <em>RPu Base</em>}</li>
 *   <li>{@link org.afplib.afplib.FontResolution#getRPUnits <em>RP Units</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFontResolution()
 * @model
 * @generated
 */
public interface FontResolution extends Triplet {
	/**
     * Returns the value of the '<em><b>Met Tech</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Met Tech</em>' attribute.
     * @see #setMetTech(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFontResolution_MetTech()
     * @model required="true"
     * @generated
     */
	Integer getMetTech();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FontResolution#getMetTech <em>Met Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Met Tech</em>' attribute.
     * @see #getMetTech()
     * @generated
     */
	void setMetTech(Integer value);

	/**
     * Returns the value of the '<em><b>RPu Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RPu Base</em>' attribute.
     * @see #setRPuBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFontResolution_RPuBase()
     * @model required="true"
     * @generated
     */
	Integer getRPuBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FontResolution#getRPuBase <em>RPu Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RPu Base</em>' attribute.
     * @see #getRPuBase()
     * @generated
     */
	void setRPuBase(Integer value);

	/**
     * Returns the value of the '<em><b>RP Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RP Units</em>' attribute.
     * @see #setRPUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFontResolution_RPUnits()
     * @model required="true"
     * @generated
     */
	Integer getRPUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FontResolution#getRPUnits <em>RP Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RP Units</em>' attribute.
     * @see #getRPUnits()
     * @generated
     */
	void setRPUnits(Integer value);

} // FontResolution
