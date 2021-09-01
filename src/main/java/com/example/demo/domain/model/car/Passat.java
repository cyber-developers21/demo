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
    public Passat(UUID vehicleId, double length, double weight, ColourPalette colourPalette, ModelType modelType, DriveType driveType,
                  Engine engine, GearBox gearBox) {
        super(vehicleId, length, weight, colourPalette, modelType, driveType, engine, gearBox);
    }
}
