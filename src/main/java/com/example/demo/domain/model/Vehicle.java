package com.example.demo.domain.model;

import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.engine.Engine;

import java.util.UUID;

public abstract class Vehicle{
    private UUID vehicleId;
    private double length;
    private double weight;
    private ColourPalette colourPalette;
    private ModelType modelType;
    private Engine engine;
    private OptionList optionList;

    public Vehicle(){

    }

    public Vehicle(double length, double weight, ColourPalette colourPalette, ModelType modelType, Engine engine) {
        this.length = length;
        this.weight = weight;
        this.colourPalette = colourPalette;
        this.modelType = modelType;
        this.engine = engine;
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

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ColourPalette getColourPalette() {
        return colourPalette;
    }

    public void setColourPalette(ColourPalette colourPalette) {
        this.colourPalette = colourPalette;
    }

    public OptionList getOptionList() {
        return optionList;
    }

    public void setOptionList(OptionList optionList) {
        this.optionList = optionList;
    }
}
