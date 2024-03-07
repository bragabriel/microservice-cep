package com.gabriel.cepmicroservice.application.ports.out;

import com.gabriel.cepmicroservice.application.core.domain.dto.AddressDTO;

public interface AddressPort {

    AddressDTO findAddress(String cep);
}
