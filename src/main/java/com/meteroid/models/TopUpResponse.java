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
 * Where a top-up stands. Its credit is granted once it is paid; <code>wallet.funded</code> reports
 * it.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class TopUpResponse {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("charged_amount")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> chargedAmount = JsonField.missing();

    @JsonProperty("checkout_url")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> checkoutUrl = JsonField.missing();

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("currency")
    private Currency currency;

    @JsonProperty("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> invoiceId = JsonField.missing();

    @JsonProperty("payment_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> paymentTransactionId = JsonField.missing();

    @JsonProperty("status")
    private TopUpStatus status;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private TopUpResponse() {}

    private TopUpResponse(Builder builder) {
        this.amount = builder.amount;
        this.chargedAmount = builder.chargedAmount;
        this.checkoutUrl = builder.checkoutUrl;
        this.creditUnit = builder.creditUnit;
        this.currency = builder.currency;
        this.invoiceId = builder.invoiceId;
        this.paymentTransactionId = builder.paymentTransactionId;
        this.status = builder.status;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code TopUpResponse}.
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
        builder.chargedAmount = chargedAmount;
        builder.checkoutUrl = checkoutUrl;
        builder.creditUnit = creditUnit;
        builder.currency = currency;
        builder.invoiceId = invoiceId;
        builder.paymentTransactionId = paymentTransactionId;
        builder.status = status;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Credit bought, in minor units of <code>currency</code>, or of <code>credit_unit</code> when
     * set.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * Charged to the payment method, tax included, in minor units of <code>currency</code>; absent
     * until a charge is made.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> chargedAmount() {
        return chargedAmount.asOptional();
    }

    /**
     * Hosted page where the customer completes the payment; present while it awaits them.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> checkoutUrl() {
        return checkoutUrl.asOptional();
    }

    /**
     * Set when credits of this credit unit were bought: <code>amount</code> is in its minor units.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnit() {
        return creditUnit.asOptional();
    }

    /**
     * The money the top-up is charged in.
     *
     * @return the value, never null
     */
    public Currency currency() {
        return Utils.required(currency, "currency");
    }

    /**
     * The invoice documenting the purchase.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> invoiceId() {
        return invoiceId.asOptional();
    }

    /**
     * The charge made on the payment method; absent until a charge is made.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> paymentTransactionId() {
        return paymentTransactionId.asOptional();
    }

    /**
     * SUCCEEDED once paid; otherwise what the payment is waiting for.
     *
     * @return the value, never null
     */
    public TopUpStatus status() {
        return Utils.required(status, "status");
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
        TopUpResponse that = (TopUpResponse) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(chargedAmount, that.chargedAmount)
                && Objects.equals(checkoutUrl, that.checkoutUrl)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(currency, that.currency)
                && Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(paymentTransactionId, that.paymentTransactionId)
                && Objects.equals(status, that.status)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                chargedAmount,
                checkoutUrl,
                creditUnit,
                currency,
                invoiceId,
                paymentTransactionId,
                status,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "TopUpResponse{"
                + "amount="
                + amount
                + ", chargedAmount="
                + chargedAmount
                + ", checkoutUrl="
                + checkoutUrl
                + ", creditUnit="
                + creditUnit
                + ", currency="
                + currency
                + ", invoiceId="
                + invoiceId
                + ", paymentTransactionId="
                + paymentTransactionId
                + ", status="
                + status
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link TopUpResponse}. */
    public static final class Builder {
        private Long amount;
        private JsonField<Long> chargedAmount = JsonField.missing();
        private JsonField<String> checkoutUrl = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private Currency currency;
        private JsonField<String> invoiceId = JsonField.missing();
        private JsonField<String> paymentTransactionId = JsonField.missing();
        private TopUpStatus status;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Credit bought, in minor units of <code>currency</code>, or of <code>credit_unit</code>
         * when set.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Charged to the payment method, tax included, in minor units of <code>currency</code>;
         * absent until a charge is made.
         *
         * @param chargedAmount the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder chargedAmount(Long chargedAmount) {
            this.chargedAmount = JsonField.ofNullable(chargedAmount);
            return this;
        }

        /**
         * Hosted page where the customer completes the payment; present while it awaits them.
         *
         * @param checkoutUrl the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder checkoutUrl(String checkoutUrl) {
            this.checkoutUrl = JsonField.ofNullable(checkoutUrl);
            return this;
        }

        /**
         * Set when credits of this credit unit were bought: <code>amount</code> is in its minor
         * units.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
            return this;
        }

        /**
         * The money the top-up is charged in.
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The invoice documenting the purchase.
         *
         * @param invoiceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = JsonField.ofNullable(invoiceId);
            return this;
        }

        /**
         * The charge made on the payment method; absent until a charge is made.
         *
         * @param paymentTransactionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentTransactionId(String paymentTransactionId) {
            this.paymentTransactionId = JsonField.ofNullable(paymentTransactionId);
            return this;
        }

        /**
         * SUCCEEDED once paid; otherwise what the payment is waiting for.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(TopUpStatus status) {
            this.status = status;
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
         * The {@code TopUpResponse}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public TopUpResponse build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(status, "status");
            return new TopUpResponse(this);
        }
    }

    /**
     * Parse {@code json} as {@code TopUpResponse}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static TopUpResponse fromJson(String json) {
        return Utils.parse(json, TopUpResponse.class);
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
