package com.example.demo.domain.enum_type;

import java.math.BigDecimal;

public enum GearBoxType {
    MANUAL(0, 50,BigDecimal.valueOf(321.4)),
    SEMI_AUTOMATIC(1, 100, BigDecimal.valueOf(412.6)),
    AUTOMATIC(2, 200, BigDecimal.valueOf(514.2));

    private int value;
    private double duration;
    private BigDecimal price;

    GearBoxType(int value, double duration, BigDecimal price) {
        this.value = value;
        this.duration = duration;
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public double getDuration() {
        return duration;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
