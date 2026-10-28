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
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Restricts the customer's usage events a subscription bills to those whose <code>property</code>
 * equals <code>value</code> (for example <code>api_key</code> = <code>key-A</code>). Among the
 * customer's subscriptions pricing the same metric, one with a usage filter bills the events
 * matching it (an event two filters match goes to the older subscription); one without bills the
 * events matching no other subscription's filter. Two subscriptions without a usage filter both
 * bill every such event. Events matching no filter while every subscription pricing their metric
 * has one are billed by none and reported as unattributed usage.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class UsageFilter {
    @JsonProperty("property")
    private String property;

    @JsonProperty("value")
    private String value;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UsageFilter() {}

    private UsageFilter(Builder builder) {
        this.property = builder.property;
        this.value = builder.value;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UsageFilter}.
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
        builder.property = property;
        builder.value = value;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Event property name, e.g. <code>api_key</code>.
     *
     * @return the value, never null
     */
    public String property() {
        return Utils.required(property, "property");
    }

    /**
     * Value the property must have.
     *
     * @return the value, never null
     */
    public String value() {
        return Utils.required(value, "value");
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
        UsageFilter that = (UsageFilter) o;
        return Objects.equals(property, that.property)
                && Objects.equals(value, that.value)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, value, additionalProperties);
    }

    @Override
    public String toString() {
        return "UsageFilter{"
                + "property="
                + property
                + ", value="
                + value
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link UsageFilter}. */
    public static final class Builder {
        private String property;
        private String value;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Event property name, e.g. <code>api_key</code>.
         *
         * @param property the value
         * @return this builder
         */
        public Builder property(String property) {
            this.property = property;
            return this;
        }

        /**
         * Value the property must have.
         *
         * @param value the value
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
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
         * The {@code UsageFilter}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UsageFilter build() {
            Utils.checkRequired(property, "property");
            Utils.checkRequired(value, "value");
            return new UsageFilter(this);
        }
    }

    /**
     * Parse {@code json} as {@code UsageFilter}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UsageFilter fromJson(String json) {
        return Utils.parse(json, UsageFilter.class);
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
