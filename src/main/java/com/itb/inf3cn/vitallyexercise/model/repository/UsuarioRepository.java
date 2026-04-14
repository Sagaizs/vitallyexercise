package com.itb.inf3cn.vitallyexercise.model.repository;

import com.itb.inf3cn.vitallyexercise.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    }

