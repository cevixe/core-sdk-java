package com.github.cevixe.sdk.core.event;

import com.github.cevixe.sdk.core.common.Context;
import com.github.cevixe.sdk.core.entity.Entity;

public interface EventFactory {
    <E> Event newSystemEvent(Context ctx , E data);
    <E> Event newCommandEvent(Context ctx , E data);
    <E> Event newBusinessEvent(Context ctx , E data);
    <E, S> Event newDomainEvent(Context ctx , E data, Entity entity, S state);
    <E, S> Event newFirstDomainEvent(Context ctx , E data, S state);
    <E, S> Event newFirstDomainEventWithCustomID(Context ctx , E data, String id, S state);

    <E> Event newSystemEventWithCustomType(Context ctx, String type, E data);
    <E> Event newCommandEventWithCustomType(Context ctx, String type, E data);
    <E> Event newBusinessEventWithCustomType(Context ctx, String type, E data);
    <E, S> Event newDomainEventWithCustomType(Context ctx, String type, E data, Entity entity, S state);
    <E, S> Event newFirstDomainEventWithCustomType(Context ctx, String type, E data, S state);
    <E, S> Event newFirstDomainEventWithCustomIDAndCustomType(Context ctx, String type, E data, String id, S state);
}
