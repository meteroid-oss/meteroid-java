// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.CustomPropertyDefinition;
import com.meteroid.models.CustomPropertyDefinitionListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link CustomProperties#listCustomPropertyDefinitions}: the {@link
 * CustomPropertyDefinition} items of one response, and the properties of its body, {@link
 * CustomPropertyDefinitionListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class CustomPropertiesListCustomPropertyDefinitionsPage
        extends Page<CustomPropertiesListCustomPropertyDefinitionsPage, CustomPropertyDefinition> {
    private final CustomPropertyDefinitionListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CustomPropertiesListCustomPropertyDefinitionsPage(
            CustomPropertyDefinitionListResponse body,
            List<CustomPropertyDefinition> items,
            Supplier<CustomPropertiesListCustomPropertyDefinitionsPage> next) {
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
        return "CustomPropertiesListCustomPropertyDefinitionsPage{body="
                + body
                + ", hasNextPage="
                + hasNextPage()
                + "}";
    }
}
