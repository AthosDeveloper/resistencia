package com.reparticaoRecursos.resistencia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@Table(name = "tb_itens")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Iten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  Long id;
    private  String nome;
    private BigDecimal preco;
}
