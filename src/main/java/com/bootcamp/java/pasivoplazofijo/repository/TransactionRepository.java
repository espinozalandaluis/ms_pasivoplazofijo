package com.bootcamp.java.pasivoplazofijo.repository;

import com.bootcamp.java.pasivoplazofijo.entity.Transaction;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction,String> {

    Mono<Transaction> findById(String IdTransaction);

    Flux<Transaction> findByIdProductClient(String IdProductClient);

    @Query("{ 'registrationDate' : { $gte: ?0}, 'idProductClient' : ?1 }")
    Flux<Transaction> findTrxPerMoth(Date FechaDesde, String IdProductClient);

}
