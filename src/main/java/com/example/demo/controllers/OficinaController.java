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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@Tag(name = "API de oficinas", description = "Esta api server tiene toda la funcionalidad de las oficinas")
@RestController
@RequestMapping("/oficinas")
@AllArgsConstructor
public class OficinaController {

    @Autowired
    private ServiceOficina serviceOficina;

    @Operation(description = "Retorna todos los datos de las oficinas", summary ="Return 204 si no hay registros")
    @ApiResponses(value = {@ApiResponse(responseCode = "200",description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @GetMapping("/")
    public ResponseEntity<List<OficinaDTO>> getAllOficinas() {
        List<OficinaDTO> oficinas = serviceOficina.findAll();
        return ResponseEntity.ok(oficinas);
    }

    @Operation(description = "Retorna todos los datos de las oficinas filtrados por el id", summary ="Return 204 si no hay registros")
    @ApiResponses(value = {@ApiResponse(responseCode = "200",description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @GetMapping("/{id}")
    public ResponseEntity<Oficina> getOficinaById(@PathVariable Long id) {
        Oficina oficina = serviceOficina.findById(id);
        return ResponseEntity.ok(oficina);
    }

    @Operation(description = "Añade una nueva oficina", summary ="Return 204 si no hay registros")
    @ApiResponses(value = {@ApiResponse(responseCode = "200",description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @PostMapping("/")
    public ResponseEntity<OficinaDTO> createOficina(@RequestBody OficinaDTO oficinaDTO) {
        OficinaDTO createdOficina = serviceOficina.save(oficinaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOficina);
    }

    @Operation(description = "Actualiza los datos de una oficina por su id", summary ="Return 204 si no hay registros")
    @ApiResponses(value = {@ApiResponse(responseCode = "200",description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @PutMapping("/{id}")
    public ResponseEntity<Oficina> updateOficina(@PathVariable Long id, @RequestBody Oficina oficina) {
        Oficina updatedOficina = serviceOficina.update(id, oficina);
        if (updatedOficina != null) {
            return ResponseEntity.ok(updatedOficina);
        }
        return ResponseEntity.notFound().build();
    }

    @Operation(description = "Elimina una oficina por su id", summary ="Return 204 si no hay registros")
    @ApiResponses(value = {@ApiResponse(responseCode = "200",description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOficina(@PathVariable Long id) {
        serviceOficina.delete(id);
        return ResponseEntity.noContent().build();
    }
    
}
