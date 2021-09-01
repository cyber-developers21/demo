package com.example.demo.domain.enum_type;

import java.math.BigDecimal;

public enum ModelType {
    SUV(0, 4.9,BigDecimal.valueOf(521.4)),
    HATCH_BACK(1, 6.2, BigDecimal.valueOf(212.6)),
    SEDAN(2, 3.8, BigDecimal.valueOf(314.2)),
    STATION(3, 4.2, BigDecimal.valueOf(446.3)),
    CROSS_OVER(4, 0, BigDecimal.valueOf(500.0));

    private int value;
    private double duration;
    private BigDecimal price;

    ModelType(int value, double duration, BigDecimal price) {
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
