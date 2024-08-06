package com.alejandrocarrillo.webapp.biblioteca.service;

import java.util.List;

import com.alejandrocarrillo.webapp.biblioteca.model.Categoria;

public interface ICategoriaService {
    public List<Categoria> listarCategorias();

    public Categoria guardarCategoria(Categoria categoria);

    public Categoria buscarCategoriaPorId(Long id);

    public void eliminarCategoria(Categoria categoria);
}
