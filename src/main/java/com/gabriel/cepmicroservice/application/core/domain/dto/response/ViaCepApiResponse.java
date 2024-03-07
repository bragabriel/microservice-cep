package com.gabriel.cepmicroservice.application.core.domain.dto.response;

import com.gabriel.cepmicroservice.application.core.domain.dto.AddressDTO;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ViaCepApiResponse {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public AddressDTO to(){
        return AddressDTO.builder()
                .cep(this.cep)
                .logradouro(this.logradouro)
                .bairro(this.bairro)
                .cidade(this.localidade)
                .estado(this.uf)
                .build();
    }
}