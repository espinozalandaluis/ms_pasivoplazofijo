package com.bootcamp.java.pasivoplazofijo.dto.webClientDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO {
    private String id;
    private Integer idClient;
    private String documentNumber;
    private String fullName;
    private ClientTypeDTO clientTypeDTO;
    private ClientDocumentTypeDTO clientDocumentTypeDTO;
}