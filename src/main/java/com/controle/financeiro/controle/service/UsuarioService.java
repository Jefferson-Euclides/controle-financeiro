package com.controle.financeiro.controle.service;

import java.util.List;

import com.controle.financeiro.controle.models.Usuario;

public interface UsuarioService {
	
	List<Usuario> getUsuarios();
	
	Usuario getUsuarioById(Long id);
}
