package com.example.demo.domain.model.sale;

import com.example.demo.domain.model.Vehicle;

import java.math.BigDecimal;

public class PaymentInfo {
    private BigDecimal price;
    private String carModel;
    private String customerId;
    private Vehicle vehicle;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
