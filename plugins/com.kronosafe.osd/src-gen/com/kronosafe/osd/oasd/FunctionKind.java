/**
 */
package com.kronosafe.osd.oasd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A FunctionItem represents a specific C-function of a block in the system. It can be the function called during the initialization phase, the function called during the reset phase or the function called during the main cycle phase.
 * <!-- end-model-doc -->
 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionKind()
 * @model
 * @generated
 */
public enum FunctionKind implements Enumerator {
	/**
	 * The '<em><b>Init</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function executed for the initialization of the block.
	 * <!-- end-model-doc -->
	 * @see #INIT_VALUE
	 * @generated
	 * @ordered
	 */
	INIT(0, "init", "init"),

	/**
	 * The '<em><b>Cycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function executed each cycle of the block.
	 * <!-- end-model-doc -->
	 * @see #CYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CYCLE(1, "cycle", "cycle"),

	/**
	 * The '<em><b>Reset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function executed for the block reset.
	 * <!-- end-model-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(2, "reset", "reset");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The '<em><b>Init</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Init</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function executed for the initialization of the block.
	 * <!-- end-model-doc -->
	 * @see #INIT
	 * @model name="init"
	 * @generated
	 * @ordered
	 */
	public static final int INIT_VALUE = 0;

	/**
	 * The '<em><b>Cycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cycle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function executed each cycle of the block.
	 * <!-- end-model-doc -->
	 * @see #CYCLE
	 * @model name="cycle"
	 * @generated
	 * @ordered
	 */
	public static final int CYCLE_VALUE = 1;

	/**
	 * The '<em><b>Reset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reset</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A function executed for the block reset.
	 * <!-- end-model-doc -->
	 * @see #RESET
	 * @model name="reset"
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 2;

	/**
	 * An array of all the '<em><b>Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FunctionKind[] VALUES_ARRAY =
		new FunctionKind[] {
			INIT,
			CYCLE,
			RESET,
		};

	/**
	 * A public read-only list of all the '<em><b>Function Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FunctionKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Function Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunctionKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunctionKind get(int value) {
		switch (value) {
			case INIT_VALUE: return INIT;
			case CYCLE_VALUE: return CYCLE;
			case RESET_VALUE: return RESET;
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
	private FunctionKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //FunctionKind
