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
 * A tenant-defined denomination usage can be priced or credit granted in, instead of money. <code>
 * code</code> and <code>precision</code> are immutable once created.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreditUnit {
    @JsonProperty("archived")
    private Boolean archived;

    @JsonProperty("code")
    private String code;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("plural_name")
    private String pluralName;

    @JsonProperty("precision")
    private Integer precision;

    @JsonProperty("prices")
    private List<CreditUnitPrice> prices;

    @JsonProperty("product_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> productId = JsonField.missing();

    @JsonProperty("symbol")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> symbol = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreditUnit() {}

    private CreditUnit(Builder builder) {
        this.archived = builder.archived;
        this.code = builder.code;
        this.id = builder.id;
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.precision = builder.precision;
        this.prices = Utils.copyList(builder.prices);
        this.productId = builder.productId;
        this.symbol = builder.symbol;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreditUnit}.
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
        builder.archived = archived;
        builder.code = code;
        builder.id = id;
        builder.name = name;
        builder.pluralName = pluralName;
        builder.precision = precision;
        builder.prices = Utils.mutableList(prices);
        builder.productId = productId;
        builder.symbol = symbol;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Archived units take no new prices, packs or grants; existing ones keep working.
     *
     * @return the value, never null
     */
    public Boolean archived() {
        return Utils.required(archived, "archived");
    }

    /**
     * Upper-case code naming the unit in wallets, grants and webhooks, e.g. <code>CREDITS</code>.
     *
     * @return the value, never null
     */
    public String code() {
        return Utils.required(code, "code");
    }

    /**
     * The unit's id (<code>cun_…</code>).
     *
     * @return the value, never null
     */
    public String id() {
        return Utils.required(id, "id");
    }

    /**
     * Singular display name, e.g. "Credit".
     *
     * @return the value, never null
     */
    public String name() {
        return Utils.required(name, "name");
    }

    /**
     * Plural display name, e.g. "Credits".
     *
     * @return the value, never null
     */
    public String pluralName() {
        return Utils.required(pluralName, "plural_name");
    }

    /**
     * Minor-unit exponent: amounts of this unit are integers of 10^-precision credit.
     *
     * @return the value, never null
     */
    public Integer precision() {
        return Utils.required(precision, "precision");
    }

    /**
     * The active selling prices, one per currency.
     *
     * @return the value, never null
     */
    public List<CreditUnitPrice> prices() {
        return Utils.required(prices, "prices");
    }

    /**
     * The product sales of this unit are booked under: their tax category and accounting code. The
     * unit can be sold (top-ups) only once it is set.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> productId() {
        return productId.asOptional();
    }

    /**
     * Short display symbol, e.g. "cr".
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> symbol() {
        return symbol.asOptional();
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
        CreditUnit that = (CreditUnit) o;
        return Objects.equals(archived, that.archived)
                && Objects.equals(code, that.code)
                && Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(pluralName, that.pluralName)
                && Objects.equals(precision, that.precision)
                && Objects.equals(prices, that.prices)
                && Objects.equals(productId, that.productId)
                && Objects.equals(symbol, that.symbol)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                archived,
                code,
                id,
                name,
                pluralName,
                precision,
                prices,
                productId,
                symbol,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreditUnit{"
                + "archived="
                + archived
                + ", code="
                + code
                + ", id="
                + id
                + ", name="
                + name
                + ", pluralName="
                + pluralName
                + ", precision="
                + precision
                + ", prices="
                + prices
                + ", productId="
                + productId
                + ", symbol="
                + symbol
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreditUnit}. */
    public static final class Builder {
        private Boolean archived;
        private String code;
        private String id;
        private String name;
        private String pluralName;
        private Integer precision;
        private List<CreditUnitPrice> prices;
        private JsonField<String> productId = JsonField.missing();
        private JsonField<String> symbol = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Archived units take no new prices, packs or grants; existing ones keep working.
         *
         * @param archived the value
         * @return this builder
         */
        public Builder archived(Boolean archived) {
            this.archived = archived;
            return this;
        }

        /**
         * Upper-case code naming the unit in wallets, grants and webhooks, e.g. <code>CREDITS
         * </code>.
         *
         * @param code the value
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The unit's id (<code>cun_…</code>).
         *
         * @param id the value
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Singular display name, e.g. "Credit".
         *
         * @param name the value
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Plural display name, e.g. "Credits".
         *
         * @param pluralName the value
         * @return this builder
         */
        public Builder pluralName(String pluralName) {
            this.pluralName = pluralName;
            return this;
        }

        /**
         * Minor-unit exponent: amounts of this unit are integers of 10^-precision credit.
         *
         * @param precision the value
         * @return this builder
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /**
         * The active selling prices, one per currency.
         *
         * @param prices the value
         * @return this builder
         */
        public Builder prices(List<CreditUnitPrice> prices) {
            this.prices = Utils.mutableList(prices);
            return this;
        }

        /**
         * Adds an item to {@code prices}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addPricesItem(CreditUnitPrice item) {
            if (this.prices == null) {
                this.prices = new ArrayList<>();
            }
            this.prices.add(item);
            return this;
        }

        /**
         * The product sales of this unit are booked under: their tax category and accounting code.
         * The unit can be sold (top-ups) only once it is set.
         *
         * @param productId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder productId(String productId) {
            this.productId = JsonField.ofNullable(productId);
            return this;
        }

        /**
         * Short display symbol, e.g. "cr".
         *
         * @param symbol the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder symbol(String symbol) {
            this.symbol = JsonField.ofNullable(symbol);
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
         * The {@code CreditUnit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreditUnit build() {
            Utils.checkRequired(archived, "archived");
            Utils.checkRequired(code, "code");
            Utils.checkRequired(id, "id");
            Utils.checkRequired(name, "name");
            Utils.checkRequired(pluralName, "plural_name");
            Utils.checkRequired(precision, "precision");
            Utils.checkRequired(prices, "prices");
            return new CreditUnit(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreditUnit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditUnit fromJson(String json) {
        return Utils.parse(json, CreditUnit.class);
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
