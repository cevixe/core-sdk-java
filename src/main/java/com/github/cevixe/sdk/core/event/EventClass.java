package com.github.cevixe.sdk.core.event;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventClass {

    COMMAND_EVENT("C"),
    DOMAIN_EVENT("D"),
    BUSINESS_EVENT("B"),
    SYSTEM_EVENT("S");

    private final String shortName;

    EventClass(String shortName) {
        this.shortName = shortName;
    }

    @JsonValue
    public String getShorName() {
        return shortName;
    }

    public static EventClass of(String shortName) {
        return switch (shortName) {
            case "C" -> COMMAND_EVENT;
            case "D" -> DOMAIN_EVENT;
            case "B" -> BUSINESS_EVENT;
            case "S" -> SYSTEM_EVENT;
            default -> null;
        };
    }
}
