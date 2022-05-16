/* ESSA PARTE DO PROGRAMA SERVE PARA FASER O ACESSO AO BANCO DE DADOS*/
package com.marcosmoura.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcosmoura.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> { // esse parte serve para faser o acesso aos dados no banco de dados

}
