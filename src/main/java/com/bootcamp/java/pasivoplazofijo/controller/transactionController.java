package com.bootcamp.java.pasivoplazofijo.controller;

import com.bootcamp.java.pasivoplazofijo.dto.*;
import com.bootcamp.java.pasivoplazofijo.service.transaction.TransactionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/pasivoplazofijo/transaction")
public class transactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping()
    public Mono<ResponseEntity<Flux<TransactionDTO>>> getAllTrx(){
        log.info("getAll TransactionDTO executed");
        return Mono.just(ResponseEntity.ok()
                .body(transactionService.findAll()));
    }

    @GetMapping("/{documentNumber}")
    public Mono<ResponseEntity<Flux<ProductClientReportDTO>>> getByDocumentNumber(@PathVariable String documentNumber) {
        log.info("getByDocumentNumber executed {}", documentNumber);
        return Mono.just(ResponseEntity.ok()
                .body(transactionService.findByDocumentNumber(documentNumber)));
    }

    @PostMapping
    public Mono<ResponseEntity<TransactionDTO>> createTrx(@Valid @RequestBody TransactionRequestDTO transactionRequestDTO) {
        log.info("create transactionRequestDTO executed {}", transactionRequestDTO);
        return transactionService.register(transactionRequestDTO)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.badRequest().build());
    }





}
