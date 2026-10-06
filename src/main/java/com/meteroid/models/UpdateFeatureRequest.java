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

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Partial update. Code, feature type and product are immutable.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class UpdateFeatureRequest {
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> description = JsonField.missing();

    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> name = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UpdateFeatureRequest() {}

    private UpdateFeatureRequest(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UpdateFeatureRequest}.
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
        builder.description = description;
        builder.name = name;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Omit to leave unchanged; send <code>null</code> to clear.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> description() {
        return description.asOptional();
    }

    /**
     * The {@code name} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> name() {
        return name.asOptional();
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
        UpdateFeatureRequest that = (UpdateFeatureRequest) o;
        return Objects.equals(description, that.description)
                && Objects.equals(name, that.name)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, additionalProperties);
    }

    @Override
    public String toString() {
        return "UpdateFeatureRequest{"
                + "description="
                + description
                + ", name="
                + name
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link UpdateFeatureRequest}. */
    public static final class Builder {
        private JsonField<String> description = JsonField.missing();
        private JsonField<String> name = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Omit to leave unchanged; send <code>null</code> to clear.
         *
         * @param description the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder description(String description) {
            this.description = JsonField.ofNullable(description);
            return this;
        }

        /**
         * The {@code name} property.
         *
         * @param name the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder name(String name) {
            this.name = JsonField.ofNullable(name);
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
         * The {@code UpdateFeatureRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UpdateFeatureRequest build() {
            return new UpdateFeatureRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code UpdateFeatureRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UpdateFeatureRequest fromJson(String json) {
        return Utils.parse(json, UpdateFeatureRequest.class);
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
