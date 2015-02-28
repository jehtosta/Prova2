package com.springproject.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springproject.app.entities.Usuario;



@Controller
@RequestMapping("/usuario")
public class cadastro {

	@RequestMapping("/usuario")
	public String formulario() {
 
		return "cadastroUsuario";
 
	}
	
	
	@RequestMapping("adicionaUsuario")
	public String adiciona(Usuario usuario, Model model) {
		
		model.addAttribute("usuario", usuario);
		return "cadastroUsuario";
 
	}
	
	
}
