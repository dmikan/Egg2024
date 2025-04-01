package com.apirest.libreriaapi.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Clase que representa un libro en la biblioteca.
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Libro {
    @Id
    private Long idLibro; // Identificador único del libro

    private String titulo; // Título del libro

    private Integer ejemplares; // Número de ejemplares disponibles

    private Boolean libroActivo; // Indica si el libro está disponible

    @ManyToOne
    private Autor autor; // Autor del libro

    @ManyToOne
    private Editorial editorial; // Editorial del libro
}