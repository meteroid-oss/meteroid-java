// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * Why a payment was involuntarily clawed back.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class ReversalKind implements ToQueryParam {
    /** The value {@code "REFUND"}. */
    public static final ReversalKind REFUND = new ReversalKind("REFUND", Value.REFUND);

    /** The value {@code "CHARGEBACK"}. */
    public static final ReversalKind CHARGEBACK = new ReversalKind("CHARGEBACK", Value.CHARGEBACK);

    /** The value {@code "DEBTOR_RECALL"}. */
    public static final ReversalKind DEBTOR_RECALL =
            new ReversalKind("DEBTOR_RECALL", Value.DEBTOR_RECALL);

    /** The value {@code "INSUFFICIENT_FUNDS"}. */
    public static final ReversalKind INSUFFICIENT_FUNDS =
            new ReversalKind("INSUFFICIENT_FUNDS", Value.INSUFFICIENT_FUNDS);

    /** The value {@code "MANDATE_INVALID"}. */
    public static final ReversalKind MANDATE_INVALID =
            new ReversalKind("MANDATE_INVALID", Value.MANDATE_INVALID);

    /** The value {@code "RETURNED"}. */
    public static final ReversalKind RETURNED = new ReversalKind("RETURNED", Value.RETURNED);

    /** The value {@code "DISPUTE"}. */
    public static final ReversalKind DISPUTE = new ReversalKind("DISPUTE", Value.DISPUTE);

    /** The value {@code "OTHER"}. */
    public static final ReversalKind OTHER = new ReversalKind("OTHER", Value.OTHER);

    private static final Map<String, ReversalKind> constants =
            Map.ofEntries(
                    Map.entry("REFUND", REFUND),
                    Map.entry("CHARGEBACK", CHARGEBACK),
                    Map.entry("DEBTOR_RECALL", DEBTOR_RECALL),
                    Map.entry("INSUFFICIENT_FUNDS", INSUFFICIENT_FUNDS),
                    Map.entry("MANDATE_INVALID", MANDATE_INVALID),
                    Map.entry("RETURNED", RETURNED),
                    Map.entry("DISPUTE", DISPUTE),
                    Map.entry("OTHER", OTHER));

    private final String value;
    private final Value variant;

    private ReversalKind(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown ReversalKind holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ReversalKind of(String value) {
        ReversalKind constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new ReversalKind(value, Value._UNKNOWN);
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
                    "unknown ReversalKind: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ReversalKind && Objects.equals(value, ((ReversalKind) o).value);
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
        /** The {@code REFUND} constant. */
        REFUND,
        /** The {@code CHARGEBACK} constant. */
        CHARGEBACK,
        /** The {@code DEBTOR_RECALL} constant. */
        DEBTOR_RECALL,
        /** The {@code INSUFFICIENT_FUNDS} constant. */
        INSUFFICIENT_FUNDS,
        /** The {@code MANDATE_INVALID} constant. */
        MANDATE_INVALID,
        /** The {@code RETURNED} constant. */
        RETURNED,
        /** The {@code DISPUTE} constant. */
        DISPUTE,
        /** The {@code OTHER} constant. */
        OTHER
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code REFUND} constant. */
        REFUND,
        /** The {@code CHARGEBACK} constant. */
        CHARGEBACK,
        /** The {@code DEBTOR_RECALL} constant. */
        DEBTOR_RECALL,
        /** The {@code INSUFFICIENT_FUNDS} constant. */
        INSUFFICIENT_FUNDS,
        /** The {@code MANDATE_INVALID} constant. */
        MANDATE_INVALID,
        /** The {@code RETURNED} constant. */
        RETURNED,
        /** The {@code DISPUTE} constant. */
        DISPUTE,
        /** The {@code OTHER} constant. */
        OTHER,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
