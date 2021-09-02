package com.example.demo.domain.enum_type;

import java.math.BigDecimal;

public enum EngineType {
    GASOLINE(0, 70,BigDecimal.valueOf(321.4)),
    DIESEL(1, 140, BigDecimal.valueOf(512.6)),
    ELECTRICITY(2, 300, BigDecimal.valueOf(814.2));

    private int value;
    private double duration;
    private BigDecimal price;

    EngineType(int value, double duration, BigDecimal price) {
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
