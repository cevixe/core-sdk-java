package com.github.cevixe.sdk.core.event;

import com.github.cevixe.sdk.core.common.Context;
import com.github.cevixe.sdk.core.common.Page;

import java.time.LocalDateTime;

public interface EventStorage {
    Event getLastEvent(Context ctx, String source);
    Event getEventByID(Context ctx, String source, String id);
    Page<Event> getEntityEvents(Context ctx, String type, String id,
                                LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
    Page<Event> getDayEvents(Context ctx, String day,
                             LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
    Page<Event> getTypeEvents(Context ctx, String type,
                              LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
    Page<Event> getAuthorEvents(Context ctx, String author,
                                LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
    Page<Event> getTransactionEvents(Context ctx, String transaction,
                                     LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
}
