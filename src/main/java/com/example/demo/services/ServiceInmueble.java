package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.InmuebleDTO;

public interface ServiceInmueble {

    List<InmuebleDTO> findAll();

    List<InmuebleDTO> findByNumeroReferencia(String numero);
}
