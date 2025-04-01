package com.apirest.libreriaapi.repositorios;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apirest.libreriaapi.entidades.Libro;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, Long>{

}