package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
@Table(name= "salas")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numero;
    private String predio;
}
