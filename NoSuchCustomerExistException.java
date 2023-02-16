package com.customer.Exception;

public class NoSuchCustomerExistException extends RuntimeException{

    private String message;

    public NoSuchCustomerExistException(){}

    public NoSuchCustomerExistException(String msg){
        super(msg);
        this.message=msg;
    }

}
