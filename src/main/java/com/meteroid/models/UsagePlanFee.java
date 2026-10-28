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
 * Usage-based fee
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class UsagePlanFee {
    @JsonProperty("cadence")
    private BillingPeriodEnum cadence;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<PlanFeeCreditUnit> creditUnit = JsonField.missing();

    @JsonProperty("metric_id")
    private String metricId;

    @JsonProperty("pricing")
    private PlanUsagePricingModel pricing;

    @JsonProperty("type")
    private String type = "USAGE";

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UsagePlanFee() {}

    private UsagePlanFee(Builder builder) {
        this.cadence = builder.cadence;
        this.creditUnit = builder.creditUnit;
        this.metricId = builder.metricId;
        this.pricing = builder.pricing;
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UsagePlanFee}.
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
        builder.cadence = cadence;
        builder.creditUnit = creditUnit;
        builder.metricId = metricId;
        builder.pricing = pricing;
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code cadence} property.
     *
     * @return the value, never null
     */
    public BillingPeriodEnum cadence() {
        return Utils.required(cadence, "cadence");
    }

    /**
     * The {@code credit_unit} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<PlanFeeCreditUnit> creditUnit() {
        return creditUnit.asOptional();
    }

    /**
     * The {@code metric_id} property.
     *
     * @return the value, never null
     */
    public String metricId() {
        return Utils.required(metricId, "metric_id");
    }

    /**
     * The {@code pricing} property.
     *
     * @return the value, never null
     */
    public PlanUsagePricingModel pricing() {
        return Utils.required(pricing, "pricing");
    }

    /**
     * The {@code type} property.
     *
     * @return the value, never null
     */
    public String type() {
        return Utils.required(type, "type");
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
        UsagePlanFee that = (UsagePlanFee) o;
        return Objects.equals(cadence, that.cadence)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(metricId, that.metricId)
                && Objects.equals(pricing, that.pricing)
                && Objects.equals(type, that.type)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadence, creditUnit, metricId, pricing, type, additionalProperties);
    }

    @Override
    public String toString() {
        return "UsagePlanFee{"
                + "cadence="
                + cadence
                + ", creditUnit="
                + creditUnit
                + ", metricId="
                + metricId
                + ", pricing="
                + pricing
                + ", type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link UsagePlanFee}. */
    public static final class Builder {
        private BillingPeriodEnum cadence;
        private JsonField<PlanFeeCreditUnit> creditUnit = JsonField.missing();
        private String metricId;
        private PlanUsagePricingModel pricing;
        private String type = "USAGE";
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code cadence} property.
         *
         * @param cadence the value
         * @return this builder
         */
        public Builder cadence(BillingPeriodEnum cadence) {
            this.cadence = cadence;
            return this;
        }

        /**
         * The {@code credit_unit} property.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(PlanFeeCreditUnit creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
            return this;
        }

        /**
         * The {@code metric_id} property.
         *
         * @param metricId the value
         * @return this builder
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * The {@code pricing} property.
         *
         * @param pricing the value
         * @return this builder
         */
        public Builder pricing(PlanUsagePricingModel pricing) {
            this.pricing = pricing;
            return this;
        }

        /**
         * The {@code type} property.
         *
         * @param type the value
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * The {@code UsagePlanFee}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UsagePlanFee build() {
            Utils.checkRequired(cadence, "cadence");
            Utils.checkRequired(metricId, "metric_id");
            Utils.checkRequired(pricing, "pricing");
            Utils.checkRequired(type, "type");
            return new UsagePlanFee(this);
        }
    }

    /**
     * Parse {@code json} as {@code UsagePlanFee}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UsagePlanFee fromJson(String json) {
        return Utils.parse(json, UsagePlanFee.class);
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
