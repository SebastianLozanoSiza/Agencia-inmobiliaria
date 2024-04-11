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
@Table(name = "locales")
public class Locales implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false, name = "numero_puertas_entrada")
    private int numeroPuertasE;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private Boolean diafano;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private Boolean acondicionado;

    @JoinColumn(name = "id_zona")
    @OneToOne(fetch = FetchType.LAZY)
    private Zonas nombreZona;
}
