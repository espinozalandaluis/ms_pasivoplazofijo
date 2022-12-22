package com.bootcamp.java.pasivoplazofijo.dto.webClientDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDocumentTypeDTO {

    private String id;
    private int idClientDocumentType;
    private String description;
}
