package com.github.cevixe.sdk.cevixe;

import com.github.cevixe.sdk.core.entity.Entity;
import com.github.cevixe.sdk.core.common.Context;
import com.github.cevixe.sdk.core.event.Event;
import com.github.cevixe.sdk.core.event.EventFactory;

public class EventService {

    public <E> Event newCommandEvent(Context ctx, E data) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newCommandEvent(ctx, data);
    }

    public <E> Event newCommandEventWithCustomType(Context ctx, String type, E data) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newCommandEventWithCustomType(ctx, type, data);
    }

    public <E, S> Event newDomainEvent(Context ctx, Entity entity, E data, S state) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newDomainEvent(ctx, data, entity, state);
    }

    public <E, S> Event newDomainEventWithCustomType(Context ctx, Entity entity, String type, E data, S state) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newDomainEventWithCustomType(ctx, type, data, entity, state);
    }

    public <E, S> Event newFirstDomainEvent(Context ctx, E data, S state) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newFirstDomainEvent(ctx, data, state);
    }

    public <E, S> Event newFirstDomainEventWithCustomType(Context ctx, String type, E data, S state) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newFirstDomainEventWithCustomType(ctx, type, data, state);
    }

    public <E, S> Event newFirstDomainEventWithCustomID(Context ctx, E data, String id, S state) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newFirstDomainEventWithCustomID(ctx, data, id, state);
    }

    public <E, S> Event newFirstDomainEventWithCustomIDAndCustomType(Context ctx, String type, E data, String id, S state) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newFirstDomainEventWithCustomIDAndCustomType(ctx, type, data, id, state);
    }

    public <E> Event newBusinessEvent(Context ctx, E data) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newBusinessEvent(ctx, data);
    }

    public <E> Event newBusinessEventWithCustomID(Context ctx, E data) {
        EventFactory factory = ctx.get(Constants.CEVIXE_EVENT_FACTORY, EventFactory.class);
        return factory.newBusinessEvent(ctx, data);
    }

}
