package com.controle.financeiro.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.financeiro.controle.models.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
