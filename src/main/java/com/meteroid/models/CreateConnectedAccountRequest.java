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

/** Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}. */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreateConnectedAccountRequest {
    @JsonProperty("country")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> country = JsonField.missing();

    @JsonProperty("email")
    private String email;

    @JsonProperty("metadata")
    private Object metadata;

    @JsonProperty("mode")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OnboardingMode> mode = JsonField.missing();

    @JsonProperty("organization_name")
    private String organizationName;

    @JsonProperty("redirect_url")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> redirectUrl = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreateConnectedAccountRequest() {}

    private CreateConnectedAccountRequest(Builder builder) {
        this.country = builder.country;
        this.email = builder.email;
        this.metadata = builder.metadata;
        this.mode = builder.mode;
        this.organizationName = builder.organizationName;
        this.redirectUrl = builder.redirectUrl;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreateConnectedAccountRequest}.
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
        builder.country = country;
        builder.email = email;
        builder.metadata = metadata;
        builder.mode = mode;
        builder.organizationName = organizationName;
        builder.redirectUrl = redirectUrl;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code country} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> country() {
        return country.asOptional();
    }

    /**
     * The {@code email} property.
     *
     * @return the value, never null
     */
    public String email() {
        return Utils.required(email, "email");
    }

    /**
     * The {@code metadata} property.
     *
     * @return the value, empty when unset
     */
    public Optional<Object> metadata() {
        return Optional.ofNullable(metadata);
    }

    /**
     * The {@code mode} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OnboardingMode> mode() {
        return mode.asOptional();
    }

    /**
     * The {@code organization_name} property.
     *
     * @return the value, never null
     */
    public String organizationName() {
        return Utils.required(organizationName, "organization_name");
    }

    /**
     * The {@code redirect_url} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> redirectUrl() {
        return redirectUrl.asOptional();
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
        CreateConnectedAccountRequest that = (CreateConnectedAccountRequest) o;
        return Objects.equals(country, that.country)
                && Objects.equals(email, that.email)
                && Objects.equals(metadata, that.metadata)
                && Objects.equals(mode, that.mode)
                && Objects.equals(organizationName, that.organizationName)
                && Objects.equals(redirectUrl, that.redirectUrl)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                country,
                email,
                metadata,
                mode,
                organizationName,
                redirectUrl,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "CreateConnectedAccountRequest{"
                + "country="
                + country
                + ", email="
                + email
                + ", metadata="
                + metadata
                + ", mode="
                + mode
                + ", organizationName="
                + organizationName
                + ", redirectUrl="
                + redirectUrl
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreateConnectedAccountRequest}. */
    public static final class Builder {
        private JsonField<String> country = JsonField.missing();
        private String email;
        private Object metadata;
        private JsonField<OnboardingMode> mode = JsonField.missing();
        private String organizationName;
        private JsonField<String> redirectUrl = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code country} property.
         *
         * @param country the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder country(String country) {
            this.country = JsonField.ofNullable(country);
            return this;
        }

        /**
         * The {@code email} property.
         *
         * @param email the value
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * The {@code metadata} property.
         *
         * @param metadata the value
         * @return this builder
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * The {@code mode} property.
         *
         * @param mode the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder mode(OnboardingMode mode) {
            this.mode = JsonField.ofNullable(mode);
            return this;
        }

        /**
         * The {@code organization_name} property.
         *
         * @param organizationName the value
         * @return this builder
         */
        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            return this;
        }

        /**
         * The {@code redirect_url} property.
         *
         * @param redirectUrl the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder redirectUrl(String redirectUrl) {
            this.redirectUrl = JsonField.ofNullable(redirectUrl);
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
         * The {@code CreateConnectedAccountRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreateConnectedAccountRequest build() {
            Utils.checkRequired(email, "email");
            Utils.checkRequired(organizationName, "organization_name");
            return new CreateConnectedAccountRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreateConnectedAccountRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreateConnectedAccountRequest fromJson(String json) {
        return Utils.parse(json, CreateConnectedAccountRequest.class);
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
