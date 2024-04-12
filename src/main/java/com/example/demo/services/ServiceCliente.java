package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.repositories.entitites.Cliente;

public interface ServiceCliente {

    List<ClienteDTO> findAll();

    Cliente findById(Long id);

    ClienteDTO save(ClienteDTO clienteDTO);

    Cliente update(Long id, Cliente cliente);

    void delete(Long id);
}
