// this file is @generated
package com.meteroid.api;

import com.meteroid.Page;
import com.meteroid.models.CreditNote;
import com.meteroid.models.CreditNoteListResponse;
import com.meteroid.models.PaginationResponse;

import java.util.List;
import java.util.function.Supplier;

/**
 * A page of {@link CreditNotes#list}: the {@link CreditNote} items of one response, and the
 * properties of its body, {@link CreditNoteListResponse}.
 *
 * <p>Iterating it yields every item from this page on, fetching the next pages as the iteration
 * goes.
 */
public final class CreditNotesListPage extends Page<CreditNotesListPage, CreditNote> {
    private final CreditNoteListResponse body;

    /**
     * A page, built by the SDK.
     *
     * @param body the response body
     * @param items the items of the page
     * @param next fetches the next page, or null on the last page
     */
    public CreditNotesListPage(
            CreditNoteListResponse body,
            List<CreditNote> items,
            Supplier<CreditNotesListPage> next) {
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
        return "CreditNotesListPage{body=" + body + ", hasNextPage=" + hasNextPage() + "}";
    }
}
