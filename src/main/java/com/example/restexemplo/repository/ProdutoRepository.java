package com.example.restexemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restexemplo.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {}
