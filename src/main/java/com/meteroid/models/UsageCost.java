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

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Usage priced as its invoice line prices it, before discounts and credits: tax-inclusive when the
 * subscription's prices are.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class UsageCost {
    @JsonProperty("amount")
    private BigDecimal amount;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("unit")
    private UsageCostUnit unit;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UsageCost() {}

    private UsageCost(Builder builder) {
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.unit = builder.unit;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UsageCost}.
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
        builder.currency = currency;
        builder.unit = unit;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code amount} property.
     *
     * @return the value, never null
     */
    public BigDecimal amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * A currency code, or a credit unit code when <code>unit</code> is <code>CREDIT_UNIT</code>.
     *
     * @return the value, never null
     */
    public String currency() {
        return Utils.required(currency, "currency");
    }

    /**
     * The {@code unit} property.
     *
     * @return the value, never null
     */
    public UsageCostUnit unit() {
        return Utils.required(unit, "unit");
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
        UsageCost that = (UsageCost) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(currency, that.currency)
                && Objects.equals(unit, that.unit)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, unit, additionalProperties);
    }

    @Override
    public String toString() {
        return "UsageCost{"
                + "amount="
                + amount
                + ", currency="
                + currency
                + ", unit="
                + unit
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link UsageCost}. */
    public static final class Builder {
        private BigDecimal amount;
        private String currency;
        private UsageCostUnit unit;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code amount} property.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        /**
         * A currency code, or a credit unit code when <code>unit</code> is <code>CREDIT_UNIT</code>
         * .
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The {@code unit} property.
         *
         * @param unit the value
         * @return this builder
         */
        public Builder unit(UsageCostUnit unit) {
            this.unit = unit;
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
         * The {@code UsageCost}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UsageCost build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(unit, "unit");
            return new UsageCost(this);
        }
    }

    /**
     * Parse {@code json} as {@code UsageCost}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UsageCost fromJson(String json) {
        return Utils.parse(json, UsageCost.class);
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
