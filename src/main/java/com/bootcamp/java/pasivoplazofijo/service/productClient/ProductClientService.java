package com.bootcamp.java.pasivoplazofijo.service.productClient;

import com.bootcamp.java.pasivoplazofijo.dto.ProductClientDTO;
import com.bootcamp.java.pasivoplazofijo.dto.ProductClientRequest;
import com.bootcamp.java.pasivoplazofijo.dto.ProductClientTransactionDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductClientService {

    public Flux<ProductClientDTO> findAll();

    public Flux<ProductClientDTO> findByDocumentNumber(String DocumentNumber);

    public Mono<ProductClientDTO> findByAccountNumber(String AccountNumber);

    public Mono<ProductClientTransactionDTO> create(ProductClientRequest productClientRequest);

}
