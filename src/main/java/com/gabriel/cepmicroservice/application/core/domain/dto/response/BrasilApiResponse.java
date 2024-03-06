package com.gabriel.cepmicroservice.application.core.domain.dto.response;

import com.gabriel.cepmicroservice.application.core.domain.dto.CepDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BrasilApiResponse {

    private String cep;
    private String street;
    private String neighborhood;
    private String city;
    private String state;

    public CepDto to(){
        return CepDto.builder()
                .cep(this.cep)
                .logradouro(this.street)
                .bairro(this.neighborhood)
                .cidade(this.city)
                .estado(this.state)
                .build();
    }
}
