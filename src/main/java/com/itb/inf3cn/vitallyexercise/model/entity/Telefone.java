package com.itb.inf3cn.vitallyexercise.model.entity;

    import jakarta.persistence.*;
    import lombok.*;

    @Entity
    @Table(name = "Telefone") @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)

    public class Telefone {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @EqualsAndHashCode.Include
        private Long id;

        @Column(name = "ddd", nullable = false, length = 3)
        private String ddd;

        @Column(name = "numero", nullable = false, length = 15)
        private String numero;

        @ManyToOne
        @JoinColumn(name = "usuario_id", nullable = false)
        private Usuario usuario;

    }
