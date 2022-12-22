package com.bootcamp.java.pasivoplazofijo.dto.webClientDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientTypeDTO {
    private String id;
    private Integer idClientType;
    private String description;
}
