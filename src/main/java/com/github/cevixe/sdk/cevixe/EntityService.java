package com.github.cevixe.sdk.cevixe;

import com.github.cevixe.sdk.core.common.Context;
import com.github.cevixe.sdk.core.entity.Entity;
import com.github.cevixe.sdk.core.event.StateStorage;

public class EntityService {
    public Entity getEntity(Context ctx, String type, String id) {
        StateStorage stateStorage = ctx.get(Constants.CEVIXE_STATE_STORE, StateStorage.class);
        return stateStorage.getLastVersion(ctx, type, id);
    }

    public Entity getEntityVersion(Context ctx, String type, String id, Integer version) {
        StateStorage stateStorage = ctx.get(Constants.CEVIXE_STATE_STORE, StateStorage.class);
        return stateStorage.getByVersion(ctx, type, id, version);
    }
}
