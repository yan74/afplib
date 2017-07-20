/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BDDTYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getBDDTYPE()
 * @model
 * @generated
 */
public enum BDDTYPE implements Enumerator {
	/**
     * The '<em><b>Const Code39</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_CODE39_VALUE
     * @generated
     * @ordered
     */
	CONST_CODE39(1, "ConstCode39", "ConstCode39"),

	/**
     * The '<em><b>Const MSI</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MSI_VALUE
     * @generated
     * @ordered
     */
	CONST_MSI(2, "ConstMSI", "ConstMSI"),

	/**
     * The '<em><b>Const UPCCGPCA</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_UPCCGPCA_VALUE
     * @generated
     * @ordered
     */
	CONST_UPCCGPCA(3, "ConstUPCCGPCA", "ConstUPCCGPCA"),

	/**
     * The '<em><b>Const UPCCGPCE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_UPCCGPCE_VALUE
     * @generated
     * @ordered
     */
	CONST_UPCCGPCE(5, "ConstUPCCGPCE", "ConstUPCCGPCE"),

	/**
     * The '<em><b>Const UPC2</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_UPC2_VALUE
     * @generated
     * @ordered
     */
	CONST_UPC2(6, "ConstUPC2", "ConstUPC2"),

	/**
     * The '<em><b>Const UPC5</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_UPC5_VALUE
     * @generated
     * @ordered
     */
	CONST_UPC5(7, "ConstUPC5", "ConstUPC5"),

	/**
     * The '<em><b>Const EAN8</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_EAN8_VALUE
     * @generated
     * @ordered
     */
	CONST_EAN8(8, "ConstEAN8", "ConstEAN8"),

	/**
     * The '<em><b>Const EAN13</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_EAN13_VALUE
     * @generated
     * @ordered
     */
	CONST_EAN13(9, "ConstEAN13", "ConstEAN13"),

	/**
     * The '<em><b>Const Industrial2of5</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_INDUSTRIAL2OF5_VALUE
     * @generated
     * @ordered
     */
	CONST_INDUSTRIAL2OF5(10, "ConstIndustrial2of5", "ConstIndustrial2of5"),

	/**
     * The '<em><b>Const Matrix2of5</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MATRIX2OF5_VALUE
     * @generated
     * @ordered
     */
	CONST_MATRIX2OF5(11, "ConstMatrix2of5", "ConstMatrix2of5"),

	/**
     * The '<em><b>Const Interleaved2of5</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_INTERLEAVED2OF5_VALUE
     * @generated
     * @ordered
     */
	CONST_INTERLEAVED2OF5(12, "ConstInterleaved2of5", "ConstInterleaved2of5"),

	/**
     * The '<em><b>Const Codabar2of7</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_CODABAR2OF7_VALUE
     * @generated
     * @ordered
     */
	CONST_CODABAR2OF7(13, "ConstCodabar2of7", "ConstCodabar2of7"),

	/**
     * The '<em><b>Const Code128</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_CODE128_VALUE
     * @generated
     * @ordered
     */
	CONST_CODE128(17, "ConstCode128", "ConstCode128"),

	/**
     * The '<em><b>Const EAN 2digit</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_EAN_2DIGIT_VALUE
     * @generated
     * @ordered
     */
	CONST_EAN_2DIGIT(22, "ConstEAN2digit", "ConstEAN2digit"),

	/**
     * The '<em><b>Const EAN 5digit</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_EAN_5DIGIT_VALUE
     * @generated
     * @ordered
     */
	CONST_EAN_5DIGIT(23, "ConstEAN5digit", "ConstEAN5digit"),

	/**
     * The '<em><b>Const POSTNET</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_POSTNET_VALUE
     * @generated
     * @ordered
     */
	CONST_POSTNET(24, "ConstPOSTNET", "ConstPOSTNET"),

	/**
     * The '<em><b>Const RM4SCC</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_RM4SCC_VALUE
     * @generated
     * @ordered
     */
	CONST_RM4SCC(26, "ConstRM4SCC", "ConstRM4SCC"),

	/**
     * The '<em><b>Const Japan Postal Bar Code</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_JAPAN_POSTAL_BAR_CODE_VALUE
     * @generated
     * @ordered
     */
	CONST_JAPAN_POSTAL_BAR_CODE(27, "ConstJapanPostalBarCode", "ConstJapanPostalBarCode"),

	/**
     * The '<em><b>Const Data Matrix</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_DATA_MATRIX_VALUE
     * @generated
     * @ordered
     */
	CONST_DATA_MATRIX(28, "ConstDataMatrix", "ConstDataMatrix"),

	/**
     * The '<em><b>Const Maxi Code</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MAXI_CODE_VALUE
     * @generated
     * @ordered
     */
	CONST_MAXI_CODE(29, "ConstMaxiCode", "ConstMaxiCode"),

	/**
     * The '<em><b>Const PDF417</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PDF417_VALUE
     * @generated
     * @ordered
     */
	CONST_PDF417(30, "ConstPDF417", "ConstPDF417"),

	/**
     * The '<em><b>Const Australia Post Bar Code</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_AUSTRALIA_POST_BAR_CODE_VALUE
     * @generated
     * @ordered
     */
	CONST_AUSTRALIA_POST_BAR_CODE(31, "ConstAustraliaPostBarCode", "ConstAustraliaPostBarCode"),

	/**
     * The '<em><b>Const QR Code</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_QR_CODE_VALUE
     * @generated
     * @ordered
     */
	CONST_QR_CODE(32, "ConstQRCode", "ConstQRCode"),

	/**
     * The '<em><b>Const Code93</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_CODE93_VALUE
     * @generated
     * @ordered
     */
	CONST_CODE93(33, "ConstCode93", "ConstCode93"),

	/**
     * The '<em><b>Const USPS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_USPS_VALUE
     * @generated
     * @ordered
     */
	CONST_USPS(34, "ConstUSPS", "ConstUSPS");

	/**
     * The '<em><b>Const Code39</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Code39</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_CODE39
     * @model name="ConstCode39"
     * @generated
     * @ordered
     */
	public static final int CONST_CODE39_VALUE = 1;

	/**
     * The '<em><b>Const MSI</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const MSI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MSI
     * @model name="ConstMSI"
     * @generated
     * @ordered
     */
	public static final int CONST_MSI_VALUE = 2;

	/**
     * The '<em><b>Const UPCCGPCA</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UPCCGPCA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_UPCCGPCA
     * @model name="ConstUPCCGPCA"
     * @generated
     * @ordered
     */
	public static final int CONST_UPCCGPCA_VALUE = 3;

	/**
     * The '<em><b>Const UPCCGPCE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UPCCGPCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_UPCCGPCE
     * @model name="ConstUPCCGPCE"
     * @generated
     * @ordered
     */
	public static final int CONST_UPCCGPCE_VALUE = 5;

	/**
     * The '<em><b>Const UPC2</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UPC2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_UPC2
     * @model name="ConstUPC2"
     * @generated
     * @ordered
     */
	public static final int CONST_UPC2_VALUE = 6;

	/**
     * The '<em><b>Const UPC5</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const UPC5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_UPC5
     * @model name="ConstUPC5"
     * @generated
     * @ordered
     */
	public static final int CONST_UPC5_VALUE = 7;

	/**
     * The '<em><b>Const EAN8</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const EAN8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_EAN8
     * @model name="ConstEAN8"
     * @generated
     * @ordered
     */
	public static final int CONST_EAN8_VALUE = 8;

	/**
     * The '<em><b>Const EAN13</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const EAN13</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_EAN13
     * @model name="ConstEAN13"
     * @generated
     * @ordered
     */
	public static final int CONST_EAN13_VALUE = 9;

	/**
     * The '<em><b>Const Industrial2of5</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Industrial2of5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_INDUSTRIAL2OF5
     * @model name="ConstIndustrial2of5"
     * @generated
     * @ordered
     */
	public static final int CONST_INDUSTRIAL2OF5_VALUE = 10;

	/**
     * The '<em><b>Const Matrix2of5</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Matrix2of5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MATRIX2OF5
     * @model name="ConstMatrix2of5"
     * @generated
     * @ordered
     */
	public static final int CONST_MATRIX2OF5_VALUE = 11;

	/**
     * The '<em><b>Const Interleaved2of5</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Interleaved2of5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_INTERLEAVED2OF5
     * @model name="ConstInterleaved2of5"
     * @generated
     * @ordered
     */
	public static final int CONST_INTERLEAVED2OF5_VALUE = 12;

	/**
     * The '<em><b>Const Codabar2of7</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Codabar2of7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_CODABAR2OF7
     * @model name="ConstCodabar2of7"
     * @generated
     * @ordered
     */
	public static final int CONST_CODABAR2OF7_VALUE = 13;

	/**
     * The '<em><b>Const Code128</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Code128</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_CODE128
     * @model name="ConstCode128"
     * @generated
     * @ordered
     */
	public static final int CONST_CODE128_VALUE = 17;

	/**
     * The '<em><b>Const EAN 2digit</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const EAN 2digit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_EAN_2DIGIT
     * @model name="ConstEAN2digit"
     * @generated
     * @ordered
     */
	public static final int CONST_EAN_2DIGIT_VALUE = 22;

	/**
     * The '<em><b>Const EAN 5digit</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const EAN 5digit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_EAN_5DIGIT
     * @model name="ConstEAN5digit"
     * @generated
     * @ordered
     */
	public static final int CONST_EAN_5DIGIT_VALUE = 23;

	/**
     * The '<em><b>Const POSTNET</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const POSTNET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_POSTNET
     * @model name="ConstPOSTNET"
     * @generated
     * @ordered
     */
	public static final int CONST_POSTNET_VALUE = 24;

	/**
     * The '<em><b>Const RM4SCC</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const RM4SCC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_RM4SCC
     * @model name="ConstRM4SCC"
     * @generated
     * @ordered
     */
	public static final int CONST_RM4SCC_VALUE = 26;

	/**
     * The '<em><b>Const Japan Postal Bar Code</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Japan Postal Bar Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_JAPAN_POSTAL_BAR_CODE
     * @model name="ConstJapanPostalBarCode"
     * @generated
     * @ordered
     */
	public static final int CONST_JAPAN_POSTAL_BAR_CODE_VALUE = 27;

	/**
     * The '<em><b>Const Data Matrix</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Data Matrix</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_DATA_MATRIX
     * @model name="ConstDataMatrix"
     * @generated
     * @ordered
     */
	public static final int CONST_DATA_MATRIX_VALUE = 28;

	/**
     * The '<em><b>Const Maxi Code</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Maxi Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MAXI_CODE
     * @model name="ConstMaxiCode"
     * @generated
     * @ordered
     */
	public static final int CONST_MAXI_CODE_VALUE = 29;

	/**
     * The '<em><b>Const PDF417</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const PDF417</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PDF417
     * @model name="ConstPDF417"
     * @generated
     * @ordered
     */
	public static final int CONST_PDF417_VALUE = 30;

	/**
     * The '<em><b>Const Australia Post Bar Code</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Australia Post Bar Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_AUSTRALIA_POST_BAR_CODE
     * @model name="ConstAustraliaPostBarCode"
     * @generated
     * @ordered
     */
	public static final int CONST_AUSTRALIA_POST_BAR_CODE_VALUE = 31;

	/**
     * The '<em><b>Const QR Code</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const QR Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_QR_CODE
     * @model name="ConstQRCode"
     * @generated
     * @ordered
     */
	public static final int CONST_QR_CODE_VALUE = 32;

	/**
     * The '<em><b>Const Code93</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Code93</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_CODE93
     * @model name="ConstCode93"
     * @generated
     * @ordered
     */
	public static final int CONST_CODE93_VALUE = 33;

	/**
     * The '<em><b>Const USPS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const USPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_USPS
     * @model name="ConstUSPS"
     * @generated
     * @ordered
     */
	public static final int CONST_USPS_VALUE = 34;

	/**
     * An array of all the '<em><b>BDDTYPE</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final BDDTYPE[] VALUES_ARRAY =
		new BDDTYPE[] {
            CONST_CODE39,
            CONST_MSI,
            CONST_UPCCGPCA,
            CONST_UPCCGPCE,
            CONST_UPC2,
            CONST_UPC5,
            CONST_EAN8,
            CONST_EAN13,
            CONST_INDUSTRIAL2OF5,
            CONST_MATRIX2OF5,
            CONST_INTERLEAVED2OF5,
            CONST_CODABAR2OF7,
            CONST_CODE128,
            CONST_EAN_2DIGIT,
            CONST_EAN_5DIGIT,
            CONST_POSTNET,
            CONST_RM4SCC,
            CONST_JAPAN_POSTAL_BAR_CODE,
            CONST_DATA_MATRIX,
            CONST_MAXI_CODE,
            CONST_PDF417,
            CONST_AUSTRALIA_POST_BAR_CODE,
            CONST_QR_CODE,
            CONST_CODE93,
            CONST_USPS,
        };

	/**
     * A public read-only list of all the '<em><b>BDDTYPE</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<BDDTYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>BDDTYPE</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static BDDTYPE get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BDDTYPE result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>BDDTYPE</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static BDDTYPE getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            BDDTYPE result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>BDDTYPE</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static BDDTYPE get(int value) {
        switch (value) {
            case CONST_CODE39_VALUE: return CONST_CODE39;
            case CONST_MSI_VALUE: return CONST_MSI;
            case CONST_UPCCGPCA_VALUE: return CONST_UPCCGPCA;
            case CONST_UPCCGPCE_VALUE: return CONST_UPCCGPCE;
            case CONST_UPC2_VALUE: return CONST_UPC2;
            case CONST_UPC5_VALUE: return CONST_UPC5;
            case CONST_EAN8_VALUE: return CONST_EAN8;
            case CONST_EAN13_VALUE: return CONST_EAN13;
            case CONST_INDUSTRIAL2OF5_VALUE: return CONST_INDUSTRIAL2OF5;
            case CONST_MATRIX2OF5_VALUE: return CONST_MATRIX2OF5;
            case CONST_INTERLEAVED2OF5_VALUE: return CONST_INTERLEAVED2OF5;
            case CONST_CODABAR2OF7_VALUE: return CONST_CODABAR2OF7;
            case CONST_CODE128_VALUE: return CONST_CODE128;
            case CONST_EAN_2DIGIT_VALUE: return CONST_EAN_2DIGIT;
            case CONST_EAN_5DIGIT_VALUE: return CONST_EAN_5DIGIT;
            case CONST_POSTNET_VALUE: return CONST_POSTNET;
            case CONST_RM4SCC_VALUE: return CONST_RM4SCC;
            case CONST_JAPAN_POSTAL_BAR_CODE_VALUE: return CONST_JAPAN_POSTAL_BAR_CODE;
            case CONST_DATA_MATRIX_VALUE: return CONST_DATA_MATRIX;
            case CONST_MAXI_CODE_VALUE: return CONST_MAXI_CODE;
            case CONST_PDF417_VALUE: return CONST_PDF417;
            case CONST_AUSTRALIA_POST_BAR_CODE_VALUE: return CONST_AUSTRALIA_POST_BAR_CODE;
            case CONST_QR_CODE_VALUE: return CONST_QR_CODE;
            case CONST_CODE93_VALUE: return CONST_CODE93;
            case CONST_USPS_VALUE: return CONST_USPS;
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
	private BDDTYPE(int value, String name, String literal) {
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
	
} //BDDTYPE
