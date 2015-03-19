package com.springproject.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springproject.app.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	
	@Query("select u from Usuario u where u.nome like %?1")
	List<Usuario> findByFirstnameEndsWith(String letra);
	
	
}
