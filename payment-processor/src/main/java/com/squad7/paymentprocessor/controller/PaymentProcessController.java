package com.squad7.paymentprocessor.controller;

import com.squad7.paymentprocessor.model.PaymentInfo;
import com.squad7.paymentprocessor.service.ProcessPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PaymentProcessController {

    @Autowired
    ProcessPaymentService paymentService;

    @PostMapping("/processPayment")
    public ResponseEntity processPayment(@Valid @RequestBody PaymentInfo paymentInfo){

        return  paymentService.processPayment(paymentInfo);

    }

}
