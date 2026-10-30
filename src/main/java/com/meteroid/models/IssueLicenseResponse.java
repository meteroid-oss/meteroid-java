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
public final class IssueLicenseResponse {
    @JsonProperty("activation_code")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> activationCode = JsonField.missing();

    @JsonProperty("license")
    private License license;

    @JsonProperty("offline_license")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> offlineLicense = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private IssueLicenseResponse() {}

    private IssueLicenseResponse(Builder builder) {
        this.activationCode = builder.activationCode;
        this.license = builder.license;
        this.offlineLicense = builder.offlineLicense;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code IssueLicenseResponse}.
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
        builder.activationCode = activationCode;
        builder.license = license;
        builder.offlineLicense = offlineLicense;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * Online: one-time code the customer enters in their installation to activate the license.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> activationCode() {
        return activationCode.asOptional();
    }

    /**
     * The {@code license} property.
     *
     * @return the value, never null
     */
    public License license() {
        return Utils.required(license, "license");
    }

    /**
     * Offline: the signed license (a JWT) to install in the installation.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> offlineLicense() {
        return offlineLicense.asOptional();
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
        IssueLicenseResponse that = (IssueLicenseResponse) o;
        return Objects.equals(activationCode, that.activationCode)
                && Objects.equals(license, that.license)
                && Objects.equals(offlineLicense, that.offlineLicense)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activationCode, license, offlineLicense, additionalProperties);
    }

    @Override
    public String toString() {
        return "IssueLicenseResponse{"
                + "activationCode="
                + activationCode
                + ", license="
                + license
                + ", offlineLicense="
                + offlineLicense
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link IssueLicenseResponse}. */
    public static final class Builder {
        private JsonField<String> activationCode = JsonField.missing();
        private License license;
        private JsonField<String> offlineLicense = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * Online: one-time code the customer enters in their installation to activate the license.
         *
         * @param activationCode the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder activationCode(String activationCode) {
            this.activationCode = JsonField.ofNullable(activationCode);
            return this;
        }

        /**
         * The {@code license} property.
         *
         * @param license the value
         * @return this builder
         */
        public Builder license(License license) {
            this.license = license;
            return this;
        }

        /**
         * Offline: the signed license (a JWT) to install in the installation.
         *
         * @param offlineLicense the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder offlineLicense(String offlineLicense) {
            this.offlineLicense = JsonField.ofNullable(offlineLicense);
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
         * The {@code IssueLicenseResponse}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public IssueLicenseResponse build() {
            Utils.checkRequired(license, "license");
            return new IssueLicenseResponse(this);
        }
    }

    /**
     * Parse {@code json} as {@code IssueLicenseResponse}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static IssueLicenseResponse fromJson(String json) {
        return Utils.parse(json, IssueLicenseResponse.class);
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
