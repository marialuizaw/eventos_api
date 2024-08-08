package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("todos")
    public List<Endereco> getAllTipos() { return this.enderecoRepository.findAll(); }

    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco){
        this.enderecoRepository.save(endereco);
        return endereco;


    }
}
