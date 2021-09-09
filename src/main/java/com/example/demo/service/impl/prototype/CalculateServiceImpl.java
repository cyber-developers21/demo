package com.example.demo.service.impl.prototype;

import com.example.demo.domain.model.Duration;
import com.example.demo.service.CalculationService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CalculateServiceImpl implements CalculationService {
    @Override
    public BigDecimal calculatePrice(List<BigDecimal> elementPriceList) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (BigDecimal price : elementPriceList) {
            totalPrice = totalPrice.add(price);
        }
        return totalPrice;
    }

    @Override
    public double calculateDuration(List<Duration> durationList) {
        int durationSummary = 0;
        for (Duration duration : durationList) {
            durationSummary += duration.getValue();
        }
        return durationSummary;
    }
}
