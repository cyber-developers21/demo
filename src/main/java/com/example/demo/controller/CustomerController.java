package com.example.demo.controller;

import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.sale.Customer;
import com.example.demo.domain.model.sale.CustomerList;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.NotNullableValueException;
import com.example.demo.sale.CustomerService;
import io.swagger.annotations.*;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
@Api(tags = {"Customer "})
@SwaggerDefinition(tags = {
        @Tag(name = "Customer", description = "Customer Services")
})
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @ApiOperation(value = "Register new customer")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 422, message = "Unprocessable entity")
    })
    @PostMapping("register-new-customer")
    public ResponseEntity<?> registerNewCustomer(@RequestBody Customer customer) {
        try {
            return ResponseEntity.ok(customerService.registerCustomer(customer));
        }catch (NotNullableValueException ex){
            return ResponseEntity.ok(ex.getMessage());
        }
    }

    @GetMapping("find-by-id/{customerId}")
    public Customer registerNewCustomer(@PathVariable("customerId") String customerId) throws CustomerNotFoundException {
        return customerService.findCustomerById(customerId);
    }


    @GetMapping("all-customers")
    public CustomerList registerNewCustomer() {
        return customerService.findAllRegisteredCustomer();
    }
}
