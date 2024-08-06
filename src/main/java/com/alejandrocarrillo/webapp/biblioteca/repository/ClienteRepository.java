package com.alejandrocarrillo.webapp.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alejandrocarrillo.webapp.biblioteca.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{

}
