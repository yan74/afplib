/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Area Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectAreaSize#getSizeType <em>Size Type</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectAreaSize#getXoaSize <em>Xoa Size</em>}</li>
 *   <li>{@link org.afplib.afplib.ObjectAreaSize#getYoaSize <em>Yoa Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectAreaSize()
 * @model
 * @generated
 */
public interface ObjectAreaSize extends Triplet {
	/**
	 * Returns the value of the '<em><b>Size Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size Type</em>' attribute.
	 * @see #setSizeType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectAreaSize_SizeType()
	 * @model required="true"
	 * @generated
	 */
	Integer getSizeType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectAreaSize#getSizeType <em>Size Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Type</em>' attribute.
	 * @see #getSizeType()
	 * @generated
	 */
	void setSizeType(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoa Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoa Size</em>' attribute.
	 * @see #setXoaSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectAreaSize_XoaSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getXoaSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectAreaSize#getXoaSize <em>Xoa Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoa Size</em>' attribute.
	 * @see #getXoaSize()
	 * @generated
	 */
	void setXoaSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoa Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoa Size</em>' attribute.
	 * @see #setYoaSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectAreaSize_YoaSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getYoaSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectAreaSize#getYoaSize <em>Yoa Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoa Size</em>' attribute.
	 * @see #getYoaSize()
	 * @generated
	 */
	void setYoaSize(Integer value);

} // ObjectAreaSize
