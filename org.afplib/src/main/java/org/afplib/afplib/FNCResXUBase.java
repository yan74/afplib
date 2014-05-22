/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNC Res XU Base</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCResXUBase()
 * @model
 * @generated
 */
public enum FNCResXUBase implements Enumerator {
	/**
	 * The '<em><b>Const Shaperesultion10inches</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_SHAPERESULTION10INCHES_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_SHAPERESULTION10INCHES(0, "ConstShaperesultion10inches", "ConstShaperesultion10inches");

	/**
	 * The '<em><b>Const Shaperesultion10inches</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Shaperesultion10inches</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_SHAPERESULTION10INCHES
	 * @model name="ConstShaperesultion10inches"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_SHAPERESULTION10INCHES_VALUE = 0;

	/**
	 * An array of all the '<em><b>FNC Res XU Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNCResXUBase[] VALUES_ARRAY =
		new FNCResXUBase[] {
			CONST_SHAPERESULTION10INCHES,
		};

	/**
	 * A public read-only list of all the '<em><b>FNC Res XU Base</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNCResXUBase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNC Res XU Base</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNCResXUBase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCResXUBase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Res XU Base</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNCResXUBase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCResXUBase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Res XU Base</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNCResXUBase get(int value) {
		switch (value) {
			case CONST_SHAPERESULTION10INCHES_VALUE: return CONST_SHAPERESULTION10INCHES;
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
	private FNCResXUBase(int value, String name, String literal) {
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
	
} //FNCResXUBase
