package com.controle.financeiro.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.financeiro.controle.models.Usuario;
import com.controle.financeiro.controle.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario getUsuarioById(Long id) {
		usuarioRepository.findById(id);
		
		return usuarioRepository.findById(id)
				.orElseThrow(IllegalArgumentException :: new);
	}

}
