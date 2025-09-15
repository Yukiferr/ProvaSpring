package com.yk.yuki.repositories;

import com.yk.yuki.models.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante,Long> {
}
