package com.example.demo.service.impl.prototype;


import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.DriveType;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.OptionList;
import com.example.demo.domain.model.Prototype;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import com.example.demo.service.PrototypeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PassatPrototypeServiceImpl implements PrototypeService {

    public PassatPrototypeServiceImpl() {

    }

    @Override
    public Prototype buildPrototype(double weight, double length,
                                    List<ColourPalette> colourPaletteList, List<GearBox> gearBoxList,
                                    List<Engine> engineList, List<DriveType> driveTypeList,
                                    List<ModelType> modelTypeList) {

        Prototype prototype = new Prototype();
        OptionList optionList = new OptionList();

        optionList.setColourMap(filMap(colourPaletteList));
        optionList.setDriveMap(filMap(driveTypeList));
        optionList.setGearBoxMap(filMap(gearBoxList));
        optionList.setModelMap(filMap(modelTypeList));
        optionList.setEngineList(engineList);

        prototype.setLength(length);
        prototype.setWeight(weight);
        prototype.setOptionList(optionList);
        return prototype;
    }


    public <T> Map<Integer, String> filMap(List<T> t){
        Map<Integer, String> colourMap = new HashMap<>();
        for (T tt : t){
            if(tt instanceof ColourPalette){
                colourMap.put(((ColourPalette) tt).getValue(), ((ColourPalette) tt).name());
            }
        }
        return colourMap;
    }
}
