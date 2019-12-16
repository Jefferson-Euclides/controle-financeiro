package com.controle.financeiro.controle.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.controle.financeiro.controle.enums.Situacao;

import lombok.Data;

@Entity
@Data
public class Turma {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	private Integer qtdAlunos;
	private Situacao situacao;
	
}
