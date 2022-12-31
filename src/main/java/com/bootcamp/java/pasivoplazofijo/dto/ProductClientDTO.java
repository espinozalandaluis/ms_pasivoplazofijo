package com.bootcamp.java.pasivoplazofijo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ProductClientDTO {
    private String id;
    private Integer idProduct;
    private String productDescription;
    private Integer idProductType;
    private String productTypeDescription;
    private Integer idProductSubType;
    private String productSubTypeDescription;
    private Integer idClient;
    private Integer idClientType;
    private String clientTypeDescription;
    private Integer idClientDocumentType;
    private String clientDocumentTypeDescription;
    private String documentNumber;
    private String fullName;
    private String authorizedSigners;
    private Double creditLimit;
    private Double balance;
    private Double debt;
    private Double maintenanceCost;
    private Integer movementLimit;
    private Integer credits;
    private String accountNumber;
    private Double transactionFee;
    private String creditCardNumber;
    private Integer billingDay;
    private Date billingDate;
    private Double invoiceDebt;
    private Double expiredDebt;
}
