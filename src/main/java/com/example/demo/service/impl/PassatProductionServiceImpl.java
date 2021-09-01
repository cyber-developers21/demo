package com.example.demo.service.impl;

import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.Duration;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.service.ProductionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassatProductionServiceImpl implements ProductionService {
    @Override
    public Vehicle releaseNewCar(Engine engine, ColourPalette colourPalette, ModelType modelType) {
        List<Duration> durationList = new ArrayList<>();
        durationList.add(new Duration(colourPalette.name(), colourPalette.duration));

        return null;
    }

    private double calculateDuration(Map<String, Double> toolMap){


    }

    private double calculatePrice(Map<String, Double> toolMap){


    }
}
