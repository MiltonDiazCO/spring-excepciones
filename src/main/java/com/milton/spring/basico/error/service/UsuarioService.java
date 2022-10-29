package com.milton.spring.basico.error.service;

import java.util.List;

import com.milton.spring.basico.error.model.domain.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();

	public Usuario obtenerPorId(Integer id);

}
