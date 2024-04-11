package com.example.demo.repositories.entitites;

import java.io.Serializable;

import com.example.demo.resources.CaracteristicaEstancia;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estancias")
public class Estancias implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private int habitaciones;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false, name = "baños")
    private int banos;


    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private int aseos;


    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private int cocinas;

    @Enumerated(EnumType.ORDINAL)
    private CaracteristicaEstancia caracteristicas;

    
}
