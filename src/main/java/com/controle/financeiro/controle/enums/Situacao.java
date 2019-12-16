package com.controle.financeiro.controle.enums;

public enum Situacao {

	LOTADA("lotada"),
	VAZIA("vazia"),
	COM_VAGAS("com_vagas");
	
	private String situacao;
	
	Situacao(String situacao) {
		this.situacao = situacao;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
}
