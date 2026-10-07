// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.CustomPropertyDefinition;
import com.meteroid.models.CustomPropertyDefinitionListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link CustomPropertiesAsync#listCustomPropertyDefinitions}: the {@link
 * CustomPropertyDefinition} items of one response, and the properties of its body, {@link
 * CustomPropertyDefinitionListResponse}.
 */
public final class CustomPropertiesListCustomPropertyDefinitionsAsyncPage
        extends AsyncPage<
                CustomPropertiesListCustomPropertyDefinitionsAsyncPage, CustomPropertyDefinition> {
    private final CustomPropertyDefinitionListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CustomPropertiesListCustomPropertyDefinitionsAsyncPage(
            CustomPropertyDefinitionListResponse body,
            List<CustomPropertyDefinition> items,
            Supplier<CompletableFuture<CustomPropertiesListCustomPropertyDefinitionsAsyncPage>>
                    next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public CustomPropertyDefinitionListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<CustomPropertyDefinition> data() {
        return body.data();
    }

    /**
     * The {@code pagination_meta} property.
     *
     * @return the value, never null
     */
    public PaginationResponse paginationMeta() {
        return body.paginationMeta();
    }

    @Override
    public String toString() {
        return "CustomPropertiesListCustomPropertyDefinitionsAsyncPage{body="
                + body
                + ", hasNextPage="
                + hasNextPage()
                + "}";
    }
}
