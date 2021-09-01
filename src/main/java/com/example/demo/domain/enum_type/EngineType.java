package com.example.demo.domain.enum_type;

public enum EngineType {
    ELECTRICITY(0), GASOLINE(1), DIESEL(2);

    private int value;

    EngineType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
