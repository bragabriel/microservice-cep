package com.gabriel.cepmicroservice.application.core.controller;

import com.gabriel.cepmicroservice.application.core.domain.dto.AddressDTO;
import com.gabriel.cepmicroservice.application.ports.out.AddressPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/address")
public class AddressController {

    private final AddressPort addressPort;

    @GetMapping("/{cep}")
    public AddressDTO getAddress(@PathVariable("cep") String cep){
        return addressPort.findAddress(cep);
    }
}
