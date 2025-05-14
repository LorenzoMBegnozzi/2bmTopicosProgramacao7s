package com.example.Gerenciador_de_Tarefa.service;

import com.example.Gerenciador_de_Tarefa.entities.Tarefa;
import com.example.Gerenciador_de_Tarefa.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> listarTodas(){
        return tarefaRepository.findAll();
    }

    public Tarefa savar(Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    public Optional<Tarefa> buscarPorId(Integer id){
        return tarefaRepository.findById(id);
    }

    public void delete(Integer id){
        tarefaRepository.deleteById(id);
    }
}
