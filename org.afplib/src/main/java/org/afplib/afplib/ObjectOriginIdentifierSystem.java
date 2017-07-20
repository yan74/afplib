/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Origin Identifier System</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectOriginIdentifierSystem()
 * @model
 * @generated
 */
public enum ObjectOriginIdentifierSystem implements Enumerator {
	/**
     * The '<em><b>Const MVS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MVS_VALUE
     * @generated
     * @ordered
     */
	CONST_MVS(1, "ConstMVS", "ConstMVS"),

	/**
     * The '<em><b>Const VM</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_VM_VALUE
     * @generated
     * @ordered
     */
	CONST_VM(2, "ConstVM", "ConstVM"),

	/**
     * The '<em><b>Const PCDOS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PCDOS_VALUE
     * @generated
     * @ordered
     */
	CONST_PCDOS(3, "ConstPCDOS", "ConstPCDOS"),

	/**
     * The '<em><b>Const VSE</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_VSE_VALUE
     * @generated
     * @ordered
     */
	CONST_VSE(4, "ConstVSE", "ConstVSE");

	/**
     * The '<em><b>Const MVS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const MVS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MVS
     * @model name="ConstMVS"
     * @generated
     * @ordered
     */
	public static final int CONST_MVS_VALUE = 1;

	/**
     * The '<em><b>Const VM</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const VM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_VM
     * @model name="ConstVM"
     * @generated
     * @ordered
     */
	public static final int CONST_VM_VALUE = 2;

	/**
     * The '<em><b>Const PCDOS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const PCDOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PCDOS
     * @model name="ConstPCDOS"
     * @generated
     * @ordered
     */
	public static final int CONST_PCDOS_VALUE = 3;

	/**
     * The '<em><b>Const VSE</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const VSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_VSE
     * @model name="ConstVSE"
     * @generated
     * @ordered
     */
	public static final int CONST_VSE_VALUE = 4;

	/**
     * An array of all the '<em><b>Object Origin Identifier System</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ObjectOriginIdentifierSystem[] VALUES_ARRAY =
		new ObjectOriginIdentifierSystem[] {
            CONST_MVS,
            CONST_VM,
            CONST_PCDOS,
            CONST_VSE,
        };

	/**
     * A public read-only list of all the '<em><b>Object Origin Identifier System</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ObjectOriginIdentifierSystem> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Object Origin Identifier System</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectOriginIdentifierSystem get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ObjectOriginIdentifierSystem result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Object Origin Identifier System</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectOriginIdentifierSystem getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ObjectOriginIdentifierSystem result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Object Origin Identifier System</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectOriginIdentifierSystem get(int value) {
        switch (value) {
            case CONST_MVS_VALUE: return CONST_MVS;
            case CONST_VM_VALUE: return CONST_VM;
            case CONST_PCDOS_VALUE: return CONST_PCDOS;
            case CONST_VSE_VALUE: return CONST_VSE;
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
	private ObjectOriginIdentifierSystem(int value, String name, String literal) {
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
	
} //ObjectOriginIdentifierSystem
