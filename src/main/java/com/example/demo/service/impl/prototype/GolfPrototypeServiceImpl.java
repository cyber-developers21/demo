package com.example.demo.service.impl.prototype;


import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.GearBoxType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.OptionList;
import com.example.demo.domain.model.Prototype;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import com.example.demo.service.PrototypeService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GolfPrototypeServiceImpl implements PrototypeService {

    private static final double FIX_WIDTH = 1832;
    private static final double FIX_LENGTH = 4775;
    private static final double FIX_HEIGHT = 1442;

    @Override
    public Prototype buildPrototype() {

        Prototype prototype = new Prototype();
        OptionList optionList = new OptionList();

        List<ColourPalette> colourPaletteOptions = Arrays.asList(ColourPalette.BLUE, ColourPalette.GREEN, ColourPalette.BLACK);
        List<Engine> engineOptions = getEngineOptions();
        List<GearBox> gearBoxOptions = getGearBoxOptions();
        List<DriveType> driveTypeOptions = Collections.singletonList(DriveType.AUTONOM);
        List<ModelType> modelTypeOptions = Collections.singletonList(ModelType.SEDAN);

        optionList.setColourMap(filMap(colourPaletteOptions));
        optionList.setEngineList(engineOptions);
        optionList.setGearBoxMap(gearBoxOptions);
        optionList.setDriveMap(filMap(driveTypeOptions));
        optionList.setModelMap(filMap(modelTypeOptions));

        prototype.setLength(FIX_LENGTH);
        prototype.setWidth(FIX_WIDTH);
        prototype.setHeight(FIX_HEIGHT);
        prototype.setOptionList(optionList);
        return prototype;
    }

    private List<GearBox> getGearBoxOptions() {
        GearBox gearBox1 = new GearBox();
        gearBox1.setGearBoxType(GearBoxType.AUTOMATIC);
        gearBox1.setNumberOfGears(5);
        GearBox gearBox2 = new GearBox();
        gearBox2.setGearBoxType(GearBoxType.SEMI_AUTOMATIC);
        gearBox2.setNumberOfGears(8);
        return Arrays.asList(gearBox1, gearBox2);
    }

    private List<Engine> getEngineOptions() {
        Engine engine1 = new Engine();
        engine1.setHorsePower(160);
        engine1.setTork(350);
        engine1.setVolume(2000);
        Engine engine2 = new Engine();
        engine2.setHorsePower(200);
        engine2.setTork(500);
        engine2.setVolume(3000);
        return Arrays.asList(engine1, engine2);
    }

    private <T> Map<Integer, String> filMap(List<T> t) {
        Map<Integer, String> colourMap = new HashMap<>();
        for (T tt : t) {
            if (tt instanceof ColourPalette) {
                colourMap.put(((ColourPalette) tt).getValue(), ((ColourPalette) tt).name());
            } else if (tt instanceof DriveType) {
                colourMap.put(((DriveType) tt).getValue(), ((DriveType) tt).name());
            } else if (tt instanceof ModelType) {
                colourMap.put(((ModelType) tt).getValue(), ((ModelType) tt).name());
            }
        }
        return colourMap;
    }
}
