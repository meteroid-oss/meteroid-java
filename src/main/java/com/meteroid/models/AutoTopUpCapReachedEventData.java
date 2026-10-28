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

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A spending cap stopped an automatic top-up.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class AutoTopUpCapReachedEventData {
    @JsonProperty("attempted_amount")
    private Long attemptedAmount;

    @JsonProperty("cap")
    private Long cap;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("period")
    private String period;

    @JsonProperty("period_end")
    private OffsetDateTime periodEnd;

    @JsonProperty("period_start")
    private OffsetDateTime periodStart;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private AutoTopUpCapReachedEventData() {}

    private AutoTopUpCapReachedEventData(Builder builder) {
        this.attemptedAmount = builder.attemptedAmount;
        this.cap = builder.cap;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.period = builder.period;
        this.periodEnd = builder.periodEnd;
        this.periodStart = builder.periodStart;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code AutoTopUpCapReachedEventData}.
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
        builder.attemptedAmount = attemptedAmount;
        builder.cap = cap;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.period = period;
        builder.periodEnd = periodEnd;
        builder.periodStart = periodStart;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * What the suppressed top-up would have charged, tax included once it was quoted (before tax
     * when the cap stopped it before then). Caps are always money: for a credit unit wallet, <code>
     * currency</code> is the customer's currency.
     *
     * @return the value, never null
     */
    public Long attemptedAmount() {
        return Utils.required(attemptedAmount, "attempted_amount");
    }

    /**
     * The cap, tax included, in minor units of <code>currency</code>.
     *
     * @return the value, never null
     */
    public Long cap() {
        return Utils.required(cap, "cap");
    }

    /**
     * The currency the cap and the charge are in (ISO 4217).
     *
     * @return the value, never null
     */
    public String currency() {
        return Utils.required(currency, "currency");
    }

    /**
     * The {@code customer_id} property.
     *
     * @return the value, never null
     */
    public String customerId() {
        return Utils.required(customerId, "customer_id");
    }

    /**
     * <code>DAILY</code> (rolling day) or <code>MONTHLY</code> (calendar month, UTC).
     *
     * @return the value, never null
     */
    public String period() {
        return Utils.required(period, "period");
    }

    /**
     * End of the capped period.
     *
     * @return the value, never null
     */
    public OffsetDateTime periodEnd() {
        return Utils.required(periodEnd, "period_end");
    }

    /**
     * Start of the capped period.
     *
     * @return the value, never null
     */
    public OffsetDateTime periodStart() {
        return Utils.required(periodStart, "period_start");
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
        AutoTopUpCapReachedEventData that = (AutoTopUpCapReachedEventData) o;
        return Objects.equals(attemptedAmount, that.attemptedAmount)
                && Objects.equals(cap, that.cap)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(period, that.period)
                && Objects.equals(periodEnd, that.periodEnd)
                && Objects.equals(periodStart, that.periodStart)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attemptedAmount,
                cap,
                currency,
                customerId,
                period,
                periodEnd,
                periodStart,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AutoTopUpCapReachedEventData{"
                + "attemptedAmount="
                + attemptedAmount
                + ", cap="
                + cap
                + ", currency="
                + currency
                + ", customerId="
                + customerId
                + ", period="
                + period
                + ", periodEnd="
                + periodEnd
                + ", periodStart="
                + periodStart
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link AutoTopUpCapReachedEventData}. */
    public static final class Builder {
        private Long attemptedAmount;
        private Long cap;
        private String currency;
        private String customerId;
        private String period;
        private OffsetDateTime periodEnd;
        private OffsetDateTime periodStart;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * What the suppressed top-up would have charged, tax included once it was quoted (before
         * tax when the cap stopped it before then). Caps are always money: for a credit unit
         * wallet, <code>currency</code> is the customer's currency.
         *
         * @param attemptedAmount the value
         * @return this builder
         */
        public Builder attemptedAmount(Long attemptedAmount) {
            this.attemptedAmount = attemptedAmount;
            return this;
        }

        /**
         * The cap, tax included, in minor units of <code>currency</code>.
         *
         * @param cap the value
         * @return this builder
         */
        public Builder cap(Long cap) {
            this.cap = cap;
            return this;
        }

        /**
         * The currency the cap and the charge are in (ISO 4217).
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The {@code customer_id} property.
         *
         * @param customerId the value
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * <code>DAILY</code> (rolling day) or <code>MONTHLY</code> (calendar month, UTC).
         *
         * @param period the value
         * @return this builder
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * End of the capped period.
         *
         * @param periodEnd the value
         * @return this builder
         */
        public Builder periodEnd(OffsetDateTime periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }

        /**
         * Start of the capped period.
         *
         * @param periodStart the value
         * @return this builder
         */
        public Builder periodStart(OffsetDateTime periodStart) {
            this.periodStart = periodStart;
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
         * The {@code AutoTopUpCapReachedEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public AutoTopUpCapReachedEventData build() {
            Utils.checkRequired(attemptedAmount, "attempted_amount");
            Utils.checkRequired(cap, "cap");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(period, "period");
            Utils.checkRequired(periodEnd, "period_end");
            Utils.checkRequired(periodStart, "period_start");
            return new AutoTopUpCapReachedEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code AutoTopUpCapReachedEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static AutoTopUpCapReachedEventData fromJson(String json) {
        return Utils.parse(json, AutoTopUpCapReachedEventData.class);
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
