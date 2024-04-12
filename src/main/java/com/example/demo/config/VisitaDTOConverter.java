package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.VisitaDTO;
import com.example.demo.repositories.entitites.Visitas;

@Component
public class VisitaDTOConverter {
    
    private final ModelMapper dbm;

    @Autowired
    public VisitaDTOConverter(ModelMapper dbm) {
        this.dbm = dbm;
        this.dbm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
    }

    public Visitas convertToEntity(VisitaDTO visitaDTO) {
        return dbm.map(visitaDTO, Visitas.class);
    }

    public VisitaDTO convertToDTO(Visitas visita) {
        return dbm.map(visita, VisitaDTO.class);
    }
}