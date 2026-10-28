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
public final class LedgerEntryType implements ToQueryParam {
    /** The value {@code "CREDIT"}. */
    public static final LedgerEntryType CREDIT = new LedgerEntryType("CREDIT", Value.CREDIT);

    /** The value {@code "INVOICE_APPLICATION"}. */
    public static final LedgerEntryType INVOICE_APPLICATION =
            new LedgerEntryType("INVOICE_APPLICATION", Value.INVOICE_APPLICATION);

    /** The value {@code "INVOICE_RETURN"}. */
    public static final LedgerEntryType INVOICE_RETURN =
            new LedgerEntryType("INVOICE_RETURN", Value.INVOICE_RETURN);

    /** The value {@code "CREDIT_REVERSAL"}. */
    public static final LedgerEntryType CREDIT_REVERSAL =
            new LedgerEntryType("CREDIT_REVERSAL", Value.CREDIT_REVERSAL);

    /** The value {@code "CREDIT_REINSTATEMENT"}. */
    public static final LedgerEntryType CREDIT_REINSTATEMENT =
            new LedgerEntryType("CREDIT_REINSTATEMENT", Value.CREDIT_REINSTATEMENT);

    /** The value {@code "CREDIT_EXPIRY"}. */
    public static final LedgerEntryType CREDIT_EXPIRY =
            new LedgerEntryType("CREDIT_EXPIRY", Value.CREDIT_EXPIRY);

    /** The value {@code "CREDIT_ROLLOVER"}. */
    public static final LedgerEntryType CREDIT_ROLLOVER =
            new LedgerEntryType("CREDIT_ROLLOVER", Value.CREDIT_ROLLOVER);

    private static final Map<String, LedgerEntryType> constants =
            Map.ofEntries(
                    Map.entry("CREDIT", CREDIT),
                    Map.entry("INVOICE_APPLICATION", INVOICE_APPLICATION),
                    Map.entry("INVOICE_RETURN", INVOICE_RETURN),
                    Map.entry("CREDIT_REVERSAL", CREDIT_REVERSAL),
                    Map.entry("CREDIT_REINSTATEMENT", CREDIT_REINSTATEMENT),
                    Map.entry("CREDIT_EXPIRY", CREDIT_EXPIRY),
                    Map.entry("CREDIT_ROLLOVER", CREDIT_ROLLOVER));

    private final String value;
    private final Value variant;

    private LedgerEntryType(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown LedgerEntryType holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static LedgerEntryType of(String value) {
        LedgerEntryType constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new LedgerEntryType(value, Value._UNKNOWN);
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
                    "unknown LedgerEntryType: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof LedgerEntryType && Objects.equals(value, ((LedgerEntryType) o).value);
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
        /** The {@code CREDIT} constant. */
        CREDIT,
        /** The {@code INVOICE_APPLICATION} constant. */
        INVOICE_APPLICATION,
        /** The {@code INVOICE_RETURN} constant. */
        INVOICE_RETURN,
        /** The {@code CREDIT_REVERSAL} constant. */
        CREDIT_REVERSAL,
        /** The {@code CREDIT_REINSTATEMENT} constant. */
        CREDIT_REINSTATEMENT,
        /** The {@code CREDIT_EXPIRY} constant. */
        CREDIT_EXPIRY,
        /** The {@code CREDIT_ROLLOVER} constant. */
        CREDIT_ROLLOVER
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code CREDIT} constant. */
        CREDIT,
        /** The {@code INVOICE_APPLICATION} constant. */
        INVOICE_APPLICATION,
        /** The {@code INVOICE_RETURN} constant. */
        INVOICE_RETURN,
        /** The {@code CREDIT_REVERSAL} constant. */
        CREDIT_REVERSAL,
        /** The {@code CREDIT_REINSTATEMENT} constant. */
        CREDIT_REINSTATEMENT,
        /** The {@code CREDIT_EXPIRY} constant. */
        CREDIT_EXPIRY,
        /** The {@code CREDIT_ROLLOVER} constant. */
        CREDIT_ROLLOVER,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
