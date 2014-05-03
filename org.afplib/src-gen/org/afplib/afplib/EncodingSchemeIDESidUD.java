/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encoding Scheme IDE Sid UD</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getEncodingSchemeIDESidUD()
 * @model
 * @generated
 */
public enum EncodingSchemeIDESidUD implements Enumerator {
	/**
	 * The '<em><b>Const UTF16BE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_UTF16BE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_UTF16BE(29184, "ConstUTF16BE", "ConstUTF16BE"),

	/**
	 * The '<em><b>Const UTF8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_UTF8_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_UTF8(30727, "ConstUTF8", "ConstUTF8");

	/**
	 * The '<em><b>Const UTF16BE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UTF16BE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_UTF16BE
	 * @model name="ConstUTF16BE"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_UTF16BE_VALUE = 29184;

	/**
	 * The '<em><b>Const UTF8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UTF8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_UTF8
	 * @model name="ConstUTF8"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_UTF8_VALUE = 30727;

	/**
	 * An array of all the '<em><b>Encoding Scheme IDE Sid UD</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodingSchemeIDESidUD[] VALUES_ARRAY =
		new EncodingSchemeIDESidUD[] {
			CONST_UTF16BE,
			CONST_UTF8,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding Scheme IDE Sid UD</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodingSchemeIDESidUD> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding Scheme IDE Sid UD</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingSchemeIDESidUD get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingSchemeIDESidUD result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Scheme IDE Sid UD</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingSchemeIDESidUD getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingSchemeIDESidUD result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Scheme IDE Sid UD</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingSchemeIDESidUD get(int value) {
		switch (value) {
			case CONST_UTF16BE_VALUE: return CONST_UTF16BE;
			case CONST_UTF8_VALUE: return CONST_UTF8;
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
	private EncodingSchemeIDESidUD(int value, String name, String literal) {
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
	
} //EncodingSchemeIDESidUD
