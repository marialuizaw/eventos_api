package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;
    @GetMapping("todos")
    public List<Evento> getAllTipos(){ return this.eventoRepository.findAll(); }

    @PostMapping("add")
    public Evento addEvento(@RequestBody Evento evento){

      this.eventoRepository.save(evento);
      return evento;

    }



}
