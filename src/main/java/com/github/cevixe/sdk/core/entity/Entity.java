package com.github.cevixe.sdk.core.entity;

import java.time.LocalDateTime;

public interface Entity {
    String getId();
    String getType();
    String getVersion();
    LocalDateTime getUpdatedAt();
    String getUpdatedBy();
    LocalDateTime getCreatedAt();
    String getCreatedBy();
    Boolean isDeleted();
    <T> void setState(T value);
}
