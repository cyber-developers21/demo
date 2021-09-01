package com.example.demo.domain.enumType;

import java.math.BigDecimal;

public enum ColourPalette {
    RED(0,4.9, BigDecimal.valueOf(321.4)),
    BLUE(1,6), YELLOW(2,3),
    GREEN(3,1), WHITE(4,0),
    BLACK(5,3);

    public int value;
    public double duration;
    public BigDecimal price;

    ColourPalette(int value, double duration, BigDecimal price) {
        this.value = value;
        this.duration = duration;
        this.price = price;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
