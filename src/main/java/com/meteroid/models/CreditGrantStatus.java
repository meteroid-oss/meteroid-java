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
public final class CreditGrantStatus implements ToQueryParam {
    /** The value {@code "PENDING"}. */
    public static final CreditGrantStatus PENDING = new CreditGrantStatus("PENDING", Value.PENDING);

    /** The value {@code "ACTIVE"}. */
    public static final CreditGrantStatus ACTIVE = new CreditGrantStatus("ACTIVE", Value.ACTIVE);

    /** The value {@code "DEPLETED"}. */
    public static final CreditGrantStatus DEPLETED =
            new CreditGrantStatus("DEPLETED", Value.DEPLETED);

    /** The value {@code "EXPIRED"}. */
    public static final CreditGrantStatus EXPIRED = new CreditGrantStatus("EXPIRED", Value.EXPIRED);

    private static final Map<String, CreditGrantStatus> constants =
            Map.ofEntries(
                    Map.entry("PENDING", PENDING),
                    Map.entry("ACTIVE", ACTIVE),
                    Map.entry("DEPLETED", DEPLETED),
                    Map.entry("EXPIRED", EXPIRED));

    private final String value;
    private final Value variant;

    private CreditGrantStatus(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditGrantStatus holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditGrantStatus of(String value) {
        CreditGrantStatus constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditGrantStatus(value, Value._UNKNOWN);
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
                    "unknown CreditGrantStatus: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditGrantStatus
                && Objects.equals(value, ((CreditGrantStatus) o).value);
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
        /** The {@code PENDING} constant. */
        PENDING,
        /** The {@code ACTIVE} constant. */
        ACTIVE,
        /** The {@code DEPLETED} constant. */
        DEPLETED,
        /** The {@code EXPIRED} constant. */
        EXPIRED
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code PENDING} constant. */
        PENDING,
        /** The {@code ACTIVE} constant. */
        ACTIVE,
        /** The {@code DEPLETED} constant. */
        DEPLETED,
        /** The {@code EXPIRED} constant. */
        EXPIRED,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
