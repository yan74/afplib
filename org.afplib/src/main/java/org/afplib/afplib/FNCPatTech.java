/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNC Pat Tech</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCPatTech()
 * @model
 * @generated
 */
public enum FNCPatTech implements Enumerator {
	/**
     * The '<em><b>Const Laser Matrix Nbit Wide</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_LASER_MATRIX_NBIT_WIDE_VALUE
     * @generated
     * @ordered
     */
	CONST_LASER_MATRIX_NBIT_WIDE(5, "ConstLaserMatrixNbitWide", "ConstLaserMatrixNbitWide"),

	/**
     * The '<em><b>Const CID Keyedfont Type0</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_CID_KEYEDFONT_TYPE0_VALUE
     * @generated
     * @ordered
     */
	CONST_CID_KEYEDFONT_TYPE0(30, "ConstCIDKeyedfontType0", "ConstCIDKeyedfontType0"),

	/**
     * The '<em><b>Const PFB Type1</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PFB_TYPE1_VALUE
     * @generated
     * @ordered
     */
	CONST_PFB_TYPE1(31, "ConstPFBType1", "ConstPFBType1");

	/**
     * The '<em><b>Const Laser Matrix Nbit Wide</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Laser Matrix Nbit Wide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_LASER_MATRIX_NBIT_WIDE
     * @model name="ConstLaserMatrixNbitWide"
     * @generated
     * @ordered
     */
	public static final int CONST_LASER_MATRIX_NBIT_WIDE_VALUE = 5;

	/**
     * The '<em><b>Const CID Keyedfont Type0</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const CID Keyedfont Type0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_CID_KEYEDFONT_TYPE0
     * @model name="ConstCIDKeyedfontType0"
     * @generated
     * @ordered
     */
	public static final int CONST_CID_KEYEDFONT_TYPE0_VALUE = 30;

	/**
     * The '<em><b>Const PFB Type1</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const PFB Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PFB_TYPE1
     * @model name="ConstPFBType1"
     * @generated
     * @ordered
     */
	public static final int CONST_PFB_TYPE1_VALUE = 31;

	/**
     * An array of all the '<em><b>FNC Pat Tech</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FNCPatTech[] VALUES_ARRAY =
		new FNCPatTech[] {
            CONST_LASER_MATRIX_NBIT_WIDE,
            CONST_CID_KEYEDFONT_TYPE0,
            CONST_PFB_TYPE1,
        };

	/**
     * A public read-only list of all the '<em><b>FNC Pat Tech</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FNCPatTech> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>FNC Pat Tech</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCPatTech get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FNCPatTech result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>FNC Pat Tech</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCPatTech getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FNCPatTech result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>FNC Pat Tech</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCPatTech get(int value) {
        switch (value) {
            case CONST_LASER_MATRIX_NBIT_WIDE_VALUE: return CONST_LASER_MATRIX_NBIT_WIDE;
            case CONST_CID_KEYEDFONT_TYPE0_VALUE: return CONST_CID_KEYEDFONT_TYPE0;
            case CONST_PFB_TYPE1_VALUE: return CONST_PFB_TYPE1;
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
	private FNCPatTech(int value, String name, String literal) {
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
	
} //FNCPatTech
