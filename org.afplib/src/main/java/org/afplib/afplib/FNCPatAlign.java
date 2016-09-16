/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNC Pat Align</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCPatAlign()
 * @model
 * @generated
 */
public enum FNCPatAlign implements Enumerator {
	/**
	 * The '<em><b>Const1 Byte Alignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST1_BYTE_ALIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST1_BYTE_ALIGNMENT(0, "Const1ByteAlignment", "Const1ByteAlignment"),

	/**
	 * The '<em><b>Const4 Byte Alignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST4_BYTE_ALIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST4_BYTE_ALIGNMENT(2, "Const4ByteAlignment", "Const4ByteAlignment"),

	/**
	 * The '<em><b>Const8 Byte Alignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST8_BYTE_ALIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST8_BYTE_ALIGNMENT(3, "Const8ByteAlignment", "Const8ByteAlignment");

	/**
	 * The '<em><b>Const1 Byte Alignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const1 Byte Alignment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST1_BYTE_ALIGNMENT
	 * @model name="Const1ByteAlignment"
	 * @generated
	 * @ordered
	 */
	public static final int CONST1_BYTE_ALIGNMENT_VALUE = 0;

	/**
	 * The '<em><b>Const4 Byte Alignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const4 Byte Alignment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST4_BYTE_ALIGNMENT
	 * @model name="Const4ByteAlignment"
	 * @generated
	 * @ordered
	 */
	public static final int CONST4_BYTE_ALIGNMENT_VALUE = 2;

	/**
	 * The '<em><b>Const8 Byte Alignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const8 Byte Alignment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST8_BYTE_ALIGNMENT
	 * @model name="Const8ByteAlignment"
	 * @generated
	 * @ordered
	 */
	public static final int CONST8_BYTE_ALIGNMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>FNC Pat Align</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNCPatAlign[] VALUES_ARRAY =
		new FNCPatAlign[] {
			CONST1_BYTE_ALIGNMENT,
			CONST4_BYTE_ALIGNMENT,
			CONST8_BYTE_ALIGNMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>FNC Pat Align</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNCPatAlign> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNC Pat Align</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCPatAlign get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCPatAlign result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Pat Align</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCPatAlign getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCPatAlign result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Pat Align</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCPatAlign get(int value) {
		switch (value) {
			case CONST1_BYTE_ALIGNMENT_VALUE: return CONST1_BYTE_ALIGNMENT;
			case CONST4_BYTE_ALIGNMENT_VALUE: return CONST4_BYTE_ALIGNMENT;
			case CONST8_BYTE_ALIGNMENT_VALUE: return CONST8_BYTE_ALIGNMENT;
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
	private FNCPatAlign(int value, String name, String literal) {
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
	
} //FNCPatAlign
