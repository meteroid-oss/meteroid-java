// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.meteroid.internal.JsonField;
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * A new credit unit.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditUnitCreateRequest {
    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("plural_name")
    private String pluralName;

    @JsonProperty("precision")
    private Integer precision;

    @JsonProperty("symbol")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> symbol = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditUnitCreateRequest() {}

    private CreditUnitCreateRequest(Builder builder) {
        this.code = builder.code;
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.precision = builder.precision;
        this.symbol = builder.symbol;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditUnitCreateRequest}.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A builder starting from this value.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.code = code;
        builder.name = name;
        builder.pluralName = pluralName;
        builder.precision = precision;
        builder.symbol = symbol;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Immutable once created: 4 to 16 characters, A-Z/0-9/_, starting with a letter. Never an ISO
     * currency code (those are always 3 letters).
     *
     * @return the value, never null
     */
    public String code() {
        return Utils.required(code, "code");
    }

    /**
     * Singular display name, 1 to 64 characters, e.g. "Credit".
     *
     * @return the value, never null
     */
    public String name() {
        return Utils.required(name, "name");
    }

    /**
     * Plural display name, 1 to 64 characters, e.g. "Credits".
     *
     * @return the value, never null
     */
    public String pluralName() {
        return Utils.required(pluralName, "plural_name");
    }

    /**
     * Immutable once created: 0 to 6.
     *
     * @return the value, never null
     */
    public Integer precision() {
        return Utils.required(precision, "precision");
    }

    /**
     * Short display symbol, at most 8 characters.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> symbol() {
        return symbol.asOptional();
    }

    /**
     * Properties this version of the SDK does not know, kept as received and sent back.
     *
     * @return the properties by name, unmodifiable
     */
    public Map<String, JsonNode> additionalProperties() {
        return Collections.unmodifiableMap(additionalProperties);
    }

    @JsonAnyGetter
    private Map<String, JsonNode> anyProperties() {
        return additionalProperties;
    }

    @JsonAnySetter
    private void putAnyProperty(String name, JsonNode value) {
        additionalProperties.put(name, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditUnitCreateRequest that = (CreditUnitCreateRequest) o;
        return Objects.equals(code, that.code)
                && Objects.equals(name, that.name)
                && Objects.equals(pluralName, that.pluralName)
                && Objects.equals(precision, that.precision)
                && Objects.equals(symbol, that.symbol)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, pluralName, precision, symbol, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditUnitCreateRequest{"
                + "code="
                + code
                + ", name="
                + name
                + ", pluralName="
                + pluralName
                + ", precision="
                + precision
                + ", symbol="
                + symbol
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditUnitCreateRequest}. */
    public static final class Builder {
        private String code;
        private String name;
        private String pluralName;
        private Integer precision;
        private JsonField<String> symbol = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Immutable once created: 4 to 16 characters, A-Z/0-9/_, starting with a letter. Never an
         * ISO currency code (those are always 3 letters).
         *
         * @param code the value
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Singular display name, 1 to 64 characters, e.g. "Credit".
         *
         * @param name the value
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Plural display name, 1 to 64 characters, e.g. "Credits".
         *
         * @param pluralName the value
         * @return this builder
         */
        public Builder pluralName(String pluralName) {
            this.pluralName = pluralName;
            return this;
        }

        /**
         * Immutable once created: 0 to 6.
         *
         * @param precision the value
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /**
         * Short display symbol, at most 8 characters.
         *
         * @param symbol the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder symbol(String symbol) {
            this.symbol = JsonField.ofNullable(symbol);
            return this;
        }

        /**
         * A property the SDK does not know, sent along.
         *
         * @param name the property name
         * @param value the JSON value
         * @return this builder
         */
        public Builder putAdditionalProperty(String name, JsonNode value) {
            additionalProperties.put(name, value);
            return this;
        }

        /**
         * Properties the SDK does not know, sent along.
         *
         * @param additionalProperties the properties by name
         * @return this builder
         */
        public Builder putAllAdditionalProperties(Map<String, JsonNode> additionalProperties) {
            this.additionalProperties.putAll(additionalProperties);
            return this;
        }

        /**
         * Leaves out a property the SDK does not know.
         *
         * @param name the property name
         * @return this builder
         */
        public Builder removeAdditionalProperty(String name) {
            additionalProperties.remove(name);
            return this;
        }

        /**
         * The {@code CreditUnitCreateRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditUnitCreateRequest build() {
            Utils.checkRequired(code, "code");
            Utils.checkRequired(name, "name");
            Utils.checkRequired(pluralName, "plural_name");
            Utils.checkRequired(precision, "precision");
            return new CreditUnitCreateRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditUnitCreateRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditUnitCreateRequest fromJson(String json) {
        return Utils.parse(json, CreditUnitCreateRequest.class);
    }

    /**
     * This value as JSON.
     *
     * @return the JSON text
     */
    public String toJson() {
        return Utils.json(this);
    }
}
