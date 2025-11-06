package com.library.managment.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Data
public class LibraryManagmentException {

    private final String message;
    private  Throwable throwable;
    private final HttpStatus httpStatus;
    public LibraryManagmentException(String message, Throwable throwable,HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;

    }

    public LibraryManagmentException(String message,HttpStatus httpStatus) {
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
