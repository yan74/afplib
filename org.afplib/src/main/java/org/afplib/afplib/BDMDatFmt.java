/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BDM Dat Fmt</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getBDMDatFmt()
 * @model
 * @generated
 */
public enum BDMDatFmt implements Enumerator {
	/**
	 * The '<em><b>Const LND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LND_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LND(0, "ConstLND", "ConstLND"),

	/**
	 * The '<em><b>Const RCD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RCD_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RCD(1, "ConstRCD", "ConstRCD"),

	/**
	 * The '<em><b>Const XMD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_XMD_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_XMD(2, "ConstXMD", "ConstXMD");

	/**
	 * The '<em><b>Const LND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const LND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LND
	 * @model name="ConstLND"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LND_VALUE = 0;

	/**
	 * The '<em><b>Const RCD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const RCD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RCD
	 * @model name="ConstRCD"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RCD_VALUE = 1;

	/**
	 * The '<em><b>Const XMD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const XMD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_XMD
	 * @model name="ConstXMD"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_XMD_VALUE = 2;

	/**
	 * An array of all the '<em><b>BDM Dat Fmt</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BDMDatFmt[] VALUES_ARRAY =
		new BDMDatFmt[] {
			CONST_LND,
			CONST_RCD,
			CONST_XMD,
		};

	/**
	 * A public read-only list of all the '<em><b>BDM Dat Fmt</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BDMDatFmt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BDM Dat Fmt</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BDMDatFmt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BDMDatFmt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BDM Dat Fmt</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BDMDatFmt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BDMDatFmt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BDM Dat Fmt</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BDMDatFmt get(int value) {
		switch (value) {
			case CONST_LND_VALUE: return CONST_LND;
			case CONST_RCD_VALUE: return CONST_RCD;
			case CONST_XMD_VALUE: return CONST_XMD;
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
	private BDMDatFmt(int value, String name, String literal) {
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
	
} //BDMDatFmt
