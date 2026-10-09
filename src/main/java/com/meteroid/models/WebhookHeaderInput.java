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
 * A custom header to send with every delivery. A sensitive header is write-only: it is never
 * returned, and on update sending it without a value keeps its value.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WebhookHeaderInput {
    @JsonProperty("name")
    private String name;

    @JsonProperty("sensitive")
    private Boolean sensitive;

    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> value = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WebhookHeaderInput() {}

    private WebhookHeaderInput(Builder builder) {
        this.name = builder.name;
        this.sensitive = builder.sensitive;
        this.value = builder.value;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WebhookHeaderInput}.
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
        builder.name = name;
        builder.sensitive = sensitive;
        builder.value = value;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code name} property.
     *
     * @return the value, never null
     */
    public String name() {
        return Utils.required(name, "name");
    }

    /**
     * The {@code sensitive} property.
     *
     * @return the value, empty when unset
     */
    public Optional<Boolean> sensitive() {
        return Optional.ofNullable(sensitive);
    }

    /**
     * The {@code value} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> value() {
        return value.asOptional();
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
        WebhookHeaderInput that = (WebhookHeaderInput) o;
        return Objects.equals(name, that.name)
                && Objects.equals(sensitive, that.sensitive)
                && Objects.equals(value, that.value)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sensitive, value, additionalProperties);
    }

    @Override
    public String toString() {
        return "WebhookHeaderInput{"
                + "name="
                + name
                + ", sensitive="
                + sensitive
                + ", value="
                + value
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WebhookHeaderInput}. */
    public static final class Builder {
        private String name;
        private Boolean sensitive;
        private JsonField<String> value = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code name} property.
         *
         * @param name the value
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The {@code sensitive} property.
         *
         * @param sensitive the value
         * @return this builder
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * The {@code value} property.
         *
         * @param value the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder value(String value) {
            this.value = JsonField.ofNullable(value);
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
         * The {@code WebhookHeaderInput}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WebhookHeaderInput build() {
            Utils.checkRequired(name, "name");
            return new WebhookHeaderInput(this);
        }
    }

    /**
     * Parse {@code json} as {@code WebhookHeaderInput}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WebhookHeaderInput fromJson(String json) {
        return Utils.parse(json, WebhookHeaderInput.class);
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
