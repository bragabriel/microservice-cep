package com.gabriel.cepmicroservice.adapters.outbound;

import com.gabriel.cepmicroservice.application.core.domain.dto.response.BrasilApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "brasilapi", url = "https://brasilapi.com.br")
public interface ExternalServiceBrasilApi {
    @GetMapping("/api/cep/v1/{cep}")
    BrasilApiResponse findAddress(@PathVariable("cep") String cep);
}
