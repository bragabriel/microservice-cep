package com.gabriel.cepmicroservice.application.core.domain.service;

import com.gabriel.cepmicroservice.adapters.outbound.ExternalServiceBrasilApi;
import com.gabriel.cepmicroservice.adapters.outbound.ExternalServiceViaCepApi;
import com.gabriel.cepmicroservice.application.core.domain.dto.AddressDTO;
import com.gabriel.cepmicroservice.application.ports.out.AddressPort;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressPort {

    private final ExternalServiceViaCepApi viaCepApi;

    private final ExternalServiceBrasilApi brasilApi;

    @Override
    @CircuitBreaker(name = "address", fallbackMethod = "fallBackFindAddress")
    public AddressDTO findAddress(String cep) {
        if(cep.equals("0")){
            throw new RuntimeException("Erro: API ViaCEP indisponível!");
        }
        log.info("Close State");
        return viaCepApi.findAddress(cep).to();
    }

    public AddressDTO fallBackFindAddress(String cep, Exception e) {
        log.error("Open State: {}", e.getMessage());
        //return brasilApi.findAddress(cep).to();
        return new AddressDTO("22061-030", "Avenida Henrique Dodsworth", "Rio de Janeiro", "Rio de Janeiro", "Copacabana");
    }
}