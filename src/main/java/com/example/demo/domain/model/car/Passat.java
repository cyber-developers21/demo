package com.example.demo.domain.model.car;


import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;

public class Passat extends Vehicle {

    public Passat(){

    }
    public Passat(double length, double weight, ColourPalette colourPalette, ModelType modelType, Engine engine) {
        super(length, weight, colourPalette, modelType, engine);
    }
}
