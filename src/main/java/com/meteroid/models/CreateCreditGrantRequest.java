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
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Credit granted without charging or invoicing.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreateCreditGrantRequest {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("applicable_product_ids")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<String>> applicableProductIds = JsonField.missing();

    @JsonProperty("applies_to")
    private CreditAppliesTo appliesTo;

    @JsonProperty("cost")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<CreditCostRequest> cost = JsonField.missing();

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("expires_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> expiresAt = JsonField.missing();

    @JsonProperty("priority")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> priority = JsonField.missing();

    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> reason = JsonField.missing();

    @JsonProperty("reference")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> reference = JsonField.missing();

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("type")
    private CreditGrantType type;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreateCreditGrantRequest() {}

    private CreateCreditGrantRequest(Builder builder) {
        this.amount = builder.amount;
        this.applicableProductIds = builder.applicableProductIds.map(Utils::copyList);
        this.appliesTo = builder.appliesTo;
        this.cost = builder.cost;
        this.creditUnit = builder.creditUnit;
        this.currency = builder.currency;
        this.expiresAt = builder.expiresAt;
        this.priority = builder.priority;
        this.reason = builder.reason;
        this.reference = builder.reference;
        this.subscriptionId = builder.subscriptionId;
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreateCreditGrantRequest}.
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
        builder.applicableProductIds = applicableProductIds.map(Utils::mutableList);
        builder.appliesTo = appliesTo;
        builder.cost = cost;
        builder.creditUnit = creditUnit;
        builder.currency = currency;
        builder.expiresAt = expiresAt;
        builder.priority = priority;
        builder.reason = reason;
        builder.reference = reference;
        builder.subscriptionId = subscriptionId;
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Credit granted, in minor units of <code>currency</code>, or of <code>credit_unit</code> when
     * set (e.g. 500000 is 5,000.00 credits of a unit with precision 2). Positive.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * Restricts the credit to charges of these products; absent applies to every product. Combined
     * with <code>applies_to</code>. Not available for credit units.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<String>> applicableProductIds() {
        return applicableProductIds.asOptional();
    }

    /**
     * ALL pays any charge on an invoice; USAGE only usage charges.
     *
     * @return the value, empty when unset
     */
    public Optional<CreditAppliesTo> appliesTo() {
        return Optional.ofNullable(appliesTo);
    }

    /**
     * The {@code cost} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<CreditCostRequest> cost() {
        return cost.asOptional();
    }

    /**
     * Grants in this credit unit (its code) instead of a currency; excludes <code>currency</code>.
     * Credit in a credit unit pays the usage priced in that unit, so <code>applies_to</code> must
     * stay ALL.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> creditUnit() {
        return creditUnit.asOptional();
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
     * When unspent credit lapses; absent never expires.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> expiresAt() {
        return expiresAt.asOptional();
    }

    /**
     * Lower values are drawn first among grants of the same type that pay the same charges;
     * defaults to 100.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> priority() {
        return priority.asOptional();
    }

    /**
     * Shown on the credit ledger.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> reason() {
        return reason.asOptional();
    }

    /**
     * Your own reference, e.g. a contract or support ticket. Required for PAID credit that cost
     * more than zero when the customer's invoicing entity is in France: the number of the invoice
     * or receipt for the payment, as French law requires a supporting document for every accounting
     * entry. Refused with 400 when missing.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> reference() {
        return reference.asOptional();
    }

    /**
     * The customer's subscription (<code>sub_…</code>) the credit belongs to: it pays only that
     * subscription's charges and lapses when the subscription ends. It must not have ended, and its
     * currency must be the grant's. Absent pays any of the customer's subscriptions.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * PROMOTIONAL gives credit for free (a goodwill or marketing grant). PAID records credit the
     * customer paid for outside of Meteroid: nothing is charged or invoiced, and the grant is shown
     * as "Paid outside Meteroid". Usage paid with PAID currency credit is taxed on the invoice that
     * bills it, so do not charge tax on the external sale of currency credit, or the customer is
     * taxed twice. Credit in a credit unit is the exception: its usage is billed in credits,
     * untaxed, so tax its sale as you would any other. Use a top-up to sell credit through
     * Meteroid.
     *
     * @return the value, never null
     */
    public CreditGrantType type() {
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
        CreateCreditGrantRequest that = (CreateCreditGrantRequest) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(applicableProductIds, that.applicableProductIds)
                && Objects.equals(appliesTo, that.appliesTo)
                && Objects.equals(cost, that.cost)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(currency, that.currency)
                && Objects.equals(expiresAt, that.expiresAt)
                && Objects.equals(priority, that.priority)
                && Objects.equals(reason, that.reason)
                && Objects.equals(reference, that.reference)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(type, that.type)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                applicableProductIds,
                appliesTo,
                cost,
                creditUnit,
                currency,
                expiresAt,
                priority,
                reason,
                reference,
                subscriptionId,
                type,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreateCreditGrantRequest{"
                + "amount="
                + amount
                + ", applicableProductIds="
                + applicableProductIds
                + ", appliesTo="
                + appliesTo
                + ", cost="
                + cost
                + ", creditUnit="
                + creditUnit
                + ", currency="
                + currency
                + ", expiresAt="
                + expiresAt
                + ", priority="
                + priority
                + ", reason="
                + reason
                + ", reference="
                + reference
                + ", subscriptionId="
                + subscriptionId
                + ", type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreateCreditGrantRequest}. */
    public static final class Builder {
        private Long amount;
        private JsonField<List<String>> applicableProductIds = JsonField.missing();
        private CreditAppliesTo appliesTo;
        private JsonField<CreditCostRequest> cost = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private JsonField<OffsetDateTime> expiresAt = JsonField.missing();
        private JsonField<Integer> priority = JsonField.missing();
        private JsonField<String> reason = JsonField.missing();
        private JsonField<String> reference = JsonField.missing();
        private JsonField<String> subscriptionId = JsonField.missing();
        private CreditGrantType type;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Credit granted, in minor units of <code>currency</code>, or of <code>credit_unit</code>
         * when set (e.g. 500000 is 5,000.00 credits of a unit with precision 2). Positive.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Restricts the credit to charges of these products; absent applies to every product.
         * Combined with <code>applies_to</code>. Not available for credit units.
         *
         * @param applicableProductIds the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder applicableProductIds(List<String> applicableProductIds) {
            this.applicableProductIds =
                    JsonField.ofNullable(Utils.mutableList(applicableProductIds));
            return this;
        }

        /**
         * Adds an item to {@code applicable_product_ids}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addApplicableProductIdsItem(String item) {
            List<String> items = this.applicableProductIds.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.applicableProductIds = JsonField.ofNullable(items);
            }
            items.add(item);
            return this;
        }

        /**
         * ALL pays any charge on an invoice; USAGE only usage charges.
         *
         * @param appliesTo the value
         * @return this builder
         */
        public Builder appliesTo(CreditAppliesTo appliesTo) {
            this.appliesTo = appliesTo;
            return this;
        }

        /**
         * The {@code cost} property.
         *
         * @param cost the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder cost(CreditCostRequest cost) {
            this.cost = JsonField.ofNullable(cost);
            return this;
        }

        /**
         * Grants in this credit unit (its code) instead of a currency; excludes <code>currency
         * </code>. Credit in a credit unit pays the usage priced in that unit, so <code>applies_to
         * </code> must stay ALL.
         *
         * @param creditUnit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder creditUnit(String creditUnit) {
            this.creditUnit = JsonField.ofNullable(creditUnit);
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
         * When unspent credit lapses; absent never expires.
         *
         * @param expiresAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder expiresAt(OffsetDateTime expiresAt) {
            this.expiresAt = JsonField.ofNullable(expiresAt);
            return this;
        }

        /**
         * Lower values are drawn first among grants of the same type that pay the same charges;
         * defaults to 100.
         *
         * @param priority the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = JsonField.ofNullable(priority);
            return this;
        }

        /**
         * Shown on the credit ledger.
         *
         * @param reason the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = JsonField.ofNullable(reason);
            return this;
        }

        /**
         * Your own reference, e.g. a contract or support ticket. Required for PAID credit that cost
         * more than zero when the customer's invoicing entity is in France: the number of the
         * invoice or receipt for the payment, as French law requires a supporting document for
         * every accounting entry. Refused with 400 when missing.
         *
         * @param reference the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder reference(String reference) {
            this.reference = JsonField.ofNullable(reference);
            return this;
        }

        /**
         * The customer's subscription (<code>sub_…</code>) the credit belongs to: it pays only that
         * subscription's charges and lapses when the subscription ends. It must not have ended, and
         * its currency must be the grant's. Absent pays any of the customer's subscriptions.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * PROMOTIONAL gives credit for free (a goodwill or marketing grant). PAID records credit
         * the customer paid for outside of Meteroid: nothing is charged or invoiced, and the grant
         * is shown as "Paid outside Meteroid". Usage paid with PAID currency credit is taxed on the
         * invoice that bills it, so do not charge tax on the external sale of currency credit, or
         * the customer is taxed twice. Credit in a credit unit is the exception: its usage is
         * billed in credits, untaxed, so tax its sale as you would any other. Use a top-up to sell
         * credit through Meteroid.
         *
         * @param type the value
         * @return this builder
         */
        public Builder type(CreditGrantType type) {
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
         * The {@code CreateCreditGrantRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreateCreditGrantRequest build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(type, "type");
            return new CreateCreditGrantRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreateCreditGrantRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreateCreditGrantRequest fromJson(String json) {
        return Utils.parse(json, CreateCreditGrantRequest.class);
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
