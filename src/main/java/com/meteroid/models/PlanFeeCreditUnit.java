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
 * The credit unit a plan's usage price is expressed in, with its value in the plan currency.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class PlanFeeCreditUnit {
    @JsonProperty("credit_unit_id")
    private String creditUnitId;

    @JsonProperty("rate")
    private BigDecimal rate;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private PlanFeeCreditUnit() {}

    private PlanFeeCreditUnit(Builder builder) {
        this.creditUnitId = builder.creditUnitId;
        this.rate = builder.rate;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code PlanFeeCreditUnit}.
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
        builder.creditUnitId = creditUnitId;
        builder.rate = rate;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * An active credit unit of the tenant (<code>GET /api/v1/credit-units</code>).
     *
     * @return the value, never null
     */
    public String creditUnitId() {
        return Utils.required(creditUnitId, "credit_unit_id");
    }

    /**
     * Plan-currency major units per credit (e.g. "0.01"), positive: the money billed for each
     * credit the customer's balance in the unit does not cover, before tax.
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
        PlanFeeCreditUnit that = (PlanFeeCreditUnit) o;
        return Objects.equals(creditUnitId, that.creditUnitId)
                && Objects.equals(rate, that.rate)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditUnitId, rate, additionalProperties);
    }

    @Override
    public String toString() {
        return "PlanFeeCreditUnit{"
                + "creditUnitId="
                + creditUnitId
                + ", rate="
                + rate
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link PlanFeeCreditUnit}. */
    public static final class Builder {
        private String creditUnitId;
        private BigDecimal rate;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * An active credit unit of the tenant (<code>GET /api/v1/credit-units</code>).
         *
         * @param creditUnitId the value
         * @return this builder
         */
        public Builder creditUnitId(String creditUnitId) {
            this.creditUnitId = creditUnitId;
            return this;
        }

        /**
         * Plan-currency major units per credit (e.g. "0.01"), positive: the money billed for each
         * credit the customer's balance in the unit does not cover, before tax.
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
         * The {@code PlanFeeCreditUnit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public PlanFeeCreditUnit build() {
            Utils.checkRequired(creditUnitId, "credit_unit_id");
            Utils.checkRequired(rate, "rate");
            return new PlanFeeCreditUnit(this);
        }
    }

    /**
     * Parse {@code json} as {@code PlanFeeCreditUnit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static PlanFeeCreditUnit fromJson(String json) {
        return Utils.parse(json, PlanFeeCreditUnit.class);
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
