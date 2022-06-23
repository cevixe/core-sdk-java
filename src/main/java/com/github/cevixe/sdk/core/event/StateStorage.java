package com.github.cevixe.sdk.core.event;

import com.github.cevixe.sdk.core.common.Context;
import com.github.cevixe.sdk.core.common.Page;
import com.github.cevixe.sdk.core.entity.Entity;
import com.github.cevixe.sdk.core.entity.Version;

import java.time.LocalDateTime;

public interface StateStorage {
    Entity getLastVersion(Context ctx, String type, String id);
    Entity getByVersion(Context ctx, String type, String id, Integer version);

    Page<Version> getVersions(Context ctx, String type, String id,
                              LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
    Page<Entity> getByType(Context ctx, String type,
              LocalDateTime after, LocalDateTime before, String nextToken, Integer limit);
}
