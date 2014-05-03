/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Data Object Position Migration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.LineDataObjectPositionMigration#getTempOrient <em>Temp Orient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getLineDataObjectPositionMigration()
 * @model
 * @generated
 */
public interface LineDataObjectPositionMigration extends Triplet {
	/**
	 * Returns the value of the '<em><b>Temp Orient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Temp Orient</em>' attribute.
	 * @see #setTempOrient(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLineDataObjectPositionMigration_TempOrient()
	 * @model required="true"
	 * @generated
	 */
	Integer getTempOrient();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LineDataObjectPositionMigration#getTempOrient <em>Temp Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Orient</em>' attribute.
	 * @see #getTempOrient()
	 * @generated
	 */
	void setTempOrient(Integer value);

} // LineDataObjectPositionMigration
