package com.codegym.projectmodule4backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApartmentExceptionController {
    @ExceptionHandler(value = ApartmentNotFoundException.class)
    public ResponseEntity<Object> exception(ApartmentNotFoundException exception){
        return new ResponseEntity<>("Apartment", HttpStatus.NOT_FOUND);
    }
}
