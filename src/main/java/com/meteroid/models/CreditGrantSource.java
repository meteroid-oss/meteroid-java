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
public final class CreditGrantSource implements ToQueryParam {
    /** The value {@code "MANUAL"}. */
    public static final CreditGrantSource MANUAL = new CreditGrantSource("MANUAL", Value.MANUAL);

    /** The value {@code "PURCHASE"}. */
    public static final CreditGrantSource PURCHASE =
            new CreditGrantSource("PURCHASE", Value.PURCHASE);

    /** The value {@code "PLAN"}. */
    public static final CreditGrantSource PLAN = new CreditGrantSource("PLAN", Value.PLAN);

    /** The value {@code "CREDIT_NOTE"}. */
    public static final CreditGrantSource CREDIT_NOTE =
            new CreditGrantSource("CREDIT_NOTE", Value.CREDIT_NOTE);

    /** The value {@code "ADJUSTMENT"}. */
    public static final CreditGrantSource ADJUSTMENT =
            new CreditGrantSource("ADJUSTMENT", Value.ADJUSTMENT);

    /** The value {@code "MIGRATED"}. */
    public static final CreditGrantSource MIGRATED =
            new CreditGrantSource("MIGRATED", Value.MIGRATED);

    /** The value {@code "ROLLOVER"}. */
    public static final CreditGrantSource ROLLOVER =
            new CreditGrantSource("ROLLOVER", Value.ROLLOVER);

    /** The value {@code "COUPON"}. */
    public static final CreditGrantSource COUPON = new CreditGrantSource("COUPON", Value.COUPON);

    /** The value {@code "OVERPAYMENT"}. */
    public static final CreditGrantSource OVERPAYMENT =
            new CreditGrantSource("OVERPAYMENT", Value.OVERPAYMENT);

    private static final Map<String, CreditGrantSource> constants =
            Map.ofEntries(
                    Map.entry("MANUAL", MANUAL),
                    Map.entry("PURCHASE", PURCHASE),
                    Map.entry("PLAN", PLAN),
                    Map.entry("CREDIT_NOTE", CREDIT_NOTE),
                    Map.entry("ADJUSTMENT", ADJUSTMENT),
                    Map.entry("MIGRATED", MIGRATED),
                    Map.entry("ROLLOVER", ROLLOVER),
                    Map.entry("COUPON", COUPON),
                    Map.entry("OVERPAYMENT", OVERPAYMENT));

    private final String value;
    private final Value variant;

    private CreditGrantSource(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditGrantSource holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditGrantSource of(String value) {
        CreditGrantSource constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditGrantSource(value, Value._UNKNOWN);
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
                    "unknown CreditGrantSource: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditGrantSource
                && Objects.equals(value, ((CreditGrantSource) o).value);
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
        /** The {@code MANUAL} constant. */
        MANUAL,
        /** The {@code PURCHASE} constant. */
        PURCHASE,
        /** The {@code PLAN} constant. */
        PLAN,
        /** The {@code CREDIT_NOTE} constant. */
        CREDIT_NOTE,
        /** The {@code ADJUSTMENT} constant. */
        ADJUSTMENT,
        /** The {@code MIGRATED} constant. */
        MIGRATED,
        /** The {@code ROLLOVER} constant. */
        ROLLOVER,
        /** The {@code COUPON} constant. */
        COUPON,
        /** The {@code OVERPAYMENT} constant. */
        OVERPAYMENT
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code MANUAL} constant. */
        MANUAL,
        /** The {@code PURCHASE} constant. */
        PURCHASE,
        /** The {@code PLAN} constant. */
        PLAN,
        /** The {@code CREDIT_NOTE} constant. */
        CREDIT_NOTE,
        /** The {@code ADJUSTMENT} constant. */
        ADJUSTMENT,
        /** The {@code MIGRATED} constant. */
        MIGRATED,
        /** The {@code ROLLOVER} constant. */
        ROLLOVER,
        /** The {@code COUPON} constant. */
        COUPON,
        /** The {@code OVERPAYMENT} constant. */
        OVERPAYMENT,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
