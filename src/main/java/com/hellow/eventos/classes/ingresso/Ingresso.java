package com.hellow.eventos.classes.ingresso;

import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="ingresso")
@Table(name="ingresso")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Float valor_base;
    private Boolean meia;
    private Boolean social;
    private Float valor_pago;
    private  Boolean pago;
    private Boolean  vip;
    @ManyToOne
    @JoinColumn(name="id_evento")
    private Evento evento_id;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo_id;









}
