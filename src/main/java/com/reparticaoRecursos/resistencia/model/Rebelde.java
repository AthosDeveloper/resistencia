package com.reparticaoRecursos.resistencia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_rebeldes")
@Entity
public class Rebelde {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String nome;
    private  Integer idade;
    private  String genero;
    private  String localizacao;
    @ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "tb_pedidos", joinColumns = {@JoinColumn(name = "id_rebelde")},
        inverseJoinColumns = {@JoinColumn(name = "id_item")})
    private List<Iten> itens;
}
