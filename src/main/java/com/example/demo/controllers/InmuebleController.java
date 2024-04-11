package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InmuebleDTO;
import com.example.demo.repositories.RepositoryInmueble;
import com.example.demo.services.ServiceInmueble;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/inmuebles")
@AllArgsConstructor
public class InmuebleController {
    
    private ServiceInmueble serviceInmueble;

    private RepositoryInmueble repositoryInmueble;

    @GetMapping("/")
    public ResponseEntity<List<InmuebleDTO>> findAll() {
        List<InmuebleDTO> findAll = serviceInmueble.findAll();
        if (findAll == null || findAll.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(findAll);
        }
    }

    @GetMapping("/tipo-cuota/{nombreTipoCuota}")
    public ResponseEntity<List<InmuebleDTO>> findByNumeroReferencia(@PathVariable String numero) {
        List<InmuebleDTO> inmuebles = serviceInmueble.findByNumeroReferencia(numero);
        if (inmuebles.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(inmuebles);
        }
    }
}
