package com.hellow.eventos.cliente;


import com.hellow.eventos.classes.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="Cliente")
@Table(name="Cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String sobrenome;
    private int cpf;
    private int telefone;
    private String email;

    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco_id;







}
