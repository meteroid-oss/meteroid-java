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
import com.meteroid.internal.Unions;
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * The created account (same fields as <code>ConnectedAccount</code>) plus its onboarding link.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class CreateConnectedAccountResponse {
    @JsonProperty("onboarding_link")
    private OnboardingLinkResponse onboardingLink;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private CreateConnectedAccountResponse() {}

    private CreateConnectedAccountResponse(Builder builder) {
        this.onboardingLink = builder.onboardingLink;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code CreateConnectedAccountResponse}.
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
        builder.onboardingLink = onboardingLink;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The properties of {@link ConnectedAccount}, which this schema extends.
     *
     * @return the properties of this part
     */
    public ConnectedAccount connectedAccount() {
        return Unions.convert(additionalProperties, ConnectedAccount.class);
    }

    /**
     * The {@code onboarding_link} property.
     *
     * @return the value, never null
     */
    public OnboardingLinkResponse onboardingLink() {
        return Utils.required(onboardingLink, "onboarding_link");
    }

    /**
     * Properties this version of the SDK does not know, kept as received and sent back.
     *
     * @return the properties by name, unmodifiable
     */
    public Map<String, JsonNode> additionalProperties() {
        Map<String, JsonNode> unknown = new LinkedHashMap<>(additionalProperties);
        unknown.keySet().retainAll(connectedAccount().additionalProperties().keySet());
        return Collections.unmodifiableMap(unknown);
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
        CreateConnectedAccountResponse that = (CreateConnectedAccountResponse) o;
        return Objects.equals(onboardingLink, that.onboardingLink)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onboardingLink, additionalProperties);
    }

    @Override
    public String toString() {
        return "CreateConnectedAccountResponse{"
                + "onboardingLink="
                + onboardingLink
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link CreateConnectedAccountResponse}. */
    public static final class Builder {
        private OnboardingLinkResponse onboardingLink;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Sets the properties of {@link ConnectedAccount}, which this schema extends.
         *
         * @param connectedAccount the properties
         * @return this builder
         */
        public Builder connectedAccount(ConnectedAccount connectedAccount) {
            additionalProperties.putAll(Utils.properties(connectedAccount));
            return this;
        }

        /**
         * The {@code onboarding_link} property.
         *
         * @param onboardingLink the value
         * @return this builder
         */
        public Builder onboardingLink(OnboardingLinkResponse onboardingLink) {
            this.onboardingLink = onboardingLink;
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
         * The {@code CreateConnectedAccountResponse}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public CreateConnectedAccountResponse build() {
            Utils.checkRequired(onboardingLink, "onboarding_link");
            return new CreateConnectedAccountResponse(this);
        }
    }

    /**
     * Parse {@code json} as {@code CreateConnectedAccountResponse}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreateConnectedAccountResponse fromJson(String json) {
        return Utils.parse(json, CreateConnectedAccountResponse.class);
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
