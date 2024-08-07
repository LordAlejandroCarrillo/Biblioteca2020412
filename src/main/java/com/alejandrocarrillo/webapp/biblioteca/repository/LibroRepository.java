package com.alejandrocarrillo.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejandrocarrillo.webapp.biblioteca.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long>{

}
