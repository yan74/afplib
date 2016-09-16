/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNC Fnt Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCFntFlags()
 * @model
 * @generated
 */
public enum FNCFntFlags implements Enumerator {
	/**
	 * The '<em><b>Printing Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINTING_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PRINTING_TYPE(1, "PrintingType", "PrintingType"),

	/**
	 * The '<em><b>Extension Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION_TYPE(2, "ExtensionType", "ExtensionType"),

	/**
	 * The '<em><b>Retired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	RETIRED(16, "Retired", "Retired"),

	/**
	 * The '<em><b>Uniform Character Box Font</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFORM_CHARACTER_BOX_FONT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIFORM_CHARACTER_BOX_FONT(64, "UniformCharacterBoxFont", "UniformCharacterBoxFont");

	/**
	 * The '<em><b>Printing Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Printing Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINTING_TYPE
	 * @model name="PrintingType"
	 * @generated
	 * @ordered
	 */
	public static final int PRINTING_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Extension Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extension Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_TYPE
	 * @model name="ExtensionType"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_TYPE_VALUE = 2;

	/**
	 * The '<em><b>Retired</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retired</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETIRED
	 * @model name="Retired"
	 * @generated
	 * @ordered
	 */
	public static final int RETIRED_VALUE = 16;

	/**
	 * The '<em><b>Uniform Character Box Font</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uniform Character Box Font</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFORM_CHARACTER_BOX_FONT
	 * @model name="UniformCharacterBoxFont"
	 * @generated
	 * @ordered
	 */
	public static final int UNIFORM_CHARACTER_BOX_FONT_VALUE = 64;

	/**
	 * An array of all the '<em><b>FNC Fnt Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNCFntFlags[] VALUES_ARRAY =
		new FNCFntFlags[] {
			PRINTING_TYPE,
			EXTENSION_TYPE,
			RETIRED,
			UNIFORM_CHARACTER_BOX_FONT,
		};

	/**
	 * A public read-only list of all the '<em><b>FNC Fnt Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNCFntFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNC Fnt Flags</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCFntFlags get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCFntFlags result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Fnt Flags</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCFntFlags getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCFntFlags result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Fnt Flags</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCFntFlags get(int value) {
		switch (value) {
			case PRINTING_TYPE_VALUE: return PRINTING_TYPE;
			case EXTENSION_TYPE_VALUE: return EXTENSION_TYPE;
			case RETIRED_VALUE: return RETIRED;
			case UNIFORM_CHARACTER_BOX_FONT_VALUE: return UNIFORM_CHARACTER_BOX_FONT;
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
	private FNCFntFlags(int value, String name, String literal) {
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
	
} //FNCFntFlags
