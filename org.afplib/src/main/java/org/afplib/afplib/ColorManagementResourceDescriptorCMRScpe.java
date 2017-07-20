/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color Management Resource Descriptor CMR Scpe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getColorManagementResourceDescriptorCMRScpe()
 * @model
 * @generated
 */
public enum ColorManagementResourceDescriptorCMRScpe implements Enumerator {
	/**
     * The '<em><b>Const Data Object</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_DATA_OBJECT_VALUE
     * @generated
     * @ordered
     */
	CONST_DATA_OBJECT(1, "ConstDataObject", "ConstDataObject"),

	/**
     * The '<em><b>Const Page Or Overlay</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PAGE_OR_OVERLAY_VALUE
     * @generated
     * @ordered
     */
	CONST_PAGE_OR_OVERLAY(2, "ConstPageOrOverlay", "ConstPageOrOverlay"),

	/**
     * The '<em><b>Const Document</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_DOCUMENT_VALUE
     * @generated
     * @ordered
     */
	CONST_DOCUMENT(3, "ConstDocument", "ConstDocument"),

	/**
     * The '<em><b>Const Print File</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PRINT_FILE_VALUE
     * @generated
     * @ordered
     */
	CONST_PRINT_FILE(4, "ConstPrintFile", "ConstPrintFile"),

	/**
     * The '<em><b>Const Page Group</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PAGE_GROUP_VALUE
     * @generated
     * @ordered
     */
	CONST_PAGE_GROUP(5, "ConstPageGroup", "ConstPageGroup");

	/**
     * The '<em><b>Const Data Object</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Data Object</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_DATA_OBJECT
     * @model name="ConstDataObject"
     * @generated
     * @ordered
     */
	public static final int CONST_DATA_OBJECT_VALUE = 1;

	/**
     * The '<em><b>Const Page Or Overlay</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Page Or Overlay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PAGE_OR_OVERLAY
     * @model name="ConstPageOrOverlay"
     * @generated
     * @ordered
     */
	public static final int CONST_PAGE_OR_OVERLAY_VALUE = 2;

	/**
     * The '<em><b>Const Document</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_DOCUMENT
     * @model name="ConstDocument"
     * @generated
     * @ordered
     */
	public static final int CONST_DOCUMENT_VALUE = 3;

	/**
     * The '<em><b>Const Print File</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Print File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PRINT_FILE
     * @model name="ConstPrintFile"
     * @generated
     * @ordered
     */
	public static final int CONST_PRINT_FILE_VALUE = 4;

	/**
     * The '<em><b>Const Page Group</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Page Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PAGE_GROUP
     * @model name="ConstPageGroup"
     * @generated
     * @ordered
     */
	public static final int CONST_PAGE_GROUP_VALUE = 5;

	/**
     * An array of all the '<em><b>Color Management Resource Descriptor CMR Scpe</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ColorManagementResourceDescriptorCMRScpe[] VALUES_ARRAY =
		new ColorManagementResourceDescriptorCMRScpe[] {
            CONST_DATA_OBJECT,
            CONST_PAGE_OR_OVERLAY,
            CONST_DOCUMENT,
            CONST_PRINT_FILE,
            CONST_PAGE_GROUP,
        };

	/**
     * A public read-only list of all the '<em><b>Color Management Resource Descriptor CMR Scpe</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ColorManagementResourceDescriptorCMRScpe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Color Management Resource Descriptor CMR Scpe</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ColorManagementResourceDescriptorCMRScpe get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ColorManagementResourceDescriptorCMRScpe result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Color Management Resource Descriptor CMR Scpe</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ColorManagementResourceDescriptorCMRScpe getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ColorManagementResourceDescriptorCMRScpe result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Color Management Resource Descriptor CMR Scpe</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ColorManagementResourceDescriptorCMRScpe get(int value) {
        switch (value) {
            case CONST_DATA_OBJECT_VALUE: return CONST_DATA_OBJECT;
            case CONST_PAGE_OR_OVERLAY_VALUE: return CONST_PAGE_OR_OVERLAY;
            case CONST_DOCUMENT_VALUE: return CONST_DOCUMENT;
            case CONST_PRINT_FILE_VALUE: return CONST_PRINT_FILE;
            case CONST_PAGE_GROUP_VALUE: return CONST_PAGE_GROUP;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private ColorManagementResourceDescriptorCMRScpe(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //ColorManagementResourceDescriptorCMRScpe
