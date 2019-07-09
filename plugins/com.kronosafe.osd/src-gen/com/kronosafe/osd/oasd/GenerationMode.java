/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.oasd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Generation Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The description of the functional generation mode.
 * <!-- end-model-doc -->
 * @see com.kronosafe.osd.oasd.oasdPackage#getGenerationMode()
 * @model
 * @generated
 */
public enum GenerationMode implements Enumerator {
	/**
	 * The '<em><b>Global Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A global context generation mode.
	 * <!-- end-model-doc -->
	 * @see #GLOBAL_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	GLOBAL_CONTEXT(0, "globalContext", "globalContext"),

	/**
	 * The '<em><b>Separate IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Function with parameters generation mode.
	 * <!-- end-model-doc -->
	 * @see #SEPARATE_IO_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATE_IO(1, "separateIO", "separateIO");

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The '<em><b>Global Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A global context generation mode.
	 * <!-- end-model-doc -->
	 * @see #GLOBAL_CONTEXT
	 * @model name="globalContext"
	 * @generated
	 * @ordered
	 */
	public static final int GLOBAL_CONTEXT_VALUE = 0;

	/**
	 * The '<em><b>Separate IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Function with parameters generation mode.
	 * <!-- end-model-doc -->
	 * @see #SEPARATE_IO
	 * @model name="separateIO"
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATE_IO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Generation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenerationMode[] VALUES_ARRAY =
		new GenerationMode[] {
			GLOBAL_CONTEXT,
			SEPARATE_IO,
		};

	/**
	 * A public read-only list of all the '<em><b>Generation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenerationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenerationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenerationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenerationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GenerationMode get(int value) {
		switch (value) {
			case GLOBAL_CONTEXT_VALUE: return GLOBAL_CONTEXT;
			case SEPARATE_IO_VALUE: return SEPARATE_IO;
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
	private GenerationMode(int value, String name, String literal) {
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
	
} //GenerationMode
