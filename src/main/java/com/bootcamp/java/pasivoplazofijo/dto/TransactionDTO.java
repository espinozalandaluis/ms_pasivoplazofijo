package com.bootcamp.java.pasivoplazofijo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private String id;
    private String idProductClient;
    private Integer idTransactionType;
    private Double mont;
    private Date registrationDate;
    private Double transactionFee;
    private String destinationAccountNumber;
    private String sourceAccountNumber;
    private Integer ownAccountNumber;
    private Integer destinationIdProduct;
}
