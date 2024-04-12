package com.example.demo.services;


import java.util.List;

import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.entitites.Oficina;

public interface ServiceOficina {
    
    List<OficinaDTO> findAll();

    Oficina findById(Long id);

    OficinaDTO save(OficinaDTO oficinaDTO);

    Oficina update(Long id, Oficina oficina);

    void delete(Long id);
}
