package com.controle.financeiro.controle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controle.financeiro.controle.models.Aluno;
import com.controle.financeiro.controle.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements AlunoService{

	@Autowired
	AlunoRepository alunoRepository;
	
	@Override
	public Aluno getAlunoById(Long id) {
		
		return alunoRepository.findById(id)
				.orElseThrow(IllegalArgumentException :: new);
	
	}

	@Override
	public void deleteAlunoById(Long id) {

		alunoRepository.deleteById(id);
		
	}

	@Override
	public Aluno alterarAluno(Long id, Aluno aluno) {

		Aluno alunoTemp = alunoRepository.findById(id)
				.orElseThrow(IllegalArgumentException :: new);
	
		alunoTemp.setNome(aluno.getNome());
		alunoTemp.setStatus(aluno.getStatus());
		alunoTemp.setTurma(aluno.getTurma());
		
		return alunoRepository.save(alunoTemp);
	}

	@Override
	public Aluno criarAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
}
