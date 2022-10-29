package com.milton.spring.basico.error.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.milton.spring.basico.error.model.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> usuariosList;

	public UsuarioServiceImpl() {
		this.usuariosList = new ArrayList<>();
		this.usuariosList.add(new Usuario(1, "Juan", "Gomez"));
		this.usuariosList.add(new Usuario(2, "Marco", "Sanchez"));
		this.usuariosList.add(new Usuario(3, "Martha", "Ortiz"));
		this.usuariosList.add(new Usuario(4, "Luisa", "Moreno"));
		this.usuariosList.add(new Usuario(5, "Fernando", "Monsalve"));
	}

	@Override
	public List<Usuario> listar() {
		return usuariosList;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {

		Usuario usuario = null;

		for (Usuario usr : this.usuariosList) {
			if (usr.getId().equals(id)) {
				usuario = usr;
				break;
			}
		}

		return usuario;

	}

}
