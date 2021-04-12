package com.runt.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.runt.prueba.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
