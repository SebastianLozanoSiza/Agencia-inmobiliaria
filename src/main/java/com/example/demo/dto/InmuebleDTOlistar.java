package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InmuebleDTOlistar {
    
    private Long id;
    private String numeroReferencia;
    private Float superficie; 
    private String direccion;
    private boolean enVenta;
    private boolean enAlquiler;
    private Float precio;
    private String nombrePropietario;
    private boolean llaves;
    private String nombreOficina;
}
