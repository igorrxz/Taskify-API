package com.taskify.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String locallidade;
    private String uf;
    private Long ddd;
    private String numero;
   


}
