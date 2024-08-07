package com.alejandrocarrillo.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejandrocarrillo.webapp.biblioteca.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{

}
