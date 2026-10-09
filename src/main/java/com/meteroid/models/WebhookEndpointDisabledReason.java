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
public final class WebhookEndpointDisabledReason implements ToQueryParam {
    /** The value {@code "MANUAL"}. */
    public static final WebhookEndpointDisabledReason MANUAL =
            new WebhookEndpointDisabledReason("MANUAL", Value.MANUAL);

    /** The value {@code "AUTO_FAILURES"}. */
    public static final WebhookEndpointDisabledReason AUTO_FAILURES =
            new WebhookEndpointDisabledReason("AUTO_FAILURES", Value.AUTO_FAILURES);

    /** The value {@code "GONE"}. */
    public static final WebhookEndpointDisabledReason GONE =
            new WebhookEndpointDisabledReason("GONE", Value.GONE);

    private static final Map<String, WebhookEndpointDisabledReason> constants =
            Map.ofEntries(
                    Map.entry("MANUAL", MANUAL),
                    Map.entry("AUTO_FAILURES", AUTO_FAILURES),
                    Map.entry("GONE", GONE));

    private final String value;
    private final Value variant;

    private WebhookEndpointDisabledReason(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown WebhookEndpointDisabledReason holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static WebhookEndpointDisabledReason of(String value) {
        WebhookEndpointDisabledReason constant =
                constants.get(Objects.requireNonNull(value, "value"));
        return constant != null
                ? constant
                : new WebhookEndpointDisabledReason(value, Value._UNKNOWN);
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
                    "unknown WebhookEndpointDisabledReason: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof WebhookEndpointDisabledReason
                && Objects.equals(value, ((WebhookEndpointDisabledReason) o).value);
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
        /** The {@code AUTO_FAILURES} constant. */
        AUTO_FAILURES,
        /** The {@code GONE} constant. */
        GONE
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code MANUAL} constant. */
        MANUAL,
        /** The {@code AUTO_FAILURES} constant. */
        AUTO_FAILURES,
        /** The {@code GONE} constant. */
        GONE,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
