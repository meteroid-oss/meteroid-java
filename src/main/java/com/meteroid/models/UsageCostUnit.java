// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * What a cost is counted in.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class UsageCostUnit implements ToQueryParam {
    /** The value {@code "CURRENCY"}. */
    public static final UsageCostUnit CURRENCY = new UsageCostUnit("CURRENCY", Value.CURRENCY);

    /** The value {@code "CREDIT_UNIT"}. */
    public static final UsageCostUnit CREDIT_UNIT =
            new UsageCostUnit("CREDIT_UNIT", Value.CREDIT_UNIT);

    private static final Map<String, UsageCostUnit> constants =
            Map.ofEntries(Map.entry("CURRENCY", CURRENCY), Map.entry("CREDIT_UNIT", CREDIT_UNIT));

    private final String value;
    private final Value variant;

    private UsageCostUnit(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown UsageCostUnit holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static UsageCostUnit of(String value) {
        UsageCostUnit constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new UsageCostUnit(value, Value._UNKNOWN);
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
                    "unknown UsageCostUnit: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof UsageCostUnit && Objects.equals(value, ((UsageCostUnit) o).value);
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
        /** The {@code CURRENCY} constant. */
        CURRENCY,
        /** The {@code CREDIT_UNIT} constant. */
        CREDIT_UNIT
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code CURRENCY} constant. */
        CURRENCY,
        /** The {@code CREDIT_UNIT} constant. */
        CREDIT_UNIT,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
