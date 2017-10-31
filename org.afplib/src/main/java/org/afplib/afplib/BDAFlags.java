/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BDA Flags</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getBDAFlags()
 * @model
 * @generated
 */
public enum BDAFlags implements Enumerator {
	/**
	 * The '<em><b>HRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HRI_VALUE
	 * @generated
	 * @ordered
	 */
	HRI(128, "HRI", "HRI"),

	/**
	 * The '<em><b>Position1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION1_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION1(64, "Position1", "Position1"),

	/**
	 * The '<em><b>Position2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION2_VALUE
	 * @generated
	 * @ordered
	 */
	POSITION2(32, "Position2", "Position2"),

	/**
	 * The '<em><b>SSCAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SSCAST_VALUE
	 * @generated
	 * @ordered
	 */
	SSCAST(16, "SSCAST", "SSCAST"),

	/**
	 * The '<em><b>Supress BC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPRESS_BC_VALUE
	 * @generated
	 * @ordered
	 */
	SUPRESS_BC(4, "SupressBC", "SupressBC"),

	/**
	 * The '<em><b>Supress Blanks</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPRESS_BLANKS_VALUE
	 * @generated
	 * @ordered
	 */
	SUPRESS_BLANKS(2, "SupressBlanks", "SupressBlanks");

	/**
	 * The '<em><b>HRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HRI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HRI_VALUE = 128;

	/**
	 * The '<em><b>Position1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Position1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION1
	 * @model name="Position1"
	 * @generated
	 * @ordered
	 */
	public static final int POSITION1_VALUE = 64;

	/**
	 * The '<em><b>Position2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Position2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION2
	 * @model name="Position2"
	 * @generated
	 * @ordered
	 */
	public static final int POSITION2_VALUE = 32;

	/**
	 * The '<em><b>SSCAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SSCAST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SSCAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SSCAST_VALUE = 16;

	/**
	 * The '<em><b>Supress BC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supress BC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPRESS_BC
	 * @model name="SupressBC"
	 * @generated
	 * @ordered
	 */
	public static final int SUPRESS_BC_VALUE = 4;

	/**
	 * The '<em><b>Supress Blanks</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supress Blanks</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPRESS_BLANKS
	 * @model name="SupressBlanks"
	 * @generated
	 * @ordered
	 */
	public static final int SUPRESS_BLANKS_VALUE = 2;

	/**
	 * An array of all the '<em><b>BDA Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BDAFlags[] VALUES_ARRAY =
		new BDAFlags[] {
			HRI,
			POSITION1,
			POSITION2,
			SSCAST,
			SUPRESS_BC,
			SUPRESS_BLANKS,
		};

	/**
	 * A public read-only list of all the '<em><b>BDA Flags</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BDAFlags> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>BDA Flags</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BDAFlags get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BDAFlags result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BDA Flags</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BDAFlags getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BDAFlags result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>BDA Flags</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BDAFlags get(int value) {
		switch (value) {
			case HRI_VALUE: return HRI;
			case POSITION1_VALUE: return POSITION1;
			case POSITION2_VALUE: return POSITION2;
			case SSCAST_VALUE: return SSCAST;
			case SUPRESS_BC_VALUE: return SUPRESS_BC;
			case SUPRESS_BLANKS_VALUE: return SUPRESS_BLANKS;
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
	private BDAFlags(int value, String name, String literal) {
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
	
} //BDAFlags
