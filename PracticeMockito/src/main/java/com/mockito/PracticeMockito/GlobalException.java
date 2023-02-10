package com.mockito.PracticeMockito;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = PersonAlreadyExistsExcep.class)
    public ResponseEntity<Entity> personAlreadyExistsExcep(PersonAlreadyExistsExcep e){

        String response = e.getMessage();

        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value = PersonNotFoundException.class)
    public ResponseEntity<Entity> handlePersonNotFoundExcep(PersonNotFoundException pe){
        String response = pe.getMessage();

        return  new ResponseEntity(response,HttpStatus.BAD_REQUEST);
    }

}
