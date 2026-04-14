package com.itb.inf3cn.vitallyexercise.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table (name = "Pedido")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@EqualsAndHashCode (onlyExplicitlyIncluded = true)

public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "item_pedido", nullable = false)
    private ItemPedido itemPedido;

    @Column(length = 10, nullable = false)
    private String numeroPedido;

    @Column(nullable = false)
    private LocalDateTime dataHoraPedido;

    @Column(nullable = true)
    private LocalDateTime dataHoraEntrega;

    @Column(columnDefinition = "DECIMAL(5,2)", nullable = false)
    private BigDecimal valorTotal;

    private boolean codStatus;
}