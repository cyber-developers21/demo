package com.example.demo.sale;

import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.sale.Customer;
import com.example.demo.domain.model.sale.PaymentInfo;
import com.example.demo.domain.model.sale.PaymentInfoList;
import com.example.demo.domain.model.sale.PaymentInfoRequest;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.InsufficentFundException;
import com.example.demo.exception.NotNullableValueException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.service.ValidateService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.example.demo.constants.StaticConstants.PAYMENT_MAP;

@Service
public class PaymentService {

    private final CustomerService customerService;
    private final VehicleService vehicleService;
    private final ValidateService validateService;


    public PaymentService(CustomerService customerService,
                          VehicleService vehicleService,
                          ValidateService validateService) {
        this.customerService = customerService;
        this.vehicleService = vehicleService;
        this.validateService = validateService;
    }

    public PaymentInfo payForVehicle(String customerId, BigDecimal price, String vehicleId)
            throws InsufficentFundException, CustomerNotFoundException, RecordNotFoundException, NotNullableValueException {


        Customer customer = validateService.validateCustomerId(customerId);
        Vehicle vehicle = validateService.validateVehicleId(vehicleId);

        validateService.comparePrice(price, vehicle.getPrice());

        PaymentInfo paymentInfo = new PaymentInfo();
        paymentInfo.setPrice(price);
        paymentInfo.setCarModel(vehicle.getCarModel());
        paymentInfo.setCustomerId(customer.getCustomerId().toString());
        paymentInfo.setVehicle(vehicle);

        PAYMENT_MAP.put(vehicleId, paymentInfo);

        return paymentInfo;
    }

    public PaymentInfoList findPaymentDetailsByVehicleOrCustomerId(PaymentInfoRequest paymentInfoRequest) throws NotNullableValueException {
        List<PaymentInfo> paymentInfoList = new ArrayList<>();
        if (paymentInfoRequest.getCustomerId() == null) {
            throw new NotNullableValueException("customerId can not be null");
        }

        if (paymentInfoRequest.getVehicleId() != null) {
            PaymentInfo paymentInfo = PAYMENT_MAP.get(paymentInfoRequest.getVehicleId());
            paymentInfoList.add(paymentInfo);
        } else {
            for (PaymentInfo paymentInfo : PAYMENT_MAP.values()) {
                if (paymentInfo.getCustomerId().equals(paymentInfoRequest.getCustomerId())) {
                    paymentInfoList.add(paymentInfo);
                }
            }
        }
        return new PaymentInfoList(paymentInfoList);
    }
}
