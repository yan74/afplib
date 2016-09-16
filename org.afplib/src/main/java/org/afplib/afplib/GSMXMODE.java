/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSMXMODE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getGSMXMODE()
 * @model
 * @generated
 */
public enum GSMXMODE implements Enumerator {
	/**
	 * The '<em><b>Const Drawing Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DRAWING_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DRAWING_DEFAULT(0, "ConstDrawingDefault", "ConstDrawingDefault"),

	/**
	 * The '<em><b>Const Overpaint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OVERPAINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OVERPAINT(2, "ConstOverpaint", "ConstOverpaint");

	/**
	 * The '<em><b>Const Drawing Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Drawing Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DRAWING_DEFAULT
	 * @model name="ConstDrawingDefault"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DRAWING_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Const Overpaint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Overpaint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OVERPAINT
	 * @model name="ConstOverpaint"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OVERPAINT_VALUE = 2;

	/**
	 * An array of all the '<em><b>GSMXMODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSMXMODE[] VALUES_ARRAY =
		new GSMXMODE[] {
			CONST_DRAWING_DEFAULT,
			CONST_OVERPAINT,
		};

	/**
	 * A public read-only list of all the '<em><b>GSMXMODE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSMXMODE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSMXMODE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSMXMODE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSMXMODE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSMXMODE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSMXMODE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSMXMODE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSMXMODE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSMXMODE get(int value) {
		switch (value) {
			case CONST_DRAWING_DEFAULT_VALUE: return CONST_DRAWING_DEFAULT;
			case CONST_OVERPAINT_VALUE: return CONST_OVERPAINT;
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
	private GSMXMODE(int value, String name, String literal) {
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
	
} //GSMXMODE
