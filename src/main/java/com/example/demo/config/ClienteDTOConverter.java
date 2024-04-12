package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.repositories.entitites.Cliente;

@Component
public class ClienteDTOConverter {
    
    @Autowired
    private ModelMapper dbm;

    @Autowired
    public ClienteDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public ClienteDTO convertToDTO(Cliente cliente) {
        return dbm.map(cliente, ClienteDTO.class);
    }

    public Cliente convertToEntity(ClienteDTO clienteDTO) {
        return dbm.map(clienteDTO, Cliente.class);
    }
}
