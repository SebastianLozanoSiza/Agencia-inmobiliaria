package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.config.OficinaDTOConverter;
import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.RepositoryOficina;
import com.example.demo.repositories.entitites.Oficina;
import com.example.demo.services.ServiceOficina;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceOficinaImpl implements ServiceOficina{

    @Autowired
    private RepositoryOficina repositoryOficina;

    @Autowired
    private OficinaDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<OficinaDTO> findAll() {
        List<Oficina> oficinas = (List<Oficina>) repositoryOficina.findAll();
        return oficinas.stream()
                .map(oficina -> convert.convertToDTO(oficina))
                .toList();
    }

    @Override
    public Oficina findById(Long id) {
        return repositoryOficina.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "Error! Oficina no existente"));
    }
    

    @Override
    public OficinaDTO save(OficinaDTO oficinaDTO) {
        Oficina oficina = convert.convertToEntity(oficinaDTO);
        oficina = repositoryOficina.save(oficina);
        return convert.convertToDTO(oficina);
    }

    @Override
    public Oficina update(Long id, Oficina oficina) {
        Optional<Oficina> oficinaCurrentOptional = repositoryOficina.findById(id);

        if (oficinaCurrentOptional.isPresent()) {
            Oficina oficinaCurrent = oficinaCurrentOptional.get();
            oficinaCurrent.setNombre(oficina.getNombre());
            oficinaCurrent.setDireccion(oficina.getDireccion());
            return oficinaCurrent;
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<Oficina> oficinaOptional = repositoryOficina.findById(id);
        if (oficinaOptional.isPresent()) {
            repositoryOficina.delete(oficinaOptional.get());
        }
    }
    
}
