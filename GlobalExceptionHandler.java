package com.customer.Exception;

import com.customer.Entity.ErrorObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.security.Timestamp;

import static java.lang.System.currentTimeMillis;

@RestControllerAdvice
public class GlobalExceptionHandler {



    CustomerAlreadyExistException customerAlreadyExistException;

    @ExceptionHandler(CustomerAlreadyExistException.class)
    public ResponseEntity<ErrorObject> hanleCustomerAreadyExistsException(CustomerAlreadyExistException cae){
        ErrorObject errorObject = new ErrorObject(cae.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(errorObject, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchCustomerExistException.class)
    public ResponseEntity<ErrorObject> handleNoSuchCustomerException(NoSuchCustomerExistException nsce){
        ErrorObject errorObject = new ErrorObject(nsce.getMessage(),System.currentTimeMillis());
        return new ResponseEntity<>(errorObject,HttpStatus.BAD_REQUEST);
    }



}
