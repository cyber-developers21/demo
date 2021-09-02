package com.example.demo.service;

import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;

public interface ProductionService {
    Vehicle releaseNewCar(ColourPalette colourPalette, ModelType modelType, DriveType driveType,
                          Engine engine, GearBox gearBox);
}
