package com.controle.financeiro.controle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Usuario {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nome;
	
	@Column(unique = true,
			nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String senha;
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
}
