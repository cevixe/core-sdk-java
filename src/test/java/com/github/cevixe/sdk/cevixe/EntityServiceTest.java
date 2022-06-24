package com.github.cevixe.sdk.cevixe;

import com.github.cevixe.sdk.core.common.Context;
import com.github.cevixe.sdk.core.entity.Entity;
import com.github.cevixe.sdk.core.event.StateStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

@DisplayName("Test entity service class")
public class EntityServiceTest {

    @Mock
    Context ctx;

    @Mock
    StateStorage stateStorage;

    @Mock
    Entity entity;

    @BeforeEach
    public void setUp() {
        ctx = mock(Context.class);
        stateStorage = mock(StateStorage.class);
        entity = mock(Entity.class);
        when(ctx.get(Constants.CEVIXE_STATE_STORE, StateStorage.class)).thenReturn(stateStorage);
    }

    @Test
    @DisplayName("Verifying the context and state storage calls for getEntity Method")
    public void getEntityTest() {
        //Given
        when(stateStorage.getLastVersion(ctx, "", "")).thenReturn(entity);

        //When
        EntityService es = new EntityService();
        Entity e1 = es.getEntity(ctx, "", "");

        //Then
        verify(ctx, times(1)).get(any(), any());
        verify(stateStorage, times(1)).getLastVersion(any(), any(), any());
    }

    @Test
    @DisplayName("Verifying the context and state storage calls for getEntityVersion Method")
    public void getEntityVersionTest() {

        when(stateStorage.getByVersion(ctx, "", "", 0)).thenReturn(entity);

        //When
        EntityService es = new EntityService();
        Entity e1 = es.getEntityVersion(ctx, "", "", 0);

        //Then
        verify(ctx, times(1)).get(any(), any());
        verify(stateStorage, times(1)).getByVersion(any(), any(), any(), any());
    }
}
