package com.example.demo.service.impl.prototype;


import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.EngineType;
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

import static com.example.demo.util.VehicleSizeConstants.PASSAT_FIX_HEIGHT;
import static com.example.demo.util.VehicleSizeConstants.PASSAT_FIX_LENGTH;
import static com.example.demo.util.VehicleSizeConstants.PASSAT_FIX_WIDTH;

@Service
public class PassatPrototypeServiceImpl implements PrototypeService {

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

        prototype.setLength(PASSAT_FIX_LENGTH);
        prototype.setWidth(PASSAT_FIX_WIDTH);
        prototype.setHeight(PASSAT_FIX_HEIGHT);
        prototype.setOptionList(optionList);
        return prototype;
    }

    private List<GearBox> getGearBoxOptions() {
        GearBox gearBox1 = new GearBox();
        generateGearBox(gearBox1, GearBoxType.MANUAL, 5);
        GearBox gearBox2 = new GearBox();
        generateGearBox(gearBox2, GearBoxType.SEMI_AUTOMATIC, 8);
        return Arrays.asList(gearBox1, gearBox2);
    }

    private void generateGearBox(GearBox gearBox1, GearBoxType automatic, int numberOfGears) {
        gearBox1.setGearBoxType(automatic);
        gearBox1.setNumberOfGears(numberOfGears);
    }

    private List<Engine> getEngineOptions() {
        Engine engine1 = new Engine();
        engine1.setHorsePower(160);
        engine1.setTork(350);
        engine1.setVolume(2000);
        engine1.setEngineType(EngineType.GASOLINE);
        Engine engine2 = new Engine();
        engine2.setHorsePower(150);
        engine2.setTork(320);
        engine2.setVolume(2500);
        engine2.setEngineType(EngineType.DIESEL);
        Engine engine3 = new Engine();
        engine3.setHorsePower(200);
        engine3.setTork(500);
        engine3.setVolume(3000);
        engine3.setEngineType(EngineType.GASOLINE);
        Engine engine4 = new Engine();
        engine4.setHorsePower(180);
        engine4.setTork(450);
        engine4.setVolume(3500);
        engine4.setEngineType(EngineType.DIESEL);
        Engine engine5 = new Engine();
        engine5.setHorsePower(250);
        engine5.setTork(600);
        engine5.setVolume(3000);
        engine5.setEngineType(EngineType.ELECTRICITY);
        return Arrays.asList(engine1, engine2, engine3, engine4, engine5);
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
