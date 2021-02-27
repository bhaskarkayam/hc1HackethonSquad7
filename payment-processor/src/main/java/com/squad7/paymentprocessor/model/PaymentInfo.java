package com.squad7.paymentprocessor.model;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentInfo {

    @NonNull
    private long messageId;

    @NotNull
    private UUID uuid;

    @NotNull
    @Size(min = 2, max = 35)
    @Pattern(regexp = "^[a-zA-Z0-9]")
    private long debitorAccount;

    @NotNull
    private String debitorName;

    @NotNull
    private Address debitorAddress;

    @NotNull
    @Size(min = 9, max = 35)
    @Pattern(regexp = "^[a-zA-Z0-9]")
    private long creditorAccount;

    @NotNull
    private Address creditorAddress;

    @NotNull
    private Date valueDate;

    @NotNull
    private String debitorAgentIdentifier;

    @NotNull
    private String creditorAgentIdentifier;

    @NotNull
    private String paymentCurrency;

    @NotNull
    @Pattern(regexp = "^\\d+\\.\\d{0,2}$")
    private double amout;

    @NotNull
    private String remittanceInfo;
}
