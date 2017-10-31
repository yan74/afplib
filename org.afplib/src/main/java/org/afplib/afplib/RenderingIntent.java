/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rendering Intent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.RenderingIntent#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.RenderingIntent#getIOCARI <em>IOCARI</em>}</li>
 *   <li>{@link org.afplib.afplib.RenderingIntent#getOCRI <em>OCRI</em>}</li>
 *   <li>{@link org.afplib.afplib.RenderingIntent#getPTOCRI <em>PTOCRI</em>}</li>
 *   <li>{@link org.afplib.afplib.RenderingIntent#getGOCARI <em>GOCARI</em>}</li>
 *   <li>{@link org.afplib.afplib.RenderingIntent#getReserved2 <em>Reserved2</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent()
 * @model
 * @generated
 */
public interface RenderingIntent extends Triplet {
	/**
	 * Returns the value of the '<em><b>Reserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved</em>' attribute.
	 * @see #setReserved(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent_Reserved()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RenderingIntent#getReserved <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved</em>' attribute.
	 * @see #getReserved()
	 * @generated
	 */
	void setReserved(Integer value);

	/**
	 * Returns the value of the '<em><b>IOCARI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IOCARI</em>' attribute.
	 * @see #setIOCARI(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent_IOCARI()
	 * @model required="true"
	 * @generated
	 */
	Integer getIOCARI();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RenderingIntent#getIOCARI <em>IOCARI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IOCARI</em>' attribute.
	 * @see #getIOCARI()
	 * @generated
	 */
	void setIOCARI(Integer value);

	/**
	 * Returns the value of the '<em><b>OCRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OCRI</em>' attribute.
	 * @see #setOCRI(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent_OCRI()
	 * @model required="true"
	 * @generated
	 */
	Integer getOCRI();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RenderingIntent#getOCRI <em>OCRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCRI</em>' attribute.
	 * @see #getOCRI()
	 * @generated
	 */
	void setOCRI(Integer value);

	/**
	 * Returns the value of the '<em><b>PTOCRI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PTOCRI</em>' attribute.
	 * @see #setPTOCRI(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent_PTOCRI()
	 * @model required="true"
	 * @generated
	 */
	Integer getPTOCRI();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RenderingIntent#getPTOCRI <em>PTOCRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTOCRI</em>' attribute.
	 * @see #getPTOCRI()
	 * @generated
	 */
	void setPTOCRI(Integer value);

	/**
	 * Returns the value of the '<em><b>GOCARI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GOCARI</em>' attribute.
	 * @see #setGOCARI(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent_GOCARI()
	 * @model required="true"
	 * @generated
	 */
	Integer getGOCARI();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RenderingIntent#getGOCARI <em>GOCARI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GOCARI</em>' attribute.
	 * @see #getGOCARI()
	 * @generated
	 */
	void setGOCARI(Integer value);

	/**
	 * Returns the value of the '<em><b>Reserved2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved2</em>' attribute.
	 * @see #setReserved2(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRenderingIntent_Reserved2()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved2();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RenderingIntent#getReserved2 <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved2</em>' attribute.
	 * @see #getReserved2()
	 * @generated
	 */
	void setReserved2(Integer value);

} // RenderingIntent
