package com.example.demo.domain.model.sale;

import java.util.List;
import java.util.UUID;

public class CustomerList {
    private List<Customer> customerList;

    public CustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
