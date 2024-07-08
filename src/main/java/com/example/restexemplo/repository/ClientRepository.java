package com.example.restexemplo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restexemplo.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>  {
    
}
