package com.library.managment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class LibraryManagmentExceptionHandler {

    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<LibraryManagmentException> handleItemNotFoundException(ItemNotFoundException ex) {

        LibraryManagmentException deodarVillageException= new LibraryManagmentException(ex.getMessage(),ex.getCause(), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(deodarVillageException,HttpStatus.NOT_FOUND);
    }

}
