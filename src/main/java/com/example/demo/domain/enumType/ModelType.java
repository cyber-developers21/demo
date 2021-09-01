package com.example.demo.domain.enumType;

public enum ModelType {
    SUV(0), HATCH_BACK(1), SEDAN(2), STATION(3), CROSS_OVER(4);

    public int value;


    ModelType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
