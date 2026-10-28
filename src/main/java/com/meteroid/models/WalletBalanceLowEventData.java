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
 * A wallet's balance fell below one of its low-balance thresholds.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WalletBalanceLowEventData {
    @JsonProperty("balance")
    private Long balance;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> currency = JsonField.missing();

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("shared_balance")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> sharedBalance = JsonField.missing();

    @JsonProperty("threshold")
    private Long threshold;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WalletBalanceLowEventData() {}

    private WalletBalanceLowEventData(Builder builder) {
        this.balance = builder.balance;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.sharedBalance = builder.sharedBalance;
        this.threshold = builder.threshold;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WalletBalanceLowEventData}.
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
        builder.balance = balance;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.sharedBalance = sharedBalance;
        builder.threshold = threshold;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The balance when it fell below <code>threshold</code>, in minor units: the wallet's <code>
     * balance</code>, all its credit on account net of the unbilled usage it pays, including credit
     * that belongs to a subscription or is limited to usage or products. Sent once per crossing,
     * for the lowest threshold crossed; it re-arms once the balance is back at the threshold.
     * Because that credit counts here and not in <code>wallet.depleted</code>, a wallet can be
     * depleted without this event firing.
     *
     * @return the value, never null
     */
    public Long balance() {
        return Utils.required(balance, "balance");
    }

    /**
     * The credit unit (its code) the amounts are in; absent for a currency.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnit() {
        return creditUnit.asOptional();
    }

    /**
     * Decimal places of <code>credit_unit</code>: amounts are integers of 10^-precision credit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> creditUnitPrecision() {
        return creditUnitPrecision.asOptional();
    }

    /**
     * Absent when the amounts are in a credit unit.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> currency() {
        return currency.asOptional();
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
     * The part of <code>balance</code> that pays any charge of any subscription: what automatic
     * top-ups refill and <code>wallet.depleted</code> watches. Absent on events recorded before it
     * was reported.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> sharedBalance() {
        return sharedBalance.asOptional();
    }

    /**
     * The low-balance threshold crossed, in the same minor units.
     *
     * @return the value, never null
     */
    public Long threshold() {
        return Utils.required(threshold, "threshold");
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
        WalletBalanceLowEventData that = (WalletBalanceLowEventData) o;
        return Objects.equals(balance, that.balance)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(sharedBalance, that.sharedBalance)
                && Objects.equals(threshold, that.threshold)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                balance,
                creditUnit,
                creditUnitPrecision,
                currency,
                customerId,
                sharedBalance,
                threshold,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WalletBalanceLowEventData{"
                + "balance="
                + balance
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", currency="
                + currency
                + ", customerId="
                + customerId
                + ", sharedBalance="
                + sharedBalance
                + ", threshold="
                + threshold
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WalletBalanceLowEventData}. */
    public static final class Builder {
        private Long balance;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<String> currency = JsonField.missing();
        private String customerId;
        private JsonField<Long> sharedBalance = JsonField.missing();
        private Long threshold;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The balance when it fell below <code>threshold</code>, in minor units: the wallet's
         * <code>balance</code>, all its credit on account net of the unbilled usage it pays,
         * including credit that belongs to a subscription or is limited to usage or products. Sent
         * once per crossing, for the lowest threshold crossed; it re-arms once the balance is back
         * at the threshold. Because that credit counts here and not in <code>wallet.depleted</code>
         * , a wallet can be depleted without this event firing.
         *
         * @param balance the value
         * @return this builder
         */
        public Builder balance(Long balance) {
            this.balance = balance;
            return this;
        }

        /**
         * The credit unit (its code) the amounts are in; absent for a currency.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
            return this;
        }

        /**
         * Decimal places of <code>credit_unit</code>: amounts are integers of 10^-precision credit.
         *
         * @param creditUnitPrecision the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnitPrecision(Integer creditUnitPrecision) {
            this.creditUnitPrecision = JsonField.ofNullable(creditUnitPrecision);
            return this;
        }

        /**
         * Absent when the amounts are in a credit unit.
         *
         * @param currency the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = JsonField.ofNullable(currency);
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
         * The part of <code>balance</code> that pays any charge of any subscription: what automatic
         * top-ups refill and <code>wallet.depleted</code> watches. Absent on events recorded before
         * it was reported.
         *
         * @param sharedBalance the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder sharedBalance(Long sharedBalance) {
            this.sharedBalance = JsonField.ofNullable(sharedBalance);
            return this;
        }

        /**
         * The low-balance threshold crossed, in the same minor units.
         *
         * @param threshold the value
         * @return this builder
         */
        public Builder threshold(Long threshold) {
            this.threshold = threshold;
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
         * The {@code WalletBalanceLowEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WalletBalanceLowEventData build() {
            Utils.checkRequired(balance, "balance");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(threshold, "threshold");
            return new WalletBalanceLowEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code WalletBalanceLowEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WalletBalanceLowEventData fromJson(String json) {
        return Utils.parse(json, WalletBalanceLowEventData.class);
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
