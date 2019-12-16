package com.controle.financeiro.controle.enums;

public enum Status {
	PAGO("pago"),
	DEVENDO("devendo");
	
	private String status;
	
	Status(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
