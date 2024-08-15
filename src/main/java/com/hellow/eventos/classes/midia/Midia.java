package com.hellow.eventos.classes.midia;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="midia")
@Entity(name="midia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Midia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String formato;

    private  int duracao;

    private int tamanho;

    private String link;

    @ManyToOne
    @JoinColumn(name="id_evento")
    private Evento evento_id;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo_id;









}
