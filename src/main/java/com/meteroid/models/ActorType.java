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
public final class ActorType implements ToQueryParam {
    /** The value {@code "USER"}. */
    public static final ActorType USER = new ActorType("USER", Value.USER);

    /** The value {@code "CUSTOMER"}. */
    public static final ActorType CUSTOMER = new ActorType("CUSTOMER", Value.CUSTOMER);

    /** The value {@code "SYSTEM"}. */
    public static final ActorType SYSTEM = new ActorType("SYSTEM", Value.SYSTEM);

    /** The value {@code "API_KEY"}. */
    public static final ActorType API_KEY = new ActorType("API_KEY", Value.API_KEY);

    /** The value {@code "OAUTH_APP"}. */
    public static final ActorType OAUTH_APP = new ActorType("OAUTH_APP", Value.OAUTH_APP);

    private static final Map<String, ActorType> constants =
            Map.ofEntries(
                    Map.entry("USER", USER),
                    Map.entry("CUSTOMER", CUSTOMER),
                    Map.entry("SYSTEM", SYSTEM),
                    Map.entry("API_KEY", API_KEY),
                    Map.entry("OAUTH_APP", OAUTH_APP));

    private final String value;
    private final Value variant;

    private ActorType(String value, Value variant) {
        this.value = value;
        this.variant = variant;
    }

    /**
     * The constant for {@code value}, or an unknown ActorType holding it.
     *
     * @param value the value
     * @return the constant
     */
    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static ActorType of(String value) {
        ActorType constant = constants.get(Objects.requireNonNull(value, "value"));
        return constant != null ? constant : new ActorType(value, Value._UNKNOWN);
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
            throw new com.meteroid.exceptions.InvalidDataException("unknown ActorType: " + value);
        }
        return Known.valueOf(variant.name());
    }

    @Override
    public String toQueryParam() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ActorType && Objects.equals(value, ((ActorType) o).value);
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
        /** The {@code USER} constant. */
        USER,
        /** The {@code CUSTOMER} constant. */
        CUSTOMER,
        /** The {@code SYSTEM} constant. */
        SYSTEM,
        /** The {@code API_KEY} constant. */
        API_KEY,
        /** The {@code OAUTH_APP} constant. */
        OAUTH_APP
    }

    /** The values this version of the SDK knows, and {@code _UNKNOWN} for the others. */
    public enum Value {
        /** The {@code USER} constant. */
        USER,
        /** The {@code CUSTOMER} constant. */
        CUSTOMER,
        /** The {@code SYSTEM} constant. */
        SYSTEM,
        /** The {@code API_KEY} constant. */
        API_KEY,
        /** The {@code OAUTH_APP} constant. */
        OAUTH_APP,
        /** A value this version of the SDK does not know. */
        _UNKNOWN
    }
}
