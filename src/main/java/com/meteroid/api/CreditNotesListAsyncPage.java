// this file is @generated
package com.meteroid.api;

import com.meteroid.AsyncPage;
import com.meteroid.models.CreditNote;
import com.meteroid.models.CreditNoteListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * A page of {@link CreditNotesAsync#list}: the {@link CreditNote} items of one response, and the
 * properties of its body, {@link CreditNoteListResponse}.
 */
public final class CreditNotesListAsyncPage
        extends AsyncPage<CreditNotesListAsyncPage, CreditNote> {
    private final CreditNoteListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CreditNotesListAsyncPage(
            CreditNoteListResponse body,
            List<CreditNote> items,
            Supplier<CompletableFuture<CreditNotesListAsyncPage>> next) {
        super(items, next);
        this.body = body;
    }

    /**
     * The response body, as received.
     *
     * @return the body
     */
    public CreditNoteListResponse body() {
        return body;
    }

    /**
     * The {@code data} property.
     *
     * @return the value, never null
     */
    public List<CreditNote> data() {
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
        return "CreditNotesListAsyncPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
