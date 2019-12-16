package com.controle.financeiro.controle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.controle.financeiro.controle.models.Gastos;

@Repository
public interface GastosRepository extends JpaRepository<Gastos, Long>{
	
}
