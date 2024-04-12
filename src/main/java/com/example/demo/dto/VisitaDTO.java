package com.example.demo.dto;

import java.sql.Time;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisitaDTO {
    
    private Long idInmueble;
    private String nombreCliente;
    private Date fecha;
    private Time hora;
}
