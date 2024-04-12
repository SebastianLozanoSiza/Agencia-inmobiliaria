package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.VisitaDTO;
import com.example.demo.services.ServiceVisita;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@Tag(name = "API de visitas", description = "Esta api server tiene toda la funcionalidad de las visitas")
@RestController
@RequestMapping("/visitas")
@AllArgsConstructor
public class VisitaController {
    
    @Autowired
    private ServiceVisita serviceVisita;

    @Operation(description = "Registra una visita", summary ="Return 204 si no hay registros")
    @ApiResponses(value = {@ApiResponse(responseCode = "200",description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error")})
    @PostMapping("/")
    public ResponseEntity<VisitaDTO> registrarVisita(@RequestBody VisitaDTO visitaDTO) {
        VisitaDTO visitaRegistrada = serviceVisita.registrarVisita(visitaDTO);
        return new ResponseEntity<>(visitaRegistrada, HttpStatus.CREATED);
    }
}
