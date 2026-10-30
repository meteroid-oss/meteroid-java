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
public final class LicenseSigningKey {
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    @JsonProperty("kid")
    private String kid;

    @JsonProperty("public_key_pem")
    private String publicKeyPem;

    @JsonProperty("retired_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> retiredAt = JsonField.missing();

    @JsonProperty("status")
    private LicenseSigningKeyStatus status;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private LicenseSigningKey() {}

    private LicenseSigningKey(Builder builder) {
        this.createdAt = builder.createdAt;
        this.kid = builder.kid;
        this.publicKeyPem = builder.publicKeyPem;
        this.retiredAt = builder.retiredAt;
        this.status = builder.status;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code LicenseSigningKey}.
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
        builder.createdAt = createdAt;
        builder.kid = kid;
        builder.publicKeyPem = publicKeyPem;
        builder.retiredAt = retiredAt;
        builder.status = status;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code created_at} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime createdAt() {
        return Utils.required(createdAt, "created_at");
    }

    /**
     * The key id, the <code>kid</code> header of the licenses it signs.
     *
     * @return the value, never null
     */
    public String kid() {
        return Utils.required(kid, "kid");
    }

    /**
     * Ed25519 public key, PEM-encoded.
     *
     * @return the value, never null
     */
    public String publicKeyPem() {
        return Utils.required(publicKeyPem, "public_key_pem");
    }

    /**
     * The {@code retired_at} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> retiredAt() {
        return retiredAt.asOptional();
    }

    /**
     * The {@code status} property.
     *
     * @return the value, never null
     */
    public LicenseSigningKeyStatus status() {
        return Utils.required(status, "status");
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
        LicenseSigningKey that = (LicenseSigningKey) o;
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(kid, that.kid)
                && Objects.equals(publicKeyPem, that.publicKeyPem)
                && Objects.equals(retiredAt, that.retiredAt)
                && Objects.equals(status, that.status)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, kid, publicKeyPem, retiredAt, status, additionalProperties);
    }

    @Override
    public String toString() {
        return "LicenseSigningKey{"
                + "createdAt="
                + createdAt
                + ", kid="
                + kid
                + ", publicKeyPem="
                + publicKeyPem
                + ", retiredAt="
                + retiredAt
                + ", status="
                + status
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link LicenseSigningKey}. */
    public static final class Builder {
        private OffsetDateTime createdAt;
        private String kid;
        private String publicKeyPem;
        private JsonField<OffsetDateTime> retiredAt = JsonField.missing();
        private LicenseSigningKeyStatus status;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code created_at} property.
         *
         * @param createdAt the value
         * @return this builder
         */
        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The key id, the <code>kid</code> header of the licenses it signs.
         *
         * @param kid the value
         * @return this builder
         */
        public Builder kid(String kid) {
            this.kid = kid;
            return this;
        }

        /**
         * Ed25519 public key, PEM-encoded.
         *
         * @param publicKeyPem the value
         * @return this builder
         */
        public Builder publicKeyPem(String publicKeyPem) {
            this.publicKeyPem = publicKeyPem;
            return this;
        }

        /**
         * The {@code retired_at} property.
         *
         * @param retiredAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder retiredAt(OffsetDateTime retiredAt) {
            this.retiredAt = JsonField.ofNullable(retiredAt);
            return this;
        }

        /**
         * The {@code status} property.
         *
         * @param status the value
         * @return this builder
         */
        public Builder status(LicenseSigningKeyStatus status) {
            this.status = status;
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
         * The {@code LicenseSigningKey}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public LicenseSigningKey build() {
            Utils.checkRequired(createdAt, "created_at");
            Utils.checkRequired(kid, "kid");
            Utils.checkRequired(publicKeyPem, "public_key_pem");
            Utils.checkRequired(status, "status");
            return new LicenseSigningKey(this);
        }
    }

    /**
     * Parse {@code json} as {@code LicenseSigningKey}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static LicenseSigningKey fromJson(String json) {
        return Utils.parse(json, LicenseSigningKey.class);
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
