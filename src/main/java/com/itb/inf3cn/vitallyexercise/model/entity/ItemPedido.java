package com.itb.inf3cn.vitallyexercise.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item_pedido")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "quantidade_item", nullable = false)
    private Integer quantidadeItem;

    @Column(name = "valor_unitario", nullable = false, precision = 5, scale = 2)
    private BigDecimal valorUnitario;

    @Column(name = "cod_status", nullable = false)
    private Boolean codStatus;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;


}