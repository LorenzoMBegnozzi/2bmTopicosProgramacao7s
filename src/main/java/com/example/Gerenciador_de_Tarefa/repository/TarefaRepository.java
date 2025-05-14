package com.example.Gerenciador_de_Tarefa.repository;

import com.example.Gerenciador_de_Tarefa.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {

}
