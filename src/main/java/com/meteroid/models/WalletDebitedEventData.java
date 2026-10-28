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

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Credit left a customer's wallet.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WalletDebitedEventData {
    @JsonProperty("actor")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Actor> actor = JsonField.missing();

    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("applicable_product_ids")
    private List<String> applicableProductIds;

    @JsonProperty("applies_to")
    private CreditAppliesTo appliesTo;

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
    private JsonField<String> currency = JsonField.missing();

    @JsonProperty("customer_id")
    private String customerId;

    @JsonProperty("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> invoiceId = JsonField.missing();

    @JsonProperty("ledger_entry_id")
    private String ledgerEntryId;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WalletDebitedEventData() {}

    private WalletDebitedEventData(Builder builder) {
        this.actor = builder.actor;
        this.amount = builder.amount;
        this.applicableProductIds = Utils.copyList(builder.applicableProductIds);
        this.appliesTo = builder.appliesTo;
        this.creditGrantId = builder.creditGrantId;
        this.creditNoteId = builder.creditNoteId;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.invoiceId = builder.invoiceId;
        this.ledgerEntryId = builder.ledgerEntryId;
        this.reason = builder.reason;
        this.subscriptionId = builder.subscriptionId;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WalletDebitedEventData}.
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
        builder.actor = actor;
        builder.amount = amount;
        builder.applicableProductIds = Utils.mutableList(applicableProductIds);
        builder.appliesTo = appliesTo;
        builder.creditGrantId = creditGrantId;
        builder.creditNoteId = creditNoteId;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.invoiceId = invoiceId;
        builder.ledgerEntryId = ledgerEntryId;
        builder.reason = reason;
        builder.subscriptionId = subscriptionId;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code actor} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Actor> actor() {
        return actor.asOptional();
    }

    /**
     * In minor units of <code>currency</code> or <code>credit_unit</code>.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * The products whose charges the grant pays; empty when it pays every product.
     *
     * @return the value, never null
     */
    public List<String> applicableProductIds() {
        return Utils.required(applicableProductIds, "applicable_product_ids");
    }

    /**
     * What the grant pays: ALL any charge, USAGE only usage charges.
     *
     * @return the value, never null
     */
    public CreditAppliesTo appliesTo() {
        return Utils.required(appliesTo, "applies_to");
    }

    /**
     * The grant the credit left.
     *
     * @return the value, never null
     */
    public String creditGrantId() {
        return Utils.required(creditGrantId, "credit_grant_id");
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
     * The {@code invoice_id} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> invoiceId() {
        return invoiceId.asOptional();
    }

    /**
     * The credit ledger entry recording the movement.
     *
     * @return the value, never null
     */
    public String ledgerEntryId() {
        return Utils.required(ledgerEntryId, "ledger_entry_id");
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
     * The subscription the grant belongs to: it pays only that subscription's charges. Null when it
     * pays any of the customer's subscriptions.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
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
        WalletDebitedEventData that = (WalletDebitedEventData) o;
        return Objects.equals(actor, that.actor)
                && Objects.equals(amount, that.amount)
                && Objects.equals(applicableProductIds, that.applicableProductIds)
                && Objects.equals(appliesTo, that.appliesTo)
                && Objects.equals(creditGrantId, that.creditGrantId)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(ledgerEntryId, that.ledgerEntryId)
                && Objects.equals(reason, that.reason)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actor,
                amount,
                applicableProductIds,
                appliesTo,
                creditGrantId,
                creditNoteId,
                creditUnit,
                creditUnitPrecision,
                currency,
                customerId,
                invoiceId,
                ledgerEntryId,
                reason,
                subscriptionId,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WalletDebitedEventData{"
                + "actor="
                + actor
                + ", amount="
                + amount
                + ", applicableProductIds="
                + applicableProductIds
                + ", appliesTo="
                + appliesTo
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
                + ", customerId="
                + customerId
                + ", invoiceId="
                + invoiceId
                + ", ledgerEntryId="
                + ledgerEntryId
                + ", reason="
                + reason
                + ", subscriptionId="
                + subscriptionId
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WalletDebitedEventData}. */
    public static final class Builder {
        private JsonField<Actor> actor = JsonField.missing();
        private Long amount;
        private List<String> applicableProductIds;
        private CreditAppliesTo appliesTo;
        private String creditGrantId;
        private JsonField<String> creditNoteId = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<String> currency = JsonField.missing();
        private String customerId;
        private JsonField<String> invoiceId = JsonField.missing();
        private String ledgerEntryId;
        private String reason;
        private JsonField<String> subscriptionId = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code actor} property.
         *
         * @param actor the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder actor(Actor actor) {
            this.actor = JsonField.ofNullable(actor);
            return this;
        }

        /**
         * In minor units of <code>currency</code> or <code>credit_unit</code>.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * The products whose charges the grant pays; empty when it pays every product.
         *
         * @param applicableProductIds the value
         * @return this builder
         */
        public Builder applicableProductIds(List<String> applicableProductIds) {
            this.applicableProductIds = Utils.mutableList(applicableProductIds);
            return this;
        }

        /**
         * Adds an item to {@code applicable_product_ids}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addApplicableProductIdsItem(String item) {
            if (this.applicableProductIds == null) {
                this.applicableProductIds = new ArrayList<>();
            }
            this.applicableProductIds.add(item);
            return this;
        }

        /**
         * What the grant pays: ALL any charge, USAGE only usage charges.
         *
         * @param appliesTo the value
         * @return this builder
         */
        public Builder appliesTo(CreditAppliesTo appliesTo) {
            this.appliesTo = appliesTo;
            return this;
        }

        /**
         * The grant the credit left.
         *
         * @param creditGrantId the value
         * @return this builder
         */
        public Builder creditGrantId(String creditGrantId) {
            this.creditGrantId = creditGrantId;
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
         * The credit ledger entry recording the movement.
         *
         * @param ledgerEntryId the value
         * @return this builder
         */
        public Builder ledgerEntryId(String ledgerEntryId) {
            this.ledgerEntryId = ledgerEntryId;
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
         * The subscription the grant belongs to: it pays only that subscription's charges. Null
         * when it pays any of the customer's subscriptions.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
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
         * The {@code WalletDebitedEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WalletDebitedEventData build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(applicableProductIds, "applicable_product_ids");
            Utils.checkRequired(appliesTo, "applies_to");
            Utils.checkRequired(creditGrantId, "credit_grant_id");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(ledgerEntryId, "ledger_entry_id");
            Utils.checkRequired(reason, "reason");
            return new WalletDebitedEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code WalletDebitedEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WalletDebitedEventData fromJson(String json) {
        return Utils.parse(json, WalletDebitedEventData.class);
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
