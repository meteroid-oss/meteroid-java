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
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditCap {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("denomination")
    private String denomination;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditCap() {}

    private CreditCap(Builder builder) {
        this.amount = builder.amount;
        this.denomination = builder.denomination;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditCap}.
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
        builder.amount = amount;
        builder.denomination = denomination;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Usage beyond the credit invoiced per billing period, in minor units of <code>denomination
     * </code>.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * A currency or credit unit code.
     *
     * @return the value, never null
     */
    public String denomination() {
        return Utils.required(denomination, "denomination");
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
        CreditCap that = (CreditCap) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(denomination, that.denomination)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, denomination, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditCap{"
                + "amount="
                + amount
                + ", denomination="
                + denomination
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditCap}. */
    public static final class Builder {
        private Long amount;
        private String denomination;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Usage beyond the credit invoiced per billing period, in minor units of <code>denomination
         * </code>.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * A currency or credit unit code.
         *
         * @param denomination the value
         * @return this builder
         */
        public Builder denomination(String denomination) {
            this.denomination = denomination;
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
         * The {@code CreditCap}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditCap build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(denomination, "denomination");
            return new CreditCap(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditCap}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditCap fromJson(String json) {
        return Utils.parse(json, CreditCap.class);
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
