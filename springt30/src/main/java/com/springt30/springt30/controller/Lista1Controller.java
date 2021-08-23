package com.springt30.springt30.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Lista1Controller {
	@GetMapping("/exercicio1")
	public String exercicio1() {
		return "Habilidade: Atenção aos detalhes  | Mentalidade: Persistência";
	}
	
	@GetMapping("/exercicio2")
	public String exercicio2() {
		return "Aprender a desenvolver aplicações em Spring";
	}

}
