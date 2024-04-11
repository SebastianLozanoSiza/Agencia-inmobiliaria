package com.example.demo.repositories.entitites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipo_inmueble")
public class TipoInmueble implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private Float superficie;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private String direccion;

    @JoinColumn(name = "id_casa")
    @OneToOne(fetch = FetchType.LAZY)
    private Casas casas;

    @JoinColumn(name = "id_villa")
    @OneToOne(fetch = FetchType.LAZY)
    private Villa villa;

    @JoinColumn(name = "id_local")
    @OneToOne(fetch = FetchType.LAZY)
    private Locales locales;

    @JoinColumn(name = "id_pisos")
    @OneToOne(fetch = FetchType.LAZY)
    private Pisos pisos;

    
    
}
