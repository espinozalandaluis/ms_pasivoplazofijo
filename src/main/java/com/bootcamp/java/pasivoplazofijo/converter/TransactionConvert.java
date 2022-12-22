package com.bootcamp.java.pasivoplazofijo.converter;

import com.bootcamp.java.pasivoplazofijo.common.Constantes;
import com.bootcamp.java.pasivoplazofijo.common.Funciones;
import com.bootcamp.java.pasivoplazofijo.dto.TransactionDTO;
import com.bootcamp.java.pasivoplazofijo.dto.TransactionRequestDTO;
import com.bootcamp.java.pasivoplazofijo.entity.ProductClient;
import com.bootcamp.java.pasivoplazofijo.entity.Transaction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TransactionConvert {
    public static TransactionDTO EntityToDTO(Transaction transaction) {
        TransactionDTO trxDTO = TransactionDTO.builder()
                .id(transaction.getId())
                .idProductClient(transaction.getIdProductClient())
                .idTransactionType(transaction.getIdTransactionType())
                .mont(transaction.getMont())
                .registrationDate(transaction.getRegistrationDate())
                .destinationAccountNumber(transaction.getDestinationAccountNumber())
                .sourceAccountNumber(transaction.getSourceAccountNumber())
                .ownAccountNumber(transaction.getOwnAccountNumber())
                .transactionFee(transaction.getTransactionFee())
                .destinationIdProduct(transaction.getDestinationIdProduct())
                .build();

        log.info("TransactionDTO: {}", trxDTO);

        return trxDTO;
    }

    public static Transaction DTOtoEntity(TransactionDTO transactionDTO) {
        Transaction trx =  Transaction.builder()
                .idProductClient(transactionDTO.getIdProductClient())
                .idTransactionType(transactionDTO.getIdTransactionType())
                .mont(transactionDTO.getMont())
                .registrationDate(Funciones.GetCurrentDate())
                .destinationAccountNumber(transactionDTO.getDestinationAccountNumber())
                .sourceAccountNumber(transactionDTO.getSourceAccountNumber())
                .ownAccountNumber(transactionDTO.getOwnAccountNumber())
                .transactionFee(transactionDTO.getTransactionFee())
                .build();
        return trx;
    }

    public static Transaction DTOtoEntity(TransactionRequestDTO transactionRequestDTO) {
        Transaction trx =  Transaction.builder()
                .idProductClient(transactionRequestDTO.getIdProductClient())
                .idTransactionType(transactionRequestDTO.getIdTransactionType())
                .mont(transactionRequestDTO.getMont())
                .registrationDate(Funciones.GetCurrentDate())
                .destinationAccountNumber(transactionRequestDTO.getDestinationAccountNumber())
                .sourceAccountNumber(transactionRequestDTO.getSourceAccountNumber())
                .ownAccountNumber(transactionRequestDTO.getOwnAccountNumber())
                .transactionFee(transactionRequestDTO.getTransactionFee())
                .destinationIdProduct(transactionRequestDTO.getDestinationIdProduct())
                .build();
        return trx;
    }

    public static Transaction ProductClientEntityToTransactionEntity(ProductClient productClient) {
        return Transaction.builder()
                .idProductClient(productClient.getId())
                .idTransactionType(Constantes.TransactionTypeDeposito)
                .mont(productClient.getBalance())
                .registrationDate(Funciones.GetCurrentDate())
                .destinationAccountNumber(productClient.getAccountNumber())
                .sourceAccountNumber(productClient.getAccountNumber())
                .ownAccountNumber(Constantes.TransferenciasPropiaCuenta)
                .transactionFee(productClient.getTransactionFee())
                .build();
    }


}
