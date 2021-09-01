package com.example.demo.domain.enumType;

public enum GearBoxType {
    AUTOMATIC(0), MANUAL(1), SEMI_AUTOMATIC(2);

    public int value;


    GearBoxType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
