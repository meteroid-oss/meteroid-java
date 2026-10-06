// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.meteroid.internal.Utils.ToQueryParam;

import java.util.Map;
import java.util.Objects;

/**
 * Why the payment provider declined a charge.
 *
 * <p>Values this version of the SDK does not know are kept, and sent back unchanged: {@link
 * #value()} is an enum to switch on, {@code _UNKNOWN} for them, and {@link #known()} throws on
 * them.
 */
public final class DeclineKind implements ToQueryParam {
    /** The value {@code "INSUFFICIENT_FUNDS"}. */
    public static final DeclineKind INSUFFICIENT_FUNDS =
            new DeclineKind("INSUFFICIENT_FUNDS", Value.INSUFFICIENT_FUNDS);

    /** The value {@code "DO_NOT_HONOR"}. */
    public static final DeclineKind DO_NOT_HONOR =
            new DeclineKind("DO_NOT_HONOR", Value.DO_NOT_HONOR);

    /** The value {@code "CARD_EXPIRED"}. */
    public static final DeclineKind CARD_EXPIRED =
            new DeclineKind("CARD_EXPIRED", Value.CARD_EXPIRED);

    /** The value {@code "AUTHENTICATION_REQUIRED"}. */
    public static final DeclineKind AUTHENTICATION_REQUIRED =
            new DeclineKind("AUTHENTICATION_REQUIRED", Value.AUTHENTICATION_REQUIRED);

    /** The value {@code "MANDATE_INACTIVE"}. */
    public static final DeclineKind MANDATE_INACTIVE =
            new DeclineKind("MANDATE_INACTIVE", Value.MANDATE_INACTIVE);

    /** The value {@code "FRAUD"}. */
    public static final DeclineKind FRAUD = new DeclineKind("FRAUD", Value.FRAUD);

    /** The value {@code "PROCESSING_ERROR"}. */
    public static final DeclineKind PROCESSING_ERROR =
            new DeclineKind("PROCESSING_ERROR", Value.PROCESSING_ERROR);

    /** The value {@code "OTHER"}. */
    public static final DeclineKind OTHER = new DeclineKind("OTHER", Value.OTHER);

    private static final Map<String, DeclineKind> constants =
            Map.ofEntries(
                    Map.entry("INSUFFICIENT_FUNDS", INSUFFICIENT_FUNDS),
                    Map.entry("DO_NOT_HONOR", DO_NOT_HONOR),
                    Map.entry("CARD_EXPIRED", CARD_EXPIRED),
                    Map.entry("AUTHENTICATION_REQUIRED", AUTHENTICATION_REQUIRED),
                    Map.entry("MANDATE_INACTIVE", MANDATE_INACTIVE),
                    Map.entry("FRAUD", FRAUD),
                    Map.entry("PROCESSING_ERROR", PROCESSING_ERROR),
                    Map.entry("OTHER", OTHER));

    private final String value;
    private final Value variant;

    private DeclineKind(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown DeclineKind holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static DeclineKind of(String value) {
        DeclineKind constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new DeclineKind(value, Value._UNKNOWN);
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
            throw new com.meteroid.exceptions.InvalidDataException("unknown DeclineKind: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof DeclineKind && Objects.equals(value, ((DeclineKind) o).value);
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
        /** The {@code INSUFFICIENT_FUNDS} constant. */
        INSUFFICIENT_FUNDS,
        /** The {@code DO_NOT_HONOR} constant. */
        DO_NOT_HONOR,
        /** The {@code CARD_EXPIRED} constant. */
        CARD_EXPIRED,
        /** The {@code AUTHENTICATION_REQUIRED} constant. */
        AUTHENTICATION_REQUIRED,
        /** The {@code MANDATE_INACTIVE} constant. */
        MANDATE_INACTIVE,
        /** The {@code FRAUD} constant. */
        FRAUD,
        /** The {@code PROCESSING_ERROR} constant. */
        PROCESSING_ERROR,
        /** The {@code OTHER} constant. */
        OTHER
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code INSUFFICIENT_FUNDS} constant. */
        INSUFFICIENT_FUNDS,
        /** The {@code DO_NOT_HONOR} constant. */
        DO_NOT_HONOR,
        /** The {@code CARD_EXPIRED} constant. */
        CARD_EXPIRED,
        /** The {@code AUTHENTICATION_REQUIRED} constant. */
        AUTHENTICATION_REQUIRED,
        /** The {@code MANDATE_INACTIVE} constant. */
        MANDATE_INACTIVE,
        /** The {@code FRAUD} constant. */
        FRAUD,
        /** The {@code PROCESSING_ERROR} constant. */
        PROCESSING_ERROR,
        /** The {@code OTHER} constant. */
        OTHER,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
