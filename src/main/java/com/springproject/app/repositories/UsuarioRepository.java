package com.springproject.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.app.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
