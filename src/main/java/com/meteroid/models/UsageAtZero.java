// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * What a customer's usage does once the credit it can use runs out: what the subscription's plan
 * says (<code>FOLLOW_PLAN</code>), or always or never refused for this customer.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class UsageAtZero implements ToQueryParam {
    /** The value {@code "FOLLOW_PLAN"}. */
    public static final UsageAtZero FOLLOW_PLAN = new UsageAtZero("FOLLOW_PLAN", Value.FOLLOW_PLAN);

    /** The value {@code "ALWAYS_PAUSE"}. */
    public static final UsageAtZero ALWAYS_PAUSE =
            new UsageAtZero("ALWAYS_PAUSE", Value.ALWAYS_PAUSE);

    /** The value {@code "NEVER_PAUSE"}. */
    public static final UsageAtZero NEVER_PAUSE = new UsageAtZero("NEVER_PAUSE", Value.NEVER_PAUSE);

    private static final Map<String, UsageAtZero> constants =
            Map.ofEntries(
                    Map.entry("FOLLOW_PLAN", FOLLOW_PLAN),
                    Map.entry("ALWAYS_PAUSE", ALWAYS_PAUSE),
                    Map.entry("NEVER_PAUSE", NEVER_PAUSE));

    private final String value;
    private final Value variant;

    private UsageAtZero(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown UsageAtZero holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static UsageAtZero of(String value) {
        UsageAtZero constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new UsageAtZero(value, Value._UNKNOWN);
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
            throw new com.meteroid.exceptions.InvalidDataException("unknown UsageAtZero: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof UsageAtZero && Objects.equals(value, ((UsageAtZero) o).value);
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
        /** The {@code FOLLOW_PLAN} constant. */
        FOLLOW_PLAN,
        /** The {@code ALWAYS_PAUSE} constant. */
        ALWAYS_PAUSE,
        /** The {@code NEVER_PAUSE} constant. */
        NEVER_PAUSE
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code FOLLOW_PLAN} constant. */
        FOLLOW_PLAN,
        /** The {@code ALWAYS_PAUSE} constant. */
        ALWAYS_PAUSE,
        /** The {@code NEVER_PAUSE} constant. */
        NEVER_PAUSE,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
