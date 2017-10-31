/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPCCPIRG Len</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getCPCCPIRGLen()
 * @model
 * @generated
 */
public enum CPCCPIRGLen implements Enumerator {
	/**
	 * The '<em><b>Const Single Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SINGLE_BYTE(10, "ConstSingleByte", "ConstSingleByte"),

	/**
	 * The '<em><b>Const Double Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOUBLE_BYTE(11, "ConstDoubleByte", "ConstDoubleByte"),

	/**
	 * The '<em><b>Const Single Byte With Unicode Scalar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR(254, "ConstSingleByteWithUnicodeScalar", "ConstSingleByteWithUnicodeScalar"),

	/**
	 * The '<em><b>Const Double Byte With Unicode Scalar</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR(221, "ConstDoubleByteWithUnicodeScalar", "ConstDoubleByteWithUnicodeScalar");

	/**
	 * The '<em><b>Const Single Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Single Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE
	 * @model name="ConstSingleByte"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SINGLE_BYTE_VALUE = 10;

	/**
	 * The '<em><b>Const Double Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Double Byte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE
	 * @model name="ConstDoubleByte"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOUBLE_BYTE_VALUE = 11;

	/**
	 * The '<em><b>Const Single Byte With Unicode Scalar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Single Byte With Unicode Scalar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR
	 * @model name="ConstSingleByteWithUnicodeScalar"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR_VALUE = 254;

	/**
	 * The '<em><b>Const Double Byte With Unicode Scalar</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Double Byte With Unicode Scalar</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR
	 * @model name="ConstDoubleByteWithUnicodeScalar"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR_VALUE = 221;

	/**
	 * An array of all the '<em><b>CPCCPIRG Len</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPCCPIRGLen[] VALUES_ARRAY =
		new CPCCPIRGLen[] {
			CONST_SINGLE_BYTE,
			CONST_DOUBLE_BYTE,
			CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR,
			CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR,
		};

	/**
	 * A public read-only list of all the '<em><b>CPCCPIRG Len</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPCCPIRGLen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPCCPIRG Len</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPCCPIRGLen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCCPIRGLen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPCCPIRG Len</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPCCPIRGLen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPCCPIRGLen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPCCPIRG Len</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CPCCPIRGLen get(int value) {
		switch (value) {
			case CONST_SINGLE_BYTE_VALUE: return CONST_SINGLE_BYTE;
			case CONST_DOUBLE_BYTE_VALUE: return CONST_DOUBLE_BYTE;
			case CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR_VALUE: return CONST_SINGLE_BYTE_WITH_UNICODE_SCALAR;
			case CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR_VALUE: return CONST_DOUBLE_BYTE_WITH_UNICODE_SCALAR;
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
	private CPCCPIRGLen(int value, String name, String literal) {
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
	
} //CPCCPIRGLen
