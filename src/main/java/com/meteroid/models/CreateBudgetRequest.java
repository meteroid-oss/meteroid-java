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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreateBudgetRequest {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("behavior")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BudgetBehavior> behavior = JsonField.missing();

    @JsonProperty("credit_unit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> creditUnit = JsonField.missing();

    @JsonProperty("currency")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Currency> currency = JsonField.missing();

    @JsonProperty("subscription_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> subscriptionId = JsonField.missing();

    @JsonProperty("thresholds")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<Integer>> thresholds = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreateBudgetRequest() {}

    private CreateBudgetRequest(Builder builder) {
        this.amount = builder.amount;
        this.behavior = builder.behavior;
        this.creditUnit = builder.creditUnit;
        this.currency = builder.currency;
        this.subscriptionId = builder.subscriptionId;
        this.thresholds = builder.thresholds.map(Utils::copyList);
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreateBudgetRequest}.
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
        builder.behavior = behavior;
        builder.creditUnit = creditUnit;
        builder.currency = currency;
        builder.subscriptionId = subscriptionId;
        builder.thresholds = thresholds.map(Utils::mutableList);
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
     * The {@code behavior} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BudgetBehavior> behavior() {
        return behavior.asOptional();
    }

    /**
     * A credit unit (its code): the budget counts the usage priced in that unit, in its minor
     * units.
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
     * An active subscription of the customer (<code>sub_…</code>): the budget then counts only that
     * subscription's spend, in its currency. Absent counts the whole customer's.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> subscriptionId() {
        return subscriptionId.asOptional();
    }

    /**
     * Percentages of the amount (1 to 100, at most 10). Defaults to 50, 80 and 100.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<Integer>> thresholds() {
        return thresholds.asOptional();
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
        CreateBudgetRequest that = (CreateBudgetRequest) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(behavior, that.behavior)
                && Objects.equals(creditUnit, that.creditUnit)
                && Objects.equals(currency, that.currency)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(thresholds, that.thresholds)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                amount,
                behavior,
                creditUnit,
                currency,
                subscriptionId,
                thresholds,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreateBudgetRequest{"
                + "amount="
                + amount
                + ", behavior="
                + behavior
                + ", creditUnit="
                + creditUnit
                + ", currency="
                + currency
                + ", subscriptionId="
                + subscriptionId
                + ", thresholds="
                + thresholds
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreateBudgetRequest}. */
    public static final class Builder {
        private Long amount;
        private JsonField<BudgetBehavior> behavior = JsonField.missing();
        private JsonField<String> creditUnit = JsonField.missing();
        private JsonField<Currency> currency = JsonField.missing();
        private JsonField<String> subscriptionId = JsonField.missing();
        private JsonField<List<Integer>> thresholds = JsonField.missing();
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
         * The {@code behavior} property.
         *
         * @param behavior the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder behavior(BudgetBehavior behavior) {
            this.behavior = JsonField.ofNullable(behavior);
            return this;
        }

        /**
         * A credit unit (its code): the budget counts the usage priced in that unit, in its minor
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
         * An active subscription of the customer (<code>sub_…</code>): the budget then counts only
         * that subscription's spend, in its currency. Absent counts the whole customer's.
         *
         * @param subscriptionId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = JsonField.ofNullable(subscriptionId);
            return this;
        }

        /**
         * Percentages of the amount (1 to 100, at most 10). Defaults to 50, 80 and 100.
         *
         * @param thresholds the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder thresholds(List<Integer> thresholds) {
            this.thresholds = JsonField.ofNullable(Utils.mutableList(thresholds));
            return this;
        }

        /**
         * Adds an item to {@code thresholds}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addThresholdsItem(Integer item) {
            List<Integer> items = this.thresholds.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.thresholds = JsonField.ofNullable(items);
            }
            items.add(item);
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
         * The {@code CreateBudgetRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreateBudgetRequest build() {
            Utils.checkRequired(amount, "amount");
            return new CreateBudgetRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreateBudgetRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreateBudgetRequest fromJson(String json) {
        return Utils.parse(json, CreateBudgetRequest.class);
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
