package com.runt.prueba.service;

import java.util.List;

import com.runt.prueba.entity.Asignatura;
import com.runt.prueba.entity.AsignaturaEnvio;

public interface AsignaturaServiceDecl {
	
	/**
	 * 
	 * @param profesorId
	 * @return
	 */
	public List<AsignaturaEnvio> getAllProfesorId(long profesorId);
	
	/**
	 * 
	 * @param asignatura
	 * @return
	 */
	public Asignatura add(Asignatura asignatura);
	
	/**
	 * 
	 * @return
	 */
	public List<AsignaturaEnvio> getAllProfesorAll();

}
