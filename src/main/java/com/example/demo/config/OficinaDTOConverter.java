package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.entitites.Oficina;

@Component
public class OficinaDTOConverter {
    
    @Autowired
    private ModelMapper dbm;

    @Autowired
    public OficinaDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public OficinaDTO convertToDTO(Oficina oficina) {
        return dbm.map(oficina, OficinaDTO.class);
    }

    public Oficina convertToEntity(OficinaDTO oficinaDTO) {
        return dbm.map(oficinaDTO, Oficina.class);
    }
}
