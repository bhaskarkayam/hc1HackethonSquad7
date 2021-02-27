package com.squad7.paymentprocessor.service;

import com.squad7.paymentprocessor.SanctionsCheckProxy;
import com.squad7.paymentprocessor.model.PaymentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProcessPaymentService {

    @Autowired
    SanctionsCheckProxy sanctionsCheckProxy;

    public ResponseEntity processPayment(PaymentInfo paymentInfo) {

        boolean isCompliance = sanctionsCheckProxy.checkForComplicanceAgainstCountryCode(paymentInfo.getCreditorAddress().getCountry());
        return null;
    }
}
