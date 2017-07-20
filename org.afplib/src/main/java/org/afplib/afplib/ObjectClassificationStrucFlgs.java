/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Classification Struc Flgs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectClassificationStrucFlgs()
 * @model
 * @generated
 */
public enum ObjectClassificationStrucFlgs implements Enumerator {
	/**
     * The '<em><b>Object Container</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER_VALUE
     * @generated
     * @ordered
     */
	OBJECT_CONTAINER(32768, "ObjectContainer", "ObjectContainer"),

	/**
     * The '<em><b>Object Container2</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER2_VALUE
     * @generated
     * @ordered
     */
	OBJECT_CONTAINER2(16384, "ObjectContainer2", "ObjectContainer2"),

	/**
     * The '<em><b>Object Environment Group</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBJECT_ENVIRONMENT_GROUP_VALUE
     * @generated
     * @ordered
     */
	OBJECT_ENVIRONMENT_GROUP(8192, "ObjectEnvironmentGroup", "ObjectEnvironmentGroup"),

	/**
     * The '<em><b>Object Environment Group2</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBJECT_ENVIRONMENT_GROUP2_VALUE
     * @generated
     * @ordered
     */
	OBJECT_ENVIRONMENT_GROUP2(4096, "ObjectEnvironmentGroup2", "ObjectEnvironmentGroup2"),

	/**
     * The '<em><b>Object Container Data</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER_DATA_VALUE
     * @generated
     * @ordered
     */
	OBJECT_CONTAINER_DATA(2048, "ObjectContainerData", "ObjectContainerData"),

	/**
     * The '<em><b>Object Container Data2</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER_DATA2_VALUE
     * @generated
     * @ordered
     */
	OBJECT_CONTAINER_DATA2(1024, "ObjectContainerData2", "ObjectContainerData2");

	/**
     * The '<em><b>Object Container</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Container</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER
     * @model name="ObjectContainer"
     * @generated
     * @ordered
     */
	public static final int OBJECT_CONTAINER_VALUE = 32768;

	/**
     * The '<em><b>Object Container2</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Container2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER2
     * @model name="ObjectContainer2"
     * @generated
     * @ordered
     */
	public static final int OBJECT_CONTAINER2_VALUE = 16384;

	/**
     * The '<em><b>Object Environment Group</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Environment Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBJECT_ENVIRONMENT_GROUP
     * @model name="ObjectEnvironmentGroup"
     * @generated
     * @ordered
     */
	public static final int OBJECT_ENVIRONMENT_GROUP_VALUE = 8192;

	/**
     * The '<em><b>Object Environment Group2</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Environment Group2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBJECT_ENVIRONMENT_GROUP2
     * @model name="ObjectEnvironmentGroup2"
     * @generated
     * @ordered
     */
	public static final int OBJECT_ENVIRONMENT_GROUP2_VALUE = 4096;

	/**
     * The '<em><b>Object Container Data</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Container Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER_DATA
     * @model name="ObjectContainerData"
     * @generated
     * @ordered
     */
	public static final int OBJECT_CONTAINER_DATA_VALUE = 2048;

	/**
     * The '<em><b>Object Container Data2</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Object Container Data2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OBJECT_CONTAINER_DATA2
     * @model name="ObjectContainerData2"
     * @generated
     * @ordered
     */
	public static final int OBJECT_CONTAINER_DATA2_VALUE = 1024;

	/**
     * An array of all the '<em><b>Object Classification Struc Flgs</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ObjectClassificationStrucFlgs[] VALUES_ARRAY =
		new ObjectClassificationStrucFlgs[] {
            OBJECT_CONTAINER,
            OBJECT_CONTAINER2,
            OBJECT_ENVIRONMENT_GROUP,
            OBJECT_ENVIRONMENT_GROUP2,
            OBJECT_CONTAINER_DATA,
            OBJECT_CONTAINER_DATA2,
        };

	/**
     * A public read-only list of all the '<em><b>Object Classification Struc Flgs</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ObjectClassificationStrucFlgs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Object Classification Struc Flgs</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectClassificationStrucFlgs get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ObjectClassificationStrucFlgs result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Object Classification Struc Flgs</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectClassificationStrucFlgs getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ObjectClassificationStrucFlgs result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Object Classification Struc Flgs</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectClassificationStrucFlgs get(int value) {
        switch (value) {
            case OBJECT_CONTAINER_VALUE: return OBJECT_CONTAINER;
            case OBJECT_CONTAINER2_VALUE: return OBJECT_CONTAINER2;
            case OBJECT_ENVIRONMENT_GROUP_VALUE: return OBJECT_ENVIRONMENT_GROUP;
            case OBJECT_ENVIRONMENT_GROUP2_VALUE: return OBJECT_ENVIRONMENT_GROUP2;
            case OBJECT_CONTAINER_DATA_VALUE: return OBJECT_CONTAINER_DATA;
            case OBJECT_CONTAINER_DATA2_VALUE: return OBJECT_CONTAINER_DATA2;
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
	private ObjectClassificationStrucFlgs(int value, String name, String literal) {
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
	
} //ObjectClassificationStrucFlgs
