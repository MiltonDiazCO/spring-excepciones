package com.milton.spring.basico.error.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppConfig {

	@GetMapping({ "/", "/index" })
	public String index(Model model) {
		return "index";
	}

	@GetMapping({ "/aritmetica-error" })
	public String aritmeticaError() {
		int number = 100 / 0;
		System.out.println(number);
		return "index";
	}

	@GetMapping({ "/numero-invalido" })
	public String numeroInvalido() {
		int number = Integer.parseInt("hola");
		System.out.println(number);
		return "index";
	}

}
