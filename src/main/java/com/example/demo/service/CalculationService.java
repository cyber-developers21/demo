package com.example.demo.service;

import com.example.demo.domain.model.Duration;

import java.math.BigDecimal;
import java.util.List;

public interface CalculationService {
    BigDecimal calculatePrice(List<BigDecimal> elementPriceList);

    double calculateDuration(List<Duration> durationList);
}
