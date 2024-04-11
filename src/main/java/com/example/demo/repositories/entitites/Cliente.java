package com.example.demo.repositories.entitites;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "cliente")
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "La cedula no puede estar vacia")
    @Column(nullable = false, unique = true)
    private String cedula;

    @NotEmpty(message = "El nombre no puede estar vacio")
    @Column(nullable = false)
    private String nombre;

    @NotEmpty(message = "El apellido no puede estar vacio")
    @Column(nullable = false)
    private String apellido;

    @NotEmpty(message = "El email no puede estar vacio")
    @Column(nullable = false, unique = true)
    private String email;

    @NotEmpty(message = "El telefono no puede estar vacio")
    @Column(nullable = false)
    private String telefono;
}
