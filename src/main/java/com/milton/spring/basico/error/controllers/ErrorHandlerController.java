package com.milton.spring.basico.error.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlerController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String aritmeticaError(ArithmeticException ex, Model model) {
		model.addAttribute("messageError", "Error de aritmetica");
		model.addAttribute("messageException", ex.getMessage());
		model.addAttribute("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("date", new Date());
		
		return "error/aritmetica";
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatException(NumberFormatException ex, Model model) {
		model.addAttribute("messageError", "Error, formato de número inválido");
		model.addAttribute("messageException", ex.getMessage());
		model.addAttribute("statusCode", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("date", new Date());
		
		return "error/numero-formato";
	}

}
