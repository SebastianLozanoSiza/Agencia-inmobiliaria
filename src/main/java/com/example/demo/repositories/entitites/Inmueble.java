package com.example.demo.repositories.entitites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "inmuebles")
public class Inmueble implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false, name = "numero_referencia")
    private String numeroReferencia;

    @JoinColumn(name = "id_tipo_inmueble")
    @OneToOne(fetch = FetchType.LAZY)
    private TipoInmueble tipoInmueble;

    @JoinColumn(name = "id_estado")
    @OneToOne(fetch = FetchType.LAZY)
    private Estado_inmueble estado_inmueble;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private Float precio;

    @JoinColumn(name = "id_propietario")
    @OneToOne(fetch = FetchType.LAZY)
    private Propietario nombrePropietario;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private boolean llaves;

    @JoinColumn(name = "id_oficina")
    @ManyToOne(fetch = FetchType.LAZY)
    private Oficina nombreOficina;

    @JoinColumn(name = "id_visitas")
    @ManyToOne(fetch = FetchType.LAZY)
    private Visitas visitas;

    
}
