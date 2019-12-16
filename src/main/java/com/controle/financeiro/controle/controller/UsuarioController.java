package com.controle.financeiro.controle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.financeiro.controle.models.Usuario;
import com.controle.financeiro.controle.models.ValidacaoLogin;
import com.controle.financeiro.controle.service.UsuarioService;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> getUsuarios() {
		return usuarioService.getUsuarios();
	}
	
	@GetMapping("/{id}")
	public Usuario getUsuarioById(@PathVariable Long id) {
		return usuarioService.getUsuarioById(id);
	}
	
	@GetMapping("/validarLogin")
	public ValidacaoLogin validarLogin() {
		return new ValidacaoLogin("Usuario validado com sucesso");
	}
	
}
