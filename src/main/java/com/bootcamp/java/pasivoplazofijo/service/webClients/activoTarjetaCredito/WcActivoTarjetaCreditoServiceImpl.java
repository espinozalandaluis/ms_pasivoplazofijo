package com.bootcamp.java.pasivoplazofijo.service.webClients.activoTarjetaCredito;

import com.bootcamp.java.pasivoplazofijo.common.Constantes;
import com.bootcamp.java.pasivoplazofijo.dto.ProductClientDTO;
import com.bootcamp.java.pasivoplazofijo.dto.TransactionDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class WcActivoTarjetaCreditoServiceImpl implements  WcActivoTarjetaCreditoService{

    @Autowired
    Constantes constantes;
    private final WebClient wcActivoTarjetaCreditoDocumentNumber = WebClient.builder()
            .baseUrl(constantes.webClientUriMSActivoTarjetaCreditoDocumentNumber)
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    private final WebClient wcActivoTarjetaCredito = WebClient.builder()
            .baseUrl(constantes.webClientUriMSActivoTarjetaCredito)
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    private final WebClient wcActivoTarjetaCreditoTrx = WebClient.builder()
            .baseUrl(constantes.webClientUriMSActivoTarjetaCreditoTrx)
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    @Override
    public Mono<ProductClientDTO> findByAccountNumber(String accountNumber) {

        return wcActivoTarjetaCredito.get()
                .uri("/{accountNumber}" ,accountNumber)
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToMono(ProductClientDTO.class)
                .timeout(Duration.ofMillis(constantes.TimeOutWebClients));
    }

    @Override
    public Mono<TransactionDTO> registerTrxEntradaExterna(TransactionDTO transactionDTO,
                                                          String IdProductClient) {
        return wcActivoTarjetaCreditoTrx.post()
                .uri("/{IdProductClient}" ,IdProductClient)
                .body(Mono.just(transactionDTO), TransactionDTO.class)
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToMono(TransactionDTO.class)
                .timeout(Duration.ofMillis(constantes.TimeOutWebClients));
    }

    @Override
    public Flux<ProductClientDTO> findByDocumentNumber(String DocumentNumber) {
        return wcActivoTarjetaCreditoDocumentNumber.get()
                .uri("/{DocumentNumber}" ,DocumentNumber)
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToFlux(ProductClientDTO.class)
                .timeout(Duration.ofMillis(constantes.TimeOutWebClients));
    }
}
