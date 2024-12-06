package com.example.choma_sub.model;

import com.example.choma_sub.enums.Situacao;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private Situacao situacao;
}