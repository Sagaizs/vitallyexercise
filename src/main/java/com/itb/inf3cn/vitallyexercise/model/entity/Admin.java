package com.itb.inf3cn.vitallyexercise.model.entity;

@Entity
@Table (name = "Usuario")
@Inheritance(strategy = inheritanceType.single_TABLE)
@DiscriminationColumn (name = "tipo de usuario")

public class Admin extends Usuario{

    private String nivelAcesso;
}
