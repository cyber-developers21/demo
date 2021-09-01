package com.example.demo.service;

import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;

public interface ProductionService {
    Vehicle releaseNewCar(Engine engine, ColourPalette colourPalette, ModelType modelType);
}
