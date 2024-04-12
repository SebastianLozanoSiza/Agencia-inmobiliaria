package com.example.demo.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.config.ClienteDTOConverter;
import com.example.demo.dto.ClienteDTO;
import com.example.demo.repositories.RepositoryCliente;
import com.example.demo.repositories.entitites.Cliente;
import com.example.demo.services.ServiceCliente;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ServiceClienteImpl implements ServiceCliente{

    @Autowired
    private RepositoryCliente repositoryCliente;

    @Autowired
    private ClienteDTOConverter convert;

    @Override
    @Transactional(readOnly = true)
    public List<ClienteDTO> findAll() {
        List<Cliente> clientes = (List<Cliente>) repositoryCliente.findAll();
        return clientes.stream()
                .map(cliente -> convert.convertToDTO(cliente))
                .toList();
    }

    @Override
    public Cliente findById(Long id) {
        return repositoryCliente.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.PRECONDITION_FAILED, "Error! Cliente no existente"));
    }
    

    @Override
    public ClienteDTO save(ClienteDTO clienteDTO) {
        Cliente cliente = convert.convertToEntity(clienteDTO);
        cliente = repositoryCliente.save(cliente);
        return convert.convertToDTO(cliente);
    }

    @Override
    public Cliente update(Long id, Cliente cliente) {
        Optional<Cliente> clienteCurrentOptional = repositoryCliente.findById(id);

        if (clienteCurrentOptional.isPresent()) {
            Cliente clienteCurrent = clienteCurrentOptional.get();
            clienteCurrent.setNombre(cliente.getNombre());
            clienteCurrent.setApellido(cliente.getApellido());
            clienteCurrent.setEmail(cliente.getEmail());
            clienteCurrent.setTelefono(cliente.getTelefono());
            return clienteCurrent;
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<Cliente> clienteOptional = repositoryCliente.findById(id);
        if (clienteOptional.isPresent()) {
            repositoryCliente.delete(clienteOptional.get());
        }
    }
    
}
