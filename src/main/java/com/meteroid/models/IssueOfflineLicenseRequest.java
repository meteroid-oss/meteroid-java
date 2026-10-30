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
public final class IssueOfflineLicenseRequest {
    @JsonProperty("instance_id")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> instanceId = JsonField.missing();

    @JsonProperty("valid_days")
    private Integer validDays;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private IssueOfflineLicenseRequest() {}

    private IssueOfflineLicenseRequest(Builder builder) {
        this.instanceId = builder.instanceId;
        this.validDays = builder.validDays;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code IssueOfflineLicenseRequest}.
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
        builder.instanceId = instanceId;
        builder.validDays = validDays;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The installation's id as it reports it, up to 255 characters without spaces: the license
     * names it (<code>aud</code>) and stays bound to it. Without one, the license is not tied to
     * one.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> instanceId() {
        return instanceId.asOptional();
    }

    /**
     * Lifetime of the offline license, 1 to 400 days.
     *
     * @return the value, never null
     */
    public Integer validDays() {
        return Utils.required(validDays, "valid_days");
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
        IssueOfflineLicenseRequest that = (IssueOfflineLicenseRequest) o;
        return Objects.equals(instanceId, that.instanceId)
                && Objects.equals(validDays, that.validDays)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, validDays, additionalProperties);
    }

    @Override
    public String toString() {
        return "IssueOfflineLicenseRequest{"
                + "instanceId="
                + instanceId
                + ", validDays="
                + validDays
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link IssueOfflineLicenseRequest}. */
    public static final class Builder {
        private JsonField<String> instanceId = JsonField.missing();
        private Integer validDays;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The installation's id as it reports it, up to 255 characters without spaces: the license
         * names it (<code>aud</code>) and stays bound to it. Without one, the license is not tied
         * to one.
         *
         * @param instanceId the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = JsonField.ofNullable(instanceId);
            return this;
        }

        /**
         * Lifetime of the offline license, 1 to 400 days.
         *
         * @param validDays the value
         * @return this builder
         */
        public Builder validDays(Integer validDays) {
            this.validDays = validDays;
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
         * The {@code IssueOfflineLicenseRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public IssueOfflineLicenseRequest build() {
            Utils.checkRequired(validDays, "valid_days");
            return new IssueOfflineLicenseRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code IssueOfflineLicenseRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static IssueOfflineLicenseRequest fromJson(String json) {
        return Utils.parse(json, IssueOfflineLicenseRequest.class);
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
