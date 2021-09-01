package com.example.demo.controller;

import com.example.demo.domain.enumType.ColourPalette;
import com.example.demo.domain.enumType.DriveType;
import com.example.demo.domain.enumType.GearBoxType;
import com.example.demo.domain.enumType.ModelType;
import com.example.demo.domain.model.Prototype;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import com.example.demo.service.PrototypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

@RestController
public class PrototypeController {

    private final PrototypeService prototypeService;

    public PrototypeController(PrototypeService prototypeService) {
        this.prototypeService = prototypeService;
    }


    @GetMapping("build-prototype")
    public String buildPrototype() {
        Engine engine = new Engine();
        engine.setEngineId(UUID.randomUUID());
        GearBox gearBox = new GearBox();
        gearBox.setGearBoxType(GearBoxType.AUTOMATIC);
        gearBox.setNumberOfGears(4);
        Prototype prototype = prototypeService.buildPrototype(123d, 231d,
                Arrays.asList(ColourPalette.BLUE, ColourPalette.GREEN), Collections.singletonList(gearBox),
                Collections.singletonList(engine), Collections.singletonList(DriveType.AUTONOM), Collections.singletonList(ModelType.CROSS_OVER));
        System.out.println(prototype.getLength());
        return String.valueOf(prototype.getLength());
    }
}
