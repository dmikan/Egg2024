package com.apirest.libreriaapi.repositorios;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apirest.libreriaapi.entidades.Autor;


@Repository
public interface AutorRepositorio extends JpaRepository<Autor, UUID>{

}