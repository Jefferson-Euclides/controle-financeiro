package com.controle.financeiro.controle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controle.financeiro.controle.models.Aluno;
import com.controle.financeiro.controle.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	@GetMapping
	public Aluno getAlunoById(@PathVariable Long id) {
		return alunoService.getAlunoById(id);
	}
	
	@DeleteMapping
	public void deleteAlunoById(@PathVariable Long id) {
		alunoService.deleteAlunoById(id);;
	}
	
	@PutMapping
	public Aluno alterarAluno(
			@PathVariable Long id,
			@RequestBody Aluno aluno) {
		return alunoService.alterarAluno(id, aluno);
	}
	
	@PostMapping
	public Aluno criarAluno(@RequestBody Aluno aluno) {
		return alunoService.criarAluno(aluno);
	}
}
