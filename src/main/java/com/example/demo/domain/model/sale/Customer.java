package com.example.demo.domain.model.sale;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.UUID;

public class Customer {
    private String customerName;
    private String email;
    @JsonIgnoreProperties
    private UUID customerId;


    public Customer(String customerName, String email) {
        this.customerName = customerName;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }
}
