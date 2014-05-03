/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CPD Enc Scheme</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getCPDEncScheme()
 * @model
 * @generated
 */
public enum CPDEncScheme implements Enumerator {
	/**
	 * The '<em><b>Const No Encoding Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NO_ENCODING_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NO_ENCODING_SPECIFIED(0, "ConstNoEncodingSpecified", "ConstNoEncodingSpecified"),

	/**
	 * The '<em><b>Const Single Byte No Encoding Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED(256, "ConstSingleByteNoEncodingSpecified", "ConstSingleByteNoEncodingSpecified"),

	/**
	 * The '<em><b>Const Double Byte No Encoding Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED(512, "ConstDoubleByteNoEncodingSpecified", "ConstDoubleByteNoEncodingSpecified"),

	/**
	 * The '<em><b>Const Single Byte IBMPC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_IBMPC_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SINGLE_BYTE_IBMPC(8448, "ConstSingleByteIBMPC", "ConstSingleByteIBMPC"),

	/**
	 * The '<em><b>Const Single Byte EBCDIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_EBCDIC_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SINGLE_BYTE_EBCDIC(24832, "ConstSingleByteEBCDIC", "ConstSingleByteEBCDIC"),

	/**
	 * The '<em><b>Const Double Byte EBCDIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_EBCDIC_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOUBLE_BYTE_EBCDIC(25088, "ConstDoubleByteEBCDIC", "ConstDoubleByteEBCDIC"),

	/**
	 * The '<em><b>Const Double Byte UCS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_UCS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOUBLE_BYTE_UCS(33280, "ConstDoubleByteUCS", "ConstDoubleByteUCS");

	/**
	 * The '<em><b>Const No Encoding Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const No Encoding Specified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NO_ENCODING_SPECIFIED
	 * @model name="ConstNoEncodingSpecified"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NO_ENCODING_SPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Const Single Byte No Encoding Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Single Byte No Encoding Specified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED
	 * @model name="ConstSingleByteNoEncodingSpecified"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED_VALUE = 256;

	/**
	 * The '<em><b>Const Double Byte No Encoding Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Double Byte No Encoding Specified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED
	 * @model name="ConstDoubleByteNoEncodingSpecified"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED_VALUE = 512;

	/**
	 * The '<em><b>Const Single Byte IBMPC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Single Byte IBMPC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_IBMPC
	 * @model name="ConstSingleByteIBMPC"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SINGLE_BYTE_IBMPC_VALUE = 8448;

	/**
	 * The '<em><b>Const Single Byte EBCDIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Single Byte EBCDIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SINGLE_BYTE_EBCDIC
	 * @model name="ConstSingleByteEBCDIC"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SINGLE_BYTE_EBCDIC_VALUE = 24832;

	/**
	 * The '<em><b>Const Double Byte EBCDIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Double Byte EBCDIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_EBCDIC
	 * @model name="ConstDoubleByteEBCDIC"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOUBLE_BYTE_EBCDIC_VALUE = 25088;

	/**
	 * The '<em><b>Const Double Byte UCS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Double Byte UCS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOUBLE_BYTE_UCS
	 * @model name="ConstDoubleByteUCS"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOUBLE_BYTE_UCS_VALUE = 33280;

	/**
	 * An array of all the '<em><b>CPD Enc Scheme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CPDEncScheme[] VALUES_ARRAY =
		new CPDEncScheme[] {
			CONST_NO_ENCODING_SPECIFIED,
			CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED,
			CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED,
			CONST_SINGLE_BYTE_IBMPC,
			CONST_SINGLE_BYTE_EBCDIC,
			CONST_DOUBLE_BYTE_EBCDIC,
			CONST_DOUBLE_BYTE_UCS,
		};

	/**
	 * A public read-only list of all the '<em><b>CPD Enc Scheme</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CPDEncScheme> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CPD Enc Scheme</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPDEncScheme get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPDEncScheme result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPD Enc Scheme</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPDEncScheme getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CPDEncScheme result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CPD Enc Scheme</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CPDEncScheme get(int value) {
		switch (value) {
			case CONST_NO_ENCODING_SPECIFIED_VALUE: return CONST_NO_ENCODING_SPECIFIED;
			case CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED_VALUE: return CONST_SINGLE_BYTE_NO_ENCODING_SPECIFIED;
			case CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED_VALUE: return CONST_DOUBLE_BYTE_NO_ENCODING_SPECIFIED;
			case CONST_SINGLE_BYTE_IBMPC_VALUE: return CONST_SINGLE_BYTE_IBMPC;
			case CONST_SINGLE_BYTE_EBCDIC_VALUE: return CONST_SINGLE_BYTE_EBCDIC;
			case CONST_DOUBLE_BYTE_EBCDIC_VALUE: return CONST_DOUBLE_BYTE_EBCDIC;
			case CONST_DOUBLE_BYTE_UCS_VALUE: return CONST_DOUBLE_BYTE_UCS;
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
	private CPDEncScheme(int value, String name, String literal) {
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
	
} //CPDEncScheme
