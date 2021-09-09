package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INSUFFICIENT_STORAGE)
public class InsufficentFundException extends Exception{
    public InsufficentFundException(String message){
        super(message);
    }
}
