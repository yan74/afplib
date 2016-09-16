/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PPORG Obj Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPPORGObjType()
 * @model
 * @generated
 */
public enum PPORGObjType implements Enumerator {
	/**
	 * The '<em><b>Const Other Object Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OTHER_OBJECT_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OTHER_OBJECT_DATA(146, "ConstOtherObjectData", "ConstOtherObjectData"),

	/**
	 * The '<em><b>Const Overlay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OVERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OVERLAY(223, "ConstOverlay", "ConstOverlay"),

	/**
	 * The '<em><b>Const IOCA Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_IOCA_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_IOCA_IMAGE(251, "ConstIOCAImage", "ConstIOCAImage");

	/**
	 * The '<em><b>Const Other Object Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Other Object Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OTHER_OBJECT_DATA
	 * @model name="ConstOtherObjectData"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OTHER_OBJECT_DATA_VALUE = 146;

	/**
	 * The '<em><b>Const Overlay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Overlay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OVERLAY
	 * @model name="ConstOverlay"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OVERLAY_VALUE = 223;

	/**
	 * The '<em><b>Const IOCA Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const IOCA Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_IOCA_IMAGE
	 * @model name="ConstIOCAImage"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_IOCA_IMAGE_VALUE = 251;

	/**
	 * An array of all the '<em><b>PPORG Obj Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PPORGObjType[] VALUES_ARRAY =
		new PPORGObjType[] {
			CONST_OTHER_OBJECT_DATA,
			CONST_OVERLAY,
			CONST_IOCA_IMAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>PPORG Obj Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PPORGObjType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PPORG Obj Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PPORGObjType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PPORGObjType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PPORG Obj Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PPORGObjType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PPORGObjType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PPORG Obj Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PPORGObjType get(int value) {
		switch (value) {
			case CONST_OTHER_OBJECT_DATA_VALUE: return CONST_OTHER_OBJECT_DATA;
			case CONST_OVERLAY_VALUE: return CONST_OVERLAY;
			case CONST_IOCA_IMAGE_VALUE: return CONST_IOCA_IMAGE;
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
	private PPORGObjType(int value, String name, String literal) {
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
	
} //PPORGObjType
