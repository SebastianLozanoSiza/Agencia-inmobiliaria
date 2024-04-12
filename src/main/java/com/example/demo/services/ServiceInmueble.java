package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.InmuebleDTO;
import com.example.demo.dto.InmuebleDTOlistar;

public interface ServiceInmueble {

    List<InmuebleDTOlistar> findAll();

    List<InmuebleDTOlistar> findByNumeroReferencia(String numeroReferencia);

    InmuebleDTO save(InmuebleDTO inmuebleDTO);
}
