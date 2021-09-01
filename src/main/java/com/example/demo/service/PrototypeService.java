package com.example.demo.service;

import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.DriveType;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.Prototype;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PrototypeService {
    Prototype buildPrototype(double weight, double length,
                             List<ColourPalette> colourPaletteList, List<GearBox> gearBoxList,
                             List<Engine> engineList, List<DriveType> driveTypeList,
                             List<ModelType> modelTypeList);

}
