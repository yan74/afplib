/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Encoding Scheme IDE Sid CP</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getEncodingSchemeIDESidCP()
 * @model
 * @generated
 */
public enum EncodingSchemeIDESidCP implements Enumerator {
	/**
	 * The '<em><b>Const Not Specified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NOT_SPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NOT_SPECIFIED(0, "ConstNotSpecified", "ConstNotSpecified"),

	/**
	 * The '<em><b>Constdefault SBC Sencoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTDEFAULT_SBC_SENCODING_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTDEFAULT_SBC_SENCODING(256, "ConstdefaultSBCSencoding", "ConstdefaultSBCSencoding"),

	/**
	 * The '<em><b>Constdefault DBC Sencoding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTDEFAULT_DBC_SENCODING_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTDEFAULT_DBC_SENCODING(512, "ConstdefaultDBCSencoding", "ConstdefaultDBCSencoding"),

	/**
	 * The '<em><b>Const PC Data SBCSASCI Ibased</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PC_DATA_SBCSASCI_IBASED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PC_DATA_SBCSASCI_IBASED(8448, "ConstPCDataSBCSASCIIbased", "ConstPCDataSBCSASCIIbased"),

	/**
	 * The '<em><b>Const PC Display SBCSASCI Ibased</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PC_DISPLAY_SBCSASCI_IBASED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PC_DISPLAY_SBCSASCI_IBASED(12544, "ConstPCDisplaySBCSASCIIbased", "ConstPCDisplaySBCSASCIIbased"),

	/**
	 * The '<em><b>Const EBCDIC Presentation SBCS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_EBCDIC_PRESENTATION_SBCS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_EBCDIC_PRESENTATION_SBCS(24832, "ConstEBCDICPresentationSBCS", "ConstEBCDICPresentationSBCS"),

	/**
	 * The '<em><b>Const EBCDIC Presentation DBCS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_EBCDIC_PRESENTATION_DBCS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_EBCDIC_PRESENTATION_DBCS(25088, "ConstEBCDICPresentationDBCS", "ConstEBCDICPresentationDBCS"),

	/**
	 * The '<em><b>Const UTF16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_UTF16_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_UTF16(29184, "ConstUTF16", "ConstUTF16"),

	/**
	 * The '<em><b>Const Unicodebigendian</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_UNICODEBIGENDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_UNICODEBIGENDIAN(33280, "ConstUnicodebigendian", "ConstUnicodebigendian");

	/**
	 * The '<em><b>Const Not Specified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Not Specified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NOT_SPECIFIED
	 * @model name="ConstNotSpecified"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NOT_SPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Constdefault SBC Sencoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constdefault SBC Sencoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTDEFAULT_SBC_SENCODING
	 * @model name="ConstdefaultSBCSencoding"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTDEFAULT_SBC_SENCODING_VALUE = 256;

	/**
	 * The '<em><b>Constdefault DBC Sencoding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constdefault DBC Sencoding</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTDEFAULT_DBC_SENCODING
	 * @model name="ConstdefaultDBCSencoding"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTDEFAULT_DBC_SENCODING_VALUE = 512;

	/**
	 * The '<em><b>Const PC Data SBCSASCI Ibased</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const PC Data SBCSASCI Ibased</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PC_DATA_SBCSASCI_IBASED
	 * @model name="ConstPCDataSBCSASCIIbased"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PC_DATA_SBCSASCI_IBASED_VALUE = 8448;

	/**
	 * The '<em><b>Const PC Display SBCSASCI Ibased</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const PC Display SBCSASCI Ibased</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PC_DISPLAY_SBCSASCI_IBASED
	 * @model name="ConstPCDisplaySBCSASCIIbased"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PC_DISPLAY_SBCSASCI_IBASED_VALUE = 12544;

	/**
	 * The '<em><b>Const EBCDIC Presentation SBCS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const EBCDIC Presentation SBCS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_EBCDIC_PRESENTATION_SBCS
	 * @model name="ConstEBCDICPresentationSBCS"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_EBCDIC_PRESENTATION_SBCS_VALUE = 24832;

	/**
	 * The '<em><b>Const EBCDIC Presentation DBCS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const EBCDIC Presentation DBCS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_EBCDIC_PRESENTATION_DBCS
	 * @model name="ConstEBCDICPresentationDBCS"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_EBCDIC_PRESENTATION_DBCS_VALUE = 25088;

	/**
	 * The '<em><b>Const UTF16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UTF16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_UTF16
	 * @model name="ConstUTF16"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_UTF16_VALUE = 29184;

	/**
	 * The '<em><b>Const Unicodebigendian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Unicodebigendian</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_UNICODEBIGENDIAN
	 * @model name="ConstUnicodebigendian"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_UNICODEBIGENDIAN_VALUE = 33280;

	/**
	 * An array of all the '<em><b>Encoding Scheme IDE Sid CP</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EncodingSchemeIDESidCP[] VALUES_ARRAY =
		new EncodingSchemeIDESidCP[] {
			CONST_NOT_SPECIFIED,
			CONSTDEFAULT_SBC_SENCODING,
			CONSTDEFAULT_DBC_SENCODING,
			CONST_PC_DATA_SBCSASCI_IBASED,
			CONST_PC_DISPLAY_SBCSASCI_IBASED,
			CONST_EBCDIC_PRESENTATION_SBCS,
			CONST_EBCDIC_PRESENTATION_DBCS,
			CONST_UTF16,
			CONST_UNICODEBIGENDIAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Encoding Scheme IDE Sid CP</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EncodingSchemeIDESidCP> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Encoding Scheme IDE Sid CP</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingSchemeIDESidCP get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingSchemeIDESidCP result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Scheme IDE Sid CP</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingSchemeIDESidCP getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EncodingSchemeIDESidCP result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Encoding Scheme IDE Sid CP</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EncodingSchemeIDESidCP get(int value) {
		switch (value) {
			case CONST_NOT_SPECIFIED_VALUE: return CONST_NOT_SPECIFIED;
			case CONSTDEFAULT_SBC_SENCODING_VALUE: return CONSTDEFAULT_SBC_SENCODING;
			case CONSTDEFAULT_DBC_SENCODING_VALUE: return CONSTDEFAULT_DBC_SENCODING;
			case CONST_PC_DATA_SBCSASCI_IBASED_VALUE: return CONST_PC_DATA_SBCSASCI_IBASED;
			case CONST_PC_DISPLAY_SBCSASCI_IBASED_VALUE: return CONST_PC_DISPLAY_SBCSASCI_IBASED;
			case CONST_EBCDIC_PRESENTATION_SBCS_VALUE: return CONST_EBCDIC_PRESENTATION_SBCS;
			case CONST_EBCDIC_PRESENTATION_DBCS_VALUE: return CONST_EBCDIC_PRESENTATION_DBCS;
			case CONST_UTF16_VALUE: return CONST_UTF16;
			case CONST_UNICODEBIGENDIAN_VALUE: return CONST_UNICODEBIGENDIAN;
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
	private EncodingSchemeIDESidCP(int value, String name, String literal) {
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
	
} //EncodingSchemeIDESidCP
