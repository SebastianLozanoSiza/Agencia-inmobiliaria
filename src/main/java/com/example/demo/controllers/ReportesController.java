package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.InmuebleDTOlistar;
import com.example.demo.dto.OficinaDTO;
import com.example.demo.repositories.entitites.Oficina;
import com.example.demo.services.ServiceInmueble;
import com.example.demo.services.ServiceOficina;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@Tag(name = "API de reportes", description = "Esta api server tiene todos los reportes de inmuebles y de oficinas")
@RestController
@RequestMapping("/reportes")
@AllArgsConstructor
public class ReportesController {

    private ServiceInmueble serviceInmueble;
    
    @Autowired
    private ServiceOficina serviceOficina;


    @Operation(description = "Retorna todos los datos de los inmuebles", summary = "Return 204 si no hay registros")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error") })
    @GetMapping("/listar")
    public ResponseEntity<List<InmuebleDTOlistar>> findAll() {
        List<InmuebleDTOlistar> findAll = serviceInmueble.findAll();
        if (findAll == null || findAll.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(findAll);
        }
    }

    @Operation(description = "Retorna todos los datos de los inmuebles filtrados por el numero de referencia", summary = "Return 204 si no hay registros")
    @ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Exito"),
    @ApiResponse(responseCode = "500", description = "Internal error") })
    @GetMapping("/numeroReferencia/{numero}")
    public ResponseEntity<List<InmuebleDTOlistar>> findByNumeroReferencia(@PathVariable String numero) {
        List<InmuebleDTOlistar> inmuebles = serviceInmueble.findByNumeroReferencia(numero);
        if (inmuebles.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(inmuebles);
        }
    }

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

}
