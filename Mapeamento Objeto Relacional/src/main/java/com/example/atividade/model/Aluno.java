package com.example.atividade.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    @Embedded
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
}
