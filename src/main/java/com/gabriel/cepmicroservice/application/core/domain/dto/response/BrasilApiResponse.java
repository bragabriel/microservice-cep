package com.gabriel.cepmicroservice.application.core.domain.dto.response;

import com.gabriel.cepmicroservice.application.core.domain.dto.AddressDTO;
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

    public AddressDTO to(){
        return AddressDTO.builder()
                .cep(this.cep)
                .logradouro(this.street)
                .bairro(this.neighborhood)
                .cidade(this.city)
                .estado(this.state)
                .build();
    }
}
