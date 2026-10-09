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
 * A custom header sent with every delivery. A sensitive header never returns its value; <code>set
 * </code> says whether it has one.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class WebhookHeader {
    @JsonProperty("name")
    private String name;

    @JsonProperty("sensitive")
    private Boolean sensitive;

    @JsonProperty("set")
    private Boolean set;

    @JsonProperty("value")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> value = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private WebhookHeader() {}

    private WebhookHeader(Builder builder) {
        this.name = builder.name;
        this.sensitive = builder.sensitive;
        this.set = builder.set;
        this.value = builder.value;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code WebhookHeader}.
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
        builder.set = set;
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
     * @return the value, never null
     */
    public Boolean sensitive() {
        return Utils.required(sensitive, "sensitive");
    }

    /**
     * The {@code set} property.
     *
     * @return the value, never null
     */
    public Boolean set() {
        return Utils.required(set, "set");
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
        WebhookHeader that = (WebhookHeader) o;
        return Objects.equals(name, that.name)
                && Objects.equals(sensitive, that.sensitive)
                && Objects.equals(set, that.set)
                && Objects.equals(value, that.value)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sensitive, set, value, additionalProperties);
    }

    @Override
    public String toString() {
        return "WebhookHeader{"
                + "name="
                + name
                + ", sensitive="
                + sensitive
                + ", set="
                + set
                + ", value="
                + value
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link WebhookHeader}. */
    public static final class Builder {
        private String name;
        private Boolean sensitive;
        private Boolean set;
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
         * The {@code set} property.
         *
         * @param set the value
         * @return this builder
         */
        public Builder set(Boolean set) {
            this.set = set;
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
         * The {@code WebhookHeader}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public WebhookHeader build() {
            Utils.checkRequired(name, "name");
            Utils.checkRequired(sensitive, "sensitive");
            Utils.checkRequired(set, "set");
            return new WebhookHeader(this);
        }
    }

    /**
     * Parse {@code json} as {@code WebhookHeader}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static WebhookHeader fromJson(String json) {
        return Utils.parse(json, WebhookHeader.class);
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
