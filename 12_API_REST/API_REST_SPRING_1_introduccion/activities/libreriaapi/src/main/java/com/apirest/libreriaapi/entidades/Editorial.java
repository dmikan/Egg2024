package com.apirest.libreriaapi.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Clase que representa una editorial en la biblioteca.
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEditorial; // Identificador unico de la editorial.

    private String nombreEditorial; // Nombre de la editorial.

    private Boolean editorialActiva; // Indica si la editorial está activa o no.
}
