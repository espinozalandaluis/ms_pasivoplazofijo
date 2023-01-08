package com.bootcamp.java.pasivoplazofijo.service.webClients.Clients;

import com.bootcamp.java.pasivoplazofijo.common.Constantes;
import com.bootcamp.java.pasivoplazofijo.dto.webClientDTO.ClientResponseDTO;
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
public class WcClientsServiceImpl implements WcClientsService {

    @Autowired
    Constantes constantes;
    private final WebClient wcClients = WebClient.builder()
            .baseUrl(constantes.webClientUriMSCliente)
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    @Override
    public Flux<ClientResponseDTO> findAll() {
        return wcClients.get()
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToFlux(ClientResponseDTO.class)
                .timeout(Duration.ofMillis(10_000));
    }

    @Override
    public Mono<ClientResponseDTO> findById(Integer IdClient) {
        return wcClients.get()
                .uri("/{IdClient}" ,IdClient)
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToMono(ClientResponseDTO.class)
                .timeout(Duration.ofMillis(10_000));
    }

    @Override
    public Mono<ClientResponseDTO> findByDocumentNumber(String documentNumber) {
        return wcClients.get()
                .uri("/{documentNumber}" ,documentNumber)
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToMono(ClientResponseDTO.class)
                .timeout(Duration.ofMillis(10_000));
    }

}
