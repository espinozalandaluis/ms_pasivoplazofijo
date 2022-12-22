package com.bootcamp.java.pasivoplazofijo.service.webClients.activoCreditoPersonal;

import com.bootcamp.java.pasivoplazofijo.dto.ProductClientDTO;
import com.bootcamp.java.pasivoplazofijo.dto.TransactionDTO;
import reactor.core.publisher.Mono;

public interface WcActivoCreditoPersonalService {

    public Mono<ProductClientDTO> findByAccountNumber(String AccountNumber);

    public Mono<TransactionDTO> registerTrxEntradaExterna(TransactionDTO transactionDTO, String IdProductClient);


}
