package com.example.demo.sale;

import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.sale.Customer;
import com.example.demo.domain.model.sale.PaymentInfo;
import com.example.demo.exception.InsufficentFundException;
import com.example.demo.util.CollectionHelper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

import static com.example.demo.constants.StaticConstants.CUSTOMER_LIST;
import static com.example.demo.constants.StaticConstants.VEHICLE_MAP;

@Service
public class VehicleService {

    private final CustomerService customerService;

    public VehicleService(CustomerService customerService) {
        this.customerService = customerService;
    }


    public Vehicle isVehicleProducted(String uuid){
        if (CollectionHelper.isMapPresent(VEHICLE_MAP)){
            for (Vehicle vehicle : VEHICLE_MAP.keySet()){
                if (vehicle.getVehicleId().toString().equals(uuid)){
                    return vehicle;
                }
            }
        }
        return null;
    }
}
