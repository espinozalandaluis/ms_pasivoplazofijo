package com.bootcamp.java.pasivoplazofijo.service.transaction;

import com.bootcamp.java.pasivoplazofijo.dto.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TransactionService {

    //public Mono<TransactionDTO> registerTrx(TransactionDTO transactionDTO);

    public Mono<TransactionDTO> register(TransactionRequestDTO transactionRequestDTO);

    public Mono<TransactionDTO> registerTrxEntradaExterna(TransactionDTO transactionDTO,
                                                   String IdProductClient);

    public Flux<ProductClientReportDTO> findByDocumentNumber(String documentNumber);

    public Flux<TransactionDTO> findAll();

}
