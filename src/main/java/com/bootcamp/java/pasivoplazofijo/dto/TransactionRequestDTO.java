package com.bootcamp.java.pasivoplazofijo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDTO {
    @JsonIgnore
    private String id;

    private String idProductClient;
    private Integer idTransactionType;
    private Double mont;

    @JsonIgnore
    private Date registrationDate;

    @JsonIgnore
    private String sourceAccountNumber;

    @JsonIgnore
    private Integer OwnAccountNumber;

    private String destinationAccountNumber;
    private Integer destinationIdProduct;

    @JsonIgnore
    private Double transactionFee;
}
