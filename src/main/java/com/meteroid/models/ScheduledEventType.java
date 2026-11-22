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
public final class ScheduledEventType implements ToQueryParam {
    /** The value {@code "PLAN_CHANGE"}. */
    public static final ScheduledEventType PLAN_CHANGE =
            new ScheduledEventType("PLAN_CHANGE", Value.PLAN_CHANGE);

    /** The value {@code "CANCEL"}. */
    public static final ScheduledEventType CANCEL = new ScheduledEventType("CANCEL", Value.CANCEL);

    /** The value {@code "AMENDMENT"}. */
    public static final ScheduledEventType AMENDMENT =
            new ScheduledEventType("AMENDMENT", Value.AMENDMENT);

    private static final Map<String, ScheduledEventType> constants =
            Map.ofEntries(
                    Map.entry("PLAN_CHANGE", PLAN_CHANGE),
                    Map.entry("CANCEL", CANCEL),
                    Map.entry("AMENDMENT", AMENDMENT));

    private final String value;
    private final Value variant;

    private ScheduledEventType(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown ScheduledEventType holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ScheduledEventType of(String value) {
        ScheduledEventType constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new ScheduledEventType(value, Value._UNKNOWN);
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
                    "unknown ScheduledEventType: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ScheduledEventType
                && Objects.equals(value, ((ScheduledEventType) o).value);
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
        /** The {@code PLAN_CHANGE} constant. */
        PLAN_CHANGE,
        /** The {@code CANCEL} constant. */
        CANCEL,
        /** The {@code AMENDMENT} constant. */
        AMENDMENT
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code PLAN_CHANGE} constant. */
        PLAN_CHANGE,
        /** The {@code CANCEL} constant. */
        CANCEL,
        /** The {@code AMENDMENT} constant. */
        AMENDMENT,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
