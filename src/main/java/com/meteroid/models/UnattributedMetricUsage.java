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

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A metric's usage over <code>[from, until)</code> that no subscription bills: it matches none of
 * the usage filters of the subscriptions pricing the metric, and none of them bills without one.
 *
 * <p>Immutable: build one with {@link #builder()}, change a copy with {@link #toBuilder()}.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public final class UnattributedMetricUsage {
    @JsonProperty("from")
    private OffsetDateTime from;

    @JsonProperty("metric_code")
    private String metricCode;

    @JsonProperty("metric_id")
    private String metricId;

    @JsonProperty("metric_name")
    private String metricName;

    @JsonProperty("total_value")
    private BigDecimal totalValue;

    @JsonProperty("until")
    private OffsetDateTime until;

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private UnattributedMetricUsage() {}

    private UnattributedMetricUsage(Builder builder) {
        this.from = builder.from;
        this.metricCode = builder.metricCode;
        this.metricId = builder.metricId;
        this.metricName = builder.metricName;
        this.totalValue = builder.totalValue;
        this.until = builder.until;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code UnattributedMetricUsage}.
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
        builder.from = from;
        builder.metricCode = metricCode;
        builder.metricId = metricId;
        builder.metricName = metricName;
        builder.totalValue = totalValue;
        builder.until = until;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * The {@code from} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime from() {
        return Utils.required(from, "from");
    }

    /**
     * The {@code metric_code} property.
     *
     * @return the value, never null
     */
    public String metricCode() {
        return Utils.required(metricCode, "metric_code");
    }

    /**
     * The {@code metric_id} property.
     *
     * @return the value, never null
     */
    public String metricId() {
        return Utils.required(metricId, "metric_id");
    }

    /**
     * The {@code metric_name} property.
     *
     * @return the value, never null
     */
    public String metricName() {
        return Utils.required(metricName, "metric_name");
    }

    /**
     * The {@code total_value} property.
     *
     * @return the value, never null
     */
    public BigDecimal totalValue() {
        return Utils.required(totalValue, "total_value");
    }

    /**
     * The {@code until} property.
     *
     * @return the value, never null
     */
    public OffsetDateTime until() {
        return Utils.required(until, "until");
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
        UnattributedMetricUsage that = (UnattributedMetricUsage) o;
        return Objects.equals(from, that.from)
                && Objects.equals(metricCode, that.metricCode)
                && Objects.equals(metricId, that.metricId)
                && Objects.equals(metricName, that.metricName)
                && Objects.equals(totalValue, that.totalValue)
                && Objects.equals(until, that.until)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from, metricCode, metricId, metricName, totalValue, until, additionalProperties);
    }

    @Override
    public String toString() {
        return "UnattributedMetricUsage{"
                + "from="
                + from
                + ", metricCode="
                + metricCode
                + ", metricId="
                + metricId
                + ", metricName="
                + metricName
                + ", totalValue="
                + totalValue
                + ", until="
                + until
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link UnattributedMetricUsage}. */
    public static final class Builder {
        private OffsetDateTime from;
        private String metricCode;
        private String metricId;
        private String metricName;
        private BigDecimal totalValue;
        private OffsetDateTime until;
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * The {@code from} property.
         *
         * @param from the value
         * @return this builder
         */
        public Builder from(OffsetDateTime from) {
            this.from = from;
            return this;
        }

        /**
         * The {@code metric_code} property.
         *
         * @param metricCode the value
         * @return this builder
         */
        public Builder metricCode(String metricCode) {
            this.metricCode = metricCode;
            return this;
        }

        /**
         * The {@code metric_id} property.
         *
         * @param metricId the value
         * @return this builder
         */
        public Builder metricId(String metricId) {
            this.metricId = metricId;
            return this;
        }

        /**
         * The {@code metric_name} property.
         *
         * @param metricName the value
         * @return this builder
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            return this;
        }

        /**
         * The {@code total_value} property.
         *
         * @param totalValue the value
         * @return this builder
         */
        public Builder totalValue(BigDecimal totalValue) {
            this.totalValue = totalValue;
            return this;
        }

        /**
         * The {@code until} property.
         *
         * @param until the value
         * @return this builder
         */
        public Builder until(OffsetDateTime until) {
            this.until = until;
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
         * The {@code UnattributedMetricUsage}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public UnattributedMetricUsage build() {
            Utils.checkRequired(from, "from");
            Utils.checkRequired(metricCode, "metric_code");
            Utils.checkRequired(metricId, "metric_id");
            Utils.checkRequired(metricName, "metric_name");
            Utils.checkRequired(totalValue, "total_value");
            Utils.checkRequired(until, "until");
            return new UnattributedMetricUsage(this);
        }
    }

    /**
     * Parse {@code json} as {@code UnattributedMetricUsage}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static UnattributedMetricUsage fromJson(String json) {
        return Utils.parse(json, UnattributedMetricUsage.class);
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
