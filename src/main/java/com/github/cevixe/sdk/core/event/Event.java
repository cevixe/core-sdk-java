package com.github.cevixe.sdk.core.event;

import java.time.LocalDateTime;
import com.github.cevixe.sdk.core.entity.Entity;

public interface Event {
    String getId();
    String getSource();
    EventClass getEventClass();
    String getType();
    LocalDateTime getTime();
    String getAuthor();
    Entity getEntity();
    Event getTrigger();
    String getTransaction();

    <T> void setData(T data);
}
