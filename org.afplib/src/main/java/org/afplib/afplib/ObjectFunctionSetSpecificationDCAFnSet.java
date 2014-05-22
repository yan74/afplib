/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Function Set Specification DCA Fn Set</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecificationDCAFnSet()
 * @model
 * @generated
 */
public enum ObjectFunctionSetSpecificationDCAFnSet implements Enumerator {
	/**
	 * The '<em><b>Const Function Set8000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_FUNCTION_SET8000_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_FUNCTION_SET8000(32768, "ConstFunctionSet8000", "ConstFunctionSet8000");

	/**
	 * The '<em><b>Const Function Set8000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Function Set8000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_FUNCTION_SET8000
	 * @model name="ConstFunctionSet8000"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_FUNCTION_SET8000_VALUE = 32768;

	/**
	 * An array of all the '<em><b>Object Function Set Specification DCA Fn Set</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectFunctionSetSpecificationDCAFnSet[] VALUES_ARRAY =
		new ObjectFunctionSetSpecificationDCAFnSet[] {
			CONST_FUNCTION_SET8000,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Function Set Specification DCA Fn Set</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectFunctionSetSpecificationDCAFnSet> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Function Set Specification DCA Fn Set</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationDCAFnSet get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectFunctionSetSpecificationDCAFnSet result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Function Set Specification DCA Fn Set</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationDCAFnSet getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectFunctionSetSpecificationDCAFnSet result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Function Set Specification DCA Fn Set</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationDCAFnSet get(int value) {
		switch (value) {
			case CONST_FUNCTION_SET8000_VALUE: return CONST_FUNCTION_SET8000;
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
	private ObjectFunctionSetSpecificationDCAFnSet(int value, String name, String literal) {
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
	
} //ObjectFunctionSetSpecificationDCAFnSet
