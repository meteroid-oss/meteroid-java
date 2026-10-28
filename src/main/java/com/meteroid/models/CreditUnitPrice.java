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
 * What one credit sells for in a currency. A price is never edited: setting a new one for the same
 * currency archives it.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditUnitPrice {
    @JsonProperty("archived_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> archivedAt = JsonField.missing();

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("id")
    private String id;

    @JsonProperty("unit_price")
    private String unitPrice;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditUnitPrice() {}

    private CreditUnitPrice(Builder builder) {
        this.archivedAt = builder.archivedAt;
        this.createdAt = builder.createdAt;
        this.currency = builder.currency;
        this.id = builder.id;
        this.unitPrice = builder.unitPrice;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditUnitPrice}.
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
        builder.archivedAt = archivedAt;
        builder.createdAt = createdAt;
        builder.currency = currency;
        builder.id = id;
        builder.unitPrice = unitPrice;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * When a newer price, or its removal, replaced it; absent while active.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> archivedAt() {
        return archivedAt.asOptional();
    }

    /**
     * When the price was set.
     *
     * @return the value, never null
     */
    public OffsetDateTime createdAt() {
        return Utils.required(createdAt, "created_at");
    }

    /**
     * ISO 4217 code of the currency the unit sells in.
     *
     * @return the value, never null
     */
    public String currency() {
        return Utils.required(currency, "currency");
    }

    /**
     * The price's id (<code>cup_…</code>).
     *
     * @return the value, never null
     */
    public String id() {
        return Utils.required(id, "id");
    }

    /**
     * Major units of <code>currency</code> per credit, as a decimal string (e.g. "0.001").
     *
     * @return the value, never null
     */
    public String unitPrice() {
        return Utils.required(unitPrice, "unit_price");
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
        CreditUnitPrice that = (CreditUnitPrice) o;
        return Objects.equals(archivedAt, that.archivedAt)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(currency, that.currency)
                && Objects.equals(id, that.id)
                && Objects.equals(unitPrice, that.unitPrice)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(archivedAt, createdAt, currency, id, unitPrice, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditUnitPrice{"
                + "archivedAt="
                + archivedAt
                + ", createdAt="
                + createdAt
                + ", currency="
                + currency
                + ", id="
                + id
                + ", unitPrice="
                + unitPrice
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditUnitPrice}. */
    public static final class Builder {
        private JsonField<OffsetDateTime> archivedAt = JsonField.missing();
        private OffsetDateTime createdAt;
        private String currency;
        private String id;
        private String unitPrice;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * When a newer price, or its removal, replaced it; absent while active.
         *
         * @param archivedAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder archivedAt(OffsetDateTime archivedAt) {
            this.archivedAt = JsonField.ofNullable(archivedAt);
            return this;
        }

        /**
         * When the price was set.
         *
         * @param createdAt the value
         * @return this builder
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * ISO 4217 code of the currency the unit sells in.
         *
         * @param currency the value
         * @return this builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * The price's id (<code>cup_…</code>).
         *
         * @param id the value
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Major units of <code>currency</code> per credit, as a decimal string (e.g. "0.001").
         *
         * @param unitPrice the value
         * @return this builder
         */
        public Builder unitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
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
         * The {@code CreditUnitPrice}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditUnitPrice build() {
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(currency, "currency");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(unitPrice, "unit_price");
            return new CreditUnitPrice(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditUnitPrice}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditUnitPrice fromJson(String json) {
        return Utils.parse(json, CreditUnitPrice.class);
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
