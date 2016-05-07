package com.springproject.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springproject.app.entities.Post;
import com.springproject.app.entities.Usuario;
import com.springproject.app.repositories.UsuarioRepository;



@Controller
@RequestMapping("/")
public class BaseController  {
	
	@Autowired
	UsuarioRepository repository;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project  + Spring 3 MVC - welcome()");
		
		Post post = new Post();
		post.setTitle("Novo Post");
		
		model.addAttribute("post", post);
		model.addAttribute("thirdBlock", "Bloco 3");
		
		//Spring uses InternalResourceViewResolver and return back index.jsp

		return "index";
	}
 
	@RequestMapping(value="/welcome/{name}/{lastname}", method = RequestMethod.GET)
	public String welcomeName(
			@PathVariable String name,
			@PathVariable String lastname,
			ModelMap model
			) {
 
		String fullname = name + ' ' + lastname;
		model.addAttribute("message", "Maven Web Project + Spring   3 MVC - " + fullname);
		model.addAttribute("thirdBlock", "Bloco 3");
		
		Post post = new Post();
		post.setTitle("Incluindo novo post");
		model.addAttribute("post", post);
		
		return "index";
 
	}
	
	
	
	 
	
	@RequestMapping(value="/clientes/{id}", method = RequestMethod.GET)
	public @ResponseBody Post getCliente(@PathVariable("id") int usercodigo) {
		
		Usuario findUser = repository.findOne(usercodigo);
		
		Post post = new Post(); 
		post.setPostId(usercodigo);
		post.setTitle("Incluindo novo post" + findUser.getNome() + usercodigo);

		return post;
	}
	
	@RequestMapping(value="/clientes/listagem", method = RequestMethod.GET)
	public @ResponseBody List <Usuario> listaClientes() {
	
		List<Usuario> lista = repository.findAll();

		return lista;
	}
	
	@RequestMapping(value="/clientes/lastwith", method = RequestMethod.GET)
	public @ResponseBody List <Usuario> listaClientesNane() {
	
		List<Usuario> lista = repository.findByFirstnameEndsWith("o");

		return lista;
	}
}