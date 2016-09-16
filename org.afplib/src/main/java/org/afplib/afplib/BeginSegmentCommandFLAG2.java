/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Begin Segment Command FLAG2</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getBeginSegmentCommandFLAG2()
 * @model
 * @generated
 */
public enum BeginSegmentCommandFLAG2 implements Enumerator {
	/**
	 * The '<em><b>Chained</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAINED_VALUE
	 * @generated
	 * @ordered
	 */
	CHAINED(1, "Chained", "Chained"),

	/**
	 * The '<em><b>Prolog</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROLOG_VALUE
	 * @generated
	 * @ordered
	 */
	PROLOG(8, "Prolog", "Prolog"),

	/**
	 * The '<em><b>New Segment1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_SEGMENT1_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_SEGMENT1(32, "NewSegment1", "NewSegment1"),

	/**
	 * The '<em><b>New Segment2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEW_SEGMENT2_VALUE
	 * @generated
	 * @ordered
	 */
	NEW_SEGMENT2(64, "NewSegment2", "NewSegment2");

	/**
	 * The '<em><b>Chained</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Chained</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHAINED
	 * @model name="Chained"
	 * @generated
	 * @ordered
	 */
	public static final int CHAINED_VALUE = 1;

	/**
	 * The '<em><b>Prolog</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prolog</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROLOG
	 * @model name="Prolog"
	 * @generated
	 * @ordered
	 */
	public static final int PROLOG_VALUE = 8;

	/**
	 * The '<em><b>New Segment1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New Segment1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_SEGMENT1
	 * @model name="NewSegment1"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_SEGMENT1_VALUE = 32;

	/**
	 * The '<em><b>New Segment2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>New Segment2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEW_SEGMENT2
	 * @model name="NewSegment2"
	 * @generated
	 * @ordered
	 */
	public static final int NEW_SEGMENT2_VALUE = 64;

	/**
	 * An array of all the '<em><b>Begin Segment Command FLAG2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BeginSegmentCommandFLAG2[] VALUES_ARRAY =
		new BeginSegmentCommandFLAG2[] {
			CHAINED,
			PROLOG,
			NEW_SEGMENT1,
			NEW_SEGMENT2,
		};

	/**
	 * A public read-only list of all the '<em><b>Begin Segment Command FLAG2</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BeginSegmentCommandFLAG2> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Begin Segment Command FLAG2</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BeginSegmentCommandFLAG2 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BeginSegmentCommandFLAG2 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Begin Segment Command FLAG2</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BeginSegmentCommandFLAG2 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BeginSegmentCommandFLAG2 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Begin Segment Command FLAG2</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static BeginSegmentCommandFLAG2 get(int value) {
		switch (value) {
			case CHAINED_VALUE: return CHAINED;
			case PROLOG_VALUE: return PROLOG;
			case NEW_SEGMENT1_VALUE: return NEW_SEGMENT1;
			case NEW_SEGMENT2_VALUE: return NEW_SEGMENT2;
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
	private BeginSegmentCommandFLAG2(int value, String name, String literal) {
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
	
} //BeginSegmentCommandFLAG2
