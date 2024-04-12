package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.InmuebleDTOlistar;
import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.entitites.Oficina;

public interface ServiceReportes {
    
    List<InmuebleDTOlistar> findAllI();

    List<InmuebleDTOlistar> findByNumeroReferencia(String numero);

    List<OficinaDTO> findAllO();

    Oficina findById(Long id);
}
