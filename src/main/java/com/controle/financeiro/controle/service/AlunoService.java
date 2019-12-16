package com.controle.financeiro.controle.service;

import com.controle.financeiro.controle.models.Aluno;

public interface AlunoService {
	Aluno getAlunoById(Long id);
	
	void deleteAlunoById(Long id);
	
	Aluno alterarAluno(Long id, Aluno aluno);
	
	Aluno criarAluno(Aluno aluno);
}
