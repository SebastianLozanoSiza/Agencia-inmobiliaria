package com.example.demo.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.config.VisitaDTOConverter;
import com.example.demo.dto.VisitaDTO;
import com.example.demo.repositories.RepositoryVisita;
import com.example.demo.repositories.entitites.Visitas;
import com.example.demo.services.ServiceVisita;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceVisitaImpl implements ServiceVisita {

    @Autowired
    private RepositoryVisita repositoryVisita;

    @Autowired
    private VisitaDTOConverter visitaDTOConverter;

    @Override
    public VisitaDTO registrarVisita(VisitaDTO visitaDTO) {
        Visitas visita = visitaDTOConverter.convertToEntity(visitaDTO);
        visita = repositoryVisita.save(visita);
        return visitaDTOConverter.convertToDTO(visita);
    }
}