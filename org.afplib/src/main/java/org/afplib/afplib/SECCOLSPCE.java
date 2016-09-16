/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SECCOLSPCE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getSECCOLSPCE()
 * @model
 * @generated
 */
public enum SECCOLSPCE implements Enumerator {
	/**
	 * The '<em><b>Const RGB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RGB_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RGB(1, "ConstRGB", "ConstRGB"),

	/**
	 * The '<em><b>Const CMYK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CMYK_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CMYK(4, "ConstCMYK", "ConstCMYK"),

	/**
	 * The '<em><b>Const Highlight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_HIGHLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_HIGHLIGHT(6, "ConstHighlight", "ConstHighlight"),

	/**
	 * The '<em><b>Const CIELAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CIELAB_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CIELAB(8, "ConstCIELAB", "ConstCIELAB"),

	/**
	 * The '<em><b>Const OCA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OCA_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OCA(64, "ConstOCA", "ConstOCA");

	/**
	 * The '<em><b>Const RGB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const RGB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RGB
	 * @model name="ConstRGB"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RGB_VALUE = 1;

	/**
	 * The '<em><b>Const CMYK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const CMYK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CMYK
	 * @model name="ConstCMYK"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CMYK_VALUE = 4;

	/**
	 * The '<em><b>Const Highlight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Highlight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_HIGHLIGHT
	 * @model name="ConstHighlight"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_HIGHLIGHT_VALUE = 6;

	/**
	 * The '<em><b>Const CIELAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const CIELAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CIELAB
	 * @model name="ConstCIELAB"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CIELAB_VALUE = 8;

	/**
	 * The '<em><b>Const OCA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const OCA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OCA
	 * @model name="ConstOCA"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OCA_VALUE = 64;

	/**
	 * An array of all the '<em><b>SECCOLSPCE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SECCOLSPCE[] VALUES_ARRAY =
		new SECCOLSPCE[] {
			CONST_RGB,
			CONST_CMYK,
			CONST_HIGHLIGHT,
			CONST_CIELAB,
			CONST_OCA,
		};

	/**
	 * A public read-only list of all the '<em><b>SECCOLSPCE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SECCOLSPCE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SECCOLSPCE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SECCOLSPCE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SECCOLSPCE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SECCOLSPCE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SECCOLSPCE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SECCOLSPCE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SECCOLSPCE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SECCOLSPCE get(int value) {
		switch (value) {
			case CONST_RGB_VALUE: return CONST_RGB;
			case CONST_CMYK_VALUE: return CONST_CMYK;
			case CONST_HIGHLIGHT_VALUE: return CONST_HIGHLIGHT;
			case CONST_CIELAB_VALUE: return CONST_CIELAB;
			case CONST_OCA_VALUE: return CONST_OCA;
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
	private SECCOLSPCE(int value, String name, String literal) {
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
	
} //SECCOLSPCE
