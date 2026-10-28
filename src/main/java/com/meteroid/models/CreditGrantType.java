// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * PAID credit was bought, through Meteroid or outside it, and applies after tax like a payment.
 * PROMOTIONAL credit was given (included with a plan, a coupon, bonus credit, a goodwill grant): it
 * applies before tax, like a discount, so it is spent before paid credit. Credit-unit grants are
 * drawn together, whatever their type.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class CreditGrantType implements ToQueryParam {
    /** The value {@code "PAID"}. */
    public static final CreditGrantType PAID = new CreditGrantType("PAID", Value.PAID);

    /** The value {@code "PROMOTIONAL"}. */
    public static final CreditGrantType PROMOTIONAL =
            new CreditGrantType("PROMOTIONAL", Value.PROMOTIONAL);

    private static final Map<String, CreditGrantType> constants =
            Map.ofEntries(Map.entry("PAID", PAID), Map.entry("PROMOTIONAL", PROMOTIONAL));

    private final String value;
    private final Value variant;

    private CreditGrantType(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditGrantType holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditGrantType of(String value) {
        CreditGrantType constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditGrantType(value, Value._UNKNOWN);
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
                    "unknown CreditGrantType: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditGrantType && Objects.equals(value, ((CreditGrantType) o).value);
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
        /** The {@code PAID} constant. */
        PAID,
        /** The {@code PROMOTIONAL} constant. */
        PROMOTIONAL
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code PAID} constant. */
        PAID,
        /** The {@code PROMOTIONAL} constant. */
        PROMOTIONAL,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
