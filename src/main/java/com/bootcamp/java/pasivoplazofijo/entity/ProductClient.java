package com.bootcamp.java.pasivoplazofijo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"accountNumber"})
@Document(value = "tbl_ProductClient")
public class ProductClient {

    @Id
    private String id;

    @NotNull
    private Integer idProduct;

    @NotNull
    private String productDescription;

    @NotNull
    private Integer idProductType;

    @NotNull
    private String productTypeDescription;

    @NotNull
    private Integer idProductSubType;

    @NotNull
    private String productSubTypeDescription;

    @NotNull
    private Integer idClient;

    @NotNull
    private Integer idClientType;

    @NotNull
    private String clientTypeDescription;

    @NotNull
    private Integer idClientDocumentType;

    @NotNull
    private String clientDocumentTypeDescription;

    @NotNull
    private String documentNumber;

    @NotNull
    private String fullName;

    @NotNull
    private String authorizedSigners;

    @NotNull
    private Double creditLimit;

    @NotNull
    private Double balance;

    @NotNull
    private Double debt;

    @NotNull
    private Double maintenanceCost;

    @NotNull
    private Integer movementLimit;

    @NotNull
    private Integer credits;

    @NotNull
    @Indexed(unique = true)
    private String accountNumber;

    @NotNull
    private Double transactionFee;

    @NotNull
    private String creditCardNumber;

}
