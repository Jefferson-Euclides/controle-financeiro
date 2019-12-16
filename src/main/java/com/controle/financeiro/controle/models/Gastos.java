package com.controle.financeiro.controle.models;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Gastos {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private BigDecimal valor;
	
	@JoinColumn(nullable = false, name = "id_usuario")
	@ManyToOne(cascade = CascadeType.ALL)
	private Usuario usuarioCadastrador;
	
	@JoinColumn(nullable = false, name = "id_tipo_gasto")
	@ManyToOne(cascade = CascadeType.ALL)
	private TipoGasto tipoGasto;
	
}
