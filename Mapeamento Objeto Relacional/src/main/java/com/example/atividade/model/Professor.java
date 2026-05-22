package com.example.atividade.model;

import com.example.atividade.Telefone;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "professores")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String email;
    private String area;
    private Tipulacao tipulacao;
    @OneToOne
    @JoinColumn(name = "sala_id")
    private Sala sala;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_id")
    private List<Telefone> telefones;
}