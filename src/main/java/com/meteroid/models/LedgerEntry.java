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
 * One movement of a customer's credit.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class LedgerEntry {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("applies_to")
    private CreditAppliesTo appliesTo;

    @JsonProperty("balance_after")
    private Long balanceAfter;

    @JsonProperty("cost")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<CreditCost> cost = JsonField.missing();

    @JsonProperty("credit_grant_id")
    private String creditGrantId;

    @JsonProperty("credit_note_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditNoteId = JsonField.missing();

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("effective_at")
    private OffsetDateTime effectiveAt;

    @JsonProperty("id")
    private String id;

    @JsonProperty("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> invoiceId = JsonField.missing();

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("recorded_at")
    private OffsetDateTime recordedAt;

    @JsonProperty("reference")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> reference = JsonField.missing();

    @JsonProperty("sequence")
    private Long sequence;

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("type")
    private LedgerEntryType type;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private LedgerEntry() {}

    private LedgerEntry(Builder builder) {
        this.amount = builder.amount;
        this.appliesTo = builder.appliesTo;
        this.balanceAfter = builder.balanceAfter;
        this.cost = builder.cost;
        this.creditGrantId = builder.creditGrantId;
        this.creditNoteId = builder.creditNoteId;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.effectiveAt = builder.effectiveAt;
        this.id = builder.id;
        this.invoiceId = builder.invoiceId;
        this.reason = builder.reason;
        this.recordedAt = builder.recordedAt;
        this.reference = builder.reference;
        this.sequence = builder.sequence;
        this.subscriptionId = builder.subscriptionId;
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code LedgerEntry}.
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
        builder.appliesTo = appliesTo;
        builder.balanceAfter = balanceAfter;
        builder.cost = cost;
        builder.creditGrantId = creditGrantId;
        builder.creditNoteId = creditNoteId;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.effectiveAt = effectiveAt;
        builder.id = id;
        builder.invoiceId = invoiceId;
        builder.reason = reason;
        builder.recordedAt = recordedAt;
        builder.reference = reference;
        builder.sequence = sequence;
        builder.subscriptionId = subscriptionId;
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Signed change to the credit on account, in minor units.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * What the moved credit's grant pays: ALL any charge, USAGE only usage charges.
     *
     * @return the value, never null
     */
    public CreditAppliesTo appliesTo() {
        return Utils.required(appliesTo, "applies_to");
    }

    /**
     * The credit on account after this entry, whatever it applies to.
     *
     * @return the value, never null
     */
    public Long balanceAfter() {
        return Utils.required(balanceAfter, "balance_after");
    }

    /**
     * The {@code cost} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<CreditCost> cost() {
        return cost.asOptional();
    }

    /**
     * The grant the credit moved in or out of.
     *
     * @return the value, never null
     */
    public String creditGrantId() {
        return Utils.required(creditGrantId, "credit_grant_id");
    }

    /**
     * The credit note that gave the credit back or took it back.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditNoteId() {
        return creditNoteId.asOptional();
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
     * The {@code currency} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Currency> currency() {
        return currency.asOptional();
    }

    /**
     * When the movement took effect; the ledger is ordered by it.
     *
     * @return the value, never null
     */
    public OffsetDateTime effectiveAt() {
        return Utils.required(effectiveAt, "effective_at");
    }

    /**
     * The entry's id (<code>wle_…</code>).
     *
     * @return the value, never null
     */
    public String id() {
        return Utils.required(id, "id");
    }

    /**
     * The invoice the credit was applied to, bought on, or given back by.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> invoiceId() {
        return invoiceId.asOptional();
    }

    /**
     * Why the credit moved, as shown on the ledger.
     *
     * @return the value, never null
     */
    public String reason() {
        return Utils.required(reason, "reason");
    }

    /**
     * When the movement was recorded.
     *
     * @return the value, never null
     */
    public OffsetDateTime recordedAt() {
        return Utils.required(recordedAt, "recorded_at");
    }

    /**
     * Your own reference, e.g. a contract or support ticket.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> reference() {
        return reference.asOptional();
    }

    /**
     * Position within the currency's ledger in the order the movements took effect, from 1. A
     * movement recorded later with an earlier date shifts the positions after it: identify an entry
     * by its <code>id</code>.
     *
     * @return the value, never null
     */
    public Long sequence() {
        return Utils.required(sequence, "sequence");
    }

    /**
     * The subscription the moved credit's grant belongs to; null when it pays any of the customer's
     * subscriptions.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * What moved the credit.
     *
     * @return the value, never null
     */
    public LedgerEntryType type() {
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
        LedgerEntry that = (LedgerEntry) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(appliesTo, that.appliesTo)
                && Objects.equals(balanceAfter, that.balanceAfter)
                && Objects.equals(cost, that.cost)
                && Objects.equals(creditGrantId, that.creditGrantId)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(effectiveAt, that.effectiveAt)
                && Objects.equals(id, that.id)
                && Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(reason, that.reason)
                && Objects.equals(recordedAt, that.recordedAt)
                && Objects.equals(reference, that.reference)
                && Objects.equals(sequence, that.sequence)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(type, that.type)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                appliesTo,
                balanceAfter,
                cost,
                creditGrantId,
                creditNoteId,
                creditUnit,
                creditUnitPrecision,
                currency,
                effectiveAt,
                id,
                invoiceId,
                reason,
                recordedAt,
                reference,
                sequence,
                subscriptionId,
                type,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "LedgerEntry{"
                + "amount="
                + amount
                + ", appliesTo="
                + appliesTo
                + ", balanceAfter="
                + balanceAfter
                + ", cost="
                + cost
                + ", creditGrantId="
                + creditGrantId
                + ", creditNoteId="
                + creditNoteId
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", currency="
                + currency
                + ", effectiveAt="
                + effectiveAt
                + ", id="
                + id
                + ", invoiceId="
                + invoiceId
                + ", reason="
                + reason
                + ", recordedAt="
                + recordedAt
                + ", reference="
                + reference
                + ", sequence="
                + sequence
                + ", subscriptionId="
                + subscriptionId
                + ", type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link LedgerEntry}. */
    public static final class Builder {
        private Long amount;
        private CreditAppliesTo appliesTo;
        private Long balanceAfter;
        private JsonField<CreditCost> cost = JsonField.missing();
        private String creditGrantId;
        private JsonField<String> creditNoteId = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private OffsetDateTime effectiveAt;
        private String id;
        private JsonField<String> invoiceId = JsonField.missing();
        private String reason;
        private OffsetDateTime recordedAt;
        private JsonField<String> reference = JsonField.missing();
        private Long sequence;
        private JsonField<String> subscriptionId = JsonField.missing();
        private LedgerEntryType type;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Signed change to the credit on account, in minor units.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * What the moved credit's grant pays: ALL any charge, USAGE only usage charges.
         *
         * @param appliesTo the value
         * @return this builder
         */
        public Builder appliesTo(CreditAppliesTo appliesTo) {
            this.appliesTo = appliesTo;
            return this;
        }

        /**
         * The credit on account after this entry, whatever it applies to.
         *
         * @param balanceAfter the value
         * @return this builder
         */
        public Builder balanceAfter(Long balanceAfter) {
            this.balanceAfter = balanceAfter;
            return this;
        }

        /**
         * The {@code cost} property.
         *
         * @param cost the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder cost(CreditCost cost) {
            this.cost = JsonField.ofNullable(cost);
            return this;
        }

        /**
         * The grant the credit moved in or out of.
         *
         * @param creditGrantId the value
         * @return this builder
         */
        public Builder creditGrantId(String creditGrantId) {
            this.creditGrantId = creditGrantId;
            return this;
        }

        /**
         * The credit note that gave the credit back or took it back.
         *
         * @param creditNoteId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditNoteId(String creditNoteId) {
            this.creditNoteId = JsonField.ofNullable(creditNoteId);
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
         * The {@code currency} property.
         *
         * @param currency the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder currency(Currency currency) {
            this.currency = JsonField.ofNullable(currency);
            return this;
        }

        /**
         * When the movement took effect; the ledger is ordered by it.
         *
         * @param effectiveAt the value
         * @return this builder
         */
        public Builder effectiveAt(OffsetDateTime effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }

        /**
         * The entry's id (<code>wle_…</code>).
         *
         * @param id the value
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The invoice the credit was applied to, bought on, or given back by.
         *
         * @param invoiceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = JsonField.ofNullable(invoiceId);
            return this;
        }

        /**
         * Why the credit moved, as shown on the ledger.
         *
         * @param reason the value
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * When the movement was recorded.
         *
         * @param recordedAt the value
         * @return this builder
         */
        public Builder recordedAt(OffsetDateTime recordedAt) {
            this.recordedAt = recordedAt;
            return this;
        }

        /**
         * Your own reference, e.g. a contract or support ticket.
         *
         * @param reference the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder reference(String reference) {
            this.reference = JsonField.ofNullable(reference);
            return this;
        }

        /**
         * Position within the currency's ledger in the order the movements took effect, from 1. A
         * movement recorded later with an earlier date shifts the positions after it: identify an
         * entry by its <code>id</code>.
         *
         * @param sequence the value
         * @return this builder
         */
        public Builder sequence(Long sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * The subscription the moved credit's grant belongs to; null when it pays any of the
         * customer's subscriptions.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * What moved the credit.
         *
         * @param type the value
         * @return this builder
         */
        public Builder type(LedgerEntryType type) {
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
         * The {@code LedgerEntry}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public LedgerEntry build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(appliesTo, "applies_to");
            Utils.checkRequired(balanceAfter, "balance_after");
            Utils.checkRequired(creditGrantId, "credit_grant_id");
            Utils.checkRequired(effectiveAt, "effective_at");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(reason, "reason");
            Utils.checkRequired(recordedAt, "recorded_at");
            Utils.checkRequired(sequence, "sequence");
            Utils.checkRequired(type, "type");
            return new LedgerEntry(this);
        }
    }

    /**
     * Parse {@code json} as {@code LedgerEntry}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static LedgerEntry fromJson(String json) {
        return Utils.parse(json, LedgerEntry.class);
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
