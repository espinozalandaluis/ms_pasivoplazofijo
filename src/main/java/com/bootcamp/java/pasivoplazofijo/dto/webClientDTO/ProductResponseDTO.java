package com.bootcamp.java.pasivoplazofijo.dto.webClientDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponseDTO {
    private String id;
    private Integer idProduct;
    private String description;
    private ProductTypeDTO productTypeDTO;
    private ProductSubTypeDTO productSubTypeDTO;
    private Double transactionFee;
}
