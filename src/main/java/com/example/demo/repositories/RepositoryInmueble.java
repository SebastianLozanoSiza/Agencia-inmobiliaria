package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.repositories.entitites.Inmueble;

public interface RepositoryInmueble extends CrudRepository<Inmueble,Long>{
    
    List<Inmueble> findByNumeroReferencia(String numeroReferencia);


}
