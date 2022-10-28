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

}
