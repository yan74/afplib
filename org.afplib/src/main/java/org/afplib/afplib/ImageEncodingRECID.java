/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Image Encoding RECID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getImageEncodingRECID()
 * @model
 * @generated
 */
public enum ImageEncodingRECID implements Enumerator {
	/**
     * The '<em><b>Const RIDIC</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_RIDIC_VALUE
     * @generated
     * @ordered
     */
	CONST_RIDIC(1, "ConstRIDIC", "ConstRIDIC"),

	/**
     * The '<em><b>Const Bottomtotop</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_BOTTOMTOTOP_VALUE
     * @generated
     * @ordered
     */
	CONST_BOTTOMTOTOP(3, "ConstBottomtotop", "ConstBottomtotop"),

	/**
     * The '<em><b>Const Unpadded RIDIC</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_UNPADDED_RIDIC_VALUE
     * @generated
     * @ordered
     */
	CONST_UNPADDED_RIDIC(4, "ConstUnpaddedRIDIC", "ConstUnpaddedRIDIC"),

	/**
     * The '<em><b>Const External</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_EXTERNAL_VALUE
     * @generated
     * @ordered
     */
	CONST_EXTERNAL(254, "ConstExternal", "ConstExternal");

	/**
     * The '<em><b>Const RIDIC</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const RIDIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_RIDIC
     * @model name="ConstRIDIC"
     * @generated
     * @ordered
     */
	public static final int CONST_RIDIC_VALUE = 1;

	/**
     * The '<em><b>Const Bottomtotop</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bottomtotop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_BOTTOMTOTOP
     * @model name="ConstBottomtotop"
     * @generated
     * @ordered
     */
	public static final int CONST_BOTTOMTOTOP_VALUE = 3;

	/**
     * The '<em><b>Const Unpadded RIDIC</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Unpadded RIDIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_UNPADDED_RIDIC
     * @model name="ConstUnpaddedRIDIC"
     * @generated
     * @ordered
     */
	public static final int CONST_UNPADDED_RIDIC_VALUE = 4;

	/**
     * The '<em><b>Const External</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const External</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_EXTERNAL
     * @model name="ConstExternal"
     * @generated
     * @ordered
     */
	public static final int CONST_EXTERNAL_VALUE = 254;

	/**
     * An array of all the '<em><b>Image Encoding RECID</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ImageEncodingRECID[] VALUES_ARRAY =
		new ImageEncodingRECID[] {
            CONST_RIDIC,
            CONST_BOTTOMTOTOP,
            CONST_UNPADDED_RIDIC,
            CONST_EXTERNAL,
        };

	/**
     * A public read-only list of all the '<em><b>Image Encoding RECID</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ImageEncodingRECID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Image Encoding RECID</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ImageEncodingRECID get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ImageEncodingRECID result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Image Encoding RECID</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ImageEncodingRECID getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ImageEncodingRECID result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Image Encoding RECID</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ImageEncodingRECID get(int value) {
        switch (value) {
            case CONST_RIDIC_VALUE: return CONST_RIDIC;
            case CONST_BOTTOMTOTOP_VALUE: return CONST_BOTTOMTOTOP;
            case CONST_UNPADDED_RIDIC_VALUE: return CONST_UNPADDED_RIDIC;
            case CONST_EXTERNAL_VALUE: return CONST_EXTERNAL;
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
	private ImageEncodingRECID(int value, String name, String literal) {
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
	
} //ImageEncodingRECID
