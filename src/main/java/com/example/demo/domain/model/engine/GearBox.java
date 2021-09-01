package com.example.demo.domain.model.engine;


import com.example.demo.domain.enum_type.GearBoxType;

import java.math.BigDecimal;

public class GearBox {
    private GearBoxType gearBoxType;
    private int numberOfGears;
    private double totalDuration;
    private BigDecimal price;

    public GearBox() {
    }

    public GearBox(GearBoxType gearBoxType, int numberOfGears, double totalDuration, BigDecimal price) {
        this.gearBoxType = gearBoxType;
        this.numberOfGears = numberOfGears;
        this.totalDuration = totalDuration;
        this.price = price;
    }

    public GearBoxType getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(GearBoxType gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public double getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(double totalDuration) {
        this.totalDuration = totalDuration;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
