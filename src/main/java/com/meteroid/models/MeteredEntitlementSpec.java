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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
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
public final class MeteredEntitlementSpec {
    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("grace_pct")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> gracePct = JsonField.missing();

    @JsonProperty("group_by")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<String> groupBy = JsonField.missing();

    @JsonProperty("limit")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<BigDecimal> limit = JsonField.missing();

    @JsonProperty("metric_id")
    private String metricId;

    @JsonProperty("overage_behavior")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<EntitlementOverageBehavior> overageBehavior = JsonField.missing();

    @JsonProperty("reset_period")
    private ResetPeriod resetPeriod;

    @JsonProperty("thresholds")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<List<Integer>> thresholds = JsonField.missing();

    @JsonProperty("warning_threshold_pct")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private JsonField<Integer> warningThresholdPct = JsonField.missing();

    private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

    private MeteredEntitlementSpec() {}

    private MeteredEntitlementSpec(Builder builder) {
        this.enabled = builder.enabled;
        this.gracePct = builder.gracePct;
        this.groupBy = builder.groupBy;
        this.limit = builder.limit;
        this.metricId = builder.metricId;
        this.overageBehavior = builder.overageBehavior;
        this.resetPeriod = builder.resetPeriod;
        this.thresholds = builder.thresholds.map(Utils::copyList);
        this.warningThresholdPct = builder.warningThresholdPct;
        this.additionalProperties.putAll(builder.additionalProperties);
    }

    /**
     * A builder of {@code MeteredEntitlementSpec}.
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
        builder.enabled = enabled;
        builder.gracePct = gracePct;
        builder.groupBy = groupBy;
        builder.limit = limit;
        builder.metricId = metricId;
        builder.overageBehavior = overageBehavior;
        builder.resetPeriod = resetPeriod;
        builder.thresholds = thresholds.map(Utils::mutableList);
        builder.warningThresholdPct = warningThresholdPct;
        builder.additionalProperties.putAll(additionalProperties);
        return builder;
    }

    /**
     * False when switched off, or once a <code>BLOCK</code> limit (plus its grace) is reached. An
     * <code>ALLOW</code> limit never turns it off.
     *
     * @return the value, never null
     */
    public Boolean enabled() {
        return Utils.required(enabled, "enabled");
    }

    /**
     * <code>BLOCK</code> only: usage allowed beyond the limit before it is refused, in percent of
     * it.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> gracePct() {
        return gracePct.asOptional();
    }

    /**
     * Event property the limit applies to separately; usage is then the largest value's.
     *
     * @return the value, empty when unset or null
     */
    public Optional<String> groupBy() {
        return groupBy.asOptional();
    }

    /**
     * The {@code limit} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<BigDecimal> limit() {
        return limit.asOptional();
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
     * The {@code overage_behavior} property.
     *
     * @return the value, empty when unset or null
     */
    public Optional<EntitlementOverageBehavior> overageBehavior() {
        return overageBehavior.asOptional();
    }

    /**
     * The {@code reset_period} property.
     *
     * @return the value, never null
     */
    public ResetPeriod resetPeriod() {
        return Utils.required(resetPeriod, "reset_period");
    }

    /**
     * Percents of the limit at which an alert is sent, ascending.
     *
     * @return the value, empty when unset or null
     */
    public Optional<List<Integer>> thresholds() {
        return thresholds.asOptional();
    }

    /**
     * Deprecated: the lowest of <code>thresholds</code>.
     *
     * @return the value, empty when unset or null
     */
    public Optional<Integer> warningThresholdPct() {
        return warningThresholdPct.asOptional();
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
        MeteredEntitlementSpec that = (MeteredEntitlementSpec) o;
        return Objects.equals(enabled, that.enabled)
                && Objects.equals(gracePct, that.gracePct)
                && Objects.equals(groupBy, that.groupBy)
                && Objects.equals(limit, that.limit)
                && Objects.equals(metricId, that.metricId)
                && Objects.equals(overageBehavior, that.overageBehavior)
                && Objects.equals(resetPeriod, that.resetPeriod)
                && Objects.equals(thresholds, that.thresholds)
                && Objects.equals(warningThresholdPct, that.warningThresholdPct)
                && Objects.equals(additionalProperties, that.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                enabled,
                gracePct,
                groupBy,
                limit,
                metricId,
                overageBehavior,
                resetPeriod,
                thresholds,
                warningThresholdPct,
                additionalProperties);
    }

    @Override
    public String toString() {
        return "MeteredEntitlementSpec{"
                + "enabled="
                + enabled
                + ", gracePct="
                + gracePct
                + ", groupBy="
                + groupBy
                + ", limit="
                + limit
                + ", metricId="
                + metricId
                + ", overageBehavior="
                + overageBehavior
                + ", resetPeriod="
                + resetPeriod
                + ", thresholds="
                + thresholds
                + ", warningThresholdPct="
                + warningThresholdPct
                + ", additionalProperties="
                + additionalProperties
                + "}";
    }

    /** Builds {@link MeteredEntitlementSpec}. */
    public static final class Builder {
        private Boolean enabled;
        private JsonField<Integer> gracePct = JsonField.missing();
        private JsonField<String> groupBy = JsonField.missing();
        private JsonField<BigDecimal> limit = JsonField.missing();
        private String metricId;
        private JsonField<EntitlementOverageBehavior> overageBehavior = JsonField.missing();
        private ResetPeriod resetPeriod;
        private JsonField<List<Integer>> thresholds = JsonField.missing();
        private JsonField<Integer> warningThresholdPct = JsonField.missing();
        private final Map<String, JsonNode> additionalProperties = new LinkedHashMap<>();

        private Builder() {}

        /**
         * False when switched off, or once a <code>BLOCK</code> limit (plus its grace) is reached.
         * An <code>ALLOW</code> limit never turns it off.
         *
         * @param enabled the value
         * @return this builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <code>BLOCK</code> only: usage allowed beyond the limit before it is refused, in percent
         * of it.
         *
         * @param gracePct the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder gracePct(Integer gracePct) {
            this.gracePct = JsonField.ofNullable(gracePct);
            return this;
        }

        /**
         * Event property the limit applies to separately; usage is then the largest value's.
         *
         * @param groupBy the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder groupBy(String groupBy) {
            this.groupBy = JsonField.ofNullable(groupBy);
            return this;
        }

        /**
         * The {@code limit} property.
         *
         * @param limit the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder limit(BigDecimal limit) {
            this.limit = JsonField.ofNullable(limit);
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
         * The {@code overage_behavior} property.
         *
         * @param overageBehavior the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder overageBehavior(EntitlementOverageBehavior overageBehavior) {
            this.overageBehavior = JsonField.ofNullable(overageBehavior);
            return this;
        }

        /**
         * The {@code reset_period} property.
         *
         * @param resetPeriod the value
         * @return this builder
         */
        public Builder resetPeriod(ResetPeriod resetPeriod) {
            this.resetPeriod = resetPeriod;
            return this;
        }

        /**
         * Percents of the limit at which an alert is sent, ascending.
         *
         * @param thresholds the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder thresholds(List<Integer> thresholds) {
            this.thresholds = JsonField.ofNullable(Utils.mutableList(thresholds));
            return this;
        }

        /**
         * Adds an item to {@code thresholds}.
         *
         * @param item the item
         * @return this builder
         */
        public Builder addThresholdsItem(Integer item) {
            List<Integer> items = this.thresholds.orNull();
            if (items == null) {
                items = new ArrayList<>();
                this.thresholds = JsonField.ofNullable(items);
            }
            items.add(item);
            return this;
        }

        /**
         * Deprecated: the lowest of <code>thresholds</code>.
         *
         * @param warningThresholdPct the value, null to send an explicit {@code null}
         * @return this builder
         */
        public Builder warningThresholdPct(Integer warningThresholdPct) {
            this.warningThresholdPct = JsonField.ofNullable(warningThresholdPct);
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
         * The {@code MeteredEntitlementSpec}.
         *
         * @return the immutable value
         * @throws IllegalStateException when a required property is not set
         */
        public MeteredEntitlementSpec build() {
            Utils.checkRequired(enabled, "enabled");
            Utils.checkRequired(metricId, "metric_id");
            Utils.checkRequired(resetPeriod, "reset_period");
            return new MeteredEntitlementSpec(this);
        }
    }

    /**
     * Parse {@code json} as {@code MeteredEntitlementSpec}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static MeteredEntitlementSpec fromJson(String json) {
        return Utils.parse(json, MeteredEntitlementSpec.class);
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
