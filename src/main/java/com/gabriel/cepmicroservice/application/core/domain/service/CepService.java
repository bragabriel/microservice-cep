package com.gabriel.cepmicroservice.application.core.domain.service;

import com.gabriel.cepmicroservice.application.core.domain.dto.CepDto;

public interface CepService {

    CepDto findAddress(String cep);
}
