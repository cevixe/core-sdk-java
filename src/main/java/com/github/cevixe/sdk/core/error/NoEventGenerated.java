package com.github.cevixe.sdk.core.error;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class NoEventGenerated extends Exception implements Serializable {
    private final String handler;

    public NoEventGenerated(String handler) {
        super();
        this.handler = handler;
    }

    public NoEventGenerated(String handler, Throwable cause) {
        super(cause);
        this.handler = handler;
    }

    public NoEventGenerated(String handler, String message, Throwable cause) {
        super(message, cause);
        this.handler = handler;
    }
}
