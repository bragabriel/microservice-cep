package com.gabriel.cepmicroservice.adapters.outbound;

import com.gabriel.cepmicroservice.application.core.domain.dto.response.BrasilApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ExternalClientViaCepApi {
    @GetMapping("/ws/{cep}/json/")
    BrasilApiResponse findAddress(@PathVariable("cep") String cep);
}
