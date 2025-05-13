package com.scaler.productservice.ControllerAdvices;


import com.scaler.productservice.Exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public void handleArrayIndexOutOfBoundsException() {

    }

    @ExceptionHandler(Exception.class)
    public void handleException() {

    }
}
