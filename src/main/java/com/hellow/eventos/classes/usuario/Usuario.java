package com.hellow.eventos.classes.usuario;

import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Entity(name="usuario")
@Table(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


     private String nome;
     private String sobrenome;
     private String login;
     private String senha;
     private Date dt_nascimento;
     private Date dt_criacao;
     private Date dt_filiacao;
     private String email;
     private int telefone;
     private int cpf;
     @ManyToOne
    @JoinColumn(name="id_tipo")
    private Tipo tipo_id;








}
