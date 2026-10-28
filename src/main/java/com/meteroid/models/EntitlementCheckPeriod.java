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
public final class EntitlementCheckPeriod {
    @JsonProperty("end")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> end = JsonField.missing();

    @JsonProperty("start")
    private OffsetDateTime start;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private EntitlementCheckPeriod() {}

    private EntitlementCheckPeriod(Builder builder) {
        this.end = builder.end;
        this.start = builder.start;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code EntitlementCheckPeriod}.
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
        builder.end = end;
        builder.start = start;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Absent when the period never ends.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> end() {
        return end.asOptional();
    }

    /**
     * The {@code start} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime start() {
        return Utils.required(start, "start");
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
        EntitlementCheckPeriod that = (EntitlementCheckPeriod) o;
        return Objects.equals(end, that.end)
                && Objects.equals(start, that.start)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(end, start, additionalProperties);
    }

    @Override
    public String toString() {
        return "EntitlementCheckPeriod{"
                + "end="
                + end
                + ", start="
                + start
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link EntitlementCheckPeriod}. */
    public static final class Builder {
        private JsonField<OffsetDateTime> end = JsonField.missing();
        private OffsetDateTime start;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Absent when the period never ends.
         *
         * @param end the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder end(OffsetDateTime end) {
            this.end = JsonField.ofNullable(end);
            return this;
        }

        /**
         * The {@code start} property.
         *
         * @param start the value
         * @return this builder
         */
        public Builder start(OffsetDateTime start) {
            this.start = start;
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
         * The {@code EntitlementCheckPeriod}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public EntitlementCheckPeriod build() {
            Utils.checkRequired(start, "start");
            return new EntitlementCheckPeriod(this);
        }
    }

    /**
     * Parse {@code json} as {@code EntitlementCheckPeriod}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static EntitlementCheckPeriod fromJson(String json) {
        return Utils.parse(json, EntitlementCheckPeriod.class);
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
