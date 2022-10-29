package com.milton.spring.basico.error.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.milton.spring.basico.error.exceptions.UsuarioNoEncontradoException;
import com.milton.spring.basico.error.model.domain.Usuario;
import com.milton.spring.basico.error.service.UsuarioService;

@Controller
public class AppConfig {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping({ "/", "/index" })
	public String index(Model model) {
		return "index";
	}

	@GetMapping({ "/usuario/{id}" })
	public String cliente(@PathVariable Integer id, Model model) {
		Usuario usuario = usuarioService.obtenerPorId(id);

		if (usuario == null) {
			throw new UsuarioNoEncontradoException(id.toString());
		}

		model.addAttribute("titulo", "Detalle usuario ".concat(usuario.getNombre()));
		model.addAttribute("usuario", usuario);

		return "usuario";
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
