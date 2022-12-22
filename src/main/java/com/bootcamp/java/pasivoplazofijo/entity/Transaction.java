package com.bootcamp.java.pasivoplazofijo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "tbl_transaction")
public class Transaction {
    @Id
    private String id;

    @NotNull
    private String idProductClient;

    @NotNull
    private Integer idTransactionType;

    @NotNull
    private Double mont;

    @NotNull
    private Date registrationDate;

    @NotNull
    private String destinationAccountNumber;

    @NotNull
    private String sourceAccountNumber;

    @NotNull
    private Integer ownAccountNumber;

    @NotNull
    private Double transactionFee;

    @NotNull
    private Integer destinationIdProduct;

}
