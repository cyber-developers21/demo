package com.example.demo.controller;

import com.example.demo.domain.model.sale.*;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.InsufficentFundException;
import com.example.demo.exception.NotNullableValueException;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.sale.CustomerService;
import com.example.demo.sale.PaymentService;
import io.swagger.annotations.*;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
@Api(tags = {"Payment Controller "})
@SwaggerDefinition(tags = {
        @Tag(name = "Payment", description = "Payment Services")
})
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @ApiOperation(value = "Payment endpoint")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 422, message = "Unprocessable entity")
    })
    @PostMapping("pay-for-vehicle")
    public PaymentInfo payForVehicle(@RequestBody PaymentInfoRequest paymentInfoRequest)
            throws InsufficentFundException, RecordNotFoundException, CustomerNotFoundException, NotNullableValueException {
        return paymentService.payForVehicle(paymentInfoRequest.getCustomerId(), paymentInfoRequest.getPrice(), paymentInfoRequest.getVehicleId());
    }

    @GetMapping("get-payment-detail/{customerId}")
    public PaymentInfoList payForVehicle(@PathVariable("customerId") String customerId, @RequestParam(required = false) String vehicleId)
            throws NotNullableValueException {

        PaymentInfoRequest paymentInfoRequest = new PaymentInfoRequest(customerId, vehicleId);
        return paymentService.findPaymentDetailsByVehicleOrCustomerId(paymentInfoRequest);
    }
}
