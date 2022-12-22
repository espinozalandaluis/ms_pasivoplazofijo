package com.bootcamp.java.pasivoplazofijo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Builder
@ToString
@EqualsAndHashCode(of = {"idTransactionType"})
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "tbl_transactionType")
public class TransactionType {
    @Id
    private String id;

    @NotNull
    @Indexed(unique = true)
    private Integer idTransactionType;

    @NotNull
    private String description;
}
