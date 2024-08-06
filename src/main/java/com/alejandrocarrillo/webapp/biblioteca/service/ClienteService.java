package com.alejandrocarrillo.webapp.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandrocarrillo.webapp.biblioteca.model.Cliente;
import com.alejandrocarrillo.webapp.biblioteca.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
    }
    
}
