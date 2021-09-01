package com.example.demo.domain.model.engine;


import com.example.demo.domain.enumType.GearBoxType;

public class GearBox {
    private GearBoxType gearBoxType;
    private int numberOfGears;

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
}
