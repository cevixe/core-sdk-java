package com.github.cevixe.sdk.core.error;


import lombok.Getter;

import java.io.Serializable;

@Getter
public class EventHandlingFailed extends Exception implements Serializable {
    private final String handler;

    public EventHandlingFailed(String handler, String error, Throwable cause) {
        super(error, cause);
        this.handler = handler;
    }
}
