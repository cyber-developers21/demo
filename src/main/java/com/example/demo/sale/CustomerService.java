package com.example.demo.sale;

import com.example.demo.domain.model.sale.Customer;
import com.example.demo.domain.model.sale.CustomerList;
import com.example.demo.exception.CustomerNotFoundException;
import com.example.demo.exception.NotNullableValueException;
import com.example.demo.util.CollectionHelper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

import static com.example.demo.constants.StaticConstants.CUSTOMER_LIST;

@Service
public class CustomerService {

    public Customer registerCustomer(Customer customer) throws NotNullableValueException {
        if (customer.getCustomerName() == null){
            throw new NotNullableValueException("Customer name field can not be null");
        }
        if (customer.getEmail() == null){
            throw new NotNullableValueException("Customer email field can not be null");
        }

        customer.setCustomerId(UUID.randomUUID());

        CUSTOMER_LIST.add(customer);
        return customer;
    }

    public Customer findCustomerById(String uuid) throws CustomerNotFoundException {
        if (CollectionHelper.isListPresent(CUSTOMER_LIST)){
            for (Customer customer : CUSTOMER_LIST){
                if (customer.getCustomerId().toString().equals(uuid)){
                    return customer;
                }
            }
        }
        throw new CustomerNotFoundException("Customer is not exist with that id, Please create a new one");
    }

    public CustomerList findAllRegisteredCustomer(){
        if (CollectionHelper.isListPresent(CUSTOMER_LIST)){
            return new CustomerList(CUSTOMER_LIST);
        }else {
            return new CustomerList(new ArrayList<>());
        }
    }
}
