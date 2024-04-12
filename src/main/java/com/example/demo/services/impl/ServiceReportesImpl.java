package com.example.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.config.InmuebleDTOConverter;
import com.example.demo.config.OficinaDTOConverter;
import com.example.demo.dto.InmuebleDTOlistar;
import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.RepositoryInmueble;
import com.example.demo.repositories.RepositoryOficina;
import com.example.demo.repositories.entitites.Inmueble;
import com.example.demo.repositories.entitites.Oficina;
import com.example.demo.services.ServiceReportes;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceReportesImpl implements ServiceReportes{
    
@Autowired
    private RepositoryInmueble repositoryInmueble;

    @Autowired
    private InmuebleDTOConverter convert;

    @Autowired
    private RepositoryOficina repositoryOficina;

    @Autowired
    private OficinaDTOConverter convertO;

    @Override
    @Transactional(readOnly = true)
    public List<InmuebleDTOlistar> findAllI() {
        List<Inmueble> inmuebles = (List<Inmueble>) repositoryInmueble.findAll();
        return inmuebles.stream()
                .map(inmueble -> convert.convertToDTO(inmueble))
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<InmuebleDTOlistar> findByNumeroReferencia(String numero) {
        List<Inmueble> inmuebles = repositoryInmueble.findByNumeroReferencia(numero);
        return inmuebles.stream()
                .map(inmueble -> convert.convertToDTO(inmueble))
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public List<OficinaDTO> findAllO() {
        List<Oficina> oficinas = (List<Oficina>) repositoryOficina.findAll();
        return oficinas.stream()
                .map(oficina -> convertO.convertToDTO(oficina))
                .toList();
    }

    @Override
    public Oficina findById(Long id) {
        return repositoryOficina.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "Error! Oficina no existente"));
    }
    
}
