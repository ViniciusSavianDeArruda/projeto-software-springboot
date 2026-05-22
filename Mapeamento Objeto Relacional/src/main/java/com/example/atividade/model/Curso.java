package com.example.atividade.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int cargaHoraria;
    @ManyToMany
    @JoinTable(
            name = "curso_professor",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id")
    )
    private List<Professor> professores;
}