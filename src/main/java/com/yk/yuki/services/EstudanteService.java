package com.yk.yuki.services;

import com.yk.yuki.models.Estudante;
import com.yk.yuki.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstudanteService {

   @Autowired
   private EstudanteRepository estudanteRepository;

   public List<Estudante> findAll(){
       return estudanteRepository.findAll();
   }

   public Estudante findById(Long id){
       return estudanteRepository.findById(id).get();
   }

   public Estudante criarEstudante(Estudante estudante){
       return estudanteRepository.save(estudante);
   }

   public void deletarEstudante(Long id){
       Estudante estudante = estudanteRepository.findById(id).get();
       estudanteRepository.delete(estudante);
   }
}
