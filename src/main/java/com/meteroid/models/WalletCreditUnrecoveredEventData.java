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
 * Purchased credit was already spent when its money came back.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WalletCreditUnrecoveredEventData {
    @JsonProperty("cause")
    private String cause;

    @JsonProperty("credit_note_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditNoteId = JsonField.missing();

    @JsonProperty("credit_taken_back")
    private Long creditTakenBack;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("credit_unrecovered")
    private Long creditUnrecovered;

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

    private WalletCreditUnrecoveredEventData() {}

    private WalletCreditUnrecoveredEventData(Builder builder) {
        this.cause = builder.cause;
        this.creditNoteId = builder.creditNoteId;
        this.creditTakenBack = builder.creditTakenBack;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.creditUnrecovered = builder.creditUnrecovered;
        this.creditUnrecoveredTotal = builder.creditUnrecoveredTotal;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.invoiceId = builder.invoiceId;
        this.paymentId = builder.paymentId;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WalletCreditUnrecoveredEventData}.
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
        builder.creditTakenBack = creditTakenBack;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.creditUnrecovered = creditUnrecovered;
        builder.creditUnrecoveredTotal = creditUnrecoveredTotal;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.invoiceId = invoiceId;
        builder.paymentId = paymentId;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * <code>PAYMENT_DISPUTED</code> (lost to a dispute or chargeback), <code>PAYMENT_REVERSED
     * </code> (a failed collection clawed back), <code>PAYMENT_REFUNDED</code> (a payment refunded
     * without a credit note, at the provider or as an overpayment, after the credit it backed was
     * spent) or <code>CREDIT_NOTE_REFUNDED</code>.
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
     * Unspent credit taken back from the wallet at the same time, in minor units.
     *
     * @return the value, never null
     */
    public Long creditTakenBack() {
        return Utils.required(creditTakenBack, "credit_taken_back");
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
     * Spent credit this event adds to the loss, in minor units. A failed collection reopens its
     * invoice, which collects it again; a dispute's loss stays unless the dispute is won. <code>
     * wallet.credit_recovered</code> reports what comes back.
     *
     * @return the value, never null
     */
    public Long creditUnrecovered() {
        return Utils.required(creditUnrecovered, "credit_unrecovered");
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
        WalletCreditUnrecoveredEventData that = (WalletCreditUnrecoveredEventData) o;
        return Objects.equals(cause, that.cause)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(creditTakenBack, that.creditTakenBack)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(creditUnrecovered, that.creditUnrecovered)
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
                creditTakenBack,
                creditUnit,
                creditUnitPrecision,
                creditUnrecovered,
                creditUnrecoveredTotal,
                currency,
                customerId,
                invoiceId,
                paymentId,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WalletCreditUnrecoveredEventData{"
                + "cause="
                + cause
                + ", creditNoteId="
                + creditNoteId
                + ", creditTakenBack="
                + creditTakenBack
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", creditUnrecovered="
                + creditUnrecovered
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

    /** Builds {@link WalletCreditUnrecoveredEventData}. */
    public static final class Builder {
        private String cause;
        private JsonField<String> creditNoteId = JsonField.missing();
        private Long creditTakenBack;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private Long creditUnrecovered;
        private Long creditUnrecoveredTotal;
        private JsonField<String> currency = JsonField.missing();
        private String customerId;
        private JsonField<String> invoiceId = JsonField.missing();
        private JsonField<String> paymentId = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * <code>PAYMENT_DISPUTED</code> (lost to a dispute or chargeback), <code>PAYMENT_REVERSED
         * </code> (a failed collection clawed back), <code>PAYMENT_REFUNDED</code> (a payment
         * refunded without a credit note, at the provider or as an overpayment, after the credit it
         * backed was spent) or <code>CREDIT_NOTE_REFUNDED</code>.
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
         * Unspent credit taken back from the wallet at the same time, in minor units.
         *
         * @param creditTakenBack the value
         * @return this builder
         */
        public Builder creditTakenBack(Long creditTakenBack) {
            this.creditTakenBack = creditTakenBack;
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
         * Spent credit this event adds to the loss, in minor units. A failed collection reopens its
         * invoice, which collects it again; a dispute's loss stays unless the dispute is won.
         * <code>wallet.credit_recovered</code> reports what comes back.
         *
         * @param creditUnrecovered the value
         * @return this builder
         */
        public Builder creditUnrecovered(Long creditUnrecovered) {
            this.creditUnrecovered = creditUnrecovered;
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
         * The {@code WalletCreditUnrecoveredEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WalletCreditUnrecoveredEventData build() {
            Utils.checkRequired(cause, "cause");
            Utils.checkRequired(creditTakenBack, "credit_taken_back");
            Utils.checkRequired(creditUnrecovered, "credit_unrecovered");
            Utils.checkRequired(creditUnrecoveredTotal, "credit_unrecovered_total");
            Utils.checkRequired(customerId, "customer_id");
            return new WalletCreditUnrecoveredEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code WalletCreditUnrecoveredEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WalletCreditUnrecoveredEventData fromJson(String json) {
        return Utils.parse(json, WalletCreditUnrecoveredEventData.class);
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
