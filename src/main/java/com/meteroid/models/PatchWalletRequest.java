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
 * Partial update of a wallet's configuration: omit a field to leave it unchanged.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class PatchWalletRequest {
    @JsonProperty("auto_top_up")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<AutoTopUpWriteRequest> autoTopUp = JsonField.missing();

    @JsonProperty("low_balance_thresholds")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<Long>> lowBalanceThresholds = JsonField.missing();

    @JsonProperty("unit_price")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> unitPrice = JsonField.missing();

    @JsonProperty("usage_at_zero")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<UsageAtZero> usageAtZero = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private PatchWalletRequest() {}

    private PatchWalletRequest(Builder builder) {
        this.autoTopUp = builder.autoTopUp;
        this.lowBalanceThresholds = builder.lowBalanceThresholds.map(Utils::copyList);
        this.unitPrice = builder.unitPrice;
        this.usageAtZero = builder.usageAtZero;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code PatchWalletRequest}.
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
        builder.autoTopUp = autoTopUp;
        builder.lowBalanceThresholds = lowBalanceThresholds.map(Utils::mutableList);
        builder.unitPrice = unitPrice;
        builder.usageAtZero = usageAtZero;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code auto_top_up} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<AutoTopUpWriteRequest> autoTopUp() {
        return autoTopUp.asOptional();
    }

    /**
     * Ascending, distinct, at most 5, non-negative. Omit to leave unchanged; an empty list clears
     * every threshold.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<Long>> lowBalanceThresholds() {
        return lowBalanceThresholds.asOptional();
    }

    /**
     * Credit unit wallets: the price this customer agreed for one credit, in major units of the
     * customer's currency, as a decimal string (positive, at most 12 decimal places). Purchases and
     * automatic top-ups default to it instead of the list price. Omit to leave it unchanged; <code>
     * null</code> returns the customer to the list price. A change applies to purchases quoted
     * after it. An automatic top-up keeps running at the new price when it is at or below the price
     * its terms were authorized at, and stops until they are confirmed again when it is above.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> unitPrice() {
        return unitPrice.asOptional();
    }

    /**
     * The {@code usage_at_zero} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<UsageAtZero> usageAtZero() {
        return usageAtZero.asOptional();
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
        PatchWalletRequest that = (PatchWalletRequest) o;
        return Objects.equals(autoTopUp, that.autoTopUp)
                && Objects.equals(lowBalanceThresholds, that.lowBalanceThresholds)
                && Objects.equals(unitPrice, that.unitPrice)
                && Objects.equals(usageAtZero, that.usageAtZero)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                autoTopUp, lowBalanceThresholds, unitPrice, usageAtZero, additionalProperties);
    }

    @Override
    public String toString() {
        return "PatchWalletRequest{"
                + "autoTopUp="
                + autoTopUp
                + ", lowBalanceThresholds="
                + lowBalanceThresholds
                + ", unitPrice="
                + unitPrice
                + ", usageAtZero="
                + usageAtZero
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link PatchWalletRequest}. */
    public static final class Builder {
        private JsonField<AutoTopUpWriteRequest> autoTopUp = JsonField.missing();
        private JsonField<List<Long>> lowBalanceThresholds = JsonField.missing();
        private JsonField<String> unitPrice = JsonField.missing();
        private JsonField<UsageAtZero> usageAtZero = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code auto_top_up} property.
         *
         * @param autoTopUp the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder autoTopUp(AutoTopUpWriteRequest autoTopUp) {
            this.autoTopUp = JsonField.ofNullable(autoTopUp);
            return this;
        }

        /**
         * Ascending, distinct, at most 5, non-negative. Omit to leave unchanged; an empty list
         * clears every threshold.
         *
         * @param lowBalanceThresholds the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder lowBalanceThresholds(List<Long> lowBalanceThresholds) {
            this.lowBalanceThresholds =
                    JsonField.ofNullable(Utils.mutableList(lowBalanceThresholds));
            return this;
        }

        /**
         * Adds an item to {@code low_balance_thresholds}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addLowBalanceThresholdsItem(Long item) {
            List<Long> items = this.lowBalanceThresholds.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.lowBalanceThresholds = JsonField.ofNullable(items);
            }
            items.add(item);
            return this;
        }

        /**
         * Credit unit wallets: the price this customer agreed for one credit, in major units of the
         * customer's currency, as a decimal string (positive, at most 12 decimal places). Purchases
         * and automatic top-ups default to it instead of the list price. Omit to leave it
         * unchanged; <code>null</code> returns the customer to the list price. A change applies to
         * purchases quoted after it. An automatic top-up keeps running at the new price when it is
         * at or below the price its terms were authorized at, and stops until they are confirmed
         * again when it is above.
         *
         * @param unitPrice the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = JsonField.ofNullable(unitPrice);
            return this;
        }

        /**
         * The {@code usage_at_zero} property.
         *
         * @param usageAtZero the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder usageAtZero(UsageAtZero usageAtZero) {
            this.usageAtZero = JsonField.ofNullable(usageAtZero);
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
         * The {@code PatchWalletRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public PatchWalletRequest build() {
            return new PatchWalletRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code PatchWalletRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static PatchWalletRequest fromJson(String json) {
        return Utils.parse(json, PatchWalletRequest.class);
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
