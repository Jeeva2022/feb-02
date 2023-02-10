package com.mockito.PracticeMockito;

public class PersonNotFoundException extends Exception {

    private String message;

    public PersonNotFoundException(){}

    public PersonNotFoundException(String msg){
        super(msg);
        this.message=msg;
    }


}
