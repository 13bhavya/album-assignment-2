package com.albumassignment2.exception;

import com.albumassignment2.validName.ValidNameValidator;
import org.apache.logging.log4j.message.Message;
import org.hibernate.validator.constraints.Length;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<String > customException(CustomException ce){
        return new ResponseEntity<>(ce.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> noSuchElement() {
        return  new ResponseEntity<>("No Such Element found", HttpStatus.CONFLICT);
    }

}
