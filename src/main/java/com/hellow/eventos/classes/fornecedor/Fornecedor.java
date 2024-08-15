package com.hellow.eventos.classes.fornecedor;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.evento.Evento;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="fornecedor")
@Table(name="fornecedor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_fornecedor;

    private String nome;
    private int cnpj;
    private Boolean ativo;

    @ManyToOne
    @JoinColumn(name="id_endereco")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo_id;



}
