package com.springproject.app.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.springproject.app.entities.Usuario;
import com.springproject.app.repositories.UsuarioRepository;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@ContextConfiguration(locations={"classpath:testContext.xml"})
@Qualifier
public class AdicionaUsuarioComNomeTest {

	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void test() {
		Usuario usuario = new Usuario();
		usuario.setNome("Marcio");
		
		repository.save(usuario);
		
		
		Usuario dbpost = repository.findOne(usuario.getId());
		Assert.assertNotNull(dbpost);
		dbpost.mostra(); 

	}
	
	
	@Test
	public void alteraUsuario() {
		 
		Usuario findUser = repository.findOne(1);
		
		Assert.assertNotNull(findUser.getNome());
		
		findUser.setNome("Marcio de Souza");
		repository.save(findUser);
		
		 
		
		
		 
		
	}
}
