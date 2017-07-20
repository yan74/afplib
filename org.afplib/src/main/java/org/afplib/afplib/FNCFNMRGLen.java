/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNCFNMRG Len</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCFNMRGLen()
 * @model
 * @generated
 */
public enum FNCFNMRGLen implements Enumerator {
	/**
     * The '<em><b>Const No Raster Data</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_NO_RASTER_DATA_VALUE
     * @generated
     * @ordered
     */
	CONST_NO_RASTER_DATA(0, "ConstNoRasterData", "ConstNoRasterData"),

	/**
     * The '<em><b>Const With Raster Data</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_WITH_RASTER_DATA_VALUE
     * @generated
     * @ordered
     */
	CONST_WITH_RASTER_DATA(8, "ConstWithRasterData", "ConstWithRasterData");

	/**
     * The '<em><b>Const No Raster Data</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const No Raster Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_NO_RASTER_DATA
     * @model name="ConstNoRasterData"
     * @generated
     * @ordered
     */
	public static final int CONST_NO_RASTER_DATA_VALUE = 0;

	/**
     * The '<em><b>Const With Raster Data</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const With Raster Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_WITH_RASTER_DATA
     * @model name="ConstWithRasterData"
     * @generated
     * @ordered
     */
	public static final int CONST_WITH_RASTER_DATA_VALUE = 8;

	/**
     * An array of all the '<em><b>FNCFNMRG Len</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final FNCFNMRGLen[] VALUES_ARRAY =
		new FNCFNMRGLen[] {
            CONST_NO_RASTER_DATA,
            CONST_WITH_RASTER_DATA,
        };

	/**
     * A public read-only list of all the '<em><b>FNCFNMRG Len</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<FNCFNMRGLen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>FNCFNMRG Len</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCFNMRGLen get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FNCFNMRGLen result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>FNCFNMRG Len</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCFNMRGLen getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            FNCFNMRGLen result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>FNCFNMRG Len</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static FNCFNMRGLen get(int value) {
        switch (value) {
            case CONST_NO_RASTER_DATA_VALUE: return CONST_NO_RASTER_DATA;
            case CONST_WITH_RASTER_DATA_VALUE: return CONST_WITH_RASTER_DATA;
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
	private FNCFNMRGLen(int value, String name, String literal) {
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
	
} //FNCFNMRGLen
