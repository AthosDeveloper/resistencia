package com.reparticaoRecursos.resistencia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_rebeldes")
@Entity
public class RebeldeModel {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome;
    private  Integer idade;
    private  String genero;
    private  String localizacao;
}
