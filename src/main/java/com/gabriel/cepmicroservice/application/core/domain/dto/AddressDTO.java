package com.gabriel.cepmicroservice.application.core.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDTO {

    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
}
