package com.bootcamp.java.pasivoplazofijo.service.webClients.pasivoCuentaCorriente;

import com.bootcamp.java.pasivoplazofijo.dto.ProductClientDTO;
import com.bootcamp.java.pasivoplazofijo.dto.TransactionDTO;
import reactor.core.publisher.Mono;

public interface WcPasivoCuentaCorrienteService {

    public Mono<ProductClientDTO> findByAccountNumber(String AccountNumber);

    public Mono<TransactionDTO> registerTrxEntradaExterna(TransactionDTO transactionDTO,String IdProductClient);

}
