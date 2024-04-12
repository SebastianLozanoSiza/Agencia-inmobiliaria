package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.entitites.Oficina;
import com.example.demo.services.ServiceOficina;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/oficinas")
@AllArgsConstructor
public class OficinaController {

    @Autowired
    private ServiceOficina serviceOficina;

    @GetMapping("/")
    public ResponseEntity<List<OficinaDTO>> getAllOficinas() {
        List<OficinaDTO> oficinas = serviceOficina.findAll();
        return ResponseEntity.ok(oficinas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Oficina> getOficinaById(@PathVariable Long id) {
        Oficina oficina = serviceOficina.findById(id);
        return ResponseEntity.ok(oficina);
    }

    @PostMapping("/")
    public ResponseEntity<OficinaDTO> createOficina(@RequestBody OficinaDTO oficinaDTO) {
        OficinaDTO createdOficina = serviceOficina.save(oficinaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOficina);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Oficina> updateOficina(@PathVariable Long id, @RequestBody Oficina oficina) {
        Oficina updatedOficina = serviceOficina.update(id, oficina);
        if (updatedOficina != null) {
            return ResponseEntity.ok(updatedOficina);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOficina(@PathVariable Long id) {
        serviceOficina.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
