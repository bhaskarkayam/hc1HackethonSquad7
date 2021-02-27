package com.squad7.paymentprocessor.service;

import com.squad7.paymentprocessor.PaymentProcessProxy;
import com.squad7.paymentprocessor.model.PaymentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProcessPaymentService {

    @Autowired
    PaymentProcessProxy paymentProcessProxy;

    public ResponseEntity processPayment(PaymentInfo paymentInfo) {

        boolean isCompliance = paymentProcessProxy.checkForComplicanceAgainstCountryCode(paymentInfo.getCreditorAddress().getCountry());
        return null;
    }
}
