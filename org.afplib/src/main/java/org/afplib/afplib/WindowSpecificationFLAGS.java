/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Window Specification FLAGS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getWindowSpecificationFLAGS()
 * @model
 * @generated
 */
public enum WindowSpecificationFLAGS implements Enumerator {
	/**
	 * The '<em><b>PPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPS_VALUE
	 * @generated
	 * @ordered
	 */
	PPS(1, "PPS", "PPS"),

	/**
	 * The '<em><b>ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(2, "ABS", "ABS"),

	/**
	 * The '<em><b>IMGRES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMGRES_VALUE
	 * @generated
	 * @ordered
	 */
	IMGRES(8, "IMGRES", "IMGRES"),

	/**
	 * The '<em><b>IMGNS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMGNS_VALUE
	 * @generated
	 * @ordered
	 */
	IMGNS(16, "IMGNS", "IMGNS");

	/**
	 * The '<em><b>PPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PPS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PPS_VALUE = 1;

	/**
	 * The '<em><b>ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABS_VALUE = 2;

	/**
	 * The '<em><b>IMGRES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMGRES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMGRES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMGRES_VALUE = 8;

	/**
	 * The '<em><b>IMGNS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMGNS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMGNS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMGNS_VALUE = 16;

	/**
	 * An array of all the '<em><b>Window Specification FLAGS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WindowSpecificationFLAGS[] VALUES_ARRAY =
		new WindowSpecificationFLAGS[] {
			PPS,
			ABS,
			IMGRES,
			IMGNS,
		};

	/**
	 * A public read-only list of all the '<em><b>Window Specification FLAGS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WindowSpecificationFLAGS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Window Specification FLAGS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindowSpecificationFLAGS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindowSpecificationFLAGS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Window Specification FLAGS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindowSpecificationFLAGS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WindowSpecificationFLAGS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Window Specification FLAGS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WindowSpecificationFLAGS get(int value) {
		switch (value) {
			case PPS_VALUE: return PPS;
			case ABS_VALUE: return ABS;
			case IMGRES_VALUE: return IMGRES;
			case IMGNS_VALUE: return IMGNS;
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
	private WindowSpecificationFLAGS(int value, String name, String literal) {
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
	
} //WindowSpecificationFLAGS
