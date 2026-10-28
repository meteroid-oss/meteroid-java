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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
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
public final class UsageEvent {
    @JsonProperty("cost")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<UsageCost> cost = JsonField.missing();

    @JsonProperty("id")
    private String id;

    @JsonProperty("properties")
    private Map<String, String> properties;

    @JsonProperty("quantity")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> quantity = JsonField.missing();

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UsageEvent() {}

    private UsageEvent(Builder builder) {
        this.cost = builder.cost;
        this.id = builder.id;
        this.properties = Utils.copyMap(builder.properties);
        this.quantity = builder.quantity;
        this.timestamp = builder.timestamp;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UsageEvent}.
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
        builder.cost = cost;
        builder.id = id;
        builder.properties = Utils.mutableMap(properties);
        builder.quantity = quantity;
        builder.timestamp = timestamp;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code cost} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<UsageCost> cost() {
        return cost.asOptional();
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
     * The {@code properties} property.
     *
     * @return the value, never null
     */
    public Map<String, String> properties() {
        return Utils.required(properties, "properties");
    }

    /**
     * Billed units the event adds. Absent when the metric's aggregation cannot be split per event,
     * or when the event does not count towards the metric.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> quantity() {
        return quantity.asOptional();
    }

    /**
     * The {@code timestamp} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime timestamp() {
        return Utils.required(timestamp, "timestamp");
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
        UsageEvent that = (UsageEvent) o;
        return Objects.equals(cost, that.cost)
                && Objects.equals(id, that.id)
                && Objects.equals(properties, that.properties)
                && Objects.equals(quantity, that.quantity)
                && Objects.equals(timestamp, that.timestamp)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, id, properties, quantity, timestamp, additionalProperties);
    }

    @Override
    public String toString() {
        return "UsageEvent{"
                + "cost="
                + cost
                + ", id="
                + id
                + ", properties="
                + properties
                + ", quantity="
                + quantity
                + ", timestamp="
                + timestamp
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link UsageEvent}. */
    public static final class Builder {
        private JsonField<UsageCost> cost = JsonField.missing();
        private String id;
        private Map<String, String> properties;
        private JsonField<BigDecimal> quantity = JsonField.missing();
        private OffsetDateTime timestamp;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code cost} property.
         *
         * @param cost the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder cost(UsageCost cost) {
            this.cost = JsonField.ofNullable(cost);
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
         * The {@code properties} property.
         *
         * @param properties the value
         * @return this builder
         */
        public Builder properties(Map<String, String> properties) {
            this.properties = Utils.mutableMap(properties);
            return this;
        }

        /**
         * Puts an entry in {@code properties}.
         *
         * @param key the key
         * @param item the item
         * @return this builder
         */
        public Builder putPropertiesItem(String key, String item) {
            if (this.properties == null) {
                this.properties = new LinkedHashMap<>();
            }
            this.properties.put(key, item);
            return this;
        }

        /**
         * Billed units the event adds. Absent when the metric's aggregation cannot be split per
         * event, or when the event does not count towards the metric.
         *
         * @param quantity the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder quantity(BigDecimal quantity) {
            this.quantity = JsonField.ofNullable(quantity);
            return this;
        }

        /**
         * The {@code timestamp} property.
         *
         * @param timestamp the value
         * @return this builder
         */
        public Builder timestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
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
         * The {@code UsageEvent}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UsageEvent build() {
            Utils.checkRequired(id, "id");
            Utils.checkRequired(properties, "properties");
            Utils.checkRequired(timestamp, "timestamp");
            return new UsageEvent(this);
        }
    }

    /**
     * Parse {@code json} as {@code UsageEvent}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UsageEvent fromJson(String json) {
        return Utils.parse(json, UsageEvent.class);
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
