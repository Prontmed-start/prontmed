package com.projetostart.springboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String homepage() {
	  return "homepage";
  }
	
	@GetMapping("/sobre")
	public String sobre() {
	  return "sobre";
	}
	
	@GetMapping("/tipoCadastro")
	public String tipoCadastro() {
	  return "tipoCadastro";
  }
}


