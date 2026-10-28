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
 * Automatic top-up of the credit that applies to ALL charges: it charges the customer's payment
 * method when the balance falls below <code>threshold</code>.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class AutoTopUp {
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> amount = JsonField.missing();

    @JsonProperty("customer_consent_attested_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> customerConsentAttestedAt = JsonField.missing();

    @JsonProperty("daily_cap")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> dailyCap = JsonField.missing();

    @JsonProperty("last_error")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> lastError = JsonField.missing();

    @JsonProperty("last_succeeded_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> lastSucceededAt = JsonField.missing();

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

    @JsonProperty("status")
    private AutoTopUpStatus status;

    @JsonProperty("suspended_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> suspendedAt = JsonField.missing();

    @JsonProperty("target")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> target = JsonField.missing();

    @JsonProperty("threshold")
    private Long threshold;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private AutoTopUp() {}

    private AutoTopUp(Builder builder) {
        this.amount = builder.amount;
        this.customerConsentAttestedAt = builder.customerConsentAttestedAt;
        this.dailyCap = builder.dailyCap;
        this.lastError = builder.lastError;
        this.lastSucceededAt = builder.lastSucceededAt;
        this.maximum = builder.maximum;
        this.method = builder.method;
        this.minimum = builder.minimum;
        this.monthlyCap = builder.monthlyCap;
        this.paymentMethodId = builder.paymentMethodId;
        this.status = builder.status;
        this.suspendedAt = builder.suspendedAt;
        this.target = builder.target;
        this.threshold = builder.threshold;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code AutoTopUp}.
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
        builder.customerConsentAttestedAt = customerConsentAttestedAt;
        builder.dailyCap = dailyCap;
        builder.lastError = lastError;
        builder.lastSucceededAt = lastSucceededAt;
        builder.maximum = maximum;
        builder.method = method;
        builder.minimum = minimum;
        builder.monthlyCap = monthlyCap;
        builder.paymentMethodId = paymentMethodId;
        builder.status = status;
        builder.suspendedAt = suspendedAt;
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
     * When an operator attested that the customer agreed to automatic charges on exactly these
     * terms. Absent when the customer confirmed them in their portal, or the terms changed since.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> customerConsentAttestedAt() {
        return customerConsentAttestedAt.asOptional();
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
     * Why the last charge failed; may carry payment provider detail.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> lastError() {
        return lastError.asOptional();
    }

    /**
     * The last charge that succeeded.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> lastSucceededAt() {
        return lastSucceededAt.asOptional();
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
     * Absent charges the customer's default payment method.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> paymentMethodId() {
        return paymentMethodId.asOptional();
    }

    /**
     * ACTIVE, DISABLED (terms kept) or SUSPENDED after repeated failed charges.
     *
     * @return the value, never null
     */
    public AutoTopUpStatus status() {
        return Utils.required(status, "status");
    }

    /**
     * Set while SUSPENDED: since when.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> suspendedAt() {
        return suspendedAt.asOptional();
    }

    /**
     * TO_TARGET only: the balance a top-up brings the wallet back to, in minor units.
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
        AutoTopUp that = (AutoTopUp) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(customerConsentAttestedAt, that.customerConsentAttestedAt)
                && Objects.equals(dailyCap, that.dailyCap)
                && Objects.equals(lastError, that.lastError)
                && Objects.equals(lastSucceededAt, that.lastSucceededAt)
                && Objects.equals(maximum, that.maximum)
                && Objects.equals(method, that.method)
                && Objects.equals(minimum, that.minimum)
                && Objects.equals(monthlyCap, that.monthlyCap)
                && Objects.equals(paymentMethodId, that.paymentMethodId)
                && Objects.equals(status, that.status)
                && Objects.equals(suspendedAt, that.suspendedAt)
                && Objects.equals(target, that.target)
                && Objects.equals(threshold, that.threshold)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                customerConsentAttestedAt,
                dailyCap,
                lastError,
                lastSucceededAt,
                maximum,
                method,
                minimum,
                monthlyCap,
                paymentMethodId,
                status,
                suspendedAt,
                target,
                threshold,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AutoTopUp{"
                + "amount="
                + amount
                + ", customerConsentAttestedAt="
                + customerConsentAttestedAt
                + ", dailyCap="
                + dailyCap
                + ", lastError="
                + lastError
                + ", lastSucceededAt="
                + lastSucceededAt
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
                + ", status="
                + status
                + ", suspendedAt="
                + suspendedAt
                + ", target="
                + target
                + ", threshold="
                + threshold
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link AutoTopUp}. */
    public static final class Builder {
        private JsonField<Long> amount = JsonField.missing();
        private JsonField<OffsetDateTime> customerConsentAttestedAt = JsonField.missing();
        private JsonField<Long> dailyCap = JsonField.missing();
        private JsonField<String> lastError = JsonField.missing();
        private JsonField<OffsetDateTime> lastSucceededAt = JsonField.missing();
        private JsonField<Long> maximum = JsonField.missing();
        private AutoTopUpMethod method;
        private JsonField<Long> minimum = JsonField.missing();
        private JsonField<Long> monthlyCap = JsonField.missing();
        private JsonField<String> paymentMethodId = JsonField.missing();
        private AutoTopUpStatus status;
        private JsonField<OffsetDateTime> suspendedAt = JsonField.missing();
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
         * When an operator attested that the customer agreed to automatic charges on exactly these
         * terms. Absent when the customer confirmed them in their portal, or the terms changed
         * since.
         *
         * @param customerConsentAttestedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder customerConsentAttestedAt(OffsetDateTime customerConsentAttestedAt) {
            this.customerConsentAttestedAt = JsonField.ofNullable(customerConsentAttestedAt);
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
         * Why the last charge failed; may carry payment provider detail.
         *
         * @param lastError the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastError(String lastError) {
            this.lastError = JsonField.ofNullable(lastError);
            return this;
        }

        /**
         * The last charge that succeeded.
         *
         * @param lastSucceededAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lastSucceededAt(OffsetDateTime lastSucceededAt) {
            this.lastSucceededAt = JsonField.ofNullable(lastSucceededAt);
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
         * Absent charges the customer's default payment method.
         *
         * @param paymentMethodId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = JsonField.ofNullable(paymentMethodId);
            return this;
        }

        /**
         * ACTIVE, DISABLED (terms kept) or SUSPENDED after repeated failed charges.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(AutoTopUpStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Set while SUSPENDED: since when.
         *
         * @param suspendedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder suspendedAt(OffsetDateTime suspendedAt) {
            this.suspendedAt = JsonField.ofNullable(suspendedAt);
            return this;
        }

        /**
         * TO_TARGET only: the balance a top-up brings the wallet back to, in minor units.
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
         * The {@code AutoTopUp}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public AutoTopUp build() {
            Utils.checkRequired(method, "method");
            Utils.checkRequired(status, "status");
            Utils.checkRequired(threshold, "threshold");
            return new AutoTopUp(this);
        }
    }

    /**
     * Parse {@code json} as {@code AutoTopUp}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static AutoTopUp fromJson(String json) {
        return Utils.parse(json, AutoTopUp.class);
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
