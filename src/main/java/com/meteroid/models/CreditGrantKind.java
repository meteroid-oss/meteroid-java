// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * The group a grant is shown in, from where it came from and what it pays: - INCLUDED: credit a
 * subscription's plan includes, which renews with it; - PREPAID: credit bought (purchases, top-ups,
 * paid packs, credit paid for outside Meteroid); - BONUS: credit given (the bonus part of
 * discounted credit, promo codes, welcome credit); - ACCOUNT_BALANCE: the customer's money that
 * pays any invoice (credit notes, returned invoices, the balance carried from before credit grants,
 * credit added for any charge).
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class CreditGrantKind implements ToQueryParam {
    /** The value {@code "INCLUDED"}. */
    public static final CreditGrantKind INCLUDED = new CreditGrantKind("INCLUDED", Value.INCLUDED);

    /** The value {@code "PREPAID"}. */
    public static final CreditGrantKind PREPAID = new CreditGrantKind("PREPAID", Value.PREPAID);

    /** The value {@code "BONUS"}. */
    public static final CreditGrantKind BONUS = new CreditGrantKind("BONUS", Value.BONUS);

    /** The value {@code "ACCOUNT_BALANCE"}. */
    public static final CreditGrantKind ACCOUNT_BALANCE =
            new CreditGrantKind("ACCOUNT_BALANCE", Value.ACCOUNT_BALANCE);

    private static final Map<String, CreditGrantKind> constants =
            Map.ofEntries(
                    Map.entry("INCLUDED", INCLUDED),
                    Map.entry("PREPAID", PREPAID),
                    Map.entry("BONUS", BONUS),
                    Map.entry("ACCOUNT_BALANCE", ACCOUNT_BALANCE));

    private final String value;
    private final Value variant;

    private CreditGrantKind(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown CreditGrantKind holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static CreditGrantKind of(String value) {
        CreditGrantKind constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new CreditGrantKind(value, Value._UNKNOWN);
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
                    "unknown CreditGrantKind: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditGrantKind && Objects.equals(value, ((CreditGrantKind) o).value);
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
        /** The {@code INCLUDED} constant. */
        INCLUDED,
        /** The {@code PREPAID} constant. */
        PREPAID,
        /** The {@code BONUS} constant. */
        BONUS,
        /** The {@code ACCOUNT_BALANCE} constant. */
        ACCOUNT_BALANCE
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code INCLUDED} constant. */
        INCLUDED,
        /** The {@code PREPAID} constant. */
        PREPAID,
        /** The {@code BONUS} constant. */
        BONUS,
        /** The {@code ACCOUNT_BALANCE} constant. */
        ACCOUNT_BALANCE,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
