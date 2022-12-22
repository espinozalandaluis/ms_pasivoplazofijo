package com.bootcamp.java.pasivoplazofijo.service.webClients.Products;

import com.bootcamp.java.pasivoplazofijo.common.Constantes;
import com.bootcamp.java.pasivoplazofijo.dto.webClientDTO.ProductResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
public class WcProductsServiceImpl implements WcProductsService {

    private final WebClient wcProducts = WebClient.builder()
            .baseUrl(Constantes.WebClientUriMSProducto)
            .defaultCookie("cookieKey", "cookieValue")
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();

    @Override
    public Flux<ProductResponseDTO> findAll() {
        return wcProducts.get()
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToFlux(ProductResponseDTO.class)
                .timeout(Duration.ofMillis(10_000));
    }

    @Override
    public Mono<ProductResponseDTO> findById(Integer IdProduct) {
        return wcProducts.get()
                .uri("/{IdProduct}" ,IdProduct)
                .retrieve()
                .onStatus(httpStatus -> HttpStatus.NO_CONTENT.equals(httpStatus),
                        response -> response.bodyToMono(String.class)
                                .map(Exception::new))
                .bodyToMono(ProductResponseDTO.class)
                .timeout(Duration.ofMillis(10_000));
    }
}
