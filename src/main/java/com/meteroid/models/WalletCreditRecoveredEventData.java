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
 * Spent credit reported by <code>wallet.credit_unrecovered</code> is backed again.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WalletCreditRecoveredEventData {
    @JsonProperty("cause")
    private String cause;

    @JsonProperty("credit_note_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditNoteId = JsonField.missing();

    @JsonProperty("credit_recovered")
    private Long creditRecovered;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("credit_unrecovered_total")
    private Long creditUnrecoveredTotal;

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> currency = JsonField.missing();

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> invoiceId = JsonField.missing();

    @JsonProperty("payment_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> paymentId = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WalletCreditRecoveredEventData() {}

    private WalletCreditRecoveredEventData(Builder builder) {
        this.cause = builder.cause;
        this.creditNoteId = builder.creditNoteId;
        this.creditRecovered = builder.creditRecovered;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.creditUnrecoveredTotal = builder.creditUnrecoveredTotal;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.invoiceId = builder.invoiceId;
        this.paymentId = builder.paymentId;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WalletCreditRecoveredEventData}.
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
        builder.cause = cause;
        builder.creditNoteId = creditNoteId;
        builder.creditRecovered = creditRecovered;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.creditUnrecoveredTotal = creditUnrecoveredTotal;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.invoiceId = invoiceId;
        builder.paymentId = paymentId;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Cause of the loss this recovers: <code>PAYMENT_DISPUTED</code>, <code>PAYMENT_REVERSED</code>
     * , <code>PAYMENT_REFUNDED</code> or <code>CREDIT_NOTE_REFUNDED</code>.
     *
     * @return the value, never null
     */
    public String cause() {
        return Utils.required(cause, "cause");
    }

    /**
     * The {@code credit_note_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditNoteId() {
        return creditNoteId.asOptional();
    }

    /**
     * Spent credit an earlier <code>wallet.credit_unrecovered</code> reported that is backed again,
     * in minor units: the money came back, or the credit was returned and taken back.
     *
     * @return the value, never null
     */
    public Long creditRecovered() {
        return Utils.required(creditRecovered, "credit_recovered");
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
     * The loss of this money flow (an invoice's payments, a credit note, or a payment) once this
     * event applies.
     *
     * @return the value, never null
     */
    public Long creditUnrecoveredTotal() {
        return Utils.required(creditUnrecoveredTotal, "credit_unrecovered_total");
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
     * The {@code invoice_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> invoiceId() {
        return invoiceId.asOptional();
    }

    /**
     * The {@code payment_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> paymentId() {
        return paymentId.asOptional();
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
        WalletCreditRecoveredEventData that = (WalletCreditRecoveredEventData) o;
        return Objects.equals(cause, that.cause)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(creditRecovered, that.creditRecovered)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(creditUnrecoveredTotal, that.creditUnrecoveredTotal)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(paymentId, that.paymentId)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                cause,
                creditNoteId,
                creditRecovered,
                creditUnit,
                creditUnitPrecision,
                creditUnrecoveredTotal,
                currency,
                customerId,
                invoiceId,
                paymentId,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WalletCreditRecoveredEventData{"
                + "cause="
                + cause
                + ", creditNoteId="
                + creditNoteId
                + ", creditRecovered="
                + creditRecovered
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", creditUnrecoveredTotal="
                + creditUnrecoveredTotal
                + ", currency="
                + currency
                + ", customerId="
                + customerId
                + ", invoiceId="
                + invoiceId
                + ", paymentId="
                + paymentId
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WalletCreditRecoveredEventData}. */
    public static final class Builder {
        private String cause;
        private JsonField<String> creditNoteId = JsonField.missing();
        private Long creditRecovered;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private Long creditUnrecoveredTotal;
        private JsonField<String> currency = JsonField.missing();
        private String customerId;
        private JsonField<String> invoiceId = JsonField.missing();
        private JsonField<String> paymentId = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Cause of the loss this recovers: <code>PAYMENT_DISPUTED</code>, <code>PAYMENT_REVERSED
         * </code>, <code>PAYMENT_REFUNDED</code> or <code>CREDIT_NOTE_REFUNDED</code>.
         *
         * @param cause the value
         * @return this builder
         */
        public Builder cause(String cause) {
            this.cause = cause;
            return this;
        }

        /**
         * The {@code credit_note_id} property.
         *
         * @param creditNoteId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditNoteId(String creditNoteId) {
            this.creditNoteId = JsonField.ofNullable(creditNoteId);
            return this;
        }

        /**
         * Spent credit an earlier <code>wallet.credit_unrecovered</code> reported that is backed
         * again, in minor units: the money came back, or the credit was returned and taken back.
         *
         * @param creditRecovered the value
         * @return this builder
         */
        public Builder creditRecovered(Long creditRecovered) {
            this.creditRecovered = creditRecovered;
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
         * The loss of this money flow (an invoice's payments, a credit note, or a payment) once
         * this event applies.
         *
         * @param creditUnrecoveredTotal the value
         * @return this builder
         */
        public Builder creditUnrecoveredTotal(Long creditUnrecoveredTotal) {
            this.creditUnrecoveredTotal = creditUnrecoveredTotal;
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
         * The {@code invoice_id} property.
         *
         * @param invoiceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = JsonField.ofNullable(invoiceId);
            return this;
        }

        /**
         * The {@code payment_id} property.
         *
         * @param paymentId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentId(String paymentId) {
            this.paymentId = JsonField.ofNullable(paymentId);
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
         * The {@code WalletCreditRecoveredEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WalletCreditRecoveredEventData build() {
            Utils.checkRequired(cause, "cause");
            Utils.checkRequired(creditRecovered, "credit_recovered");
            Utils.checkRequired(creditUnrecoveredTotal, "credit_unrecovered_total");
            Utils.checkRequired(customerId, "customer_id");
            return new WalletCreditRecoveredEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code WalletCreditRecoveredEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WalletCreditRecoveredEventData fromJson(String json) {
        return Utils.parse(json, WalletCreditRecoveredEventData.class);
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
