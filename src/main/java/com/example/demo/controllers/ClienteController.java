package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClienteDTO;
import com.example.demo.repositories.entitites.Cliente;
import com.example.demo.services.ServiceCliente;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/clientes")
@AllArgsConstructor
public class ClienteController {
    
    @Autowired
    private ServiceCliente serviceCliente;

    @GetMapping("/")
    public ResponseEntity<List<ClienteDTO>> getAllClientes() {
        List<ClienteDTO> clientes = serviceCliente.findAll();
        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Cliente cliente = serviceCliente.findById(id);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping("/")
    public ResponseEntity<ClienteDTO> save(@RequestBody ClienteDTO clienteDTO) {
        ClienteDTO createdCliente = serviceCliente.save(clienteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente updateCliente = serviceCliente.update(id, cliente);
        if (updateCliente != null) {
            return ResponseEntity.ok(updateCliente);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        serviceCliente.delete(id);
        return ResponseEntity.noContent().build();
    }
}
