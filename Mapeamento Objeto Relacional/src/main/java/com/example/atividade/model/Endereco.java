package com.example.atividade.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    private String numero;
    private String cep;
    private String complemento;
}
