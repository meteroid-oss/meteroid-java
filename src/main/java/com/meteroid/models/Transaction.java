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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class Transaction {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("amount_refunded")
    private Long amountRefunded;

    @JsonProperty("amount_reversed")
    private Long amountReversed;

    @JsonProperty("credit_note_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditNoteId = JsonField.missing();

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("error")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> error = JsonField.missing();

    @JsonProperty("id")
    private String id;

    @JsonProperty("parent_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> parentTransactionId = JsonField.missing();

    @JsonProperty("payment_method_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> paymentMethodId = JsonField.missing();

    @JsonProperty("payment_method_info")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<PaymentMethodInfo> paymentMethodInfo = JsonField.missing();

    @JsonProperty("payment_type")
    private PaymentTypeEnum paymentType;

    @JsonProperty("processed_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> processedAt = JsonField.missing();

    @JsonProperty("provider_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> providerTransactionId = JsonField.missing();

    @JsonProperty("refund_mode")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<RefundMode> refundMode = JsonField.missing();

    @JsonProperty("reversal_kind")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<ReversalKind> reversalKind = JsonField.missing();

    @JsonProperty("reversal_reason")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> reversalReason = JsonField.missing();

    @JsonProperty("status")
    private PaymentStatusEnum status;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private Transaction() {}

    private Transaction(Builder builder) {
        this.amount = builder.amount;
        this.amountRefunded = builder.amountRefunded;
        this.amountReversed = builder.amountReversed;
        this.creditNoteId = builder.creditNoteId;
        this.currency = builder.currency;
        this.error = builder.error;
        this.id = builder.id;
        this.parentTransactionId = builder.parentTransactionId;
        this.paymentMethodId = builder.paymentMethodId;
        this.paymentMethodInfo = builder.paymentMethodInfo;
        this.paymentType = builder.paymentType;
        this.processedAt = builder.processedAt;
        this.providerTransactionId = builder.providerTransactionId;
        this.refundMode = builder.refundMode;
        this.reversalKind = builder.reversalKind;
        this.reversalReason = builder.reversalReason;
        this.status = builder.status;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code Transaction}.
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
        builder.amountRefunded = amountRefunded;
        builder.amountReversed = amountReversed;
        builder.creditNoteId = creditNoteId;
        builder.currency = currency;
        builder.error = error;
        builder.id = id;
        builder.parentTransactionId = parentTransactionId;
        builder.paymentMethodId = paymentMethodId;
        builder.paymentMethodInfo = paymentMethodInfo;
        builder.paymentType = paymentType;
        builder.processedAt = processedAt;
        builder.providerTransactionId = providerTransactionId;
        builder.refundMode = refundMode;
        builder.reversalKind = reversalKind;
        builder.reversalReason = reversalReason;
        builder.status = status;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code amount} property.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * On a PAYMENT: how much was voluntarily given back (the sum of its settled REFUND children).
     * The invoice stays paid — the Refund credit note is what reduces it.
     *
     * @return the value, never null
     */
    public Long amountRefunded() {
        return Utils.required(amountRefunded, "amount_refunded");
    }

    /**
     * On a PAYMENT: how much was involuntarily clawed back (chargeback, bank recall, lost dispute).
     * This is what the invoice nets out, reopening it.
     *
     * @return the value, never null
     */
    public Long amountReversed() {
        return Utils.required(amountReversed, "amount_reversed");
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
     * The {@code currency} property.
     *
     * @return the value, never null
     */
    public String currency() {
        return Utils.required(currency, "currency");
    }

    /**
     * The {@code error} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> error() {
        return error.asOptional();
    }

    /**
     * The {@code id} property.
     *
     * @return the value, never null
     */
    public String id() {
        return Utils.required(id, "id");
    }

    /**
     * The {@code parent_transaction_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> parentTransactionId() {
        return parentTransactionId.asOptional();
    }

    /**
     * The {@code payment_method_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> paymentMethodId() {
        return paymentMethodId.asOptional();
    }

    /**
     * The {@code payment_method_info} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<PaymentMethodInfo> paymentMethodInfo() {
        return paymentMethodInfo.asOptional();
    }

    /**
     * The {@code payment_type} property.
     *
     * @return the value, never null
     */
    public PaymentTypeEnum paymentType() {
        return Utils.required(paymentType, "payment_type");
    }

    /**
     * The {@code processed_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> processedAt() {
        return processedAt.asOptional();
    }

    /**
     * The {@code provider_transaction_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> providerTransactionId() {
        return providerTransactionId.asOptional();
    }

    /**
     * The {@code refund_mode} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<RefundMode> refundMode() {
        return refundMode.asOptional();
    }

    /**
     * The {@code reversal_kind} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<ReversalKind> reversalKind() {
        return reversalKind.asOptional();
    }

    /**
     * The provider's raw cause, or what the operator typed when reversing by hand.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> reversalReason() {
        return reversalReason.asOptional();
    }

    /**
     * The {@code status} property.
     *
     * @return the value, never null
     */
    public PaymentStatusEnum status() {
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
        Transaction that = (Transaction) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(amountRefunded, that.amountRefunded)
                && Objects.equals(amountReversed, that.amountReversed)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(currency, that.currency)
                && Objects.equals(error, that.error)
                && Objects.equals(id, that.id)
                && Objects.equals(parentTransactionId, that.parentTransactionId)
                && Objects.equals(paymentMethodId, that.paymentMethodId)
                && Objects.equals(paymentMethodInfo, that.paymentMethodInfo)
                && Objects.equals(paymentType, that.paymentType)
                && Objects.equals(processedAt, that.processedAt)
                && Objects.equals(providerTransactionId, that.providerTransactionId)
                && Objects.equals(refundMode, that.refundMode)
                && Objects.equals(reversalKind, that.reversalKind)
                && Objects.equals(reversalReason, that.reversalReason)
                && Objects.equals(status, that.status)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                amountRefunded,
                amountReversed,
                creditNoteId,
                currency,
                error,
                id,
                parentTransactionId,
                paymentMethodId,
                paymentMethodInfo,
                paymentType,
                processedAt,
                providerTransactionId,
                refundMode,
                reversalKind,
                reversalReason,
                status,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "Transaction{"
                + "amount="
                + amount
                + ", amountRefunded="
                + amountRefunded
                + ", amountReversed="
                + amountReversed
                + ", creditNoteId="
                + creditNoteId
                + ", currency="
                + currency
                + ", error="
                + error
                + ", id="
                + id
                + ", parentTransactionId="
                + parentTransactionId
                + ", paymentMethodId="
                + paymentMethodId
                + ", paymentMethodInfo="
                + paymentMethodInfo
                + ", paymentType="
                + paymentType
                + ", processedAt="
                + processedAt
                + ", providerTransactionId="
                + providerTransactionId
                + ", refundMode="
                + refundMode
                + ", reversalKind="
                + reversalKind
                + ", reversalReason="
                + reversalReason
                + ", status="
                + status
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link Transaction}. */
    public static final class Builder {
        private Long amount;
        private Long amountRefunded;
        private Long amountReversed;
        private JsonField<String> creditNoteId = JsonField.missing();
        private String currency;
        private JsonField<String> error = JsonField.missing();
        private String id;
        private JsonField<String> parentTransactionId = JsonField.missing();
        private JsonField<String> paymentMethodId = JsonField.missing();
        private JsonField<PaymentMethodInfo> paymentMethodInfo = JsonField.missing();
        private PaymentTypeEnum paymentType;
        private JsonField<OffsetDateTime> processedAt = JsonField.missing();
        private JsonField<String> providerTransactionId = JsonField.missing();
        private JsonField<RefundMode> refundMode = JsonField.missing();
        private JsonField<ReversalKind> reversalKind = JsonField.missing();
        private JsonField<String> reversalReason = JsonField.missing();
        private PaymentStatusEnum status;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code amount} property.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * On a PAYMENT: how much was voluntarily given back (the sum of its settled REFUND
         * children). The invoice stays paid — the Refund credit note is what reduces it.
         *
         * @param amountRefunded the value
         * @return this builder
         */
        public Builder amountRefunded(Long amountRefunded) {
            this.amountRefunded = amountRefunded;
            return this;
        }

        /**
         * On a PAYMENT: how much was involuntarily clawed back (chargeback, bank recall, lost
         * dispute). This is what the invoice nets out, reopening it.
         *
         * @param amountReversed the value
         * @return this builder
         */
        public Builder amountReversed(Long amountReversed) {
            this.amountReversed = amountReversed;
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
         * The {@code currency} property.
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The {@code error} property.
         *
         * @param error the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder error(String error) {
            this.error = JsonField.ofNullable(error);
            return this;
        }

        /**
         * The {@code id} property.
         *
         * @param id the value
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The {@code parent_transaction_id} property.
         *
         * @param parentTransactionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder parentTransactionId(String parentTransactionId) {
            this.parentTransactionId = JsonField.ofNullable(parentTransactionId);
            return this;
        }

        /**
         * The {@code payment_method_id} property.
         *
         * @param paymentMethodId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentMethodId(String paymentMethodId) {
            this.paymentMethodId = JsonField.ofNullable(paymentMethodId);
            return this;
        }

        /**
         * The {@code payment_method_info} property.
         *
         * @param paymentMethodInfo the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paymentMethodInfo(PaymentMethodInfo paymentMethodInfo) {
            this.paymentMethodInfo = JsonField.ofNullable(paymentMethodInfo);
            return this;
        }

        /**
         * The {@code payment_type} property.
         *
         * @param paymentType the value
         * @return this builder
         */
        public Builder paymentType(PaymentTypeEnum paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * The {@code processed_at} property.
         *
         * @param processedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder processedAt(OffsetDateTime processedAt) {
            this.processedAt = JsonField.ofNullable(processedAt);
            return this;
        }

        /**
         * The {@code provider_transaction_id} property.
         *
         * @param providerTransactionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder providerTransactionId(String providerTransactionId) {
            this.providerTransactionId = JsonField.ofNullable(providerTransactionId);
            return this;
        }

        /**
         * The {@code refund_mode} property.
         *
         * @param refundMode the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder refundMode(RefundMode refundMode) {
            this.refundMode = JsonField.ofNullable(refundMode);
            return this;
        }

        /**
         * The {@code reversal_kind} property.
         *
         * @param reversalKind the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder reversalKind(ReversalKind reversalKind) {
            this.reversalKind = JsonField.ofNullable(reversalKind);
            return this;
        }

        /**
         * The provider's raw cause, or what the operator typed when reversing by hand.
         *
         * @param reversalReason the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder reversalReason(String reversalReason) {
            this.reversalReason = JsonField.ofNullable(reversalReason);
            return this;
        }

        /**
         * The {@code status} property.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(PaymentStatusEnum status) {
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
         * The {@code Transaction}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public Transaction build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(amountRefunded, "amount_refunded");
            Utils.checkRequired(amountReversed, "amount_reversed");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(paymentType, "payment_type");
            Utils.checkRequired(status, "status");
            return new Transaction(this);
        }
    }

    /**
     * Parse {@code json} as {@code Transaction}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static Transaction fromJson(String json) {
        return Utils.parse(json, Transaction.class);
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
