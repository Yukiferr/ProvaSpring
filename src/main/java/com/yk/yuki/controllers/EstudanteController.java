package com.yk.yuki.controllers;

import com.yk.yuki.models.Estudante;
import com.yk.yuki.repositories.EstudanteRepository;
import com.yk.yuki.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    EstudanteService estudanteService;

    @GetMapping
    public List<Estudante> listarEstudante() {
        return estudanteService.findAll();
    }
    @GetMapping("/{id}")
    public Estudante  buscar(@PathVariable Long id){
        return  estudanteService.findById(id);
    }

    @PostMapping
    public Estudante salvar(@RequestBody Estudante estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @DeleteMapping("/{id}")
    public void deleteEstudante(@PathVariable Long id){
        estudanteService.deletarEstudante(id);
    }
}
