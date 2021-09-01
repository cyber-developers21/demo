package com.example.demo.service.impl;

import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;

public class GolfProductionServiceImpl implements ProductionService {

    @Override
    public Vehicle releaseNewCar(Engine engine, ColourPalette colourPalette, ModelType modelType) {
        return null;
    }
}
