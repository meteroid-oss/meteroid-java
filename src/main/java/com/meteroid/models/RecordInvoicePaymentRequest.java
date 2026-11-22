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
public final class RecordInvoicePaymentRequest {
    @JsonProperty("amount")
    private Long amount;

    @JsonProperty("paid_at")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<OffsetDateTime> paidAt = JsonField.missing();

    @JsonProperty("reference")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> reference = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private RecordInvoicePaymentRequest() {}

    private RecordInvoicePaymentRequest(Builder builder) {
        this.amount = builder.amount;
        this.paidAt = builder.paidAt;
        this.reference = builder.reference;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code RecordInvoicePaymentRequest}.
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
        builder.amount = amount;
        builder.paidAt = paidAt;
        builder.reference = reference;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The positive amount received, in minor units of the invoice currency (e.g. cents).
     *
     * @return the value, never null
     */
    public Long amount() {
        return Utils.required(amount, "amount");
    }

    /**
     * When the payment was received, at most a day ahead. Defaults to the current time.
     *
     * @return the value, empty when unset or null
     */
    public Optional<OffsetDateTime> paidAt() {
        return paidAt.asOptional();
    }

    /**
     * Reference for the external payment, such as a bank transfer ID.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> reference() {
        return reference.asOptional();
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
        RecordInvoicePaymentRequest that = (RecordInvoicePaymentRequest) o;
        return Objects.equals(amount, that.amount)
                && Objects.equals(paidAt, that.paidAt)
                && Objects.equals(reference, that.reference)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, paidAt, reference, additionalProperties);
    }

    @Override
    public String toString() {
        return "RecordInvoicePaymentRequest{"
                + "amount="
                + amount
                + ", paidAt="
                + paidAt
                + ", reference="
                + reference
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link RecordInvoicePaymentRequest}. */
    public static final class Builder {
        private Long amount;
        private JsonField<OffsetDateTime> paidAt = JsonField.missing();
        private JsonField<String> reference = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The positive amount received, in minor units of the invoice currency (e.g. cents).
         *
         * @param amount the value
         * @return this builder
         */
        public Builder amount(Long amount) {
            this.amount = amount;
            return this;
        }

        /**
         * When the payment was received, at most a day ahead. Defaults to the current time.
         *
         * @param paidAt the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder paidAt(OffsetDateTime paidAt) {
            this.paidAt = JsonField.ofNullable(paidAt);
            return this;
        }

        /**
         * Reference for the external payment, such as a bank transfer ID.
         *
         * @param reference the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder reference(String reference) {
            this.reference = JsonField.ofNullable(reference);
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
         * The {@code RecordInvoicePaymentRequest}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public RecordInvoicePaymentRequest build() {
            Utils.checkRequired(amount, "amount");
            return new RecordInvoicePaymentRequest(this);
        }
    }

    /**
     * Parse {@code json} as {@code RecordInvoicePaymentRequest}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static RecordInvoicePaymentRequest fromJson(String json) {
        return Utils.parse(json, RecordInvoicePaymentRequest.class);
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
