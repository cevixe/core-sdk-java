package com.github.cevixe.sdk.core.common;

import java.util.concurrent.ConcurrentHashMap;

public class Context {
    private final ThreadLocal<ConcurrentHashMap<String, Object>> tlMap = ThreadLocal.withInitial(ConcurrentHashMap::new);

    private Context(){}

    public static Context backgroud(){
        return new Context();
    }

    public Context put(String key, Object value) {
        tlMap.get().put(key, value);
        return this;
    }

    public <T> T get(String key, Class<T> clazz) {
        return clazz.cast(tlMap.get().get(key));
    }

    public void end(){
        tlMap.remove();
    }

}
