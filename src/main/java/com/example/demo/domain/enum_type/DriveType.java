package com.example.demo.domain.enum_type;

import java.math.BigDecimal;

public enum DriveType {
    SELF_DRIVE(0, 132, BigDecimal.valueOf(314.2)),
    HALF_AUTONOM(1, 64, BigDecimal.valueOf(412.6)),
    AUTONOM(2, 12, BigDecimal.valueOf(521.4));

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
