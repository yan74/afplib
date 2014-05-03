/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Medium Orientation Med Orient</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMediumOrientationMedOrient()
 * @model
 * @generated
 */
public enum MediumOrientationMedOrient implements Enumerator {
	/**
	 * The '<em><b>Const Portrait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PORTRAIT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PORTRAIT(0, "ConstPortrait", "ConstPortrait"),

	/**
	 * The '<em><b>Const Landscape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LANDSCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LANDSCAPE(1, "ConstLandscape", "ConstLandscape"),

	/**
	 * The '<em><b>Const Reverse Portrait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_REVERSE_PORTRAIT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_REVERSE_PORTRAIT(2, "ConstReversePortrait", "ConstReversePortrait"),

	/**
	 * The '<em><b>Const Reverse Landscape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_REVERSE_LANDSCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_REVERSE_LANDSCAPE(3, "ConstReverseLandscape", "ConstReverseLandscape"),

	/**
	 * The '<em><b>Const Portrait90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PORTRAIT90_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PORTRAIT90(4, "ConstPortrait90", "ConstPortrait90"),

	/**
	 * The '<em><b>Const Landscape90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LANDSCAPE90_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LANDSCAPE90(5, "ConstLandscape90", "ConstLandscape90");

	/**
	 * The '<em><b>Const Portrait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Portrait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PORTRAIT
	 * @model name="ConstPortrait"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PORTRAIT_VALUE = 0;

	/**
	 * The '<em><b>Const Landscape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Landscape</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LANDSCAPE
	 * @model name="ConstLandscape"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LANDSCAPE_VALUE = 1;

	/**
	 * The '<em><b>Const Reverse Portrait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Reverse Portrait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_REVERSE_PORTRAIT
	 * @model name="ConstReversePortrait"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_REVERSE_PORTRAIT_VALUE = 2;

	/**
	 * The '<em><b>Const Reverse Landscape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Reverse Landscape</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_REVERSE_LANDSCAPE
	 * @model name="ConstReverseLandscape"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_REVERSE_LANDSCAPE_VALUE = 3;

	/**
	 * The '<em><b>Const Portrait90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Portrait90</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PORTRAIT90
	 * @model name="ConstPortrait90"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PORTRAIT90_VALUE = 4;

	/**
	 * The '<em><b>Const Landscape90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Landscape90</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LANDSCAPE90
	 * @model name="ConstLandscape90"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LANDSCAPE90_VALUE = 5;

	/**
	 * An array of all the '<em><b>Medium Orientation Med Orient</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MediumOrientationMedOrient[] VALUES_ARRAY =
		new MediumOrientationMedOrient[] {
			CONST_PORTRAIT,
			CONST_LANDSCAPE,
			CONST_REVERSE_PORTRAIT,
			CONST_REVERSE_LANDSCAPE,
			CONST_PORTRAIT90,
			CONST_LANDSCAPE90,
		};

	/**
	 * A public read-only list of all the '<em><b>Medium Orientation Med Orient</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MediumOrientationMedOrient> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medium Orientation Med Orient</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediumOrientationMedOrient get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediumOrientationMedOrient result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medium Orientation Med Orient</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediumOrientationMedOrient getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MediumOrientationMedOrient result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medium Orientation Med Orient</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MediumOrientationMedOrient get(int value) {
		switch (value) {
			case CONST_PORTRAIT_VALUE: return CONST_PORTRAIT;
			case CONST_LANDSCAPE_VALUE: return CONST_LANDSCAPE;
			case CONST_REVERSE_PORTRAIT_VALUE: return CONST_REVERSE_PORTRAIT;
			case CONST_REVERSE_LANDSCAPE_VALUE: return CONST_REVERSE_LANDSCAPE;
			case CONST_PORTRAIT90_VALUE: return CONST_PORTRAIT90;
			case CONST_LANDSCAPE90_VALUE: return CONST_LANDSCAPE90;
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
	private MediumOrientationMedOrient(int value, String name, String literal) {
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
	
} //MediumOrientationMedOrient
