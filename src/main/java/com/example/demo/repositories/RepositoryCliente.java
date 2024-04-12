package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.repositories.entitites.Cliente;

public interface RepositoryCliente extends CrudRepository<Cliente,Long>{
    
}
