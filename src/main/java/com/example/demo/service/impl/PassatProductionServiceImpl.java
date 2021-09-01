package com.example.demo.service.impl;

import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.Duration;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.car.Passat;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import com.example.demo.service.ProductionService;
import com.example.demo.util.PriceConstants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class PassatProductionServiceImpl implements ProductionService {
    @Override
    public Vehicle releaseNewCar(UUID vehicleId, double length, double weight, ColourPalette colourPalette,
                                 ModelType modelType, DriveType driveType, Engine engine, GearBox gearBox) {

        Vehicle passat = new Passat(vehicleId, length, weight, colourPalette, modelType, driveType, engine, gearBox);

        /**
         private UUID vehicleId;
         private double length;
         private double weight;
         private ColourPalette colourPalette;
         private ModelType modelType;
         private DriveType driveType;
         private GearBox gearBox;

                 private GearBoxType gearBoxType;
                 private int numberOfGears;

         private Engine engine;

                 private UUID engineId;
                 private Integer tork;
                 private Integer horsePower;
                 private Integer volume;

                 private EngineType engineType;

         private OptionList optionList;

                 private Map<Integer, String> colourMap;
                 private Map<Integer, String> modelMap;
                 private Map<Integer, String> driveMap;
                 private Map<Integer, String> gearBoxMap;
                 private List<Engine> engineList;
         */

        List<Duration> durationList = new ArrayList<>();
        addDuration(durationList, colourPalette.name(), colourPalette.getDuration());
        addDuration(durationList, modelType.name(), modelType.getDuration());
        addDuration(durationList, driveType.name(), driveType.getDuration());
        addDuration(durationList, engine.getClass().getName(), engine.getTotalDuration());
        addDuration(durationList, gearBox.getClass().getName(), gearBox.getTotalDuration());

        double totalDuration = calculateDuration(durationList);
        passat.setTotalDuration(totalDuration);

        List<BigDecimal> priceList = Arrays.asList(colourPalette.getPrice(), modelType.getPrice(), driveType.getPrice(),
                engine.getPrice(), gearBox.getPrice());

        BigDecimal totalPrice = PriceConstants.basePassatPrice
                .add(calculatePrice(priceList))
                .add(BigDecimal.valueOf(totalDuration).multiply(PriceConstants.dailyLaborFee));

        passat.setPrice(totalPrice);
        return passat;
    }

    private boolean addDuration(List<Duration> durationList, String name, double duration) {
        return durationList.add(new Duration(name, duration));
    }

    private double calculateDuration(List<Duration> durationList){
        int durationSummary = 0;
        for (Duration duration : durationList) {
            durationSummary += duration.getValue();
        }
        return durationSummary;
    }

    private BigDecimal calculatePrice(List<BigDecimal> priceList){
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (BigDecimal price : priceList) {
            totalPrice = totalPrice.add(price);
        }
        return totalPrice;
    }
}
