package com.mockito.PracticeMockito;

public class PersonAlreadyExistsExcep extends RuntimeException{

private String message;

public PersonAlreadyExistsExcep(){}

    public PersonAlreadyExistsExcep(String msg){
    super(msg);
    this.message=msg;
    }

}
