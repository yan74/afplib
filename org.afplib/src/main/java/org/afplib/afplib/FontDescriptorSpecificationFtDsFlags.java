/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Descriptor Specification Ft Ds Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecificationFtDsFlags()
 * @model
 * @generated
 */
public enum FontDescriptorSpecificationFtDsFlags implements Enumerator {
	/**
     * The '<em><b>Italic</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #ITALIC_VALUE
     * @generated
     * @ordered
     */
	ITALIC(128, "Italic", "Italic"),

	/**
     * The '<em><b>Underscored</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #UNDERSCORED_VALUE
     * @generated
     * @ordered
     */
	UNDERSCORED(64, "Underscored", "Underscored"),

	/**
     * The '<em><b>Solid</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #SOLID_VALUE
     * @generated
     * @ordered
     */
	SOLID(16, "Solid", "Solid"),

	/**
     * The '<em><b>Overstruck</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OVERSTRUCK_VALUE
     * @generated
     * @ordered
     */
	OVERSTRUCK(8, "Overstruck", "Overstruck"),

	/**
     * The '<em><b>Proportionallyspaced</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PROPORTIONALLYSPACED_VALUE
     * @generated
     * @ordered
     */
	PROPORTIONALLYSPACED(4, "Proportionallyspaced", "Proportionallyspaced"),

	/**
     * The '<em><b>Pairwisekerned</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PAIRWISEKERNED_VALUE
     * @generated
     * @ordered
     */
	PAIRWISEKERNED(2, "Pairwisekerned", "Pairwisekerned"),

	/**
     * The '<em><b>Parameterisspecified</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PARAMETERISSPECIFIED_VALUE
     * @generated
     * @ordered
     */
	PARAMETERISSPECIFIED(1, "Parameterisspecified", "Parameterisspecified");

	/**
     * The '<em><b>Italic</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Italic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #ITALIC
     * @model name="Italic"
     * @generated
     * @ordered
     */
	public static final int ITALIC_VALUE = 128;

	/**
     * The '<em><b>Underscored</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Underscored</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #UNDERSCORED
     * @model name="Underscored"
     * @generated
     * @ordered
     */
	public static final int UNDERSCORED_VALUE = 64;

	/**
     * The '<em><b>Solid</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #SOLID
     * @model name="Solid"
     * @generated
     * @ordered
     */
	public static final int SOLID_VALUE = 16;

	/**
     * The '<em><b>Overstruck</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Overstruck</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OVERSTRUCK
     * @model name="Overstruck"
     * @generated
     * @ordered
     */
	public static final int OVERSTRUCK_VALUE = 8;

	/**
     * The '<em><b>Proportionallyspaced</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proportionallyspaced</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PROPORTIONALLYSPACED
     * @model name="Proportionallyspaced"
     * @generated
     * @ordered
     */
	public static final int PROPORTIONALLYSPACED_VALUE = 4;

	/**
     * The '<em><b>Pairwisekerned</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pairwisekerned</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PAIRWISEKERNED
     * @model name="Pairwisekerned"
     * @generated
     * @ordered
     */
	public static final int PAIRWISEKERNED_VALUE = 2;

	/**
     * The '<em><b>Parameterisspecified</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameterisspecified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PARAMETERISSPECIFIED
     * @model name="Parameterisspecified"
     * @generated
     * @ordered
     */
	public static final int PARAMETERISSPECIFIED_VALUE = 1;

	/**
     * An array of all the '<em><b>Font Descriptor Specification Ft Ds Flags</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FontDescriptorSpecificationFtDsFlags[] VALUES_ARRAY =
		new FontDescriptorSpecificationFtDsFlags[] {
            ITALIC,
            UNDERSCORED,
            SOLID,
            OVERSTRUCK,
            PROPORTIONALLYSPACED,
            PAIRWISEKERNED,
            PARAMETERISSPECIFIED,
        };

	/**
     * A public read-only list of all the '<em><b>Font Descriptor Specification Ft Ds Flags</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FontDescriptorSpecificationFtDsFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Font Descriptor Specification Ft Ds Flags</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FontDescriptorSpecificationFtDsFlags get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FontDescriptorSpecificationFtDsFlags result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Font Descriptor Specification Ft Ds Flags</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FontDescriptorSpecificationFtDsFlags getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FontDescriptorSpecificationFtDsFlags result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Font Descriptor Specification Ft Ds Flags</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FontDescriptorSpecificationFtDsFlags get(int value) {
        switch (value) {
            case ITALIC_VALUE: return ITALIC;
            case UNDERSCORED_VALUE: return UNDERSCORED;
            case SOLID_VALUE: return SOLID;
            case OVERSTRUCK_VALUE: return OVERSTRUCK;
            case PROPORTIONALLYSPACED_VALUE: return PROPORTIONALLYSPACED;
            case PAIRWISEKERNED_VALUE: return PAIRWISEKERNED;
            case PARAMETERISSPECIFIED_VALUE: return PARAMETERISSPECIFIED;
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
	private FontDescriptorSpecificationFtDsFlags(int value, String name, String literal) {
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
	
} //FontDescriptorSpecificationFtDsFlags
