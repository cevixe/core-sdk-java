package com.github.cevixe.sdk.core.error;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class DomainEntityNotFound extends Exception implements Serializable {
    private final String type;
    private final String id;

    public DomainEntityNotFound(String type, String id) {
        super();
        this.type = type;
        this.id = id;
    }

    public DomainEntityNotFound(String type, String id, String error, Throwable cause) {
        super(error, cause);
        this.type = type;
        this.id = id;
    }
}
