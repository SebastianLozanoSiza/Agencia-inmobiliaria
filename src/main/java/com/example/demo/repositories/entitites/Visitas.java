package com.example.demo.repositories.entitites;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "visitas")
public class Visitas implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_cliente")
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private Date fecha;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private Time hora;

    @NotEmpty(message = "No puede estar vacio")
    @Column(nullable = false)
    private String comentario_cliente;
    
}
