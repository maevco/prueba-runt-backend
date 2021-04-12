package com.runt.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.runt.prueba.entity.Colegio;

@Repository
public interface ColegioRepository extends JpaRepository<Colegio, Long> {

}
