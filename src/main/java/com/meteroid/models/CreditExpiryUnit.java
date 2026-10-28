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
public final class CreditExpiryUnit implements ToQueryParam {
    /** The value {@code "DAY"}. */
    public static final CreditExpiryUnit DAY = new CreditExpiryUnit("DAY", Value.DAY);

    /** The value {@code "MONTH"}. */
    public static final CreditExpiryUnit MONTH = new CreditExpiryUnit("MONTH", Value.MONTH);

    /** The value {@code "BILLING_PERIOD"}. */
    public static final CreditExpiryUnit BILLING_PERIOD =
            new CreditExpiryUnit("BILLING_PERIOD", Value.BILLING_PERIOD);

    private static final Map<String, CreditExpiryUnit> constants =
            Map.ofEntries(
                    Map.entry("DAY", DAY),
                    Map.entry("MONTH", MONTH),
                    Map.entry("BILLING_PERIOD", BILLING_PERIOD));

    private final String value;
    private final Value variant;

    private CreditExpiryUnit(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditExpiryUnit holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditExpiryUnit of(String value) {
        CreditExpiryUnit constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditExpiryUnit(value, Value._UNKNOWN);
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
                    "unknown CreditExpiryUnit: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditExpiryUnit && Objects.equals(value, ((CreditExpiryUnit) o).value);
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
        /** The {@code DAY} constant. */
        DAY,
        /** The {@code MONTH} constant. */
        MONTH,
        /** The {@code BILLING_PERIOD} constant. */
        BILLING_PERIOD
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code DAY} constant. */
        DAY,
        /** The {@code MONTH} constant. */
        MONTH,
        /** The {@code BILLING_PERIOD} constant. */
        BILLING_PERIOD,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
