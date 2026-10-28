// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * Why a credit grant's unspent credit lapsed.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class CreditGrantLapseReason implements ToQueryParam {
    /** The value {@code "EXPIRED"}. */
    public static final CreditGrantLapseReason EXPIRED =
            new CreditGrantLapseReason("EXPIRED", Value.EXPIRED);

    /** The value {@code "SUBSCRIPTION_ENDED"}. */
    public static final CreditGrantLapseReason SUBSCRIPTION_ENDED =
            new CreditGrantLapseReason("SUBSCRIPTION_ENDED", Value.SUBSCRIPTION_ENDED);

    private static final Map<String, CreditGrantLapseReason> constants =
            Map.ofEntries(
                    Map.entry("EXPIRED", EXPIRED),
                    Map.entry("SUBSCRIPTION_ENDED", SUBSCRIPTION_ENDED));

    private final String value;
    private final Value variant;

    private CreditGrantLapseReason(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditGrantLapseReason holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditGrantLapseReason of(String value) {
        CreditGrantLapseReason constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditGrantLapseReason(value, Value._UNKNOWN);
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
                    "unknown CreditGrantLapseReason: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditGrantLapseReason
                && Objects.equals(value, ((CreditGrantLapseReason) o).value);
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
        /** The {@code EXPIRED} constant. */
        EXPIRED,
        /** The {@code SUBSCRIPTION_ENDED} constant. */
        SUBSCRIPTION_ENDED
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code EXPIRED} constant. */
        EXPIRED,
        /** The {@code SUBSCRIPTION_ENDED} constant. */
        SUBSCRIPTION_ENDED,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
