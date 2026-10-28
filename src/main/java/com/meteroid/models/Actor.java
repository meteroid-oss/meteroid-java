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
 * Who made a change.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class Actor {
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> id = JsonField.missing();

    @JsonProperty("type")
    private ActorType type;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private Actor() {}

    private Actor(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code Actor}.
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
        builder.id = id;
        builder.type = type;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The user's id (<code>usr_…</code>) for USER, the customer's (<code>cus_…</code>) for
     * CUSTOMER, the API key's or app's for API_KEY and OAUTH_APP; absent for SYSTEM.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> id() {
        return id.asOptional();
    }

    /**
     * USER, CUSTOMER, API_KEY, OAUTH_APP or SYSTEM.
     *
     * @return the value, never null
     */
    public ActorType type() {
        return Utils.required(type, "type");
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
        Actor that = (Actor) o;
        return Objects.equals(id, that.id)
                && Objects.equals(type, that.type)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, additionalProperties);
    }

    @Override
    public String toString() {
        return "Actor{"
                + "id="
                + id
                + ", type="
                + type
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link Actor}. */
    public static final class Builder {
        private JsonField<String> id = JsonField.missing();
        private ActorType type;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The user's id (<code>usr_…</code>) for USER, the customer's (<code>cus_…</code>) for
         * CUSTOMER, the API key's or app's for API_KEY and OAUTH_APP; absent for SYSTEM.
         *
         * @param id the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder id(String id) {
            this.id = JsonField.ofNullable(id);
            return this;
        }

        /**
         * USER, CUSTOMER, API_KEY, OAUTH_APP or SYSTEM.
         *
         * @param type the value
         * @return this builder
         */
        public Builder type(ActorType type) {
            this.type = type;
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
         * The {@code Actor}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public Actor build() {
            Utils.checkRequired(type, "type");
            return new Actor(this);
        }
    }

    /**
     * Parse {@code json} as {@code Actor}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static Actor fromJson(String json) {
        return Utils.parse(json, Actor.class);
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
