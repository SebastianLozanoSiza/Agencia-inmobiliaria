package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.config.InmuebleDTOConverter;
import com.example.demo.dto.InmuebleDTO;
import com.example.demo.repositories.RepositoryInmueble;
import com.example.demo.repositories.entitites.Inmueble;
import com.example.demo.services.ServiceInmueble;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceInmuebleImpl implements ServiceInmueble{
    
    @Autowired
    private RepositoryInmueble repositoryInmueble;

    @Autowired
    private InmuebleDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<InmuebleDTO> findAll() {
        List<Inmueble> inmuebles = (List<Inmueble>) repositoryInmueble.findAll();
        return inmuebles.stream()
                .map(inmueble -> convert.convertToDTO(inmueble))
                .toList();
    }

    @Override
    public List<InmuebleDTO> findByNumeroReferencia(String numero) {
        List<Inmueble> inmuebles = repositoryInmueble.findByNumeroReferencia(numero);
        return inmuebles.stream()
                .map(inmueble -> convert.convertToDTO(inmueble))
                .toList();
    }
    
}
