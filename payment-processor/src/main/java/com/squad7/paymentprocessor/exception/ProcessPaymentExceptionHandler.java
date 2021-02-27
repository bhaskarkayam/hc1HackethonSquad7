package com.squad7.paymentprocessor.exception;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.sql.rowset.WebRowSet;
import java.util.Date;

@ControllerAdvice
public class ProcessPaymentExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity handleAllExceptions(Exception ex, WebRequest request){
        ExceptionResponse exceptionResponse =
                new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exceptionResponse);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException argumentNotValidEx, HttpHeaders headers, HttpStatus status, WebRequest request){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), argumentNotValidEx.getMessage(), "Validation Failed");
        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

}
