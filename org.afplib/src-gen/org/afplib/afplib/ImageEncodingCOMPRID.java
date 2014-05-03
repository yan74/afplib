/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Encoding COMPRID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getImageEncodingCOMPRID()
 * @model
 * @generated
 */
public enum ImageEncodingCOMPRID implements Enumerator {
	/**
	 * The '<em><b>Const IBMMMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_IBMMMR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_IBMMMR(1, "ConstIBMMMR", "ConstIBMMMR"),

	/**
	 * The '<em><b>Const No Compression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NO_COMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NO_COMPRESSION(3, "ConstNoCompression", "ConstNoCompression"),

	/**
	 * The '<em><b>Const RL4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RL4_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RL4(6, "ConstRL4", "ConstRL4"),

	/**
	 * The '<em><b>Const ABIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_ABIC_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_ABIC(8, "ConstABIC", "ConstABIC"),

	/**
	 * The '<em><b>Const Concatenated ABIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CONCATENATED_ABIC_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CONCATENATED_ABIC(10, "ConstConcatenatedABIC", "ConstConcatenatedABIC"),

	/**
	 * The '<em><b>Const OS2 Compression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OS2_COMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OS2_COMPRESSION(11, "ConstOS2Compression", "ConstOS2Compression"),

	/**
	 * The '<em><b>Const TIFFLZW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_TIFFLZW_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_TIFFLZW(13, "ConstTIFFLZW", "ConstTIFFLZW"),

	/**
	 * The '<em><b>Const Solid Fill Rectangle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SOLID_FILL_RECTANGLE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SOLID_FILL_RECTANGLE(32, "ConstSolidFillRectangle", "ConstSolidFillRectangle"),

	/**
	 * The '<em><b>Const G3MH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_G3MH_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_G3MH(128, "ConstG3MH", "ConstG3MH"),

	/**
	 * The '<em><b>Const G3MR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_G3MR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_G3MR(129, "ConstG3MR", "ConstG3MR"),

	/**
	 * The '<em><b>Const G4MMR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_G4MMR_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_G4MMR(130, "ConstG4MMR", "ConstG4MMR"),

	/**
	 * The '<em><b>Const JPEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_JPEG(131, "ConstJPEG", "ConstJPEG");

	/**
	 * The '<em><b>Const IBMMMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const IBMMMR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_IBMMMR
	 * @model name="ConstIBMMMR"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_IBMMMR_VALUE = 1;

	/**
	 * The '<em><b>Const No Compression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const No Compression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NO_COMPRESSION
	 * @model name="ConstNoCompression"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NO_COMPRESSION_VALUE = 3;

	/**
	 * The '<em><b>Const RL4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const RL4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RL4
	 * @model name="ConstRL4"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RL4_VALUE = 6;

	/**
	 * The '<em><b>Const ABIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const ABIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_ABIC
	 * @model name="ConstABIC"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_ABIC_VALUE = 8;

	/**
	 * The '<em><b>Const Concatenated ABIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Concatenated ABIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CONCATENATED_ABIC
	 * @model name="ConstConcatenatedABIC"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CONCATENATED_ABIC_VALUE = 10;

	/**
	 * The '<em><b>Const OS2 Compression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const OS2 Compression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OS2_COMPRESSION
	 * @model name="ConstOS2Compression"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OS2_COMPRESSION_VALUE = 11;

	/**
	 * The '<em><b>Const TIFFLZW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const TIFFLZW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_TIFFLZW
	 * @model name="ConstTIFFLZW"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_TIFFLZW_VALUE = 13;

	/**
	 * The '<em><b>Const Solid Fill Rectangle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Solid Fill Rectangle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SOLID_FILL_RECTANGLE
	 * @model name="ConstSolidFillRectangle"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SOLID_FILL_RECTANGLE_VALUE = 32;

	/**
	 * The '<em><b>Const G3MH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const G3MH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_G3MH
	 * @model name="ConstG3MH"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_G3MH_VALUE = 128;

	/**
	 * The '<em><b>Const G3MR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const G3MR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_G3MR
	 * @model name="ConstG3MR"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_G3MR_VALUE = 129;

	/**
	 * The '<em><b>Const G4MMR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const G4MMR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_G4MMR
	 * @model name="ConstG4MMR"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_G4MMR_VALUE = 130;

	/**
	 * The '<em><b>Const JPEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const JPEG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_JPEG
	 * @model name="ConstJPEG"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_JPEG_VALUE = 131;

	/**
	 * An array of all the '<em><b>Image Encoding COMPRID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ImageEncodingCOMPRID[] VALUES_ARRAY =
		new ImageEncodingCOMPRID[] {
			CONST_IBMMMR,
			CONST_NO_COMPRESSION,
			CONST_RL4,
			CONST_ABIC,
			CONST_CONCATENATED_ABIC,
			CONST_OS2_COMPRESSION,
			CONST_TIFFLZW,
			CONST_SOLID_FILL_RECTANGLE,
			CONST_G3MH,
			CONST_G3MR,
			CONST_G4MMR,
			CONST_JPEG,
		};

	/**
	 * A public read-only list of all the '<em><b>Image Encoding COMPRID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ImageEncodingCOMPRID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Image Encoding COMPRID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageEncodingCOMPRID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageEncodingCOMPRID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Encoding COMPRID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageEncodingCOMPRID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ImageEncodingCOMPRID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Image Encoding COMPRID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ImageEncodingCOMPRID get(int value) {
		switch (value) {
			case CONST_IBMMMR_VALUE: return CONST_IBMMMR;
			case CONST_NO_COMPRESSION_VALUE: return CONST_NO_COMPRESSION;
			case CONST_RL4_VALUE: return CONST_RL4;
			case CONST_ABIC_VALUE: return CONST_ABIC;
			case CONST_CONCATENATED_ABIC_VALUE: return CONST_CONCATENATED_ABIC;
			case CONST_OS2_COMPRESSION_VALUE: return CONST_OS2_COMPRESSION;
			case CONST_TIFFLZW_VALUE: return CONST_TIFFLZW;
			case CONST_SOLID_FILL_RECTANGLE_VALUE: return CONST_SOLID_FILL_RECTANGLE;
			case CONST_G3MH_VALUE: return CONST_G3MH;
			case CONST_G3MR_VALUE: return CONST_G3MR;
			case CONST_G4MMR_VALUE: return CONST_G4MMR;
			case CONST_JPEG_VALUE: return CONST_JPEG;
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
	private ImageEncodingCOMPRID(int value, String name, String literal) {
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
	
} //ImageEncodingCOMPRID
