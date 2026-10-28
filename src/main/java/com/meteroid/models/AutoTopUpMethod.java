// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * Values this version of the SDK does not know are kept, and sent back unchanged: {@link #value()}
 * is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on them.
 */
public final class AutoTopUpMethod implements ToQueryParam {
    /** The value {@code "FIXED"}. */
    public static final AutoTopUpMethod FIXED = new AutoTopUpMethod("FIXED", Value.FIXED);

    /** The value {@code "TO_TARGET"}. */
    public static final AutoTopUpMethod TO_TARGET =
            new AutoTopUpMethod("TO_TARGET", Value.TO_TARGET);

    private static final Map<String, AutoTopUpMethod> constants =
            Map.ofEntries(Map.entry("FIXED", FIXED), Map.entry("TO_TARGET", TO_TARGET));

    private final String value;
    private final Value variant;

    private AutoTopUpMethod(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown AutoTopUpMethod holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static AutoTopUpMethod of(String value) {
        AutoTopUpMethod constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new AutoTopUpMethod(value, Value._UNKNOWN);
    }

    /**
     * The value as sent.
     *
     * @return the value
     */
    @JsonValue
    public String asString() {
        return value;
    }

    /**
     * Whether this version of the SDK knows the value.
     *
     * @return whether it is known
     */
    public boolean isKnown() {
        return variant != Value._UNKNOWN;
    }

    /**
     * The value as an enum to switch on, unknown values included.
     *
     * @return the enum, {@code _UNKNOWN} when unknown
     */
    public Value value() {
        return variant;
    }

    /**
     * The value as an enum of the known values only.
     *
     * @return the enum
     * @throws com.meteroid.exceptions.InvalidDataException when this version of the SDK does not
     *     know the value
     */
    public Known known() {
        if (!isKnown()) {
            throw new com.meteroid.exceptions.InvalidDataException(
                    "unknown AutoTopUpMethod: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof AutoTopUpMethod && Objects.equals(value, ((AutoTopUpMethod) o).value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** The values this version of the SDK knows. */
    public enum Known {
        /** The {@code FIXED} constant. */
        FIXED,
        /** The {@code TO_TARGET} constant. */
        TO_TARGET
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code FIXED} constant. */
        FIXED,
        /** The {@code TO_TARGET} constant. */
        TO_TARGET,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
