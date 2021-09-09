package com.example.demo.service;

import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.sale.Customer;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.InsufficentFundException;
import com.example.demo.exception.NotNullableValueException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.sale.CustomerService;
import com.example.demo.sale.VehicleService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;


@Service
public class ValidateService {

    private final CustomerService customerService;
    private final VehicleService vehicleService;

    public ValidateService(CustomerService customerService, VehicleService vehicleService) {
        this.customerService = customerService;
        this.vehicleService = vehicleService;
    }

    public Customer validateCustomerId(String customerId) throws CustomerNotFoundException, NotNullableValueException {
        if (customerId == null) {
            throw new NotNullableValueException("CustomerId can not be null");

        }
        Customer customer = customerService.findCustomerById(customerId);
        if (customer == null) {
            throw new CustomerNotFoundException("Customer is not exist with that id, Please create a new one");
        }
        return customer;
    }

    public Vehicle validateVehicleId(String vehicleId) throws NotNullableValueException, RecordNotFoundException {
        if (vehicleId == null) {
            throw new NotNullableValueException("Vehicle can not be null");
        }

        Vehicle vehicle = vehicleService.isVehicleProducted(vehicleId);
        if (vehicle == null) {
            throw new RecordNotFoundException("Vehicle is not producted with that uuid before you buy, plaase demand for creation");
        }
        return vehicle;
    }

    public void comparePrice(BigDecimal requestedPrice, BigDecimal actualPrice) throws InsufficentFundException {
        if (actualPrice.compareTo(requestedPrice) > 0) {
            throw new InsufficentFundException("Insufficient Funds");
        }
    }
}
