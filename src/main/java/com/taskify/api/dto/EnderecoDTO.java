package com.taskify.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class EnderecoDTO {

    private Long idUsuario;
    private String Cep;
    private String numero;

}