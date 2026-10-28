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
 * The currency or credit unit, and the subscription, are fixed at creation.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class PatchBudgetRequest {
    @JsonProperty("amount")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Long> amount = JsonField.missing();

    @JsonProperty("behavior")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BudgetBehavior> behavior = JsonField.missing();

    @JsonProperty("expected_version")
    private Integer expectedVersion;

    @JsonProperty("thresholds")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<Integer>> thresholds = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private PatchBudgetRequest() {}

    private PatchBudgetRequest(Builder builder) {
        this.amount = builder.amount;
        this.behavior = builder.behavior;
        this.expectedVersion = builder.expectedVersion;
        this.thresholds = builder.thresholds.map(Utils::copyList);
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code PatchBudgetRequest}.
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
        builder.expectedVersion = expectedVersion;
        builder.thresholds = thresholds.map(Utils::mutableList);
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code amount} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Long> amount() {
        return amount.asOptional();
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
     * The <code>version</code> you read; a newer stored version is refused with 409.
     *
     * @return the value, never null
     */
    public Integer expectedVersion() {
        return Utils.required(expectedVersion, "expected_version");
    }

    /**
     * The {@code thresholds} property.
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
        PatchBudgetRequest that = (PatchBudgetRequest) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(behavior, that.behavior)
                && Objects.equals(expectedVersion, that.expectedVersion)
                && Objects.equals(thresholds, that.thresholds)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, behavior, expectedVersion, thresholds, additionalProperties);
    }

    @Override
    public String toString() {
        return "PatchBudgetRequest{"
                + "amount="
                + amount
                + ", behavior="
                + behavior
                + ", expectedVersion="
                + expectedVersion
                + ", thresholds="
                + thresholds
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link PatchBudgetRequest}. */
    public static final class Builder {
        private JsonField<Long> amount = JsonField.missing();
        private JsonField<BudgetBehavior> behavior = JsonField.missing();
        private Integer expectedVersion;
        private JsonField<List<Integer>> thresholds = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code amount} property.
         *
         * @param amount the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = JsonField.ofNullable(amount);
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
         * The <code>version</code> you read; a newer stored version is refused with 409.
         *
         * @param expectedVersion the value
         * @return this builder
         */
        public Builder expectedVersion(Integer expectedVersion) {
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * The {@code thresholds} property.
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
         * The {@code PatchBudgetRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public PatchBudgetRequest build() {
            Utils.checkRequired(expectedVersion, "expected_version");
            return new PatchBudgetRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code PatchBudgetRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static PatchBudgetRequest fromJson(String json) {
        return Utils.parse(json, PatchBudgetRequest.class);
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
