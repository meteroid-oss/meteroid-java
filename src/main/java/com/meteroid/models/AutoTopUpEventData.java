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

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * An automatic top-up charge failed, or the automatic top-up was suspended.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class AutoTopUpEventData {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("consecutive_failures")
    private Integer consecutiveFailures;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("error")
    private String error;

    @JsonProperty("suspended_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> suspendedAt = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private AutoTopUpEventData() {}

    private AutoTopUpEventData(Builder builder) {
        this.amount = builder.amount;
        this.consecutiveFailures = builder.consecutiveFailures;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.error = builder.error;
        this.suspendedAt = builder.suspendedAt;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code AutoTopUpEventData}.
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
        builder.consecutiveFailures = consecutiveFailures;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.error = error;
        builder.suspendedAt = suspendedAt;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The charge in minor units of <code>currency</code>: the credit it would have added, or for a
     * credit unit wallet the price of those credits in the customer's currency. When the credits
     * could not be priced (no selling price), the credits themselves, with <code>currency</code>
     * the unit code. On a suspension after a top-up payment was refunded or disputed: that
     * payment's top-up.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * Failed charges in a row, this one included.
     *
     * @return the value, never null
     */
    public Integer consecutiveFailures() {
        return Utils.required(consecutiveFailures, "consecutive_failures");
    }

    /**
     * The currency charged (ISO 4217), or the credit unit code when the credits had no price.
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
     * May carry payment provider detail.
     *
     * @return the value, never null
     */
    public String error() {
        return Utils.required(error, "error");
    }

    /**
     * Set on <code>wallet.auto_top_up_suspended</code>: when it was suspended.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> suspendedAt() {
        return suspendedAt.asOptional();
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
        AutoTopUpEventData that = (AutoTopUpEventData) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(consecutiveFailures, that.consecutiveFailures)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(error, that.error)
                && Objects.equals(suspendedAt, that.suspendedAt)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                consecutiveFailures,
                currency,
                customerId,
                error,
                suspendedAt,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AutoTopUpEventData{"
                + "amount="
                + amount
                + ", consecutiveFailures="
                + consecutiveFailures
                + ", currency="
                + currency
                + ", customerId="
                + customerId
                + ", error="
                + error
                + ", suspendedAt="
                + suspendedAt
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link AutoTopUpEventData}. */
    public static final class Builder {
        private Long amount;
        private Integer consecutiveFailures;
        private String currency;
        private String customerId;
        private String error;
        private JsonField<OffsetDateTime> suspendedAt = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The charge in minor units of <code>currency</code>: the credit it would have added, or
         * for a credit unit wallet the price of those credits in the customer's currency. When the
         * credits could not be priced (no selling price), the credits themselves, with <code>
         * currency</code> the unit code. On a suspension after a top-up payment was refunded or
         * disputed: that payment's top-up.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Failed charges in a row, this one included.
         *
         * @param consecutiveFailures the value
         * @return this builder
         */
        public Builder consecutiveFailures(Integer consecutiveFailures) {
            this.consecutiveFailures = consecutiveFailures;
            return this;
        }

        /**
         * The currency charged (ISO 4217), or the credit unit code when the credits had no price.
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
         * May carry payment provider detail.
         *
         * @param error the value
         * @return this builder
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * Set on <code>wallet.auto_top_up_suspended</code>: when it was suspended.
         *
         * @param suspendedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder suspendedAt(OffsetDateTime suspendedAt) {
            this.suspendedAt = JsonField.ofNullable(suspendedAt);
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
         * The {@code AutoTopUpEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public AutoTopUpEventData build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(consecutiveFailures, "consecutive_failures");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(error, "error");
            return new AutoTopUpEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code AutoTopUpEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static AutoTopUpEventData fromJson(String json) {
        return Utils.parse(json, AutoTopUpEventData.class);
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
