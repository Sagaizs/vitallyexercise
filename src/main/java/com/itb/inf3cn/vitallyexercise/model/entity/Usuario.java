package com.itb.inf3cn.vitallyexercise.model.entity;

import com.itb.inf3cn.vitallyexercise.model.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private long id;

    @Column(length = 100)
    private String nome;

    @Column(length = 100)
    private String cpf;

    @Column(length = 100, nullable = false)
    private String email;

    @Column(length = 100)
    private String password;

    @Column(length = 15, nullable = false)
    private String sexo;

    @Column
    private LocalDate dataNascimento;

    @Column(length = 100)
    private String logradouro;

    @Column(length = 100)
    private String cep;

    @Column(length = 100)
    private String bairro;

    @Column(length = 45)
    private String cidade;

    @Column(length = 45)
    private String uf;

    @Column(nullable = false)
    private boolean codStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

}