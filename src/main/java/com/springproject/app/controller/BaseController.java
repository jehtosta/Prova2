package com.springproject.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springproject.app.entities.Post;

@Controller
@RequestMapping("/")
public class BaseController {
 
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String welcome(ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project  + Spring 3 MVC - welcome()");
  
		
		Post post = new Post();
		post.setTitle("Novo Post");
		
	    
		model.addAttribute("post", post);
		 
		  
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";
 
	}
 
	@RequestMapping(value="/welcome/{name}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", "Maven Web Project + Spring   3 MVC - " + name);
		
		
		Post post = new Post();
		post.setTitle("Incluindo novo post");
	    
		model.addAttribute("post", post);
		 
		
		return "index";
 
	}
 
}
