package com.example.demo.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.InmuebleDTO;
import com.example.demo.repositories.entitites.Inmueble;

@Component
public class InmuebleDTOConverter {
    

    @Autowired
    private ModelMapper dbm;

    @Autowired
    public InmuebleDTOConverter(ModelMapper modelMapper) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        this.dbm = modelMapper;
    }

    public InmuebleDTO convertToDTO(Inmueble inmueble) {
        InmuebleDTO inmuebleDTO = dbm.map(inmueble, InmuebleDTO.class);
        if (inmueble.getTipoInmueble() != null) {
            inmuebleDTO.setSuperficie(inmueble.getTipoInmueble().getSuperficie());
            inmuebleDTO.setDireccion(inmueble.getTipoInmueble().getDireccion());
        }
        if (inmueble.getEstado_inmueble() != null) {
            inmuebleDTO.setEnVenta(inmueble.getEstado_inmueble().isVenta());
            inmuebleDTO.setEnAlquiler(inmueble.getEstado_inmueble().isAlquiler());
        }
        if (inmueble.getNombrePropietario() != null) {
            inmuebleDTO.setNombrePropietario(inmueble.getNombrePropietario().getNombre());
        }
        if (inmueble.getNombreOficina() != null) {
            inmuebleDTO.setNombreOficina(inmueble.getNombreOficina().getNombre());
        }
        return inmuebleDTO;
    }

    public Inmueble convertToEntity(InmuebleDTO inmuebleDTO) {
        return dbm.map(inmuebleDTO, Inmueble.class);
    }
}
