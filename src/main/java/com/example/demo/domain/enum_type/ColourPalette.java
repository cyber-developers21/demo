package com.example.demo.domain.enum_type;

import java.math.BigDecimal;

public enum ColourPalette {
    RED(0, 4.9, BigDecimal.valueOf(321.4)),
    BLUE(1, 6.2, BigDecimal.valueOf(412.6)),
    YELLOW(2, 3.8, BigDecimal.valueOf(514.2)),
    GREEN(3, 4.2, BigDecimal.valueOf(346.3)),
    WHITE(4, 0, BigDecimal.valueOf(100.0)),
    BLACK(5, 3.1, BigDecimal.valueOf(300.0));

    private int value;
    private double duration;
    private BigDecimal price;

    ColourPalette(int value, double duration, BigDecimal price) {
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
