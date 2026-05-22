package com.example.atividade;

import jakarta.persistence.*;

@Entity
@Table(name = "telefones")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String numero;
}