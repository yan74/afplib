/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Font Descriptor Specification Ft Us Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFontDescriptorSpecificationFtUsFlags()
 * @model
 * @generated
 */
public enum FontDescriptorSpecificationFtUsFlags implements Enumerator {
	/**
	 * The '<em><b>Outline Font</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTLINE_FONT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTLINE_FONT(2, "OutlineFont", "OutlineFont"),

	/**
	 * The '<em><b>Transformable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMABLE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMABLE(4, "Transformable", "Transformable");

	/**
	 * The '<em><b>Outline Font</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Outline Font</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTLINE_FONT
	 * @model name="OutlineFont"
	 * @generated
	 * @ordered
	 */
	public static final int OUTLINE_FONT_VALUE = 2;

	/**
	 * The '<em><b>Transformable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transformable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMABLE
	 * @model name="Transformable"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMABLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Font Descriptor Specification Ft Us Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FontDescriptorSpecificationFtUsFlags[] VALUES_ARRAY =
		new FontDescriptorSpecificationFtUsFlags[] {
			OUTLINE_FONT,
			TRANSFORMABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Font Descriptor Specification Ft Us Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FontDescriptorSpecificationFtUsFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Font Descriptor Specification Ft Us Flags</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontDescriptorSpecificationFtUsFlags get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontDescriptorSpecificationFtUsFlags result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Descriptor Specification Ft Us Flags</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontDescriptorSpecificationFtUsFlags getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FontDescriptorSpecificationFtUsFlags result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Font Descriptor Specification Ft Us Flags</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FontDescriptorSpecificationFtUsFlags get(int value) {
		switch (value) {
			case OUTLINE_FONT_VALUE: return OUTLINE_FONT;
			case TRANSFORMABLE_VALUE: return TRANSFORMABLE;
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
	private FontDescriptorSpecificationFtUsFlags(int value, String name, String literal) {
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
	
} //FontDescriptorSpecificationFtUsFlags
