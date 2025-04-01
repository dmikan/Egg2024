package com.apirest.libreriaapi.entidades;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Clase que representa un autor en la biblioteca.
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAutor; // Identificador único del autor.

    private String nombreAutor; // Nombre del autor.

    private Boolean autorActivo; // Indica si el autor esta activo.
}