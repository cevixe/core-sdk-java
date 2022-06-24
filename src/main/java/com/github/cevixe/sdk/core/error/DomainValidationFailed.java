package com.github.cevixe.sdk.core.error;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class DomainValidationFailed extends Exception implements Serializable {
    private final String name;

    public DomainValidationFailed(String name, String description) {
        super (description);
        this.name = name;
    }

    public DomainValidationFailed(String name, String description, Throwable cause) {
        super(description, cause);
        this.name = name;
    }
}
