package com.bootcamp.java.pasivoplazofijo.common;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@AllArgsConstructor
@Component
public class Constantes {
    public static final Integer ClientTypePersonal = 1;
    public static final Integer ProductTypePasivo = 1;
    public static final Integer ProductSubTypePasivo = 3;

    public static final Integer TransactionTypeDeposito = 1;

    public static final Double MaintenanceCost = 0.0;

    public static final Integer TransferenciasPropiaCuenta = 1;

    public static final Integer TipoTrxDeposito = 1;
    public static final Integer TipoTrxRetiro = 2;
    public static final Integer TipoTrxConsumo = 4;
    public static final Integer TipoTrxTransferenciaSalida = 5;
    public static final Integer TipoTrxTransferenciaEntrada = 6;

    //public static final Integer ProductoPasivoAhorros = 1;
    //public static final Integer ProductoPasivoCuentaCorriente = 2;
    public static final Integer ProductoPasivoPlazoFijo = 3;
    public static final Integer ProductoActivoPersonal = 4;
    public static final Integer ProductoActivoEmpresarial = 5;
    public static final Integer ProductoActivoTarjetaCredito = 6;

    @Value("${container.name.gateway:localhost}")
    private static final String hostGateway = "ms-gateway";
    //public static final String hostGateway = "localhost";
    public static final long TimeOutWebClients = 10_000;


    public static String webClientUriMSCliente;

    @Value("${SERVER_GATEWAY:localhost}")
    public void setwebClientUriMSCliente(String SERVER_GATEWAY) {
        Constantes.webClientUriMSCliente = "http://" + SERVER_GATEWAY + ":8080/v1/client";
    }
    public static String webClientUriMSProducto = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSProducto(String SERVER_GATEWAY) {
        Constantes.webClientUriMSProducto = "http://" + SERVER_GATEWAY + ":8080/v1/product";
    }

    //Products Pasivo
    public static String webClientUriMSPasivoCuentaCorriente = "";
    public static String webClientUriMSPasivoCuentaCorrienteTrx = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSPasivoCuentaCorriente(String SERVER_GATEWAY) {
        Constantes.webClientUriMSPasivoCuentaCorriente = "http://" + SERVER_GATEWAY + ":8080/v1/pasivocuentacorriente/getByAccountNumber";
    }

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSPasivoCuentaCorrienteTrx(String SERVER_GATEWAY) {
        Constantes.webClientUriMSPasivoCuentaCorrienteTrx = "http://" + SERVER_GATEWAY + ":8080/v1/pasivocuentacorriente/externalTransaction";
    }
    public static String webClientUriMSPasivoAhorro = "";
    public static String webClientUriMSPasivoAhorroTrx = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSPasivoAhorro(String SERVER_GATEWAY) {
        Constantes.webClientUriMSPasivoAhorro = "http://"+ SERVER_GATEWAY +":8080/v1/pasivocuentacorriente/getByAccountNumber";
    }

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSPasivoAhorroTrx(String SERVER_GATEWAY) {
        Constantes.webClientUriMSPasivoAhorroTrx = "http://"+ SERVER_GATEWAY +":8080/v1/pasivocuentacorriente/externalTransaction";
    }

    //Products Activos
    public static String webClientUriMSActivoTarjetaCredito = "";
    public static String webClientUriMSActivoTarjetaCreditoTrx = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoTarjetaCredito(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoTarjetaCredito = "http://" + SERVER_GATEWAY + ":8080/v1/activotarjetacredito/getByAccountNumber";
    }

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoTarjetaCreditoTrx(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoTarjetaCreditoTrx = "http://" + SERVER_GATEWAY + ":8080/v1/activotarjetacredito/externalTransaction";
    }

    public static String webClientUriMSActivoCreditoPersonal = "";
    public static String webClientUriMSActivoCreditoPersonalTrx = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoCreditoPersonal(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoCreditoPersonal = "http://" + SERVER_GATEWAY + ":8080/v1/activocreditopersonal/getByAccountNumber";
    }

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoCreditoPersonalTrx(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoCreditoPersonalTrx = "http://" + SERVER_GATEWAY + ":8080/v1/activocreditopersonal/externalTransaction";
    }

    public static String webClientUriMSActivoCreditoEmpresarial = "";
    public static String webClientUriMSActivoCreditoEmpresarialTrx = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoCreditoEmpresarial(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoCreditoEmpresarial = "http://" + SERVER_GATEWAY + ":8080/v1/activocreditoempresarial/getByAccountNumber";
    }

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoCreditoEmpresarialTrx(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoCreditoEmpresarialTrx = "http://" + SERVER_GATEWAY + ":8080/v1/activocreditoempresarial/externalTransaction";
    }

    //Para consulta de tarjeta de credito
    public static String webClientUriMSActivoTarjetaCreditoDocumentNumber = "";

    @Value("${SERVER_GATEWAY:localhost}")
    public void setWebClientUriMSActivoTarjetaCreditoDocumentNumber(String SERVER_GATEWAY) {
        Constantes.webClientUriMSActivoTarjetaCreditoDocumentNumber = "http://" + SERVER_GATEWAY + ":8080/v1/activotarjetacredito/getByDocumentNumber";
    }

}
