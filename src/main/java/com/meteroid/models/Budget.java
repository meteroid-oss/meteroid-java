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
 * A spending limit for one currency, set by you or by the customer, with alerts at percentages of
 * it. It counts the customer's whole spend, or one subscription's. A HARD budget also refuses
 * access once reached. A budget never charges the customer.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class Budget {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("archived_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> archivedAt = JsonField.missing();

    @JsonProperty("as_of")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> asOf = JsonField.missing();

    @JsonProperty("behavior")
    private BudgetBehavior behavior;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("created_by")
    private BudgetAuthor createdBy;

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("credit_unit_precision")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> creditUnitPrecision = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("estimated_spend")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> estimatedSpend = JsonField.missing();

    @JsonProperty("exact")
    private Boolean exact;

    @JsonProperty("id")
    private String id;

    @JsonProperty("period")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BudgetPeriod> period = JsonField.missing();

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("thresholds")
    private List<Integer> thresholds;

    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    @JsonProperty("version")
    private Integer version;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private Budget() {}

    private Budget(Builder builder) {
        this.amount = builder.amount;
        this.archivedAt = builder.archivedAt;
        this.asOf = builder.asOf;
        this.behavior = builder.behavior;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.creditUnit = builder.creditUnit;
        this.creditUnitPrecision = builder.creditUnitPrecision;
        this.currency = builder.currency;
        this.estimatedSpend = builder.estimatedSpend;
        this.exact = builder.exact;
        this.id = builder.id;
        this.period = builder.period;
        this.subscriptionId = builder.subscriptionId;
        this.thresholds = Utils.copyList(builder.thresholds);
        this.updatedAt = builder.updatedAt;
        this.version = builder.version;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code Budget}.
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
        builder.archivedAt = archivedAt;
        builder.asOf = asOf;
        builder.behavior = behavior;
        builder.createdAt = createdAt;
        builder.createdBy = createdBy;
        builder.creditUnit = creditUnit;
        builder.creditUnitPrecision = creditUnitPrecision;
        builder.currency = currency;
        builder.estimatedSpend = estimatedSpend;
        builder.exact = exact;
        builder.id = id;
        builder.period = period;
        builder.subscriptionId = subscriptionId;
        builder.thresholds = Utils.mutableList(thresholds);
        builder.updatedAt = updatedAt;
        builder.version = version;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * In minor units of the currency or credit unit.
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * The {@code archived_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> archivedAt() {
        return archivedAt.asOptional();
    }

    /**
     * When <code>estimated_spend</code> was last measured.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> asOf() {
        return asOf.asOptional();
    }

    /**
     * The {@code behavior} property.
     *
     * @return the value, never null
     */
    public BudgetBehavior behavior() {
        return Utils.required(behavior, "behavior");
    }

    /**
     * The {@code created_at} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime createdAt() {
        return Utils.required(createdAt, "created_at");
    }

    /**
     * The {@code created_by} property.
     *
     * @return the value, never null
     */
    public BudgetAuthor createdBy() {
        return Utils.required(createdBy, "created_by");
    }

    /**
     * The credit unit (its code) whose usage the budget counts; absent for a currency.
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
     * Spend in the current billing period, including usage not invoiced yet, in minor units. Absent
     * until first measured.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> estimatedSpend() {
        return estimatedSpend.asOptional();
    }

    /**
     * Always false: the estimate prices usage that is not yet invoiced.
     *
     * @return the value, never null
     */
    public Boolean exact() {
        return Utils.required(exact, "exact");
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
     * The {@code period} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BudgetPeriod> period() {
        return period.asOptional();
    }

    /**
     * The subscription whose spend the budget counts; null when it counts the whole customer's.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * Percentages of the amount at which an alert is sent.
     *
     * @return the value, never null
     */
    public List<Integer> thresholds() {
        return Utils.required(thresholds, "thresholds");
    }

    /**
     * The {@code updated_at} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime updatedAt() {
        return Utils.required(updatedAt, "updated_at");
    }

    /**
     * Send it back as <code>expected_version</code> when patching.
     *
     * @return the value, never null
     */
    public Integer version() {
        return Utils.required(version, "version");
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
        Budget that = (Budget) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(archivedAt, that.archivedAt)
                && Objects.equals(asOf, that.asOf)
                && Objects.equals(behavior, that.behavior)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(createdBy, that.createdBy)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(creditUnitPrecision, that.creditUnitPrecision)
                && Objects.equals(currency, that.currency)
                && Objects.equals(estimatedSpend, that.estimatedSpend)
                && Objects.equals(exact, that.exact)
                && Objects.equals(id, that.id)
                && Objects.equals(period, that.period)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(thresholds, that.thresholds)
                && Objects.equals(updatedAt, that.updatedAt)
                && Objects.equals(version, that.version)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                archivedAt,
                asOf,
                behavior,
                createdAt,
                createdBy,
                creditUnit,
                creditUnitPrecision,
                currency,
                estimatedSpend,
                exact,
                id,
                period,
                subscriptionId,
                thresholds,
                updatedAt,
                version,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "Budget{"
                + "amount="
                + amount
                + ", archivedAt="
                + archivedAt
                + ", asOf="
                + asOf
                + ", behavior="
                + behavior
                + ", createdAt="
                + createdAt
                + ", createdBy="
                + createdBy
                + ", creditUnit="
                + creditUnit
                + ", creditUnitPrecision="
                + creditUnitPrecision
                + ", currency="
                + currency
                + ", estimatedSpend="
                + estimatedSpend
                + ", exact="
                + exact
                + ", id="
                + id
                + ", period="
                + period
                + ", subscriptionId="
                + subscriptionId
                + ", thresholds="
                + thresholds
                + ", updatedAt="
                + updatedAt
                + ", version="
                + version
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link Budget}. */
    public static final class Builder {
        private Long amount;
        private JsonField<OffsetDateTime> archivedAt = JsonField.missing();
        private JsonField<OffsetDateTime> asOf = JsonField.missing();
        private BudgetBehavior behavior;
        private OffsetDateTime createdAt;
        private BudgetAuthor createdBy;
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Integer> creditUnitPrecision = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private JsonField<Long> estimatedSpend = JsonField.missing();
        private Boolean exact;
        private String id;
        private JsonField<BudgetPeriod> period = JsonField.missing();
        private JsonField<String> subscriptionId = JsonField.missing();
        private List<Integer> thresholds;
        private OffsetDateTime updatedAt;
        private Integer version;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * In minor units of the currency or credit unit.
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * The {@code archived_at} property.
         *
         * @param archivedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder archivedAt(OffsetDateTime archivedAt) {
            this.archivedAt = JsonField.ofNullable(archivedAt);
            return this;
        }

        /**
         * When <code>estimated_spend</code> was last measured.
         *
         * @param asOf the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder asOf(OffsetDateTime asOf) {
            this.asOf = JsonField.ofNullable(asOf);
            return this;
        }

        /**
         * The {@code behavior} property.
         *
         * @param behavior the value
         * @return this builder
         */
        public Builder behavior(BudgetBehavior behavior) {
            this.behavior = behavior;
            return this;
        }

        /**
         * The {@code created_at} property.
         *
         * @param createdAt the value
         * @return this builder
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The {@code created_by} property.
         *
         * @param createdBy the value
         * @return this builder
         */
        public Builder createdBy(BudgetAuthor createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * The credit unit (its code) whose usage the budget counts; absent for a currency.
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
         * Spend in the current billing period, including usage not invoiced yet, in minor units.
         * Absent until first measured.
         *
         * @param estimatedSpend the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder estimatedSpend(Long estimatedSpend) {
            this.estimatedSpend = JsonField.ofNullable(estimatedSpend);
            return this;
        }

        /**
         * Always false: the estimate prices usage that is not yet invoiced.
         *
         * @param exact the value
         * @return this builder
         */
        public Builder exact(Boolean exact) {
            this.exact = exact;
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
         * The {@code period} property.
         *
         * @param period the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder period(BudgetPeriod period) {
            this.period = JsonField.ofNullable(period);
            return this;
        }

        /**
         * The subscription whose spend the budget counts; null when it counts the whole customer's.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * Percentages of the amount at which an alert is sent.
         *
         * @param thresholds the value
         * @return this builder
         */
        public Builder thresholds(List<Integer> thresholds) {
            this.thresholds = Utils.mutableList(thresholds);
            return this;
        }

        /**
         * Adds an item to {@code thresholds}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addThresholdsItem(Integer item) {
            if (this.thresholds == null) {
                this.thresholds = new ArrayList<>();
            }
            this.thresholds.add(item);
            return this;
        }

        /**
         * The {@code updated_at} property.
         *
         * @param updatedAt the value
         * @return this builder
         */
        public Builder updatedAt(OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Send it back as <code>expected_version</code> when patching.
         *
         * @param version the value
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
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
         * The {@code Budget}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public Budget build() {
            Utils.checkRequired(amount, "amount");
            Utils.checkRequired(behavior, "behavior");
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(createdBy, "created_by");
            Utils.checkRequired(exact, "exact");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(thresholds, "thresholds");
            Utils.checkRequired(updatedAt, "updated_at");
            Utils.checkRequired(version, "version");
            return new Budget(this);
        }
    }

    /**
     * Parse {@code json} as {@code Budget}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static Budget fromJson(String json) {
        return Utils.parse(json, Budget.class);
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
