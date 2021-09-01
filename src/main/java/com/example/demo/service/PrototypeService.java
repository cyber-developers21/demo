package com.example.demo.service;

import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.Prototype;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;

import java.util.List;

public interface PrototypeService {
    Prototype buildPrototype(double weight, double length,
                             List<ColourPalette> colourPaletteList, List<GearBox> gearBoxList,
                             List<Engine> engineList, List<DriveType> driveTypeList,
                             List<ModelType> modelTypeList);

}
