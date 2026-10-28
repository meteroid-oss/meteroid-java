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
public final class EntitlementCheckReason implements ToQueryParam {
    /** The value {@code "WITHIN_LIMIT"}. */
    public static final EntitlementCheckReason WITHIN_LIMIT =
            new EntitlementCheckReason("WITHIN_LIMIT", Value.WITHIN_LIMIT);

    /** The value {@code "LIMIT_REACHED"}. */
    public static final EntitlementCheckReason LIMIT_REACHED =
            new EntitlementCheckReason("LIMIT_REACHED", Value.LIMIT_REACHED);

    /** The value {@code "NO_ENTITLEMENT"}. */
    public static final EntitlementCheckReason NO_ENTITLEMENT =
            new EntitlementCheckReason("NO_ENTITLEMENT", Value.NO_ENTITLEMENT);

    /** The value {@code "DISABLED"}. */
    public static final EntitlementCheckReason DISABLED =
            new EntitlementCheckReason("DISABLED", Value.DISABLED);

    /** The value {@code "BUDGET_EXCEEDED"}. */
    public static final EntitlementCheckReason BUDGET_EXCEEDED =
            new EntitlementCheckReason("BUDGET_EXCEEDED", Value.BUDGET_EXCEEDED);

    /** The value {@code "INSUFFICIENT_BALANCE"}. */
    public static final EntitlementCheckReason INSUFFICIENT_BALANCE =
            new EntitlementCheckReason("INSUFFICIENT_BALANCE", Value.INSUFFICIENT_BALANCE);

    /** The value {@code "TOO_MANY_GROUPS"}. */
    public static final EntitlementCheckReason TOO_MANY_GROUPS =
            new EntitlementCheckReason("TOO_MANY_GROUPS", Value.TOO_MANY_GROUPS);

    private static final Map<String, EntitlementCheckReason> constants =
            Map.ofEntries(
                    Map.entry("WITHIN_LIMIT", WITHIN_LIMIT),
                    Map.entry("LIMIT_REACHED", LIMIT_REACHED),
                    Map.entry("NO_ENTITLEMENT", NO_ENTITLEMENT),
                    Map.entry("DISABLED", DISABLED),
                    Map.entry("BUDGET_EXCEEDED", BUDGET_EXCEEDED),
                    Map.entry("INSUFFICIENT_BALANCE", INSUFFICIENT_BALANCE),
                    Map.entry("TOO_MANY_GROUPS", TOO_MANY_GROUPS));

    private final String value;
    private final Value variant;

    private EntitlementCheckReason(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown EntitlementCheckReason holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static EntitlementCheckReason of(String value) {
        EntitlementCheckReason constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new EntitlementCheckReason(value, Value._UNKNOWN);
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
                    "unknown EntitlementCheckReason: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof EntitlementCheckReason
                && Objects.equals(value, ((EntitlementCheckReason) o).value);
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
        /** The {@code WITHIN_LIMIT} constant. */
        WITHIN_LIMIT,
        /** The {@code LIMIT_REACHED} constant. */
        LIMIT_REACHED,
        /** The {@code NO_ENTITLEMENT} constant. */
        NO_ENTITLEMENT,
        /** The {@code DISABLED} constant. */
        DISABLED,
        /** The {@code BUDGET_EXCEEDED} constant. */
        BUDGET_EXCEEDED,
        /** The {@code INSUFFICIENT_BALANCE} constant. */
        INSUFFICIENT_BALANCE,
        /** The {@code TOO_MANY_GROUPS} constant. */
        TOO_MANY_GROUPS
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code WITHIN_LIMIT} constant. */
        WITHIN_LIMIT,
        /** The {@code LIMIT_REACHED} constant. */
        LIMIT_REACHED,
        /** The {@code NO_ENTITLEMENT} constant. */
        NO_ENTITLEMENT,
        /** The {@code DISABLED} constant. */
        DISABLED,
        /** The {@code BUDGET_EXCEEDED} constant. */
        BUDGET_EXCEEDED,
        /** The {@code INSUFFICIENT_BALANCE} constant. */
        INSUFFICIENT_BALANCE,
        /** The {@code TOO_MANY_GROUPS} constant. */
        TOO_MANY_GROUPS,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
