package com.springproject.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springproject.app.entities.Usuario;



@Controller
@Scope("session")
@RequestMapping("/usuario")
public class cadastro {

	@RequestMapping("/index")
	public String formulario(Model model, HttpSession session) {
		
		 
		model.addAttribute("keyParam", session.getAttribute("nome"));
		 
		return "cadastroUsuario";
 
	}
	
	
	@RequestMapping(value = "adicionaUsuario", method = RequestMethod.POST)
	public String adiciona(Usuario usuario, Model model, HttpSession session ) {
		model.addAttribute("usuario", usuario);
		session.setAttribute("keyParam", "SDFSDAKK98989SDFDS9898__DSFDSFDFJ9KJSDFK");
		return "cadastroUsuario";
	}
	
	
}
