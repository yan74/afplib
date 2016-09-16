/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Descriptor Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FontDescriptorSpecification#getFtWtClass <em>Ft Wt Class</em>}</li>
 *   <li>{@link org.afplib.afplib.FontDescriptorSpecification#getFtWdClass <em>Ft Wd Class</em>}</li>
 *   <li>{@link org.afplib.afplib.FontDescriptorSpecification#getFtHeight <em>Ft Height</em>}</li>
 *   <li>{@link org.afplib.afplib.FontDescriptorSpecification#getFtWidth <em>Ft Width</em>}</li>
 *   <li>{@link org.afplib.afplib.FontDescriptorSpecification#getFtDsFlags <em>Ft Ds Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.FontDescriptorSpecification#getFtUsFlags <em>Ft Us Flags</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification()
 * @model
 * @generated
 */
public interface FontDescriptorSpecification extends Triplet {
	/**
	 * Returns the value of the '<em><b>Ft Wt Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Wt Class</em>' attribute.
	 * @see #setFtWtClass(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification_FtWtClass()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtWtClass();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontDescriptorSpecification#getFtWtClass <em>Ft Wt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Wt Class</em>' attribute.
	 * @see #getFtWtClass()
	 * @generated
	 */
	void setFtWtClass(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Wd Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Wd Class</em>' attribute.
	 * @see #setFtWdClass(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification_FtWdClass()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtWdClass();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontDescriptorSpecification#getFtWdClass <em>Ft Wd Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Wd Class</em>' attribute.
	 * @see #getFtWdClass()
	 * @generated
	 */
	void setFtWdClass(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Height</em>' attribute.
	 * @see #setFtHeight(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification_FtHeight()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtHeight();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontDescriptorSpecification#getFtHeight <em>Ft Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Height</em>' attribute.
	 * @see #getFtHeight()
	 * @generated
	 */
	void setFtHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Width</em>' attribute.
	 * @see #setFtWidth(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification_FtWidth()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtWidth();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontDescriptorSpecification#getFtWidth <em>Ft Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Width</em>' attribute.
	 * @see #getFtWidth()
	 * @generated
	 */
	void setFtWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Ds Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Ds Flags</em>' attribute.
	 * @see #setFtDsFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification_FtDsFlags()
	 * @model required="true"
	 * @generated
	 */
	Integer getFtDsFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontDescriptorSpecification#getFtDsFlags <em>Ft Ds Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Ds Flags</em>' attribute.
	 * @see #getFtDsFlags()
	 * @generated
	 */
	void setFtDsFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Ft Us Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ft Us Flags</em>' attribute.
	 * @see #setFtUsFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecification_FtUsFlags()
	 * @model
	 * @generated
	 */
	Integer getFtUsFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontDescriptorSpecification#getFtUsFlags <em>Ft Us Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ft Us Flags</em>' attribute.
	 * @see #getFtUsFlags()
	 * @generated
	 */
	void setFtUsFlags(Integer value);

} // FontDescriptorSpecification
