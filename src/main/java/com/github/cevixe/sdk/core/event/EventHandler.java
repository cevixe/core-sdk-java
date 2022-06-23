package com.github.cevixe.sdk.core.event;

import com.github.cevixe.sdk.core.common.Context;

import java.util.function.BiFunction;

public interface EventHandler extends BiFunction<Context, Event, Event> {
}
