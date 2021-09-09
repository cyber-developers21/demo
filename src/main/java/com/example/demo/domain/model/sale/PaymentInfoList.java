package com.example.demo.domain.model.sale;

import com.example.demo.domain.model.Vehicle;

import java.math.BigDecimal;
import java.util.List;

public class PaymentInfoList {
    private List<PaymentInfo> paymentInfoList;

    public PaymentInfoList(List<PaymentInfo> paymentInfoList) {
        this.paymentInfoList = paymentInfoList;
    }

    public List<PaymentInfo> getPaymentInfoList() {
        return paymentInfoList;
    }

    public void setPaymentInfoList(List<PaymentInfo> paymentInfoList) {
        this.paymentInfoList = paymentInfoList;
    }
}
