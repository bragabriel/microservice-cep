package com.gabriel.cepmicroservice.adapters.outbound;

import com.gabriel.cepmicroservice.application.core.domain.dto.response.BrasilApiResponse;
import com.gabriel.cepmicroservice.application.core.domain.dto.response.ViaCepApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ExternalServiceViaCepApi {
    @GetMapping("/ws/{cep}/json/")
    ViaCepApiResponse findAddress(@PathVariable("cep") String cep);
}
