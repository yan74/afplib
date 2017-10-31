/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IOB Ref CSys</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getIOBRefCSys()
 * @model
 * @generated
 */
public enum IOBRefCSys implements Enumerator {
	/**
	 * The '<em><b>Const Pageoroverlaycoordinatesystem</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGEOROVERLAYCOORDINATESYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PAGEOROVERLAYCOORDINATESYSTEM(1, "ConstPageoroverlaycoordinatesystem", "ConstPageoroverlaycoordinatesystem");

	/**
	 * The '<em><b>Const Pageoroverlaycoordinatesystem</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Pageoroverlaycoordinatesystem</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGEOROVERLAYCOORDINATESYSTEM
	 * @model name="ConstPageoroverlaycoordinatesystem"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PAGEOROVERLAYCOORDINATESYSTEM_VALUE = 1;

	/**
	 * An array of all the '<em><b>IOB Ref CSys</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOBRefCSys[] VALUES_ARRAY =
		new IOBRefCSys[] {
			CONST_PAGEOROVERLAYCOORDINATESYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>IOB Ref CSys</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOBRefCSys> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IOB Ref CSys</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOBRefCSys get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOBRefCSys result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IOB Ref CSys</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOBRefCSys getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOBRefCSys result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IOB Ref CSys</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOBRefCSys get(int value) {
		switch (value) {
			case CONST_PAGEOROVERLAYCOORDINATESYSTEM_VALUE: return CONST_PAGEOROVERLAYCOORDINATESYSTEM;
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
	private IOBRefCSys(int value, String name, String literal) {
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
	
} //IOBRefCSys
