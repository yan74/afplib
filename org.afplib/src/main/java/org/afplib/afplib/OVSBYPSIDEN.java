/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OVSBYPSIDEN</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getOVSBYPSIDEN()
 * @model
 * @generated
 */
public enum OVSBYPSIDEN implements Enumerator {
	/**
	 * The '<em><b>Bypass Relative Move Inline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYPASS_RELATIVE_MOVE_INLINE_VALUE
	 * @generated
	 * @ordered
	 */
	BYPASS_RELATIVE_MOVE_INLINE(16, "BypassRelativeMoveInline", "BypassRelativeMoveInline"),

	/**
	 * The '<em><b>Bypass Absolute Move Inline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYPASS_ABSOLUTE_MOVE_INLINE_VALUE
	 * @generated
	 * @ordered
	 */
	BYPASS_ABSOLUTE_MOVE_INLINE(32, "BypassAbsoluteMoveInline", "BypassAbsoluteMoveInline"),

	/**
	 * The '<em><b>Bypassspacecharacters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYPASSSPACECHARACTERS_VALUE
	 * @generated
	 * @ordered
	 */
	BYPASSSPACECHARACTERS(64, "Bypassspacecharacters", "Bypassspacecharacters"),

	/**
	 * The '<em><b>No Bypassin Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_BYPASSIN_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	NO_BYPASSIN_EFFECT(128, "NoBypassinEffect", "NoBypassinEffect");

	/**
	 * The '<em><b>Bypass Relative Move Inline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bypass Relative Move Inline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYPASS_RELATIVE_MOVE_INLINE
	 * @model name="BypassRelativeMoveInline"
	 * @generated
	 * @ordered
	 */
	public static final int BYPASS_RELATIVE_MOVE_INLINE_VALUE = 16;

	/**
	 * The '<em><b>Bypass Absolute Move Inline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bypass Absolute Move Inline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYPASS_ABSOLUTE_MOVE_INLINE
	 * @model name="BypassAbsoluteMoveInline"
	 * @generated
	 * @ordered
	 */
	public static final int BYPASS_ABSOLUTE_MOVE_INLINE_VALUE = 32;

	/**
	 * The '<em><b>Bypassspacecharacters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bypassspacecharacters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYPASSSPACECHARACTERS
	 * @model name="Bypassspacecharacters"
	 * @generated
	 * @ordered
	 */
	public static final int BYPASSSPACECHARACTERS_VALUE = 64;

	/**
	 * The '<em><b>No Bypassin Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Bypassin Effect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_BYPASSIN_EFFECT
	 * @model name="NoBypassinEffect"
	 * @generated
	 * @ordered
	 */
	public static final int NO_BYPASSIN_EFFECT_VALUE = 128;

	/**
	 * An array of all the '<em><b>OVSBYPSIDEN</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OVSBYPSIDEN[] VALUES_ARRAY =
		new OVSBYPSIDEN[] {
			BYPASS_RELATIVE_MOVE_INLINE,
			BYPASS_ABSOLUTE_MOVE_INLINE,
			BYPASSSPACECHARACTERS,
			NO_BYPASSIN_EFFECT,
		};

	/**
	 * A public read-only list of all the '<em><b>OVSBYPSIDEN</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OVSBYPSIDEN> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OVSBYPSIDEN</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OVSBYPSIDEN get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OVSBYPSIDEN result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OVSBYPSIDEN</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OVSBYPSIDEN getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OVSBYPSIDEN result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OVSBYPSIDEN</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OVSBYPSIDEN get(int value) {
		switch (value) {
			case BYPASS_RELATIVE_MOVE_INLINE_VALUE: return BYPASS_RELATIVE_MOVE_INLINE;
			case BYPASS_ABSOLUTE_MOVE_INLINE_VALUE: return BYPASS_ABSOLUTE_MOVE_INLINE;
			case BYPASSSPACECHARACTERS_VALUE: return BYPASSSPACECHARACTERS;
			case NO_BYPASSIN_EFFECT_VALUE: return NO_BYPASSIN_EFFECT;
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
	private OVSBYPSIDEN(int value, String name, String literal) {
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
	
} //OVSBYPSIDEN
