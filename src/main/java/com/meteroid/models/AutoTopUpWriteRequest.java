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
 * An automatic top-up's terms, replaced as a whole. FIXED needs <code>amount</code> and no <code>
 * target</code>; TO_TARGET needs <code>target</code> above <code>threshold</code> and no <code>
 * amount</code>; amounts are positive.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class AutoTopUpWriteRequest {
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> amount = JsonField.missing();

    @JsonProperty("at_current_price")
    private Boolean atCurrentPrice;

    @JsonProperty("customer_consent_attested")
    private Boolean customerConsentAttested;

    @JsonProperty("daily_cap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> dailyCap = JsonField.missing();

    @JsonProperty("maximum")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> maximum = JsonField.missing();

    @JsonProperty("method")
    private AutoTopUpMethod method;

    @JsonProperty("minimum")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> minimum = JsonField.missing();

    @JsonProperty("monthly_cap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> monthlyCap = JsonField.missing();

    @JsonProperty("payment_method_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> paymentMethodId = JsonField.missing();

    @JsonProperty("target")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> target = JsonField.missing();

    @JsonProperty("threshold")
    private Long threshold;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private AutoTopUpWriteRequest() {}

    private AutoTopUpWriteRequest(Builder builder) {
        this.amount = builder.amount;
        this.atCurrentPrice = builder.atCurrentPrice;
        this.customerConsentAttested = builder.customerConsentAttested;
        this.dailyCap = builder.dailyCap;
        this.maximum = builder.maximum;
        this.method = builder.method;
        this.minimum = builder.minimum;
        this.monthlyCap = builder.monthlyCap;
        this.paymentMethodId = builder.paymentMethodId;
        this.target = builder.target;
        this.threshold = builder.threshold;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code AutoTopUpWriteRequest}.
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
        builder.atCurrentPrice = atCurrentPrice;
        builder.customerConsentAttested = customerConsentAttested;
        builder.dailyCap = dailyCap;
        builder.maximum = maximum;
        builder.method = method;
        builder.minimum = minimum;
        builder.monthlyCap = monthlyCap;
        builder.paymentMethodId = paymentMethodId;
        builder.target = target;
        builder.threshold = threshold;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * FIXED only: credit bought each time, in minor units of the wallet.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> amount() {
        return amount.asOptional();
    }

    /**
     * Credit unit wallets: authorize today's price per credit for these terms, which lifts a stop
     * caused by a price increase. When false (the default) the terms keep the price they were
     * authorized at, and a rule stopped by a price increase stays stopped. A price at or below the
     * authorized one never stops the rule: top-ups charge it.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> atCurrentPrice() {
        return Optional.ofNullable(atCurrentPrice);
    }

    /**
     * Attests that the customer agreed to automatic charges on these terms; recorded with the API
     * key and the time. Required (true) when the terms turn automatic top-up on, including one the
     * customer turned off, or change what it charges. Not needed to resend the stored terms
     * unchanged, nor to change terms the customer confirmed in their portal: those stop until the
     * customer confirms the new ones.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> customerConsentAttested() {
        return Optional.ofNullable(customerConsentAttested);
    }

    /**
     * Most charged in a rolling day, tax included. For a credit unit wallet caps are money, in
     * minor units of the customer's currency.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> dailyCap() {
        return dailyCap.asOptional();
    }

    /**
     * Largest single charge, in the same money as <code>minimum</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> maximum() {
        return maximum.asOptional();
    }

    /**
     * FIXED buys <code>amount</code> each time; TO_TARGET buys back up to <code>target</code>.
     *
     * @return the value, never null
     */
    public AutoTopUpMethod method() {
        return Utils.required(method, "method");
    }

    /**
     * Smallest single charge. For a credit unit wallet it is money (the price before tax, in minor
     * units of the customer's currency), like the caps; the threshold, amount and target are
     * credits.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> minimum() {
        return minimum.asOptional();
    }

    /**
     * Most charged in a calendar month (UTC), tax included.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> monthlyCap() {
        return monthlyCap.asOptional();
    }

    /**
     * Defaults to the customer's default payment method: the customer's agreement, and your
     * attestation of it, then cover whichever method is their default at each top-up.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> paymentMethodId() {
        return paymentMethodId.asOptional();
    }

    /**
     * TO_TARGET only: the balance a top-up brings the wallet back to; must exceed <code>threshold
     * </code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> target() {
        return target.asOptional();
    }

    /**
     * Tops up once the balance is at or below this, in minor units of the wallet.
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
        AutoTopUpWriteRequest that = (AutoTopUpWriteRequest) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(atCurrentPrice, that.atCurrentPrice)
                && Objects.equals(customerConsentAttested, that.customerConsentAttested)
                && Objects.equals(dailyCap, that.dailyCap)
                && Objects.equals(maximum, that.maximum)
                && Objects.equals(method, that.method)
                && Objects.equals(minimum, that.minimum)
                && Objects.equals(monthlyCap, that.monthlyCap)
                && Objects.equals(paymentMethodId, that.paymentMethodId)
                && Objects.equals(target, that.target)
                && Objects.equals(threshold, that.threshold)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                atCurrentPrice,
                customerConsentAttested,
                dailyCap,
                maximum,
                method,
                minimum,
                monthlyCap,
                paymentMethodId,
                target,
                threshold,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AutoTopUpWriteRequest{"
                + "amount="
                + amount
                + ", atCurrentPrice="
                + atCurrentPrice
                + ", customerConsentAttested="
                + customerConsentAttested
                + ", dailyCap="
                + dailyCap
                + ", maximum="
                + maximum
                + ", method="
                + method
                + ", minimum="
                + minimum
                + ", monthlyCap="
                + monthlyCap
                + ", paymentMethodId="
                + paymentMethodId
                + ", target="
                + target
                + ", threshold="
                + threshold
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link AutoTopUpWriteRequest}. */
    public static final class Builder {
        private JsonField<Long> amount = JsonField.missing();
        private Boolean atCurrentPrice;
        private Boolean customerConsentAttested;
        private JsonField<Long> dailyCap = JsonField.missing();
        private JsonField<Long> maximum = JsonField.missing();
        private AutoTopUpMethod method;
        private JsonField<Long> minimum = JsonField.missing();
        private JsonField<Long> monthlyCap = JsonField.missing();
        private JsonField<String> paymentMethodId = JsonField.missing();
        private JsonField<Long> target = JsonField.missing();
        private Long threshold;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * FIXED only: credit bought each time, in minor units of the wallet.
         *
         * @param amount the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = JsonField.ofNullable(amount);
            return this;
        }

        /**
         * Credit unit wallets: authorize today's price per credit for these terms, which lifts a
         * stop caused by a price increase. When false (the default) the terms keep the price they
         * were authorized at, and a rule stopped by a price increase stays stopped. A price at or
         * below the authorized one never stops the rule: top-ups charge it.
         *
         * @param atCurrentPrice the value
         * @return this builder
         */
        public Builder atCurrentPrice(Boolean atCurrentPrice) {
            this.atCurrentPrice = atCurrentPrice;
            return this;
        }

        /**
         * Attests that the customer agreed to automatic charges on these terms; recorded with the
         * API key and the time. Required (true) when the terms turn automatic top-up on, including
         * one the customer turned off, or change what it charges. Not needed to resend the stored
         * terms unchanged, nor to change terms the customer confirmed in their portal: those stop
         * until the customer confirms the new ones.
         *
         * @param customerConsentAttested the value
         * @return this builder
         */
        public Builder customerConsentAttested(Boolean customerConsentAttested) {
            this.customerConsentAttested = customerConsentAttested;
            return this;
        }

        /**
         * Most charged in a rolling day, tax included. For a credit unit wallet caps are money, in
         * minor units of the customer's currency.
         *
         * @param dailyCap the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder dailyCap(Long dailyCap) {
            this.dailyCap = JsonField.ofNullable(dailyCap);
            return this;
        }

        /**
         * Largest single charge, in the same money as <code>minimum</code>.
         *
         * @param maximum the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder maximum(Long maximum) {
            this.maximum = JsonField.ofNullable(maximum);
            return this;
        }

        /**
         * FIXED buys <code>amount</code> each time; TO_TARGET buys back up to <code>target</code>.
         *
         * @param method the value
         * @return this builder
         */
        public Builder method(AutoTopUpMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Smallest single charge. For a credit unit wallet it is money (the price before tax, in
         * minor units of the customer's currency), like the caps; the threshold, amount and target
         * are credits.
         *
         * @param minimum the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder minimum(Long minimum) {
            this.minimum = JsonField.ofNullable(minimum);
            return this;
        }

        /**
         * Most charged in a calendar month (UTC), tax included.
         *
         * @param monthlyCap the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder monthlyCap(Long monthlyCap) {
            this.monthlyCap = JsonField.ofNullable(monthlyCap);
            return this;
        }

        /**
         * Defaults to the customer's default payment method: the customer's agreement, and your
         * attestation of it, then cover whichever method is their default at each top-up.
         *
         * @param paymentMethodId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = JsonField.ofNullable(paymentMethodId);
            return this;
        }

        /**
         * TO_TARGET only: the balance a top-up brings the wallet back to; must exceed <code>
         * threshold</code>.
         *
         * @param target the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder target(Long target) {
            this.target = JsonField.ofNullable(target);
            return this;
        }

        /**
         * Tops up once the balance is at or below this, in minor units of the wallet.
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
         * The {@code AutoTopUpWriteRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public AutoTopUpWriteRequest build() {
            Utils.checkRequired(method, "method");
            Utils.checkRequired(threshold, "threshold");
            return new AutoTopUpWriteRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code AutoTopUpWriteRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static AutoTopUpWriteRequest fromJson(String json) {
        return Utils.parse(json, AutoTopUpWriteRequest.class);
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
