package com.controle.financeiro.controle.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TipoGasto {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	private LocalDate dataCadastro;
	
}
