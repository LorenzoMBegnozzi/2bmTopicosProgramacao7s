package com.example.Gerenciador_de_Tarefa.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Tarefa")
@Data // vai gerar getters, setters, toString, equals e hashCode
@AllArgsConstructor //gerar construtores
@NoArgsConstructor //construtores sem argumentos

public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //integer --> aceita null

    private String titulo;
    private String descricao;
    private String status;
}
