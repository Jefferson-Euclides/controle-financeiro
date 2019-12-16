package com.controle.financeiro.controle.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.controle.financeiro.controle.enums.Status;

import lombok.Data;

@Entity
@Data
public class Aluno {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	private Status status;
	
	@Column(nullable = false)
	private BigDecimal valor;
	
	@JoinColumn(nullable = false, name = "id_turma")
	@ManyToOne(cascade = CascadeType.ALL)
	private Turma turma;
	
	private LocalDate dataCadastro;
	
	@JoinColumn(nullable = false, name = "id_usuario")
	@ManyToOne(cascade = CascadeType.ALL)
	private Usuario usuarioCadastrador;
	
}
