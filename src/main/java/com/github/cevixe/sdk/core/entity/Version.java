package com.github.cevixe.sdk.core.entity;

import java.time.LocalDateTime;

public interface Version {
    String getId();
    LocalDateTime getTime();
    String getAuthor();
}
