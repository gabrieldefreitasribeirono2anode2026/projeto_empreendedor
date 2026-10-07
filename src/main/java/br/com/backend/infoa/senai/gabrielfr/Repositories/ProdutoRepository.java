package br.com.backend.infoa.senai.gabrielfr.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.infoa.senai.gabrielfr.Models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
