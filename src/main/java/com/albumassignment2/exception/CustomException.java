package com.albumassignment2.exception;

import com.albumassignment2.Resource.UserResource;
import org.springframework.web.bind.annotation.ControllerAdvice;

public class CustomException extends Exception {
    @Override
    public String getMessage() {
        return "String violation error";
    }
}
