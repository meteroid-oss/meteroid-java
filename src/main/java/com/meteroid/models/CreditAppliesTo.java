// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * Which charges credit pays: ALL pays any part of an invoice, USAGE only its usage charges.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class CreditAppliesTo implements ToQueryParam {
    /** The value {@code "ALL"}. */
    public static final CreditAppliesTo ALL = new CreditAppliesTo("ALL", Value.ALL);

    /** The value {@code "USAGE"}. */
    public static final CreditAppliesTo USAGE = new CreditAppliesTo("USAGE", Value.USAGE);

    private static final Map<String, CreditAppliesTo> constants =
            Map.ofEntries(Map.entry("ALL", ALL), Map.entry("USAGE", USAGE));

    private final String value;
    private final Value variant;

    private CreditAppliesTo(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditAppliesTo holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditAppliesTo of(String value) {
        CreditAppliesTo constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditAppliesTo(value, Value._UNKNOWN);
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
                    "unknown CreditAppliesTo: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditAppliesTo && Objects.equals(value, ((CreditAppliesTo) o).value);
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
        /** The {@code ALL} constant. */
        ALL,
        /** The {@code USAGE} constant. */
        USAGE
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code ALL} constant. */
        ALL,
        /** The {@code USAGE} constant. */
        USAGE,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
