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
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Credit on account that only one subscription can use.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class SubscriptionCredit {
    @JsonProperty("credit_on_account")
    private Long creditOnAccount;

    @JsonProperty("subscription_id")
    private String subscriptionId;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private SubscriptionCredit() {}

    private SubscriptionCredit(Builder builder) {
        this.creditOnAccount = builder.creditOnAccount;
        this.subscriptionId = builder.subscriptionId;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code SubscriptionCredit}.
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
        builder.creditOnAccount = creditOnAccount;
        builder.subscriptionId = subscriptionId;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * In minor units of the wallet.
     *
     * @return the value, never null
     */
    public Long creditOnAccount() {
        return Utils.required(creditOnAccount, "credit_on_account");
    }

    /**
     * The {@code subscription_id} property.
     *
     * @return the value, never null
     */
    public String subscriptionId() {
        return Utils.required(subscriptionId, "subscription_id");
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
        SubscriptionCredit that = (SubscriptionCredit) o;
        return Objects.equals(creditOnAccount, that.creditOnAccount)
                && Objects.equals(subscriptionId, that.subscriptionId)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditOnAccount, subscriptionId, additionalProperties);
    }

    @Override
    public String toString() {
        return "SubscriptionCredit{"
                + "creditOnAccount="
                + creditOnAccount
                + ", subscriptionId="
                + subscriptionId
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link SubscriptionCredit}. */
    public static final class Builder {
        private Long creditOnAccount;
        private String subscriptionId;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * In minor units of the wallet.
         *
         * @param creditOnAccount the value
         * @return this builder
         */
        public Builder creditOnAccount(Long creditOnAccount) {
            this.creditOnAccount = creditOnAccount;
            return this;
        }

        /**
         * The {@code subscription_id} property.
         *
         * @param subscriptionId the value
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
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
         * The {@code SubscriptionCredit}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public SubscriptionCredit build() {
            Utils.checkRequired(creditOnAccount, "credit_on_account");
            Utils.checkRequired(subscriptionId, "subscription_id");
            return new SubscriptionCredit(this);
        }
    }

    /**
     * Parse {@code json} as {@code SubscriptionCredit}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static SubscriptionCredit fromJson(String json) {
        return Utils.parse(json, SubscriptionCredit.class);
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
