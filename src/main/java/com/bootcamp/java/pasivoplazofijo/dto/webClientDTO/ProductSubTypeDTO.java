package com.bootcamp.java.pasivoplazofijo.dto.webClientDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductSubTypeDTO {
    private String id;
    private Integer idProductSubType;
    private Integer idProductType;
    private String description;
    private Double maintenanceCost;
    private Integer movementLimit;
    private Integer credits;
}
