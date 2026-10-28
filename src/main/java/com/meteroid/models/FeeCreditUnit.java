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
 * The credit unit a usage fee's amounts are expressed in, with its value in the subscription
 * currency.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class FeeCreditUnit {
    @JsonProperty("code")
    private String code;

    @JsonProperty("credit_unit_id")
    private String creditUnitId;

    @JsonProperty("precision")
    private Integer precision;

    @JsonProperty("rate")
    private BigDecimal rate;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private FeeCreditUnit() {}

    private FeeCreditUnit(Builder builder) {
        this.code = builder.code;
        this.creditUnitId = builder.creditUnitId;
        this.precision = builder.precision;
        this.rate = builder.rate;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code FeeCreditUnit}.
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
        builder.creditUnitId = creditUnitId;
        builder.precision = precision;
        builder.rate = rate;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The credit unit's code, e.g. <code>CREDITS</code>.
     *
     * @return the value, never null
     */
    public String code() {
        return Utils.required(code, "code");
    }

    /**
     * The credit unit's id (<code>cun_…</code>).
     *
     * @return the value, never null
     */
    public String creditUnitId() {
        return Utils.required(creditUnitId, "credit_unit_id");
    }

    /**
     * Decimal places of the unit: credit balances and ledger amounts in it are integers of
     * 10^-precision credit.
     *
     * @return the value, never null
     */
    public Integer precision() {
        return Utils.required(precision, "precision");
    }

    /**
     * Subscription-currency major units per credit: the money billed, before tax, for each credit
     * the customer's balance in the unit does not cover.
     *
     * @return the value, never null
     */
    public BigDecimal rate() {
        return Utils.required(rate, "rate");
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
        FeeCreditUnit that = (FeeCreditUnit) o;
        return Objects.equals(code, that.code)
                && Objects.equals(creditUnitId, that.creditUnitId)
                && Objects.equals(precision, that.precision)
                && Objects.equals(rate, that.rate)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, creditUnitId, precision, rate, additionalProperties);
    }

    @Override
    public String toString() {
        return "FeeCreditUnit{"
                + "code="
                + code
                + ", creditUnitId="
                + creditUnitId
                + ", precision="
                + precision
                + ", rate="
                + rate
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link FeeCreditUnit}. */
    public static final class Builder {
        private String code;
        private String creditUnitId;
        private Integer precision;
        private BigDecimal rate;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The credit unit's code, e.g. <code>CREDITS</code>.
         *
         * @param code the value
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The credit unit's id (<code>cun_…</code>).
         *
         * @param creditUnitId the value
         * @return this builder
         */
        public Builder creditUnitId(String creditUnitId) {
            this.creditUnitId = creditUnitId;
            return this;
        }

        /**
         * Decimal places of the unit: credit balances and ledger amounts in it are integers of
         * 10^-precision credit.
         *
         * @param precision the value
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /**
         * Subscription-currency major units per credit: the money billed, before tax, for each
         * credit the customer's balance in the unit does not cover.
         *
         * @param rate the value
         * @return this builder
         */
        public Builder rate(BigDecimal rate) {
            this.rate = rate;
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
         * The {@code FeeCreditUnit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public FeeCreditUnit build() {
            Utils.checkRequired(code, "code");
            Utils.checkRequired(creditUnitId, "credit_unit_id");
            Utils.checkRequired(precision, "precision");
            Utils.checkRequired(rate, "rate");
            return new FeeCreditUnit(this);
        }
    }

    /**
     * Parse {@code json} as {@code FeeCreditUnit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static FeeCreditUnit fromJson(String json) {
        return Utils.parse(json, FeeCreditUnit.class);
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
