/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Offset Obj Tpe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectOffsetObjTpe()
 * @model
 * @generated
 */
public enum ObjectOffsetObjTpe implements Enumerator {
	/**
	 * The '<em><b>Const Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOCUMENT(168, "ConstDocument", "ConstDocument"),

	/**
	 * The '<em><b>Const Pageorpaginatedobject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGEORPAGINATEDOBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PAGEORPAGINATEDOBJECT(175, "ConstPageorpaginatedobject", "ConstPageorpaginatedobject");

	/**
	 * The '<em><b>Const Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOCUMENT
	 * @model name="ConstDocument"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOCUMENT_VALUE = 168;

	/**
	 * The '<em><b>Const Pageorpaginatedobject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Pageorpaginatedobject</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGEORPAGINATEDOBJECT
	 * @model name="ConstPageorpaginatedobject"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PAGEORPAGINATEDOBJECT_VALUE = 175;

	/**
	 * An array of all the '<em><b>Object Offset Obj Tpe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectOffsetObjTpe[] VALUES_ARRAY =
		new ObjectOffsetObjTpe[] {
			CONST_DOCUMENT,
			CONST_PAGEORPAGINATEDOBJECT,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Offset Obj Tpe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectOffsetObjTpe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Offset Obj Tpe</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectOffsetObjTpe get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectOffsetObjTpe result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Offset Obj Tpe</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectOffsetObjTpe getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectOffsetObjTpe result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Offset Obj Tpe</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectOffsetObjTpe get(int value) {
		switch (value) {
			case CONST_DOCUMENT_VALUE: return CONST_DOCUMENT;
			case CONST_PAGEORPAGINATEDOBJECT_VALUE: return CONST_PAGEORPAGINATEDOBJECT;
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
	private ObjectOffsetObjTpe(int value, String name, String literal) {
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
	
} //ObjectOffsetObjTpe
