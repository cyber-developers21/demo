package com.example.demo.domain.model.sale;

import com.example.demo.domain.model.Vehicle;

import java.math.BigDecimal;

public class PaymentInfoRequest {
    private BigDecimal price;
    private String carModel;
    private String customerId;
    private String vehicleId;

    public PaymentInfoRequest(){

    }

    public PaymentInfoRequest(String customerId, String vehicleId) {
        this.customerId = customerId;
        this.vehicleId = vehicleId;
    }

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

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
}
