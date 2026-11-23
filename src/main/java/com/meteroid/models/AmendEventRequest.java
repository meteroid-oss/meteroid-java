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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class AmendEventRequest {
    @JsonProperty("allow_backfilling")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Boolean> allowBackfilling = JsonField.missing();

    @JsonProperty("customer_alias")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> customerAlias = JsonField.missing();

    @JsonProperty("customer_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> customerId = JsonField.missing();

    @JsonProperty("properties")
    private Map<String, String> properties;

    @JsonProperty("timestamp")
    private OffsetDateTime timestamp;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private AmendEventRequest() {}

    private AmendEventRequest(Builder builder) {
        this.allowBackfilling = builder.allowBackfilling;
        this.customerAlias = builder.customerAlias;
        this.customerId = builder.customerId;
        this.properties = Utils.copyMap(builder.properties);
        this.timestamp = builder.timestamp;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code AmendEventRequest}.
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
        builder.allowBackfilling = allowBackfilling;
        builder.customerAlias = customerAlias;
        builder.customerId = customerId;
        builder.properties = Utils.mutableMap(properties);
        builder.timestamp = timestamp;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Allow a timestamp more than 1 day in the past. Defaults to <code>false</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Boolean> allowBackfilling() {
        return allowBackfilling.asOptional();
    }

    /**
     * External customer alias of the event. Set this or <code>customer_id</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> customerAlias() {
        return customerAlias.asOptional();
    }

    /**
     * Meteroid customer ID of the event. Set this or <code>customer_alias</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> customerId() {
        return customerId.asOptional();
    }

    /**
     * The corrected properties. They replace the stored ones.
     *
     * @return the value, never null
     */
    public Map<String, String> properties() {
        return Utils.required(properties, "properties");
    }

    /**
     * RFC 3339 timestamp of the corrected event. Must be between 24 hours ago and 1 hour from now.
     * Set <code>allow_backfilling</code> to remove the past limit.
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
        AmendEventRequest that = (AmendEventRequest) o;
        return Objects.equals(allowBackfilling, that.allowBackfilling)
                && Objects.equals(customerAlias, that.customerAlias)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(properties, that.properties)
                && Objects.equals(timestamp, that.timestamp)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowBackfilling,
                customerAlias,
                customerId,
                properties,
                timestamp,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "AmendEventRequest{"
                + "allowBackfilling="
                + allowBackfilling
                + ", customerAlias="
                + customerAlias
                + ", customerId="
                + customerId
                + ", properties="
                + properties
                + ", timestamp="
                + timestamp
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link AmendEventRequest}. */
    public static final class Builder {
        private JsonField<Boolean> allowBackfilling = JsonField.missing();
        private JsonField<String> customerAlias = JsonField.missing();
        private JsonField<String> customerId = JsonField.missing();
        private Map<String, String> properties;
        private OffsetDateTime timestamp;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Allow a timestamp more than 1 day in the past. Defaults to <code>false</code>.
         *
         * @param allowBackfilling the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder allowBackfilling(Boolean allowBackfilling) {
            this.allowBackfilling = JsonField.ofNullable(allowBackfilling);
            return this;
        }

        /**
         * External customer alias of the event. Set this or <code>customer_id</code>.
         *
         * @param customerAlias the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder customerAlias(String customerAlias) {
            this.customerAlias = JsonField.ofNullable(customerAlias);
            return this;
        }

        /**
         * Meteroid customer ID of the event. Set this or <code>customer_alias</code>.
         *
         * @param customerId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder customerId(String customerId) {
            this.customerId = JsonField.ofNullable(customerId);
            return this;
        }

        /**
         * The corrected properties. They replace the stored ones.
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
         * RFC 3339 timestamp of the corrected event. Must be between 24 hours ago and 1 hour from
         * now. Set <code>allow_backfilling</code> to remove the past limit.
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
         * The {@code AmendEventRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public AmendEventRequest build() {
            Utils.checkRequired(properties, "properties");
            Utils.checkRequired(timestamp, "timestamp");
            return new AmendEventRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code AmendEventRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static AmendEventRequest fromJson(String json) {
        return Utils.parse(json, AmendEventRequest.class);
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
