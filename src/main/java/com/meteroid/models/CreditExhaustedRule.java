// This file is @generated
package com.meteroid.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.JsonNode;
import com.meteroid.internal.Utils;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * What usage does once the credit it draws on runs out, for every denomination (currency or credit
 * unit) the plan charges usage in. A customer's wallet can override it.
 *
 * <p>One of the variants below, told apart by {@code type}. A value this version of the SDK does
 * not know parses as {@link Unrecognized}, which keeps its properties.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true,
        defaultImpl = CreditExhaustedRule.Unrecognized.class)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CreditExhaustedRule.Invoice.class, name = "invoice"),
    @JsonSubTypes.Type(value = CreditExhaustedRule.Pause.class, name = "pause"),
    @JsonSubTypes.Type(value = CreditExhaustedRule.InvoiceUpTo.class, name = "invoice_up_to")
})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(
        getterVisibility = Visibility.NONE,
        isGetterVisibility = Visibility.NONE,
        setterVisibility = Visibility.NONE)
public abstract class CreditExhaustedRule {

    private CreditExhaustedRule() {}

    /**
     * The discriminator value identifying this variant.
     *
     * @return the {@code type} value
     */
    @JsonProperty("type")
    public abstract String type();

    /**
     * Whether this is the {@code invoice} variant.
     *
     * @return whether it is
     */
    public final boolean isInvoice() {
        return this instanceof Invoice;
    }

    /**
     * This value as the {@code invoice} variant.
     *
     * @return the variant
     * @throws IllegalStateException if this is another variant
     */
    public final Invoice asInvoice() {
        if (this instanceof Invoice) {
            return (Invoice) this;
        }
        throw new IllegalStateException("not the invoice variant: " + type());
    }

    /**
     * Whether this is the {@code pause} variant.
     *
     * @return whether it is
     */
    public final boolean isPause() {
        return this instanceof Pause;
    }

    /**
     * This value as the {@code pause} variant.
     *
     * @return the variant
     * @throws IllegalStateException if this is another variant
     */
    public final Pause asPause() {
        if (this instanceof Pause) {
            return (Pause) this;
        }
        throw new IllegalStateException("not the pause variant: " + type());
    }

    /**
     * Whether this is the {@code invoice_up_to} variant.
     *
     * @return whether it is
     */
    public final boolean isInvoiceUpTo() {
        return this instanceof InvoiceUpTo;
    }

    /**
     * This value as the {@code invoice_up_to} variant.
     *
     * @return the variant
     * @throws IllegalStateException if this is another variant
     */
    public final InvoiceUpTo asInvoiceUpTo() {
        if (this instanceof InvoiceUpTo) {
            return (InvoiceUpTo) this;
        }
        throw new IllegalStateException("not the invoice_up_to variant: " + type());
    }

    /**
     * Whether this is a variant this version of the SDK does not know.
     *
     * @return whether it is
     */
    public final boolean isUnrecognized() {
        return this instanceof Unrecognized;
    }

    /**
     * This value as a variant this version of the SDK does not know.
     *
     * @return the variant
     * @throws IllegalStateException if this is another variant
     */
    public final Unrecognized asUnrecognized() {
        if (this instanceof Unrecognized) {
            return (Unrecognized) this;
        }
        throw new IllegalStateException("not a known variant: " + type());
    }

    /**
     * Calls the method of {@code visitor} for this variant.
     *
     * @param <R> the result type
     * @param visitor the visitor
     * @return the result of the visitor
     */
    public abstract <R> R accept(Visitor<R> visitor);

    /**
     * A function of each variant, called by {@link #accept}.
     *
     * @param <R> the result type
     */
    public interface Visitor<R> {
        /**
         * Visits the {@code invoice} variant.
         *
         * @param value the variant
         * @return the result
         */
        R visitInvoice(CreditExhaustedRuleInvoiceVariant value);

        /**
         * Visits the {@code pause} variant.
         *
         * @param value the variant
         * @return the result
         */
        R visitPause(CreditExhaustedRulePauseVariant value);

        /**
         * Visits the {@code invoice_up_to} variant.
         *
         * @param value the variant
         * @return the result
         */
        R visitInvoiceUpTo(CreditCaps value);

        /**
         * Visits a variant this version of the SDK does not know.
         *
         * @param value the variant, with its properties
         * @return the result
         * @throws com.meteroid.exceptions.InvalidDataException unless overridden
         */
        default R visitUnknown(Unrecognized value) {
            throw new com.meteroid.exceptions.InvalidDataException(
                    "unknown CreditExhaustedRule variant: " + value.type());
        }
    }

    /**
     * Parse {@code json} as {@code CreditExhaustedRule}.
     *
     * @param json the JSON text
     * @return the value
     * @throws com.meteroid.exceptions.InvalidDataException if it is not valid JSON of this shape
     */
    public static CreditExhaustedRule fromJson(String json) {
        return Utils.parse(json, CreditExhaustedRule.class);
    }

    /**
     * This value as JSON.
     *
     * @return the JSON text
     */
    public String toJson() {
        return Utils.json(this);
    }

    /** The {@code invoice} variant. */
    @JsonTypeName("invoice")
    public static final class Invoice extends CreditExhaustedRule {
        @JsonUnwrapped
        @JsonIgnoreProperties(value = "type", allowSetters = true)
        private CreditExhaustedRuleInvoiceVariant data;

        private Invoice() {}

        /**
         * The variant holding {@code data}.
         *
         * @param data the value of the variant
         */
        public Invoice(CreditExhaustedRuleInvoiceVariant data) {
            this.data = Objects.requireNonNull(data, "data");
        }

        /**
         * The variant holding {@code data}.
         *
         * @param data the value of the variant
         * @return the variant
         */
        public static Invoice of(CreditExhaustedRuleInvoiceVariant data) {
            return new Invoice(data);
        }

        @Override
        @JsonProperty("type")
        public String type() {
            return "invoice";
        }

        /**
         * The value of the variant.
         *
         * @return the value
         */
        public CreditExhaustedRuleInvoiceVariant data() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Invoice that = (Invoice) o;
            return Objects.equals(data, that.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Invoice{" + "data=" + data + "}";
        }

        @Override
        public <R> R accept(Visitor<R> visitor) {
            return visitor.visitInvoice(data);
        }
    }

    /** The {@code pause} variant. */
    @JsonTypeName("pause")
    public static final class Pause extends CreditExhaustedRule {
        @JsonUnwrapped
        @JsonIgnoreProperties(value = "type", allowSetters = true)
        private CreditExhaustedRulePauseVariant data;

        private Pause() {}

        /**
         * The variant holding {@code data}.
         *
         * @param data the value of the variant
         */
        public Pause(CreditExhaustedRulePauseVariant data) {
            this.data = Objects.requireNonNull(data, "data");
        }

        /**
         * The variant holding {@code data}.
         *
         * @param data the value of the variant
         * @return the variant
         */
        public static Pause of(CreditExhaustedRulePauseVariant data) {
            return new Pause(data);
        }

        @Override
        @JsonProperty("type")
        public String type() {
            return "pause";
        }

        /**
         * The value of the variant.
         *
         * @return the value
         */
        public CreditExhaustedRulePauseVariant data() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pause that = (Pause) o;
            return Objects.equals(data, that.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Pause{" + "data=" + data + "}";
        }

        @Override
        public <R> R accept(Visitor<R> visitor) {
            return visitor.visitPause(data);
        }
    }

    /** The {@code invoice_up_to} variant. */
    @JsonTypeName("invoice_up_to")
    public static final class InvoiceUpTo extends CreditExhaustedRule {
        @JsonUnwrapped
        @JsonIgnoreProperties(value = "type", allowSetters = true)
        private CreditCaps data;

        private InvoiceUpTo() {}

        /**
         * The variant holding {@code data}.
         *
         * @param data the value of the variant
         */
        public InvoiceUpTo(CreditCaps data) {
            this.data = Objects.requireNonNull(data, "data");
        }

        /**
         * The variant holding {@code data}.
         *
         * @param data the value of the variant
         * @return the variant
         */
        public static InvoiceUpTo of(CreditCaps data) {
            return new InvoiceUpTo(data);
        }

        @Override
        @JsonProperty("type")
        public String type() {
            return "invoice_up_to";
        }

        /**
         * The value of the variant.
         *
         * @return the value
         */
        public CreditCaps data() {
            return data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            InvoiceUpTo that = (InvoiceUpTo) o;
            return Objects.equals(data, that.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "InvoiceUpTo{" + "data=" + data + "}";
        }

        @Override
        public <R> R accept(Visitor<R> visitor) {
            return visitor.visitInvoiceUpTo(data);
        }
    }

    /** A variant this version of the SDK does not know. */
    public static final class Unrecognized extends CreditExhaustedRule {
        @JsonProperty("type")
        private String discriminator;

        private final Map<String, JsonNode> properties = new LinkedHashMap<>();

        private Unrecognized() {}

        @Override
        @JsonProperty("type")
        public String type() {
            return discriminator;
        }

        @Override
        public <R> R accept(Visitor<R> visitor) {
            return visitor.visitUnknown(this);
        }

        /**
         * Every other property of the variant.
         *
         * @return the properties by name, unmodifiable
         */
        @JsonAnyGetter
        public Map<String, JsonNode> properties() {
            return Collections.unmodifiableMap(properties);
        }

        @JsonAnySetter
        private void putProperty(String name, JsonNode value) {
            properties.put(name, value);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Unrecognized that = (Unrecognized) o;
            return Objects.equals(discriminator, that.discriminator)
                    && Objects.equals(properties, that.properties);
        }

        @Override
        public int hashCode() {
            return Objects.hash(discriminator, properties);
        }

        @Override
        public String toString() {
            return "Unrecognized{"
                    + "discriminator="
                    + discriminator
                    + ", properties="
                    + properties
                    + "}";
        }
    }
}
