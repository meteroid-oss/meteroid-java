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
 * A lot of credit given to or bought by a customer. An invoice applies promotional currency credit
 * before tax and paid credit after it. Within each, it draws the grants that belong to the invoiced
 * subscription first, then grants restricted to products (the fewest products first), then
 * usage-only grants, then the others; then by lowest <code>priority</code>, then the soonest to
 * lapse.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditGrant {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("applicable_product_ids")
    private List<String> applicableProductIds;

    @JsonProperty("applies_to")
    private CreditAppliesTo appliesTo;

    @JsonProperty("bonus_grant_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> bonusGrantId = JsonField.missing();

    @JsonProperty("cost")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<CreditCost> cost = JsonField.missing();

    @JsonProperty("cost_basis")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> costBasis = JsonField.missing();

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

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

    @JsonProperty("ended_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> endedAt = JsonField.missing();

    @JsonProperty("expired_amount")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> expiredAmount = JsonField.missing();

    @JsonProperty("expires_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> expiresAt = JsonField.missing();

    @JsonProperty("id")
    private String id;

    @JsonProperty("invoice_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> invoiceId = JsonField.missing();

    @JsonProperty("kind")
    private CreditGrantKind kind;

    @JsonProperty("kind_label")
    private String kindLabel;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("reason")
    private String reason;

    @JsonProperty("reference")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> reference = JsonField.missing();

    @JsonProperty("remaining")
    private Long remaining;

    @JsonProperty("source")
    private CreditGrantSource source;

    @JsonProperty("status")
    private CreditGrantStatus status;

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("type")
    private CreditGrantType type;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditGrant() {}

    private CreditGrant(Builder builder) {
        this.amount = builder.amount;
        this.applicableProductIds = Utils.copyList(builder.applicableProductIds);
        this.appliesTo = builder.appliesTo;
        this.bonusGrantId = builder.bonusGrantId;
        this.cost = builder.cost;
        this.costBasis = builder.costBasis;
        this.createdAt = builder.createdAt;
        this.creditNoteId = builder.creditNoteId;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.effectiveAt = builder.effectiveAt;
        this.endedAt = builder.endedAt;
        this.expiredAmount = builder.expiredAmount;
        this.expiresAt = builder.expiresAt;
        this.id = builder.id;
        this.invoiceId = builder.invoiceId;
        this.kind = builder.kind;
        this.kindLabel = builder.kindLabel;
        this.priority = builder.priority;
        this.reason = builder.reason;
        this.reference = builder.reference;
        this.remaining = builder.remaining;
        this.source = builder.source;
        this.status = builder.status;
        this.subscriptionId = builder.subscriptionId;
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditGrant}.
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
        builder.bonusGrantId = bonusGrantId;
        builder.cost = cost;
        builder.costBasis = costBasis;
        builder.createdAt = createdAt;
        builder.creditNoteId = creditNoteId;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.effectiveAt = effectiveAt;
        builder.endedAt = endedAt;
        builder.expiredAmount = expiredAmount;
        builder.expiresAt = expiresAt;
        builder.id = id;
        builder.invoiceId = invoiceId;
        builder.kind = kind;
        builder.kindLabel = kindLabel;
        builder.priority = priority;
        builder.reason = reason;
        builder.reference = reference;
        builder.remaining = remaining;
        builder.source = source;
        builder.status = status;
        builder.subscriptionId = subscriptionId;
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Amount granted, in minor units of <code>currency</code> or <code>credit_unit</code>.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * The products whose charges the credit pays, combined with <code>applies_to</code>; empty when
     * it applies to every product.
     *
     * @return the value, never null
     */
    public List<String> applicableProductIds() {
        return Utils.required(applicableProductIds, "applicable_product_ids");
    }

    /**
     * ALL pays any charge on an invoice; USAGE only usage charges.
     *
     * @return the value, never null
     */
    public CreditAppliesTo appliesTo() {
        return Utils.required(appliesTo, "applies_to");
    }

    /**
     * Only on the response that created a PAID currency grant whose <code>cost</code> was below its
     * amount: the PROMOTIONAL "Bonus credit" grant created beside it for the difference, with the
     * same expiry, scope and priority.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> bonusGrantId() {
        return bonusGrantId.asOptional();
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
     * <code>cost</code> per one major unit of credit, in major units of the cost currency (e.g.
     * "0.008"), rounded to 12 decimal places, for display only.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> costBasis() {
        return costBasis.asOptional();
    }

    /**
     * When the grant was recorded.
     *
     * @return the value, never null
     */
    public OffsetDateTime createdAt() {
        return Utils.required(createdAt, "created_at");
    }

    /**
     * The credit note that gave the credit back.
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
     * When the credit became spendable.
     *
     * @return the value, never null
     */
    public OffsetDateTime effectiveAt() {
        return Utils.required(effectiveAt, "effective_at");
    }

    /**
     * When the subscription the grant belongs to ended, if it ended. Unspent credit lapses then
     * (status EXPIRED), even before <code>expires_at</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> endedAt() {
        return endedAt.asOptional();
    }

    /**
     * Lost to expiry; present only on an expired grant.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> expiredAmount() {
        return expiredAmount.asOptional();
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
     * The grant's id (<code>cgr_…</code>).
     *
     * @return the value, never null
     */
    public String id() {
        return Utils.required(id, "id");
    }

    /**
     * The invoice that sold the credit, or whose void or negative total gave it back.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> invoiceId() {
        return invoiceId.asOptional();
    }

    /**
     * The group the grant is shown in: INCLUDED, PREPAID, BONUS or ACCOUNT_BALANCE.
     *
     * @return the value, never null
     */
    public CreditGrantKind kind() {
        return Utils.required(kind, "kind");
    }

    /**
     * The group's name as Meteroid shows it: "Included with &lt;plan&gt;", "Purchased credit",
     * "Free credit" or "Account balance".
     *
     * @return the value, never null
     */
    public String kindLabel() {
        return Utils.required(kindLabel, "kind_label");
    }

    /**
     * Lower values are drawn first among grants of the same type that pay the same charges; 100 by
     * default.
     *
     * @return the value, never null
     */
    public Integer priority() {
        return Utils.required(priority, "priority");
    }

    /**
     * Shown on the credit ledger.
     *
     * @return the value, never null
     */
    public String reason() {
        return Utils.required(reason, "reason");
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
     * Not spent yet, in the same minor units.
     *
     * @return the value, never null
     */
    public Long remaining() {
        return Utils.required(remaining, "remaining");
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
     * PENDING until <code>effective_at</code>, then ACTIVE, DEPLETED once spent, or EXPIRED.
     *
     * @return the value, never null
     */
    public CreditGrantStatus status() {
        return Utils.required(status, "status");
    }

    /**
     * The subscription the grant belongs to (<code>sub_…</code>): it pays only that subscription's
     * charges, and lapses when the subscription ends. Null when it pays any of the customer's
     * subscriptions.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * PAID or PROMOTIONAL: whether it applies after or before tax.
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
        CreditGrant that = (CreditGrant) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(applicableProductIds, that.applicableProductIds)
                && Objects.equals(appliesTo, that.appliesTo)
                && Objects.equals(bonusGrantId, that.bonusGrantId)
                && Objects.equals(cost, that.cost)
                && Objects.equals(costBasis, that.costBasis)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(creditNoteId, that.creditNoteId)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(effectiveAt, that.effectiveAt)
                && Objects.equals(endedAt, that.endedAt)
                && Objects.equals(expiredAmount, that.expiredAmount)
                && Objects.equals(expiresAt, that.expiresAt)
                && Objects.equals(id, that.id)
                && Objects.equals(invoiceId, that.invoiceId)
                && Objects.equals(kind, that.kind)
                && Objects.equals(kindLabel, that.kindLabel)
                && Objects.equals(priority, that.priority)
                && Objects.equals(reason, that.reason)
                && Objects.equals(reference, that.reference)
                && Objects.equals(remaining, that.remaining)
                && Objects.equals(source, that.source)
                && Objects.equals(status, that.status)
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
                bonusGrantId,
                cost,
                costBasis,
                createdAt,
                creditNoteId,
                creditUnit,
                creditUnitPrecision,
                currency,
                effectiveAt,
                endedAt,
                expiredAmount,
                expiresAt,
                id,
                invoiceId,
                kind,
                kindLabel,
                priority,
                reason,
                reference,
                remaining,
                source,
                status,
                subscriptionId,
                type,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditGrant{"
                + "amount="
                + amount
                + ", applicableProductIds="
                + applicableProductIds
                + ", appliesTo="
                + appliesTo
                + ", bonusGrantId="
                + bonusGrantId
                + ", cost="
                + cost
                + ", costBasis="
                + costBasis
                + ", createdAt="
                + createdAt
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
                + ", endedAt="
                + endedAt
                + ", expiredAmount="
                + expiredAmount
                + ", expiresAt="
                + expiresAt
                + ", id="
                + id
                + ", invoiceId="
                + invoiceId
                + ", kind="
                + kind
                + ", kindLabel="
                + kindLabel
                + ", priority="
                + priority
                + ", reason="
                + reason
                + ", reference="
                + reference
                + ", remaining="
                + remaining
                + ", source="
                + source
                + ", status="
                + status
                + ", subscriptionId="
                + subscriptionId
                + ", type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditGrant}. */
    public static final class Builder {
        private Long amount;
        private List<String> applicableProductIds;
        private CreditAppliesTo appliesTo;
        private JsonField<String> bonusGrantId = JsonField.missing();
        private JsonField<CreditCost> cost = JsonField.missing();
        private JsonField<String> costBasis = JsonField.missing();
        private OffsetDateTime createdAt;
        private JsonField<String> creditNoteId = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private OffsetDateTime effectiveAt;
        private JsonField<OffsetDateTime> endedAt = JsonField.missing();
        private JsonField<Long> expiredAmount = JsonField.missing();
        private JsonField<OffsetDateTime> expiresAt = JsonField.missing();
        private String id;
        private JsonField<String> invoiceId = JsonField.missing();
        private CreditGrantKind kind;
        private String kindLabel;
        private Integer priority;
        private String reason;
        private JsonField<String> reference = JsonField.missing();
        private Long remaining;
        private CreditGrantSource source;
        private CreditGrantStatus status;
        private JsonField<String> subscriptionId = JsonField.missing();
        private CreditGrantType type;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Amount granted, in minor units of <code>currency</code> or <code>credit_unit</code>.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * The products whose charges the credit pays, combined with <code>applies_to</code>; empty
         * when it applies to every product.
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
         * Only on the response that created a PAID currency grant whose <code>cost</code> was below
         * its amount: the PROMOTIONAL "Bonus credit" grant created beside it for the difference,
         * with the same expiry, scope and priority.
         *
         * @param bonusGrantId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder bonusGrantId(String bonusGrantId) {
            this.bonusGrantId = JsonField.ofNullable(bonusGrantId);
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
         * <code>cost</code> per one major unit of credit, in major units of the cost currency (e.g.
         * "0.008"), rounded to 12 decimal places, for display only.
         *
         * @param costBasis the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder costBasis(String costBasis) {
            this.costBasis = JsonField.ofNullable(costBasis);
            return this;
        }

        /**
         * When the grant was recorded.
         *
         * @param createdAt the value
         * @return this builder
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The credit note that gave the credit back.
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
         * When the credit became spendable.
         *
         * @param effectiveAt the value
         * @return this builder
         */
        public Builder effectiveAt(OffsetDateTime effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }

        /**
         * When the subscription the grant belongs to ended, if it ended. Unspent credit lapses then
         * (status EXPIRED), even before <code>expires_at</code>.
         *
         * @param endedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder endedAt(OffsetDateTime endedAt) {
            this.endedAt = JsonField.ofNullable(endedAt);
            return this;
        }

        /**
         * Lost to expiry; present only on an expired grant.
         *
         * @param expiredAmount the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder expiredAmount(Long expiredAmount) {
            this.expiredAmount = JsonField.ofNullable(expiredAmount);
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
         * The grant's id (<code>cgr_…</code>).
         *
         * @param id the value
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The invoice that sold the credit, or whose void or negative total gave it back.
         *
         * @param invoiceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder invoiceId(String invoiceId) {
            this.invoiceId = JsonField.ofNullable(invoiceId);
            return this;
        }

        /**
         * The group the grant is shown in: INCLUDED, PREPAID, BONUS or ACCOUNT_BALANCE.
         *
         * @param kind the value
         * @return this builder
         */
        public Builder kind(CreditGrantKind kind) {
            this.kind = kind;
            return this;
        }

        /**
         * The group's name as Meteroid shows it: "Included with &lt;plan&gt;", "Purchased credit",
         * "Free credit" or "Account balance".
         *
         * @param kindLabel the value
         * @return this builder
         */
        public Builder kindLabel(String kindLabel) {
            this.kindLabel = kindLabel;
            return this;
        }

        /**
         * Lower values are drawn first among grants of the same type that pay the same charges; 100
         * by default.
         *
         * @param priority the value
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Shown on the credit ledger.
         *
         * @param reason the value
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
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
         * Not spent yet, in the same minor units.
         *
         * @param remaining the value
         * @return this builder
         */
        public Builder remaining(Long remaining) {
            this.remaining = remaining;
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
         * PENDING until <code>effective_at</code>, then ACTIVE, DEPLETED once spent, or EXPIRED.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(CreditGrantStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The subscription the grant belongs to (<code>sub_…</code>): it pays only that
         * subscription's charges, and lapses when the subscription ends. Null when it pays any of
         * the customer's subscriptions.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * PAID or PROMOTIONAL: whether it applies after or before tax.
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
         * The {@code CreditGrant}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditGrant build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(applicableProductIds, "applicable_product_ids");
            Utils.checkRequired(appliesTo, "applies_to");
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(effectiveAt, "effective_at");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(kind, "kind");
            Utils.checkRequired(kindLabel, "kind_label");
            Utils.checkRequired(priority, "priority");
            Utils.checkRequired(reason, "reason");
            Utils.checkRequired(remaining, "remaining");
            Utils.checkRequired(source, "source");
            Utils.checkRequired(status, "status");
            Utils.checkRequired(type, "type");
            return new CreditGrant(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditGrant}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditGrant fromJson(String json) {
        return Utils.parse(json, CreditGrant.class);
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
