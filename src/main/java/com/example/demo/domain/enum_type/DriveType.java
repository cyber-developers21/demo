package com.example.demo.domain.enum_type;

import java.math.BigDecimal;

public enum DriveType {
    AUTONOM(0, 12, BigDecimal.valueOf(321.4)),
    HALF_AUTONOM(1, 64, BigDecimal.valueOf(412.6)),
    SELF_DRIVE(2, 132, BigDecimal.valueOf(514.2));

    private int value;
    private double duration;
    private BigDecimal price;

    DriveType(int value, double duration, BigDecimal price) {
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
