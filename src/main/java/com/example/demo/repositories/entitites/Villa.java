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
@Table(name = "villa")
public class Villa implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false, name = "tamaño_parcela")
    private Float tamanoParcela;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false, name = "urbanizacion")
    private String Urbanizacion;

    @JoinColumn(name = "id_estancia")
    @OneToOne(fetch = FetchType.LAZY)
    private Estancias estancias;

    
}
