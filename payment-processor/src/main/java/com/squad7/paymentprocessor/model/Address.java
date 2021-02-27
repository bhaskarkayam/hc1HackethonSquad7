package com.squad7.paymentprocessor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private String address;
    private String city;
    private String state;
    private String country;
    private String zipCode;
}
