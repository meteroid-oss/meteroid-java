// this file is @generated
package com.meteroid.api;

import com.meteroid.models.WebhookDeliveryStatus;

import java.util.Objects;
import java.util.Optional;

/** Optional parameters of {@code listDeliveries}, immutable: build them with {@link #builder()}. */
public final class WebhookEndpointsEndpointsListDeliveriesOptions {
    private final WebhookDeliveryStatus status;
    private final Integer page;
    private final Integer perPage;

    private WebhookEndpointsEndpointsListDeliveriesOptions(Builder builder) {
        this.status = builder.status;
        this.page = builder.page;
        this.perPage = builder.perPage;
    }

    /**
     * A builder of parameters.
     *
     * @return a new builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * No parameters.
     *
     * @return empty parameters
     */
    public static WebhookEndpointsEndpointsListDeliveriesOptions none() {
        return builder().build();
    }

    /**
     * A builder starting from these parameters.
     *
     * @return a new builder
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.status = status;
        builder.page = page;
        builder.perPage = perPage;
        return builder;
    }

    /**
     * Only return deliveries in this state.
     *
     * @return the value, empty when unset
     */
    public Optional<WebhookDeliveryStatus> status() {
        return Optional.ofNullable(status);
    }

    /**
     * Page number (0-indexed)
     *
     * @return the value, empty when unset
     */
    public Optional<Integer> page() {
        return Optional.ofNullable(page);
    }

    /**
     * Number of items per page
     *
     * @return the value, empty when unset
     */
    public Optional<Integer> perPage() {
        return Optional.ofNullable(perPage);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookEndpointsEndpointsListDeliveriesOptions that =
                (WebhookEndpointsEndpointsListDeliveriesOptions) o;
        return Objects.equals(status, that.status)
                && Objects.equals(page, that.page)
                && Objects.equals(perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, page, perPage);
    }

    @Override
    public String toString() {
        return "WebhookEndpointsEndpointsListDeliveriesOptions{"
                + "status="
                + status
                + ", page="
                + page
                + ", perPage="
                + perPage
                + "}";
    }

    /** Builds {@link WebhookEndpointsEndpointsListDeliveriesOptions}. */
    public static final class Builder {
        private WebhookDeliveryStatus status;
        private Integer page;
        private Integer perPage;

        private Builder() {}

        /**
         * Only return deliveries in this state.
         *
         * @param status the value, null to leave it out
         * @return this builder
         */
        public Builder status(WebhookDeliveryStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Page number (0-indexed)
         *
         * @param page the value, null to leave it out
         * @return this builder
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * Number of items per page
         *
         * @param perPage the value, null to leave it out
         * @return this builder
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * The parameters.
         *
         * @return immutable parameters
         */
        public WebhookEndpointsEndpointsListDeliveriesOptions build() {
            return new WebhookEndpointsEndpointsListDeliveriesOptions(this);
        }
    }
}
