package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.repositories.entitites.Visitas;

public interface RepositoryVisita extends CrudRepository<Visitas,Long> {
    
}
