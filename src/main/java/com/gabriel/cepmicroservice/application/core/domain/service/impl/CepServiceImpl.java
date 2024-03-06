package com.gabriel.cepmicroservice.application.core.domain.service.impl;

import com.gabriel.cepmicroservice.adapters.outbound.ExternalClientBrasilApi;
import com.gabriel.cepmicroservice.adapters.outbound.ExternalClientViaCepApi;
import com.gabriel.cepmicroservice.application.core.domain.dto.CepDto;
import com.gabriel.cepmicroservice.application.core.domain.service.CepService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class CepServiceImpl implements CepService {

    private final ExternalClientViaCepApi viaCepClient;

    private final ExternalClientBrasilApi brasilApiClient;

    @Override
    @CircuitBreaker(name = "address", fallbackMethod = "fallBackFindAddress")
    public CepDto findAddress(String cep) {
        return viaCepClient.findAddress(cep).to();
    }

    public CepDto fallBackFindAddress(String cep, Exception e) {
        return brasilApiClient.findAddress(cep).to();
    }
}