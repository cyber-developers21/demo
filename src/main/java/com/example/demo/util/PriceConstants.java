package com.example.demo.util;

import java.math.BigDecimal;

public class PriceConstants {
    private PriceConstants() {
        throw new IllegalStateException("Utility class");
    }

    public static final BigDecimal dailyLaborFee = BigDecimal.valueOf(20);

    public static final BigDecimal basePassatPrice = BigDecimal.valueOf(897.5);
    public static final BigDecimal baseGolfPrice = BigDecimal.valueOf(897.5);
    public static final BigDecimal baseTrocPrice = BigDecimal.valueOf(897.5);
}
