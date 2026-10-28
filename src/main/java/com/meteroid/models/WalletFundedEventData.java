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
 * Credit entered a customer's wallet.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WalletFundedEventData {
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

    @JsonProperty("grant_type")
    private CreditGrantType grantType;

    @JsonProperty("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> invoiceId = JsonField.missing();

    @JsonProperty("ledger_entry_id")
    private String ledgerEntryId;

    @JsonProperty("source")
    private CreditGrantSource source;

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WalletFundedEventData() {}

    private WalletFundedEventData(Builder builder) {
        this.amount = builder.amount;
        this.applicableProductIds = Utils.copyList(builder.applicableProductIds);
        this.appliesTo = builder.appliesTo;
        this.creditGrantId = builder.creditGrantId;
        this.creditNoteId = builder.creditNoteId;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.customerId = builder.customerId;
        this.grantType = builder.grantType;
        this.invoiceId = builder.invoiceId;
        this.ledgerEntryId = builder.ledgerEntryId;
        this.source = builder.source;
        this.subscriptionId = builder.subscriptionId;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WalletFundedEventData}.
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
        builder.applicableProductIds = Utils.mutableList(applicableProductIds);
        builder.appliesTo = appliesTo;
        builder.creditGrantId = creditGrantId;
        builder.creditNoteId = creditNoteId;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.customerId = customerId;
        builder.grantType = grantType;
        builder.invoiceId = invoiceId;
        builder.ledgerEntryId = ledgerEntryId;
        builder.source = source;
        builder.subscriptionId = subscriptionId;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
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
     * The grant the credit entered.
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
     * PAID or PROMOTIONAL: whether the credit applies after or before tax.
     *
     * @return the value, never null
     */
    public CreditGrantType grantType() {
        return Utils.required(grantType, "grant_type");
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
     * Where the credit came from.
     *
     * @return the value, never null
     */
    public CreditGrantSource source() {
        return Utils.required(source, "source");
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
        WalletFundedEventData that = (WalletFundedEventData) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(applicableProductIds, that.applicableProductIds)
                && Objects.equals(appliesTo, that.appliesTo)
                && Objects.equals(creditGrantId, that.creditGrantId)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(grantType, that.grantType)
                && Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(ledgerEntryId, that.ledgerEntryId)
                && Objects.equals(source, that.source)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                applicableProductIds,
                appliesTo,
                creditGrantId,
                creditNoteId,
                creditUnit,
                creditUnitPrecision,
                currency,
                customerId,
                grantType,
                invoiceId,
                ledgerEntryId,
                source,
                subscriptionId,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "WalletFundedEventData{"
                + "amount="
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
                + ", grantType="
                + grantType
                + ", invoiceId="
                + invoiceId
                + ", ledgerEntryId="
                + ledgerEntryId
                + ", source="
                + source
                + ", subscriptionId="
                + subscriptionId
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WalletFundedEventData}. */
    public static final class Builder {
        private Long amount;
        private List<String> applicableProductIds;
        private CreditAppliesTo appliesTo;
        private String creditGrantId;
        private JsonField<String> creditNoteId = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<String> currency = JsonField.missing();
        private String customerId;
        private CreditGrantType grantType;
        private JsonField<String> invoiceId = JsonField.missing();
        private String ledgerEntryId;
        private CreditGrantSource source;
        private JsonField<String> subscriptionId = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

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
         * The grant the credit entered.
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
         * PAID or PROMOTIONAL: whether the credit applies after or before tax.
         *
         * @param grantType the value
         * @return this builder
         */
        public Builder grantType(CreditGrantType grantType) {
            this.grantType = grantType;
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
         * Where the credit came from.
         *
         * @param source the value
         * @return this builder
         */
        public Builder source(CreditGrantSource source) {
            this.source = source;
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
         * The {@code WalletFundedEventData}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WalletFundedEventData build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(applicableProductIds, "applicable_product_ids");
            Utils.checkRequired(appliesTo, "applies_to");
            Utils.checkRequired(creditGrantId, "credit_grant_id");
            Utils.checkRequired(customerId, "customer_id");
            Utils.checkRequired(grantType, "grant_type");
            Utils.checkRequired(ledgerEntryId, "ledger_entry_id");
            Utils.checkRequired(source, "source");
            return new WalletFundedEventData(this);
        }
    }

    /**
     * Parse {@code json} as {@code WalletFundedEventData}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WalletFundedEventData fromJson(String json) {
        return Utils.parse(json, WalletFundedEventData.class);
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
