package com.example.demo.domain.model.car;


import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;

import java.math.BigDecimal;
import java.util.UUID;

public class Passat extends Vehicle {

    public Passat(){

    }
    public Passat(double length, double Width, double height, ColourPalette colourPalette, ModelType modelType,
                  DriveType driveType, Engine engine, GearBox gearBox) {
        super(length, Width, height, colourPalette, modelType, driveType, engine, gearBox);
    }
}
