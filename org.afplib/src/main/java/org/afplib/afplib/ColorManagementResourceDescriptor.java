/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Management Resource Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ColorManagementResourceDescriptor#getProcMode <em>Proc Mode</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorManagementResourceDescriptor#getCMRScpe <em>CMR Scpe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getColorManagementResourceDescriptor()
 * @model
 * @generated
 */
public interface ColorManagementResourceDescriptor extends Triplet {
	/**
	 * Returns the value of the '<em><b>Proc Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Proc Mode</em>' attribute.
	 * @see #setProcMode(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorManagementResourceDescriptor_ProcMode()
	 * @model required="true"
	 * @generated
	 */
	Integer getProcMode();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorManagementResourceDescriptor#getProcMode <em>Proc Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proc Mode</em>' attribute.
	 * @see #getProcMode()
	 * @generated
	 */
	void setProcMode(Integer value);

	/**
	 * Returns the value of the '<em><b>CMR Scpe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CMR Scpe</em>' attribute.
	 * @see #setCMRScpe(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorManagementResourceDescriptor_CMRScpe()
	 * @model required="true"
	 * @generated
	 */
	Integer getCMRScpe();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorManagementResourceDescriptor#getCMRScpe <em>CMR Scpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CMR Scpe</em>' attribute.
	 * @see #getCMRScpe()
	 * @generated
	 */
	void setCMRScpe(Integer value);

} // ColorManagementResourceDescriptor
