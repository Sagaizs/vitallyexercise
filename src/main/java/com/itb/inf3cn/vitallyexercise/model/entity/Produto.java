package com.itb.inf3cn.vitallyexercise.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "produto")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 255, nullable = true)
    private String descricao;

    @Column(length = 45, nullable = true)
    private String tipo;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)
    private BigDecimal valorCompra;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = true)
    private BigDecimal valorVenda;

    @Column(nullable = true)
    private Integer quantidadeEstoque;

    @Column(name = "cod_status", nullable = false)
    private boolean codStatus;

    @ManyToOne
    @JoinColumn(name = "item_pedido", nullable = false)
    private ItemPedido itemPedido;

}