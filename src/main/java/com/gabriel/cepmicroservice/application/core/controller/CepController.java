package com.gabriel.cepmicroservice.application.core.controller;

import com.gabriel.cepmicroservice.application.core.domain.dto.CepDto;
import com.gabriel.cepmicroservice.application.core.domain.service.CepService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/endereco")
public class CepController {

    private final CepService cepService;

    @GetMapping("/{cep}")
    public CepDto getAddress(@PathVariable("cep") String cep){
        return cepService.findAddress(cep);
    }
}
