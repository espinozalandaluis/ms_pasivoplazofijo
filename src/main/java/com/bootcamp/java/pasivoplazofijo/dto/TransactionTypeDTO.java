package com.bootcamp.java.pasivoplazofijo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionTypeDTO {
    private String id;
    private Integer idTransactionType;
    private String description;
}
