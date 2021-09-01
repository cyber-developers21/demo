package com.example.demo.domain.model;

import com.example.demo.domain.model.engine.Engine;

import java.util.List;
import java.util.Map;

public class OptionList {
    private Map<Integer, String> colourMap;
    private Map<Integer, String> modelMap;
    private Map<Integer, String> driveMap;
    private Map<Integer, String> gearBoxMap;
    private List<Engine> engineList;

    public Map<Integer, String> getColourMap() {
        return colourMap;
    }

    public void setColourMap(Map<Integer, String> colourMap) {
        this.colourMap = colourMap;
    }

    public Map<Integer, String> getModelMap() {
        return modelMap;
    }

    public void setModelMap(Map<Integer, String> modelMap) {
        this.modelMap = modelMap;
    }

    public Map<Integer, String> getDriveMap() {
        return driveMap;
    }

    public void setDriveMap(Map<Integer, String> driveMap) {
        this.driveMap = driveMap;
    }

    public Map<Integer, String> getGearBoxMap() {
        return gearBoxMap;
    }

    public void setGearBoxMap(Map<Integer, String> gearBoxMap) {
        this.gearBoxMap = gearBoxMap;
    }

    public List<Engine> getEngineList() {
        return engineList;
    }

    public void setEngineList(List<Engine> engineList) {
        this.engineList = engineList;
    }
}
