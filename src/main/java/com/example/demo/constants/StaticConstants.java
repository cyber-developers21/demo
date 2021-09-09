package com.example.demo.constants;

import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.sale.Customer;
import com.example.demo.domain.model.sale.PaymentInfo;

import java.lang.reflect.Array;
import java.util.*;

public class StaticConstants {
    public static Map<Vehicle, Integer> VEHICLE_MAP = new HashMap<>();
    public static List<Customer> CUSTOMER_LIST = new ArrayList<>();
    public static Map<String, PaymentInfo> PAYMENT_MAP = new HashMap<>();
}
