package com.example.demo.service.impl;

import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.Duration;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.car.Passat;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import com.example.demo.domain.model.sale.Customer;
import com.example.demo.domain.model.sale.PaymentInfo;
import com.example.demo.service.CalculationService;
import com.example.demo.service.ProductionService;
import com.example.demo.util.PriceConstants;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

import static com.example.demo.constants.StaticConstants.VEHICLE_MAP;
import static com.example.demo.util.VehicleSizeConstants.PASSAT_FIX_HEIGHT;
import static com.example.demo.util.VehicleSizeConstants.PASSAT_FIX_LENGTH;
import static com.example.demo.util.VehicleSizeConstants.PASSAT_FIX_WIDTH;

@Service
public class PassatProductionServiceImpl implements ProductionService {

    private final CalculationService calculationService;

    public PassatProductionServiceImpl(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @Override
    public Vehicle releaseNewCar(ColourPalette colourPalette, ModelType modelType, DriveType driveType,
                                 Engine engine, GearBox gearBox) {

        Vehicle passat = new Passat(PASSAT_FIX_LENGTH, PASSAT_FIX_WIDTH, PASSAT_FIX_HEIGHT, colourPalette, modelType,
                driveType, engine, gearBox);

        List<Duration> durationList = new ArrayList<>();
        addDuration(durationList, colourPalette.name(), colourPalette.getDuration());
        addDuration(durationList, modelType.name(), modelType.getDuration());
        addDuration(durationList, driveType.name(), driveType.getDuration());
        addDuration(durationList, engine.getClass().getName(), engine.getTotalDuration());
        addDuration(durationList, gearBox.getClass().getName(), gearBox.getTotalDuration());

        double totalDuration = calculationService.calculateDuration(durationList);
        passat.setTotalDuration(totalDuration);

        List<BigDecimal> priceList = Arrays.asList(colourPalette.getPrice(), modelType.getPrice(), driveType.getPrice(),
                engine.getEngineType().getPrice(), gearBox.getGearBoxType().getPrice());

        BigDecimal totalPrice = PriceConstants.basePassatPrice
                .add(calculationService.calculatePrice(priceList))
                .add(BigDecimal.valueOf(totalDuration).multiply(PriceConstants.dailyLaborFee));

        passat.setPrice(totalPrice);
        passat.setVehicleId(UUID.randomUUID());
        passat.setCarModel("Passat");
        VEHICLE_MAP.put(passat, 1);
        return passat;
    }

    private void addDuration(List<Duration> durationList, String name, double duration) {
        durationList.add(new Duration(name, duration));
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
