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
public final class ListSubscriptionUsageCostsGranularity implements ToQueryParam {
    /** The value {@code "HOUR"}. */
    public static final ListSubscriptionUsageCostsGranularity HOUR =
            new ListSubscriptionUsageCostsGranularity("HOUR", Value.HOUR);

    /** The value {@code "DAY"}. */
    public static final ListSubscriptionUsageCostsGranularity DAY =
            new ListSubscriptionUsageCostsGranularity("DAY", Value.DAY);

    /** The value {@code "MONTH"}. */
    public static final ListSubscriptionUsageCostsGranularity MONTH =
            new ListSubscriptionUsageCostsGranularity("MONTH", Value.MONTH);

    private static final Map<String, ListSubscriptionUsageCostsGranularity> constants =
            Map.ofEntries(
                    Map.entry("HOUR", HOUR), Map.entry("DAY", DAY), Map.entry("MONTH", MONTH));

    private final String value;
    private final Value variant;

    private ListSubscriptionUsageCostsGranularity(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown ListSubscriptionUsageCostsGranularity holding
     * it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ListSubscriptionUsageCostsGranularity of(String value) {
        ListSubscriptionUsageCostsGranularity constant =
                constants.get(Objects.requireNonNull(value, "value"));
        return constant != null
                ? constant
                : new ListSubscriptionUsageCostsGranularity(value, Value._UNKNOWN);
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
                    "unknown ListSubscriptionUsageCostsGranularity: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ListSubscriptionUsageCostsGranularity
                && Objects.equals(value, ((ListSubscriptionUsageCostsGranularity) o).value);
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
        /** The {@code HOUR} constant. */
        HOUR,
        /** The {@code DAY} constant. */
        DAY,
        /** The {@code MONTH} constant. */
        MONTH
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code HOUR} constant. */
        HOUR,
        /** The {@code DAY} constant. */
        DAY,
        /** The {@code MONTH} constant. */
        MONTH,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
