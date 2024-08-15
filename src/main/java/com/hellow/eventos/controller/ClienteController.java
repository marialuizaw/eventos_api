package com.hellow.eventos.controller;

import com.hellow.eventos.cliente.Cliente;
import com.hellow.eventos.cliente.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="Cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping("todos")
    public List<Cliente> getAllCliente(){return this.clienteRepository.findAll();}
    @PostMapping("add")
    public Cliente addCliente(@RequestBody Cliente cliente){
        this.clienteRepository.save(cliente);
        return cliente;
    }
}
