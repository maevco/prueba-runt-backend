package com.runt.prueba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.runt.prueba.entity.Asignatura;
import com.runt.prueba.entity.AsignaturaEnvio;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
	
	
	@Query(value = "SELECT DISTINCT new com.runt.prueba.entity.AsignaturaEnvio(e.id,m.nombre, p.nombre, c.grado, c.salon, e.nombre) FROM Estudiante e JOIN e.asignaturas a JOIN a.profesor p JOIN a.materia m JOIN a.curso c WHERE p.id = ?1 ")
	public List<AsignaturaEnvio> buscarProfesorId(@Param("profesorId")Long profesorId);
	
	@Query(value = "SELECT DISTINCT new com.runt.prueba.entity.AsignaturaEnvio(a.id,m.nombre, p.nombre, c.grado, c.salon, e.nombre) FROM Estudiante e JOIN e.asignaturas a JOIN a.profesor p JOIN a.materia m JOIN a.curso c ")
	public List<AsignaturaEnvio> buscarProfesorAll();

}
