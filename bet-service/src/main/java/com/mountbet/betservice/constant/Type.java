package com.mountbet.betservice.constant;

public enum Type {
    PLACE_ORDERS("Place an order"),
    REPLACE_ORDERS("Replace an order"),
    CANCEL_ORDERS("Cancel an order"),
    UPDATE_ORDERS("Update an order"),
    SUBSCRIBE_ORDERS("Order subscription");

    private String description;

    private Type(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public static Type fromString(String code) throws IllegalArgumentException {
        return Type.valueOf(code);
    }
}
