package com.example.demo.domain.model;

import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Vehicle {
    private UUID vehicleId;
    private double length;
    private double weight;
    private ColourPalette colourPalette;
    private ModelType modelType;
    private DriveType driveType;
    private OptionList optionList;
    private Engine engine;
    private GearBox gearBox;
    private double totalDuration;
    private BigDecimal price;

    protected Vehicle() {
    }

    protected Vehicle(UUID vehicleId, double length, double weight, ColourPalette colourPalette, ModelType modelType,
                      DriveType driveType, Engine engine, GearBox gearBox) {
        this.vehicleId = vehicleId;
        this.length = length;
        this.weight = weight;
        this.colourPalette = colourPalette;
        this.modelType = modelType;
        this.driveType = driveType;
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ColourPalette getColourPalette() {
        return colourPalette;
    }

    public void setColourPalette(ColourPalette colourPalette) {
        this.colourPalette = colourPalette;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }

    public OptionList getOptionList() {
        return optionList;
    }

    public void setOptionList(OptionList optionList) {
        this.optionList = optionList;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
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
