/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Structured Field Offset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectStructuredFieldOffset#getSFOff <em>SF Off</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectStructuredFieldOffset#getSFOffHi <em>SF Off Hi</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectStructuredFieldOffset()
 * @model
 * @generated
 */
public interface ObjectStructuredFieldOffset extends Triplet {
	/**
	 * Returns the value of the '<em><b>SF Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SF Off</em>' attribute.
	 * @see #setSFOff(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectStructuredFieldOffset_SFOff()
	 * @model required="true"
	 * @generated
	 */
	Integer getSFOff();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectStructuredFieldOffset#getSFOff <em>SF Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SF Off</em>' attribute.
	 * @see #getSFOff()
	 * @generated
	 */
	void setSFOff(Integer value);

	/**
	 * Returns the value of the '<em><b>SF Off Hi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SF Off Hi</em>' attribute.
	 * @see #setSFOffHi(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectStructuredFieldOffset_SFOffHi()
	 * @model
	 * @generated
	 */
	Integer getSFOffHi();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectStructuredFieldOffset#getSFOffHi <em>SF Off Hi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SF Off Hi</em>' attribute.
	 * @see #getSFOffHi()
	 * @generated
	 */
	void setSFOffHi(Integer value);

} // ObjectStructuredFieldOffset
