package com.itb.inf3cn.vitallyexercise.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 255, nullable = true)
    private String descricao;

    @Column(nullable = false)
    private boolean codStatus;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;




}
